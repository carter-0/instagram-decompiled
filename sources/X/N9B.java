package X;

import java.util.Set;

public final class N9B extends AnonymousClass0T0 implements C74269Prx {
    public final C69307Nj8 A00;
    public final Integer A01;
    public final Set A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N9B) {
                N9B n9b = (N9B) obj;
                if (!(this.A00 == n9b.A00 && 0qQ.A0K(this.A02, n9b.A02) && this.A01 == n9b.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A07 = AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A00));
        int intValue = this.A01.intValue();
        if (1 != intValue) {
            str = "UNKNOWN";
        } else {
            str = "CAMERA_OFF";
        }
        return A07 + C51966G9m.A04(str, intValue);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r3 == X.C69307Nj8.A06) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public N9B(X.C69307Nj8 r3, java.lang.Integer r4, java.util.Set r5) {
        /*
            r2 = this;
            X.AnonymousClass7TG.A1U(r3, r5, r4)
            r2.<init>()
            r2.A00 = r3
            r2.A02 = r5
            r2.A01 = r4
            X.Nj8 r0 = X.C69307Nj8.PAUSED
            if (r3 == r0) goto L_0x0015
            X.Nj8 r1 = X.C69307Nj8.SHARING
            r0 = 0
            if (r3 != r1) goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            r2.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N9B.<init>(X.Nj8, java.lang.Integer, java.util.Set):void");
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcScreenShareStateModel(state=");
        A1A.append(this.A00);
        A1A.append(", peersSharing=");
        A1A.append(this.A02);
        A1A.append(", reasonUnavailable=");
        Integer num = this.A01;
        if (num == null) {
            str = "null";
        } else if (1 - num.intValue() != 0) {
            str = "UNKNOWN";
        } else {
            str = "CAMERA_OFF";
        }
        return C51975G9x.A0i(str, A1A);
    }
}
