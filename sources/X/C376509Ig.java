package X;

import android.text.Layout;

/* renamed from: X.9Ig  reason: invalid class name and case insensitive filesystem */
public final class C376509Ig extends AnonymousClass0T0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C376509Ig) || ((C376509Ig) obj).A00 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        if (X.0qQ.A0K(r2.A01, r3.A01) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006c, code lost:
        r1 = r2.A02;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c4, code lost:
        r1 = r2.A03;
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0146, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0149, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x017f, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x000a;
                case 1: goto L_0x0024;
                case 2: goto L_0x0043;
                case 3: goto L_0x0072;
                case 4: goto L_0x0099;
                case 5: goto L_0x00ca;
                case 6: goto L_0x00ee;
                case 7: goto L_0x014e;
                case 8: goto L_0x0005;
                case 9: goto L_0x011e;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = super.equals(r3)
            return r0
        L_0x000a:
            if (r2 == r3) goto L_0x0183
            r0 = 0
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0181
            X.9Ig r3 = (X.C376509Ig) r3
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0181
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            goto L_0x005c
        L_0x0024:
            if (r2 == r3) goto L_0x0183
            r0 = 1
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0181
            X.9Ig r3 = (X.C376509Ig) r3
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            if (r1 != r0) goto L_0x0181
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            if (r1 != r0) goto L_0x0181
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            if (r1 == r0) goto L_0x0149
            goto L_0x0181
        L_0x0043:
            if (r2 == r3) goto L_0x0183
            r0 = 2
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0181
            X.9Ig r3 = (X.C376509Ig) r3
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0181
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
        L_0x005c:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0181
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0181
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            goto L_0x017b
        L_0x0072:
            if (r2 == r3) goto L_0x0183
            r0 = 3
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0181
            X.9Ig r3 = (X.C376509Ig) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0181
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0181
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 == r0) goto L_0x00c4
            goto L_0x0181
        L_0x0099:
            if (r2 == r3) goto L_0x0183
            r0 = 4
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0181
            X.9Ig r3 = (X.C376509Ig) r3
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0181
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0181
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00c4
            goto L_0x0181
        L_0x00c4:
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            goto L_0x017b
        L_0x00ca:
            if (r2 == r3) goto L_0x0183
            r0 = 5
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0181
            X.9Ig r3 = (X.C376509Ig) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0181
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0181
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            goto L_0x0142
        L_0x00ee:
            if (r2 == r3) goto L_0x0183
            r0 = 6
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0181
            X.9Ig r3 = (X.C376509Ig) r3
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0181
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0181
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0181
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 == r0) goto L_0x0183
            goto L_0x0181
        L_0x011e:
            if (r2 == r3) goto L_0x0183
            r0 = 9
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0181
            X.9Ig r3 = (X.C376509Ig) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0181
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0181
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
        L_0x0142:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0149
            goto L_0x0181
        L_0x0149:
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            goto L_0x017b
        L_0x014e:
            if (r2 == r3) goto L_0x0183
            r0 = 7
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0181
            X.9Ig r3 = (X.C376509Ig) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0181
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0181
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0181
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
        L_0x017b:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0183
        L_0x0181:
            r0 = 0
            return r0
        L_0x0183:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376509Ig.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007a, code lost:
        r5 = (r2 + r1.hashCode()) * 31;
        r1 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f3, code lost:
        if (r1 == null) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f5, code lost:
        r5 = r1.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0172, code lost:
        return r5 + r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r6 = this;
            int r1 = r6.A00
            switch(r1) {
                case 0: goto L_0x0151;
                case 1: goto L_0x0104;
                case 2: goto L_0x00d8;
                case 3: goto L_0x00a7;
                case 4: goto L_0x0085;
                case 5: goto L_0x0067;
                case 6: goto L_0x0053;
                case 7: goto L_0x0035;
                case 8: goto L_0x0005;
                case 9: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r5 = super.hashCode()
            return r5
        L_0x000a:
            java.lang.Object r1 = r6.A02
            r5 = 0
            if (r1 != 0) goto L_0x0030
            r1 = 0
        L_0x0010:
            int r2 = r1 * 31
            java.lang.Object r1 = r6.A04
            if (r1 != 0) goto L_0x002b
            r1 = 0
        L_0x0017:
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r6.A03
            if (r1 != 0) goto L_0x0026
            r1 = 0
        L_0x001f:
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r6.A01
            goto L_0x00f3
        L_0x0026:
            int r1 = r1.hashCode()
            goto L_0x001f
        L_0x002b:
            int r1 = r1.hashCode()
            goto L_0x0017
        L_0x0030:
            int r1 = r1.hashCode()
            goto L_0x0010
        L_0x0035:
            java.lang.Object r1 = r6.A02
            int r1 = r1.hashCode()
            int r2 = r1 * 31
            java.lang.Object r1 = r6.A01
            int r1 = r1.hashCode()
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r6.A03
            int r1 = r1.hashCode()
            int r2 = r2 + r1
            int r5 = r2 * 31
            java.lang.Object r1 = r6.A04
            goto L_0x016d
        L_0x0053:
            java.lang.Object r1 = r6.A04
            int r1 = r1.hashCode()
            int r2 = r1 * 31
            java.lang.Object r1 = r6.A02
            int r1 = r1.hashCode()
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r6.A03
            goto L_0x007a
        L_0x0067:
            java.lang.Object r1 = r6.A02
            int r1 = r1.hashCode()
            int r2 = r1 * 31
            java.lang.Object r1 = r6.A03
            int r1 = r1.hashCode()
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r6.A04
        L_0x007a:
            int r1 = r1.hashCode()
            int r2 = r2 + r1
            int r5 = r2 * 31
            java.lang.Object r1 = r6.A01
            goto L_0x016d
        L_0x0085:
            java.lang.Object r1 = r6.A04
            int r1 = r1.hashCode()
            int r2 = r1 * 31
            java.lang.Object r1 = r6.A02
            int r1 = r1.hashCode()
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r6.A01
            if (r1 != 0) goto L_0x00a2
            r1 = 0
        L_0x009b:
            int r2 = r2 + r1
            int r5 = r2 * 31
            java.lang.Object r1 = r6.A03
            goto L_0x016d
        L_0x00a2:
            int r1 = r1.hashCode()
            goto L_0x009b
        L_0x00a7:
            java.lang.Object r1 = r6.A02
            int r1 = r1.hashCode()
            int r2 = r1 * 31
            java.lang.Object r1 = r6.A04
            r5 = 0
            if (r1 != 0) goto L_0x00d3
            r1 = 0
        L_0x00b5:
            int r2 = r2 + r1
            int r4 = r2 * 31
            java.lang.Object r3 = r6.A01
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 != 0) goto L_0x00c5
            r2 = 0
        L_0x00bf:
            int r4 = r4 + r2
            int r2 = r4 * 31
            java.lang.Object r1 = r6.A03
            goto L_0x00f3
        L_0x00c5:
            java.lang.String r1 = X.AnonymousClass93b.A01(r3)
            int r2 = r1.hashCode()
            int r1 = r3.intValue()
            int r2 = r2 + r1
            goto L_0x00bf
        L_0x00d3:
            int r1 = r1.hashCode()
            goto L_0x00b5
        L_0x00d8:
            java.lang.Object r1 = r6.A03
            int r1 = r1.hashCode()
            int r2 = r1 * 31
            java.lang.Object r1 = r6.A04
            r5 = 0
            if (r1 != 0) goto L_0x00ff
            r1 = 0
        L_0x00e6:
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r6.A01
            if (r1 != 0) goto L_0x00fa
            r1 = 0
        L_0x00ee:
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r6.A02
        L_0x00f3:
            if (r1 == 0) goto L_0x0171
            int r5 = r1.hashCode()
            goto L_0x0171
        L_0x00fa:
            int r1 = r1.hashCode()
            goto L_0x00ee
        L_0x00ff:
            int r1 = r1.hashCode()
            goto L_0x00e6
        L_0x0104:
            java.lang.Object r1 = r6.A04
            java.lang.Number r1 = (java.lang.Number) r1
            int r2 = r1.intValue()
            r0 = 1
            if (r0 == r2) goto L_0x014e
            java.lang.String r1 = "PREVIEW_SELECTION"
        L_0x0111:
            int r1 = r1.hashCode()
            int r1 = r1 + r2
            int r3 = r1 * 31
            java.lang.Object r1 = r6.A03
            java.lang.Number r1 = (java.lang.Number) r1
            int r2 = r1.intValue()
            r0 = 1
            if (r0 == r2) goto L_0x014b
            java.lang.String r1 = "COMPACT"
        L_0x0125:
            int r1 = r1.hashCode()
            int r1 = r1 + r2
            int r3 = r3 + r1
            int r3 = r3 * 31
            java.lang.Object r1 = r6.A02
            java.lang.Number r1 = (java.lang.Number) r1
            int r2 = r1.intValue()
            r0 = 1
            if (r0 == r2) goto L_0x0148
            java.lang.String r1 = "MODERN"
        L_0x013a:
            int r1 = r1.hashCode()
            int r1 = r1 + r2
            int r3 = r3 + r1
            int r5 = r3 * 31
            java.lang.Object r1 = r6.A01
            if (r1 != 0) goto L_0x016d
            r2 = 0
            goto L_0x0171
        L_0x0148:
            java.lang.String r1 = "HIGH_CONTRAST"
            goto L_0x013a
        L_0x014b:
            java.lang.String r1 = "LARGE"
            goto L_0x0125
        L_0x014e:
            java.lang.String r1 = "ALL_SELECTED"
            goto L_0x0111
        L_0x0151:
            java.lang.Object r1 = r6.A04
            int r1 = r1.hashCode()
            int r2 = r1 * 31
            java.lang.Object r1 = r6.A03
            int r1 = r1.hashCode()
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r6.A01
            int r1 = r1.hashCode()
            int r2 = r2 + r1
            int r5 = r2 * 31
            java.lang.Object r1 = r6.A02
        L_0x016d:
            int r2 = r1.hashCode()
        L_0x0171:
            int r5 = r5 + r2
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376509Ig.hashCode():int");
    }

    public final String toString() {
        StringBuilder sb;
        Object obj;
        String str;
        String str2;
        switch (this.A00) {
            case 3:
                sb = new StringBuilder();
                sb.append("GridSponsoredContent(discoverySection=");
                sb.append(this.A02);
                sb.append(", targetPositionGapRules=");
                sb.append(this.A04);
                sb.append(AnonymousClass000.A00(841));
                Integer num = (Integer) this.A01;
                if (num != null) {
                    str = AnonymousClass93b.A01(num);
                } else {
                    str = "null";
                }
                sb.append(str);
                sb.append(", pageIndex=");
                obj = this.A03;
                break;
            case 8:
                sb = new StringBuilder();
                sb.append("AudioOverlayUpdates(snippetStartTimeMs=");
                sb.append(this.A03);
                sb.append(AnonymousClass000.A00(2047));
                sb.append(this.A04);
                sb.append(AnonymousClass000.A00(2013));
                sb.append(this.A02);
                str2 = ", delete=";
                break;
            case 9:
                sb = new StringBuilder();
                sb.append("NewsfeedLoggingContext(contentId=");
                sb.append(this.A02);
                sb.append(", mentionedUserIds=");
                sb.append(this.A04);
                sb.append(", mentionedContentIds=");
                sb.append(this.A03);
                str2 = Pxd.A00(112);
                break;
            default:
                return super.toString();
        }
        sb.append(str2);
        obj = this.A01;
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    public C376509Ig(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A03 = obj;
        this.A04 = obj2;
        this.A02 = obj3;
        this.A01 = obj4;
    }

    public C376509Ig(C62320sa r2, 0sP r3, 0sP r4, 0sP r5) {
        this.A00 = 7;
        0qQ.A0B(r5, 4);
        this.A02 = r2;
        this.A01 = r3;
        this.A03 = r4;
        this.A04 = r5;
    }

    public C376509Ig(C62320sa r2, C62320sa r3, 0sP r4, 0sJ r5) {
        this.A00 = 0;
        0qQ.A0B(r3, 3);
        0qQ.A0B(r5, 4);
        this.A04 = r4;
        this.A03 = r2;
        this.A01 = r3;
        this.A02 = r5;
    }

    public C376509Ig(AnonymousClass3WV r2, C231592rv r3, AnonymousClass3ZH r4, AnonymousClass3W1 r5) {
        this.A00 = 6;
        this.A04 = r2;
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C376509Ig(C254703su r3, C254703su r4) {
        this((N49) null, r3, r4, (C254703su) null);
        this.A00 = 2;
    }

    public C376509Ig(C295745oq r3, C233462vl r4, Integer num, Integer num2, int i) {
        this.A00 = 3;
        num = (i & 4) != 0 ? null : num;
        num2 = (i & 8) != 0 ? -1 : num2;
        this.A00 = 3;
        0qQ.A0B(r3, 1);
        this.A02 = r3;
        this.A04 = r4;
        this.A01 = num;
        this.A03 = num2;
    }

    public C376509Ig(N49 n49, C254703su r3, C254703su r4, C254703su r5) {
        this.A00 = 2;
        this.A03 = r3;
        this.A04 = r4;
        this.A01 = r5;
        this.A02 = n49;
    }

    public C376509Ig(Layout layout, AnonymousClass3ZH r3, AnonymousClass3W1 r4, Integer num) {
        this.A00 = 4;
        this.A04 = r4;
        this.A02 = layout;
        this.A01 = num;
        this.A03 = r3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C376509Ig(java.lang.Boolean r9, java.lang.Integer r10, java.lang.Integer r11, java.lang.Integer r12, int r13) {
        /*
            r8 = this;
            r7 = r9
            r6 = r12
            r5 = r11
            r4 = r10
            r3 = 8
            r2 = r8
            r8.A00 = r3
            r0 = r13 & 1
            r1 = 0
            if (r0 == 0) goto L_0x000f
            r4 = r1
        L_0x000f:
            r0 = r13 & 2
            if (r0 == 0) goto L_0x0014
            r5 = r1
        L_0x0014:
            r0 = r13 & 4
            if (r0 == 0) goto L_0x0019
            r6 = r1
        L_0x0019:
            r0 = r13 & 8
            if (r0 == 0) goto L_0x001e
            r7 = r1
        L_0x001e:
            r2.<init>((int) r3, (java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376509Ig.<init>(java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer, int):void");
    }

    public C376509Ig(Integer num, Integer num2, Integer num3, Integer num4) {
        this.A00 = 1;
        this.A04 = num;
        this.A03 = num2;
        this.A02 = num3;
        this.A01 = num4;
    }
}
