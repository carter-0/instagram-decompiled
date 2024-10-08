package X;

public final class NHT extends 1XP {
    public Boolean A00;
    public Boolean A01;
    public String A02;

    public final boolean isOk() {
        int i = this.mStatusCode;
        if (200 > i || i >= 300) {
            return false;
        }
        return true;
    }
}
