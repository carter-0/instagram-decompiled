package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;
import com.instagram.appreciation.funding.AppreciationFundingViewModel;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Collection;
import java.util.List;

public final class K85 extends MYR implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "AppreciationFundingBottomSheetFragment";
    public KGJ A00;
    public SpinnerImageView A01;
    public boolean A02;
    public final List A03 = AnonymousClass7TE.A1I(new KGO((Integer) null, false));
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(MMK.A00(this, 43));
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final AnonymousClass0eM A06;
    public final C63583KzW A07 = new C63583KzW(this);

    public final String getModuleName() {
        return "appreciation_funding";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = (SpinnerImageView) view.requireViewById(R.id.loading);
        07U r2 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
        MHH mhh = new MHH(r2, this, viewLifecycleOwner, (AnonymousClass4D7) null, 10);
        19B r4 = 19B.A00;
        1Eo.A05(r4, mhh, A002);
        2YL A0H = DbS.A0H(this.A06);
        1Eo.A05(r4, new MHA(A0H, (AnonymousClass4D7) null, 38), C318116oQ.A00(A0H));
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.2tE, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v0, types: [X.2tE, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v0, types: [X.2tE, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v0, types: [X.2tE, X.KFJ, java.lang.Object] */
    public final Collection getDefinitions() {
        ? obj = new Object();
        ? obj2 = new Object();
        ? obj3 = new Object();
        ? obj4 = new Object();
        obj4.A00 = null;
        return 0sr.A1P(new C232222tE[]{obj, obj2, obj3, obj4, new KF8(this.A07)});
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(new MP6(this, 26));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final boolean onBackPressed() {
        AppreciationFundingViewModel appreciationFundingViewModel = (AppreciationFundingViewModel) this.A06.getValue();
        int i = requireArguments().getInt("ext_balance");
        if (this.A02) {
            return false;
        }
        appreciationFundingViewModel.A03.A02(i, AnonymousClass05K.A00);
        return false;
    }

    public K85() {
        MMK A002 = MMK.A00(this, 47);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, MMK.A00(MMK.A00(this, 44), 45));
        this.A06 = DbS.A0I(MMK.A00(A003, 46), A002, new MMZ(27, (Object) null, (Object) A003), DbS.A0z(AppreciationFundingViewModel.class));
    }
}
