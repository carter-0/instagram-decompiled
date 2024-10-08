package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.U8r  reason: case insensitive filesystem */
public final class C14781U8r extends 2YL {
    public Set A00 = new LinkedHashSet();
    public final 2Fk A01;
    public final C16222Uql A02;
    public final C16228Uqr A03;
    public final 0V2 A04;
    public final C61770pa A05;
    public final AnonymousClass2Fj A06;
    public final C19596WcL A07;
    public final UserSession A08;
    public final C17866VhJ A09;
    public final C17867VhK A0A;
    public final C19598WcN A0B;
    public final C19600WcP A0C;

    public final void A01(C18043VkR vkR, Product product, boolean z) {
        C18043VkR vkR2 = vkR;
        Product product2 = product;
        AnonymousClass7TG.A1N(product, vkR);
        Set set = this.A00;
        if (!set.contains(vkR.A01())) {
            Object A022 = this.A01.A02();
            0qQ.A0A(A022);
            boolean z2 = !((Set) ((C53382GnE) A022).A01).contains(vkR.A01());
            if (!z2 || W3U.A02(this.A08, W3U.A00).getBoolean("has_seen_hide_from_shop_nux_dialog", false)) {
                A00(this, new C58736Iwj(25, vkR, z2));
                set.add(vkR.A01());
                if (z2) {
                    if (!z) {
                        this.A02.A02(vkR, product);
                    }
                    this.A0A.A00(vkR, product);
                    return;
                }
                this.A02.A01(vkR, product);
                this.A09.A00(vkR, product);
                return;
            }
            C16222Uql uql = this.A02;
            uql.A02(vkR, product);
            0Aj A0e = AnonymousClass7TE.A0e(uql.A02, "instagram_shopping_shop_manager_hide_product_nux");
            if (A0e.isSampled()) {
                C18655VwA.A00(A0e, uql, vkR, product);
                A0e.AAJ("submodule", uql.A01);
                A0e.Cgf();
            }
            AnonymousClass7TE.A1Z(new C59845JaL(product2, vkR2, this, (AnonymousClass4D7) null, 18), C318116oQ.A00(this));
        }
    }

    public static final void A00(C14781U8r u8r, 0sP r3) {
        C13991Tnr.A0y(u8r.A01, u8r.A06, r3);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Wek, X.Uqr] */
    public C14781U8r(Context context, AnonymousClass07i r9, UserSession userSession, C16222Uql uql) {
        AnonymousClass7TG.A1U(userSession, context, r9);
        0qQ.A0B(uql, 4);
        this.A08 = userSession;
        this.A02 = uql;
        C19600WcP wcP = new C19600WcP(this);
        this.A0C = wcP;
        C19598WcN wcN = new C19598WcN(this);
        this.A0B = wcN;
        C19596WcL wcL = new C19596WcL(this, 4);
        this.A07 = wcL;
        this.A03 = new C19743Wek(userSession, wcL);
        this.A0A = new C17867VhK(context, r9, userSession, wcP);
        this.A09 = new C17866VhJ(context, r9, userSession, wcN);
        2Fk r1 = new 2Fk(new C53382GnE("", 0sn.A00, 0sl.A00, false, false, false));
        this.A06 = r1;
        05D A012 = 10D.A01(AnonymousClass05K.A00, 0, 0);
        this.A04 = A012;
        this.A01 = r1;
        this.A05 = new 0V1((C262204Co) null, A012);
    }
}
