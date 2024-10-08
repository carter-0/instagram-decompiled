package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;
import com.instagram.appreciation.analytics.creator.CreatorLoggingData;
import java.util.Collection;

public final class K89 extends MYR implements AnonymousClass4DR, C273414mX, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AppreciationCreatorInsightsFragment";
    public final AnonymousClass0eM A00 = AnonymousClass0eN.A01(MMK.A00(this, 25));
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;

    public final void Cyf() {
    }

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        DbW.A1B(r4, 2131953069);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A06 = R.drawable.instagram_info_pano_outline_24;
        A0K.A05 = 2131953004;
        DbX.A19(new LYC((Object) this, 16), A0K, r4);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        JTQ.A0y(getRecyclerView().A0D, getRecyclerView(), new C65319LrI(this, 0), C3251771i.A0A);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
        MHH mhh = new MHH(r3, this, viewLifecycleOwner, (AnonymousClass4D7) null, 4);
        19B r1 = 19B.A00;
        AnonymousClass07Z A0I = JTP.A0I(this, r1, mhh, A002);
        1Eo.A05(r1, new MHH(r3, this, A0I, (AnonymousClass4D7) null, 5), AnonymousClass07a.A00(A0I));
    }

    public final Collection getDefinitions() {
        Object[] objArr;
        Object obj;
        char c = 1;
        if (182.A06(0Tu.A05, ((C60185Jh4) this.A02.getValue()).A05, 36316508288586150L)) {
            objArr = new C232222tE[4];
            objArr[0] = new C61640KFq(requireActivity(), AnonymousClass7TE.A0l(this.A01), MMK.A00(this, 22));
            objArr[1] = new Object();
            objArr[2] = new KF7(MMK.A00(this, 23));
            c = 3;
            obj = new KFQ(this, this);
        } else {
            objArr = new C232222tE[2];
            objArr[0] = new C61640KFq(requireActivity(), AnonymousClass7TE.A0l(this.A01), MMK.A00(this, 24));
            obj = new Object();
        }
        objArr[c] = obj;
        return 0sr.A1P(objArr);
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(MNW.A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public K89() {
        MMK A002 = MMK.A00(this, 29);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, MMK.A00(MMK.A00(this, 26), 27));
        this.A02 = DbS.A0I(MMK.A00(A003, 28), A002, new MMZ(22, (Object) null, (Object) A003), DbS.A0z(C60185Jh4.class));
        this.A01 = C227642jf.A02(this);
    }

    public final void Cyc() {
        CreatorLoggingData A002 = C63036KqR.A00(requireArguments());
        ((LTO) this.A00.getValue()).A0C(Boolean.valueOf(A002.A01), Boolean.valueOf(A002.A02), AnonymousClass05K.A1I, A002.A00);
    }

    public final boolean onBackPressed() {
        CreatorLoggingData A002 = C63036KqR.A00(requireArguments());
        ((LTO) this.A00.getValue()).A0C(Boolean.valueOf(A002.A01), Boolean.valueOf(A002.A02), AnonymousClass05K.A1F, A002.A00);
        return false;
    }
}
