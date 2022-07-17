package flapps.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class AttendanceEntity {

    @Id
    private long userid;
    private String fullName;
    private String gender;
    private String birthDate;
    private int limitAnnualLeave;
    private Date dateAttendance;
    private long clockIn;
    private long clockOut;

    public AttendanceEntity() {

    }

    public AttendanceEntity(long userid, String fullName, String gender, String birthDate, int limitAnnualLeave, Date dateAttendance,
                            long clockIn, long clockOut) {
        this.userid = userid;
        this.fullName = fullName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.limitAnnualLeave = limitAnnualLeave;
        this.dateAttendance = dateAttendance;
        this.clockIn = clockIn;
        this.clockOut = clockOut;
    }


    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getLimitAnnualLeave() {
        return limitAnnualLeave;
    }

    public void setLimitAnnualLeave(int limitAnnualLeave) {
        this.limitAnnualLeave = limitAnnualLeave;
    }

    public Date getDateAttendance() {
        return dateAttendance;
    }

    public void setDateAttendance(Date dateAttendance) {
        this.dateAttendance = dateAttendance;
    }

    public long getClockIn() {
        return clockIn;
    }

    public void setClockIn(long clockIn) {
        this.clockIn = clockIn;
    }

    public long getClockOut() {
        return clockOut;
    }

    public void setClockOut(long clockOut) {
        this.clockOut = clockOut;
    }

    @Override
    public String toString() {
        return "AttendanceEntity{" +
                "userid=" + userid +
                ", fullName='" + fullName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate=" + birthDate + '\'' +
                ", limitAnnualLeave=" + limitAnnualLeave +
                '}';
    }

}
