package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Gzl  reason: case insensitive filesystem */
public final class C54116Gzl extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "SchoolManagementBottomSheetFragment";
    public C55738HmZ A00;
    public String A01 = "";
    public boolean A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new C58681Ivq(this, 4));
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final String getModuleName() {
        return "school_management";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C51966G9m.A0z(this.A03).A04(C54672HOd.PROFILE_BIO, C54684HOp.RELIABILITY_PAGE_GENERAL);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1565315747);
        ComposeView A0H = DbV.A0H(this, new C59343JFv(this, 36), -385763565);
        AnonymousClass0fD.A09(1856158685, A022);
        return A0H;
    }
}
