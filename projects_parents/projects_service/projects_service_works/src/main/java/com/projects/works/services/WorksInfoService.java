package com.projects.works.services;

import com.projects.works.view.WorksInfoView;

import java.util.List;

/**
 * @author chumengcheng
 * @date 2023/8/27 1:55 PM
 */


public interface WorksInfoService {

    List<WorksInfoView> findById(String wsId, int page, int size);

}
