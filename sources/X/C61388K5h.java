package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.android.R;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.K5h  reason: case insensitive filesystem */
public final class C61388K5h extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AiCreationAdvancedSettingsFragment";
    public 2da A00;
    public final AnonymousClass0eM A01 = C66301MMk.A00(this, 38);
    public final AnonymousClass0eM A02 = DbS.A0I(C66301MMk.A01(this, 41), C66301MMk.A01(this, 39), MMV.A00((Object) null, this, 14), JTT.A0w());
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final String A04 = "kirby_ai_advanced_settings_fragment";

    public final String getModuleName() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final boolean onBackPressed() {
        JTO.A0R(this.A02).A05();
        1Ln A022 = LTH.A02(this.A01);
        if (!DbT.A1Y(A022)) {
            return false;
        }
        A022.A0l("ai_creation_advanced_settings_back_button_clicked");
        A022.Cgf();
        return false;
    }

    public final void configureActionBar(2da r5) {
        boolean z;
        boolean A1T = JTU.A1T(r5);
        r5.Eom(2131952668);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A0K = getString(2131960992);
        A0K.A0D = R.style.ActionBarTextButton;
        DbX.A19(new LYC((Object) this, 3), A0K, r5);
        C61049Jvn jvn = (C61049Jvn) JTO.A0R(this.A02).A0D.getValue();
        if (jvn != null) {
            z = jvn.A05;
        } else {
            z = false;
        }
        r5.ARb(A1T ? 1 : 0, z);
        this.A00 = r5;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1460829817);
        ComposeView A0H = DbV.A0H(this, new MPO(this, 34), -2094393572);
        AnonymousClass0fD.A09(-1444003746, A022);
        return A0H;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1360112077);
        AnonymousClass0eM r2 = this.A01;
        1Ln A023 = LTH.A02(r2);
        if (DbT.A1Y(A023)) {
            A023.A0l("ai_creation_advanced_settings_screen_shown");
            A023.Cgf();
        }
        if (LST.A03(AnonymousClass7TE.A0l(this.A03))) {
            1Ln A002 = LTH.A00(JTO.A0T(r2));
            if (DbT.A1Y(A002)) {
                A002.A0l("advanced_settings_screen_field_regeneration_icon_rendered");
                JTU.A17(A002, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "creation");
            }
        }
        super.onResume();
        AnonymousClass0fD.A09(-1942994029, A022);
    }
}
