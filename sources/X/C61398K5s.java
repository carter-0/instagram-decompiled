package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.aistudio.editor.AiSettingsRepository;

/* renamed from: X.K5s  reason: case insensitive filesystem */
public final class C61398K5s extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AiEditInstructionFragment";
    public 2da A00;
    public boolean A01;
    public final AnonymousClass0eM A02 = MMM.A00(this, 27);
    public final AnonymousClass0eM A03 = C51975G9x.A0r(this, "add_instruction_entry_point", 0eO.A02, 6);
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass0eM A05 = DbS.A0I(new MMM(this, 32), new MMM(this, 33), MMV.A00((Object) null, this, 30), JTT.A0v());
    public final String A06 = "ai_edit_instruction_fragment";

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r2 = this.A03;
        this.A01 = 0qQ.A0K(r2.getValue(), "settings_edit_instruction");
        JTO.A0T(this.A02).A0W(DbS.A0t(r2), C60315JjI.A02(this.A05), "basic_settings");
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
        A0T.A0R(A0t, C60315JjI.A02(r4), "basic_settings");
        C60963JuL A002 = C60315JjI.A00(r4);
        if (A002 == null || !C51966G9m.A1a(DbV.A12(A002.A01), A002.A02)) {
            return false;
        }
        JTO.A0T(r6).A0U(DbS.A0t(r5), C60315JjI.A02(r4), "basic_settings");
        C63005Kpv.A00(requireContext(), new MMM(this, 29), new MMM(this, 30), 2131952773, 2131952772);
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
        LYC.A01(r4, this, 6, 2131960992);
        C60963JuL A002 = C60315JjI.A00(this.A05);
        if (A002 != null) {
            z = A002.A04;
        } else {
            z = false;
        }
        r4.ARb(A1T ? 1 : 0, z);
        this.A00 = r4;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-259216125);
        C61398K5s.super.onCreate(bundle);
        String string = requireArguments().getString("persona_id");
        boolean A0K = 0qQ.A0K(requireArguments().getString("add_instruction_entry_point"), "in_thread_instruction");
        boolean z = requireArguments().getBoolean("is_public_ai_agent");
        if (!(!A0K || string == null || string.length() == 0)) {
            AnonymousClass0eM r3 = this.A05;
            JTO.A0S(r3).A0C(string);
            AiSettingsRepository aiSettingsRepository = JTO.A0S(r3).A00;
            MGE.A01(aiSettingsRepository, string, aiSettingsRepository.A01, 2);
            JTO.A0S(r3).A0G(true, z);
        }
        AnonymousClass0fD.A09(1270352989, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-227367685);
        ComposeView A0H = DbV.A0H(this, new MPO(this, 43), -75436640);
        AnonymousClass0fD.A09(-118531783, A022);
        return A0H;
    }
}
