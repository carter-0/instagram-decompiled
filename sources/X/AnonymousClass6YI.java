package X;

/* renamed from: X.6YI  reason: invalid class name */
public abstract class AnonymousClass6YI {
    /* JADX WARNING: type inference failed for: r15v1, types: [X.1Xy, X.1Xx, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005b, code lost:
        if ("upcoming_event_card".equals(r2.A1g) == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0096, code lost:
        if (r0 != null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (X.C297785sK.A0F(r8, r7) == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012a, code lost:
        if (r0 != null) goto L_0x0098;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.instagram.common.session.UserSession r20, X.C255773uh r21, X.C316886mN r22, X.C317626nZ r23, boolean r24) {
        /*
            r0 = 0
            r6 = r22
            X.0qQ.A0B(r6, r0)
            r5 = 1
            r7 = r21
            boolean r0 = r7.CcK()
            r8 = r20
            if (r0 == 0) goto L_0x0018
            boolean r0 = X.C297785sK.A0F(r8, r7)
            r15 = 1
            if (r0 != 0) goto L_0x0019
        L_0x0018:
            r15 = 0
        L_0x0019:
            r4 = 0
            if (r15 == 0) goto L_0x0038
            X.1Xj r0 = r7.A0b
            if (r0 == 0) goto L_0x0030
            com.instagram.user.model.UpcomingEvent r3 = r0.A27(r8)
            r2 = r4
            r1 = 1
        L_0x0026:
            if (r3 == 0) goto L_0x0030
            if (r1 == 0) goto L_0x0030
            if (r2 == 0) goto L_0x005f
            boolean r0 = r2.A1q
            if (r0 != r5) goto L_0x005f
        L_0x0030:
            X.3oV r1 = r6.A00
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0038:
            boolean r0 = r7.CcK()
            if (r0 != 0) goto L_0x0030
            java.util.List r1 = r7.A0b()
            X.3WT r0 = X.AnonymousClass3WT.UPCOMING_EVENT
            X.3ui r2 = X.C289745e8.A00(r0, r1)
            if (r2 == 0) goto L_0x0030
            com.instagram.user.model.UpcomingEventImpl r3 = r2.A1A
            com.instagram.api.schemas.UpcomingEventStickerSource r1 = r2.A0h
            com.instagram.api.schemas.UpcomingEventStickerSource r0 = com.instagram.api.schemas.UpcomingEventStickerSource.STICKER_TRAY
            if (r1 != r0) goto L_0x005d
            java.lang.String r1 = r2.A1g
            java.lang.String r0 = "upcoming_event_card"
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 != 0) goto L_0x0026
        L_0x005d:
            r1 = 0
            goto L_0x0026
        L_0x005f:
            if (r15 != 0) goto L_0x012e
            java.lang.Integer r11 = X.AnonymousClass05K.A00
        L_0x0063:
            X.3oV r0 = r6.A00
            r22 = r0
            android.view.View r13 = r22.getView()
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            android.content.Context r17 = r13.getContext()
            X.0qQ.A07(r17)
            java.lang.Integer r12 = X.AnonymousClass05K.A01
            X.5uw r10 = new X.5uw
            r20 = r12
            r21 = r11
            r18 = r8
            r19 = r3
            r16 = r10
            r16.<init>(r17, r18, r19, r20, r21)
            X.VZj r14 = new X.VZj
            r19 = r10
            r20 = r3
            r16 = r14
            r17 = r13
            r16.<init>(r17, r18, r19, r20, r21)
            if (r15 == 0) goto L_0x00fa
            X.1Xj r0 = r7.A0b
            if (r0 == 0) goto L_0x009c
        L_0x0098:
            java.lang.String r4 = r0.getId()
        L_0x009c:
            r13.setImageDrawable(r10)
            r13.setClickable(r5)
            X.IC3 r0 = new X.IC3
            r5 = r23
            r0.<init>(r14, r5, r3, r4)
            X.AnonymousClass0fU.A00(r0, r13)
            java.lang.String r0 = r10.A0B()
            r13.setContentDescription(r0)
            X.2eS.A04(r13, r12)
            boolean r0 = r7.CcK()
            if (r0 == 0) goto L_0x00c1
            X.3aa r0 = X.C244063aa.CTA
            X.C244083ac.A05(r13, r0)
        L_0x00c1:
            r8 = 0
            r0 = r22
            r0.setVisibility(r8)
            if (r11 == r12) goto L_0x00cd
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r11 != r0) goto L_0x00ce
        L_0x00cd:
            r8 = 1
        L_0x00ce:
            boolean r0 = r7.CcK()
            if (r0 == 0) goto L_0x00ea
            android.view.View r0 = r22.getView()
            android.view.ViewGroup r1 = X.C3019160o.A01(r0)
            X.IiZ r0 = new X.IiZ
            r0.<init>(r1, r6, r8)
        L_0x00e1:
            X.0nA.A0q(r1, r0)
        L_0x00e4:
            r0 = r24
            r5.Cy9(r3, r4, r0)
            return
        L_0x00ea:
            if (r2 == 0) goto L_0x00e4
            android.view.View r0 = r22.getView()
            android.view.ViewGroup r1 = X.C3019160o.A01(r0)
            X.IjA r0 = new X.IjA
            r0.<init>(r1, r7, r2, r6)
            goto L_0x00e1
        L_0x00fa:
            if (r2 == 0) goto L_0x009c
            com.instagram.model.upcomingeventsmetadata.UpcomingEventMediaImpl r1 = r2.A0s
            if (r1 == 0) goto L_0x009c
            X.1E8 r9 = X.1E7.A00(r8)
            r0 = 2
            X.0qQ.A0B(r9, r0)
            X.1Xx r15 = new X.1Xx
            r15.<init>()
            java.lang.String r0 = r1.getId()
            r15.A5j = r0
            com.instagram.model.mediasize.ImageInfo r0 = r1.BGO()
            r15.EZf(r0)
            X.1Xv r0 = X.1Xj.A0h
            X.1E5 r0 = X.1E4.A00(r8)
            X.1Xj r1 = new X.1Xj
            r1.<init>(r0, r15)
            r0 = 0
            X.1Xj r0 = r9.A01(r1, r5, r0)
            if (r0 == 0) goto L_0x009c
            goto L_0x0098
        L_0x012e:
            X.0Tu r9 = X.0Tu.A05
            r0 = 2342161939863968516(0x208107e000081b04, double:4.064679162380604E-152)
            boolean r0 = X.182.A06(r9, r8, r0)
            if (r0 == 0) goto L_0x013f
            java.lang.Integer r11 = X.AnonymousClass05K.A0C
            goto L_0x0063
        L_0x013f:
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YI.A00(com.instagram.common.session.UserSession, X.3uh, X.6mN, X.6nZ, boolean):void");
    }
}
