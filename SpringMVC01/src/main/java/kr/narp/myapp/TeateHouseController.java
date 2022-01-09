package kr.narp.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
import kr.bit.model.TeateHouseDao;
import kr.bit.model.TeateHouseVo;

@Controller
public class TeateHouseController {
	
	@Autowired
	private TeateHouseDao dao; // DI
	

	@RequestMapping("/teateHouseList.do")
	public String memberList(Model model) { // HttpServletRequest == Model
		List<TeateHouseVo> list=dao.teateHouseList();
		// 객체바인딩
		model.addAttribute("list", list);		
		return "TeateHouseList"; 
	}	
	

}
