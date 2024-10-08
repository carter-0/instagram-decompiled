package X;

import android.media.metrics.LogSessionId;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* renamed from: X.4Rs  reason: invalid class name and case insensitive filesystem */
public final class C264894Rs {
    public static final C264894Rs A03;
    public final String A00;
    public final C264904Rt A01;
    public final Object A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C264894Rs)) {
            return false;
        }
        C264894Rs r4 = (C264894Rs) obj;
        return 2Ob.A00(this.A00, r4.A00) && 2Ob.A00(this.A01, r4.A01) && 2Ob.A00(this.A02, r4.A02);
    }

    static {
        C264894Rs r1;
        if (Util.A00 < 31) {
            r1 = new C264894Rs("");
        } else {
            r1 = new C264894Rs(C264904Rt.A01, "");
        }
        A03 = r1;
    }

    public final LogSessionId A00() {
        C264904Rt r0 = this.A01;
        r0.getClass();
        return r0.A00;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01, this.A02});
    }

    public C264894Rs(String str) {
        C256703wD.A04(Util.A00 < 31);
        this.A00 = str;
        this.A01 = null;
        this.A02 = new Object();
    }

    public C264894Rs(C264904Rt r2, String str) {
        this.A01 = r2;
        this.A00 = str;
        this.A02 = new Object();
    }

    public C264894Rs(LogSessionId logSessionId, String str) {
        this(new C264904Rt(logSessionId), str);
    }
}
