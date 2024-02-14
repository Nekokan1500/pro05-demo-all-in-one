package com.arthur.learn;

import com.arthur.learn.imperial.court.dao.BaseDao;
import com.arthur.learn.imperial.court.util.JDBCUtils;
import org.junit.Test;

import com.arthur.learn.imperial.court.entity.Emp;

import java.sql.Connection;
import java.util.List;

public class ImperialCourtTest {

    private BaseDao<Emp> baseDao = new BaseDao<Emp>();

    @Test
    public void testGetSingleBean(){
        String sql = "Select emp_id empId, emp_name empName, emp_position empPosition, login_account loginAccount, login_password loginPassword from t_emp where emp_id=?";
        Emp emp = baseDao.getSingleBean(sql, Emp.class, 1);
        System.out.println("emp = " + emp);
    }

    @Test
    public void testUpdate(){
        String sql = "update t_emp set emp_position=? where emp_id=?";
        String position = "Lord Chancellor";
        String empId = "2";
        int affectedRowNumber = baseDao.update(sql, position, empId);
        System.out.println("Affected rows: " + affectedRowNumber);
    }

    @Test
    public void testGetBeanList(){
        String sql = "Select emp_id empId, emp_name empName, emp_position empPosition, login_account loginAccount, login_password loginPassword from t_emp";
        List<Emp> emps = baseDao.getBeanList(sql, Emp.class);
        for (Emp emp : emps) {
            System.out.println("emp = " + emp);
        }
    }

    @Test
    public void testGetConnection(){
        Connection connection = JDBCUtils.getConnection();
        System.out.println("Connection = " + connection);
        JDBCUtils.releaseConnection(connection);
    }
}
