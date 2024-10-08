package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

public final class H5K extends C252233om {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ AnonymousClass325 A01;
    public final /* synthetic */ JQL A02;
    public final /* synthetic */ String A03;

    public H5K(1Xj r1, AnonymousClass325 r2, JQL jql, String str) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = jql;
        this.A03 = str;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Product product;
        Intent intent2 = intent;
        if (intent != null && i2 == -1 && i == 3 && (product = (Product) intent2.getParcelableExtra(AnonymousClass000.A00(366))) != null) {
            AnonymousClass325 r11 = this.A01;
            Context requireContext = r11.A00.requireContext();
            UserSession userSession = r11.A03;
            AnonymousClass07i r2 = r11.A01;
            1Xj r10 = this.A00;
            String id = r10.getId();
            if (id != null) {
                String str = product.A0H;
                JQL jql = this.A02;
                C13999To1 to1 = new C13999To1(jql, 14);
                String str2 = this.A03;
                C59143J7z j7z = new C59143J7z(r11, product, jql, str2, 2);
                C73963Pmh pmh = new C73963Pmh(r10, r11, jql, product, str2, 18);
                C58220IoO ioO = new C58220IoO(jql, product, r11, r10, str2, 4);
                C51972G9s.A1C(r2, str);
                1NY A0a = AnonymousClass7TG.A0a(userSession);
                C51968G9o.A1K(A0a, "commerce/community/featured_products/permission_create/", id);
                A0a.A9m("product_id", str);
                1OC A0S = DbU.A0S(A0a, NHN.class, ORG.class);
                A0S.A00 = new C54236H4f(5, to1, pmh, userSession, ioO, j7z);
                1ES.A00(requireContext, r2, A0S);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        this.A01.A00.unregisterLifecycleListener(this);
    }

    public final void onDestroy() {
        this.A01.A00.unregisterLifecycleListener(this);
    }
}
