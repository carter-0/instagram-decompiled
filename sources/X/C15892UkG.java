package X;

import com.instagram.api.schemas.ProductDiscountInformationDict;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UkG  reason: case insensitive filesystem */
public final class C15892UkG extends C230372pW {
    public final W1W A00;
    public final String A01;

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        List<ProductDiscountInformationDict> list = (List) obj;
        C18588Vuf vuf = (C18588Vuf) obj2;
        AnonymousClass7TG.A1N(list, vuf);
        W1W w1w = this.A00;
        String str = this.A01;
        Product product = vuf.A09;
        0qQ.A0A(product);
        0Aj A0e = AnonymousClass7TE.A0e(w1w.A04, "shops_promotions_promo_label_impression");
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (ProductDiscountInformationDict id : list) {
            C66582MXn.A1N(id.getId(), A0r);
        }
        A0e.AAe("discount_ids", A0r);
        C13989Tnp.A1H(A0e, product);
        C51969G9p.A1A(A0e, w1w.A07);
        C13988Tno.A17(A0e, W1W.A00(w1w, str));
        A0e.AAK(W1W.A01(w1w, vuf), "pdp_logging_info");
        C13988Tno.A1B(A0e, C13989Tnp.A0q(product));
        A0e.AAJ("checkout_session_id", w1w.A0E);
        A0e.Cgf();
    }

    public C15892UkG(UserSession userSession, W1W w1w, String str) {
        super(C13988Tno.A0K(userSession));
        this.A01 = str;
        this.A00 = w1w;
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
    }
}
