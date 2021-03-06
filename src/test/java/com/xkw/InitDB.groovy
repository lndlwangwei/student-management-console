package com.xkw

class InitDB extends GTestBase {

    def "init student"() {
        expect:
        200.times {index ->
            def userName = "wangwei${index}"
            def age = "${index}"
            def gender = "男"
            if (index % 2 == 0) {
                gender = "女"
            }
            def cardId = "cardId${index}"
            def className = "云计算${index % 10 + 1}班"
            def hometown = "hometown${index}"
            def nation = "nation${index}"
            def contact = "contact${index}"
            def emergencyContact = "emergencyContact${index}"
            def graduateSchool = "graduateSchool${index}"
            def graduateTime = "2018-06-01"
            def specialty = "specialty${index}"
            def score = "score${index}"
            def dormitory = "dormitory${index % 30 + 1}"
            def source = "source${index}"
            def sqlStatement = "insert into student value (null, '${userName}', '${age}', '${gender}', " +
                    "'${cardId}', '${className}', '${hometown}', '${nation}', '${contact}', '${emergencyContact}', '${graduateSchool}'," +
                    " ${graduateTime}, '${specialty}', '${score}', '${dormitory}', '${source}', now(), now())"
            sql.executeInsert(sqlStatement)
        }
    }

    def "init clazz"() {
        expect:
        200.times {index ->
            def name = "clazz${index}"

            def sqlStatement = "insert into clazz value (null, '${name}', now(), now())"
            sql.executeInsert(sqlStatement)
        }
    }

    def "init user"() {
        expect:
        sql.executeInsert("insert into user value (null, 'admin', 'admin', 'admin')")
        10.times {index ->
            def username = "user${index}"
            def role = "user"
            def password = "user${index}"
            sql.executeInsert("insert into user value (null, '${username}', '${role}', '${password}')")
        }
    }

    public static void main(String[] args) {
        println 5 % 10
    }
}
