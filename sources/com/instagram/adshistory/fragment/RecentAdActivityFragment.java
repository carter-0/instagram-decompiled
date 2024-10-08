package com.instagram.adshistory.fragment;

import X.0S7;
import X.0Tu;
import X.0hq;
import X.0lg;
import X.0qQ;
import X.182;
import X.1L2;
import X.2da;
import X.2el;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass07i;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass2k2;
import X.AnonymousClass2kR;
import X.AnonymousClass32G;
import X.AnonymousClass332;
import X.AnonymousClass36D;
import X.AnonymousClass3DZ;
import X.AnonymousClass4DM;
import X.AnonymousClass4DN;
import X.AnonymousClass4DS;
import X.AnonymousClass4DU;
import X.AnonymousClass5FQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C14190TrU;
import X.C17118VIo;
import X.C227252iu;
import X.C227622jd;
import X.C227642jf;
import X.C227752jr;
import X.C227762js;
import X.C228172ku;
import X.C228602lw;
import X.C229132mt;
import X.C229382nI;
import X.C234042wt;
import X.C234172xD;
import X.C2362232x;
import X.C249383je;
import X.C252243on;
import X.C3034368u;
import X.C310336ap;
import X.C320156rr;
import X.C50298FXd;
import X.C51969G9p;
import X.C51975G9x;
import X.C54223H3s;
import X.C55439Hhj;
import X.C55440Hhk;
import X.C55591HkB;
import X.C56537I0m;
import X.C56800ICx;
import X.C57404IaA;
import X.C57413IaJ;
import X.DbS;
import X.DbT;
import X.DbW;
import X.Dbb;
import X.H41;
import X.HQJ;
import X.ID2;
import X.IVV;
import X.IWL;
import X.W11;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.ArrayList;

public final class RecentAdActivityFragment extends AnonymousClass32G implements AnonymousClass4DU, C229132mt, C227252iu, AbsListView.OnScrollListener, AnonymousClass4DS, AnonymousClass4DM, AnonymousClass4DN {
    public C54223H3s A00;
    public C56537I0m A01;
    public C3034368u A02;
    public 2el A03;
    public EmptyStateView A04;
    public RefreshableListView A05;
    public String A06;
    public C229382nI A07;
    public C252243on A08;
    public C14190TrU A09;
    public AnonymousClass332 A0A;
    public AnonymousClass36D A0B;
    public final AnonymousClass2k2 A0C = new AnonymousClass2k2();
    public final AnonymousClass0eM A0D = C227642jf.A02(this);
    public final C228172ku A0E = new C228172ku();
    public final String A0F = "recent_ad_activity";

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131952209);
        r2.ErT(this);
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        RefreshableListView refreshableListView;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        0S7.A00(this);
        ListView listView = this.A04;
        if (listView instanceof RefreshableListView) {
            refreshableListView = (RefreshableListView) listView;
        } else {
            refreshableListView = null;
        }
        this.A05 = refreshableListView;
        if (refreshableListView != null) {
            refreshableListView.setupAndEnableRefresh(new C56800ICx(this, 0));
            View emptyView = refreshableListView.getEmptyView();
            if (emptyView != null) {
                EmptyStateView emptyStateView = (EmptyStateView) emptyView;
                this.A04 = emptyStateView;
                emptyStateView.A0N(new ID2(0, (Object) emptyStateView, (Object) this), C320156rr.ERROR);
                C57404IaA iaA = new C57404IaA(this, 0);
                C320156rr r1 = C320156rr.EMPTY;
                emptyStateView.A0O(iaA, r1);
                emptyStateView.A0R(r1, R.drawable.instagram_core_ads_solution_assets_nullstateactivityoutlineandroid);
                emptyStateView.A0T(r1, 2131952214);
                emptyStateView.A0S(r1, 2131952213);
                emptyStateView.A0Q(r1, 2131952212);
                emptyStateView.A0L();
                RefreshableListView refreshableListView2 = this.A05;
                if (refreshableListView2 != null) {
                    refreshableListView2.setOnScrollListener(this);
                }
                C56537I0m i0m = this.A01;
                if (i0m == null) {
                    0qQ.A0F("adsHistoryDataFetcher");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    i0m.A01();
                    return;
                }
            }
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return DbT.A0X(this.A0D);
    }

    public final void ACw() {
        C56537I0m i0m = this.A01;
        if (i0m == null) {
            0qQ.A0F("adsHistoryDataFetcher");
            throw AnonymousClass00P.createAndThrow();
        }
        C57413IaJ iaJ = i0m.A06;
        if (iaJ.A00.A05 && !iaJ.isLoading()) {
            iaJ.CgO();
        }
    }

    public final String getModuleName() {
        return this.A0F;
    }

    public final AnonymousClass2k2 getVolumeKeyPressController() {
        return this.A0C;
    }

    public static final void A01(RecentAdActivityFragment recentAdActivityFragment, String str) {
        FragmentActivity requireActivity = recentAdActivityFragment.requireActivity();
        IWL iwl = new IWL();
        C310336ap A0Z = C51975G9x.A0Z();
        DbS.A19(requireActivity, A0Z, 2131952211);
        A0Z.A0I = recentAdActivityFragment.requireActivity().getString(2131952210);
        A0Z.A02();
        A0Z.A07(R.drawable.instagram_eye_off_pano_outline_24);
        if (182.A06(0Tu.A05, DbT.A0X(recentAdActivityFragment.A0D), 36317418821325941L)) {
            DbW.A0q(requireActivity, A0Z, 2131975851);
            A0Z.A0A = new IVV(recentAdActivityFragment, iwl, str, 0);
            A0Z.A0L = true;
        }
        Dbb.A1Q(A0Z);
    }

    public final void EKl() {
        0S7.A00(this);
        ListView listView = this.A04;
        0qQ.A07(listView);
        C17118VIo.A00(listView, this);
    }

    /* JADX WARNING: type inference failed for: r0v18, types: [X.32y, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(582242501);
        RecentAdActivityFragment.super.onCreate(bundle);
        this.A03 = C51969G9p.A0k();
        HQJ.A00 = new C55439Hhj(this);
        Context requireContext = requireContext();
        C228602lw r7 = new C228602lw(requireContext, AnonymousClass07i.A00(this), (Integer) null);
        ArrayList A1C = AnonymousClass7TE.A1C();
        AnonymousClass0eM r1 = this.A0D;
        A1C.add(new C55591HkB(new C55440Hhk(this), AnonymousClass7TE.A0l(r1)));
        this.A01 = new C56537I0m(this, r7, AnonymousClass7TE.A0l(r1), A1C);
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        C14190TrU trU = new C14190TrU(AnonymousClass7TE.A0l(r1), this, AnonymousClass05K.A01, 3);
        this.A09 = trU;
        AnonymousClass3DZ A002 = AnonymousClass3DZ.A00(this);
        0lg A0X = DbT.A0X(r1);
        2el r0 = this.A03;
        if (r0 == null) {
            str = "viewpointManager";
        } else {
            C229382nI A032 = C229382nI.A03(this, A0X, r0);
            this.A07 = A032;
            C50298FXd fXd = new C50298FXd(0, this, A002);
            this.A08 = fXd;
            str = "bloksHost";
            A032.A05(fXd);
            AnonymousClass2kR r13 = new AnonymousClass2kR(requireContext, AnonymousClass7TE.A0l(r1), this);
            FragmentActivity requireActivity = requireActivity();
            C56537I0m i0m = this.A01;
            if (i0m == null) {
                str = "adsHistoryDataFetcher";
            } else {
                C57413IaJ iaJ = i0m.A06;
                C229382nI r02 = this.A07;
                if (r02 != null) {
                    C54223H3s h3s = new C54223H3s(requireActivity, new H41(this, r02), this, r13, iaJ);
                    this.A00 = h3s;
                    A0V(h3s);
                    0hq r2 = this.mFragmentManager;
                    C54223H3s h3s2 = this.A00;
                    str = "adapter";
                    if (h3s2 != null) {
                        C2362232x r5 = new C2362232x(this, r2, h3s2, r13);
                        r5.A0R = 1L2.A00();
                        C227762js A003 = C227752jr.A00(requireContext(), (Float) null, false);
                        C54223H3s h3s3 = this.A00;
                        if (h3s3 != null) {
                            C228172ku r8 = this.A0E;
                            r5.A0C = new C234172xD(this, A003, r8, h3s3);
                            r5.A0B = new Object();
                            r5.A0T = AnonymousClass7TE.A0v();
                            AnonymousClass332 A004 = r5.A00();
                            this.A0A = A004;
                            C234042wt r3 = new C234042wt(this, AnonymousClass7TE.A0l(r1), this);
                            UserSession A0l = AnonymousClass7TE.A0l(r1);
                            C54223H3s h3s4 = this.A00;
                            if (h3s4 != null) {
                                AnonymousClass36D r03 = new AnonymousClass36D(A0l, h3s4, false, false);
                                this.A0B = r03;
                                r03.A01();
                                r8.A01(trU);
                                0qQ.A0A(A004);
                                r8.A01(A004);
                                C227622jd r12 = new C227622jd();
                                r12.A0E(this.A0A);
                                AnonymousClass36D r04 = this.A0B;
                                if (r04 == null) {
                                    str = "mediaUpdateListener";
                                } else {
                                    r12.A0E(r04);
                                    r12.A0E(r3);
                                    A0b(r12);
                                    AnonymousClass0fD.A09(1105004566, A022);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-531080578);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_feed, viewGroup, false);
        AnonymousClass0fD.A09(50868675, A022);
        return inflate;
    }

    public final void onDestroy() {
        C252243on r0;
        int A022 = AnonymousClass0fD.A02(-1084427867);
        super.onDestroy();
        C14190TrU trU = this.A09;
        if (trU != null) {
            this.A0E.A00.remove(trU);
            this.A09 = null;
        }
        AnonymousClass332 r1 = this.A0A;
        if (r1 != null) {
            this.A0E.A00.remove(r1);
            this.A0A = null;
        }
        C229382nI r12 = this.A07;
        if (!(r12 == null || (r0 = this.A08) == null)) {
            r12.A06(r0);
        }
        HQJ.A00 = null;
        AnonymousClass0fD.A09(561999681, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1057755721);
        super.onResume();
        String str = this.A06;
        if (str != null) {
            A01(this, str);
            this.A06 = null;
        }
        AnonymousClass0fD.A09(-1216356481, A022);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A032 = AnonymousClass0fD.A03(-509172115);
        0qQ.A0B(absListView, 0);
        C54223H3s h3s = this.A00;
        if (h3s != null) {
            if (h3s.A00) {
                if (W11.A02(absListView)) {
                    C54223H3s h3s2 = this.A00;
                    if (h3s2 != null) {
                        h3s2.A00 = false;
                    }
                }
                AnonymousClass0fD.A0A(2016119336, A032);
                return;
            }
            this.A0E.onScroll(absListView, i, i2, i3);
            AnonymousClass0fD.A0A(2016119336, A032);
            return;
        }
        0qQ.A0F("adapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A0D2 = AnonymousClass7TG.A0D(absListView, 927604066);
        C54223H3s h3s = this.A00;
        if (h3s == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        }
        if (!h3s.A00) {
            this.A0E.onScrollStateChanged(absListView, i);
        }
        AnonymousClass0fD.A0A(-955506479, A0D2);
    }

    public final boolean onVolumeKeyPressed(AnonymousClass5FQ r2, KeyEvent keyEvent) {
        AnonymousClass7TG.A1N(r2, keyEvent);
        return this.A0C.onVolumeKeyPressed(r2, keyEvent);
    }
}
