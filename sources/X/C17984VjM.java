package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VjM  reason: case insensitive filesystem */
public final class C17984VjM {
    public final 0wc A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;

    public final void A01(1Xj r6, List list) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "instagram_shoppable_everything_delivery");
        if (A0e.isSampled()) {
            C51969G9p.A1A(A0e, this.A02);
            ArrayList arrayList = null;
            A0e.A9F("seed_media_id", C51972G9s.A0j(r6.A30()));
            A0e.A9F("seed_ad_id", C51972G9s.A0j(C231122qu.A07(this.A01, r6)));
            if (list != null) {
                arrayList = AnonymousClass7TF.A0p(list);
                for (Object A1E : list) {
                    arrayList.add(00y.A0n(10, C41847B3o.A1E(A1E)));
                }
            }
            A0e.AAe(AnonymousClass000.A00(3475), arrayList);
            A0e.Cgf();
        }
    }

    public C17984VjM(UserSession userSession, AnonymousClass4DU r3) {
        this.A01 = userSession;
        this.A02 = r3;
        this.A00 = AnonymousClass0kN.A01(r3, userSession);
    }

    public final void A00(1Xj r5, Product product, Integer num, Integer num2, String str, String str2) {
        Long l;
        String str3;
        AnonymousClass7TG.A1N(str, str2);
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "instagram_shoppable_everything_item_feedback");
        if (A0e.isSampled()) {
            C51969G9p.A1A(A0e, this.A02);
            User user = null;
            A0e.A9F("seed_media_id", C51972G9s.A0j(r5.A30()));
            A0e.A9F("seed_ad_id", C51972G9s.A0j(C231122qu.A07(this.A01, r5)));
            if (num == null || num2 == null) {
                l = null;
            } else {
                l = Long.valueOf((long) ((num.intValue() * 2) + num2.intValue()));
            }
            A0e.A9F("position", l);
            if (product != null) {
                str3 = product.A0H;
            } else {
                str3 = null;
            }
            A0e.AAJ("product_id", str3);
            if (product != null) {
                user = product.A0B;
            }
            A0e.AAJ("merchant_id", AnonymousClass3ZA.A00(user));
            A0e.AAJ("outcome", str2);
            A0e.AAJ("prompt_type", str);
            A0e.Cgf();
        }
    }
}
