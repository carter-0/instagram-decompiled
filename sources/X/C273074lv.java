package X;

import android.content.res.Resources;
import java.util.Arrays;

/* renamed from: X.4lv  reason: invalid class name and case insensitive filesystem */
public final class C273074lv {
    public final Resources.Theme A00;
    public final Resources A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C273074lv r5 = (C273074lv) obj;
            if (!this.A01.equals(r5.A01) || !02S.A00(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }

    public C273074lv(Resources.Theme theme, Resources resources) {
        this.A01 = resources;
        this.A00 = theme;
    }
}
