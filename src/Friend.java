import java.util.Objects;

public class Friend implements Comparable{

    private String name;
    private boolean family;
    private int yearsKnown;
    private int friendShipLevel;

    public Friend(String name, boolean family, int yearsKnown, int friendShipLevel) {
        this.name = name;
        this.family = family;
        this.yearsKnown = yearsKnown;
        this.friendShipLevel = friendShipLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFamily() {
        return family;
    }

    public void setFamily(boolean family) {
        this.family = family;
    }

    public int getYearsKnown() {
        return yearsKnown;
    }

    public void setYearsKnown(int yearsKnown) {
        this.yearsKnown = yearsKnown;
    }

    public int getFriendShipLevel() {
        return friendShipLevel;
    }

    public void setFriendShipLevel(int friendShipLevel) {
        this.friendShipLevel = friendShipLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Friend)) return false;
        Friend friend = (Friend) o;
        return isFamily() == friend.isFamily() && getYearsKnown() == friend.getYearsKnown() && getFriendShipLevel() == friend.getFriendShipLevel() && Objects.equals(getName(), friend.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), isFamily(), getYearsKnown(), getFriendShipLevel());
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", family=" + family +
                ", yearsKnown=" + yearsKnown +
                ", friendShipLevel=" + friendShipLevel +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
