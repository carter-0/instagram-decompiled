package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.K5d  reason: case insensitive filesystem */
public final class C61385K5d extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AiCapabilitiesFragment";
    public final AnonymousClass0eM A00 = C66301MMk.A00(this, 16);
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02 = DbS.A0I(C66301MMk.A01(this, 17), C66301MMk.A01(this, 18), MMV.A00((Object) null, this, 9), JTT.A0v());
    public final String A03 = "ai_capabilities_fragment";

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        LTH A0T = JTO.A0T(this.A00);
        String A022 = C60315JjI.A02(this.A02);
        1Ln A002 = LTH.A00(A0T);
        if (DbT.A1Y(A002)) {
            A002.A0j(JTU.A0W(A002, "settings_capabilities_screen_shown", A022));
            A002.Cgf();
        }
    }

    public final String getModuleName() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final boolean onBackPressed() {
        String str;
        List list;
        AnonymousClass0eM r5 = this.A00;
        LTH A0T = JTO.A0T(r5);
        AnonymousClass0eM r4 = this.A02;
        String A022 = C60315JjI.A02(r4);
        1Ln A002 = LTH.A00(A0T);
        if (DbT.A1Y(A002)) {
            A002.A0j(JTU.A0W(A002, "settings_capabilities_back_button_clicked", A022));
            A002.Cgf();
        }
        C61082JwK jwK = (C61082JwK) JTO.A0S(r4).A0C.getValue();
        if (jwK == null || (list = (List) jwK.A00) == null) {
            str = null;
        } else {
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : list) {
                if (DbX.A1a(((GSY) next).A00)) {
                    A1C.add(next);
                }
            }
            str = DbT.A0z(",", A1C, MNO.A00);
        }
        LTH A0T2 = JTO.A0T(r5);
        String A023 = C60315JjI.A02(r4);
        if (str == null) {
            str = "";
        }
        1Ln A003 = LTH.A00(A0T2);
        if (!DbT.A1Y(A003)) {
            return false;
        }
        A003.A0l("settings_main_screen_capabilities_clicked");
        A003.A0x(AnonymousClass7TF.A0w("capability_options", str));
        A003.A0j(DbZ.A0d(A023));
        A003.Cgf();
        return false;
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.Eom(2131952798);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(152531510);
        ComposeView A0H = DbV.A0H(this, new MPO(this, 24), 1802518904);
        AnonymousClass0fD.A09(-1928734369, A022);
        return A0H;
    }
}
