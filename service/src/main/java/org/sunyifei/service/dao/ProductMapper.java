package org.sunyifei.service.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
@Component
public interface ProductMapper {
    boolean Up ();
}
