package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.K5t  reason: case insensitive filesystem */
public final class C61399K5t extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "KirbyCustomAiCreationFragment";
    public 2da A00;
    public final AnonymousClass0eM A01 = C51975G9x.A0r(this, "AiStudioArgumentKeys.creation_entry_point", 0eO.A02, 9);
    public final AnonymousClass0eM A02 = MM7.A00(this, 3);
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04 = AnonymousClass1YB.A00(new C66213MIu(this));
    public final AnonymousClass0eM A05 = DbS.A0I(new MM7(this, 4), new MM7(this, 5), new MMZ(0, (Object) null, (Object) this), JTT.A0w());
    public final String A06 = "kirby_custom_ai_creation_fragment";

    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        boolean z = true;
        r5.Eu4(true);
        r5.Eom(2131952696);
        LYC.A01(r5, this, 12, 2131968361);
        if (((CharSequence) JTO.A0R(this.A05).A0M.getValue()).length() <= 0) {
            z = false;
        }
        r5.ARb(0, z);
        this.A00 = r5;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        LTH A0T = JTO.A0T(this.A02);
        String A012 = C60316JjJ.A01(this.A05);
        Object value = this.A01.getValue();
        1Ln A013 = LTH.A01(A0T, value, 1);
        if (DbT.A1Y(A013)) {
            A013.A0l("ai_custom_creation_screen_shown");
            A013.A0v(A012);
            JTU.A17(A013, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, value);
        }
    }

    public final String getModuleName() {
        return this.A06;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final boolean onBackPressed() {
        JTO.A0R(this.A05).A06.Epw("");
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-112758951);
        C61399K5t.super.onCreate(bundle);
        AnonymousClass0eM r3 = this.A05;
        C60316JjJ A0R = JTO.A0R(r3);
        Object value = this.A01.getValue();
        0qQ.A0B(value, 0);
        A0R.A09.Epw(value);
        Object value2 = this.A04.getValue();
        if (value2 != null) {
            JTO.A0R(r3).A0C.Epw(value2);
        }
        AnonymousClass0fD.A09(1582631235, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1734119360);
        ComposeView A0H = DbV.A0H(this, new C59111J6t(this, 5), -1061403328);
        AnonymousClass0fD.A09(-1667167570, A022);
        return A0H;
    }
}
