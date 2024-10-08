package X;

import com.instagram.common.session.UserSession;

public final class GC4 extends C230372pW {
    public final HnV A00;
    public final C52012GBj A01;

    public GC4(UserSession userSession, HnV hnV, C52012GBj gBj) {
        super(C51969G9p.A0i(1Bk.A03, userSession, "clips_viewer_qp"));
        this.A01 = gBj;
        this.A00 = hnV;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        r1 = r5.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(X.C267324bN r9, X.C52058GDe r10) {
        /*
            r8 = this;
            X.GBj r1 = r8.A01
            int r0 = r10.A09()
            android.view.View r0 = r1.A0A(r0)
            if (r0 == 0) goto L_0x008c
            X.HnV r5 = r8.A00
            r7 = 0
            r6 = 1
            java.lang.Object r1 = r0.getTag()
            boolean r0 = r1 instanceof X.C52079GDz
            if (r0 == 0) goto L_0x0087
            X.GDz r1 = (X.C52079GDz) r1
            if (r1 == 0) goto L_0x0087
            X.GDy r0 = r1.A07
            if (r0 == 0) goto L_0x0087
            android.view.View r4 = r0.A08
            r0 = 2131435428(0x7f0b1fa4, float:1.8492698E38)
            android.view.View r3 = r4.findViewById(r0)
            if (r3 == 0) goto L_0x0034
            X.2qT r2 = r5.A02
            X.2qi r1 = r5.A01
            com.instagram.quickpromotion.intf.QPTooltipAnchor r0 = com.instagram.quickpromotion.intf.QPTooltipAnchor.CLIPS_LIKE_BUTTON
            r2.A00(r3, r0, r1)
        L_0x0034:
            r0 = 2131430683(0x7f0b0d1b, float:1.8483074E38)
            android.view.View r3 = r4.findViewById(r0)
            if (r3 == 0) goto L_0x0058
            com.instagram.common.session.UserSession r1 = r5.A00
            com.instagram.user.model.User r0 = r9.A08(r1)
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = r0.getId()
            boolean r0 = X.C51966G9m.A1W(r1, r0)
            if (r0 != 0) goto L_0x0058
            X.2qT r2 = r5.A02
            X.2qi r1 = r5.A01
            com.instagram.quickpromotion.intf.QPTooltipAnchor r0 = com.instagram.quickpromotion.intf.QPTooltipAnchor.CLIPS_CONTENT_APPRECIATION_BUTTON
            r2.A00(r3, r0, r1)
        L_0x0058:
            r0 = 2131430287(0x7f0b0b8f, float:1.848227E38)
            android.view.View r4 = r4.findViewById(r0)
            if (r4 == 0) goto L_0x0087
            X.1Xj r2 = r9.A02
            if (r2 == 0) goto L_0x0087
            com.instagram.common.session.UserSession r3 = r5.A00
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            X.1sy r0 = X.1sy.A07
            boolean r0 = X.AnonymousClass3YR.A05(r3, r2, r0, r1, r7)
            if (r0 != r6) goto L_0x0087
            X.0Tu r2 = X.0Tu.A05
            r0 = 36310576938352829(0x810047000000bd, double:3.0262932945473963E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0087
            X.2qT r2 = r5.A02
            X.2qi r1 = r5.A01
            com.instagram.quickpromotion.intf.QPTooltipAnchor r0 = com.instagram.quickpromotion.intf.QPTooltipAnchor.CLIPS_VIEWER_OVERFLOW_ICON_WITH_INSIGHTS
            r2.A00(r4, r0, r1)
        L_0x0087:
            X.0sa r0 = r5.A03
            r0.invoke()
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GC4.A00(X.4bN, X.GDe):void");
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C267324bN r1 = (C267324bN) obj;
        C52058GDe gDe = (C52058GDe) obj2;
        AnonymousClass7TG.A1N(r1, gDe);
        A00(r1, gDe);
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C267324bN r1 = (C267324bN) obj;
        C52058GDe gDe = (C52058GDe) obj2;
        AnonymousClass7TG.A1N(r1, gDe);
        A00(r1, gDe);
    }
}
