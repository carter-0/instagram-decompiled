package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3fS  reason: invalid class name and case insensitive filesystem */
public final class C246923fS {
    public final UserSession A00;

    public C246923fS(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C246953fX A00(android.content.Context r13, X.1Xj r14) {
        /*
            r12 = this;
            r0 = 0
            X.0qQ.A0B(r14, r0)
            r0 = 1
            X.0qQ.A0B(r13, r0)
            boolean r0 = r14.CeS()
            r4 = 0
            if (r0 == 0) goto L_0x0072
            com.instagram.common.session.UserSession r2 = r12.A00
            java.lang.String r0 = X.AnonymousClass4WY.A02(r2, r14)
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x00c5
            boolean r0 = X.AnonymousClass4WY.A04(r0)
            if (r0 == 0) goto L_0x0072
            X.3fT r3 = X.C246933fT.VIDEO
            java.lang.String r0 = X.AnonymousClass4WY.A02(r2, r14)
            if (r0 == 0) goto L_0x00bf
            java.io.File r0 = X.AnonymousClass4WY.A01(r13, r2, r0)
            if (r0 == 0) goto L_0x00bf
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.C253833rU.A01(r0)
        L_0x0031:
            X.0eP r2 = new X.0eP
            r2.<init>(r3, r0)
        L_0x0036:
            java.lang.Object r5 = r2.A00
            X.3fT r5 = (X.C246933fT) r5
            java.lang.Object r4 = r2.A01
            com.instagram.common.typedurl.ImageUrl r4 = (com.instagram.common.typedurl.ImageUrl) r4
            java.lang.String r6 = r14.getId()
            if (r6 == 0) goto L_0x00b7
            java.lang.String r7 = r14.BTL()
            java.lang.String r8 = r14.A2a()
            boolean r9 = r14.A5Y()
            X.3eu r0 = r14.A1S()
            if (r0 == 0) goto L_0x0070
            boolean r10 = r0.A02
        L_0x0058:
            com.instagram.model.mediasize.ExtendedImageUrl r2 = r14.A1l()
            com.instagram.common.typedurl.ImageUrl r3 = r14.A1Q()
            X.1Xy r0 = r14.A0C
            X.1qt r1 = r0.BPu()
            boolean r11 = r14.A5G()
            X.3fX r0 = new X.3fX
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x0070:
            r10 = 0
            goto L_0x0058
        L_0x0072:
            boolean r0 = r14.A4o()
            if (r0 == 0) goto L_0x0089
            X.3fT r3 = X.C246933fT.LOCAL
            android.net.Uri r1 = r14.A05
            X.0qQ.A0A(r1)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = -1
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.C253833rU.A00(r1, r0, r0)
            goto L_0x0031
        L_0x0089:
            com.instagram.model.mediasize.ImageInfo r0 = r14.A1p()
            if (r0 == 0) goto L_0x00a7
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r14.A1n(r13)
            if (r1 != 0) goto L_0x00af
            X.0wj r3 = X.0wj.A01
            r2 = 817899586(0x30c02842, float:1.3981281E-9)
            java.lang.String r1 = "com.instagram.feed.ui.rows.image.FeedImageUseCase#getImageSource() Could not generate imageUrl for mediaId= "
            java.lang.String r0 = r14.getId()
            java.lang.String r0 = X.002.A0R(r1, r0)
            r3.AEf(r0, r2)
        L_0x00a7:
            X.3fT r3 = X.C246933fT.A03
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r4)
            goto L_0x0031
        L_0x00af:
            X.3fT r0 = X.C246933fT.REMOTE
            X.0eP r2 = new X.0eP
            r2.<init>(r0, r1)
            goto L_0x0036
        L_0x00b7:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00bf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00c5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C246923fS.A00(android.content.Context, X.1Xj):X.3fX");
    }
}
