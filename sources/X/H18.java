package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import java.util.List;
import java.util.Map;

public final class H18 extends AnonymousClass4DH implements AnonymousClass4DU {
    public static final String __redex_internal_original_name = "CreatorInspirationHubReelsFragment";
    public LinearLayoutManager A00;
    public RecyclerView A01;
    public C53075Gi8 A02;
    public String A03;
    public List A04;
    public int A05;
    public 1wS A06;
    public boolean A07;
    public final 1wn A08;
    public final Map A09;
    public final Map A0A;
    public final Map A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G = C58673Ivi.A00(this, 6);
    public final AnonymousClass0eM A0H = C58673Ivi.A00(this, 7);
    public final AnonymousClass0eM A0I = C58673Ivi.A00(this, 8);
    public final AnonymousClass0eM A0J;
    public final AnonymousClass0eM A0K;
    public final AnonymousClass0eM A0L;
    public final AnonymousClass0eM A0M = C227642jf.A02(this);

    public final String getModuleName() {
        return "creator_inspiration_hub_reels";
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
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.creator_inspiration_hub_reels_vscroll_recycler_view);
        this.A01 = recyclerView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 1, false);
        this.A00 = linearLayoutManager;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.A11((AnonymousClass3B3) this.A0L.getValue());
            recyclerView.A15((C249403jg) this.A0K.getValue());
        }
        C53075Gi8 gi8 = this.A02;
        if (!(gi8 == null || recyclerView == null)) {
            recyclerView.setAdapter(gi8);
        }
        DbZ.A1C(this, new C52070GDq(view, this, (AnonymousClass4D7) null, 34), C51968G9o.A0q(this).A07);
        C58099ImL.A01(this, DbV.A0J(this), 22);
        1wS A012 = 1wS.A01(AnonymousClass7TE.A0l(this.A0M));
        this.A06 = A012;
        if (A012 != null) {
            this.A05 = A012.A09();
            1wS r1 = this.A06;
            if (r1 != null) {
                r1.A0C(5);
                return;
            }
        }
        0qQ.A0F("playerServiceController");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(H18 h18) {
        RecyclerView recyclerView;
        LinearLayoutManager linearLayoutManager = h18.A00;
        C249703kE r2 = null;
        if (!(linearLayoutManager == null || (recyclerView = h18.A01) == null)) {
            r2 = recyclerView.A0X(linearLayoutManager.A1c(), false);
        }
        if (r2 instanceof C53146GjI) {
            C51968G9o.A0q(h18).A08.Epw(r2);
            C53146GjI gjI = (C53146GjI) r2;
            gjI.A01.post(new C57763Ig4(gjI));
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0M);
    }

    public H18() {
        C58673Ivi ivi = new C58673Ivi(this, 2);
        C58673Ivi ivi2 = new C58673Ivi(this, 14);
        0eO r3 = 0eO.A02;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r3, new C58673Ivi(ivi2, 15));
        this.A0F = DbS.A0I(new C58673Ivi(A002, 16), ivi, C58690Ivz.A00((Object) null, A002, 8), DbS.A0z(C53015Gh6.class));
        this.A0L = AnonymousClass1YB.A00(G2X.A00);
        C58673Ivi ivi3 = new C58673Ivi(this, 0);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(r3, new C58673Ivi(new C58673Ivi(this, 17), 18));
        this.A0D = DbS.A0I(new C58673Ivi(A003, 19), ivi3, C58690Ivz.A00((Object) null, A003, 9), DbS.A0z(C52967GgK.class));
        this.A0B = AnonymousClass7TE.A1H();
        this.A0A = AnonymousClass7TE.A1H();
        this.A09 = AnonymousClass7TE.A1H();
        this.A0E = C58673Ivi.A00(this, 1);
        this.A0C = AnonymousClass1YB.A00(new C58679Ivo(this, 49));
        this.A08 = new IO4((Object) this, 19);
        this.A0K = C58673Ivi.A00(this, 13);
        this.A0J = C58673Ivi.A00(this, 12);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(536432965);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.creator_inspiration_hub_reels_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-2019918224, A022);
        return inflate;
    }

    public final void onDestroy() {
        C229352nF r0;
        int A022 = AnonymousClass0fD.A02(1515014076);
        super.onDestroy();
        this.A02 = null;
        String str = this.A03;
        if (!(str == null || (r0 = C51968G9o.A0q(this).A00) == null)) {
            r0.A07(str);
        }
        AnonymousClass0fD.A09(-1949955430, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1554612925);
        super.onDestroyView();
        int i = this.A05;
        if (i != 0) {
            1wS r0 = this.A06;
            if (r0 == null) {
                0qQ.A0F("playerServiceController");
                throw AnonymousClass00P.createAndThrow();
            }
            r0.A0C(i);
        }
        ((C52967GgK) this.A0D.getValue()).A0E();
        this.A01 = null;
        DbX.A0R(this.A0M).A02(this.A08, INW.class);
        AnonymousClass0fD.A09(-1220201447, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1569202908);
        H18.super.onPause();
        ((C52967GgK) this.A0D.getValue()).A0F();
        AnonymousClass0fD.A09(362463045, A022);
    }

    public final void onResume() {
        Object obj;
        int A022 = AnonymousClass0fD.A02(104245369);
        super.onResume();
        C46785DlD dlD = (C46785DlD) this.A0G.getValue();
        if (dlD != null) {
            obj = dlD.A03.getValue();
        } else {
            obj = null;
        }
        if (0qQ.A0K(obj, "clips")) {
            C53146GjI gjI = (C53146GjI) C51968G9o.A0q(this).A08.getValue();
            if (gjI != null) {
                gjI.A01.post(new C57763Ig4(gjI));
            }
            C52967GgK.A01(this.A0D);
        }
        if (AnonymousClass7TF.A1Z(this.A0I) && !this.A07) {
            this.A07 = true;
            C51968G9o.A0q(this).A00();
        }
        AnonymousClass0fD.A09(-160853488, A022);
    }
}
