package X;

import com.instagram.common.gallery.Medium;

/* renamed from: X.KwH  reason: case insensitive filesystem */
public abstract class C63396KwH {
    public static final boolean A00(Medium medium) {
        int i;
        int i2;
        int i3 = medium.A07;
        if (i3 == 3 || i3 == 1) {
            i = medium.A04;
            i2 = medium.A0B;
        } else {
            i = medium.A0B;
            i2 = medium.A04;
        }
        if (i > i2) {
            return true;
        }
        return false;
    }
}
