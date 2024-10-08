package X;

/* renamed from: X.Drk  reason: case insensitive filesystem */
public final class C47169Drk extends AnonymousClass0T0 {
    public final long A00;
    public final C60951Ju9 A01;
    public final Integer A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47169Drk) {
                C47169Drk drk = (C47169Drk) obj;
                if (!(this.A02 == drk.A02 && this.A05 == drk.A05 && this.A04 == drk.A04 && this.A03 == drk.A03 && 0qQ.A0K(this.A01, drk.A01) && this.A00 == drk.A00 && this.A07 == drk.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.A02;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = C48793EkG.A00(num).hashCode() + num.intValue();
        }
        int A09 = AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A05, hashCode * 31));
        return DbS.A06(this.A07, AnonymousClass7TF.A01(this.A00, (AnonymousClass7TF.A09(this.A03, A09) + AnonymousClass7TE.A0L(this.A01)) * 31));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r7 != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C47169Drk(X.C60951Ju9 r2, java.lang.Integer r3, long r4, boolean r6, boolean r7, boolean r8, boolean r9) {
        /*
            r1 = this;
            r1.<init>()
            r1.A02 = r3
            r1.A05 = r6
            r1.A04 = r7
            r1.A03 = r8
            r1.A01 = r2
            r1.A00 = r4
            r1.A07 = r9
            if (r6 != 0) goto L_0x0016
            r0 = 0
            if (r7 == 0) goto L_0x0017
        L_0x0016:
            r0 = 1
        L_0x0017:
            r1.A06 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47169Drk.<init>(X.Ju9, java.lang.Integer, long, boolean, boolean, boolean, boolean):void");
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("UiState(xpostMode=");
        Integer num = this.A02;
        if (num != null) {
            str = C48793EkG.A00(num);
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", currentReelXAR=");
        A1A.append(this.A05);
        A1A.append(", currentReelCCP=");
        A1A.append(this.A04);
        A1A.append(", ccpWithByPass=");
        A1A.append(this.A03);
        A1A.append(", fbReelsPrivacyInfo=");
        A1A.append(this.A01);
        A1A.append(", fbReelsPrivacyInfoUpdateTime=");
        A1A.append(this.A00);
        A1A.append(", useXpostDesignV2=");
        A1A.append(this.A07);
        return AnonymousClass7TG.A0p(A1A);
    }
}
