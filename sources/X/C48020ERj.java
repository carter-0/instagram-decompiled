package X;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.ERj  reason: case insensitive filesystem */
public final class C48020ERj extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PromoPaymentsFragment";
    public UserSession A00;

    public final String getModuleName() {
        return "settings_promo_payments_options";
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final void configureActionBar(2da r20) {
        2da r2 = r20;
        r2.Eom(2131969234);
        r2.Eu4(true);
        if (getContext() != null) {
            r2.ErJ(new AnonymousClass57Z((Resources.Theme) null, Dbb.A0A(getContext(), this), (ColorFilter) null, (Drawable) null, (Drawable) null, (View.OnClickListener) null, AnonymousClass05K.A00, -2, -2, -2, -2, -2, -2, -2, true));
        }
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1818280668);
        super.onCreate(bundle);
        this.A00 = DbX.A0U(this);
        AnonymousClass0fD.A09(-2051486250, A02);
    }

    public final void onResume() {
        int A02 = AnonymousClass0fD.A02(-260362329);
        super.onResume();
        ArrayList A1C = AnonymousClass7TE.A1C();
        C47518E6c.A02(requireContext(), this, A1C, 32, 2131953829);
        setItems(A1C);
        setItems(A1C);
        AnonymousClass0fD.A09(1713873437, A02);
    }
}
