package vip.sujianfeng.enjoyapi.module.teacher

import vip.sujianfeng.enjoyapi.base.controller.MasterController
import io.swagger.annotations.Api
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import vip.sujianfeng.enjoydao.interfaces.JdbcTbDao
import vip.sujianfeng.utils.define.CallResult
import TeacherPageParam
import vip.sujianfeng.enjoyapi.vo.TeacherVO

/**
 * author GenerateCodeBuilder
 * createTime 2023-11-03 14:57:58
 * description 读取数据库生成的代码，仅不存在时生成，可修改
 **/
@Api(tags = ["教师信息"])
@RestController
@RequestMapping("/module/teacher-api")
class TeacherApiController: MasterController<TeacherVO, TeacherPageParam>() {
}