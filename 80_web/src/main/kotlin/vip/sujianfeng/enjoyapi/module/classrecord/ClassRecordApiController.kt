package vip.sujianfeng.enjoyapi.module.classrecord

import vip.sujianfeng.enjoyapi.base.controller.MasterController
import io.swagger.annotations.Api
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import vip.sujianfeng.enjoydao.interfaces.JdbcTbDao
import vip.sujianfeng.utils.define.CallResult
import ClassRecordPageParam
import vip.sujianfeng.enjoyapi.vo.record.ClassRecordVO

/**
 * author GenerateCodeBuilder
 * createTime 2023-11-03 14:58:17
 * description 读取数据库生成的代码，仅不存在时生成，可修改
 **/
@Api(tags = ["上课记录"])
@RestController
@RequestMapping("/module/class-record-api")
class ClassRecordApiController: MasterController<ClassRecordVO, ClassRecordPageParam>() {
}