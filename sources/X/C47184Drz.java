package X;

import java.util.List;

/* renamed from: X.Drz  reason: case insensitive filesystem */
public final class C47184Drz extends AnonymousClass0T0 {
    public int A00;
    public Object A01;
    public String A02;
    public final int A03;
    public final String A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C47184Drz(List list) {
        this(list, 0, (String) null, (String) null, 6);
        this.A03 = 6;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C47184Drz) || ((C47184Drz) obj).A03 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        r3 = (X.C47184Drz) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (X.0qQ.A0K(r2.A02, r3.A02) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0079, code lost:
        if (r2.A00 != r3.A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007b, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d1, code lost:
        r1 = r2.A04;
        r0 = r3.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d9, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A03
            switch(r0) {
                case 1: goto L_0x002c;
                case 2: goto L_0x005c;
                case 3: goto L_0x0060;
                case 4: goto L_0x00aa;
                case 5: goto L_0x0080;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r2 == r3) goto L_0x00dd
            r0 = 6
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002a
            X.Drz r3 = (X.C47184Drz) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002a
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L_0x002a
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
        L_0x0024:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00d1
        L_0x002a:
            r0 = 0
            return r0
        L_0x002c:
            if (r2 == r3) goto L_0x00dd
            r0 = 1
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002a
            X.Drz r3 = (X.C47184Drz) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002a
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002a
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002a
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 == r0) goto L_0x00dd
            goto L_0x002a
        L_0x005c:
            if (r2 == r3) goto L_0x00dd
            r0 = 2
            goto L_0x0063
        L_0x0060:
            if (r2 == r3) goto L_0x00dd
            r0 = 3
        L_0x0063:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002a
            X.Drz r3 = (X.C47184Drz) r3
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002a
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L_0x002a
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            goto L_0x0024
        L_0x0080:
            if (r2 == r3) goto L_0x00dd
            r0 = 5
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002a
            X.Drz r3 = (X.C47184Drz) r3
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L_0x002a
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002a
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002a
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            goto L_0x00d5
        L_0x00aa:
            if (r2 == r3) goto L_0x00dd
            r0 = 4
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x002a
            X.Drz r3 = (X.C47184Drz) r3
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002a
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002a
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 == r0) goto L_0x00d1
            goto L_0x002a
        L_0x00d1:
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
        L_0x00d5:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00dd
            goto L_0x002a
        L_0x00dd:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47184Drz.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        r2 = (r1 + r0) * 31;
        r0 = r3.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        r1 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        return r1 + r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A03
            switch(r0) {
                case 1: goto L_0x0021;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x003c;
                case 5: goto L_0x004b;
                case 6: goto L_0x0061;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0O(r0)
            int r0 = r3.A00
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            int r0 = r0.hashCode()
        L_0x0016:
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.String r0 = r3.A04
        L_0x001b:
            int r1 = r0.hashCode()
        L_0x001f:
            int r1 = r1 + r2
            return r1
        L_0x0021:
            java.lang.Object r0 = r3.A01
            int r1 = X.AnonymousClass7TE.A0K(r0)
            java.lang.String r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A04
            int r0 = X.C41845B3m.A00(r0)
            int r1 = r1 + r0
            int r2 = r1 * 31
            int r1 = r3.A00
            goto L_0x001f
        L_0x003c:
            java.lang.String r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.Object r0 = r3.A01
            int r1 = X.AnonymousClass7TF.A07(r0, r1)
            int r0 = r3.A00
            goto L_0x0016
        L_0x004b:
            int r0 = r3.A00
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A04
            int r2 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.String r0 = r3.A02
            goto L_0x001b
        L_0x0061:
            java.lang.Object r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r0 * 31
            int r0 = r3.A00
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A04
            int r2 = X.C41845B3m.A00(r0)
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47184Drz.hashCode():int");
    }

    public final String toString() {
        if (6 - this.A03 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ProductOnboardingStepsData(productOnboardingNextStepInfo=");
        A1A.append(this.A01);
        A1A.append(", currentStepIndex=");
        A1A.append(this.A00);
        A1A.append(", onboardingIntroVideoUrl=");
        A1A.append(this.A02);
        A1A.append(", taxInfoDescription=");
        A1A.append(this.A04);
        return AnonymousClass7TG.A0p(A1A);
    }

    public C47184Drz(C254783t2 r2, String str, String str2, int i) {
        this.A03 = 5;
        AnonymousClass7TF.A1D(str, 3, str2);
        this.A00 = i;
        this.A01 = r2;
        this.A04 = str;
        this.A02 = str2;
    }

    public C47184Drz(String str, List list, int i, String str2, int i2) {
        this.A03 = 4;
        AnonymousClass7TG.A1O(str, list);
        0qQ.A0B(str2, 4);
        this.A02 = str;
        this.A01 = list;
        this.A00 = i;
        this.A04 = str2;
    }

    public C47184Drz(String str, String str2, List list, int i, int i2) {
        this.A03 = i2;
        AnonymousClass7TG.A0w(1, str, list, str2);
        this.A02 = str;
        this.A00 = i;
        this.A01 = list;
        this.A04 = str2;
    }

    public C47184Drz(List list, int i, String str, String str2, int i2) {
        this.A03 = 6;
        this.A01 = list;
        this.A00 = 0;
        this.A02 = str;
        this.A04 = str2;
    }

    public C47184Drz() {
        this.A03 = 1;
        AnonymousClass62M r2 = AnonymousClass62M.A01;
        this.A03 = 1;
        0qQ.A0B(r2, 1);
        this.A01 = r2;
        this.A02 = null;
        this.A04 = null;
        this.A00 = 0;
    }
}
