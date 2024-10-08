package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.OSl  reason: case insensitive filesystem */
public final class C70938OSl {
    public final UserSession A00;

    public C70938OSl(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C74551Pwk r13, X.1OS r14, X.C70938OSl r15, com.instagram.model.direct.DirectThreadKey r16, java.lang.String r17, boolean r18) {
        /*
            com.instagram.common.session.UserSession r4 = r15.A00
            X.Ma7 r6 = X.C70175NyT.A00(r4)
            r11 = 0
            r12 = 1
            com.instagram.direct.armadilloexpress.transportpayload.ContentView r0 = com.instagram.direct.armadilloexpress.transportpayload.ContentView.DEFAULT_INSTANCE
            X.R4O r5 = r0.A0I()
            X.0qQ.A07(r5)
            r9 = r14
            boolean r0 = r14 instanceof X.C65751gX
            if (r0 == 0) goto L_0x00aa
            X.R5b r1 = X.C66580MXl.A0L(r5)
            com.instagram.direct.armadilloexpress.transportpayload.ContentView r1 = (com.instagram.direct.armadilloexpress.transportpayload.ContentView) r1
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.seen_ = r12
            r3 = r9
            X.1gX r3 = (X.C65751gX) r3
            java.lang.String r2 = r3.A01
            if (r2 == 0) goto L_0x0039
            X.R5b r1 = X.C66580MXl.A0L(r5)
            com.instagram.direct.armadilloexpress.transportpayload.ContentView r1 = (com.instagram.direct.armadilloexpress.transportpayload.ContentView) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.mimetype_ = r2
        L_0x0039:
            java.lang.String r2 = r3.A02
        L_0x003b:
            if (r2 == 0) goto L_0x004b
            X.R5b r1 = X.C66580MXl.A0L(r5)
            com.instagram.direct.armadilloexpress.transportpayload.ContentView r1 = (com.instagram.direct.armadilloexpress.transportpayload.ContentView) r1
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.objectId_ = r2
        L_0x004b:
            com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload r0 = com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload.DEFAULT_INSTANCE
            X.R4O r2 = r0.A0I()
            X.NFu r2 = (X.C68413NFu) r2
            com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent r0 = com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent.DEFAULT_INSTANCE
            X.R4O r3 = r0.A0I()
            X.NFf r3 = (X.C68398NFf) r3
            X.R5b r1 = X.C66580MXl.A0L(r3)
            com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent r1 = (com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent) r1
            X.R5b r0 = r5.A02()
            r0.getClass()
            r1.supplementMessageContent_ = r0
            r0 = 2
            r1.supplementMessageContentCase_ = r0
            r2.A06(r3)
            java.lang.String r0 = r4.A06
            com.instagram.user.model.User r0 = X.DbV.A0j(r4, r0)
            if (r0 == 0) goto L_0x0085
            java.lang.Long r0 = r0.BST()
            if (r0 == 0) goto L_0x0085
            java.lang.String r0 = X.C66581MXm.A0x(r0)
            r2.A09(r0)
        L_0x0085:
            r0 = r17
            if (r17 == 0) goto L_0x008c
            r2.A07(r0)
        L_0x008c:
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r0 = com.instagram.direct.armadilloexpress.transportpayload.TransportPayload.DEFAULT_INSTANCE
            X.R4O r0 = r0.A0I()
            X.NFs r0 = (X.C68411NFs) r0
            r0.A07(r2)
            if (r18 == 0) goto L_0x009c
            r0.A08(r12)
        L_0x009c:
            X.R5b r7 = X.C66580MXl.A0M(r0)
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r7 = (com.instagram.direct.armadilloexpress.transportpayload.TransportPayload) r7
            r8 = r13
            r10 = r16
            r13 = r11
            r6.A03(r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x00aa:
            boolean r0 = r14 instanceof X.C66061iy
            if (r0 == 0) goto L_0x00bd
            X.R5b r1 = X.C66580MXl.A0L(r5)
            com.instagram.direct.armadilloexpress.transportpayload.ContentView r1 = (com.instagram.direct.armadilloexpress.transportpayload.ContentView) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.screenshotted_ = r12
            goto L_0x004b
        L_0x00bd:
            boolean r0 = r14 instanceof X.AnonymousClass1mR
            if (r0 == 0) goto L_0x004b
            X.R5b r1 = X.C66580MXl.A0L(r5)
            com.instagram.direct.armadilloexpress.transportpayload.ContentView r1 = (com.instagram.direct.armadilloexpress.transportpayload.ContentView) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.replayed_ = r12
            r3 = r9
            X.1mR r3 = (X.AnonymousClass1mR) r3
            java.lang.String r2 = r3.A02
            if (r2 == 0) goto L_0x00e4
            X.R5b r1 = X.C66580MXl.A0L(r5)
            com.instagram.direct.armadilloexpress.transportpayload.ContentView r1 = (com.instagram.direct.armadilloexpress.transportpayload.ContentView) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.mimetype_ = r2
        L_0x00e4:
            java.lang.String r2 = r3.A03
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70938OSl.A00(X.Pwk, X.1OS, X.OSl, com.instagram.model.direct.DirectThreadKey, java.lang.String, boolean):void");
    }
}
