package X;

/* renamed from: X.EeX  reason: case insensitive filesystem */
public abstract class C48438EeX {
    /* JADX WARNING: type inference failed for: r24v1, types: [X.FAj, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cf, code lost:
        if (r14.A0R(48, false) == false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d1, code lost:
        r31 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d3, code lost:
        r21 = null;
        r30 = false;
        r25 = X.AnonymousClass7TE.A1C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e6, code lost:
        if (X.1AW.A06(X.0Tu.A05, 18303484168443520L) != false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e8, code lost:
        r21 = r16;
        r30 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ec, code lost:
        r18 = new X.C46645DiQ((android.util.SparseArray) null, (java.lang.Object) null, r21, (java.lang.String) null, (java.lang.String) null, (java.util.HashMap) null, r25, r0, (java.util.Map) null, (java.util.Map) null, r17, r30);
        r13 = r4.A0R(50, false);
        r4 = X.DbS.A0N(X.DbU.A0V(r9));
        r4.A0S = r2;
        r4.A07 = r3;
        r4.A0C = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0115, code lost:
        if (r13 == false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0117, code lost:
        r4.A0P = X.AnonymousClass05K.A0Y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011b, code lost:
        r6.markerPoint(537738084, r7, "cds_push_invocation_start");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0123, code lost:
        if (r14 == null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r24 = new java.lang.Object();
        new java.util.LinkedHashMap();
        r24.A01(r12, r18, r4, (X.C276544tV) null, r10, 0, r31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x013d, code lost:
        r6.markerPoint(537738084, r7, "cds_push_invocation_end");
        r6.markerEnd(537738084, r7, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0145, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0146, code lost:
        r6.markerPoint(537738084, r7, "cds_push_exception_IllegalStateException");
        r6.markerEnd(537738084, r7, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x014f, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C307896Rx r30, X.AnonymousClass6Tm r31) {
        /*
            r8 = 0
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            int r7 = r0.nextInt()
            r9 = r30
            X.C308206Td.A0B(r9)
            X.02m r6 = X.02m.A0p
            r5 = 537738084(0x200d3b64, float:1.1962815E-19)
            r6.markerStart(r5, r7)
            java.lang.String r0 = "parse_parameters_start"
            r6.markerPoint(r5, r7, r0)
            X.6Rm r13 = r9.A03
            r19 = 0
            if (r13 == 0) goto L_0x00a4
            android.content.Context r12 = r13.A00
            r0 = r31
            java.util.List r1 = r0.A00
            java.lang.Object r4 = r1.get(r8)
            X.4tV r4 = (X.C276544tV) r4
            if (r4 != 0) goto L_0x003a
            java.lang.String r0 = "null_param_openSyncScreenOptions"
        L_0x0032:
            r6.markerPoint(r5, r7, r0)
            r0 = 3
            r6.markerEnd(r5, r7, r0)
            return r19
        L_0x003a:
            java.lang.Object r3 = r0.A02()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.bloks.BloksParseResult"
            X.0qQ.A0C(r3, r0)
            X.68u r3 = (X.C3034368u) r3
            r11 = 2
            java.lang.Object r1 = r1.get(r11)
            X.4tV r1 = (X.C276544tV) r1
            if (r1 != 0) goto L_0x0051
            java.lang.String r0 = "null_param_openScreenOptions"
            goto L_0x0032
        L_0x0051:
            java.lang.String r2 = r4.A0H()
            if (r2 != 0) goto L_0x005a
            java.lang.String r0 = "null_param_screenId"
            goto L_0x0032
        L_0x005a:
            r10 = 40
            r14 = -1
            int r17 = r4.A03(r10, r14)
            r0 = r17
            if (r14 != r0) goto L_0x0068
            java.lang.String r0 = "invalid_param_ttiMarkerId"
            goto L_0x0032
        L_0x0068:
            r0 = 41
            boolean r0 = r4.A0R(r0, r8)
            X.DfZ r1 = X.C46628Di8.A05(r13, r1)
            if (r0 == 0) goto L_0x0085
            boolean r0 = r12 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0085
            r0 = 1
            X.Foi r13 = new X.Foi
            r13.<init>((android.content.Context) r12, (int) r0)
            com.meta.foa.cds.CdsOpenScreenCallerDismissCallback r0 = new com.meta.foa.cds.CdsOpenScreenCallerDismissCallback
            r0.<init>(r13)
            r1.A00 = r0
        L_0x0085:
            X.4uI r13 = r4.A09()
            X.6Tm r0 = X.AnonymousClass6Tm.A01
            java.lang.Object r0 = X.C299275ur.A00(r9, r0, r13)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x0096
            java.lang.String r0 = "null_param_analyticsExtras"
            goto L_0x0032
        L_0x0096:
            java.lang.String r13 = "parse_parameters_end"
            r6.markerPoint(r5, r7, r13)
            java.lang.String r16 = r4.A0J()
            if (r16 != 0) goto L_0x00a7
            java.lang.String r0 = "null_param_appId"
            goto L_0x0032
        L_0x00a4:
            java.lang.String r0 = "null_param_androidContext"
            goto L_0x0032
        L_0x00a7:
            r13 = 36
            java.lang.Object r14 = X.C276544tV.A00(r4, r13)
            boolean r13 = r14 instanceof java.util.List
            if (r13 == 0) goto L_0x0121
            java.util.List r14 = (java.util.List) r14
            r13 = 15932(0x3e3c, float:2.2325E-41)
            X.4tV r14 = X.C46611Dhr.A03(r14, r13)
            if (r14 == 0) goto L_0x0122
            X.4uI r13 = r14.A0A(r10)
            if (r13 == 0) goto L_0x0122
            r15 = 1
            X.Fol r10 = new X.Fol
            r10.<init>(r9, r13, r15)
        L_0x00c7:
            r13 = 48
            boolean r13 = r14.A0R(r13, r8)
            r31 = 1
            if (r13 != 0) goto L_0x00d3
        L_0x00d1:
            r31 = 0
        L_0x00d3:
            r21 = 0
            r30 = 0
            java.util.ArrayList r25 = X.AnonymousClass7TE.A1C()
            X.0Tu r15 = X.0Tu.A05
            r13 = 18303484168443520(0x4106ec00031680, double:1.89432092104438E-307)
            boolean r13 = X.1AW.A06(r15, r13)
            if (r13 != 0) goto L_0x00ec
            r21 = r16
            r30 = 1
        L_0x00ec:
            X.DiQ r18 = new X.DiQ
            r20 = r19
            r22 = r19
            r23 = r19
            r24 = r19
            r26 = r0
            r27 = r19
            r28 = r19
            r29 = r17
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r0 = 50
            boolean r13 = r4.A0R(r0, r8)
            X.0lg r0 = X.DbU.A0V(r9)
            com.instagram.bloks.hosting.IgBloksScreenConfig r4 = X.DbS.A0N(r0)
            r4.A0S = r2
            r4.A07 = r3
            r4.A0C = r1
            if (r13 == 0) goto L_0x011b
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            r4.A0P = r0
        L_0x011b:
            java.lang.String r0 = "cds_push_invocation_start"
            r6.markerPoint(r5, r7, r0)
            goto L_0x0126
        L_0x0121:
            r14 = 0
        L_0x0122:
            r10 = 0
            if (r14 == 0) goto L_0x00d1
            goto L_0x00c7
        L_0x0126:
            X.FAj r24 = new X.FAj     // Catch:{ IllegalStateException -> 0x0146 }
            r24.<init>()     // Catch:{ IllegalStateException -> 0x0146 }
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ IllegalStateException -> 0x0146 }
            r0.<init>()     // Catch:{ IllegalStateException -> 0x0146 }
            r25 = r12
            r26 = r18
            r27 = r4
            r29 = r10
            r30 = r8
            r24.A01(r25, r26, r27, r28, r29, r30, r31)     // Catch:{ IllegalStateException -> 0x0146 }
            java.lang.String r0 = "cds_push_invocation_end"
            r6.markerPoint(r5, r7, r0)
            r6.markerEnd(r5, r7, r11)
            return r19
        L_0x0146:
            java.lang.String r0 = "cds_push_exception_IllegalStateException"
            r6.markerPoint(r5, r7, r0)
            r0 = 3
            r6.markerEnd(r5, r7, r0)
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48438EeX.A00(X.6Rx, X.6Tm):java.lang.Object");
    }
}
