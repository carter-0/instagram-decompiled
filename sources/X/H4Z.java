package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class H4Z extends 1P0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 1P0 A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ AnonymousClass4DU A04;
    public final /* synthetic */ C243373Ym A05;
    public final /* synthetic */ Product A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ List A08;
    public final /* synthetic */ 0rm A09;

    public H4Z(1P0 r1, UserSession userSession, 1Xj r3, AnonymousClass4DU r4, C243373Ym r5, Product product, String str, List list, 0rm r9, int i) {
        this.A08 = list;
        this.A06 = product;
        this.A01 = r1;
        this.A02 = userSession;
        this.A04 = r4;
        this.A03 = r3;
        this.A00 = i;
        this.A05 = r5;
        this.A07 = str;
        this.A09 = r9;
    }

    public final void onFail(C268654dm r9) {
        int A032 = AnonymousClass0fD.A03(482613333);
        I7Q.A03((C54685HOq) this.A09.A00, this.A02, this.A04, this.A06.A0H, this.A07, false);
        AnonymousClass0fD.A0A(-284191919, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int A032 = AnonymousClass0fD.A03(-315155202);
        int A0D = AnonymousClass7TG.A0D(obj, 362642431);
        Object A0J = 00k.A0J(this.A08);
        Product product = this.A06;
        if (A0J == product) {
            1P0 r0 = this.A01;
            if (r0 != null) {
                r0.onSuccess(obj);
            }
            UserSession userSession = this.A02;
            AnonymousClass4DU r6 = this.A04;
            1Xj r8 = this.A03;
            int i = this.A00;
            C243373Ym r2 = this.A05;
            String str2 = this.A07;
            1Ln A012 = 1Ln.A01(C51967G9n.A0Z(r6, userSession, r2, 4));
            if (DbT.A1Y(A012)) {
                List<Product> A013 = I7Q.A01(r8, i);
                ArrayList arrayList = null;
                if (A013 != null) {
                    arrayList = AnonymousClass7TE.A1C();
                    for (Product product2 : A013) {
                        String str3 = product2.A0H;
                        if (str3 != null) {
                            C51973G9u.A1F(str3, arrayList);
                        }
                    }
                }
                if (str2 == null) {
                    str2 = "";
                }
                V1Z v1z = V1Z.BULK_SAVE_BUTTON;
                if (r2 == C243373Ym.NOT_SAVED) {
                    v1z = V1Z.BULK_UNSAVE_BUTTON;
                    str = "wishlist_collection_bulk_unsave_button_click";
                } else {
                    str = "wishlist_collection_bulk_save_button_click";
                }
                if (arrayList != null && DbT.A1b(arrayList)) {
                    A012.A0R("shopping_session_id", str2);
                    A012.A0M(v1z, "analytics_component");
                    A012.A0M(V1X.POSTS_FEED, "analytics_page");
                    A012.A0M(V1Y.SAVE_TO_COLLECTION_BOTTOM_SHEET, "analytics_module");
                    C51975G9x.A1A(A012, r8, str, arrayList);
                    A012.Cgf();
                }
            }
        }
        UserSession userSession2 = this.A02;
        I7Q.A03((C54685HOq) this.A09.A00, userSession2, this.A04, product.A0H, this.A07, true);
        C225892f5.A00(userSession2).A0M(this.A05, product, (Map) null);
        AnonymousClass0fD.A0A(-229533685, A0D);
        AnonymousClass0fD.A0A(-1530038840, A032);
    }
}
