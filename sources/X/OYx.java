package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

public final class OYx {
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r2.A0M() != true) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a5, code lost:
        if (r2.A0M() != true) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(com.instagram.common.session.UserSession r23, X.1OS r24, java.lang.String r25) {
        /*
            r22 = this;
            r6 = 0
            r4 = r23
            r0 = r24
            boolean r3 = A01(r4, r0)
            java.lang.String r1 = r0.A05
            com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger r5 = X.C66581MXm.A0k(r4, r1)
            com.instagram.model.direct.DirectThreadKey r2 = r0.A01()
            if (r2 == 0) goto L_0x00ec
            r10 = r25
            if (r3 != 0) goto L_0x006e
            if (r5 == 0) goto L_0x0068
            java.lang.String r12 = r2.A00
            java.lang.String r1 = r0.A05
            int r9 = r1.hashCode()
            if (r25 == 0) goto L_0x002b
            r5.onLogFlowConnectId()
            r5.onLogArmadilloTlcControlOpenThread()
        L_0x002b:
            X.3U9 r2 = X.C66582MXn.A0a(r4, r2)
            if (r2 == 0) goto L_0x006c
            X.ODs r1 = r2.B25()
            if (r1 == 0) goto L_0x006c
            boolean r13 = X.C70054NwW.A00(r1)
        L_0x003b:
            X.MaY r1 = r0.A02
            boolean r14 = r1.A07
            r7 = 1
            if (r2 == 0) goto L_0x0069
            boolean r1 = r2.CUG()
            if (r1 != r7) goto L_0x0069
            java.lang.String r15 = "group"
        L_0x004a:
            java.lang.String r8 = r0.A05
            if (r2 == 0) goto L_0x0056
            boolean r1 = r2.A0M()
            r18 = 1
            if (r1 == r7) goto L_0x0058
        L_0x0056:
            r18 = 0
        L_0x0058:
            java.lang.Integer r19 = X.C70173NyR.A00(r0)
            r20 = 0
            java.lang.String r16 = "ig_django"
            r11 = r7
            r17 = r6
            r21 = r20
            r5.logTraceAnnotations(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x0068:
            return
        L_0x0069:
            java.lang.String r15 = "one_to_one"
            goto L_0x004a
        L_0x006c:
            r13 = 0
            goto L_0x003b
        L_0x006e:
            if (r5 == 0) goto L_0x0068
            java.lang.String r1 = r0.A05
            int r9 = r1.hashCode()
            X.3U9 r2 = X.C66582MXn.A0a(r4, r2)
            r6 = 1
            if (r2 == 0) goto L_0x00e9
            boolean r1 = r2.CUG()
            if (r1 != r6) goto L_0x00e9
            java.lang.String r15 = "group"
        L_0x0085:
            if (r2 == 0) goto L_0x00e7
            X.ODs r1 = r2.B25()
            if (r1 == 0) goto L_0x00e7
            boolean r13 = X.C70054NwW.A00(r1)
        L_0x0091:
            X.MaY r1 = r0.A02
            boolean r14 = r1.A07
            java.lang.String r8 = r0.A05
            r20 = 0
            if (r2 == 0) goto L_0x00e4
            java.lang.String r12 = r2.C6C()
            boolean r1 = r2.A0M()
            r18 = 1
            if (r1 == r6) goto L_0x00a9
        L_0x00a7:
            r18 = 0
        L_0x00a9:
            java.lang.Integer r19 = X.C70173NyR.A00(r0)
            java.lang.String r16 = "ig_advanced_crypto_transport"
            r7 = 13
            r11 = r6
            r17 = r6
            r21 = r20
            r5.logTraceAnnotations(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.String r1 = r0.A05
            com.facebook.msys.mci.PlatformLogger.platformEventStructuredLoggerInstamadilloStartS2SEvent(r1)
            java.lang.String r1 = r0.A05
            com.facebook.msys.mci.PlatformLogger.platformEventStructuredLoggerInsertArmadilloTlcControlOpenThread(r1)
            java.lang.String r1 = r0.A05
            if (r2 == 0) goto L_0x00cb
            java.lang.String r20 = r2.C6C()
        L_0x00cb:
            r2 = r6
            r3 = r1
            r4 = r16
            r5 = r20
            r6 = r10
            r7 = r15
            com.facebook.msys.mci.PlatformLogger.platformEventStructuredLoggerInstamadilloStartTraceWithAnnotations(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r2 = r0.A05
            int r1 = X.C395289zW.A00(r0)
            java.lang.String r0 = r0.A02()
            com.facebook.msys.mci.PlatformLogger.platformEventStructuredLoggerInstamadilloAddMutationTypeAnnotationsWithAliasId(r2, r1, r0)
            return
        L_0x00e4:
            r12 = r20
            goto L_0x00a7
        L_0x00e7:
            r13 = 0
            goto L_0x0091
        L_0x00e9:
            java.lang.String r15 = "one_to_one"
            goto L_0x0085
        L_0x00ec:
            java.lang.String r4 = r0.A02()
            com.facebook.quicklog.QuickPerformanceLogger r3 = com.facebook.quicklog.QuickPerformanceLoggerProvider.getQPLInstance()
            java.lang.String r2 = "null_thread_key"
            r1 = 936446320(0x37d10970, float:2.4919136E-5)
            if (r3 == 0) goto L_0x0068
            com.facebook.quicklog.EventBuilder r0 = r3.markEventBuilder(r1, r2)
            if (r0 == 0) goto L_0x0068
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x0068
            com.facebook.quicklog.EventBuilder r1 = r3.markEventBuilder(r1, r2)
            if (r1 == 0) goto L_0x0068
            java.lang.String r0 = "mutationType"
            com.facebook.quicklog.EventBuilder r0 = r1.annotate(r0, r4)
            if (r0 == 0) goto L_0x0068
            r0.report()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OYx.A02(com.instagram.common.session.UserSession, X.1OS, java.lang.String):void");
    }

    public static final void A00(UserSession userSession, int i, boolean z, boolean z2) {
        long j;
        C69242Nhw A01;
        0Tu r2 = 0Tu.A05;
        if (z) {
            j = 36602119318999595L;
        } else {
            j = 36602119319327280L;
        }
        long A012 = 182.A01(r2, userSession, j);
        0qQ.A0A(Long.valueOf(A012));
        if (A012 > 0 && 2SP.A01.A08(A012) == 0) {
            O58.A00 = userSession;
            if (AnonymousClass7G0.A00(userSession, i) == null && (A01 = AnonymousClass7G0.A01(userSession, AnonymousClass05K.A00, i, z, z2)) != null) {
                A01.onStartFlow();
            }
        }
    }

    public static final boolean A01(UserSession userSession, 1OS r2) {
        DirectThreadKey A01 = r2.A01();
        if (A01 != null) {
            return AnonymousClass796.A00(userSession, r2, A01).A00();
        }
        return false;
    }
}
