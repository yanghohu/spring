package kr.narp.myapp;

import java.lang.annotation.Repeatable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.bit.model.MemberVO;
import kr.bit.model.TeateHouseDao;
import kr.bit.model.TeateHouseVo;

@Controller
public class TeateHouseController {
	
	@Autowired
	private TeateHouseDao dao; // DI
	

	@RequestMapping("/teateHouseList.do")
	public String teateHouseList(Model model) { // HttpServletRequest == Model
		List<TeateHouseVo> list=dao.teateHouseList();
		// 객체바인딩
		model.addAttribute("list", list);		
		return "teateHouseList"; 
	}	
	
	@RequestMapping("/teateHouseInsert.do")
	public String teateHouseInsert(TeateHouseVo vo) {
		// 파라메터 수집(VO)
		// 인코딩(한글깨지는 부분?) spring web mvc 한글 깨짐(구글검색)
		int cnt = dao.teateHouseInsert(vo);
		
		return "redirect:/teateHouseList.do";
	}
	

	@RequestMapping("/teateHouseRegister.do")
	public String teateHouseRegister() {
		
		return "teateHouseRegister";
	}
	

	@RequestMapping("/teateHouseContent.do")
	public String teateHouseContent(int num, Model model) {
		
		TeateHouseVo vo=dao.teateHouseContent(num);
		//객체바인딩
		model.addAttribute("vo", vo);
		
		return "teateHouseContent";
	}
	


	@RequestMapping("/teateHouseUpdate.do")
	public String teateHouseUpdate(TeateHouseVo vo) {

		//객체바인딩
		int cnt=dao.teateHouseUpdate(vo);	 
		
		return "redirect:/teateHouseList.do";
	}


}
