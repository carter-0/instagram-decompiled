package X;

import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.recon.ShoppingReconFeedEndpoint;

/* renamed from: X.UhY  reason: case insensitive filesystem */
public final class C15727UhY extends C228042kh {
    public final UserSession A00;
    public final C228312lJ A01;
    public final C17900Vhr A02;
    public final ShoppingReconFeedEndpoint A03;
    public final String A04 = "recon_destination_viewed";
    public final String A05;
    public final String A06;

    public C15727UhY(UserSession userSession, C228312lJ r4, C17900Vhr vhr, ShoppingReconFeedEndpoint shoppingReconFeedEndpoint, String str, String str2) {
        0qQ.A0B(userSession, 1);
        C51974G9v.A1N(str2, vhr, r4);
        this.A00 = userSession;
        this.A03 = shoppingReconFeedEndpoint;
        this.A05 = str;
        this.A06 = str2;
        this.A02 = vhr;
        this.A01 = r4;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        ShoppingReconFeedEndpoint shoppingReconFeedEndpoint = this.A03;
        0xG r1 = new 0xG(this.A04);
        String str = this.A06;
        return new C60209JhS(r1, userSession, this.A01, this.A02, shoppingReconFeedEndpoint, str, new C20785Wyw(this, 9));
    }
}
