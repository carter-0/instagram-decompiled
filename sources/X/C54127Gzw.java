package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Gzw  reason: case insensitive filesystem */
public final class C54127Gzw extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "IgOnlyCtmDisclosureBottomSheetFragment";
    public 0wc A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final String getModuleName() {
        return "instagram_deeplink";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0G = AnonymousClass7TF.A0G(view, R.id.ig_only_ctm_discloure_bottom_sheet);
        DbU.A1G(AnonymousClass7TG.A0R(A0G, R.id.title), this, 2131963585);
        DbU.A1G(AnonymousClass7TG.A0R(A0G, R.id.body), this, 2131963583);
        0wc r1 = this.A00;
        if (r1 == null) {
            0qQ.A0F("logger");
            throw AnonymousClass00P.createAndThrow();
        }
        0Aj A0e = AnonymousClass7TE.A0e(r1, "ig_ctm_ig_only_user_disclosure_view_event");
        if (A0e.isSampled()) {
            A0e.A9F("user_igid", Long.valueOf(DbZ.A07(DbU.A0u(this.A01))));
            A0e.Cgf();
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1734770139);
        C54127Gzw.super.onCreate(bundle);
        this.A00 = AnonymousClass0kN.A02(DbT.A0X(this.A01));
        AnonymousClass0fD.A09(-1916293839, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(80021748);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.ig_only_ctm_disclosure_bottom_sheet, viewGroup, false);
        AnonymousClass0fD.A09(522825916, A02);
        return inflate;
    }
}
