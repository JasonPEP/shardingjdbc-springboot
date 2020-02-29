package org.jasonpep.shardingjdbc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * description: Club
 * date: 2020/2/29 12:58
 * author: JASONPEP
 * version: 1.0
 */
@Entity
@Table(name = "club")
public class Club extends Base {

    @Column(name = "name")
    private String name;

}
