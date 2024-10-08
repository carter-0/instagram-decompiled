package X;

/* renamed from: X.EeY  reason: case insensitive filesystem */
public abstract class C48439EeY {
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d4, code lost:
        if (r12 == null) goto L_0x0093;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C307896Rx r35, X.AnonymousClass6Tm r36) {
        /*
            r8 = 0
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            int r5 = r0.nextInt()
            r9 = r35
            X.C308206Td.A0B(r9)
            X.02m r4 = X.02m.A0p
            r3 = 537729057(0x200d1821, float:1.1951148E-19)
            r4.markerStart(r3, r5)
            java.lang.String r0 = "parse_parameters_start"
            r4.markerPoint(r3, r5, r0)
            X.6Rm r0 = r9.A03
            r14 = 0
            if (r0 == 0) goto L_0x0066
            r35 = 0
            r0 = r36
            X.4tV r12 = X.DbW.A0M(r0, r8)
            if (r12 != 0) goto L_0x0035
            java.lang.String r0 = "null_param_screenOptions"
        L_0x002d:
            r4.markerPoint(r3, r5, r0)
            r0 = 3
            r4.markerEnd(r3, r5, r0)
            return r14
        L_0x0035:
            java.lang.Object r2 = r0.A02()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.bloks.BloksParseResult"
            X.0qQ.A0C(r2, r0)
            X.68u r2 = (X.C3034368u) r2
            java.lang.String r1 = r12.A0H()
            if (r1 != 0) goto L_0x0049
            java.lang.String r0 = "null_param_screenId"
            goto L_0x002d
        L_0x0049:
            r11 = 40
            r7 = -1
            int r6 = r12.A03(r11, r7)
            if (r7 != r6) goto L_0x0055
            java.lang.String r0 = "invalid_param_ttiMarkerId"
            goto L_0x002d
        L_0x0055:
            X.4uI r10 = r12.A09()
            X.6Tm r0 = X.AnonymousClass6Tm.A01
            java.lang.Object r0 = X.C299275ur.A00(r9, r0, r10)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = "null_param_analyticsExtras"
            goto L_0x002d
        L_0x0066:
            java.lang.String r0 = "null_param_androidContext"
            goto L_0x002d
        L_0x0069:
            r10 = 36
            java.lang.Object r12 = X.C276544tV.A00(r12, r10)
            boolean r10 = r12 instanceof java.util.List
            if (r10 == 0) goto L_0x00d2
            java.util.List r12 = (java.util.List) r12
            r10 = 15932(0x3e3c, float:2.2325E-41)
            X.4tV r12 = X.C46611Dhr.A03(r12, r10)
            if (r12 == 0) goto L_0x00d3
            X.4uI r13 = r12.A0A(r11)
            if (r13 == 0) goto L_0x00d3
            r11 = 2
            X.Fol r10 = new X.Fol
            r10.<init>(r9, r13, r11)
        L_0x0089:
            r11 = 48
            boolean r11 = r12.A0R(r11, r8)
            if (r11 == 0) goto L_0x0093
            r35 = 1
        L_0x0093:
            java.lang.String r11 = "parse_parameters_end"
            r4.markerPoint(r3, r5, r11)
            java.util.ArrayList r23 = X.AnonymousClass7TE.A1C()
            r29 = -1
            X.DiQ r13 = new X.DiQ
            r15 = r14
            r16 = r14
            r17 = r14
            r18 = r14
            r19 = r14
            r20 = r14
            r21 = r14
            r22 = r14
            r24 = r0
            r25 = r14
            r26 = r14
            r27 = r7
            r28 = r6
            r31 = r29
            r33 = r8
            r34 = r8
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r33, r34)
            X.0lg r0 = X.DbU.A0V(r9)
            com.instagram.bloks.hosting.IgBloksScreenConfig r6 = X.DbS.A0N(r0)
            r6.A0S = r1
            java.lang.String r0 = "cds_push_invocation_start"
            r4.markerPoint(r3, r5, r0)
            goto L_0x00d7
        L_0x00d2:
            r12 = r14
        L_0x00d3:
            r10 = r14
            if (r12 == 0) goto L_0x0093
            goto L_0x0089
        L_0x00d7:
            androidx.fragment.app.FragmentActivity r7 = X.Dba.A08(r9)     // Catch:{ IllegalStateException -> 0x00fe }
            r34 = 32
            X.Dhz r30 = new X.Dhz     // Catch:{ IllegalStateException -> 0x00fe }
            r31 = r14
            r33 = r14
            r32 = r10
            r30.<init>(r31, r32, r33, r34, r35)     // Catch:{ IllegalStateException -> 0x00fe }
            X.8dD r10 = r6.A05()     // Catch:{ IllegalStateException -> 0x00fe }
            r8 = r13
            r9 = r2
            r11 = r30
            r12 = r1
            X.C49954FGj.A02(r7, r8, r9, r10, r11, r12)     // Catch:{ IllegalStateException -> 0x00fe }
            java.lang.String r0 = "cds_push_invocation_end"
            r4.markerPoint(r3, r5, r0)
            r0 = 2
            r4.markerEnd(r3, r5, r0)
            return r14
        L_0x00fe:
            java.lang.String r0 = "cds_push_exception_IllegalStateException"
            r4.markerPoint(r3, r5, r0)
            r0 = 3
            r4.markerEnd(r3, r5, r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48439EeY.A00(X.6Rx, X.6Tm):java.lang.Object");
    }
}
