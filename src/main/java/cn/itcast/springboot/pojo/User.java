package cn.itcast.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_user")
public class User {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;

    private String userName;

    private String password;

    private String name;

    private Integer age;

    private Integer sex;

    private Date birthday;

    private Date created;

    private Date updated;


}
