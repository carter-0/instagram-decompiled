package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductSource;
import java.util.Set;

/* renamed from: X.UhX  reason: case insensitive filesystem */
public final class C15726UhX extends C228042kh {
    public final int A00;
    public final UserSession A01;
    public final ProductSource A02;
    public final C16581Uxb A03;
    public final String A04;
    public final String A05;
    public final Set A06;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        Set set = this.A06;
        return new C14780U8q(userSession, this.A02, this.A03, this.A04, this.A05, set, this.A00);
    }

    public C15726UhX(UserSession userSession, ProductSource productSource, C16581Uxb uxb, String str, String str2, Set set, int i) {
        AnonymousClass7TG.A1O(userSession, set);
        this.A01 = userSession;
        this.A06 = set;
        this.A02 = productSource;
        this.A00 = i;
        this.A03 = uxb;
        this.A04 = str;
        this.A05 = str2;
    }
}
