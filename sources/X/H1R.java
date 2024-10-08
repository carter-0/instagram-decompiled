package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.instagram.profile.fragment.UserDetailTabController;

public final class H1R extends AnonymousClass4DH implements AnonymousClass723 {
    public static final String __redex_internal_original_name = "PotatoProfileTabFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01;
    public final String A02 = "potato_profile_tab_fragment";

    public final String BhI() {
        return C273654mx.A00(369);
    }

    public final void Daz(UserDetailTabController userDetailTabController) {
    }

    public final void DqG(boolean z) {
    }

    public final void DqL(boolean z) {
    }

    public final void DqM() {
    }

    public final Fragment ACU() {
        return this;
    }

    public final ViewGroup BqB() {
        return null;
    }

    public final String getModuleName() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public H1R() {
        C51802G2l g2l = new C51802G2l(this, 25);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51802G2l((Object) new C51802G2l((Object) this, 22), 23));
        this.A01 = DbS.A0I(new C51802G2l((Object) A002, 24), g2l, new MJ4(11, (Object) null, A002), DbS.A0z(C60125Jg6.class));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(874474063);
        H1R.super.onCreate(bundle);
        String string = requireArguments().getString(AnonymousClass000.A00(1101));
        if (string != null) {
            2YL A0H = DbS.A0H(this.A01);
            AnonymousClass7TE.A1Z(new MEW(A0H, string, (AnonymousClass4D7) null, 14, true), C318116oQ.A00(A0H));
        }
        AnonymousClass0fD.A09(956833479, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1277912816);
        ComposeView A002 = GTX.A00(this, AnonymousClass5PI.A04(new C59343JFv(this, 1), -925584425, true));
        AnonymousClass0fD.A09(-987157414, A022);
        return A002;
    }
}
