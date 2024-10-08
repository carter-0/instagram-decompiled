package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;

public final class ESA extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "DonationOptionsFragment";
    public UserSession A00;
    public AnonymousClass4D6 A01;
    public User A02;
    public boolean A03;

    public final String getModuleName() {
        return "donation_settings";
    }

    public final void configureActionBar(2da r3) {
        int i = 2131954381;
        if (this.A03) {
            i = 2131954385;
        }
        DbW.A1B(r3, i);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public static ArrayList A06(ESA esa) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        int i = 2131954380;
        if (esa.A03) {
            i = 2131954393;
        }
        C47518E6c.A05(esa, A1C, 21, i, AnonymousClass7TG.A1X(esa.A02.A03.BAT()));
        int i2 = 2131954379;
        if (esa.A03) {
            i2 = 2131954392;
        }
        FGF.A00(esa, A1C, i2);
        return A1C;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(916069966);
        super.onCreate(bundle);
        this.A00 = DbX.A0U(this);
        this.A01 = 1ES.A01();
        this.A02 = DbT.A0j(this.A00);
        this.A03 = DbY.A1Y(0Tu.A06, this.A00, 36313862588336397L);
        AnonymousClass0fD.A09(453372704, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1981996584);
        super.onResume();
        setItems(A06(this));
        AnonymousClass0fD.A09(-1781490095, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        setItems(A06(this));
        UserSession userSession = this.A00;
        Boolean BAT = this.A02.A03.BAT();
        if (BAT == null || !BAT.booleanValue()) {
            str = "disabled";
        } else {
            str = "enabled";
        }
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("profile_fundraiser_initial_state", str);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this, userSession), "ig_cg_view_donation_settings");
        A0e.A9H(AnonymousClass000.A00(2659), A1E);
        A0e.Cgf();
    }
}
