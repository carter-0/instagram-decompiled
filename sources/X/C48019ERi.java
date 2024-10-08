package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.ERi  reason: case insensitive filesystem */
public final class C48019ERi extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "InternalOptionsFragment";
    public UserSession A00;

    public final String getModuleName() {
        return "settings_internal_options";
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final void configureActionBar(2da r2) {
        C47518E6c.A04(this, r2, 2131964444);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1696388975);
        super.onCreate(bundle);
        this.A00 = DbX.A0U(this);
        AnonymousClass0fD.A09(-1368965558, A02);
    }

    public final void onResume() {
        int A02 = AnonymousClass0fD.A02(-2039398589);
        super.onResume();
        UserSession userSession = this.A00;
        C49603EzM ezM = new C49603EzM(requireContext(), this.mFragmentManager, requireActivity(), userSession);
        ArrayList A1C = AnonymousClass7TE.A1C();
        UserSession userSession2 = this.A00;
        0Tu r6 = 0Tu.A05;
        if (DbY.A1Y(r6, userSession2, 36312522558538907L)) {
            C47518E6c.A02(ezM.A00, ezM, A1C, 19, 2131976876);
        }
        if (DbY.A1Y(r6, this.A00, 36313514697885747L)) {
            C47518E6c.A02(ezM.A00, ezM, A1C, 20, 2131966447);
        }
        if (2R8.A00(this.A00)) {
            C47518E6c.A02(ezM.A00, ezM, A1C, 18, 2131975079);
        }
        setItems(A1C);
        AnonymousClass0fD.A09(833242000, A02);
    }
}
