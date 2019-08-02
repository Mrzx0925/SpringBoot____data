package com.zx.springboot.mapper;

import com.zx.springboot.bean.Department;
import org.apache.ibatis.annotations.*;


//操作数据库的mapper
@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id = #{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id = #{id}")
    public int deleteDeptByID(Integer id);

    //Options useGeneratedKeys（自增）  keyProperty指定主键
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentName = #{departmentName} where id = #{id}")
    public int updateDept(Department department);
}
