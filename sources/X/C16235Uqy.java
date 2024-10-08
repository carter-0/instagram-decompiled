package X;

import com.instagram.api.schemas.SellerShoppableFeedType;
import com.instagram.user.model.User;

/* renamed from: X.Uqy  reason: case insensitive filesystem */
public final class C16235Uqy extends VP2 {
    public final W1W A00;
    public final C18782W1i A01;
    public final C231142qw A02;
    public final X9C A03;

    public static final boolean A00(C16235Uqy uqy) {
        User BRo = uqy.A03.BTa().BRo();
        if (BRo == null) {
            return false;
        }
        SellerShoppableFeedType BsB = BRo.A03.BsB();
        if (BsB == SellerShoppableFeedType.A04 || BsB == SellerShoppableFeedType.A05 || BsB == SellerShoppableFeedType.A09) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16235Uqy(W1W w1w, C18782W1i w1i, C231142qw r3, X9C x9c, C18020Vjw vjw) {
        super(vjw);
        C51974G9v.A1M(w1i, vjw, w1w);
        this.A03 = x9c;
        this.A01 = w1i;
        this.A00 = w1w;
        this.A02 = r3;
    }
}
