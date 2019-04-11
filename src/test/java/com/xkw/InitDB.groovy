package com.xkw

class InitDB extends GTestBase {

    def "init user"() {
        expect:
        200.times {index ->
            def userName = "wangwei${index}"
            def age = "${index}"
            def gender = "男"
            if (index % 2 == 0) {
                gender = "女"
            }
            def cardId = "cardId${index}"
            def hometown = "hometown${index}"
            def nation = "nation${index}"
            def contact = "contact${index}"
            def emergencyContact = "emergencyContact${index}"
            def graduateSchool = "graduateSchool${index}"
            def graduateTime = "2018-06-01"
            def specialty = "specialty${index}"
            def score = "score${index}"
            def dormitory = "dormitory${index}"
            def source = "source${index}"
            def sqlStatement = "insert into user value (null, '${userName}', '${age}', '${gender}', " +
                    "'${cardId}', '${hometown}', '${nation}', '${contact}', '${emergencyContact}', '${graduateSchool}'," +
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
}
