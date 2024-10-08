package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class K5g extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AiConversationFragment";
    public 2da A00;
    public final AnonymousClass0eM A01 = C66301MMk.A00(this, 19);
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03 = DbS.A0I(C66301MMk.A01(this, 22), C66301MMk.A01(this, 23), MMV.A00((Object) null, this, 10), JTT.A0v());
    public final String A04 = "ai_conversation_fragment";

    public final void configureActionBar(2da r4) {
        boolean z;
        0qQ.A0B(r4, 0);
        r4.Eu4(true);
        r4.Eom(2131952799);
        LYC.A01(r4, this, 1, 2131960992);
        C61077JwF jwF = (C61077JwF) JTO.A0S(this.A03).A0D.getValue();
        if (jwF != null) {
            z = jwF.A02;
        } else {
            z = false;
        }
        r4.ARb(0, z);
        this.A00 = r4;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        LTH A0T = JTO.A0T(this.A01);
        String A022 = C60315JjI.A02(this.A03);
        1Ln A002 = LTH.A00(A0T);
        if (DbT.A1Y(A002)) {
            A002.A0j(JTU.A0W(A002, "settings_conversation_shown", A022));
            A002.Cgf();
        }
    }

    public final String getModuleName() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final boolean onBackPressed() {
        AnonymousClass0eM r4 = this.A01;
        LTH A0T = JTO.A0T(r4);
        AnonymousClass0eM r3 = this.A03;
        String A022 = C60315JjI.A02(r3);
        boolean A0J = JTO.A0S(r3).A0J();
        boolean A0I = JTO.A0S(r3).A0I();
        1Ln A002 = LTH.A00(A0T);
        if (DbT.A1Y(A002)) {
            A002.A0l("settings_conversation_back_clicked");
            A002.A0x(DbY.A0p("has_icebreaker_changed", String.valueOf(A0I), AnonymousClass7TE.A1L("has_welcome_message_changed", String.valueOf(A0J))));
            A002.A0j(DbZ.A0d(A022));
            A002.Cgf();
        }
        C61077JwF jwF = (C61077JwF) JTO.A0S(r3).A0D.getValue();
        if (jwF == null || !jwF.A02) {
            return false;
        }
        LTH A0T2 = JTO.A0T(r4);
        String A023 = C60315JjI.A02(r3);
        1Ln A003 = LTH.A00(A0T2);
        if (DbT.A1Y(A003)) {
            A003.A0j(JTU.A0W(A003, "settings_conversation_exit_confirmation_shown", A023));
            A003.Cgf();
        }
        C63005Kpv.A00(requireContext(), C66301MMk.A01(this, 20), C66301MMk.A01(this, 21), 2131952717, 2131952716);
        return true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(344145880);
        ComposeView A0H = DbV.A0H(this, new MPO(this, 26), 568693854);
        AnonymousClass0fD.A09(1742872607, A022);
        return A0H;
    }
}
