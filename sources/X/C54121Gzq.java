package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Gzq  reason: case insensitive filesystem */
public final class C54121Gzq extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "SchoolOnboardingAddCompletionBottomSheetFragment";
    public C54672HOd A00 = C54672HOd.QP;
    public String A01 = "";
    public String A02 = "";
    public C62320sa A03 = C58487Isi.A00;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new C58681Ivq(this, 5));
    public final AnonymousClass0eM A05 = C227642jf.A02(this);

    public final String getModuleName() {
        return "school_onboarding";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        INA A0z = C51966G9m.A0z(this.A04);
        C54672HOd hOd = this.A00;
        C54684HOp hOp = C54684HOp.SUCCESS_BOTTOMSHEET;
        String str = this.A02;
        AnonymousClass7TG.A1T(hOd, hOp, str);
        C51976G9y.A0U(hOd, hOp, INA.A00(A0z), "ig_school_registration_page_impression", str);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1369517863);
        ComposeView A0H = DbV.A0H(this, new C59343JFv(this, 37), -2056508171);
        AnonymousClass0fD.A09(736081157, A022);
        return A0H;
    }
}
