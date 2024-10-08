package com.instagram.urlhandlers.messagingadinspiration;

import X.0qQ;
import X.AnonymousClass19S;
import X.AnonymousClass1HX;
import X.AnonymousClass2Q9;
import X.AnonymousClass4D7;
import X.C262224Cq;
import X.JTO;
import X.MG5;
import com.instagram.common.session.UserSession;

public final class MessagingAdInspirationDataFetcher {
    public final UserSession A00;
    public final AnonymousClass2Q9 A01;
    public final C262224Cq A02;

    public MessagingAdInspirationDataFetcher(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        AnonymousClass19S A012 = AnonymousClass1HX.A01(1866985000, 3);
        this.A02 = A012;
        this.A01 = JTO.A1E(new MG5(this, (AnonymousClass4D7) null, 47), A012);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDu, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ae, code lost:
        if (r4 == r1) goto L_0x00b0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.common.session.UserSession r16, com.instagram.urlhandlers.messagingadinspiration.MessagingAdInspirationDataFetcher r17, X.AnonymousClass4D7 r18) {
        /*
            r4 = 7
            r5 = r18
            boolean r0 = X.C66142MDu.A02(r4, r5)
            if (r0 == 0) goto L_0x00b1
            r3 = r5
            X.MDu r3 = (X.C66142MDu) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b1
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0017:
            java.lang.Object r4 = r3.A01
            X.1Hj r1 = X.1Hj.A02
            int r0 = r3.A00
            r2 = 1
            if (r0 == 0) goto L_0x0076
            if (r0 != r2) goto L_0x00b9
            X.0eS.A00(r4)
        L_0x0025:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            r1 = 0
            if (r0 == 0) goto L_0x00b0
            X.3lr r4 = X.C41846B3n.A0R(r4)
            if (r4 == 0) goto L_0x00b0
            java.lang.Class<X.Bl9> r3 = X.Bl9.class
            r5 = 0
            r0 = 1944(0x798, float:2.724E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            r0 = 607367896(0x2433b2d8, float:3.8965924E-17)
            X.3lr r4 = r4.getOptionalTreeField(r5, r2, r3, r0)
            if (r4 == 0) goto L_0x00b0
            java.lang.Class<X.Bl8> r3 = X.Bl8.class
            r0 = 811(0x32b, float:1.136E-42)
            java.lang.String r2 = X.C273654mx.A00(r0)
            r0 = -438911180(0xffffffffe5d6bf34, float:-1.2676419E23)
            com.google.common.collect.ImmutableList r0 = r4.getRequiredCompactedTreeListField(r5, r2, r3, r0)
            if (r0 == 0) goto L_0x00b0
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r0.iterator()
        L_0x005d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00b0
            X.3lr r3 = X.C41845B3m.A0V(r4)
            java.lang.Class<X.BlO> r2 = X.BlO.class
            r0 = 567749638(0x21d72c06, float:1.458062E-18)
            X.3lr r0 = r3.reinterpretRequired(r5, r2, r0)
            if (r0 == 0) goto L_0x005d
            r1.add(r0)
            goto L_0x005d
        L_0x0076:
            X.0eS.A00(r4)
            r11 = 0
            X.2IS r4 = X.C41845B3m.A04()
            X.2IS r0 = X.C41845B3m.A04()
            X.1vR r5 = X.C41845B3m.A05()
            java.util.Map r7 = r4.getParamsCopy()
            java.util.Map r8 = r0.getParamsCopy()
            java.lang.Class<X.BlA> r9 = X.BlA.class
            java.util.ArrayList r15 = X.AnonymousClass7TE.A1C()
            java.lang.String r6 = "IGMessagingAdInspirationQuery"
            r10 = 0
            r0 = 1944(0x798, float:2.724E-42)
            java.lang.String r14 = X.AnonymousClass000.A00(r0)
            com.facebook.pando.PandoGraphQLRequest r4 = new com.facebook.pando.PandoGraphQLRequest
            r12 = r10
            r13 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.1vn r0 = X.1vm.A01(r16)
            r3.A00 = r2
            java.lang.Object r4 = r0.A04(r4, r3)
            if (r4 != r1) goto L_0x0025
        L_0x00b0:
            return r1
        L_0x00b1:
            r0 = r17
            X.MDu r3 = X.C66142MDu.A00(r0, r5, r4)
            goto L_0x0017
        L_0x00b9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.messagingadinspiration.MessagingAdInspirationDataFetcher.A00(com.instagram.common.session.UserSession, com.instagram.urlhandlers.messagingadinspiration.MessagingAdInspirationDataFetcher, X.4D7):java.lang.Object");
    }
}
