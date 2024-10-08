package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class K59 extends AnonymousClass4DH implements AnonymousClass4DS, C66499MUd {
    public static final String __redex_internal_original_name = "AiCreationConfigurationFragment";
    public final AnonymousClass0eM A00 = AnonymousClass1YB.A00(C66301MMk.A01(this, 44));
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02 = DbS.A0I(C66301MMk.A01(this, 45), C66301MMk.A01(this, 46), MMV.A00((Object) null, this, 17), JTT.A0w());

    public final String getModuleName() {
        return "ai_creation_configuration_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        LTH A0T = JTO.A0T(this.A00);
        AnonymousClass0eM r0 = this.A02;
        String A022 = C60316JjJ.A02(r0);
        String A012 = C60316JjJ.A01(r0);
        1Ln A002 = LTH.A00(A0T);
        if (DbT.A1Y(A002)) {
            JTT.A1G(A002, JTU.A0W(A002, "ai_configuration_screen_shown", A022), A012);
        }
    }

    public final void CwS(String str) {
        JTO.A0R(this.A02).A0A(str);
    }

    public final void D4E() {
        KX0 kx0 = JTO.A0R(this.A02).A00;
        JTP.A1W(kx0.A0K, C63112Krf.A00(kx0.A03));
    }

    public final void DkV(boolean z) {
        LTH A0T = JTO.A0T(this.A00);
        AnonymousClass0eM r4 = this.A02;
        String A022 = C60316JjJ.A02(r4);
        String A012 = C60316JjJ.A01(r4);
        1Ln A002 = LTH.A00(A0T);
        if (DbT.A1Y(A002)) {
            JTT.A1G(A002, JTU.A0W(A002, "ai_configuration_screen_show_on_profile_row_clicked", A022), A012);
        }
        JTO.A0R(r4).A0E(z);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.Eom(2131952696);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1572276546);
        ComposeView A0H = DbV.A0H(this, new MPO(this, 36), -1725909248);
        AnonymousClass0fD.A09(1294541042, A022);
        return A0H;
    }
}
