package com.projects.works.dao;

import com.projects.works.pojo.WorksInfoT;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author chumengcheng
 * @date 2023/8/27 3:22 PM
 */


public interface WorksInfoMapper extends Mapper<WorksInfoT> {

    @Select(value = "select tb.* from works_info_t tb")
    List<WorksInfoT> findAll();

    @Select(value = "select tb.* from works_info_t tb where tb.ws_id = td=#{wsId}")
    List<WorksInfoT> findById(String wsId);
}
