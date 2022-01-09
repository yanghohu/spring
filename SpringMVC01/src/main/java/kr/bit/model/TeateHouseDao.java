package kr.bit.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TeateHouseDao {
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory; //[O O O O O ]
	
	// 유튜브 맛집 리스트 보기
	public List<TeateHouseVo> teateHouseList() {
		   // [Connection+Statement]=>SqlSession
		   SqlSession session=sqlSessionFactory.openSession();
		   List<TeateHouseVo> list = session.selectList("teateHouseList");
		   session.close();//반납
		   return list;
	}

	// 맛집리스트인서트
	public int teateHouseInsert(TeateHouseVo vo) {
		// TODO Auto-generated method stub
	   SqlSession session=sqlSessionFactory.openSession();
	   int cnt=session.insert("teateHouseInsert", vo);
	   session.commit();
	   session.close();//반납
	   return cnt; 
	}

	// 맛집상세보기
	public TeateHouseVo teateHouseContent(int num) {
		// TODO Auto-generated method stub
		SqlSession session=sqlSessionFactory.openSession();
		TeateHouseVo vo=session.selectOne("teateHouseContent", num);
		return vo;
	}
	
	// 맛집업데이트
	public int teateHouseUpdate(TeateHouseVo vo) {
		// TODO Auto-generated method stub
		SqlSession session=sqlSessionFactory.openSession();
		int cnt=session.update("teateHouseUpdate", vo);
		session.commit();
		session.close();
		return cnt;
	}
 

}
