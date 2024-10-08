package X;

import android.media.metrics.LogSessionId;
import androidx.media3.common.util.Util;
import java.util.Arrays;

/* renamed from: X.XrA  reason: case insensitive filesystem */
public final class C22016XrA {
    public static final C22016XrA A02;
    public final C21958Xmn A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22016XrA)) {
            return false;
        }
        C22016XrA xrA = (C22016XrA) obj;
        return 2Ob.A00(this.A00, xrA.A00) && 2Ob.A00(this.A01, xrA.A01);
    }

    static {
        C22016XrA xrA;
        if (Util.A01 < 31) {
            xrA = new C22016XrA();
        } else {
            xrA = new C22016XrA(C21958Xmn.A01);
        }
        A02 = xrA;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{"", this.A00, this.A01});
    }

    public C22016XrA(C21958Xmn xmn) {
        this.A00 = xmn;
        this.A01 = Pxe.A0p();
    }

    public C22016XrA(LogSessionId logSessionId) {
        this(new C21958Xmn(logSessionId));
    }

    public C22016XrA() {
        C11366SPh.A02(AnonymousClass7TF.A1T(Util.A01, 31));
        this.A00 = null;
        this.A01 = Pxe.A0p();
    }
}
