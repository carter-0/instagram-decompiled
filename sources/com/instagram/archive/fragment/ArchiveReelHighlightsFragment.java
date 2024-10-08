package com.instagram.archive.fragment;

import X.07U;
import X.0Yh;
import X.0eO;
import X.0qQ;
import X.1Ng;
import X.1wn;
import X.2da;
import X.2el;
import X.AnonymousClass00P;
import X.AnonymousClass07Z;
import X.AnonymousClass07a;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass328;
import X.AnonymousClass32A;
import X.AnonymousClass32D;
import X.AnonymousClass376;
import X.AnonymousClass4D7;
import X.AnonymousClass4DH;
import X.AnonymousClass4DR;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C16155Upg;
import X.C19221WQb;
import X.C19269WSc;
import X.C19381WWx;
import X.C19494Wag;
import X.C19519Wb5;
import X.C227642jf;
import X.C227862kA;
import X.C229132mt;
import X.C230242pG;
import X.C320806sz;
import X.C320826t1;
import X.C3251871j;
import X.C51969G9p;
import X.C60097Jfd;
import X.C74357PtX;
import X.DbS;
import X.DbX;
import X.Dba;
import X.Dbc;
import X.JTR;
import X.MBF;
import X.MHH;
import X.MMI;
import X.MMZ;
import X.MYK;
import X.VFU;
import X.WQC;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.FastScrollingGridLayoutManager;
import com.instagram.model.reels.ReelViewerConfig;

public final class ArchiveReelHighlightsFragment extends AnonymousClass4DH implements AnonymousClass4DR, C229132mt, AnonymousClass4DS, C74357PtX {
    public C19381WWx A00;
    public AnonymousClass32A A01;
    public C230242pG A02;
    public String A03 = "highlights_archive";
    public final ReelViewerConfig A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final AnonymousClass0eM A06;
    public final 1wn A07;
    public final 1wn A08;
    public final 2el A09;
    public GridLayoutManager layoutManager;
    public RecyclerView recyclerView;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        r2.Eom(2131953141);
        r2.Eu4(AnonymousClass7TF.A1R(getParentFragmentManager().A0M()));
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView A0c = JTR.A0c(view, R.id.recycler_view);
        0qQ.A0B(A0c, 0);
        this.recyclerView = A0c;
        2el r6 = this.A09;
        Dba.A0z(view, r6, this);
        Context requireContext = requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(this.A05);
        C230242pG r8 = this.A02;
        if (r8 == null) {
            str = "reelTrayItemDelegate";
        } else {
            this.A00 = new C19381WWx(requireContext, this, A0l, r6, this, r8);
            FastScrollingGridLayoutManager fastScrollingGridLayoutManager = new FastScrollingGridLayoutManager(requireContext(), 3);
            this.layoutManager = fastScrollingGridLayoutManager;
            C19381WWx wWx = this.A00;
            str = "adapter";
            if (wWx != null) {
                fastScrollingGridLayoutManager.A01 = (C320806sz) wWx.A0B.getValue();
                RecyclerView recyclerView2 = this.recyclerView;
                if (recyclerView2 != null) {
                    C19381WWx wWx2 = this.A00;
                    if (wWx2 != null) {
                        recyclerView2.setAdapter(wWx2.A05);
                        RecyclerView recyclerView3 = this.recyclerView;
                        if (recyclerView3 != null) {
                            recyclerView3.A11(C320826t1.A00(requireContext(), 1, true));
                            RecyclerView recyclerView4 = this.recyclerView;
                            if (recyclerView4 != null) {
                                GridLayoutManager gridLayoutManager = this.layoutManager;
                                if (gridLayoutManager != null) {
                                    recyclerView4.setLayoutManager(gridLayoutManager);
                                    RecyclerView recyclerView5 = this.recyclerView;
                                    if (recyclerView5 != null) {
                                        C3251871j A002 = VFU.A00(recyclerView5.A0D, this);
                                        RecyclerView recyclerView6 = this.recyclerView;
                                        if (recyclerView6 != null) {
                                            recyclerView6.A15(A002);
                                            07U r62 = 07U.A05;
                                            AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
                                            AnonymousClass7TE.A1Z(new MHH(r62, this, viewLifecycleOwner, (AnonymousClass4D7) null, 18), AnonymousClass07a.A00(viewLifecycleOwner));
                                            ((C60097Jfd) this.A06.getValue()).A0F();
                                            C19381WWx wWx3 = this.A00;
                                            if (wWx3 != null) {
                                                wWx3.A01 = true;
                                                wWx3.A02();
                                                return;
                                            }
                                        }
                                    }
                                } else {
                                    str = "layoutManager";
                                }
                            }
                        }
                    }
                }
                str = "recyclerView";
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(ArchiveReelHighlightsFragment archiveReelHighlightsFragment, String str) {
        C19381WWx wWx = archiveReelHighlightsFragment.A00;
        if (wWx == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        }
        wWx.A0A.removeIf(new MBF(0, new MYK(str, 12)));
        wWx.A02();
    }

    public final void ACw() {
        ((C60097Jfd) this.A06.getValue()).A0E();
    }

    public final void AGI() {
        C19381WWx wWx = this.A00;
        if (wWx == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        }
        for (C19269WSc wSc : wWx.A0A) {
            wSc.A03 = false;
        }
        wWx.A05.notifyDataSetChanged();
    }

    public final String getModuleName() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public ArchiveReelHighlightsFragment() {
        AnonymousClass32D r1 = new AnonymousClass32D();
        r1.A07 = true;
        this.A04 = new ReelViewerConfig(r1);
        this.A09 = C51969G9p.A0k();
        MMI mmi = new MMI(this, 48);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MMI(new MMI(this, 45), 46));
        this.A06 = new C227862kA(new MMI(A002, 47), mmi, new MMZ(40, (Object) null, (Object) A002), new 0Yh(C60097Jfd.class));
        this.A08 = new C19221WQb(this, 1);
        this.A07 = new C19221WQb(this, 0);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1561356826);
        ArchiveReelHighlightsFragment.super.onCreate(bundle);
        AnonymousClass0eM r4 = this.A05;
        AnonymousClass32A r2 = new AnonymousClass32A(this, AnonymousClass7TE.A0l(r4), new AnonymousClass328(this));
        r2.A0C = AnonymousClass7TF.A0b();
        setModuleNameV2(this.A03);
        r2.A0F = true;
        r2.A03 = this.A04;
        r2.A06 = new C19494Wag(this, 0);
        r2.A05 = new C16155Upg(0);
        this.A01 = r2;
        this.A02 = new C19519Wb5(this);
        1Ng A0R = DbX.A0R(r4);
        A0R.A01(this.A08, WQC.class);
        A0R.A01(this.A07, AnonymousClass376.class);
        AnonymousClass0fD.A09(233618291, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(924399199);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_highlights, viewGroup, false);
        AnonymousClass0fD.A09(664662707, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1843522271);
        super.onDestroy();
        1Ng A0R = DbX.A0R(this.A05);
        A0R.A02(this.A08, WQC.class);
        A0R.A02(this.A07, AnonymousClass376.class);
        AnonymousClass0fD.A09(107623615, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-536631626);
        super.onDestroyView();
        ArchiveReelHighlightsFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0fD.A09(-1590139709, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-1901649663);
        ArchiveReelHighlightsFragment.super.onStart();
        Dbc.A0q(this, 8);
        AnonymousClass0fD.A09(-1876975961, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(494398711);
        ArchiveReelHighlightsFragment.super.onStop();
        Dbc.A0q(this, 0);
        AnonymousClass0fD.A09(-1168715613, A022);
    }
}
