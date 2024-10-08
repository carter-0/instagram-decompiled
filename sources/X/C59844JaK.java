package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;

/* renamed from: X.JaK  reason: case insensitive filesystem */
public final class C59844JaK extends AnonymousClass4DH implements AnonymousClass4DS, 2cd {
    public static final String __redex_internal_original_name = "SettingsScreenFragment";
    public C331157Pu A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        r2.Etr(false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        AnonymousClass378 r0 = this._fragmentVisibilityDetector;
        if (r0 != null) {
            r0.A01(this);
            super.onViewCreated(view, bundle);
            07U r3 = 07U.A05;
            AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
            AnonymousClass7TE.A1Z(new C59845JaL(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 4), AnonymousClass07a.A00(viewLifecycleOwner));
            if (bundle != null) {
                A00(this).A05();
            }
            if (this.A05.getValue() == C21251XQw.MAIN_SETTINGS_SCREEN) {
                ((2bu) this.A04.getValue()).Dh3();
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final SettingsScreenViewModel A00(C59844JaK jaK) {
        return (SettingsScreenViewModel) jaK.A08.getValue();
    }

    public final String getModuleName() {
        return AnonymousClass7TF.A0j(((C21251XQw) this.A05.getValue()).name());
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public C59844JaK() {
        0eO r5 = 0eO.A02;
        this.A05 = C46573DhF.A00(this, r5, 49);
        this.A03 = C46573DhF.A00(this, r5, 47);
        this.A01 = C46573DhF.A00(this, r5, 42);
        C20699WxV wxV = new C20699WxV(this, 3);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r5, new C20699WxV(new C20699WxV(this, 0), 1));
        this.A08 = DbS.A0I(new C20699WxV(A002, 2), wxV, new C20613Wvu(9, A002, (Object) null), DbS.A0z(SettingsScreenViewModel.class));
        this.A07 = AnonymousClass1YB.A00(MLW.A00);
        this.A02 = AnonymousClass1YB.A00(new C46573DhF(this, 46));
        this.A04 = C46573DhF.A00(this, r5, 48);
    }

    public final void DGk(Fragment fragment, boolean z) {
        SettingsScreenViewModel A002 = A00(this);
        if (z) {
            A002.A05();
        } else {
            C51970G9q.A1S(A002.A03);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-316401911);
        ComposeView A0H = DbV.A0H(this, new JG2(48, bundle, this), 48778782);
        AnonymousClass0fD.A09(-509036986, A022);
        return A0H;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(2067766378);
        super.onResume();
        AnonymousClass0fD.A09(-395960216, A022);
    }
}
