package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.recyclerview.FastScrollingLinearLayoutManager;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.Ub7  reason: case insensitive filesystem */
public final class C15356Ub7 extends AnonymousClass4DH implements AnonymousClass4DU, C322776wO {
    public static final String __redex_internal_original_name = "ShoppingActivityFragment";
    public float A00;
    public C238133Ar A01;
    public RecyclerView A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = C20701WxY.A00(this, 37);
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06 = AnonymousClass1YB.A00(C20663Wwv.A00);
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09 = C20701WxY.A00(this, 41);
    public final AnonymousClass0eM A0A = C20701WxY.A00(this, 42);
    public final AnonymousClass0eM A0B = C20701WxY.A00(this, 44);
    public final AnonymousClass0eM A0C = C20701WxY.A00(this, 45);
    public final AnonymousClass0eM A0D = C20701WxY.A00(this, 46);
    public final AnonymousClass0eM A0E = C20701WxY.A00(this, 47);
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G = C20701WxY.A00(this, 48);
    public final AnonymousClass0eM A0H;
    public final AnonymousClass0eM A0I;
    public final AnonymousClass0eM A0J;
    public final AnonymousClass0eM A0K;
    public final C249403jg A0L;
    public final AnonymousClass0eM A0M;

    public final /* synthetic */ void DBz(C320156rr r1) {
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((2el) AnonymousClass7TE.A14(this.A0K)).A08(this.A02, AnonymousClass3DZ.A00(this), new AnonymousClass2eo[0]);
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C59845JaL(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 12), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final void DBx() {
        ((C19693Wdv) this.A07.getValue()).DBx();
    }

    public final void DBy() {
        this.A07.getValue();
        LN7 ln7 = (LN7) ((C60209JhS) this.A0I.getValue()).A02.getValue();
        C13991Tnr.A1K(ln7, ln7.A07, 17);
    }

    public final String getModuleName() {
        return ((AnonymousClass0iw) this.A06.getValue()).getModuleName();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0F);
    }

    public C15356Ub7() {
        C20689WxL wxL = new C20689WxL(this, 3);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20689WxL(new C20701WxY(this, 49), 0));
        this.A0I = new C227862kA(new C20689WxL(A002, 1), wxL, new C20613Wvu(34, A002, (Object) null), new 0Yh(C60209JhS.class));
        this.A05 = C20701WxY.A00(this, 38);
        this.A08 = C20701WxY.A00(this, 40);
        this.A0H = AnonymousClass1YB.A00(new C20689WxL(this, 2));
        this.A0J = AnonymousClass1YB.A00(new C20689WxL(this, 4));
        this.A0M = C20701WxY.A00(this, 43);
        this.A0K = AnonymousClass1YB.A00(C20664Www.A00);
        this.A03 = C20701WxY.A00(this, 36);
        this.A0L = new UB1(this, 19);
        this.A07 = C20701WxY.A00(this, 39);
        this.A0F = C227642jf.A02(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1179423303);
        C15356Ub7.super.onCreate(bundle);
        C17900Vhr vhr = (C17900Vhr) this.A08.getValue();
        synchronized (vhr) {
            Set set = vhr.A04;
            set.add(C13990Tnq.A0Z(set, 528295024));
            02m.A0p.markerStart(528295024);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                int A0F2 = AnonymousClass7TG.A0F(it);
                02m r4 = 02m.A0p;
                String str = vhr.A03;
                if (str != null) {
                    r4.markerAnnotate(A0F2, "prior_module", str);
                }
                r4.markerAnnotate(A0F2, "container_module", vhr.A02);
                r4.markerAnnotate(A0F2, "analytics_page", "RECON_DESTINATION");
                r4.markerAnnotate(A0F2, AnonymousClass000.A00(2596), "RECONSIDERATION");
                String str2 = vhr.A01;
                if (str2 == null) {
                    str2 = "UNKNOWN";
                }
                r4.markerAnnotate(A0F2, "analytics_referral_page", str2);
                String str3 = vhr.A00;
                if (str3 == null) {
                    str3 = "UNKNOWN";
                }
                r4.markerAnnotate(A0F2, "analytics_referral_experience", str3);
            }
        }
        registerLifecycleListener((C228312lJ) this.A0H.getValue());
        LN7 ln7 = (LN7) ((C60209JhS) this.A0I.getValue()).A02.getValue();
        C13991Tnr.A1K(ln7, ln7.A07, 15);
        AnonymousClass0fD.A09(1608849638, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-787566019);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_refreshable_recyclerview, false);
        RecyclerView A0G2 = C13990Tnq.A0G(A0D2);
        this.A02 = A0G2;
        FastScrollingLinearLayoutManager fastScrollingLinearLayoutManager = new FastScrollingLinearLayoutManager(A0G2.getContext());
        fastScrollingLinearLayoutManager.A0v(true);
        A0G2.setLayoutManager(fastScrollingLinearLayoutManager);
        A0G2.setAdapter((2Rw) AnonymousClass7TE.A14(this.A04));
        C238133Ar A002 = C238103Ao.A00(A0G2);
        0qQ.A0C(A002, C66579MXk.A00(371));
        C238143As r1 = (C238143As) A002;
        r1.ErF(new C20081Wkf(this));
        this.A01 = r1;
        JTQ.A0y(A0G2.A0D, A0G2, new C65319LrI(this, 11), new C3251771i(AnonymousClass05K.A00, AnonymousClass05K.A01, 2));
        A0G2.A15(this.A0L);
        A0G2.A15((C249403jg) this.A0H.getValue());
        C13990Tnq.A1O((RefreshableNestedScrollingParent) A0D2);
        AnonymousClass0fD.A09(-116279527, A022);
        return A0D2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-308718087);
        super.onDestroy();
        unregisterLifecycleListener((C228312lJ) this.A0H.getValue());
        AnonymousClass0fD.A09(-388911976, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1515504739);
        super.onDestroyView();
        this.A02 = null;
        AnonymousClass0fD.A09(1817631895, A022);
    }
}
