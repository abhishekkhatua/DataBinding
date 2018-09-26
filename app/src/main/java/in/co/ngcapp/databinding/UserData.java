package in.co.ngcapp.databinding;

public class UserData {
    String name ;
    String mLastName;


    public UserData(String name, String mLastName) {
        this.name = name;
        this.mLastName = mLastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getmLastName() {
        return mLastName;
    }

    public void setmLastName(String mLastName) {
        this.mLastName = mLastName;
    }
}
