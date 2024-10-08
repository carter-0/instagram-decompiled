package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.K4r  reason: case insensitive filesystem */
public final class C61373K4r extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AiCreationNuxFragment";
    public final AnonymousClass0eM A00 = C51975G9x.A0r(this, "AiStudioArgumentKeys.creation_entry_point", 0eO.A02, 3);
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02 = DbS.A0I(new MMM(this, 4), new MMM(this, 5), MMV.A00((Object) null, this, 22), JTT.A0w());

    public final String getModuleName() {
        return "ai_creation_nux_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        LTH A03 = LTH.A03(this.A01);
        String A0t = DbS.A0t(this.A00);
        AnonymousClass0eM r0 = this.A02;
        A03.A06(C60316JjJ.A00(r0), A0t, C60316JjJ.A01(r0));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.Eom(2131952696);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-173475070);
        C61373K4r.super.onCreate(bundle);
        AnonymousClass0eM r5 = this.A02;
        KX0 kx0 = JTO.A0R(r5).A00;
        AnonymousClass7TE.A1Z(new C59676JTh((Object) kx0, (AnonymousClass4D7) null, 41), kx0.A01);
        C60316JjJ A0R = JTO.A0R(r5);
        Object value = this.A00.getValue();
        0qQ.A0B(value, 0);
        A0R.A09.Epw(value);
        AnonymousClass0fD.A09(1635861915, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-951826302);
        ComposeView A0H = DbV.A0H(this, new MPO(this, 38), -175024416);
        AnonymousClass0fD.A09(1259589505, A022);
        return A0H;
    }
}
