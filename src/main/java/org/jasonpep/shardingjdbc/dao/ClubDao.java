package org.jasonpep.shardingjdbc.dao;

import org.jasonpep.shardingjdbc.entity.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * description: ClubDao
 * date: 2020/2/29 13:44
 * author: JASONPEP
 * version: 1.0
 */
@Repository
public interface ClubDao extends JpaRepository<Club, Long> {

}
