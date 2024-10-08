package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class E2I extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CreatorMonetizationStatusSettingFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01 = C51791G2a.A00(this, 15);
    public final AnonymousClass0eM A02;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, ((C46757Dkk) this.A02.getValue()).A00);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Dba.A17(DbZ.A0F(view, R.id.product_settings_recycle_view), this.A01);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66170MGh(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 47), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public E2I() {
        C51791G2a g2a = new C51791G2a(this, 19);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51791G2a(new C51791G2a(this, 16), 17));
        this.A02 = DbS.A0I(new C51791G2a(A002, 18), g2a, new MJ4(0, (Object) null, A002), DbS.A0z(C46757Dkk.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1678034109);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.monetization_product_settings_layout, viewGroup, false);
        AnonymousClass0fD.A09(-812354429, A022);
        return inflate;
    }
}
