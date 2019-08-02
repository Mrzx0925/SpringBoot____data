package com.zx.springboot.mapper;


import com.zx.springboot.bean.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.jmx.export.annotation.ManagedAttribute;

//@Mapper或者@MapperScan将接口扫描装配到容器中
@Mapper
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
