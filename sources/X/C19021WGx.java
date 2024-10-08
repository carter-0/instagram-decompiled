package X;

import java.util.List;

/* renamed from: X.WGx  reason: case insensitive filesystem */
public final class C19021WGx implements X5s {
    public final double A00;
    public final double A01;
    public final String A02;
    public final String A03;

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0097, code lost:
        r1 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009b, code lost:
        if (r3 > r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ac, code lost:
        r1 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b0, code lost:
        if (r3 >= r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b2, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CmQ(X.W2K r7) {
        /*
            r6 = this;
            java.lang.String r1 = r7.A02
            java.lang.String r0 = "INT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b3
            long r0 = r7.A01
            double r3 = (double) r0
        L_0x000d:
            java.lang.String r1 = r6.A02
            int r0 = r1.hashCode()
            r5 = 1
            switch(r0) {
                case 3244: goto L_0x0019;
                case 3309: goto L_0x0028;
                case 3464: goto L_0x0037;
                case 98322: goto L_0x0042;
                case 98694: goto L_0x0051;
                case 102680: goto L_0x0060;
                case 107485: goto L_0x006f;
                case 108954: goto L_0x007a;
                case 109854: goto L_0x0089;
                case 110226: goto L_0x009e;
                default: goto L_0x0017;
            }
        L_0x0017:
            r5 = 0
            return r5
        L_0x0019:
            java.lang.String r0 = "eq"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0017
            double r1 = r6.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0017
            return r5
        L_0x0028:
            java.lang.String r0 = "gt"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0017
            double r1 = r6.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0017
            return r5
        L_0x0037:
            java.lang.String r0 = "lt"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0017
            double r1 = r6.A00
            goto L_0x00ae
        L_0x0042:
            java.lang.String r0 = "ccr"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0017
            double r1 = r6.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0017
            goto L_0x0097
        L_0x0051:
            java.lang.String r0 = "cor"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0017
            double r1 = r6.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0017
            goto L_0x00ac
        L_0x0060:
            java.lang.String r0 = "gte"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0017
            double r1 = r6.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0017
            return r5
        L_0x006f:
            java.lang.String r0 = "lte"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0017
            double r1 = r6.A00
            goto L_0x0099
        L_0x007a:
            java.lang.String r0 = "neq"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0017
            double r1 = r6.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0017
            return r5
        L_0x0089:
            java.lang.String r0 = "ocr"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0017
            double r1 = r6.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0017
        L_0x0097:
            double r1 = r6.A01
        L_0x0099:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0017
            return r5
        L_0x009e:
            java.lang.String r0 = "oor"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0017
            double r1 = r6.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0017
        L_0x00ac:
            double r1 = r6.A01
        L_0x00ae:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0017
            return r5
        L_0x00b3:
            java.lang.String r0 = "FLOAT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00bf
            double r3 = r7.A00
            goto L_0x000d
        L_0x00bf:
            java.lang.String r1 = "Invalid value type"
            X.V1q r0 = new X.V1q
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19021WGx.CmQ(X.W2K):boolean");
    }

    public final String getName() {
        return this.A03;
    }

    public C19021WGx(String str, String str2, List list) {
        this.A03 = str;
        this.A02 = str2;
        char c = 65535;
        switch (str2.hashCode()) {
            case 98322:
                if (str2.equals("ccr")) {
                    c = 0;
                    break;
                }
                break;
            case 98694:
                if (str2.equals("cor")) {
                    c = 1;
                    break;
                }
                break;
            case 109854:
                if (str2.equals("ocr")) {
                    c = 2;
                    break;
                }
                break;
            case 110226:
                if (str2.equals("oor")) {
                    c = 3;
                    break;
                }
                break;
        }
        int size = list.size();
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
                if (size == 2) {
                    try {
                        double parseDouble = Double.parseDouble(AnonymousClass7TE.A19(list, 0));
                        this.A00 = parseDouble;
                        double parseDouble2 = Double.parseDouble(AnonymousClass7TE.A19(list, 1));
                        this.A01 = parseDouble2;
                        if (parseDouble >= parseDouble2) {
                            throw new C16687V1q("Bad values order", str);
                        }
                        return;
                    } catch (NumberFormatException unused) {
                        throw new C16687V1q("Bad number format", str);
                    }
                } else {
                    throw new C16687V1q("Mismatching number of values", str);
                }
            default:
                if (size == 1) {
                    try {
                        this.A00 = Double.parseDouble(AnonymousClass7TE.A19(list, 0));
                        return;
                    } catch (NumberFormatException unused2) {
                        throw new C16687V1q("Bad number format", str);
                    }
                } else {
                    throw new C16687V1q("Mismatching number of values", str);
                }
        }
    }
}
