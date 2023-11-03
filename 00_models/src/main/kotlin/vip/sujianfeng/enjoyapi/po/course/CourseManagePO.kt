package vip.sujianfeng.enjoyapi.po.course

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import vip.sujianfeng.enjoydao.annotations.*
import vip.sujianfeng.enjoydao.sqlcondition.*
import vip.sujianfeng.enjoydao.enums.*

/**
 * author GenerateModelBuilder
 * description 读取数据库生成的实体模型代码，不要手动修改，重新生成后会覆盖
 **/
@ApiModel("课程管理PO")
@TbTableUuid(table = "course_manage")
open class CourseManagePO: vip.sujianfeng.enjoyapi.dbconn.MyModelBase() {
    @ApiModelProperty("课程编号")
    @TbFieldString(tableField = "code", label = "课程编号", length = 50)
    var code: String? = null
    @ApiModelProperty("课程名称")
    @TbFieldString(tableField = "name", label = "课程名称", length = 50)
    var name: String? = null
    @ApiModelProperty("学生名称")
    @TbFieldString(tableField = "student_name", label = "学生名称", length = 50)
    var studentName: String? = null
    @ApiModelProperty("老师名称")
    @TbFieldString(tableField = "teacher_name", label = "老师名称", length = 50)
    var teacherName: String? = null

    companion object {
        const val TABLE_NAME = "course_manage"
        const val BIZ_STATUS = "biz_status"
        const val CODE = "code"
        const val CREATE_TIME = "create_time"
        const val CREATE_USER_ID = "create_user_id"
        const val ID = "id"
        const val NAME = "name"
        const val REMARK = "remark"
        const val STATE = "state"
        const val STUDENT_NAME = "student_name"
        const val TEACHER_NAME = "teacher_name"
        const val UPDATE_TIME = "update_time"
        const val UPDATE_USER_ID = "update_user_id"
    }
}

/**
 * author GenerateModelBuilder
 * description Sql条件生成器
 **/
class CourseManageCU: SqlConditionBuilder<CourseManageCU>() {
    var BIZ_STATUS = SqlConditionField<CourseManageCU>(this, "a.biz_status")
    var CODE = SqlConditionField<CourseManageCU>(this, "a.code")
    var CREATE_TIME = SqlConditionField<CourseManageCU>(this, "a.create_time")
    var CREATE_USER_ID = SqlConditionField<CourseManageCU>(this, "a.create_user_id")
    var ID = SqlConditionField<CourseManageCU>(this, "a.id")
    var NAME = SqlConditionField<CourseManageCU>(this, "a.name")
    var REMARK = SqlConditionField<CourseManageCU>(this, "a.remark")
    var STATE = SqlConditionField<CourseManageCU>(this, "a.state")
    var STUDENT_NAME = SqlConditionField<CourseManageCU>(this, "a.student_name")
    var TEACHER_NAME = SqlConditionField<CourseManageCU>(this, "a.teacher_name")
    var UPDATE_TIME = SqlConditionField<CourseManageCU>(this, "a.update_time")
    var UPDATE_USER_ID = SqlConditionField<CourseManageCU>(this, "a.update_user_id")
}
