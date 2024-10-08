package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.android.R;

/* renamed from: X.K5p  reason: case insensitive filesystem */
public final class C61395K5p extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AiPreparationFragment";
    public final AnonymousClass0eM A00 = MMA.A00(this, 3);
    public final AnonymousClass0eM A01 = MMA.A00(this, 4);
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03 = DbS.A0I(new MMA(this, 5), new MMA(this, 6), MMV.A00((Object) null, this, 36), JTT.A0w());
    public final 1wn A04 = C64698LgT.A00(this, 0);
    public final String A05 = "kirby_ai_preparation_fragment";

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        r4.setTitle("");
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A0K = getString(2131956164);
        A0K.A0D = R.style.ActionBarTextButton;
        DbX.A19(new LYC((Object) this, 8), A0K, r4);
    }

    public final String getModuleName() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final boolean onBackPressed() {
        LTH A0T = JTO.A0T(this.A00);
        AnonymousClass0eM r4 = this.A03;
        String A022 = C60316JjJ.A02(r4);
        String A012 = C60316JjJ.A01(r4);
        1Ln A002 = LTH.A00(A0T);
        if (DbT.A1Y(A002)) {
            JTT.A1G(A002, JTU.A0W(A002, "creation_preparation_screen_dismiss_clicked", A022), A012);
        }
        AnonymousClass7I6 A0U = JTO.A0U(this.A01);
        A0U.A06.markerPoint(673059101, "ai_preparation_screen_back_button_clicked");
        A0U.A03 = true;
        C48314EcX.A00(requireActivity(), "ugc_ai_creation");
        JTO.A0R(r4).A07();
        DbX.A1I(this);
        return true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-296565543);
        ComposeView A0H = DbV.A0H(this, new MPO(this, 47), 890927296);
        AnonymousClass0fD.A09(-1183045488, A022);
        return A0H;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-411690388);
        C61395K5p.super.onPause();
        DbX.A0R(this.A02).A02(this.A04, 2Kb.class);
        AnonymousClass0fD.A09(612698572, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1556499869);
        super.onResume();
        DbX.A0R(this.A02).A01(this.A04, 2Kb.class);
        LTH A0T = JTO.A0T(this.A00);
        AnonymousClass0eM r0 = this.A03;
        String A023 = C60316JjJ.A02(r0);
        String A012 = C60316JjJ.A01(r0);
        1Ln A002 = LTH.A00(A0T);
        if (DbT.A1Y(A002)) {
            JTT.A1G(A002, JTU.A0W(A002, "creation_preparation_screen_shown", A023), A012);
        }
        JTO.A0U(this.A01).A06.markerPoint(673059101, "ai_preparation_screen_shown");
        AnonymousClass0fD.A09(-1290706686, A022);
    }
}
