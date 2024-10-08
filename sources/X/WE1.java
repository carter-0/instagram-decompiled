package X;

import android.text.TextUtils;

public final class WE1 implements C267124b0 {
    public final String A00;

    public final /* bridge */ /* synthetic */ Object Bny() {
        return this;
    }

    public WE1(String str) {
        this.A00 = str;
    }

    public final boolean CIg(C69862Ca r3, CharSequence charSequence, int i, int i2) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.A00)) {
            return true;
        }
        r3.A02 = (r3.A02 & 3) | 4;
        return false;
    }
}
