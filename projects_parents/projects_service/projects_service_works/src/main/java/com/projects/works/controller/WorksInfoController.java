package com.projects.works.controller;

import com.common.utils.Result;
import com.common.utils.StatusCode;
import com.github.pagehelper.PageInfo;
import com.projects.works.model.WorksInfoReq;
import com.projects.works.services.WorksInfoService;
import com.projects.works.view.WorksInfoView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author chumengcheng
 * @date 2023/8/27 1:54 PM
 */

@RestController
@CrossOrigin
@RequestMapping(value ="worksInfo")
public class WorksInfoController {

    @Autowired
    private WorksInfoService worksInfoService;

    /***
     * Brand分页条件搜索实现
     * @param worksInfo
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@RequestBody(required = false) WorksInfoReq worksInfo, @PathVariable  int page, @PathVariable int size){
        //调用BrandService实现分页条件查询Brand
        String wsId = worksInfo.getWsId() ;
        PageInfo<WorksInfoView> pageInfo = worksInfoService.findById(wsId, page, size);
        return new Result(true,StatusCode.OK,"查询成功",pageInfo);
    }
}
