package org.jasonpep.shardingjdbc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * description: Member
 * date: 2020/2/29 12:58
 * author: JASONPEP
 * version: 1.0
 */
@Entity
@Table(name = "member")
public class Member extends Base {

    @Column(name = "name")
    private String name;

    @Column(name = "club_id")
    private Long clubId;

}
