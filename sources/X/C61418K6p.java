package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.Map;

/* renamed from: X.K6p  reason: case insensitive filesystem */
public final class C61418K6p extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "HighlightsSettingsFragment";
    public final C64494Lcv A00 = new C64494Lcv(this);
    public final Map A01 = AnonymousClass7TE.A1H();
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03;

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.setTitle(DbV.A05(this).getString(2131961454));
        r3.EVS(true);
        r3.Eu4(true);
    }

    public final String getModuleName() {
        return "reel_highlights_settings";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public C61418K6p() {
        MME mme = new MME(this, 12);
        AnonymousClass0eM A002 = MME.A00(new MME(this, 9), 0eO.A02, 10);
        this.A03 = DbS.A0I(new MME(A002, 11), mme, new MMZ(43, (Object) null, (Object) A002), DbS.A0z(C60103Jfj.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1772480826);
        ComposeView A0H = DbV.A0H(this, new C59111J6t(this, 14), 916323101);
        AnonymousClass0fD.A09(-257445781, A022);
        return A0H;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1812475643);
        super.onResume();
        ((C60103Jfj) this.A03.getValue()).A0E();
        AnonymousClass0fD.A09(-2145565385, A022);
    }
}
