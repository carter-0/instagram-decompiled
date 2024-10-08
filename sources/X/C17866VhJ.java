package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import org.json.JSONArray;

/* renamed from: X.VhJ  reason: case insensitive filesystem */
public final class C17866VhJ {
    public final UserSession A00;
    public final X6z A01;
    public final Context A02;
    public final AnonymousClass07i A03;

    public C17866VhJ(Context context, AnonymousClass07i r2, UserSession userSession, X6z x6z) {
        this.A01 = x6z;
        this.A00 = userSession;
        this.A02 = context;
        this.A03 = r2;
    }

    public final void A00(C18043VkR vkR, Product product) {
        long currentTimeMillis = System.currentTimeMillis();
        String str = product.A0H;
        1NY A0a = AnonymousClass7TG.A0a(this.A00);
        A0a.A0A("commerce/shop_management/add_to_shop/");
        DbX.A1M(A0a, "product_ids", new JSONArray().put(str).toString());
        1OC A0M = A0a.A0M();
        A0M.A00 = new C15598UfQ(0, currentTimeMillis, this, vkR, product);
        1ES.A00(this.A02, this.A03, A0M);
    }
}
