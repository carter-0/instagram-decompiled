package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.payments.checkout.CheckoutLaunchParams;

/* renamed from: X.WNm  reason: case insensitive filesystem */
public final class C19154WNm implements X6J {
    public CheckoutLaunchParams A00;
    public C11190SEq A01;

    public final void AJ3(Context context, 2da r6) {
        r6.Eu4(true);
        DbX.A1A(new WBG(70, context, this), DbV.A0K(), r6);
        r6.ETj((UserSession) null, R.layout.blank_nav_bar, 2Yu.A0G(context, R.attr.actionBarStartSpacing), 0);
    }

    public final void onDestroy() {
    }
}
