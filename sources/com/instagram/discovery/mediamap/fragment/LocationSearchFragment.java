package com.instagram.discovery.mediamap.fragment;

import X.0Tu;
import X.0cp;
import X.0hq;
import X.0kR;
import X.0mM;
import X.0mp;
import X.0nA;
import X.0qQ;
import X.0s1;
import X.0wc;
import X.17k;
import X.182;
import X.1ES;
import X.1G0;
import X.1GP;
import X.1Ln;
import X.1NY;
import X.1OC;
import X.2PP;
import X.2Yu;
import X.A1E;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0kN;
import X.AnonymousClass1XT;
import X.AnonymousClass2tC;
import X.AnonymousClass328;
import X.AnonymousClass32A;
import X.AnonymousClass3AS;
import X.AnonymousClass3E4;
import X.AnonymousClass3E5;
import X.AnonymousClass3E6;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass7g1;
import X.AnonymousClass9V2;
import X.C13988Tno;
import X.C13989Tnp;
import X.C13990Tnq;
import X.C14140Tqa;
import X.C14198Trd;
import X.C14199Tre;
import X.C14200Trf;
import X.C14206Trl;
import X.C14219Trz;
import X.C14221Ts1;
import X.C14225Ts5;
import X.C14407Tva;
import X.C14436TwK;
import X.C14437TwL;
import X.C14443TwR;
import X.C14444TwS;
import X.C14450TwY;
import X.C14486Tx8;
import X.C15050ULg;
import X.C15293UZz;
import X.C15772UiH;
import X.C16614UyA;
import X.C17367VSu;
import X.C17855Vh8;
import X.C18072Vl0;
import X.C18373VqZ;
import X.C18646Vvr;
import X.C18657VwC;
import X.C18663VwL;
import X.C18780W1f;
import X.C19303WTl;
import X.C19537WbN;
import X.C19543WbT;
import X.C20404Wqo;
import X.C20901X3s;
import X.C20905X3w;
import X.C20909X4a;
import X.C20910X4b;
import X.C20912X4d;
import X.C20964X6r;
import X.C20975X7o;
import X.C20985X8b;
import X.C20996X8t;
import X.C21052XBu;
import X.C252213ok;
import X.C266444Yx;
import X.C268654dm;
import X.C293005js;
import X.C337247fx;
import X.C358448av;
import X.C43775CCt;
import X.C45542CyG;
import X.C50915Fku;
import X.C51916G7k;
import X.C51968G9o;
import X.C59830Ja5;
import X.C61069Jw7;
import X.C61078JwG;
import X.C66942Mfb;
import X.C66966Mfz;
import X.C66967Mg0;
import X.C66987MgL;
import X.C67399MnG;
import X.C67401MnI;
import X.C67448Mo3;
import X.C67449Mo4;
import X.C67451Mo6;
import X.C69156Nff;
import X.C69158Nfh;
import X.C69160Nfj;
import X.C70326O2e;
import X.C71414OkD;
import X.C71969Otu;
import X.C72688PFs;
import X.C74367Pth;
import X.C74428Pui;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbW;
import X.DbX;
import X.G6V;
import X.G9d;
import X.GKO;
import X.JTP;
import X.JTQ;
import X.N3M;
import X.OVV;
import X.Pxg;
import X.Tw0;
import X.Tw1;
import X.Tw2;
import X.Tw3;
import X.Tw5;
import X.UA6;
import X.UB1;
import X.UKV;
import X.VGC;
import X.VGD;
import X.WB8;
import X.WBI;
import X.WW6;
import X.WWT;
import X.X47;
import X.X4Z;
import X.X8a;
import X.XAB;
import X.XAH;
import X.XC1;
import X.XC3;
import X.XC4;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.intf.MediaMapQuery;
import com.instagram.discovery.refinement.model.Refinement;
import com.instagram.discovery.refinement.model.RefinementAttributes;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.model.mapquery.MapQuery;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LocationSearchFragment extends C15293UZz implements C20964X6r, C20910X4b, X4Z, XAH, X47, X8a, C20996X8t, C252213ok, C20975X7o, C51916G7k, C74428Pui, C21052XBu, C20901X3s, C20905X3w, XAB, C74367Pth, XC1, XC3, XC4, C20912X4d, G6V, G9d {
    public float A00;
    public C14200Trf A01;
    public C14206Trl A02;
    public C14219Trz A03;
    public String A04;
    public String A05;
    public boolean A06;
    public int A07;
    public 0wc A08;
    public AnonymousClass3E6 A09;
    public C358448av A0A;
    public C66987MgL A0B;
    public C71969Otu A0C;
    public C14221Ts1 A0D;
    public boolean A0E;
    public ViewGroup mContainer;
    public RecyclerView mRecyclerView;
    public WWT mRefinementsController;
    public C50915Fku mSearchBarController;
    public View mSearchCancelButton;
    public SearchEditText mSearchEditText;
    public Space mSearchFieldSeparator;
    public LinearLayoutManager mSearchLayoutManager;
    public 0mM mShowHideKeyboardDebouncer;

    public final /* synthetic */ 1OC AMw(C15050ULg uLg, String str) {
        return A1E.A00(uLg, this, str);
    }

    public final void Cyk(MapBottomSheetController mapBottomSheetController) {
    }

    public final void Cym(MapBottomSheetController mapBottomSheetController) {
    }

    public final void Cyp(MapBottomSheetController mapBottomSheetController, float f, float f2, float f3, float f4) {
    }

    public final void Cyr(MapBottomSheetController mapBottomSheetController) {
    }

    public final void D1s() {
    }

    public final void DFn(C18657VwC vwC, MediaMapQuery mediaMapQuery) {
    }

    public final void DFx() {
    }

    public final /* synthetic */ void DeG(C15050ULg uLg) {
        AnonymousClass9V2.A02(uLg, this);
    }

    public final void DeH(String str) {
    }

    public final /* synthetic */ void DeJ(C15050ULg uLg, C268654dm r2) {
        AnonymousClass9V2.A01(uLg, r2, this);
    }

    public final void DeM(C268654dm r1, String str) {
    }

    public final /* synthetic */ void DeT(C15050ULg uLg) {
        AnonymousClass9V2.A03(uLg, this);
    }

    public final /* synthetic */ void Dej(C15050ULg uLg) {
        AnonymousClass9V2.A04(uLg, this);
    }

    public final /* synthetic */ void Der(C15050ULg uLg, AnonymousClass1XT r2) {
        AnonymousClass9V2.A00(uLg, r2, this);
    }

    public final /* synthetic */ void Dhi(UKV ukv) {
    }

    public final void Dhj() {
    }

    public final void DiH() {
    }

    public final void DmZ(C18657VwC vwC, MediaMapQuery mediaMapQuery) {
    }

    public final /* synthetic */ void Dnw(boolean z) {
    }

    public final /* synthetic */ C14198Trd E38(String str, List list) {
        return VGD.A00(this, str);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.Tx9, X.Tre] */
    /* JADX WARNING: type inference failed for: r1v4, types: [X.Nff, java.lang.Object, X.Mfb] */
    public final C14198Trd E39() {
        ? tre = new C14199Tre(false);
        ArrayList arrayList = new ArrayList(VGC.A00(AnonymousClass7TE.A0l(this.A00)).A00());
        Collections.sort(arrayList);
        if (arrayList.isEmpty()) {
            this.A06 = false;
            WWT wwt = this.mRefinementsController;
            if (wwt != null) {
                wwt.A00.setVisibility(8);
            }
            Iterator A16 = Pxg.A16(C13990Tnq.A0P(this).A06.A02(MediaMapQuery.A08).A03);
            while (A16.hasNext()) {
                Refinement refinement = (Refinement) A16.next();
                MapQuery mapQuery = new MapQuery(refinement.A00(), refinement.A01, AnonymousClass7TF.A0j("CATEGORY"));
                ? mfb = new C66942Mfb(6);
                mfb.A00 = mapQuery;
                tre.A02(new C66966Mfz(), mfb);
            }
        } else {
            this.A06 = true;
            WWT wwt2 = this.mRefinementsController;
            if (wwt2 != null) {
                wwt2.A00();
            }
            GKO gko = new GKO(new Object[0], 2131972863);
            Integer num = AnonymousClass05K.A0C;
            tre.A05(num, new C61069Jw7((C266444Yx) gko, num, AnonymousClass05K.A00), new Object());
            tre.A06((String) null, arrayList, false);
        }
        return tre.A01();
    }

    public final void ECK(View view, C66942Mfb mfb, C66967Mg0 mg0) {
    }

    public final String getModuleName() {
        return "discovery_map_location_search";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A01.A04();
        this.A03.A00();
        this.mContainer = (ViewGroup) view;
        this.mSearchLayoutManager = new LinearLayoutManager(requireContext());
        this.mSearchEditText = (SearchEditText) view.requireViewById(R.id.search_field);
        this.mSearchFieldSeparator = (Space) view.requireViewById(R.id.search_field_separator);
        this.mSearchCancelButton = view.requireViewById(R.id.cancel_button);
        this.mShowHideKeyboardDebouncer = new 0mM(AnonymousClass7TF.A0D(), new C19303WTl(this, 4), 100);
        C13990Tnq.A0P(this).A0A.A05.add(this);
        AnonymousClass3E5 A012 = AnonymousClass3E4.A01(this, false, false);
        this.A09 = A012;
        A012.A9Y(this);
        this.mSearchEditText.setOnFocusChangeListener(new WBI(this, 6));
        WB8.A00(this.mSearchCancelButton, 61, this);
        C50915Fku fku = new C50915Fku(this, 2131972797);
        this.mSearchBarController = fku;
        SearchEditText searchEditText = this.mSearchEditText;
        0qQ.A0B(searchEditText, 0);
        fku.A00(searchEditText, false);
        this.mSearchEditText.setSearchIconEnabled(true);
        this.mSearchEditText.setCompoundDrawableTintList(ColorStateList.valueOf(requireContext().getColor(2Yu.A0B(requireContext()))));
        this.mSearchEditText.setText(this.A04);
        UserSession A0l = AnonymousClass7TE.A0l(this.A00);
        WWT wwt = new WWT(DbT.A0I(view, R.id.refinements_list), this, A0l, this, new ArrayList(C13990Tnq.A0P(this).A06.A02(MediaMapQuery.A08).A03), true);
        this.mRefinementsController = wwt;
        if (this.A06) {
            wwt.A00();
        } else {
            wwt.A00.setVisibility(8);
        }
        RecyclerView A0K = DbX.A0K(view);
        this.mRecyclerView = A0K;
        DbV.A1B(view.getContext(), A0K);
        this.mRecyclerView.setAdapter(this.A03.A0A);
        RecyclerView recyclerView = this.mRecyclerView;
        recyclerView.A0S = true;
        recyclerView.setItemAnimator((AnonymousClass3AS) null);
        UB1.A00(this.mRecyclerView, this, 7);
        if (!0mp.A0B(this.A04)) {
            List list = C13990Tnq.A0P(this).A0f.BiX(this.A04).A06;
            if (list == null || list.isEmpty()) {
                Dhm(this.A04);
            } else {
                this.A01.A04();
                this.A03.A00();
            }
        }
        C13990Tnq.A0P(this).A06.A06.add(this);
        this.mSearchEditText.requestFocus();
        A01(this, true);
        view.addOnLayoutChangeListener(new C71414OkD(2, view, this));
    }

    public static void A01(LocationSearchFragment locationSearchFragment, boolean z) {
        0mM r1 = locationSearchFragment.mShowHideKeyboardDebouncer;
        if (r1 != null) {
            r1.A01(Boolean.valueOf(z));
        }
    }

    public final float BbN() {
        return this.A00;
    }

    public final boolean CYJ() {
        return TextUtils.isEmpty(this.A04);
    }

    public final /* synthetic */ boolean Cch() {
        return false;
    }

    public final void Cyq(MapBottomSheetController mapBottomSheetController, float f) {
        A01(this, AnonymousClass7TF.A1Q((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1))));
        if (f < 1.0f) {
            A01(this, false);
        }
    }

    public final void D9S(AnonymousClass0iw r6, C66942Mfb mfb, C66967Mg0 mg0) {
        int i;
        AnonymousClass0eM r3;
        C18646Vvr vvr;
        if (mfb instanceof C69158Nfh) {
            r3 = this.A00;
            vvr = VGC.A00(AnonymousClass7TE.A0l(r3));
            C18072Vl0 vl0 = ((C69158Nfh) mfb).A00;
            synchronized (vvr) {
                i = 0;
                0qQ.A0B(vl0, 0);
                vvr.A02.A05(vl0);
            }
        } else if (mfb instanceof C69160Nfj) {
            r3 = this.A00;
            vvr = VGC.A00(AnonymousClass7TE.A0l(r3));
            HashtagImpl hashtagImpl = ((C69160Nfj) mfb).A00;
            synchronized (vvr) {
                i = 0;
                0qQ.A0B(hashtagImpl, 0);
                vvr.A00.A05(hashtagImpl);
            }
        } else if (mfb instanceof C69156Nff) {
            r3 = this.A00;
            vvr = VGC.A00(AnonymousClass7TE.A0l(r3));
            MapQuery mapQuery = ((C69156Nff) mfb).A00;
            synchronized (vvr) {
                i = 0;
                0qQ.A0B(mapQuery, 0);
                vvr.A01.A05(mapQuery);
            }
        } else {
            return;
        }
        17k.A0F(mg0.A0F);
        this.A01.A04();
        if (this.mRecyclerView != null) {
            this.A03.A00();
        }
        UserSession A0l = AnonymousClass7TE.A0l(r3);
        boolean A1U = AnonymousClass7TF.A1U(i, A0l, mfb);
        1NY A0a = AnonymousClass7TG.A0a(A0l);
        A0a.A0A("map/remove_recent_search/");
        A0a.A9m("target_id", mfb.A01());
        A0a.A9m("target_type", (String) C51968G9o.A10(C18373VqZ.A00, mfb.A01));
        A0a.A0Q(C43775CCt.class, C45542CyG.class);
        A0a.A0R = A1U;
        1ES.A03(A0a.A0M());
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.Nff, X.Mfb] */
    public final void DBH(C71969Otu otu) {
        if (182.A06(0Tu.A05, AnonymousClass7TE.A0l(this.A00), 36321499040327109L)) {
            String str = otu.A01;
            MapQuery mapQuery = new MapQuery(str, str, AnonymousClass7TF.A0j("TEXT"));
            ? mfb = new C66942Mfb(6);
            mfb.A00 = mapQuery;
            MediaMapFragment A0P = C13990Tnq.A0P(this);
            MediaMapFragment.A08(A0P, C16614UyA.TEXT, str, str);
            C18780W1f.A01(A0P);
            C15293UZz.A00(this, mapQuery, mfb);
            A02(mfb, otu.A00);
        }
    }

    public final void DIe(C69160Nfj nfj, C66967Mg0 mg0) {
        HashtagImpl hashtagImpl = nfj.A00;
        MediaMapFragment A0P = C13990Tnq.A0P(this);
        MediaMapFragment.A08(A0P, C16614UyA.HASHTAG, hashtagImpl.A0C, hashtagImpl.A0D);
        C18780W1f.A01(A0P);
        AnonymousClass0eM r2 = this.A00;
        VGC.A00(AnonymousClass7TE.A0l(r2)).A01(nfj.A00);
        C18373VqZ.A00(AnonymousClass7TE.A0l(r2), nfj);
        A02(nfj, mg0);
    }

    public final void DKY(N3M n3m) {
        String str = n3m.A02;
        if (str == null || str.isEmpty()) {
            C13990Tnq.A0y(requireActivity(), AnonymousClass7TE.A0l(this.A00));
            return;
        }
        1Ln A0G = 1Ln.A0G(this.A08);
        if (DbT.A1Y(A0G)) {
            C13989Tnp.A1J(A0G, n3m, n3m.A05);
            A0G.A0R("query_text", this.A04);
            A0G.A0R("search_session_id", this.A05);
            A0G.A0R("rank_token", E4z());
            A0G.Cgf();
        }
        0kR.A0F(requireContext(), 0cp.A03(str));
    }

    public final void DMr(int i, boolean z) {
        if (i > 0 && isResumed()) {
            C13990Tnq.A0P(this).A0A.mBottomSheetBehavior.A0R(true, 1.0f);
        }
    }

    public final void DPY(C69156Nff nff, C66967Mg0 mg0) {
        MapQuery mapQuery = nff.A00;
        if (mapQuery.A02.equals(AnonymousClass7TF.A0j("TEXT"))) {
            if (182.A06(0Tu.A05, AnonymousClass7TE.A0l(this.A00), 36321499040327109L)) {
                MediaMapFragment A0P = C13990Tnq.A0P(this);
                String str = mapQuery.A01;
                MediaMapFragment.A08(A0P, C16614UyA.TEXT, str, str);
                C18780W1f.A01(A0P);
                C15293UZz.A00(this, mapQuery, nff);
                A02(nff, mg0);
            }
        }
        MediaMapFragment A0P2 = C13990Tnq.A0P(this);
        MediaMapFragment.A08(A0P2, C16614UyA.CATEGORY, mapQuery.A00, mapQuery.A01);
        C18780W1f.A01(A0P2);
        C15293UZz.A00(this, mapQuery, nff);
        A02(nff, mg0);
    }

    public final void DXI(C69158Nfh nfh, C66967Mg0 mg0) {
        C13990Tnq.A0P(this).A0J(nfh.A00);
        AnonymousClass0eM r2 = this.A00;
        VGC.A00(AnonymousClass7TE.A0l(r2)).A02(nfh.A00);
        C18373VqZ.A00(AnonymousClass7TE.A0l(r2), nfh);
        A02(nfh, mg0);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.Nff, X.Mfb] */
    public final void Dco(Refinement refinement) {
        RefinementAttributes refinementAttributes = refinement.A00;
        String str = refinementAttributes.A04;
        if (str == null && (str = refinementAttributes.A03) == null) {
            str = null;
        }
        str.getClass();
        MapQuery mapQuery = new MapQuery(str, refinement.A01, AnonymousClass7TF.A0j("CATEGORY"));
        ? mfb = new C66942Mfb(6);
        mfb.A00 = mapQuery;
        MediaMapFragment A0P = C13990Tnq.A0P(this);
        RefinementAttributes refinementAttributes2 = refinement.A00;
        String str2 = refinementAttributes2.A04;
        if (str2 == null && (str2 = refinementAttributes2.A03) == null) {
            str2 = null;
        }
        MediaMapFragment.A08(A0P, C16614UyA.CATEGORY, str2, refinement.A01);
        C18780W1f.A01(A0P);
        C15293UZz.A00(this, mapQuery, mfb);
    }

    public final void DeW(String str) {
        if (!this.A0D.A04()) {
            this.A03.A04 = false;
        }
        this.A03.A00();
    }

    public final void Dem(String str) {
        this.A03.A00();
    }

    public final /* bridge */ /* synthetic */ void Dev(AnonymousClass1XT r3, String str) {
        N3M n3m = ((C67451Mo6) r3).A00;
        if (n3m != null) {
            this.A02.A01(n3m, str);
        }
        this.A01.A04();
        this.A03.A00();
    }

    public final void Dhk(String str) {
        C71969Otu otu;
        if (182.A06(0Tu.A05, AnonymousClass7TE.A0l(this.A00), 36321499040392646L) && (otu = this.A0C) != null) {
            DBH(otu);
        }
    }

    public final void Dhm(String str) {
        this.A04 = str;
        this.A03.A04 = true;
        if (this.A0D.A06(str)) {
            this.A03.A04 = true;
        } else if (!this.A0D.A04()) {
            this.A03.A04 = false;
        }
        this.A01.A04();
        this.A03.A00();
    }

    public final void Di2(N3M n3m) {
        C14206Trl trl = this.A02;
        0qQ.A0B(n3m, 0);
        String str = n3m.A05;
        String str2 = str;
        if (str == null) {
            str = n3m.A06;
        }
        trl.A02(str);
        this.A01.A04();
        this.A03.A00();
        1Ln A0H = 1Ln.A0H(this.A08);
        if (DbT.A1Y(A0H)) {
            C13989Tnp.A1J(A0H, n3m, str2);
            A0H.A0R("query_text", this.A04);
            A0H.A0R("search_session_id", this.A05);
            A0H.A0R("rank_token", E4z());
            A0H.Cgf();
        }
    }

    public final void Dvc(C18657VwC vwC, C17855Vh8 vh8, MediaMapQuery mediaMapQuery) {
        WWT wwt;
        MediaMapQuery mediaMapQuery2 = MediaMapQuery.A08;
        if (2PP.A00(mediaMapQuery, mediaMapQuery2) && (wwt = this.mRefinementsController) != null) {
            ArrayList arrayList = new ArrayList(C13990Tnq.A0P(this).A06.A02(mediaMapQuery2).A03);
            UA6 ua6 = wwt.A01;
            ua6.A00 = new C61078JwG((List) arrayList, 14);
            ua6.notifyDataSetChanged();
            wwt.A00.setVisibility(JTQ.A01(ua6.getItemCount()));
            if (!this.A06) {
                this.mRefinementsController.A00.setVisibility(8);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C14198Trd E3A(java.lang.String r8, java.lang.String r9, java.util.List r10, java.util.List r11) {
        /*
            r7 = this;
            X.WWT r0 = r7.mRefinementsController
            if (r0 == 0) goto L_0x000b
            androidx.recyclerview.widget.RecyclerView r1 = r0.A00
            r0 = 8
            r1.setVisibility(r0)
        L_0x000b:
            r4 = 0
            X.Trm r2 = new X.Trm
            r2.<init>(r4, r4, r4)
            X.Trl r0 = r7.A02
            X.N3M r5 = r0.A00(r8)
            r3 = 1
            if (r5 == 0) goto L_0x00b9
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r2.A04(r0, r5)
            java.util.List r1 = X.C70278O0i.A00(r5)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00b9
            X.Jw7 r0 = X.C18690Vwo.A01()
            X.C14199Tre.A00(r2, r0)
            r2.A09(r1, r9)
            r1 = 1
        L_0x0034:
            X.Trl r0 = r7.A02
            boolean r0 = r0.A04(r8)
            if (r0 != 0) goto L_0x004f
            if (r5 == 0) goto L_0x004a
            if (r1 == 0) goto L_0x004a
            X.UqG r1 = new X.UqG
            r1.<init>(r5)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x0047:
            r2.A04(r0, r1)
        L_0x004a:
            X.Trd r0 = r2.A01()
            return r0
        L_0x004f:
            if (r1 == 0) goto L_0x0058
            X.Jw7 r0 = X.C18690Vwo.A00()
            X.C14199Tre.A00(r2, r0)
        L_0x0058:
            X.0eM r0 = r7.A00
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            X.0Tu r5 = X.0Tu.A05
            r0 = 36321499040327109(0x810a36000225c5, double:3.0332004758157056E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 != 0) goto L_0x0072
            r2.A07(r11, r9)
            r2.A08(r10, r9)
            goto L_0x004a
        L_0x0072:
            int r1 = r11.size()
            r0 = 5
            int r0 = java.lang.Math.min(r1, r0)
            java.util.List r0 = r11.subList(r4, r0)
            r2.A07(r0, r9)
            int r1 = r10.size()
            int r0 = r11.size()
            int r0 = 6 - r0
            int r0 = X.C13988Tno.A07(r0, r3, r4)
            int r0 = java.lang.Math.min(r1, r0)
            java.util.List r0 = r10.subList(r4, r0)
            r2.A08(r0, r9)
            X.Mfz r1 = new X.Mfz
            r1.<init>()
            java.lang.String r0 = "typeahead_echo"
            r1.A09 = r0
            java.lang.String r0 = "server_results"
            r1.A05 = r0
            r1.A0H = r3
            X.Mg0 r0 = new X.Mg0
            r0.<init>(r1)
            X.Otu r1 = new X.Otu
            r1.<init>(r0, r8)
            r7.A0C = r1
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0047
        L_0x00b9:
            r1 = 0
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.discovery.mediamap.fragment.LocationSearchFragment.E3A(java.lang.String, java.lang.String, java.util.List, java.util.List):X.Trd");
    }

    public final String E4p() {
        return this.A04;
    }

    public final String E4z() {
        return this.A01.A03(this.A04);
    }

    public final boolean EsP(C66942Mfb mfb, Object obj) {
        if (!(obj instanceof C66967Mg0) || !((C66967Mg0) obj).A0E) {
            return true;
        }
        return false;
    }

    public final boolean EtL(N3M n3m) {
        return !this.A02.A03(n3m);
    }

    private void A02(C66942Mfb mfb, C66967Mg0 mg0) {
        OVV A002 = C70326O2e.A00(mfb);
        A002.A07 = mg0.A09;
        A002.A01 = mg0.A05;
        C14486Tx8 A012 = A002.A01();
        C358448av r0 = this.A0A;
        String str = this.A04;
        int i = mg0.A00;
        r0.CkL(A012, AnonymousClass05K.A07, AnonymousClass05K.A0C, str, mg0.A06, i);
    }

    public final 1OC AMx(String str, String str2) {
        String str3;
        C17367VSu A022;
        Location A002 = C13990Tnq.A0P(this).A03.A00("LocationSearchFragment");
        1NY A0O = DbU.A0O(AnonymousClass7TE.A0l(this.A00));
        A0O.A0A("map/search/");
        A0O.A0R(C67449Mo4.class, C67448Mo3.class);
        A0O.A9m("query", this.A04);
        A0O.A9m("search_surface", "map_surface");
        A0O.A9m("timezone_offset", Long.toString(1G0.A00()));
        String str4 = null;
        if (A002 != null) {
            str3 = String.valueOf(A002.getLatitude());
        } else {
            str3 = null;
        }
        A0O.A9m("lat", str3);
        if (A002 != null) {
            str4 = String.valueOf(A002.getLongitude());
        }
        A0O.A9m("lng", str4);
        C18663VwL vwL = C13990Tnq.A0P(this).mMapViewController;
        if (!(vwL == null || (A022 = vwL.A02()) == null)) {
            A0O.A9m("map_center_lat", Double.toString(A022.A00));
            A0O.A9m("map_center_lng", Double.toString(A022.A01));
        }
        return A0O.A0M();
    }

    public final /* synthetic */ 1GP AMy(C15050ULg uLg, String str) {
        return null;
    }

    public final void DiF(Integer num) {
        C18780W1f w1f = C13990Tnq.A0P(this).A0B;
        C14407Tva tva = C14407Tva.BLENDED;
        Bundle bundle = new Bundle();
        DbU.A1D(bundle, w1f.A05);
        bundle.putString("argument_search_session_id", w1f.A06);
        bundle.putSerializable("edit_searches_type", tva);
        bundle.putString("argument_parent_module_name", w1f.A04.getModuleName());
        C15293UZz uZz = new C15293UZz();
        uZz.setArguments(bundle);
        0s1 A002 = C18780W1f.A00(uZz, w1f);
        A002.A0I("SEARCH");
        A002.A0J(false);
    }

    public final /* synthetic */ String E50(C15050ULg uLg) {
        return E4z();
    }

    public final /* bridge */ /* synthetic */ void EBK(View view, Object obj) {
    }

    public final boolean onBackPressed() {
        0hq r2 = C13990Tnq.A0P(this).A0B.A03;
        if (r2.A0M() > 1) {
            r2.A0c();
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v21, types: [X.2tF, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1360778859);
        LocationSearchFragment.super.onCreate(bundle);
        String string = requireArguments().getString("arg_hashtag_name");
        if (string == null || 2PP.A00(string, "popular")) {
            string = "";
        }
        this.A04 = string;
        AnonymousClass7g1 r3 = C13990Tnq.A0P(this).A0f;
        A07();
        this.A02 = new C14206Trl();
        AnonymousClass0eM r42 = this.A00;
        UserSession A0l = AnonymousClass7TE.A0l(r42);
        0qQ.A0B(A0l, 0);
        this.A0E = C13988Tno.A1Y(A0l);
        UserSession A0l2 = AnonymousClass7TE.A0l(r42);
        0qQ.A0B(A0l2, 0);
        this.A07 = C13988Tno.A1Y(A0l2) ? 1 : 0;
        UserSession A0l3 = AnonymousClass7TE.A0l(r42);
        0qQ.A0B(r3, 0);
        this.A0D = C14225Ts5.A01(A0l3, this, (C337247fx) null, this, r3, AnonymousClass05K.A00, true);
        C72688PFs pFs = new C72688PFs(this, 1);
        C14200Trf trf = new C14200Trf(this, this, this, this, r3, 10, false);
        this.A01 = trf;
        this.A0B = new C66987MgL(trf, -1);
        this.A05 = AnonymousClass7TF.A0b();
        this.A08 = AnonymousClass0kN.A01(this, AnonymousClass7TE.A0l(r42));
        String str = this.A05;
        C14444TwS twS = new C14444TwS(this, AnonymousClass7TE.A0l(r42), this.A05);
        UserSession A0l4 = AnonymousClass7TE.A0l(r42);
        0qQ.A0B(str, 1);
        0qQ.A0B(A0l4, 3);
        this.A0A = new C14443TwR(this, A0l4, twS, str, (String) null, (String) null, (String) null);
        UserSession A0l5 = AnonymousClass7TE.A0l(r42);
        String str2 = this.A05;
        UserSession A0l6 = AnonymousClass7TE.A0l(r42);
        FragmentActivity requireActivity = requireActivity();
        int A023 = DbW.A02(1, str2, A0l6);
        C14437TwL twL = new C14437TwL(requireActivity, this, A0l6, str2, 96, true);
        UserSession A0l7 = AnonymousClass7TE.A0l(r42);
        0qQ.A0B(A0l7, 1);
        C14436TwK twK = new C14436TwK((Context) null, A0l7, (C14450TwY) null);
        WW6 ww6 = new WW6(this);
        AnonymousClass32A r12 = new AnonymousClass32A(this, AnonymousClass7TE.A0l(r42), new AnonymousClass328(this));
        C358448av r19 = this.A0A;
        C293005js r11 = new C293005js(this, AnonymousClass7TE.A0l(r42));
        C19543WbT wbT = new C19543WbT();
        C19537WbN wbN = new C19537WbN();
        C20404Wqo wqo = new C20404Wqo(A023);
        C20404Wqo wqo2 = new C20404Wqo(3);
        UserSession A0l8 = AnonymousClass7TE.A0l(r42);
        boolean A062 = 182.A06(AnonymousClass7TF.A0H(A0l8), A0l8, 36328340924742921L);
        UserSession A0l9 = AnonymousClass7TE.A0l(r42);
        0qQ.A0B(A0l9, 0);
        0Tu r7 = 0Tu.A05;
        boolean A063 = 182.A06(r7, A0l9, 36328340924022014L);
        UserSession A0l10 = AnonymousClass7TE.A0l(r42);
        0qQ.A0B(A0l10, 0);
        C293005js r20 = r11;
        AnonymousClass32A r21 = r12;
        C358448av r23 = r19;
        WW6 ww62 = ww6;
        C14140Tqa tqa = new C14140Tqa(A0l5, ww62, r20, r21, (SearchContext) null, r23, wbN, this, (C20909X4a) null, this, wbT, (C20985X8b) null, twL, (C59830Ja5) null, twK, str2, (String) null, wqo, wqo2, false, false, A062, A063, 182.A06(r7, A0l10, 36328340924153088L));
        AnonymousClass2tC A0S = DbV.A0S(this);
        A0S.A01(new Tw5(this, this));
        A0S.A01(new Tw3(this));
        A0S.A01(new Object());
        A0S.A01(new Tw0(this, this, this, false));
        A0S.A01(new Tw1(this, AnonymousClass7TE.A0l(r42), this, this, 0, true, false));
        A0S.A01(new C15772UiH(this, this));
        A0S.A01(new C67399MnG(getRootActivity(), this, AnonymousClass7TE.A0l(r42), tqa, this, "map_search", false, true, this.A0E, false, false, false, false));
        A0S.A01(new Tw2(this));
        A0S.A01(new C67401MnI(pFs, this, 2131972978));
        boolean z = this.A0E;
        this.A03 = new C14219Trz(requireContext(), A0S, this, this, this.A0B, this, this, this.A07, z, false, false, false, false, false);
        this.A06 = false;
        this.A0A.CkQ();
        AnonymousClass0fD.A09(-874638961, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2071005954);
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.layout_location_search);
        AnonymousClass0fD.A09(-186464871, A022);
        return A0C2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-51309506);
        super.onDestroyView();
        C50915Fku fku = this.mSearchBarController;
        SearchEditText searchEditText = fku.A00;
        if (searchEditText != null) {
            searchEditText.A0C = null;
        }
        fku.A00 = null;
        this.A0D.A02();
        C13990Tnq.A0P(this).A0A.A05.remove(this);
        Context context = getContext();
        if (context instanceof Activity) {
            0nA.A0N(((Activity) context).getCurrentFocus());
        }
        LocationSearchFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0fD.A09(-1554053368, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-1765017415);
        LocationSearchFragment.super.onStart();
        JTP.A17(this, this.A09);
        AnonymousClass0fD.A09(869060510, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-2139868697);
        LocationSearchFragment.super.onStop();
        this.A09.onStop();
        AnonymousClass0fD.A09(645428082, A022);
    }
}
