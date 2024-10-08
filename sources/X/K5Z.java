package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.ArrayList;
import java.util.List;

public final class K5Z extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AiCrossAppDiscoverabilityFragment";
    public final AnonymousClass0eM A00 = MMM.A00(this, 13);
    public final AnonymousClass0eM A01 = DbS.A0I(new MMM(this, 16), new MMM(this, 14), MMV.A00((Object) null, this, 24), JTT.A0w());
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03 = DbS.A0I(new MMM(this, 17), new MMM(this, 15), MMV.A00((Object) null, this, 25), JTT.A0v());

    public final String getModuleName() {
        return "ai_cross_app_discoverability_fragment";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.Eom(2131952701);
    }

    public final boolean onBackPressed() {
        List list;
        String string = requireArguments().getString("arg_entry_point");
        if (string == null || string.hashCode() != 395261206 || !string.equals("AI_CREATION")) {
            list = ((C61014JvE) JTO.A0S(this.A03).A0J.getValue()).A0D;
        } else {
            list = ((C61011JvB) JTO.A0R(this.A01).A0H.getValue()).A0A;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (((C61055Jvt) next).A03) {
                A1C.add(next);
            }
        }
        String A0z = DbT.A0z(",", A1C, MNP.A00);
        1Ln A022 = LTH.A02(this.A00);
        if (DbT.A1Y(A022)) {
            A022.A0l("settings_main_screen_discoverability_clicked");
            JTU.A17(A022, "discoverability_apps", A0z);
        }
        return false;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-462986154);
        ComposeView A0H = DbV.A0H(this, new MPO(this, 41), 1817446944);
        AnonymousClass0fD.A09(1165518710, A022);
        return A0H;
    }
}
