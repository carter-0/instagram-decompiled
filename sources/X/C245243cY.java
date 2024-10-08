package X;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: X.3cY  reason: invalid class name and case insensitive filesystem */
public abstract class C245243cY implements C245253cZ {
    public final C245273cb A00;

    public final boolean Cb2(CharSequence charSequence, int i, int i2) {
        C245243cY r2;
        if (i2 < 0 || charSequence.length() - i2 < 0) {
            throw new IllegalArgumentException();
        }
        C245273cb r0 = this.A00;
        if (r0 == null) {
            r2 = this;
            if (!(this instanceof C245233cX)) {
                if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                    return true;
                }
                return false;
            }
        } else {
            int AH5 = r0.AH5(charSequence, 0, i2);
            if (AH5 == 0) {
                return true;
            }
            if (AH5 == 1) {
                return false;
            }
            r2 = this;
            if (!(this instanceof C245233cX)) {
                if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                    return true;
                }
                return false;
            }
        }
        return ((C245233cX) r2).A00;
    }

    public C245243cY(C245273cb r1) {
        this.A00 = r1;
    }
}
