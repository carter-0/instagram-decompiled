package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.user.model.Product;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Vvm  reason: case insensitive filesystem */
public final class C18644Vvm {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final Map A02 = new HashMap();
    public final Map A03 = new HashMap();

    public static void A00(C18644Vvm vvm, Product product, Integer num) {
        C17385VTm vTm = (C17385VTm) vvm.A02.get(C18386Vqm.A00(product));
        if (vTm != null) {
            vTm.A00 = num;
        }
    }

    public final ProductItemWithAR A01(String str) {
        C17385VTm vTm = (C17385VTm) this.A02.get(str);
        if (vTm != null) {
            return vTm.A01;
        }
        0wb.A03("ShoppingCameraProductStoreImpl", 002.A0R("Unable to getProductItemWithAR for incorrect masterRetailerProductId ", str));
        return null;
    }

    public final void A02(ProductItemWithAR productItemWithAR) {
        Product A002 = C14502TxO.A00(productItemWithAR.A01);
        String A003 = C18386Vqm.A00(A002);
        this.A03.put(A003, A002);
        this.A02.put(A003, new C17385VTm(productItemWithAR));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        r2 = r9.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(com.instagram.user.model.Product r10) {
        /*
            r9 = this;
            java.util.Map r1 = r9.A02
            java.lang.String r0 = X.C18386Vqm.A00(r10)
            java.lang.Object r0 = r1.get(r0)
            X.VTm r0 = (X.C17385VTm) r0
            if (r0 == 0) goto L_0x002b
            java.lang.Integer r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x0018
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x002b
        L_0x0018:
            X.4DH r2 = r9.A00
            android.content.Context r3 = r2.getContext()
            if (r3 == 0) goto L_0x002b
            com.instagram.user.model.User r1 = r10.A0B
            if (r1 != 0) goto L_0x002c
            java.lang.String r1 = "ShoppingCameraProductStoreImpl"
            java.lang.String r0 = "Unable to fetch product group without merchant"
            X.0wb.A03(r1, r0)
        L_0x002b:
            return
        L_0x002c:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            A00(r9, r10, r0)
            X.0gy r4 = X.AnonymousClass07i.A00(r2)
            com.instagram.common.session.UserSession r5 = r9.A01
            java.lang.String r7 = r10.A0H
            java.lang.String r8 = X.AnonymousClass3ZA.A00(r1)
            r0 = 2
            X.WcJ r6 = new X.WcJ
            r6.<init>(r0, r10, r9)
            X.C18262VoT.A01(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18644Vvm.A03(com.instagram.user.model.Product):void");
    }

    public C18644Vvm(AnonymousClass4DH r2, UserSession userSession) {
        this.A00 = r2;
        this.A01 = userSession;
    }
}
