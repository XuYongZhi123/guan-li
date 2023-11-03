import vip.sujianfeng.enjoydao.handler.model.PageParam
import vip.sujianfeng.enjoydao.interfaces.TbDao
import vip.sujianfeng.enjoydao.sqlcondition.ISqlConditionBuilder
import vip.sujianfeng.utils.comm.StringUtilsEx
import vip.sujianfeng.enjoyapi.po.record.ClassRecordCU

/**
 * author GenerateCodeBuilder
 * createTime 2023-11-03 14:58:17
 * description 读取数据库生成的代码，仅不存在时生成，可修改
 **/
class ClassRecordPageParam: PageParam() {

    override fun createBuilder(tbDao: TbDao?): ISqlConditionBuilder {
        return ClassRecordCU().apply {
            this.and(StringUtilsEx.isNotEmpty(keyword)) {
                this.COURSE_NAME.like("%$keyword%")
            }
        }
    }

}