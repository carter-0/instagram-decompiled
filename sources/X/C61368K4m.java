package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.K4m  reason: case insensitive filesystem */
public final class C61368K4m extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "TemplateDetailsFragment";
    public final AnonymousClass0eM A00 = MM7.A00(this, 7);
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02 = DbS.A0I(new MM7(this, 8), new MM7(this, 9), new MMZ(2, (Object) null, (Object) this), JTT.A0w());

    public final String getModuleName() {
        return "template_details_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        LTH A0T = JTO.A0T(this.A00);
        String A012 = C60316JjJ.A01(this.A02);
        1Ln A002 = LTH.A00(A0T);
        if (DbT.A1Y(A002)) {
            JTT.A1H(A002, "creation_template_details_screen_shown", A012);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.Eom(2131952704);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1624245996);
        ComposeView A0H = DbV.A0H(this, new C59111J6t(this, 6), 506924320);
        AnonymousClass0fD.A09(520704081, A022);
        return A0H;
    }
}
