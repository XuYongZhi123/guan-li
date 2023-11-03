package vip.sujianfeng.enjoyapi.vo

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import vip.sujianfeng.enjoydao.annotations.*
import vip.sujianfeng.enjoyapi.po.*

/**
 * author GenerateModelBuilder
 * createTime 2023-11-03 13:55:03
 * description 读取数据库生成的实体模型代码，仅不存在时生成，可修改
 **/
@ApiModel("学生信息VO")
@TbTableUuid(table = "student")
open class StudentVO: StudentPO() {
}
