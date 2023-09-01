package com.projects.works.services.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.projects.works.dao.WorksInfoMapper;
import com.projects.works.services.WorksInfoService;
import com.projects.works.model.WorksInfoRsp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class WorksInfoServiceImpl implements WorksInfoService {

    @Autowired
    private WorksInfoMapper worksInfoMapper;

    @Override
    public List<WorksInfoRsp> findById(String wsId, int page, int size) {

        //分页
        PageHelper.startPage(page,size);
        //搜索条件构建
        Example example = createExample(WorksInfoRsp);
        //执行搜索
        return new PageInfo<WorksInfoRsp>(worksInfoMapper.selectByExample(example));
    }
    /**
     * Brand构建查询对象
     * @param brand
     * @return
     */
    public Example createExample(Brand brand){
        Example example=new Example(Brand.class);
        Example.Criteria criteria = example.createCriteria();
        if(brand!=null){
            // 品牌id
            if(!StringUtils.isEmpty(brand.getId())){
                criteria.andEqualTo("id",brand.getId());
            }
            // 品牌名称
            if(!StringUtils.isEmpty(brand.getName())){
                criteria.andLike("name","%"+brand.getName()+"%");
            }
            // 品牌图片地址
            if(!StringUtils.isEmpty(brand.getImage())){
                criteria.andEqualTo("image",brand.getImage());
            }
            // 品牌的首字母
            if(!StringUtils.isEmpty(brand.getLetter())){
                criteria.andEqualTo("letter",brand.getLetter());
            }
            // 排序
            if(!StringUtils.isEmpty(brand.getSeq())){
                criteria.andEqualTo("seq",brand.getSeq());
            }
        }
        return example;
    }
}