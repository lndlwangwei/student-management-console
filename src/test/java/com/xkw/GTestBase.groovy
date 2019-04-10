package com.xkw

import groovy.sql.Sql
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Shared
import spock.lang.Specification

@SpringBootTest
class GTestBase extends Specification {

    @Shared
    Sql sql = Sql.newInstance("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8&useSSL=false", "root", "root", "com.mysql.cj.jdbc.Driver")
}
