package org.jasonpep.shardingjdbc.dao;

import org.jasonpep.shardingjdbc.entity.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * description: MemberDao
 * date: 2020/2/29 13:06
 * author: JASONPEP
 * version: 1.0
 */
@Repository
public interface MemberDao extends CrudRepository<Member, Long> {

}
