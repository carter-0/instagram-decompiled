package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.3QS  reason: invalid class name */
public final class AnonymousClass3QS {
    public float A00;
    public AnonymousClass9IV A01;
    public String A02;
    public List A03;
    public boolean A04;

    public AnonymousClass3QS() {
        this(0.0f, 31);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AnonymousClass3QS(float r7, int r8) {
        /*
            r6 = this;
            r4 = r7
            r3 = 0
            r2 = 0
            r1 = 0
            r0 = r8 & 1
            if (r0 == 0) goto L_0x000a
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x000a:
            r0 = r8 & 2
            if (r0 == 0) goto L_0x0013
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x0013:
            r5 = 0
            r0 = r8 & 16
            if (r0 == 0) goto L_0x001d
            X.9IV r1 = new X.9IV
            r1.<init>()
        L_0x001d:
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3QS.<init>(float, int):void");
    }

    public final boolean equals(Object obj) {
        AnonymousClass3QS r5;
        if (this != obj) {
            if (obj instanceof AnonymousClass3QS) {
                r5 = (AnonymousClass3QS) obj;
            } else {
                r5 = null;
            }
            if (r5 == null || this.A00 != r5.A00 || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public final AnonymousClass51I A00(AnonymousClass51J r4) {
        for (AnonymousClass51I r1 : this.A03) {
            if (r1.A04 == r4) {
                return r1;
            }
        }
        return null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.A00), this.A03});
    }

    public AnonymousClass3QS(AnonymousClass9IV r2, String str, List list, float f, boolean z) {
        0qQ.A0B(list, 2);
        0qQ.A0B(r2, 5);
        this.A00 = f;
        this.A03 = list;
        this.A04 = z;
        this.A02 = str;
        this.A01 = r2;
    }
}
