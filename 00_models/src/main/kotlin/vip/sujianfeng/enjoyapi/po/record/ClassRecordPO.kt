package vip.sujianfeng.enjoyapi.po.record

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import vip.sujianfeng.enjoydao.annotations.*
import vip.sujianfeng.enjoydao.sqlcondition.*
import vip.sujianfeng.enjoydao.enums.*

/**
 * author GenerateModelBuilder
 * description 读取数据库生成的实体模型代码，不要手动修改，重新生成后会覆盖
 **/
@ApiModel("上课记录PO")
@TbTableUuid(table = "class_record")
open class ClassRecordPO: vip.sujianfeng.enjoyapi.dbconn.MyModelBase() {
    @ApiModelProperty("出勤记录")
    @TbFieldString(tableField = "attendance_record", label = "出勤记录", length = 50)
    var attendanceRecord: String? = null
    @ApiModelProperty("上课时间")
    @TbFieldString(tableField = "class_time", label = "上课时间", length = 50)
    var classTime: String? = null
    @ApiModelProperty("上课内容")
    @TbFieldString(tableField = "course_content", label = "上课内容", length = 50)
    var courseContent: String? = null
    @ApiModelProperty("课程名称")
    @TbFieldString(tableField = "course_name", label = "课程名称", length = 50)
    var courseName: String? = null
    @ApiModelProperty("学生名称")
    @TbFieldString(tableField = "student_name", label = "学生名称", length = 50)
    var studentName: String? = null
    @ApiModelProperty("老师名称")
    @TbFieldString(tableField = "teacher_name", label = "老师名称", length = 50)
    var teacherName: String? = null

    companion object {
        const val TABLE_NAME = "class_record"
        const val ATTENDANCE_RECORD = "attendance_record"
        const val BIZ_STATUS = "biz_status"
        const val CLASS_TIME = "class_time"
        const val COURSE_CONTENT = "course_content"
        const val COURSE_NAME = "course_name"
        const val CREATE_TIME = "create_time"
        const val CREATE_USER_ID = "create_user_id"
        const val ID = "id"
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
class ClassRecordCU: SqlConditionBuilder<ClassRecordCU>() {
    var ATTENDANCE_RECORD = SqlConditionField<ClassRecordCU>(this, "a.attendance_record")
    var BIZ_STATUS = SqlConditionField<ClassRecordCU>(this, "a.biz_status")
    var CLASS_TIME = SqlConditionField<ClassRecordCU>(this, "a.class_time")
    var COURSE_CONTENT = SqlConditionField<ClassRecordCU>(this, "a.course_content")
    var COURSE_NAME = SqlConditionField<ClassRecordCU>(this, "a.course_name")
    var CREATE_TIME = SqlConditionField<ClassRecordCU>(this, "a.create_time")
    var CREATE_USER_ID = SqlConditionField<ClassRecordCU>(this, "a.create_user_id")
    var ID = SqlConditionField<ClassRecordCU>(this, "a.id")
    var REMARK = SqlConditionField<ClassRecordCU>(this, "a.remark")
    var STATE = SqlConditionField<ClassRecordCU>(this, "a.state")
    var STUDENT_NAME = SqlConditionField<ClassRecordCU>(this, "a.student_name")
    var TEACHER_NAME = SqlConditionField<ClassRecordCU>(this, "a.teacher_name")
    var UPDATE_TIME = SqlConditionField<ClassRecordCU>(this, "a.update_time")
    var UPDATE_USER_ID = SqlConditionField<ClassRecordCU>(this, "a.update_user_id")
}
