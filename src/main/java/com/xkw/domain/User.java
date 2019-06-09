package com.xkw.domain;

import org.springframework.beans.BeanUtils;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class User {

    private int id;
    /**
     * 姓名
     */
    @NotNull
    private String name;
    /**
     * 年龄
     */
    private int age;
    /**
     * 性别
     */
    @NotNull
    private String gender;
    /**
     * 身份证号
     */
    private String cardId;
    /**
     * 班级
     */
    private String className;

    private String hometown;

    private String nation;

    private String contact;

    private String emergencyContact;

    private String graduateSchool;

    private String graduateTime;

    private String specialty;

    private String score;

    private String dormitory;

    private String source;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getGraduateSchool() {
        return graduateSchool;
    }

    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool;
    }

    public String getGraduateTime() {
        return graduateTime;
    }

    public void setGraduateTime(String graduateTime) {
        this.graduateTime = graduateTime;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getDormitory() {
        return dormitory;
    }

    public void setDormitory(String dormitory) {
        this.dormitory = dormitory;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setAge(1);
        user.setGender("1");
        user.setCardId("1");

        List<User> allUsers = new ArrayList<>();
        allUsers.add(user);
        for (int i = 1 ; i < 16; i++) {
            User user1 = new User();
            BeanUtils.copyProperties(user, user1);

            if ((i & 1) == 1) user1.setId(-user1.getId());
            if ((i & 2) == 2) user1.setAge(-user1.getAge());
            if ((i & 4) == 4) user1.setGender("-"+user1.getGender());
            if ((i & 8) == 8) user1.setCardId("-"+user1.getCardId());


            allUsers.add(user1);
        }

        System.out.println(allUsers.size());
        allUsers.forEach(user1 -> System.out.println(user1));
    }

    private static User getClonedUser(User user) {
        User user1 = new User();
        BeanUtils.copyProperties(user, user1);

        return user1;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", cardId='" + cardId + '\'' +
                '}';
    }
}
