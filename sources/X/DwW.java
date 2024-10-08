package X;

import android.text.TextUtils;

public class DwW extends 1XP {
    public FBN A00;
    public String A01;
    public boolean A02;

    public String getErrorMessage() {
        if (TextUtils.isEmpty(this.A01)) {
            return this.mErrorMessage;
        }
        return this.A01;
    }

    public final boolean isOk() {
        if (((this instanceof EM3) || this.A02) && DwW.super.isOk()) {
            return true;
        }
        return false;
    }
}
