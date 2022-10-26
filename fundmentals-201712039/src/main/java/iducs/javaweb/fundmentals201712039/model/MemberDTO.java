package iducs.javaweb.fundmentals201712039.model;

import java.util.Objects;

public class MemberDTO {
    private String name;
    private String email;


    private String work;

    public String getName() {
        return name;
    }

    //getter setter method : boiler plate code(상용, 관용 코드) generation
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberDTO memberDTO = (MemberDTO) o;
        return Objects.equals(name, memberDTO.name) && email.equals(memberDTO.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public String toString() { // 객체를 문자열화 할 때 사용
        return "MemberDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", work='" + work + '\'' +
                '}';
    }
}
