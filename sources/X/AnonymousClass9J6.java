package X;

/* renamed from: X.9J6  reason: invalid class name */
public final class AnonymousClass9J6 extends AnonymousClass0T0 {
    public String A00;
    public String A01;
    public final int A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9J6(int r3) {
        /*
            r2 = this;
            r2.A02 = r3
            r1 = 0
            switch(r3) {
                case 6: goto L_0x0011;
                case 7: goto L_0x0006;
                case 8: goto L_0x0006;
                case 9: goto L_0x000e;
                default: goto L_0x0006;
            }
        L_0x0006:
            r0 = 11
        L_0x0008:
            r2.A02 = r0
            r2.<init>(r1, r1, r0)
            return
        L_0x000e:
            r0 = 9
            goto L_0x0008
        L_0x0011:
            r0 = 6
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9J6.<init>(int):void");
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof AnonymousClass9J6) || ((AnonymousClass9J6) obj).A02 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0034, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0036, code lost:
        r3 = (X.AnonymousClass9J6) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        if (X.0qQ.A0K(r2.A01, r3.A01) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0042, code lost:
        r1 = r2.A00;
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0054, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0056, code lost:
        r3 = (X.AnonymousClass9J6) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0060, code lost:
        if (X.0qQ.A0K(r2.A00, r3.A00) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0062, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006a, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A02
            switch(r0) {
                case 1: goto L_0x000a;
                case 2: goto L_0x0005;
                case 3: goto L_0x000e;
                case 4: goto L_0x0012;
                case 5: goto L_0x0016;
                case 6: goto L_0x001a;
                case 7: goto L_0x001e;
                case 8: goto L_0x0022;
                case 9: goto L_0x0027;
                case 10: goto L_0x002c;
                case 11: goto L_0x0047;
                case 12: goto L_0x004c;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = super.equals(r3)
            return r0
        L_0x000a:
            if (r2 == r3) goto L_0x006e
            r0 = 1
            goto L_0x0030
        L_0x000e:
            if (r2 == r3) goto L_0x006e
            r0 = 3
            goto L_0x0030
        L_0x0012:
            if (r2 == r3) goto L_0x006e
            r0 = 4
            goto L_0x0050
        L_0x0016:
            if (r2 == r3) goto L_0x006e
            r0 = 5
            goto L_0x0030
        L_0x001a:
            if (r2 == r3) goto L_0x006e
            r0 = 6
            goto L_0x0030
        L_0x001e:
            if (r2 == r3) goto L_0x006e
            r0 = 7
            goto L_0x0030
        L_0x0022:
            if (r2 == r3) goto L_0x006e
            r0 = 8
            goto L_0x0030
        L_0x0027:
            if (r2 == r3) goto L_0x006e
            r0 = 9
            goto L_0x0030
        L_0x002c:
            if (r2 == r3) goto L_0x006e
            r0 = 10
        L_0x0030:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x006c
            X.9J6 r3 = (X.AnonymousClass9J6) r3
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x006c
            java.lang.String r1 = r2.A00
            java.lang.String r0 = r3.A00
            goto L_0x0066
        L_0x0047:
            if (r2 == r3) goto L_0x006e
            r0 = 11
            goto L_0x0050
        L_0x004c:
            if (r2 == r3) goto L_0x006e
            r0 = 12
        L_0x0050:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x006c
            X.9J6 r3 = (X.AnonymousClass9J6) r3
            java.lang.String r1 = r2.A00
            java.lang.String r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x006c
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
        L_0x0066:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x006e
        L_0x006c:
            r0 = 0
            return r0
        L_0x006e:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9J6.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r0 == null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r2 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        return r1 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005e, code lost:
        return r1 + r0.hashCode();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A02
            switch(r0) {
                case 1: goto L_0x000a;
                case 2: goto L_0x0005;
                case 3: goto L_0x000a;
                case 4: goto L_0x001a;
                case 5: goto L_0x0030;
                case 6: goto L_0x000a;
                case 7: goto L_0x000a;
                case 8: goto L_0x003b;
                case 9: goto L_0x000a;
                case 10: goto L_0x0030;
                case 11: goto L_0x001a;
                case 12: goto L_0x004f;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r1 = super.hashCode()
            return r1
        L_0x000a:
            java.lang.String r0 = r3.A01
            r2 = 0
            if (r0 != 0) goto L_0x0015
            r0 = 0
        L_0x0010:
            int r1 = r0 * 31
            java.lang.String r0 = r3.A00
            goto L_0x0024
        L_0x0015:
            int r0 = r0.hashCode()
            goto L_0x0010
        L_0x001a:
            java.lang.String r0 = r3.A00
            r2 = 0
            if (r0 != 0) goto L_0x002b
            r0 = 0
        L_0x0020:
            int r1 = r0 * 31
            java.lang.String r0 = r3.A01
        L_0x0024:
            if (r0 == 0) goto L_0x0048
            int r2 = r0.hashCode()
            goto L_0x0048
        L_0x002b:
            int r0 = r0.hashCode()
            goto L_0x0020
        L_0x0030:
            java.lang.String r0 = r3.A01
            int r0 = r0.hashCode()
            int r1 = r0 * 31
            java.lang.String r0 = r3.A00
            goto L_0x0059
        L_0x003b:
            java.lang.String r0 = r3.A01
            int r0 = r0.hashCode()
            int r2 = r0 * 31
            java.lang.String r0 = r3.A00
            if (r0 != 0) goto L_0x004a
            r1 = 0
        L_0x0048:
            int r1 = r1 + r2
            return r1
        L_0x004a:
            int r1 = r0.hashCode()
            goto L_0x0048
        L_0x004f:
            java.lang.String r0 = r3.A00
            int r0 = r0.hashCode()
            int r1 = r0 * 31
            java.lang.String r0 = r3.A01
        L_0x0059:
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9J6.hashCode():int");
    }

    public final String toString() {
        if (11 - this.A02 != 0) {
            return super.toString();
        }
        return 002.A0v("CreatedFromHighlightInfo(mediaId=", this.A00, ", reelId=", this.A01, ')');
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        X.0qQ.A0B(r3, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1.A00 = r2;
        r1.A01 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        r1.A01 = r2;
        r1.A00 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9J6(java.lang.String r2, java.lang.String r3, int r4) {
        /*
            r1 = this;
            r1.A02 = r4
            switch(r4) {
                case 0: goto L_0x0009;
                case 1: goto L_0x0022;
                case 2: goto L_0x000d;
                case 3: goto L_0x0022;
                case 4: goto L_0x000d;
                case 5: goto L_0x001a;
                case 6: goto L_0x0022;
                case 7: goto L_0x0022;
                case 8: goto L_0x0015;
                case 9: goto L_0x0022;
                case 10: goto L_0x0022;
                case 11: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 1
            X.0qQ.A0B(r2, r0)
        L_0x0009:
            r0 = 2
            X.0qQ.A0B(r3, r0)
        L_0x000d:
            r1.<init>()
            r1.A00 = r2
            r1.A01 = r3
            return
        L_0x0015:
            r0 = 1
            X.0qQ.A0B(r2, r0)
            goto L_0x0022
        L_0x001a:
            r0 = 1
            X.0qQ.A0B(r2, r0)
            r0 = 2
            X.0qQ.A0B(r3, r0)
        L_0x0022:
            r1.<init>()
            r1.A01 = r2
            r1.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9J6.<init>(java.lang.String, java.lang.String, int):void");
    }
}
