package vip.sujianfeng.enjoyapi.vo.course

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import vip.sujianfeng.enjoydao.annotations.*
import vip.sujianfeng.enjoyapi.po.course.*

/**
 * author GenerateModelBuilder
 * createTime 2023-11-03 13:55:03
 * description 读取数据库生成的实体模型代码，仅不存在时生成，可修改
 **/
@ApiModel("课程管理VO")
@TbTableUuid(table = "course_manage")
open class CourseManageVO: CourseManagePO() {
}
