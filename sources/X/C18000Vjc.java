package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Vjc  reason: case insensitive filesystem */
public final class C18000Vjc {
    public C16508Uw5 A00 = C16508Uw5.LOADED;
    public final Context A01;
    public final AnonymousClass07i A02;
    public final UserSession A03;
    public final String A04;

    public C18000Vjc(Context context, AnonymousClass07i r3, UserSession userSession, String str) {
        0qQ.A0B(userSession, 2);
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = r3;
        this.A04 = str;
    }

    public final void A00(0sP r6, 0sP r7) {
        AnonymousClass7TG.A1N(r6, r7);
        Context context = this.A01;
        AnonymousClass07i r3 = this.A02;
        1NY A0b = AnonymousClass7TG.A0b(this.A03);
        A0b.A0A("commerce/community/featured_products/merchant_management/");
        A0b.A9m("merchant_id", this.A04);
        1OC A0S = DbU.A0S(A0b, C15252UXm.class, C18260VoR.class);
        A0S.A00 = new C15625Ufr(16, r7, r6, this);
        1ES.A00(context, r3, A0S);
    }

    public final void A01(0sP r6, 0sP r7) {
        AnonymousClass7TG.A1N(r6, r7);
        Context context = this.A01;
        AnonymousClass07i r3 = this.A02;
        1NY A0b = AnonymousClass7TG.A0b(this.A03);
        A0b.A0A("commerce/community/featured_products/merchant_management/");
        A0b.A9m("merchant_id", this.A04);
        1OC A0S = DbU.A0S(A0b, C15251UXl.class, C18259VoQ.class);
        A0S.A00 = new C15625Ufr(17, r7, r6, this);
        1ES.A00(context, r3, A0S);
    }
}
