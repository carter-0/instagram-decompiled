package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

/* renamed from: X.VhK  reason: case insensitive filesystem */
public final class C17867VhK {
    public final UserSession A00;
    public final X70 A01;
    public final Context A02;
    public final AnonymousClass07i A03;

    public C17867VhK(Context context, AnonymousClass07i r2, UserSession userSession, X70 x70) {
        this.A01 = x70;
        this.A00 = userSession;
        this.A02 = context;
        this.A03 = r2;
    }

    public final void A00(C18043VkR vkR, Product product) {
        long currentTimeMillis = System.currentTimeMillis();
        String str = product.A0H;
        1NY A0a = AnonymousClass7TG.A0a(this.A00);
        A0a.A0A("commerce/shop_management/hide_product/");
        DbX.A1M(A0a, "product_id", str);
        1OC A0M = A0a.A0M();
        A0M.A00 = new C15598UfQ(1, currentTimeMillis, this, vkR, product);
        1ES.A00(this.A02, this.A03, A0M);
    }
}
