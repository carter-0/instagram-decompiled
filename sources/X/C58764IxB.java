package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IxB  reason: case insensitive filesystem */
public final class C58764IxB extends 0Yg implements 0sP {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58764IxB(1Xj r2, C53908GwE gwE, int i, int i2, boolean z) {
        super(1);
        this.A00 = i2;
        this.A03 = gwE;
        this.A02 = r2;
        this.A04 = z;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j;
        String str;
        Long A10;
        int i = this.A00;
        C53908GwE gwE = (C53908GwE) this.A03;
        if (i != 0) {
            1Xj r2 = (1Xj) this.A02;
            boolean z = this.A04;
            int i2 = this.A01;
            AnonymousClass56P C4I = r2.A0C.C4I();
            C267324bN r3 = gwE.A02;
            1Xj r5 = r3.A02;
            if (r5 == null || C4I == null) {
                gwE.A06.D3Z(gwE.A01, r3, gwE.A03, (2EG) null, false, (String) null, (String) null, -1.0f, -1.0f, false, false);
            } else {
                gwE.A06.D4Q(C4I, r5, r2.A0C.getPk(), i2, z);
            }
        } else {
            1Xj r7 = (1Xj) this.A02;
            boolean z2 = this.A04;
            int i3 = this.A01;
            1Xj r9 = gwE.A02.A02;
            if (r9 != null) {
                UserSession userSession = gwE.A04;
                0Aj A0e = AnonymousClass7TE.A0e(C51972G9s.A0Z(gwE.A05, DbY.A0M(userSession)), "instagram_ad_reels_product_extension_impression");
                String A07 = C231122qu.A07(userSession, r9);
                if (A07 == null || (A10 = AnonymousClass7TE.A10(A07)) == null) {
                    j = 0;
                } else {
                    j = A10.longValue();
                }
                if (z2) {
                    str = "collection_tile_product_scrollable";
                } else {
                    str = "collection_tile_product";
                }
                if (A0e.isSampled()) {
                    C51970G9q.A17(A0e, j);
                    G9t.A1I(A0e, r9, "tracking_token", r9.A2v());
                    A0e.AAJ("a_pk", C51973G9u.A0j(userSession, r9));
                    A0e.AAJ("carousel_media_id", r7.A0C.getPk());
                    A0e.AAJ("format", str);
                    A0e.A9F("thumbnail_index", DbV.A0p(A0e, C273654mx.A00(2868), "collection_tile_thumbnail", i3));
                    A0e.Cgf();
                }
            }
        }
        return C60340gF.A00;
    }
}
