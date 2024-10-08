package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

public final class H5J extends C252233om {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ AnonymousClass325 A01;
    public final /* synthetic */ JQL A02;
    public final /* synthetic */ String A03;

    public H5J(1Xj r1, AnonymousClass325 r2, JQL jql, String str) {
        this.A01 = r2;
        this.A02 = jql;
        this.A03 = str;
        this.A00 = r1;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (intent != null && i2 == -1 && i == 13) {
            Product product = (Product) intent2.getParcelableExtra(AnonymousClass000.A00(366));
            String stringExtra = intent2.getStringExtra("media_id");
            if (!(product == null || stringExtra == null)) {
                AnonymousClass325 r10 = this.A01;
                Context requireContext = r10.A00.requireContext();
                UserSession userSession = r10.A03;
                AnonymousClass07i r1 = r10.A01;
                String str = product.A0H;
                JQL jql = this.A02;
                C13999To1 to1 = new C13999To1(jql, 13);
                String str2 = this.A03;
                C59146J8c j8c = new C59146J8c(r10, jql, product, stringExtra, str2, 3);
                1Xj r11 = this.A00;
                TWR twr = new TWR(product, r10, r11, jql, stringExtra, str2, 3);
                C58225IoT ioT = new C58225IoT(r10, jql, product, r11, str2, stringExtra, 0);
                C51972G9s.A1C(r1, str);
                1NY A0a = AnonymousClass7TG.A0a(userSession);
                C51968G9o.A1K(A0a, "commerce/community/featured_products/permission_create/", stringExtra);
                A0a.A9m("product_id", str);
                1OC A0S = DbU.A0S(A0a, NHN.class, ORG.class);
                A0S.A00 = new C54236H4f(5, to1, twr, userSession, ioT, j8c);
                1ES.A00(requireContext, r1, A0S);
            }
        }
        this.A01.A00.unregisterLifecycleListener(this);
    }

    public final void onDestroy() {
        this.A01.A00.unregisterLifecycleListener(this);
    }
}
