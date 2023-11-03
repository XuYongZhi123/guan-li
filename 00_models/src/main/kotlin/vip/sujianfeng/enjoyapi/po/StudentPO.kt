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
@ApiModel("学生信息PO")
@TbTableUuid(table = "student")
open class StudentPO: vip.sujianfeng.enjoyapi.dbconn.MyModelBase() {
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
    @ApiModelProperty("班级")
    @TbFieldString(tableField = "grade", label = "班级", length = 50)
    var grade: String? = null
    @ApiModelProperty("名称")
    @TbFieldString(tableField = "name", label = "名称", length = 50)
    var name: String? = null
    @ApiModelProperty("政治面貌")
    @TbFieldString(tableField = "politics", label = "政治面貌", length = 50)
    var politics: String? = null
    @ApiModelProperty("电话")
    @TbFieldString(tableField = "telephone", label = "电话", length = 50)
    var telephone: String? = null

    companion object {
        const val TABLE_NAME = "student"
        const val ADDRESS = "address"
        const val BIRTHDAY = "birthday"
        const val BIZ_STATUS = "biz_status"
        const val COURSE = "course"
        const val CREATE_TIME = "create_time"
        const val CREATE_USER_ID = "create_user_id"
        const val GENDER = "gender"
        const val GRADE = "grade"
        const val ID = "id"
        const val NAME = "name"
        const val POLITICS = "politics"
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
class StudentCU: SqlConditionBuilder<StudentCU>() {
    var ADDRESS = SqlConditionField<StudentCU>(this, "a.address")
    var BIRTHDAY = SqlConditionField<StudentCU>(this, "a.birthday")
    var BIZ_STATUS = SqlConditionField<StudentCU>(this, "a.biz_status")
    var COURSE = SqlConditionField<StudentCU>(this, "a.course")
    var CREATE_TIME = SqlConditionField<StudentCU>(this, "a.create_time")
    var CREATE_USER_ID = SqlConditionField<StudentCU>(this, "a.create_user_id")
    var GENDER = SqlConditionField<StudentCU>(this, "a.gender")
    var GRADE = SqlConditionField<StudentCU>(this, "a.grade")
    var ID = SqlConditionField<StudentCU>(this, "a.id")
    var NAME = SqlConditionField<StudentCU>(this, "a.name")
    var POLITICS = SqlConditionField<StudentCU>(this, "a.politics")
    var REMARK = SqlConditionField<StudentCU>(this, "a.remark")
    var STATE = SqlConditionField<StudentCU>(this, "a.state")
    var TELEPHONE = SqlConditionField<StudentCU>(this, "a.telephone")
    var UPDATE_TIME = SqlConditionField<StudentCU>(this, "a.update_time")
    var UPDATE_USER_ID = SqlConditionField<StudentCU>(this, "a.update_user_id")
}
