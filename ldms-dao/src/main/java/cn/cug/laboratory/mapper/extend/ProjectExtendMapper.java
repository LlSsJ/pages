package cn.cug.laboratory.mapper.extend;

import cn.cug.laboratory.mapper.ProjectMapper;
import cn.cug.laboratory.model.extend.ProjectExtend;
import cn.cug.laboratory.model.persistent.PageModel;
import cn.cug.laboratory.model.persistent.Project;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectExtendMapper extends ProjectMapper {
    /**
     * @param teaId
     * @param startSite
     * @param pageNum
     * @return 根据教师ID和分页条件查询获取实验集合
     */
    List<ProjectExtend> selectByTeaId(@Param("teaId") String teaId, @Param("startSite") int startSite, @Param("pageNum") int pageNum);

    /**
     * @param teaId
     * @return 根据教师ID获取实验
     */
    int selectCountByTeaId(@Param("teaId") String teaId);

    /**
     * @param name
     * @param startSite
     * @param pageNum
     * @return 根据实验名称和分页条件获取实验结果
     */
    List<Project> selectByName(@Param("name") String name, @Param("startSite") int startSite, @Param("pageNum") int pageNum);

    /**
     * @param name
     * @return 统计相同有相同实验名字的实验
     */
    int selectCountByName(@Param("name") String name);

    /**
     * @param id 实验容量减1
     */
    void reduceLeft(String id);

    /**
     * @param id 实验容量加1
     */
    void addLeft(String id);

    /**
     * @author: shixing
     * @function:查询项目信息
     */
    List<ProjectExtend> selectByMultipleInfo(@Param("startPosition") Integer startPosition,
                                             @Param("offset") Integer offset,
                                             @Param("pe") ProjectExtend projectExtend);
    /**
     * @author: PP
     * @function:查询项目信息
     */
    List<ProjectExtend> pp_selectByMultipleInfo(@Param("startPosition") Integer startPosition,
                                                @Param("offset") Integer offset,
                                                @Param("pe") ProjectExtend projectExtend);

    /**
     * @author: shixing
     * @function:查询项目信息条数
     * @since : 1.0.0
     */
    Integer selectByMultipleInfoCounts(ProjectExtend projectExtend);

    /**
     * @author: PP
     * @function:查询项目信息条数
     * @since : 1.0.0
     */
    Integer pp_selectByMultipleInfoCounts(ProjectExtend projectExtend);

    /**
     * @author: shixing
     * @function:根据项目id查询项目详细信息
     * @since : 1.0.0
     */
    ProjectExtend selectMultipleInfoById(String id);


    /**
     * @author: HXY
     * @return
     */
    List<Project> getinfo(@Param("startPosition") Integer startPosition,
                                                 @Param("offset") Integer offset,
                                                 @Param("pr") Project project);
    /**
     * @author: HXY
     * @function:查询项目信息条数
     * @since : 1.0.0
     */
    Integer getCounts(Project project);

    /**
     * @author: HXY
     * @return
     */
    public String getLastId();

    public void setfilenameById(Project project);

}