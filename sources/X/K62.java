package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class K62 extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS, C66499MUd {
    public static final String __redex_internal_original_name = "AiCreationAdvancedEditFragment";
    public final AnonymousClass0eM A00 = C66301MMk.A00(this, 25);
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02 = DbS.A0I(C66301MMk.A01(this, 26), C66301MMk.A01(this, 27), MMV.A00((Object) null, this, 11), JTT.A0w());
    public final String A03 = "kirby_ai_creation_advanced_edit_fragment";

    public final void CwS(String str) {
        JTO.A0R(this.A02).A0A(str);
    }

    public final void D4E() {
        KX0 kx0 = JTO.A0R(this.A02).A00;
        JTP.A1W(kx0.A0K, C63112Krf.A00(kx0.A03));
    }

    public final void DkV(boolean z) {
        JTO.A0R(this.A02).A0E(z);
    }

    public final String getModuleName() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final boolean onBackPressed() {
        1Ln A022 = LTH.A02(this.A00);
        if (!DbT.A1Y(A022)) {
            return false;
        }
        A022.A0l("ai_creation_advanced_settings_back_button_clicked");
        A022.Cgf();
        return false;
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.Eom(2131952704);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-18693750);
        ComposeView A0H = DbV.A0H(this, new MPO(this, 27), 472283342);
        AnonymousClass0fD.A09(1542836475, A022);
        return A0H;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-355853269);
        1Ln A023 = LTH.A02(this.A00);
        if (DbT.A1Y(A023)) {
            A023.A0l("creation_advanced_edit_screen_shown");
            A023.Cgf();
        }
        super.onResume();
        AnonymousClass0fD.A09(-2061184215, A022);
    }
}
