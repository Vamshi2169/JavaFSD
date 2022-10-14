package com.spring.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.spring.beans.Employees;

import java.sql.ResultSet;    
import java.sql.SQLException;    
    
public class EmpDao {   

JdbcTemplate template;    
    
public void setTemplate(JdbcTemplate template) {    
    this.template = template;    
}    
public int save(Employees p){    
    String sql="insert into employees(name,salary,designation) values('"+p.getName()+"',"+p.getSalary()+",'"+p.getDesignation()+"')";    
    return template.update(sql);    
}    
public int update(Employees p){    
    String sql="update employees set name='"+p.getName()+"', salary="+p.getSalary()+",designation='"+p.getDesignation()+"' where id="+p.getId()+"";    
    return template.update(sql);    
}    
public int delete(int id){    
    String sql="delete from employees where id="+id+"";    
    return template.update(sql);    
}    

@SuppressWarnings("deprecation")
public Employees getById(int id){    
    String sql="select * from employees where id=?";    
    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Employees>(Employees.class));    
}    
public List<Employees> getEmployees(){    
    return template.query("select * from employees",new RowMapper<Employees>(){    
        public Employees mapRow(ResultSet rs, int row) throws SQLException {    
            Employees e=new Employees();    
            e.setId(rs.getInt(1));    
            e.setName(rs.getString(2));    
            e.setSalary(rs.getInt(3));    
            e.setDesignation(rs.getString(4));    
            return e;    
        }    
    });    
}

 
}
