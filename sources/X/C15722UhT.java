package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import java.util.Map;

/* renamed from: X.UhT  reason: case insensitive filesystem */
public final class C15722UhT extends C228042kh {
    public final int A00;
    public final UserSession A01;
    public final C18778W1d A02;
    public final Product A03;
    public final String A04;
    public final Map A05;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        Product product = this.A03;
        Map map = this.A05;
        return new U90(userSession, this.A02, product, this.A04, map, this.A00);
    }

    public C15722UhT(UserSession userSession, C18778W1d w1d, Product product, String str, Map map, int i) {
        AnonymousClass7TG.A1P(userSession, map);
        0qQ.A0B(w1d, 5);
        this.A01 = userSession;
        this.A03 = product;
        this.A05 = map;
        this.A04 = str;
        this.A02 = w1d;
        this.A00 = i;
    }
}
