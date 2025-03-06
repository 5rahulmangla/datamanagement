package com.dm.datamanagement.dataManagement.repository;


import com.dm.datamanagement.dataManagement.Models.Member;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
public interface MemberRepo extends CrudRepository<Member, Integer> {
	
	@Query("from Member")
	List<Member> getAll();
	
	List<Member> findBymidGreaterThan(int id);
	
	List<Member> findByTech(String tech);

	/*@Modifying
	@Transactional
	@Query("update Member set incart=true where mid=:id" )
	void updateIncart(int id);*/

}
