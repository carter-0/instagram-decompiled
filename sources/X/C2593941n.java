package X;

/* renamed from: X.41n  reason: invalid class name and case insensitive filesystem */
public final class C2593941n implements 02o {
    public static final C2593941n A00 = new C2593941n();

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004f, code lost:
        if (r3 >= com.facebook.proxygen.LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r18, X.AnonymousClass4D7 r19) {
        /*
            r17 = this;
            r2 = r18
            X.1Jn r2 = (X.1Jn) r2
            boolean r0 = r2 instanceof X.1Jq
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = r2.A01
            X.AnonymousClass2Ua.A04 = r0
            long r0 = r2.A00
            X.AnonymousClass2Ua.A01 = r0
            r0 = 0
            X.AnonymousClass2Ua.A00 = r0
            r0 = 0
            X.AnonymousClass2Ua.A03 = r0
            X.AnonymousClass2Ua.A02 = r0
            X.02m r2 = X.AnonymousClass2Ua.A05
            r1 = 688602688(0x290b3e40, float:3.0918193E-14)
            r0 = 615(0x267, float:8.62E-43)
            r2.endAllInstancesOfMarker(r1, r0)
        L_0x0022:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0025:
            boolean r0 = r2 instanceof X.C252843pn
            if (r0 == 0) goto L_0x00ed
            X.2Ua r7 = X.AnonymousClass2Ua.A06
            X.3pn r2 = (X.C252843pn) r2
            long r0 = r2.A00
            long r5 = X.AnonymousClass2Ua.A01
            long r3 = r0 - r5
            X.3po r5 = X.AnonymousClass2Ua.A02
            if (r5 == 0) goto L_0x00e9
            long r8 = r5.A00
            long r5 = r0 - r8
            java.lang.Long r16 = java.lang.Long.valueOf(r5)
        L_0x003f:
            java.lang.String r8 = r2.A01
            java.lang.String r5 = X.AnonymousClass2Ua.A04
            boolean r5 = X.0qQ.A0K(r8, r5)
            r14 = 5000(0x1388, double:2.4703E-320)
            r10 = 0
            if (r5 == 0) goto L_0x0051
            int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            r13 = 1
            if (r5 < 0) goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            X.3po r9 = X.AnonymousClass2Ua.A02
            if (r9 == 0) goto L_0x00e4
            long r5 = r9.A00
            long r11 = r0 - r5
            int r5 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r5 >= 0) goto L_0x00e4
            java.lang.String r5 = r9.A01
            boolean r5 = X.0qQ.A0K(r8, r5)
            if (r5 == 0) goto L_0x00e4
            r6 = 1
            int r5 = X.AnonymousClass2Ua.A00
            int r11 = r5 + 1
            X.AnonymousClass2Ua.A00 = r11
        L_0x006d:
            if (r13 != 0) goto L_0x0071
            if (r6 == 0) goto L_0x00b1
        L_0x0071:
            java.lang.String r12 = X.AnonymousClass2Ua.A04
            X.08y r5 = X.09i.A0A
            X.0wW r6 = r5.A05(r7)
            if (r11 <= 0) goto L_0x00de
            r9 = 396375896(0x17a03758, float:1.0353728E-24)
            java.lang.Integer r7 = X.AnonymousClass05K.A0O
        L_0x0080:
            boolean r5 = r6 instanceof com.instagram.common.session.UserSession
            if (r5 == 0) goto L_0x00b1
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            X.1Zn r6 = X.1Zm.A00(r6)
            r5 = 1
            X.1Zp r10 = r6.A00(r7, r9, r10, r5)
            java.lang.String r9 = "current_module"
            r10.A03(r9, r12)
            java.lang.String r5 = "retry_count"
            r10.A01(r5, r11)
            java.lang.String r5 = "time_since_navigation"
            r10.A02(r5, r3)
            if (r16 == 0) goto L_0x00a9
            long r6 = r16.longValue()
            java.lang.String r5 = "time_since_last_ptr"
            r10.A02(r5, r6)
        L_0x00a9:
            java.lang.String r5 = "logview_group_by"
            r10.A03(r5, r9)
            r10.A00()
        L_0x00b1:
            int r5 = X.AnonymousClass2Ua.A00
            int r11 = (int) r0
            X.02m r9 = X.AnonymousClass2Ua.A05
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.MILLISECONDS
            r10 = 688602688(0x290b3e40, float:3.0918193E-14)
            r12 = r0
            r9.markerStart(r10, r11, r12, r14)
            java.lang.String r0 = "current_module"
            r9.markerAnnotate(r10, r11, r0, r8)
            java.lang.String r0 = "retry_count"
            r9.markerAnnotate(r10, r11, r0, r5)
            java.lang.String r12 = "time_since_navigation"
            r13 = r3
            r9.markerAnnotate(r10, r11, r12, r13)
            if (r16 == 0) goto L_0x00da
            long r13 = r16.longValue()
            java.lang.String r12 = "time_since_last_ptr"
            r9.markerAnnotate(r10, r11, r12, r13)
        L_0x00da:
            X.AnonymousClass2Ua.A03 = r2
            goto L_0x0022
        L_0x00de:
            r9 = 396370769(0x17a02351, float:1.0348673E-24)
            java.lang.Integer r7 = X.AnonymousClass05K.A0G
            goto L_0x0080
        L_0x00e4:
            r6 = 0
            X.AnonymousClass2Ua.A00 = r10
            r11 = 0
            goto L_0x006d
        L_0x00e9:
            r16 = 0
            goto L_0x003f
        L_0x00ed:
            boolean r0 = r2 instanceof X.C252853po
            if (r0 == 0) goto L_0x0022
            X.3po r2 = (X.C252853po) r2
            X.AnonymousClass2Ua.A02 = r2
            X.3pn r0 = X.AnonymousClass2Ua.A03
            if (r0 == 0) goto L_0x0022
            long r0 = r0.A00
            int r5 = (int) r0
            X.02m r3 = X.AnonymousClass2Ua.A05
            r4 = 688602688(0x290b3e40, float:3.0918193E-14)
            boolean r0 = r3.isMarkerOn(r4, r5)
            if (r0 == 0) goto L_0x0022
            r6 = 2
            long r7 = r2.A00
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            r3.markerEnd(r4, r5, r6, r7, r9)
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2593941n.emit(java.lang.Object, X.4D7):java.lang.Object");
    }
}
