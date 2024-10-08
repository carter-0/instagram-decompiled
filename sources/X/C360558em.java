package X;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.8em  reason: invalid class name and case insensitive filesystem */
public final class C360558em implements C255463uA {
    public static final C360558em A00 = new Object();
    public static final SerialDescriptor A01 = new C255523uG("X.30M", C255493uD.A00);

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (X.00l.A0Z(r7, '-') == false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r5 == '-') goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r17) {
        /*
            r16 = this;
            r8 = 0
            r0 = r17
            X.0qQ.A0B(r0, r8)
            java.lang.String r7 = r0.AO9()
            X.0qQ.A0B(r7, r8)
            int r6 = r7.length()     // Catch:{ IllegalArgumentException -> 0x0154 }
            if (r6 == 0) goto L_0x0146
            r2 = 0
            char r5 = r7.charAt(r8)     // Catch:{ IllegalArgumentException -> 0x0154 }
            r1 = 43
            r0 = 45
            if (r5 == r1) goto L_0x0022
            r4 = 0
            if (r5 != r0) goto L_0x0023
        L_0x0022:
            r4 = 1
        L_0x0023:
            r13 = 0
            if (r4 == 0) goto L_0x002d
            boolean r0 = X.00l.A0Z(r7, r0)     // Catch:{ IllegalArgumentException -> 0x0154 }
            r15 = 1
            if (r0 != 0) goto L_0x002e
        L_0x002d:
            r15 = 0
        L_0x002e:
            java.lang.String r0 = "No components"
            if (r6 <= r4) goto L_0x0140
            char r1 = r7.charAt(r4)     // Catch:{ IllegalArgumentException -> 0x0154 }
            r0 = 80
            java.lang.String r11 = "Unexpected order of duration components"
            r10 = 58
            r9 = 48
            if (r1 != r0) goto L_0x014e
            int r5 = r4 + 1
            if (r5 == r6) goto L_0x013a
            r14 = 0
        L_0x0045:
            if (r5 >= r6) goto L_0x0127
            char r1 = r7.charAt(r5)     // Catch:{ IllegalArgumentException -> 0x0154 }
            r0 = 84
            if (r1 != r0) goto L_0x0057
            if (r14 != 0) goto L_0x00fd
            int r5 = r5 + 1
            if (r5 == r6) goto L_0x00fd
            r14 = 1
            goto L_0x0045
        L_0x0057:
            r4 = r5
        L_0x0058:
            if (r4 >= r6) goto L_0x006f
            char r1 = r7.charAt(r4)     // Catch:{ IllegalArgumentException -> 0x0154 }
            if (r9 > r1) goto L_0x0061
            goto L_0x006a
        L_0x0061:
            java.lang.String r0 = "+-."
            boolean r0 = X.00l.A0X(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0154 }
            if (r0 == 0) goto L_0x006f
            goto L_0x006c
        L_0x006a:
            if (r1 >= r10) goto L_0x0061
        L_0x006c:
            int r4 = r4 + 1
            goto L_0x0058
        L_0x006f:
            java.lang.String r12 = r7.substring(r5, r4)     // Catch:{ IllegalArgumentException -> 0x0154 }
            X.0qQ.A07(r12)     // Catch:{ IllegalArgumentException -> 0x0154 }
            int r0 = r12.length()     // Catch:{ IllegalArgumentException -> 0x0154 }
            if (r0 != 0) goto L_0x0083
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0154 }
            r1.<init>()     // Catch:{ IllegalArgumentException -> 0x0154 }
            goto L_0x0153
        L_0x0083:
            int r0 = r12.length()     // Catch:{ IllegalArgumentException -> 0x0154 }
            int r5 = r5 + r0
            if (r5 < 0) goto L_0x011b
            if (r5 >= r6) goto L_0x011b
            char r1 = r7.charAt(r5)     // Catch:{ IllegalArgumentException -> 0x0154 }
            int r5 = r5 + 1
            if (r14 != 0) goto L_0x009b
            r0 = 68
            if (r1 != r0) goto L_0x0103
            X.30J r4 = X.AnonymousClass30J.DAYS     // Catch:{ IllegalArgumentException -> 0x0154 }
            goto L_0x00af
        L_0x009b:
            r0 = 72
            if (r1 != r0) goto L_0x00a2
            X.30J r4 = X.AnonymousClass30J.HOURS     // Catch:{ IllegalArgumentException -> 0x0154 }
            goto L_0x00af
        L_0x00a2:
            r0 = 77
            if (r1 != r0) goto L_0x00a9
            X.30J r4 = X.AnonymousClass30J.MINUTES     // Catch:{ IllegalArgumentException -> 0x0154 }
            goto L_0x00af
        L_0x00a9:
            r0 = 83
            if (r1 != r0) goto L_0x010f
            X.30J r4 = X.AnonymousClass30J.SECONDS     // Catch:{ IllegalArgumentException -> 0x0154 }
        L_0x00af:
            if (r13 == 0) goto L_0x00be
            int r0 = r13.compareTo(r4)     // Catch:{ IllegalArgumentException -> 0x0154 }
            if (r0 > 0) goto L_0x00be
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0154 }
            r1.<init>(r11)     // Catch:{ IllegalArgumentException -> 0x0154 }
            goto L_0x0153
        L_0x00be:
            r0 = 46
            int r13 = X.00l.A04(r12, r0, r8)     // Catch:{ IllegalArgumentException -> 0x0154 }
            X.30J r0 = X.AnonymousClass30J.SECONDS     // Catch:{ IllegalArgumentException -> 0x0154 }
            if (r4 != r0) goto L_0x00cb
            if (r13 <= 0) goto L_0x00cb
            goto L_0x00d4
        L_0x00cb:
            long r0 = X.AnonymousClass30K.A01(r12)     // Catch:{ IllegalArgumentException -> 0x0154 }
            long r0 = X.AnonymousClass30K.A04(r4, r0)     // Catch:{ IllegalArgumentException -> 0x0154 }
            goto L_0x00f6
        L_0x00d4:
            java.lang.String r0 = r12.substring(r8, r13)     // Catch:{ IllegalArgumentException -> 0x0154 }
            X.0qQ.A07(r0)     // Catch:{ IllegalArgumentException -> 0x0154 }
            long r0 = X.AnonymousClass30K.A01(r0)     // Catch:{ IllegalArgumentException -> 0x0154 }
            long r0 = X.AnonymousClass30K.A04(r4, r0)     // Catch:{ IllegalArgumentException -> 0x0154 }
            long r2 = X.AnonymousClass30M.A05(r2, r0)     // Catch:{ IllegalArgumentException -> 0x0154 }
            java.lang.String r0 = r12.substring(r13)     // Catch:{ IllegalArgumentException -> 0x0154 }
            X.0qQ.A07(r0)     // Catch:{ IllegalArgumentException -> 0x0154 }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ IllegalArgumentException -> 0x0154 }
            long r0 = X.AnonymousClass30K.A02(r4, r0)     // Catch:{ IllegalArgumentException -> 0x0154 }
        L_0x00f6:
            long r2 = X.AnonymousClass30M.A05(r2, r0)     // Catch:{ IllegalArgumentException -> 0x0154 }
            r13 = r4
            goto L_0x0045
        L_0x00fd:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0154 }
            r1.<init>()     // Catch:{ IllegalArgumentException -> 0x0154 }
            goto L_0x0153
        L_0x0103:
            java.lang.String r0 = "Invalid or unsupported duration ISO non-time unit: "
            java.lang.String r0 = X.002.A0C(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0154 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0154 }
            r1.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x0154 }
            goto L_0x0153
        L_0x010f:
            java.lang.String r0 = "Invalid duration ISO time unit: "
            java.lang.String r0 = X.002.A0C(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0154 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0154 }
            r1.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x0154 }
            goto L_0x0153
        L_0x011b:
            java.lang.String r0 = "Missing unit for value "
            java.lang.String r0 = X.002.A0R(r0, r12)     // Catch:{ IllegalArgumentException -> 0x0154 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0154 }
            r1.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x0154 }
            goto L_0x0153
        L_0x0127:
            if (r15 == 0) goto L_0x0134
            r6 = 1
            long r0 = r2 >> r6
            long r4 = -r0
            int r0 = (int) r2     // Catch:{ IllegalArgumentException -> 0x0154 }
            r0 = r0 & 1
            long r4 = r4 << r6
            long r0 = (long) r0     // Catch:{ IllegalArgumentException -> 0x0154 }
            long r4 = r4 + r0
            r2 = r4
        L_0x0134:
            X.30M r0 = new X.30M
            r0.<init>(r2)
            return r0
        L_0x013a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0154 }
            r1.<init>()     // Catch:{ IllegalArgumentException -> 0x0154 }
            goto L_0x0153
        L_0x0140:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0154 }
            r1.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x0154 }
            goto L_0x0153
        L_0x0146:
            java.lang.String r0 = "The string is empty"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0154 }
            r1.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x0154 }
            goto L_0x0153
        L_0x014e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0154 }
            r1.<init>()     // Catch:{ IllegalArgumentException -> 0x0154 }
        L_0x0153:
            throw r1     // Catch:{ IllegalArgumentException -> 0x0154 }
        L_0x0154:
            r2 = move-exception
            java.lang.String r1 = "Invalid ISO duration string format: '"
            java.lang.String r0 = "'."
            java.lang.String r1 = X.002.A0g(r1, r7, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C360558em.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        if (r16 != 0) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        if (r3 != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        r14.append(r0);
        r14.append('H');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        if (r4 == false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        r14.append(r9);
        r14.append('M');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
        if (r2 != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
        if (r3 != false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        if (r4 != false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        X.AnonymousClass30M.A08("S", r14, r15, r16, 9, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0081, code lost:
        r0 = r14.toString();
        X.0qQ.A07(r0);
        r8.ASB(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008d, code lost:
        if (r3 != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void serialize(kotlinx.serialization.encoding.Encoder r20, java.lang.Object r21) {
        /*
            r19 = this;
            r0 = r21
            X.30M r0 = (X.AnonymousClass30M) r0
            long r4 = r0.A00
            r0 = 0
            r8 = r20
            X.0qQ.A0B(r8, r0)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r12 = 0
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x001c
            r0 = 45
            r14.append(r0)
        L_0x001c:
            java.lang.String r0 = "PT"
            r14.append(r0)
            r2 = r4
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0030
            r6 = 1
            long r0 = r4 >> r6
            long r2 = -r0
            int r0 = (int) r4
            r0 = r0 & 1
            long r2 = r2 << r6
            long r0 = (long) r0
            long r2 = r2 + r0
        L_0x0030:
            X.30J r0 = X.AnonymousClass30J.HOURS
            long r0 = X.AnonymousClass30M.A06(r0, r2)
            boolean r6 = X.AnonymousClass30M.A09(r2)
            if (r6 == 0) goto L_0x0090
            r9 = 0
            r15 = 0
        L_0x003e:
            int r16 = X.AnonymousClass30M.A01(r2)
            boolean r2 = X.AnonymousClass30M.A09(r4)
            if (r2 == 0) goto L_0x004d
            r0 = 9999999999999(0x9184e729fff, double:4.940656458412E-311)
        L_0x004d:
            r4 = 1
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            r3 = 0
            if (r2 == 0) goto L_0x0054
            r3 = 1
        L_0x0054:
            if (r15 != 0) goto L_0x0059
            r2 = 0
            if (r16 == 0) goto L_0x005a
        L_0x0059:
            r2 = 1
        L_0x005a:
            if (r9 != 0) goto L_0x008d
            if (r2 == 0) goto L_0x008c
            if (r3 == 0) goto L_0x0078
        L_0x0060:
            r14.append(r0)
            r0 = 72
            r14.append(r0)
        L_0x0068:
            if (r4 == 0) goto L_0x0072
            r14.append(r9)
            r0 = 77
            r14.append(r0)
        L_0x0072:
            if (r2 != 0) goto L_0x0078
            if (r3 != 0) goto L_0x0081
            if (r4 != 0) goto L_0x0081
        L_0x0078:
            java.lang.String r13 = "S"
            r17 = 9
            r18 = 1
            X.AnonymousClass30M.A08(r13, r14, r15, r16, r17, r18)
        L_0x0081:
            java.lang.String r0 = r14.toString()
            X.0qQ.A07(r0)
            r8.ASB(r0)
            return
        L_0x008c:
            r4 = 0
        L_0x008d:
            if (r3 == 0) goto L_0x0068
            goto L_0x0060
        L_0x0090:
            X.30J r6 = X.AnonymousClass30J.MINUTES
            long r6 = X.AnonymousClass30M.A06(r6, r2)
            r10 = 60
            long r6 = r6 % r10
            int r9 = (int) r6
            X.30J r6 = X.AnonymousClass30J.SECONDS
            long r6 = X.AnonymousClass30M.A06(r6, r2)
            long r6 = r6 % r10
            int r15 = (int) r6
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C360558em.serialize(kotlinx.serialization.encoding.Encoder, java.lang.Object):void");
    }
}
