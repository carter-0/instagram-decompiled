package X;

import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.ADx  reason: case insensitive filesystem */
public final class C39895ADx {
    public static final HashMap A06 = AnonymousClass7TE.A1E();
    public long A00 = 0;
    public A9V A01 = null;
    public HashMap A02 = null;
    public HashMap A03 = null;
    public HashMap A04 = null;
    public HashMap A05 = null;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C39895ADx)) {
            return false;
        }
        C39895ADx aDx = (C39895ADx) obj;
        if (this.A00 != aDx.A00 || !0qQ.A0K(this.A03, aDx.A03) || !0qQ.A0K(this.A05, aDx.A05)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A00), this.A03, this.A05});
    }
}
