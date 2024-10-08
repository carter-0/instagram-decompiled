package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.android.R;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.K5f  reason: case insensitive filesystem */
public final class C61387K5f extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AISettingsAdvancedSettingsFragment";
    public 2da A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(new C13346TVt(this, 48));
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03 = DbS.A0I(new C13346TVt(this, 49), C66301MMk.A01(this, 0), MMV.A00((Object) null, this, 2), JTT.A0v());
    public final String A04 = "kirby_ai_settings_advanced_settings_fragment";

    public final String getModuleName() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final boolean onBackPressed() {
        JTO.A0S(this.A03).A07();
        1Ln A022 = LTH.A02(this.A01);
        if (!DbT.A1Y(A022)) {
            return false;
        }
        A022.A0l("ai_settings_advanced_settings_back_button_clicked");
        A022.Cgf();
        return false;
    }

    public final void configureActionBar(2da r4) {
        boolean A1T = JTU.A1T(r4);
        r4.Eom(2131952668);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A0K = getString(2131960992);
        A0K.A0D = R.style.ActionBarTextButton;
        DbX.A19(new LYC((Object) this, A1T ? 1 : 0), A0K, r4);
        this.A00 = r4;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1068023925);
        ComposeView A0H = DbV.A0H(this, new MPO(this, 20), -1499370284);
        AnonymousClass0fD.A09(-167606652, A022);
        return A0H;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1592641858);
        AnonymousClass0eM r2 = this.A01;
        1Ln A023 = LTH.A02(r2);
        if (DbT.A1Y(A023)) {
            A023.A0l("ai_settings_advanced_settings_screen_shown");
            A023.Cgf();
        }
        if (LST.A03(AnonymousClass7TE.A0l(this.A02))) {
            1Ln A002 = LTH.A00(JTO.A0T(r2));
            if (DbT.A1Y(A002)) {
                A002.A0l("advanced_settings_screen_field_regeneration_icon_rendered");
                JTU.A17(A002, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "settings");
            }
        }
        super.onResume();
        AnonymousClass0fD.A09(2102672300, A022);
    }
}
