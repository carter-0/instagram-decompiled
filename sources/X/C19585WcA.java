package X;

import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.analytics.ShoppingGuideLoggingInfo;
import com.instagram.user.model.Product;
import java.util.List;

/* renamed from: X.WcA  reason: case insensitive filesystem */
public final class C19585WcA implements C20981X7w {
    public final /* synthetic */ C17882VhZ A00;
    public final /* synthetic */ Product A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public final void DwB(List list) {
        0qQ.A0B(list, 0);
        C17882VhZ vhZ = this.A00;
        AnonymousClass0iw r3 = vhZ.A03;
        UserSession userSession = vhZ.A04;
        W2s.A05(r3, userSession, (1Xj) null, (ShoppingGuideLoggingInfo) null, this.A01, "add_to_bag_cta", r3.getModuleName(), this.A02, (String) null, this.A03);
        C20927X4s x4s = (C20927X4s) 00k.A0J(list);
        if (x4s != null) {
            C18695Vwt.A02(x4s.BRw(vhZ.A00, userSession), 0, "add_to_bag_cta_product_add_to_cart_failure");
        }
    }

    public C19585WcA(C17882VhZ vhZ, Product product, String str, String str2) {
        this.A00 = vhZ;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = product;
    }

    public final void DTp(String str) {
        C17882VhZ vhZ = this.A00;
        AnonymousClass0iw r1 = vhZ.A03;
        W2s.A05(r1, vhZ.A04, (1Xj) null, (ShoppingGuideLoggingInfo) null, this.A01, "add_to_bag_cta", r1.getModuleName(), this.A02, (String) null, this.A03);
        C18695Vwt.A01(vhZ.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        if (r2.A05(r4) != null) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r7) {
        /*
            r6 = this;
            X.VhZ r5 = r6.A00
            java.lang.String r4 = r6.A02
            java.lang.String r3 = r6.A03
            com.instagram.common.session.UserSession r0 = r5.A04
            X.6xT r2 = X.C323426xT.A00(r0)
            X.0qQ.A07(r2)
            X.6xZ r0 = r2.A07
            java.util.Map r0 = r0.A0A
            java.lang.Object r1 = r0.get(r4)
            X.Uw5 r0 = X.C16508Uw5.LOADED
            if (r1 == r0) goto L_0x0026
            X.Uw5 r0 = X.C16508Uw5.FAILED
            if (r1 == r0) goto L_0x0026
            X.VvF r0 = r2.A05(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0027
        L_0x0026:
            r1 = 1
        L_0x0027:
            X.Vgg r0 = new X.Vgg
            r0.<init>(r5, r4, r3)
            if (r1 != 0) goto L_0x0032
            r2.A07(r0)
            return
        L_0x0032:
            r0.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19585WcA.onSuccess(java.lang.Object):void");
    }
}
