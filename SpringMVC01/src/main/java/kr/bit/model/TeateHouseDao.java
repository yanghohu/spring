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

}
