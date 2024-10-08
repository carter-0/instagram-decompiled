package X;

import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.recon.ShoppingReconFeedEndpoint;

public final class LN7 {
    public 05G A00 = C51970G9q.A10(false);
    public final UserSession A01;
    public final AnonymousClass2mA A02;
    public final C228312lJ A03;
    public final C17900Vhr A04;
    public final ShoppingReconFeedEndpoint A05;
    public final LQV A06;
    public final C262224Cq A07;
    public final AnonymousClass0Ud A08;
    public final AnonymousClass0Ud A09;

    public static final C60971JuT A00(LN7 ln7, Integer num, String str, C62320sa r13, C62320sa r14, C62320sa r15, 0sP r16, boolean z) {
        ShoppingReconFeedEndpoint shoppingReconFeedEndpoint = ln7.A05;
        return new C60971JuT(new C60896JtG(), shoppingReconFeedEndpoint, num, str, new C13999To1(r13, 37), new C13999To1(r14, 38), new C13999To1(r15, 39), new J6T(4, (Object) r16, (Object) ln7), z);
    }

    public LN7(UserSession userSession, C228312lJ r4, C17900Vhr vhr, ShoppingReconFeedEndpoint shoppingReconFeedEndpoint, C262224Cq r7) {
        C51974G9v.A1P(userSession, shoppingReconFeedEndpoint, vhr, r4);
        LQV lqv = (LQV) userSession.A01(LQV.class, new C13999To1(userSession, 31));
        0qQ.A0B(lqv, 3);
        this.A01 = userSession;
        this.A05 = shoppingReconFeedEndpoint;
        this.A06 = lqv;
        this.A04 = vhr;
        this.A03 = r4;
        this.A07 = r7;
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        this.A02 = new AnonymousClass2mA(r4);
        this.A08 = LQV.A00(shoppingReconFeedEndpoint, lqv).A03;
        this.A09 = this.A00;
    }
}
