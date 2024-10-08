package X;

import java.util.ArrayList;

public class DwX extends 1XP {
    public String A00;
    public String A01;
    public String A02;
    public ArrayList A03;
    public boolean A04;

    public String getErrorMessage() {
        return this.A00;
    }

    public final boolean isOk() {
        boolean z;
        if (DwX.super.isOk()) {
            if (this instanceof EM6) {
                z = true;
            } else {
                z = this.A04;
            }
            if (!z) {
                return false;
            }
            return true;
        }
        return false;
    }
}
