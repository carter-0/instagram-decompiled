package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.recyclerview.FastScrollingLinearLayoutManager;

/* renamed from: X.Uau  reason: case insensitive filesystem */
public final class C15344Uau extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DV, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ShoppingMediaFeedListViewerFragment";
    public boolean A00;
    public final 2el A01 = C51969G9p.A0k();
    public final C228172ku A02 = new C228172ku();
    public final C55574Hju A03 = new C55574Hju(this);
    public final AnonymousClass0eM A04 = A01(this, 9);
    public final AnonymousClass0eM A05 = A01(this, 10);
    public final AnonymousClass0eM A06 = A02(this, 11);
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08 = A01(this, 13);
    public final AnonymousClass0eM A09 = A01(this, 14);
    public final AnonymousClass0eM A0A = A02(this, 15);
    public final AnonymousClass0eM A0B = A01(this, 16);
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D = A01(this, 18);
    public final AnonymousClass0eM A0E = A01(this, 19);
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G = A02(this, 21);
    public final AnonymousClass0eM A0H = A02(this, 22);
    public final AnonymousClass0eM A0I = A01(this, 23);
    public final AnonymousClass0eM A0J = A01(this, 24);
    public final AnonymousClass0eM A0K = A02(this, 25);
    public final AnonymousClass0eM A0L = A02(this, 26);
    public final AnonymousClass0eM A0M = A01(this, 27);
    public final AnonymousClass0eM A0N = A02(this, 28);
    public final AnonymousClass0eM A0O;
    public final AnonymousClass0eM A0P = A01(this, 29);
    public final AnonymousClass0eM A0Q;
    public final AnonymousClass0eM A0R;
    public final AnonymousClass0eM A0S = A02(this, 35);
    public final AnonymousClass0eM A0T = A01(this, 8);

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        RecyclerView recyclerView;
        AnonymousClass3AS r1;
        C252553pI r7;
        RecyclerView recyclerView2;
        AnonymousClass3AR r12;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        2el r4 = this.A01;
        AnonymousClass3DZ A002 = AnonymousClass3DZ.A00(this);
        View view2 = this.mView;
        View view3 = null;
        if (view2 instanceof RecyclerView) {
            view3 = view2;
        }
        r4.A08(view3, A002, new AnonymousClass2eo[0]);
        AnonymousClass2xS r0 = (AnonymousClass2xS) this.A0A.getValue();
        0qQ.A0B(r0, 0);
        ((GTP) this.A0E.getValue()).A03 = r0;
        View view4 = this.mView;
        if (view4 instanceof RecyclerView) {
            recyclerView = (RecyclerView) view4;
        } else {
            recyclerView = null;
        }
        if (recyclerView != null) {
            r1 = recyclerView.A0C;
        } else {
            r1 = null;
        }
        if ((r1 instanceof AnonymousClass3AR) && (r12 = (AnonymousClass3AR) r1) != null) {
            r12.A00 = false;
        }
        WWL wwl = new WWL(this, 15);
        C3251771i r9 = C3251771i.A0I;
        if (recyclerView != null) {
            r7 = recyclerView.A0D;
        } else {
            r7 = null;
        }
        C3251871j r6 = new C3251871j(r7, wwl, r9, true, false);
        View view5 = this.mView;
        if ((view5 instanceof RecyclerView) && (recyclerView2 = (RecyclerView) view5) != null) {
            recyclerView2.A15(r6);
        }
        C60157Jgc jgc = (C60157Jgc) this.A0R.getValue();
        C64321LZw.A00(getViewLifecycleOwner(), jgc.A00, new J6L(this, 16), 14);
        C318136oS A003 = C318116oQ.A00(jgc);
        MG5 mg5 = new MG5(jgc, (AnonymousClass4D7) null, 19);
        19B r3 = 19B.A00;
        1Eo.A05(r3, mg5, A003);
        1Eo.A05(r3, new C58105ImR((Object) this, (Object) jgc, (AnonymousClass4D7) null, 44), DbV.A0J(this));
    }

    public static final AnonymousClass2t9 A00(C15344Uau uau) {
        return (AnonymousClass2t9) AnonymousClass7TE.A14(uau.A0T);
    }

    public static AnonymousClass0eM A01(Object obj, int i) {
        return AnonymousClass1YB.A00(new C20607Wvo(obj, i));
    }

    public static 0t0 A02(Object obj, int i) {
        return AnonymousClass0eN.A01(new C20607Wvo(obj, i));
    }

    public final String getModuleName() {
        if (((C16509Uw6) this.A06.getValue()).ordinal() == 2) {
            return "instagram_shopping_storefront_media_feed_list_viewer";
        }
        return "instagram_shopping_media_feed_list_viewer";
    }

    public final C238133Ar getScrollingViewProxy() {
        ViewGroup viewGroup;
        C238133Ar A002;
        View view = this.mView;
        if ((view instanceof RecyclerView) && (viewGroup = (ViewGroup) view) != null && (A002 = C238103Ao.A00(viewGroup)) != null) {
            return A002;
        }
        throw new IllegalStateException("No RecyclerView available for ScrollingViewProxy");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0O);
    }

    public C15344Uau() {
        C20607Wvo wvo = new C20607Wvo(this, 34);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20607Wvo(new C20607Wvo(this, 30), 31));
        this.A0R = new C227862kA(new C20607Wvo(A002, 32), wvo, new C58692Iw1(49, (Object) null, A002), new 0Yh(C60157Jgc.class));
        this.A0Q = A01(this, 33);
        this.A0C = A01(this, 17);
        this.A0F = A01(this, 20);
        this.A07 = A01(this, 12);
        this.A00 = true;
        this.A0O = C227642jf.A02(this);
    }

    public final void configureActionBar(2da r3) {
        Dbb.A1I(r3);
        r3.setTitle(DbS.A0t(this.A0Q));
        if (this.A06.getValue() == C16509Uw6.STOREFRONT) {
            ((C17911Vi2) this.A0S.getValue()).A00(r3);
            ((C323536xe) AnonymousClass7TE.A14(this.A04)).A01(r3);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-738217573);
        C15344Uau.super.onCreate(bundle);
        C13990Tnq.A1E(this, this.A0G);
        registerLifecycleListener((AnonymousClass332) this.A08.getValue());
        C13990Tnq.A1D(this, this.A0H);
        ((C17869VhM) this.A05.getValue()).A00();
        AnonymousClass0fD.A09(1953046525, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-701210196);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_recyclerview, viewGroup, false);
        0qQ.A0C(inflate, C273654mx.A00(4));
        RecyclerView recyclerView = (RecyclerView) inflate;
        recyclerView.A15((C249403jg) this.A08.getValue());
        recyclerView.setAdapter(A00(this));
        recyclerView.setLayoutManager(new FastScrollingLinearLayoutManager(requireContext()));
        AnonymousClass0fD.A09(-1703752679, A022);
        return recyclerView;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-530876406);
        super.onDestroy();
        C13990Tnq.A1G(this, this.A0G);
        unregisterLifecycleListener((AnonymousClass332) this.A08.getValue());
        C13990Tnq.A1F(this, this.A0H);
        AnonymousClass0fD.A09(12306242, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-838489349);
        super.onDestroyView();
        C17869VhM vhM = (C17869VhM) this.A05.getValue();
        vhM.A01.flowEndSuccess(vhM.A00);
        AnonymousClass0fD.A09(444620993, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(441613872);
        super.onResume();
        2dY r1 = 2dZ.A0t;
        configureActionBar(DbU.A0L(this, r1));
        DbU.A0L(this, r1).A0X(this);
        AnonymousClass0fD.A09(1249165016, A022);
    }
}
