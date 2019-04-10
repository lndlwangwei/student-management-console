package com.xkw

class InitDB extends GTestBase {

    def "init user"() {
        expect:
        200.times {index ->
            def userName = "wangwei${index}"
            def password = "password${index}"
            def gender = "男"
            if (index / 2 == 0) {
                gender = "女"
            }
            def sqlStatement = "insert into user value (null, '${userName}', '${password}', '${gender}', now(), now())"
            sql.executeInsert(sqlStatement)
        }
    }
}
