package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.aistudio.editor.AiSettingsRepository;

/* renamed from: X.K5r  reason: case insensitive filesystem */
public final class C61397K5r extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AiEditExampleDialogueFragment";
    public 2da A00;
    public boolean A01;
    public final AnonymousClass0eM A02 = MMM.A00(this, 18);
    public final AnonymousClass0eM A03 = C51975G9x.A0r(this, "add_example_dialog_entry_point", 0eO.A02, 5);
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass0eM A05 = DbS.A0I(new MMM(this, 22), new MMM(this, 23), MMV.A00((Object) null, this, 27), JTT.A0v());
    public final String A06 = "ai_edit_example_dialogue_fragment";

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        r4.Eu4(true);
        int i = 2131952660;
        if (this.A01) {
            i = 2131952754;
        }
        r4.Eom(i);
        r4.AA9(new LY8(1, r4, this), 2131960992);
        this.A00 = r4;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r2 = this.A03;
        this.A01 = 0qQ.A0K(r2.getValue(), "settings_edit_example_dialogue");
        JTO.A0T(this.A02).A0Q(DbS.A0t(r2), C60315JjI.A02(this.A05), "basic_settings");
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
        A0T.A0L(A0t, C60315JjI.A02(r4), "basic_settings");
        if (!JTO.A0S(r4).A0H()) {
            return false;
        }
        JTO.A0T(r6).A0N(DbS.A0t(r5), C60315JjI.A02(r4), "basic_settings");
        C63005Kpv.A00(requireContext(), new MMM(this, 19), new MMM(this, 20), 2131952763, 2131952762);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(928772306);
        C61397K5r.super.onCreate(bundle);
        String string = requireArguments().getString("user_message_text");
        String string2 = requireArguments().getString("bot_message_text");
        String string3 = requireArguments().getString("persona_id");
        boolean A0K = 0qQ.A0K(this.A03.getValue(), "in_thread_add_example_dialogue");
        boolean z = requireArguments().getBoolean("is_public_ai_agent");
        if (!(!A0K || string3 == null || string3.length() == 0)) {
            AnonymousClass0eM r3 = this.A05;
            JTO.A0S(r3).A0C(string3);
            AiSettingsRepository aiSettingsRepository = JTO.A0S(r3).A00;
            MGE.A01(aiSettingsRepository, string3, aiSettingsRepository.A01, 1);
            if (string == null) {
                string = "";
            }
            if (string2 == null) {
                string2 = "";
            }
            JTO.A0S(r3).A0A(new N49(string, string2, 4), -1, true, z);
        }
        AnonymousClass0fD.A09(455752068, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1434300909);
        ComposeView A0H = DbV.A0H(this, new MPO(this, 42), -1205945056);
        AnonymousClass0fD.A09(1055846866, A022);
        return A0H;
    }
}
