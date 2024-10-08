package X;

/* renamed from: X.Fgt  reason: case insensitive filesystem */
public final class C50694Fgt implements G6G {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r3 != null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r0 == null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        if (r0.longValue() > r16) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        if (r7 == null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        if (r7.longValue() >= (r16 - r18)) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        if (r6 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        if (r5 == null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        if (r8 == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
        if (r4 == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0040, code lost:
        if (r7 == null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
        if (r0 == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0048, code lost:
        return X.DbZ.A0W();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0049, code lost:
        if (r5 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004b, code lost:
        if (r7 == null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004d, code lost:
        if (r0 != false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004f, code lost:
        r2 = "Promotion doesn't qualify based on the specified ttl";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0055, code lost:
        r2 = "Promotion timing specification is invalid";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0058, code lost:
        r2 = "Promotion outside required start and end time";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0061, code lost:
        return new X.FEW(false, true, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r0.longValue() > r16) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.FEW FMu(android.content.Context r10, com.instagram.common.session.UserSession r11, com.instagram.quickpromotion.intf.QuickPromotionSurface r12, X.C283795Ji r13, java.util.Set r14, java.util.Set r15, long r16, long r18) {
        /*
            r9 = this;
            X.5Jk r3 = r13.A01
            if (r3 == 0) goto L_0x0052
            java.lang.Long r6 = r3.A01
            java.lang.Long r5 = r3.A00
        L_0x0008:
            java.lang.Long r7 = r13.A03
            if (r3 == 0) goto L_0x0019
            java.lang.Long r0 = r3.A01
            if (r0 == 0) goto L_0x0019
            long r1 = r0.longValue()
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            r8 = 1
            if (r0 <= 0) goto L_0x001c
        L_0x0019:
            r8 = 0
            if (r3 == 0) goto L_0x0029
        L_0x001c:
            java.lang.Long r0 = r3.A00
            if (r0 == 0) goto L_0x0029
            long r1 = r0.longValue()
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            r4 = 1
            if (r0 > 0) goto L_0x002a
        L_0x0029:
            r4 = 0
        L_0x002a:
            if (r7 == 0) goto L_0x0037
            long r2 = r7.longValue()
            long r16 = r16 - r18
            int r1 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            r0 = 1
            if (r1 >= 0) goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            if (r6 == 0) goto L_0x0049
            if (r5 == 0) goto L_0x0055
            if (r8 == 0) goto L_0x0058
            if (r4 == 0) goto L_0x0058
            if (r7 == 0) goto L_0x0044
            if (r0 == 0) goto L_0x0058
        L_0x0044:
            X.FEW r3 = X.DbZ.A0W()
            return r3
        L_0x0049:
            if (r5 != 0) goto L_0x0055
            if (r7 == 0) goto L_0x0055
            if (r0 != 0) goto L_0x0044
            java.lang.String r2 = "Promotion doesn't qualify based on the specified ttl"
            goto L_0x005a
        L_0x0052:
            r6 = 0
            r5 = 0
            goto L_0x0008
        L_0x0055:
            java.lang.String r2 = "Promotion timing specification is invalid"
            goto L_0x005a
        L_0x0058:
            java.lang.String r2 = "Promotion outside required start and end time"
        L_0x005a:
            r1 = 0
            r0 = 1
            X.FEW r3 = new X.FEW
            r3.<init>(r1, r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50694Fgt.FMu(android.content.Context, com.instagram.common.session.UserSession, com.instagram.quickpromotion.intf.QuickPromotionSurface, X.5Ji, java.util.Set, java.util.Set, long, long):X.FEW");
    }
}
