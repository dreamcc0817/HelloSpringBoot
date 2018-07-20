package com.dreamcc.demo.dao;

import com.dreamcc.demo.entity.ReaderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Title: Demo
 * @Package: com.dreamcc.demo.dao
 * @Description:
 * @Author: dreamcc
 * @Date: 2018/7/20 16:38
 * @Version: V1.0
 */
@Repository
public interface ReaderRepository
        extends JpaRepository<ReaderEntity, String> {
}