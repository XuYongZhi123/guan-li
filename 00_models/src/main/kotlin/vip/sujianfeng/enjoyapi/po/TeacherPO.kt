package vip.sujianfeng.enjoyapi.po

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import vip.sujianfeng.enjoydao.annotations.*
import vip.sujianfeng.enjoydao.sqlcondition.*
import vip.sujianfeng.enjoydao.enums.*

/**
 * author GenerateModelBuilder
 * description 读取数据库生成的实体模型代码，不要手动修改，重新生成后会覆盖
 **/
@ApiModel("教师信息PO")
@TbTableUuid(table = "teacher")
open class TeacherPO: vip.sujianfeng.enjoyapi.dbconn.MyModelBase() {
    @ApiModelProperty("家庭住址")
    @TbFieldString(tableField = "address", label = "家庭住址", length = 100)
    var address: String? = null
    @ApiModelProperty("出生日期")
    @TbFieldString(tableField = "birthday", label = "出生日期", length = 50)
    var birthday: String? = null
    @ApiModelProperty("课程")
    @TbFieldString(tableField = "course", label = "课程", length = 50)
    var course: String? = null
    @ApiModelProperty("性别")
    @TbFieldString(tableField = "gender", label = "性别", length = 50)
    var gender: String? = null
    @ApiModelProperty("名称")
    @TbFieldString(tableField = "name", label = "名称", length = 50)
    var name: String? = null
    @ApiModelProperty("职称")
    @TbFieldString(tableField = "professional", label = "职称", length = 50)
    var professional: String? = null
    @ApiModelProperty("电话")
    @TbFieldString(tableField = "telephone", label = "电话", length = 50)
    var telephone: String? = null

    companion object {
        const val TABLE_NAME = "teacher"
        const val ADDRESS = "address"
        const val BIRTHDAY = "birthday"
        const val BIZ_STATUS = "biz_status"
        const val COURSE = "course"
        const val CREATE_TIME = "create_time"
        const val CREATE_USER_ID = "create_user_id"
        const val GENDER = "gender"
        const val ID = "id"
        const val NAME = "name"
        const val PROFESSIONAL = "professional"
        const val REMARK = "remark"
        const val STATE = "state"
        const val TELEPHONE = "telephone"
        const val UPDATE_TIME = "update_time"
        const val UPDATE_USER_ID = "update_user_id"
    }
}

/**
 * author GenerateModelBuilder
 * description Sql条件生成器
 **/
class TeacherCU: SqlConditionBuilder<TeacherCU>() {
    var ADDRESS = SqlConditionField<TeacherCU>(this, "a.address")
    var BIRTHDAY = SqlConditionField<TeacherCU>(this, "a.birthday")
    var BIZ_STATUS = SqlConditionField<TeacherCU>(this, "a.biz_status")
    var COURSE = SqlConditionField<TeacherCU>(this, "a.course")
    var CREATE_TIME = SqlConditionField<TeacherCU>(this, "a.create_time")
    var CREATE_USER_ID = SqlConditionField<TeacherCU>(this, "a.create_user_id")
    var GENDER = SqlConditionField<TeacherCU>(this, "a.gender")
    var ID = SqlConditionField<TeacherCU>(this, "a.id")
    var NAME = SqlConditionField<TeacherCU>(this, "a.name")
    var PROFESSIONAL = SqlConditionField<TeacherCU>(this, "a.professional")
    var REMARK = SqlConditionField<TeacherCU>(this, "a.remark")
    var STATE = SqlConditionField<TeacherCU>(this, "a.state")
    var TELEPHONE = SqlConditionField<TeacherCU>(this, "a.telephone")
    var UPDATE_TIME = SqlConditionField<TeacherCU>(this, "a.update_time")
    var UPDATE_USER_ID = SqlConditionField<TeacherCU>(this, "a.update_user_id")
}
