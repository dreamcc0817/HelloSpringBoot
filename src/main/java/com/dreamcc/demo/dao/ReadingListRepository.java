package com.dreamcc.demo.dao;

import com.dreamcc.demo.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Title: Demo
 * @Package: com.dreamcc.demo.dao
 * @Description:
 * @Author: dreamcc
 * @Date: 2018/7/18 9:22
 * @Version: V1.0
 */
@Repository
public interface ReadingListRepository extends JpaRepository<BookEntity, Long> {
    List<BookEntity> findByReader(String reader);
}
