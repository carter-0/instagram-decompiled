package X;

public final class DwV extends 1XP {
    public String A00;
    public boolean A01;

    public final String getErrorMessage() {
        return this.A00;
    }

    public final boolean isOk() {
        if (!this.A01 || !DwV.super.isOk()) {
            return false;
        }
        return true;
    }
}
