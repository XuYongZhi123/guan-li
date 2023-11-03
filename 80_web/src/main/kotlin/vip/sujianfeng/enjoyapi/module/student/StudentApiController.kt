package vip.sujianfeng.enjoyapi.module.student

import vip.sujianfeng.enjoyapi.base.controller.MasterController
import io.swagger.annotations.Api
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import vip.sujianfeng.enjoydao.interfaces.JdbcTbDao
import vip.sujianfeng.utils.define.CallResult
import StudentPageParam
import vip.sujianfeng.enjoyapi.vo.StudentVO

/**
 * author GenerateCodeBuilder
 * createTime 2023-11-03 14:57:44
 * description 读取数据库生成的代码，仅不存在时生成，可修改
 **/
@Api(tags = ["学生信息"])
@RestController
@RequestMapping("/module/student-api")
class StudentApiController: MasterController<StudentVO, StudentPageParam>() {
}