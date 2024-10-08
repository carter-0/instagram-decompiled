package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.E0p  reason: case insensitive filesystem */
public final class C47397E0p extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "RestrictLearnMoreBottomSheet";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return "restrict_learn_more_fragment";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-2132162331);
        C47397E0p.super.onCreate(bundle);
        AnonymousClass0fD.A09(-2086962742, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1611492856);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_restrict_learn_more_bottom_sheet, false);
        AnonymousClass0fD.A09(-609145967, A02);
        return A0D;
    }
}
