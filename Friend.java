package practical;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class Friend {
    private String friendName;
    private LocalDate dob;
    private boolean isBestFriend;
    private String age;
    private String timeUntilNextBirthday;
    public Friend(String friendName, LocalDate dob, boolean isBestFriend){
        this.friendName = friendName;
        this.dob = dob;
        this.isBestFriend = isBestFriend;
    }}