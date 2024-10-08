package X;

/* renamed from: X.9J8  reason: invalid class name */
public final class AnonymousClass9J8 extends AnonymousClass0T0 {
    public final int A00 = 2;
    public final Object A01;
    public final String A02;
    public final String A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9J8(X.1FI r2, java.lang.String r3) {
        /*
            r1 = this;
            r0 = 2
            r1.A00 = r0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            X.0qQ.A07(r0)
            r1.<init>((X.1FI) r2, (java.lang.String) r3, (java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9J8.<init>(X.1FI, java.lang.String):void");
    }

    public final boolean equals(Object obj) {
        AnonymousClass9J8 r3;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AnonymousClass9J8)) {
                    return false;
                }
                r3 = (AnonymousClass9J8) obj;
                if (r3.A00 != 0 || !0qQ.A0K(this.A02, r3.A02) || !0qQ.A0K(this.A01, r3.A01)) {
                    return false;
                }
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AnonymousClass9J8)) {
                    return false;
                }
                r3 = (AnonymousClass9J8) obj;
                if (!(r3.A00 == 1 && 0qQ.A0K(this.A02, r3.A02) && this.A01 == r3.A01)) {
                    return false;
                }
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AnonymousClass9J8) {
                    AnonymousClass9J8 r32 = (AnonymousClass9J8) obj;
                    if (r32.A00 == 2 && 0qQ.A0K(this.A03, r32.A03) && this.A01 == r32.A01) {
                        str = this.A02;
                        str2 = r32.A02;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
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
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x001e;
                case 1: goto L_0x003d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = r3.A03
            int r0 = r0.hashCode()
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A01
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.String r0 = r3.A02
        L_0x0018:
            int r1 = r0.hashCode()
        L_0x001c:
            int r1 = r1 + r2
            return r1
        L_0x001e:
            java.lang.String r0 = r3.A02
            int r0 = r0.hashCode()
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A01
            r2 = 0
            if (r0 != 0) goto L_0x0038
            r0 = 0
        L_0x002c:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A03
            if (r0 == 0) goto L_0x001c
            int r2 = r0.hashCode()
            goto L_0x001c
        L_0x0038:
            int r0 = r0.hashCode()
            goto L_0x002c
        L_0x003d:
            java.lang.String r0 = r3.A02
            int r0 = r0.hashCode()
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A01
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.String r0 = r3.A03
            if (r0 != 0) goto L_0x0018
            r1 = 0
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9J8.hashCode():int");
    }

    public AnonymousClass9J8(1FI r3, String str, String str2) {
        0qQ.A0B(str, 1);
        0qQ.A0B(r3, 2);
        0qQ.A0B(str2, 3);
        this.A03 = str;
        this.A01 = r3;
        this.A02 = str2;
    }

    public AnonymousClass9J8(String str, Object obj, String str2) {
        this.A02 = str;
        this.A01 = obj;
        this.A03 = str2;
    }

    public AnonymousClass9J8(AnonymousClass849 r2, String str, String str2) {
        0qQ.A0B(r2, 2);
        this.A02 = str;
        this.A01 = r2;
        this.A03 = str2;
    }

    public AnonymousClass9J8(AnonymousClass849 r2, String str) {
        this(r2, str, (String) null);
    }
}
