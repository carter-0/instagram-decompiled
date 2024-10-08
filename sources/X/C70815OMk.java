package X;

import java.util.Arrays;

/* renamed from: X.OMk  reason: case insensitive filesystem */
public final class C70815OMk {
    public final C69305Nj6 A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public C70815OMk(C69305Nj6 nj6, String str, String str2, boolean z) {
        0qQ.A0B(nj6, 3);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = nj6;
        this.A03 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!0qQ.A0K(getClass(), JTR.A0v(obj))) {
            return false;
        }
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.messagethread.contentgating.MediaShareContentGatingViewModel");
        C70815OMk oMk = (C70815OMk) obj;
        return 0qQ.A0K(this.A02, oMk.A02) && 0qQ.A0K(this.A01, oMk.A01) && this.A00 == oMk.A00;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A01, this.A00});
    }
}
