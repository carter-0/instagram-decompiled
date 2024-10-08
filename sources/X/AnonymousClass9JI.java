package X;

/* renamed from: X.9JI  reason: invalid class name */
public final class AnonymousClass9JI extends AnonymousClass0T0 {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public String A04;
    public final int A05;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass9JI(1Xj r8) {
        this(r8, (Integer) null, (String) null, (String) null, (String) null);
        this.A05 = 2;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof AnonymousClass9JI) || ((AnonymousClass9JI) obj).A05 != i) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        AnonymousClass9JI r3;
        switch (this.A05) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (A00(0, obj)) {
                    AnonymousClass9JI r32 = (AnonymousClass9JI) obj;
                    if (0qQ.A0K(this.A03, r32.A03) && 0qQ.A0K(this.A02, r32.A02) && 0qQ.A0K(this.A00, r32.A00) && 0qQ.A0K(this.A01, r32.A01)) {
                        str = this.A04;
                        str2 = r32.A04;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!A00(1, obj)) {
                    return false;
                }
                r3 = (AnonymousClass9JI) obj;
                if (!0qQ.A0K(this.A04, r3.A04) || !0qQ.A0K(this.A01, r3.A01) || !0qQ.A0K(this.A00, r3.A00)) {
                    return false;
                }
            default:
                if (this == obj) {
                    return true;
                }
                if (!A00(2, obj)) {
                    return false;
                }
                r3 = (AnonymousClass9JI) obj;
                if (!0qQ.A0K(this.A00, r3.A00) || !0qQ.A0K(this.A04, r3.A04) || this.A01 != r3.A01) {
                    return false;
                }
        }
        if (!0qQ.A0K(this.A02, r3.A02)) {
            return false;
        }
        str = this.A03;
        str2 = r3.A03;
        if (!0qQ.A0K(str, str2)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r5 = this;
            int r1 = r5.A05
            switch(r1) {
                case 0: goto L_0x0071;
                case 1: goto L_0x004c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r5.A00
            int r1 = r1.hashCode()
            int r2 = r1 * 31
            java.lang.String r1 = r5.A04
            r4 = 0
            if (r1 != 0) goto L_0x0047
            r1 = 0
        L_0x0013:
            int r2 = r2 + r1
            int r3 = r2 * 31
            java.lang.Object r1 = r5.A01
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x006f
            int r2 = r1.intValue()
            r0 = 1
            if (r0 == r2) goto L_0x0044
            java.lang.String r1 = "DIRECT_REPLY_TO_AUTHOR"
        L_0x0025:
            int r1 = r1.hashCode()
            int r1 = r1 + r2
        L_0x002a:
            int r3 = r3 + r1
            int r2 = r3 * 31
            java.lang.String r1 = r5.A02
            if (r1 != 0) goto L_0x003f
            r1 = 0
        L_0x0032:
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.String r1 = r5.A03
        L_0x0037:
            if (r1 == 0) goto L_0x003d
            int r4 = r1.hashCode()
        L_0x003d:
            int r2 = r2 + r4
            return r2
        L_0x003f:
            int r1 = r1.hashCode()
            goto L_0x0032
        L_0x0044:
            java.lang.String r1 = "COAUTHOR_INVITE"
            goto L_0x0025
        L_0x0047:
            int r1 = r1.hashCode()
            goto L_0x0013
        L_0x004c:
            java.lang.String r1 = r5.A04
            r4 = 0
            if (r1 != 0) goto L_0x006a
            r1 = 0
        L_0x0052:
            int r2 = r1 * 31
            java.lang.Object r1 = r5.A01
            if (r1 != 0) goto L_0x0065
            r1 = 0
        L_0x0059:
            int r2 = r2 + r1
            int r3 = r2 * 31
            java.lang.Object r1 = r5.A00
            if (r1 == 0) goto L_0x006f
            int r1 = r1.hashCode()
            goto L_0x002a
        L_0x0065:
            int r1 = r1.hashCode()
            goto L_0x0059
        L_0x006a:
            int r1 = r1.hashCode()
            goto L_0x0052
        L_0x006f:
            r1 = 0
            goto L_0x002a
        L_0x0071:
            java.lang.String r1 = r5.A03
            r4 = 0
            if (r1 != 0) goto L_0x00a3
            r1 = 0
        L_0x0077:
            int r2 = r1 * 31
            java.lang.String r1 = r5.A02
            if (r1 != 0) goto L_0x009e
            r1 = 0
        L_0x007e:
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r5.A00
            if (r1 != 0) goto L_0x0099
            r1 = 0
        L_0x0086:
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r5.A01
            if (r1 != 0) goto L_0x0094
            r1 = 0
        L_0x008e:
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.String r1 = r5.A04
            goto L_0x0037
        L_0x0094:
            int r1 = r1.hashCode()
            goto L_0x008e
        L_0x0099:
            int r1 = r1.hashCode()
            goto L_0x0086
        L_0x009e:
            int r1 = r1.hashCode()
            goto L_0x007e
        L_0x00a3:
            int r1 = r1.hashCode()
            goto L_0x0077
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9JI.hashCode():int");
    }

    public AnonymousClass9JI(1Xj r2, Integer num, String str, String str2, String str3) {
        this.A05 = 2;
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A04 = str;
        this.A01 = num;
        this.A02 = str2;
        this.A03 = str3;
    }

    public AnonymousClass9JI(Object obj, Object obj2, String str, String str2, String str3, int i) {
        this.A05 = i;
        this.A04 = str;
        this.A01 = obj;
        this.A00 = obj2;
        this.A02 = str2;
        this.A03 = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass9JI() {
        this((Object) null, (Object) null, (String) null, (String) null, (String) null, 1);
        this.A05 = 1;
    }
}
