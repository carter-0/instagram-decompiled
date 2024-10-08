package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.K5n  reason: case insensitive filesystem */
public final class C61393K5n extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AiSettingsAdvancedSettingsEditInstructionFragment";
    public 2da A00;
    public boolean A01;
    public final AnonymousClass0eM A02 = MMA.A00(this, 15);
    public final AnonymousClass0eM A03 = C51975G9x.A0r(this, "add_instruction_entry_point", 0eO.A02, 8);
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass0eM A05 = DbS.A0I(new MMA(this, 18), new MMA(this, 19), MMV.A00((Object) null, this, 38), JTT.A0v());
    public final String A06 = "ai_settings_advanced_settings_edit_instruction_fragment";

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r2 = this.A03;
        this.A01 = 0qQ.A0K(r2.getValue(), "settings_edit_instruction");
        JTO.A0T(this.A02).A0W(DbS.A0t(r2), C60315JjI.A02(this.A05), "advanced_settings_editing");
    }

    public final String getModuleName() {
        return this.A06;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final boolean onBackPressed() {
        AnonymousClass0eM r6 = this.A02;
        LTH A0T = JTO.A0T(r6);
        AnonymousClass0eM r5 = this.A03;
        String A0t = DbS.A0t(r5);
        AnonymousClass0eM r4 = this.A05;
        A0T.A0R(A0t, C60315JjI.A02(r4), "advanced_settings_editing");
        C60963JuL A002 = C60315JjI.A00(r4);
        if (A002 == null || !C51966G9m.A1a(DbV.A12(A002.A01), A002.A02)) {
            return false;
        }
        JTO.A0T(r6).A0U(DbS.A0t(r5), C60315JjI.A02(r4), "advanced_settings_editing");
        C63005Kpv.A00(requireContext(), new MMA(this, 16), new MMA(this, 17), 2131952773, 2131952772);
        return true;
    }

    public final void configureActionBar(2da r4) {
        boolean z;
        boolean A1T = JTU.A1T(r4);
        int i = 2131952662;
        if (this.A01) {
            i = 2131952758;
        }
        r4.Eom(i);
        LYC.A01(r4, this, 9, 2131960992);
        C60963JuL A002 = C60315JjI.A00(this.A05);
        if (A002 != null) {
            z = A002.A04;
        } else {
            z = false;
        }
        r4.ARb(A1T ? 1 : 0, z);
        this.A00 = r4;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(764902800);
        ComposeView A012 = GTX.A01(this, AnonymousClass5PI.A03(new C59111J6t(this, 0), -1347127648), false, false);
        AnonymousClass0fD.A09(-1714792141, A022);
        return A012;
    }
}
