package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductSource;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.U8g  reason: case insensitive filesystem */
public final class C14770U8g extends 2YL {
    public Set A00 = new LinkedHashSet();
    public final 2Fk A01;
    public final AnonymousClass2Fj A02;
    public final UserSession A03;
    public final C16221Uqk A04;
    public final C16229Uqs A05;
    public final 0V2 A06;
    public final C61770pa A07;
    public final C19596WcL A08;
    public final C17866VhJ A09;
    public final C17867VhK A0A;
    public final C19597WcM A0B;
    public final C19599WcO A0C;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(com.instagram.model.shopping.ProductGroup r9, X.C18043VkR r10, com.instagram.user.model.Product r11) {
        /*
            r8 = this;
            r2 = 0
            boolean r6 = X.AnonymousClass7TF.A1U(r2, r11, r10)
            java.util.Set r4 = r8.A00
            java.lang.String r0 = r10.A01()
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L_0x00d8
            X.2Fk r5 = r8.A01
            X.Tpd r0 = X.C13989Tnp.A0c(r5)
            java.util.Set r1 = r0.A05
            java.lang.String r0 = r10.A01()
            boolean r0 = r1.contains(r0)
            r3 = r0 ^ 1
            r0 = 20
            X.GN2 r1 = new X.GN2
            r1.<init>(r0, r11, r10, r3)
            X.2Fj r0 = r8.A02
            X.C13991Tnr.A0y(r5, r0, r1)
            java.lang.String r0 = r10.A01()
            r4.add(r0)
            if (r3 == 0) goto L_0x00ce
            if (r9 == 0) goto L_0x00c3
            X.Uqk r7 = r8.A04
            X.0wc r1 = r7.A02
            java.lang.String r0 = "instagram_shopping_shop_manager_add_product_variant_selection_tap"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x00c8
            java.util.List r0 = r9.A02
            java.util.List r0 = X.C51966G9m.A1J(r0)
            java.lang.Object r3 = X.00k.A0O(r0, r2)
            com.instagram.model.shopping.ProductVariantDimension r3 = (com.instagram.model.shopping.ProductVariantDimension) r3
            java.util.List r0 = r9.A02
            java.util.Iterator r5 = X.JTQ.A0h(r0)
        L_0x005c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x006f
            java.lang.Object r2 = r5.next()
            com.instagram.model.shopping.ProductVariantDimension r2 = (com.instagram.model.shopping.ProductVariantDimension) r2
            com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle r1 = r2.A00
            com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle r0 = com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle.THUMBNAIL
            if (r1 != r0) goto L_0x005c
            r3 = r2
        L_0x006f:
            java.lang.String r1 = r7.A04
            java.lang.String r0 = "waterfall_id"
            r4.AAJ(r0, r1)
            java.lang.String r1 = r7.A03
            java.lang.String r0 = "prior_module"
            java.lang.Boolean r1 = X.JTP.A0g(r4, r0, r1, r6)
            java.lang.String r0 = "is_halfsheet"
            r4.A7p(r0, r1)
            java.lang.String r1 = r11.A0H
            java.lang.String r0 = "product_id"
            r4.AAJ(r0, r1)
            java.lang.String r0 = r10.A02()
            X.Uwy r0 = X.VH2.A00(r0)
            if (r0 == 0) goto L_0x00c0
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x00bd
            r0 = 1
            if (r1 != r0) goto L_0x00c0
            java.lang.String r1 = "product_item"
        L_0x00a0:
            java.lang.String r0 = "product_row_type"
            r4.AAJ(r0, r1)
            r0 = 0
            if (r3 == 0) goto L_0x00bb
            java.lang.String r2 = r3.A03
        L_0x00aa:
            java.lang.String r1 = "product_variant_dimension"
            r4.AAJ(r1, r2)
            if (r3 == 0) goto L_0x00b3
            java.lang.String r0 = r3.A02
        L_0x00b3:
            r11.A01(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00bb:
            r2 = r0
            goto L_0x00aa
        L_0x00bd:
            java.lang.String r1 = "product_group"
            goto L_0x00a0
        L_0x00c0:
            java.lang.String r1 = ""
            goto L_0x00a0
        L_0x00c3:
            X.Uqk r0 = r8.A04
            r0.A01(r10, r11)
        L_0x00c8:
            X.VhJ r0 = r8.A09
            r0.A00(r10, r11)
            return
        L_0x00ce:
            X.Uqk r0 = r8.A04
            r0.A02(r10, r11)
            X.VhK r0 = r8.A0A
            r0.A00(r10, r11)
        L_0x00d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14770U8g.A00(com.instagram.model.shopping.ProductGroup, X.VkR, com.instagram.user.model.Product):void");
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.Wek, X.Uqs] */
    public C14770U8g(Context context, AnonymousClass07i r20, UserSession userSession, C16221Uqk uqk) {
        C16221Uqk uqk2 = uqk;
        Context context2 = context;
        AnonymousClass07i r6 = r20;
        UserSession userSession2 = userSession;
        C51974G9v.A1P(userSession2, context2, r6, uqk2);
        this.A03 = userSession2;
        this.A04 = uqk2;
        C19599WcO wcO = new C19599WcO(this);
        this.A0C = wcO;
        C19597WcM wcM = new C19597WcM(this);
        this.A0B = wcM;
        C19596WcL wcL = new C19596WcL(this, 3);
        this.A08 = wcL;
        this.A05 = new C19743Wek(userSession2, wcL);
        this.A0A = new C17867VhK(context2, r6, userSession2, wcO);
        this.A09 = new C17866VhJ(context2, r6, userSession2, wcM);
        List list = 0sn.A00;
        Set set = 0sl.A00;
        2Fk r2 = new 2Fk(new C14087Tpd((ProductSource) null, "", (String) null, list, list, set, set, false, false, false, false, false, false));
        this.A02 = r2;
        05D A012 = 10D.A01(AnonymousClass05K.A00, 0, 0);
        this.A06 = A012;
        this.A01 = r2;
        this.A07 = new 0V1((C262204Co) null, A012);
    }

    public final void A01(String str) {
        boolean A1b = AnonymousClass0t1.A01.A01(this.A03).A1b();
        C74187PqT pqT = new C74187PqT(str, A1b, 4);
        C13991Tnr.A0y(this.A01, this.A02, pqT);
        if (!A1b) {
            C16229Uqs uqs = this.A05;
            uqs.A01 = str;
            uqs.A03(true);
        }
    }
}
