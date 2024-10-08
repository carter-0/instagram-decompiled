package X;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6RD  reason: invalid class name */
public final class AnonymousClass6RD {
    public final C307616Qu A00;
    public final C307556Qo A01;
    public final AnonymousClass6RA A02;
    public final Map A03 = new LinkedHashMap();
    public final Set A04 = new LinkedHashSet();
    public final C307636Qw A05;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0041, code lost:
        if (r2.A00.A00.get(r10) == null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        r0 = "in_app";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        r7 = new X.Q3E(r0);
        r11 = r24;
        r5 = new X.Q3F(r6, r7, r8, r9, r10, r11, r25, r26, r14);
        r7.A00("request_start", r6.A01.currentMonotonicTimestamp());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0060, code lost:
        if (r4 != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0062, code lost:
        if (r14 == false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        if (X.0tS.A4E.A00().A0f() != false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0072, code lost:
        if (r4 == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0074, code lost:
        r7.A01("query_src", "cdn");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0079, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007b, code lost:
        r14 = r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007d, code lost:
        r1 = r8.A02;
        r0 = r8.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0081, code lost:
        r14.AUw(r15, r5, r1, r0, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008d, code lost:
        r7.A01("query_src", "prebundled");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0092, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0094, code lost:
        r14 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0097, code lost:
        r7.A01("query_src", "www");
        r0 = X.0Yt.A03(r8.A03);
        r14 = r6.A05;
        r1 = r8.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a9, code lost:
        r14 = false;
        r0 = "network";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0033, code lost:
        if (r2.A00.A00(r10) == null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        if (r2 != null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        r14 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.Q39 r21, java.lang.String r22, java.lang.String r23, java.util.concurrent.Executor r24, X.0sP r25, boolean r26) {
        /*
            r20 = this;
            r6 = r20
            java.util.Map r2 = r6.A03
            r9 = r22
            java.lang.Object r1 = r2.get(r9)
            java.util.Set r1 = (java.util.Set) r1
            r8 = r21
            if (r1 == 0) goto L_0x001a
            X.Q3K r0 = r8.A01
            java.util.LinkedHashSet r0 = X.094.A01(r0, r1)
            r2.put(r9, r0)
        L_0x0019:
            return
        L_0x001a:
            X.Q3K r15 = r8.A01
            java.util.Set r0 = java.util.Collections.singleton(r15)
            X.0qQ.A07(r0)
            r2.put(r9, r0)
            X.6Qu r2 = r6.A00
            r10 = r23
            if (r2 == 0) goto L_0x0035
            X.6Qq r0 = r2.A00
            X.6Qr r0 = r0.A00(r10)
            r4 = 1
            if (r0 != 0) goto L_0x0038
        L_0x0035:
            r4 = 0
            if (r2 == 0) goto L_0x00a9
        L_0x0038:
            X.6Qq r0 = r2.A00
            java.util.Map r0 = r0.A00
            java.lang.Object r0 = r0.get(r10)
            r14 = 1
            if (r0 == 0) goto L_0x00a9
            java.lang.String r0 = "in_app"
        L_0x0045:
            X.Q3E r7 = new X.Q3E
            r7.<init>(r0)
            X.Q3F r5 = new X.Q3F
            r11 = r24
            r12 = r25
            r13 = r26
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.6Qo r0 = r6.A01
            long r0 = r0.currentMonotonicTimestamp()
            java.lang.String r3 = "request_start"
            r7.A00(r3, r0)
            if (r4 != 0) goto L_0x0064
            if (r14 == 0) goto L_0x0097
        L_0x0064:
            X.0xi r0 = X.0tS.A4E
            X.0tS r0 = r0.A00()
            boolean r0 = r0.A0f()
            if (r0 != 0) goto L_0x0097
            java.lang.String r1 = "query_src"
            if (r4 == 0) goto L_0x008d
            java.lang.String r0 = "cdn"
            r7.A01(r1, r0)
            if (r2 == 0) goto L_0x0019
            X.6Qw r14 = r2.A02
        L_0x007d:
            java.lang.String r1 = r8.A02
            java.util.Map r0 = r8.A03
        L_0x0081:
            r16 = r5
            r17 = r1
            r18 = r0
            r19 = r11
            r14.AUw(r15, r16, r17, r18, r19)
            return
        L_0x008d:
            java.lang.String r0 = "prebundled"
            r7.A01(r1, r0)
            if (r2 == 0) goto L_0x0019
            X.6Qw r14 = r2.A01
            goto L_0x007d
        L_0x0097:
            java.lang.String r1 = "query_src"
            java.lang.String r0 = "www"
            r7.A01(r1, r0)
            java.util.Map r0 = r8.A03
            java.util.LinkedHashMap r0 = X.0Yt.A03(r0)
            X.6Qw r14 = r6.A05
            java.lang.String r1 = r8.A02
            goto L_0x0081
        L_0x00a9:
            r14 = 0
            java.lang.String r0 = "network"
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6RD.A00(X.Q39, java.lang.String, java.lang.String, java.util.concurrent.Executor, X.0sP, boolean):void");
    }

    public AnonymousClass6RD(C307616Qu r2, C307556Qo r3, C307636Qw r4, AnonymousClass6RA r5) {
        this.A05 = r4;
        this.A01 = r3;
        this.A02 = r5;
        this.A00 = r2;
    }
}
