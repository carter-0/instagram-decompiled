package X;

import java.io.Serializable;

/* renamed from: X.4f2  reason: invalid class name and case insensitive filesystem */
public class C269384f2 implements C269394f3, Serializable {
    public final void FNv(17Z r5, int i) {
        if (this instanceof C269374f1) {
            r5.A0d(' ');
        } else if (this instanceof C269404f4) {
            C269404f4 r3 = (C269404f4) this;
            r5.A0s(r3.A01);
            if (i > 0) {
                int i2 = i * r3.A00;
                while (true) {
                    char[] cArr = r3.A02;
                    int length = cArr.length;
                    if (i2 > length) {
                        r5.A0y(cArr, 0, length);
                        i2 -= length;
                    } else {
                        r5.A0y(cArr, 0, i2);
                        return;
                    }
                }
            }
        }
    }

    public final boolean isInline() {
        if (this instanceof C269404f4) {
            return false;
        }
        return true;
    }
}
