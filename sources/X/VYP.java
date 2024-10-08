package X;

import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

public final class VYP {
    public ViewGroup A00;
    public final IgdsBottomButtonLayout A01;
    public final UBX A02;
    public final UserSession A03;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.3kE, X.UBX] */
    public VYP(ViewGroup viewGroup, UserSession userSession) {
        AnonymousClass7TG.A1O(viewGroup, userSession);
        this.A00 = viewGroup;
        this.A03 = userSession;
        ? r1 = new C249703kE(viewGroup);
        r1.A02 = DbW.A0B(viewGroup, R.id.subtotal_row_title);
        r1.A01 = DbW.A0B(viewGroup, R.id.subtotal_row_subtitle);
        r1.A00 = DbW.A0B(viewGroup, R.id.subtotal_amount);
        this.A02 = r1;
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) this.A00.requireViewById(R.id.merchant_cart_checkout_bottom_button);
        this.A01 = igdsBottomButtonLayout;
        igdsBottomButtonLayout.setPrimaryButtonEnabled(false);
        igdsBottomButtonLayout.setPrimaryActionText(DbU.A05(igdsBottomButtonLayout).getString(2131963107));
    }
}
