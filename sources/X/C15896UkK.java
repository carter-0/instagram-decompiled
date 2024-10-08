package X;

import com.instagram.api.schemas.ProductDiscountInformationDict;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.UkK  reason: case insensitive filesystem */
public final class C15896UkK extends C230372pW {
    public boolean A00 = false;
    public final C18785W1l A01;
    public final String A02;
    public final String A03;

    public C15896UkK(UserSession userSession, C18785W1l w1l, String str, String str2) {
        super(C13988Tno.A0K(userSession));
        this.A03 = str;
        this.A02 = str2;
        this.A01 = w1l;
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        Set<ProductDiscountInformationDict> set = (Set) obj;
        0qQ.A0B(set, 0);
        C18785W1l w1l = this.A01;
        ArrayList arrayList = new ArrayList();
        for (ProductDiscountInformationDict id : set) {
            Long A0n = C51971G9r.A0n(0, id.getId());
            if (A0n != null) {
                arrayList.add(A0n);
            }
        }
        String str = this.A03;
        String str2 = this.A02;
        boolean z = this.A00;
        0Aj A0e = AnonymousClass7TE.A0e(w1l.A02, "shops_promotions_banner_impression");
        C51969G9p.A1A(A0e, w1l.A01);
        0bb r2 = new 0bb();
        r2.A06("prior_module", w1l.A07);
        r2.A06("prior_submodule", w1l.A05);
        C13989Tnp.A1E(A0e, r2, w1l.A08);
        A0e.AAe("discount_ids", arrayList);
        C13988Tno.A1B(A0e, str);
        A0e.AAJ("checkout_session_id", str2);
        A0e.AAK(C18785W1l.A00(w1l, str2, (List) null), "bag_logging_info");
        A0e.A7p("is_megaphone_banner", Boolean.valueOf(z));
        A0e.Cgf();
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
    }
}
