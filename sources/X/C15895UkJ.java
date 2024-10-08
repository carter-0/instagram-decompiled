package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.UkJ  reason: case insensitive filesystem */
public final class C15895UkJ extends C230372pW {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final C15900UkO A02;

    public C15895UkJ(UserSession userSession, AnonymousClass4DU r8, C231112qt r9, String str) {
        super(C13988Tno.A0K(userSession));
        this.A01 = r8;
        this.A00 = userSession;
        this.A02 = new C15900UkO(userSession, r8, r9, (C17984VjM) null, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0056, code lost:
        if (r1 == null) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void A03(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            X.UO3 r8 = (X.UO3) r8
            X.VSz r9 = (X.C17372VSz) r9
            X.AnonymousClass7TG.A1N(r8, r9)
            com.instagram.model.shopping.productfeed.ProductFeedItem r3 = r8.A02
            java.lang.Integer r1 = r3.A06
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x007c
            X.4DU r1 = r7.A01
            com.instagram.common.session.UserSession r0 = r7.A00
            int r6 = r9.A01
            int r5 = r9.A00
            X.0wc r1 = X.AnonymousClass0kN.A01(r1, r0)
            r0 = 3368(0xd28, float:4.72E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x007c
            X.HMw r4 = X.C54665HMw.PRODUCT_AUTO_COLLECTION
            java.lang.String r1 = r4.A01
            java.lang.String r0 = "collection_id"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r4.A00
            java.lang.String r0 = "collection_name"
            r2.AAJ(r0, r1)
            java.lang.String r1 = X.C320166rs.A01(r6, r5)
            java.lang.String r0 = "position"
            r2.AAJ(r0, r1)
            java.lang.String r1 = ""
            r0 = 144(0x90, float:2.02E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.A9O(r0, r1)
            com.instagram.model.shopping.productfeed.ProductTile r0 = r3.A02
            if (r0 == 0) goto L_0x0058
            com.instagram.user.model.Product r1 = r0.A07
            r0 = 1
            if (r1 != 0) goto L_0x0059
        L_0x0058:
            r0 = 0
        L_0x0059:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 315(0x13b, float:4.41E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A7p(r0, r1)
            java.lang.String r0 = r3.getId()
            X.0qQ.A07(r0)
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r0)
            java.lang.String r0 = "product_id"
            r2.A9F(r0, r1)
            X.DbY.A1C(r2)
            X.G9w.A17(r2)
        L_0x007c:
            X.UkO r0 = r7.A02
            r0.A03(r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15895UkJ.A03(java.lang.Object, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        UO3 uo3 = (UO3) obj;
        C17372VSz vSz = (C17372VSz) obj2;
        AnonymousClass7TG.A1N(uo3, vSz);
        this.A02.A04(vSz, uo3);
    }
}
