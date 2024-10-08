package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.modal.TransparentModalActivity;

public final class E5P extends AnonymousClass4DH implements AnonymousClass4DU {
    public static final String __redex_internal_original_name = "QuickSnapConsumptionNuxFragment";
    public C320256s4 A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final String A03 = C273654mx.A00(906);

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        FP2.A00(view.requireViewById(R.id.consumption_nux_close_button), 11, this);
        FP2.A00(view.requireViewById(R.id.consumption_nux_bottom_button), 12, this);
        this.A00 = new C320256s4(new FP2((Object) this, 13), AnonymousClass7TF.A0G(view, R.id.consumption_nux_preview_container), this, AnonymousClass7TE.A0l(this.A02));
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MH5(r3, this, viewLifecycleOwner, (AnonymousClass4D7) null, 17), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public static final void A00(E5P e5p) {
        Integer num;
        Bundle bundle = e5p.mArguments;
        if (bundle != null) {
            num = DbV.A0o(bundle, "quick_snap_viewer_request_code_key");
        } else {
            num = null;
        }
        Bundle A0A = DbS.A0A(0);
        AnonymousClass6W8 A0b = DbS.A0b(e5p.requireActivity(), A0A, DbT.A0X(e5p.A02), TransparentModalActivity.class, C273654mx.A00(182));
        A0b.A0H = true;
        A0b.A07();
        if (num != null) {
            A0b.A0A(e5p.requireActivity(), num.intValue());
        } else {
            DbT.A1L(e5p, A0b);
        }
        DbX.A1I(e5p);
    }

    public final String getModuleName() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public E5P() {
        C51765G0h g0h = new C51765G0h(this, 48);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MJ1(new C51765G0h(this, 49), 0));
        this.A01 = DbS.A0I(new MJ1(A002, 1), g0h, new MJ8(6, (Object) null, A002), DbS.A0z(AnonymousClass36N.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-977883008);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.quick_snap_consumption_nux_layout, false);
        AnonymousClass0fD.A09(1082413188, A022);
        return A0D;
    }
}
