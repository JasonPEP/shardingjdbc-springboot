package org.jasonpep.shardingjdbc.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.sql.Timestamp;

/**
 * description: Base
 * date: 2020/2/29 13:08
 * author: JASONPEP
 * version: 1.0
 */
@Getter
@Setter
@Entity
public class Base {

    @Id
    @Column(name = "id", length = 20)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "version", length = 11)
    private int version;

    @Column(name = "created_at", nullable = false)
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;


    @PrePersist
    void prePersist() {
        if (this.createdAt == null)
            this.createdAt = new Timestamp(System.currentTimeMillis());
    }

    @PreUpdate
    void preUpdate() {
        if (this.updatedAt == null)
            this.updatedAt = new Timestamp(System.currentTimeMillis());
    }
}
