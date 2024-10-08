package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.K5k  reason: case insensitive filesystem */
public final class C61390K5k extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AiCreationAdvancedSettingsEditExampleDialogueFragment";
    public 2da A00;
    public boolean A01;
    public final AnonymousClass0eM A02 = C66301MMk.A00(this, 28);
    public final AnonymousClass0eM A03 = C51975G9x.A0r(this, "add_example_dialog_entry_point", 0eO.A02, 0);
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass0eM A05 = DbS.A0I(C66301MMk.A01(this, 31), C66301MMk.A01(this, 32), MMV.A00((Object) null, this, 12), JTT.A0w());
    public final String A06 = "ai_creation_advanced_settings_edit_example_dialog_fragment";

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r2 = this.A03;
        this.A01 = 0qQ.A0K(r2.getValue(), "settings_edit_example_dialogue");
        AnonymousClass0eM r4 = this.A02;
        JTO.A0T(r4).A0Q(DbS.A0t(r2), C60316JjJ.A02(this.A05), "advanced_settings_creation");
        if (LST.A03(AnonymousClass7TE.A0l(this.A04))) {
            1Ln A002 = LTH.A00(JTO.A0T(r4));
            if (DbT.A1Y(A002)) {
                A002.A0l("advanced_settings_screen_example_dialogue_response_field_regeneration_icon_rendered");
                JTU.A17(A002, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "creation");
            }
        }
    }

    public final String getModuleName() {
        return this.A06;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final boolean onBackPressed() {
        AnonymousClass0eM r7 = this.A02;
        LTH A0T = JTO.A0T(r7);
        AnonymousClass0eM r6 = this.A03;
        String A0t = DbS.A0t(r6);
        AnonymousClass0eM r5 = this.A05;
        A0T.A0L(A0t, C60316JjJ.A02(r5), "advanced_settings_creation");
        Object value = JTO.A0R(r5).A0N.getValue();
        if (value != null) {
            C60967JuP juP = (C60967JuP) value;
            N49 n49 = juP.A01;
            String A12 = DbV.A12(n49.A00);
            N49 n492 = juP.A02;
            if (!0qQ.A0K(A12, n492.A00) || !0qQ.A0K(DbV.A12(n49.A01), n492.A01)) {
                JTO.A0T(r7).A0N(DbS.A0t(r6), C60316JjJ.A02(r5), "advanced_settings_creation");
                C63005Kpv.A00(requireContext(), C66301MMk.A01(this, 29), C66301MMk.A01(this, 30), 2131952763, 2131952762);
                return true;
            }
            JTO.A0R(r5).A04();
            return false;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void configureActionBar(2da r4) {
        boolean A1T = JTU.A1T(r4);
        int i = 2131952660;
        if (this.A01) {
            i = 2131952754;
        }
        r4.Eom(i);
        r4.AA9(new LY8(A1T ? 1 : 0, r4, this), 2131960992);
        this.A00 = r4;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1748386732);
        ComposeView A0H = DbV.A0H(this, new MPO(this, 28), 813578144);
        AnonymousClass0fD.A09(-443084201, A022);
        return A0H;
    }
}
