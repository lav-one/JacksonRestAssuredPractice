package pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import java.util.List;
import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class Employee {

    private String name;
    private int age;
    private boolean married;
    private String mobileNo;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> skills;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Map<String, String> family_members;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        married = married;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public Map<String, String> getFamily_members() {
        return family_members;
    }

    public void setFamily_members(Map<String, String> family_members) {
        this.family_members = family_members;
    }
}
