package X;

import java.util.List;

/* renamed from: X.JvA  reason: case insensitive filesystem */
public final class C61010JvA extends AnonymousClass0T0 {
    public final C66376MPi A00;
    public final C66377MPj A01;
    public final C66378MPk A02;
    public final C66379MPl A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final boolean A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61010JvA) {
                C61010JvA jvA = (C61010JvA) obj;
                if (!0qQ.A0K(this.A01, jvA.A01) || !0qQ.A0K(this.A04, jvA.A04) || !0qQ.A0K(this.A03, jvA.A03) || !0qQ.A0K(this.A02, jvA.A02) || !0qQ.A0K(this.A06, jvA.A06) || !0qQ.A0K(this.A07, jvA.A07) || !0qQ.A0K(this.A05, jvA.A05) || !0qQ.A0K(this.A00, jvA.A00) || this.A09 != jvA.A09 || !0qQ.A0K(this.A08, jvA.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A08(this.A04, AnonymousClass7TE.A0K(this.A01)));
        return AnonymousClass7TE.A0N(this.A08, AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A07(this.A00, (((((AnonymousClass7TF.A07(this.A02, A072) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + C41845B3m.A00(this.A05)) * 31)));
    }

    public C61010JvA(C66376MPi mPi, C66377MPj mPj, C66378MPk mPk, C66379MPl mPl, String str, String str2, String str3, String str4, List list, boolean z) {
        C51974G9v.A1P(mPj, str, mPl, mPk);
        0qQ.A0B(mPi, 8);
        this.A01 = mPj;
        this.A04 = str;
        this.A03 = mPl;
        this.A02 = mPk;
        this.A06 = str2;
        this.A07 = str3;
        this.A05 = str4;
        this.A00 = mPi;
        this.A09 = z;
        this.A08 = list;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61010JvA() {
        /*
            r11 = this;
            r6 = 0
            X.Lcc r2 = X.C64475Lcc.A00
            java.lang.String r5 = ""
            X.Lcf r4 = X.C64478Lcf.A00
            X.Lce r3 = X.C64477Lce.A00
            X.Lcb r1 = X.C64474Lcb.A00
            r10 = 0
            X.0sn r9 = X.0sn.A00
            r0 = r11
            r7 = r6
            r8 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61010JvA.<init>():void");
    }
}
