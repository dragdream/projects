package com.projects.works.model;


import com.common.utils.PageResult;
import com.projects.works.view.WorksInfoView;

public class WorksInfoRsp extends PageResult<WorksInfoView> {

  private String wsId;
  private String wsName;
  private String wsMgr;
  private String createTime;
  private String createUser;


  public String getWsId() {
    return wsId;
  }

  public void setWsId(String wsId) {
    this.wsId = wsId;
  }


  public String getWsName() {
    return wsName;
  }

  public void setWsName(String wsName) {
    this.wsName = wsName;
  }


  public String getWsMgr() {
    return wsMgr;
  }

  public void setWsMgr(String wsMgr) {
    this.wsMgr = wsMgr;
  }


  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public String getCreateUser() {
    return createUser;
  }

  public void setCreateUser(String createUser) {
    this.createUser = createUser;
  }

}
