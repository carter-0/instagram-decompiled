package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GBy  reason: case insensitive filesystem */
public final class C52026GBy implements C250603lj {
    public final UserSession A00;
    public final C52025GBx A01;

    public C52026GBy(UserSession userSession, C52025GBx gBx) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = gBx;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0060, code lost:
        if (((X.C52079GDz) r1).A00 != null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007c, code lost:
        if (r1 == com.instagram.api.schemas.InstagramMidcardType.A0F) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATF(X.AnonymousClass30Y r16, X.C252093oY r17) {
        /*
            r15 = this;
            r3 = 0
            r4 = r16
            r0 = r17
            boolean r2 = X.AnonymousClass7TF.A1U(r3, r4, r0)
            float r1 = r0.CFe(r4)
            java.lang.Integer r8 = r0.CEk(r4)
            X.0qQ.A07(r8)
            java.lang.Object r9 = r4.A03
            X.4bN r9 = (X.C267324bN) r9
            X.GBx r11 = r15.A01
            X.0qQ.A0A(r9)
            r0 = 2
            X.0qQ.A0B(r9, r0)
            boolean r0 = r11.A00
            if (r0 != 0) goto L_0x0099
            double r4 = (double) r1
            r6 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0099
            X.GBn r1 = r11.A04
            r0 = 0
            r1.A0O(r0)
            r14 = 1
            r11.A00 = r2
            X.GBj r7 = r11.A05
            int r6 = r7.A07()
            android.view.View r5 = r7.A0A(r6)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r1 = 0
            if (r5 == 0) goto L_0x00ec
            java.lang.Object r0 = r5.getTag()
        L_0x004d:
            boolean r0 = r0 instanceof X.C52079GDz
            if (r0 == 0) goto L_0x00e0
            if (r5 == 0) goto L_0x0057
            java.lang.Object r1 = r5.getTag()
        L_0x0057:
            java.lang.String r0 = "null cannot be cast to non-null type instagram.features.clips.viewer.ui.common.ClipsMultipleMediaViewHolder"
            X.0qQ.A0C(r1, r0)
            X.GDz r1 = (X.C52079GDz) r1
            com.instagram.api.schemas.InstagramMidcardType r0 = r1.A00
            if (r0 == 0) goto L_0x00e0
        L_0x0062:
            int r12 = r4.intValue()
            if (r5 == 0) goto L_0x00de
            java.lang.Object r10 = r5.getTag()
        L_0x006c:
            java.lang.String r0 = "null cannot be cast to non-null type instagram.features.clips.viewer.ui.common.ClipsMultipleMediaViewHolder"
            X.0qQ.A0C(r10, r0)
            X.GDz r10 = (X.C52079GDz) r10
            com.instagram.api.schemas.InstagramMidcardType r1 = r10.A00
            com.instagram.api.schemas.InstagramMidcardType r0 = com.instagram.api.schemas.InstagramMidcardType.A0a
            if (r1 == r0) goto L_0x007e
            com.instagram.api.schemas.InstagramMidcardType r0 = com.instagram.api.schemas.InstagramMidcardType.A0F
            r4 = 0
            if (r1 != r0) goto L_0x007f
        L_0x007e:
            r4 = 1
        L_0x007f:
            X.GmI r0 = r9.A01()
            com.instagram.api.schemas.InstagramMidcardType r0 = r0.A05
            com.instagram.api.schemas.InstagramMidcardType r1 = com.instagram.api.schemas.InstagramMidcardType.A0C
            boolean r0 = X.AnonymousClass7TF.A1W(r0, r1)
            if (r4 != 0) goto L_0x00cc
            if (r0 != 0) goto L_0x00cc
            java.util.List r0 = r10.A0C
            int r13 = r0.size()
            r14 = 0
        L_0x0096:
            X.C52025GBx.A00(r9, r10, r11, r12, r13, r14)
        L_0x0099:
            int r0 = r8.intValue()
            if (r0 == r3) goto L_0x00c0
            if (r0 == r2) goto L_0x00c1
            r11.A00 = r3
            X.GmI r0 = r9.A01()
            com.instagram.api.schemas.InstagramMidcardType r1 = r0.A05
            com.instagram.api.schemas.InstagramMidcardType r0 = com.instagram.api.schemas.InstagramMidcardType.A0a
            if (r1 == r0) goto L_0x00b5
            com.instagram.api.schemas.InstagramMidcardType r0 = com.instagram.api.schemas.InstagramMidcardType.A0F
            if (r1 == r0) goto L_0x00b5
            com.instagram.api.schemas.InstagramMidcardType r0 = com.instagram.api.schemas.InstagramMidcardType.A0C
            if (r1 != r0) goto L_0x00ef
        L_0x00b5:
            boolean r0 = X.C52025GBx.A01(r9)
            if (r0 != 0) goto L_0x00ef
            instagram.features.clips.viewer.video.ClipsMidcardVirtualVideoPlayerController r0 = r11.A03
            r0.A00()
        L_0x00c0:
            return
        L_0x00c1:
            X.GBn r1 = r11.A04
            java.lang.String r0 = r1.A03
            if (r0 == 0) goto L_0x00c0
            r0 = 0
            r1.A0O(r0)
            return
        L_0x00cc:
            X.GmI r0 = r9.A01()
            com.instagram.api.schemas.InstagramMidcardType r0 = r0.A05
            if (r0 != r1) goto L_0x00db
            java.util.List r0 = r10.A0D
            int r13 = r0.size()
            goto L_0x0096
        L_0x00db:
            r13 = r2
            r14 = r2
            goto L_0x0096
        L_0x00de:
            r10 = 0
            goto L_0x006c
        L_0x00e0:
            int r0 = r6 + 1
            android.view.View r5 = r7.A0A(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            goto L_0x0062
        L_0x00ec:
            r0 = r1
            goto L_0x004d
        L_0x00ef:
            boolean r0 = X.C52025GBx.A01(r9)
            if (r0 == 0) goto L_0x00fb
            X.GDR r0 = r11.A01
            r0.ECW()
            return
        L_0x00fb:
            X.GBt r0 = r11.A02
            r0.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52026GBy.ATF(X.30Y, X.3oY):void");
    }
}
