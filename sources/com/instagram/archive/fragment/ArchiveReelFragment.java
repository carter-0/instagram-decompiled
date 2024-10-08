package com.instagram.archive.fragment;

import X.0S7;
import X.0lg;
import X.0qQ;
import X.1OP;
import X.1Wj;
import X.1Xj;
import X.1iA;
import X.2PP;
import X.2da;
import X.AnonymousClass000;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass328;
import X.AnonymousClass32A;
import X.AnonymousClass32D;
import X.AnonymousClass32G;
import X.AnonymousClass3BQ;
import X.AnonymousClass3BU;
import X.AnonymousClass3WR;
import X.AnonymousClass4DR;
import X.AnonymousClass4DS;
import X.AnonymousClass4DT;
import X.AnonymousClass4U8;
import X.AnonymousClass4UA;
import X.AnonymousClass6ST;
import X.AnonymousClass6UY;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass8QN;
import X.AnonymousClass8QP;
import X.AnonymousClass8QW;
import X.AnonymousClass8QZ;
import X.AnonymousClass972;
import X.C13988Tno;
import X.C13989Tnp;
import X.C15469UdK;
import X.C16163Upo;
import X.C16856V8l;
import X.C17118VIo;
import X.C17662Vbs;
import X.C17933ViO;
import X.C18887WAz;
import X.C19482WaU;
import X.C19517Wb3;
import X.C19694Wdw;
import X.C20290Wof;
import X.C20335WpY;
import X.C21048XBp;
import X.C227252iu;
import X.C227762js;
import X.C228172ku;
import X.C229402nK;
import X.C230222pE;
import X.C231002qi;
import X.C249383je;
import X.C255773uh;
import X.C311566ct;
import X.C320156rr;
import X.C3251571g;
import X.C361778gm;
import X.C40659AgZ;
import X.C51966G9m;
import X.C51970G9q;
import X.C51972G9s;
import X.C53401GnY;
import X.C55977Hqi;
import X.C59689JTv;
import X.C60308Jj7;
import X.C61056Jvu;
import X.C61323K2k;
import X.C61324K2l;
import X.C63920LCw;
import X.C63971LGa;
import X.C64184LSr;
import X.C71662eb;
import X.DbS;
import X.DbT;
import X.DbV;
import X.Dba;
import X.DcL;
import X.JTT;
import X.Ki3;
import X.L3L;
import X.LYC;
import X.UYJ;
import X.UYL;
import X.Us9;
import X.VVA;
import X.WT0;
import X.X3F;
import X.X6E;
import X.X7f;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.ReelAutoArchiveSettingStr;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.model.reels.ReelViewerContextButtonType;
import com.instagram.ui.emptystaterow.EmptyStateView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArchiveReelFragment extends AnonymousClass32G implements AnonymousClass4DR, AnonymousClass8QW, C311566ct, C227252iu, AbsListView.OnScrollListener, AnonymousClass4DS, C21048XBp, AnonymousClass4DT, X7f, C230222pE, X6E, X3F {
    public C15469UdK A00;
    public WT0 A01;
    public Ki3 A02;
    public C60308Jj7 A03;
    public UserSession A04;
    public AnonymousClass8QN A05;
    public AnonymousClass8QP A06;
    public AnonymousClass32A A07;
    public AnonymousClass6ST A08;
    public Runnable A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public int A0J;
    public C63971LGa A0K;
    public C63920LCw A0L;
    public C227762js A0M;
    public AnonymousClass8QZ A0N;
    public C231002qi A0O;
    public C361778gm A0P;
    public ArrayList A0Q;
    public boolean A0R;
    public final Set A0S = new HashSet();
    public final Set A0T = new HashSet();
    public final C228172ku A0U = new C228172ku();
    public View mContextualNavigationAnimationTargetView;
    public C229402nK mDropFrameWatcher;
    public EmptyStateView mEmptyStateView;
    public C71662eb mFastScrollStubHolder;
    public C17933ViO mViewPortObserver;

    public final boolean CbJ() {
        return true;
    }

    public final void Cvv(C19517Wb3 wb3, Reel reel, List list, int i, int i2, int i3, boolean z) {
        String str;
        boolean z2 = this.A0R;
        UserSession userSession = this.A04;
        Reel reel2 = reel;
        int i4 = i3;
        if (z2) {
            C255773uh A0A2 = reel2.A0A(userSession, i4);
            if (!A0A2.A1g() && !z) {
                Context context = getContext();
                int i5 = 2131963436;
                if (A0A2.A1m()) {
                    i5 = 2131963437;
                }
                if (A0A2.A1m()) {
                    str = "highlights_edit_video_cannot_be_selected";
                } else {
                    str = "highlights_edit_photo_cannot_be_selected";
                }
                C59689JTv.A0F(context, str, i5);
            } else if (this.A0I) {
                this.A05.getClass();
                1Xj r2 = A0A2.A0b;
                if (r2 != null) {
                    AnonymousClass8QN r1 = this.A05;
                    if (z) {
                        String id = r2.getId();
                        id.getClass();
                        r1.A09(id);
                    } else {
                        r1.A08(this.A0N, r2);
                    }
                    C64184LSr.A00(this.A00.A08).A06(r2);
                }
            } else {
                1Xj r3 = A0A2.A0b;
                if (r3 != null) {
                    this.A0L.A00(r3, AnonymousClass7TF.A1W(r3.BR7(), 1iA.A0Q));
                }
            }
        } else {
            A07(this, reel2.A0A(userSession, i4));
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Reel A0L2 = Dba.A0L(this.A04, AnonymousClass7TE.A18(it));
                if (A0L2 != null) {
                    arrayList.add(A0L2);
                }
            }
            AnonymousClass32A r22 = this.A07;
            if (r22 == null) {
                r22 = new AnonymousClass32A(this, this.A04, new AnonymousClass328(this));
                this.A07 = r22;
            }
            r22.A0C = this.A0B;
            FragmentActivity activity = getActivity();
            0S7.A00(this);
            r22.A05 = new C16163Upo(activity, this.A04, this, this.A00, this);
            r22.A0D = this.A04.A06;
            AnonymousClass32D r12 = new AnonymousClass32D();
            r12.A00 = ReelViewerContextButtonType.VIEW_ON_MAP;
            r12.A06 = false;
            r22.A03 = new ReelViewerConfig(r12);
            r22.A06(reel2, AnonymousClass3BQ.ARCHIVE, wb3, arrayList, arrayList, i4);
        }
    }

    public final /* synthetic */ void D3h(Integer num) {
    }

    public final /* synthetic */ void DBA(int i) {
    }

    public final /* synthetic */ void DFj(Reel reel, AnonymousClass6UY r2) {
    }

    public final void DPq(String str, String str2) {
    }

    public final void DQo(String str, String str2) {
    }

    public final void DQr(String str, String str2) {
    }

    public final void DVy() {
    }

    public final void DW7() {
    }

    public final /* synthetic */ void Dik() {
    }

    public final /* synthetic */ void Du1(C53401GnY gnY) {
    }

    public final /* synthetic */ void Du4() {
    }

    public static void A01(ArchiveReelFragment archiveReelFragment) {
        C320156rr r3;
        EmptyStateView emptyStateView;
        int i;
        EmptyStateView emptyStateView2 = archiveReelFragment.mEmptyStateView;
        C320156rr r32 = C320156rr.ERROR;
        emptyStateView2.A0R(r32, R.drawable.loadmore_icon_refresh_compound);
        archiveReelFragment.mEmptyStateView.A0N(new C18887WAz(archiveReelFragment, 25), r32);
        ReelAutoArchiveSettingStr BkX = DbT.A0j(archiveReelFragment.A04).A03.BkX();
        if (BkX == null) {
            BkX = ReelAutoArchiveSettingStr.A07;
        }
        int ordinal = BkX.ordinal();
        if (ordinal == 1) {
            EmptyStateView emptyStateView3 = archiveReelFragment.mEmptyStateView;
            r3 = C320156rr.EMPTY;
            emptyStateView3.A0T(r3, 2131974259);
            archiveReelFragment.mEmptyStateView.A0S(r3, 2131974257);
            archiveReelFragment.mEmptyStateView.A0Q(r3, 2131974255);
            emptyStateView = archiveReelFragment.mEmptyStateView;
            i = 0;
            emptyStateView.A0O(new C19694Wdw(archiveReelFragment, i), r3);
        } else if (ordinal == 2) {
            EmptyStateView emptyStateView4 = archiveReelFragment.mEmptyStateView;
            r3 = C320156rr.EMPTY;
            emptyStateView4.A0T(r3, 2131974258);
            archiveReelFragment.mEmptyStateView.A0S(r3, 2131974256);
            archiveReelFragment.mEmptyStateView.A0Q(r3, 2131974254);
            emptyStateView = archiveReelFragment.mEmptyStateView;
            i = 1;
            emptyStateView.A0O(new C19694Wdw(archiveReelFragment, i), r3);
        } else if (ordinal == 3) {
            EmptyStateView emptyStateView5 = archiveReelFragment.mEmptyStateView;
            C320156rr r2 = C320156rr.EMPTY;
            emptyStateView5.A0T(r2, 2131974258);
            archiveReelFragment.mEmptyStateView.A0S(r2, 2131974256);
            archiveReelFragment.mEmptyStateView.A0U(r2, "");
        }
        archiveReelFragment.mEmptyStateView.A0R(C320156rr.EMPTY, R.drawable.empty_state_private);
    }

    public static void A03(ArchiveReelFragment archiveReelFragment) {
        int i;
        archiveReelFragment.mFastScrollStubHolder.getClass();
        0S7.A00(archiveReelFragment);
        ListView listView = archiveReelFragment.A04;
        listView.setVerticalScrollBarEnabled(false);
        int A002 = C16856V8l.A00(archiveReelFragment.requireContext());
        C15469UdK udK = archiveReelFragment.A00;
        int count = udK.getCount();
        if (count > 0) {
            0S7.A00(archiveReelFragment);
            View view = udK.getView(count - 1, (View) null, archiveReelFragment.A04);
            C13989Tnp.A19(view, JTT.A06(archiveReelFragment), AnonymousClass972.MUTABLE_FLAG_MASK);
            i = view.getMeasuredHeight();
        } else {
            i = 0;
        }
        C361778gm r1 = archiveReelFragment.A0P;
        if (r1 != null) {
            archiveReelFragment.A0U.A00.remove(r1);
        }
        UserSession userSession = archiveReelFragment.A04;
        Us9 us9 = new Us9(listView);
        C15469UdK udK2 = archiveReelFragment.A00;
        View A012 = archiveReelFragment.mFastScrollStubHolder.A01();
        int i2 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        C51972G9s.A1C(udK2, A012);
        C361778gm r3 = new C361778gm(A012, userSession, udK2, new C40659AgZ(us9, udK2, A002, i), us9, udK2);
        archiveReelFragment.A0P = r3;
        r3.A00 = 0.0f;
        archiveReelFragment.A0U.A01(r3);
    }

    public static void A04(ArchiveReelFragment archiveReelFragment) {
        ArrayList arrayList = archiveReelFragment.A0Q;
        if (arrayList != null) {
            C64184LSr A002 = C64184LSr.A00(archiveReelFragment.A00.A08);
            A002.A05.clear();
            A002.A07.clear();
            for (X3F DQl : A002.A06) {
                DQl.DQl();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C15469UdK udK = archiveReelFragment.A00;
                UYJ uyj = udK.A03;
                0qQ.A0B(next, 0);
                if (uyj.A04.containsKey(next)) {
                    1Xj r1 = ((C17662Vbs) uyj.A01.get(C13988Tno.A0D(C51966G9m.A14(next, uyj.A03)))).A02;
                    r1.getClass();
                    C64184LSr.A00(udK.A08).A06(r1);
                }
            }
        }
    }

    public static void A05(ArchiveReelFragment archiveReelFragment) {
        int i;
        long j;
        Integer num;
        C60308Jj7 jj7 = archiveReelFragment.A03;
        List<C55977Hqi> A002 = C60308Jj7.A00(jj7.A05, (Map) ((C61056Jvu) jj7.A08.getValue()).A02, jj7.A0B);
        ArrayList A0m = C51970G9q.A0m(A002);
        for (C55977Hqi hqi : A002) {
            C255773uh r6 = hqi.A03;
            Reel reel = hqi.A02;
            if (hqi instanceof UYL) {
                r6.getClass();
                i = hqi.A00;
                j = hqi.A01;
                num = AnonymousClass05K.A0N;
            } else {
                if (hqi instanceof C61323K2k) {
                    i = hqi.A00;
                    j = hqi.A01;
                    num = AnonymousClass05K.A01;
                } else if (hqi instanceof C61324K2l) {
                    i = hqi.A00;
                    j = hqi.A01;
                    num = AnonymousClass05K.A0C;
                }
                r6 = null;
            }
            A0m.add(new C17662Vbs(reel, r6, num, i, j));
        }
        archiveReelFragment.A00.A0D(A0m);
        A06(archiveReelFragment);
    }

    public static void A06(ArchiveReelFragment archiveReelFragment) {
        if (archiveReelFragment.mEmptyStateView != null) {
            if (((C61056Jvu) archiveReelFragment.A03.A09.getValue()).A03 == AnonymousClass05K.A01) {
                archiveReelFragment.mEmptyStateView.A0L();
            } else if (((C61056Jvu) archiveReelFragment.A03.A09.getValue()).A03 == AnonymousClass05K.A00) {
                archiveReelFragment.mEmptyStateView.A0J();
            } else {
                boolean isEmpty = archiveReelFragment.A00.isEmpty();
                EmptyStateView emptyStateView = archiveReelFragment.mEmptyStateView;
                if (isEmpty) {
                    emptyStateView.A0I();
                } else {
                    emptyStateView.A0K();
                }
            }
            archiveReelFragment.mEmptyStateView.A0H();
        }
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return this.A04;
    }

    public final C227762js BD0() {
        return this.A0M;
    }

    public final /* synthetic */ boolean Cdb() {
        return false;
    }

    public final void Cxx(String str, Integer num) {
        View view;
        if (num == AnonymousClass05K.A00 && (view = this.mContextualNavigationAnimationTargetView) != null) {
            view.setVisibility(4);
        }
    }

    public final void DFd(String str, Integer num) {
        if (num == AnonymousClass05K.A00) {
            AnonymousClass7TF.A16(this.mContextualNavigationAnimationTargetView);
        }
    }

    public final void DMh(String str) {
        this.A0K.A05(str, AnonymousClass05K.A00);
    }

    public final void DMi(String str) {
        this.A0K.A03(str);
    }

    public final void DMj(String str, boolean z) {
        Reel A0L2;
        if (((Map) ((C61056Jvu) this.A03.A08.getValue()).A02).containsKey(str) && !z && (A0L2 = Dba.A0L(this.A04, str)) != null && !A0L2.A15(this.A04)) {
            this.A0K.A02(str);
            A05(this);
            this.A0K.A01(str);
        }
    }

    public final void DQ3(String str, String str2) {
        this.A0K.A05(str, AnonymousClass05K.A01);
    }

    public final void DYr(String str, Integer num) {
        String str2;
        Number A14;
        int intValue;
        if (num == AnonymousClass05K.A00) {
            String str3 = str;
            L3L l3l = (L3L) WT0.A00(this.A04).A03.get(str);
            if (l3l != null && (str2 = l3l.A01) != null && (A14 = C51966G9m.A14(str2, this.A00.A0F)) != null && (intValue = A14.intValue()) >= 0 && intValue < this.A00.getCount()) {
                0S7.A00(this);
                ListView listView = this.A04;
                listView.setSelection(intValue);
                Object item = this.A00.getItem(intValue);
                if (item instanceof VVA) {
                    VVA vva = (VVA) item;
                    String str4 = l3l.A01;
                    if (str4 != null) {
                        int i = 0;
                        while (true) {
                            C3251571g r1 = vva.A00;
                            if (i < r1.A01()) {
                                if (2PP.A00(((C17662Vbs) r1.A02(i)).A07, str4)) {
                                    break;
                                }
                                i++;
                            } else {
                                i = -1;
                                break;
                            }
                        }
                        int A0A2 = i + AnonymousClass7TG.A0A(l3l.A00);
                        if (A0A2 != -1) {
                            int i2 = intValue + (A0A2 / 3);
                            int i3 = A0A2 % 3;
                            if (i2 != intValue) {
                                listView.setSelection(i2);
                            }
                            listView.post(new C20335WpY(listView, this, str3, i2, i3));
                        }
                    }
                }
            }
        }
    }

    public final /* synthetic */ boolean EtH() {
        return false;
    }

    public final void configureActionBar(2da r5) {
        View.OnClickListener lyc;
        View.OnClickListener lyc2;
        if (this.A0I) {
            r5.Eom(2131974252);
            if (this.A0I) {
                lyc2 = new C18887WAz(this, 26);
            } else {
                int i = 28;
                if (this.A0H) {
                    i = 29;
                }
                lyc2 = new LYC((Object) this, i);
            }
            r5.AA9(lyc2, 2131960992);
            View view = this.mView;
            if (view != null) {
                ViewGroup.MarginLayoutParams A0D2 = DbS.A0D(view);
                A0D2.topMargin = r5.AYI();
                view.setLayoutParams(A0D2);
            }
        } else if (this.A00.Brl().isEmpty()) {
            int i2 = 2131956869;
            if (this.A0H) {
                i2 = 2131956853;
            }
            r5.Eom(i2);
            r5.AA6(2131968361);
        } else {
            r5.setTitle(AnonymousClass7TF.A0e(DbV.A05(this), Integer.valueOf(this.A00.Brl().size()), 2131963455));
            if (this.A0I) {
                lyc = new C18887WAz(this, 26);
            } else {
                int i3 = 28;
                if (this.A0H) {
                    i3 = 29;
                }
                lyc = new LYC((Object) this, i3);
            }
            r5.AA9(lyc, 2131968361);
        }
        r5.Eu4(true);
    }

    public final /* synthetic */ boolean getCanHaveEmptySegments() {
        return false;
    }

    public final String getModuleName() {
        if (this.A0R) {
            return AnonymousClass000.A00(1743);
        }
        return "archive_stories_tab";
    }

    public final boolean onBackPressed() {
        if (!this.A0C || 1Wj.A00 == null) {
            return false;
        }
        DcL.A00().A03(this.A04, requireActivity(), "317728068821307");
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x006d, code lost:
        if (r11.A00.isEmpty() != false) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r30, android.os.Bundle r31) {
        /*
            r29 = this;
            r11 = r29
            r1 = r30
            r0 = r31
            super.onViewCreated(r1, r0)
            X.WT0 r0 = r11.A01
            java.util.Set r0 = r0.A04
            r0.add(r11)
            com.instagram.ui.emptystaterow.EmptyStateView r0 = X.C13989Tnp.A0d(r11)
            r11.mEmptyStateView = r0
            r0 = 2131432651(0x7f0b14cb, float:1.8487065E38)
            X.2eb r0 = X.DbY.A0S(r1, r0)
            r11.mFastScrollStubHolder = r0
            X.2js r4 = r11.A0M
            X.3Ar r3 = r11.getScrollingViewProxy()
            X.UdK r2 = r11.A00
            int r0 = r11.A0J
            r4.A06(r2, r3, r0)
            androidx.fragment.app.FragmentActivity r4 = r11.requireActivity()
            com.instagram.common.session.UserSession r3 = r11.A04
            r2 = 23592979(0x1680013, float:4.2611723E-38)
            X.2nK r0 = new X.2nK
            r0.<init>(r4, r11, r3, r2)
            r11.mDropFrameWatcher = r0
            r11.registerLifecycleListener(r0)
            X.2ku r4 = r11.A0U
            X.2nK r0 = r11.mDropFrameWatcher
            r4.A03(r0)
            X.0S7.A00(r11)
            android.widget.ListView r2 = r11.A04
            com.instagram.ui.widget.refresh.RefreshableListView r2 = (com.instagram.ui.widget.refresh.RefreshableListView) r2
            r2.APL()
            r0 = 0
            r2.A07 = r0
            r2.setOnScrollListener(r11)
            X.Jj7 r2 = r11.A03
            X.0Ud r2 = r2.A09
            java.lang.Object r2 = r2.getValue()
            X.Jvu r2 = (X.C61056Jvu) r2
            java.lang.Object r3 = r2.A03
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            if (r3 != r2) goto L_0x006f
            X.UdK r2 = r11.A00
            boolean r3 = r2.isEmpty()
            r2 = 1
            if (r3 == 0) goto L_0x0070
        L_0x006f:
            r2 = 0
        L_0x0070:
            X.C46445Df7.A01(r11, r2)
            A06(r11)
            A03(r11)
            com.instagram.common.session.UserSession r2 = r11.A04
            X.3BV r2 = X.1OP.A03(r2)
            r2.A09(r11)
            X.2js r2 = r11.A0M
            r4.A01(r2)
            X.8gm r2 = r11.A0P
            if (r2 == 0) goto L_0x008e
            r4.A01(r2)
        L_0x008e:
            X.0S7.A00(r11)
            android.widget.ListView r2 = r11.A04
            X.VM5 r4 = new X.VM5
            r4.<init>(r2)
            X.Wio r2 = new X.Wio
            r2.<init>(r11)
            X.WNV r3 = new X.WNV
            r3.<init>(r2)
            X.ViO r2 = new X.ViO
            r2.<init>(r4, r3)
            r11.mViewPortObserver = r2
            X.Jj7 r2 = r11.A03
            X.0Ud r2 = r2.A09
            X.0qQ.A0B(r2, r0)
            androidx.lifecycle.CoroutineLiveData r4 = X.DbT.A0G(r2)
            X.07Z r3 = r11.getViewLifecycleOwner()
            X.WEB r2 = new X.WEB
            r2.<init>(r11, r0)
            r4.A06(r3, r2)
            boolean r2 = r11.A0I
            if (r2 == 0) goto L_0x013a
            android.content.Context r3 = r11.requireContext()
            android.content.Context r2 = r11.requireContext()
            int r2 = X.2Yu.A0C(r2)
            X.DbT.A16(r3, r1, r2)
            X.8QP r10 = r11.A06
            if (r10 == 0) goto L_0x013b
            androidx.fragment.app.FragmentActivity r4 = r11.requireActivity()
            com.instagram.common.session.UserSession r7 = r11.A04
            X.WPS r6 = new X.WPS
            r6.<init>(r11)
            r2 = 2131436600(0x7f0b2438, float:1.8495075E38)
            android.view.View r8 = r1.requireViewById(r2)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r8 = (com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout) r8
            r5 = 0
            androidx.fragment.app.FragmentActivity r2 = r11.requireActivity()
            android.content.res.Resources r3 = r2.getResources()
            r2 = 2131165298(0x7f070072, float:1.794481E38)
            int r19 = r3.getDimensionPixelSize(r2)
            androidx.fragment.app.FragmentActivity r2 = r11.requireActivity()
            int r20 = X.AnonymousClass7TG.A05(r2)
            r2 = 1
            r17 = 2131960992(0x7f1324a0, float:1.9558668E38)
            r16 = 1058013184(0x3f100000, float:0.5625)
            r21 = 2131099798(0x7f060096, float:1.781196E38)
            X.C51972G9s.A1C(r7, r8)
            r22 = 2131165195(0x7f07000b, float:1.79446E38)
            X.JYJ r14 = X.JYJ.A00
            X.8QY r15 = X.AnonymousClass8QY.A00
            X.8QZ r3 = new X.8QZ
            r9 = r5
            r12 = r5
            r13 = r5
            r18 = r0
            r23 = r2
            r24 = r0
            r25 = r2
            r26 = r0
            r27 = r0
            r28 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r11.A0N = r3
            r4 = 1
            r3.A0B(r0)
            X.8QZ r3 = r11.A0N
            r3.A0C(r2, r0)
        L_0x0137:
            r1.setFitsSystemWindows(r4)
        L_0x013a:
            return
        L_0x013b:
            r4 = 1
            goto L_0x0137
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.archive.fragment.ArchiveReelFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static void A02(ArchiveReelFragment archiveReelFragment) {
        0S7.A00(archiveReelFragment);
        ListView listView = archiveReelFragment.A04;
        if (listView != null) {
            int lastVisiblePosition = listView.getLastVisiblePosition();
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (int firstVisiblePosition = listView.getFirstVisiblePosition(); firstVisiblePosition <= lastVisiblePosition; firstVisiblePosition++) {
                Object item = archiveReelFragment.A00.getItem(firstVisiblePosition);
                if (item instanceof VVA) {
                    C3251571g r3 = ((VVA) item).A00;
                    for (int i = 0; i < r3.A01(); i++) {
                        C17662Vbs vbs = (C17662Vbs) r3.A02(i);
                        if (vbs.A03 != null && vbs.A03.getId().equals("placeholder")) {
                            z = true;
                        }
                        if (vbs.A03 != null && !vbs.A03.A0z(archiveReelFragment.A04)) {
                            Set set = archiveReelFragment.A0S;
                            if (!set.contains(vbs.A03.getId())) {
                                String id = vbs.A03.getId();
                                arrayList.add(id);
                                set.add(id);
                            }
                        }
                    }
                }
            }
            C19482WaU waU = new C19482WaU(0, archiveReelFragment, arrayList);
            if (z) {
                C60308Jj7.A01(archiveReelFragment.A03, archiveReelFragment.A0A, false);
            }
            archiveReelFragment.A0T.add(waU);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    archiveReelFragment.A0K.A04(AnonymousClass7TE.A18(it));
                }
                1OP.A03(archiveReelFragment.A04).A07(AnonymousClass3BU.ON_TAP, waU, archiveReelFragment.getModuleName(), (String) null, arrayList);
            }
        }
    }

    public static void A07(ArchiveReelFragment archiveReelFragment, C255773uh r6) {
        AnonymousClass3WR A0M2;
        if (r6.A1m() && (A0M2 = r6.A0M(archiveReelFragment.A04)) != null) {
            AnonymousClass4U8 r1 = new AnonymousClass4U8(archiveReelFragment.requireContext(), archiveReelFragment.A04, A0M2, archiveReelFragment.getModuleName());
            r1.A03 = true;
            r1.A02 = true;
            AnonymousClass4UA.A00(r1.A00());
        }
    }

    public final void Cvx(C17662Vbs vbs) {
        C59689JTv.A0F(requireContext(), "archive_media_unavailable", 2131953144);
    }

    public final void DQl() {
        C51970G9q.A12(getActivity());
    }

    public final void EKl() {
        0S7.A00(this);
        C17118VIo.A00(this.A04, this);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        1Wj A002;
        FragmentActivity requireActivity;
        UserSession userSession;
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 401) {
            if (i2 == -1) {
                if (intent != null) {
                    this.A09 = new C20290Wof(this, intent.getParcelableArrayListExtra(AnonymousClass000.A00(123)), intent.getParcelableArrayListExtra(AnonymousClass000.A00(233)));
                    if (1Wj.A00 != null) {
                        A002 = DcL.A00();
                        requireActivity = requireActivity();
                        userSession = this.A04;
                        str = "337086033562830";
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (1Wj.A00 != null) {
                A002 = DcL.A00();
                requireActivity = requireActivity();
                userSession = this.A04;
                str = "309151609683923";
            } else {
                return;
            }
            A002.A03(userSession, requireActivity, str);
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, X.0S7, androidx.fragment.app.Fragment, java.lang.Object, com.instagram.archive.fragment.ArchiveReelFragment, X.32G] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = -1131953374(0xffffffffbc87c322, float:-0.016572539)
            int r1 = X.AnonymousClass0fD.A02(r0)
            r5 = r17
            r4 = r18
            com.instagram.archive.fragment.ArchiveReelFragment.super.onCreate(r4)
            android.os.Bundle r2 = r5.requireArguments()
            r0 = 81
            java.lang.String r0 = X.C273654mx.A00(r0)
            r14 = 0
            boolean r13 = r2.getBoolean(r0, r14)
            java.lang.String r0 = "archive_multi_select_mode"
            boolean r0 = r2.getBoolean(r0, r14)
            r5.A0R = r0
            r0 = 1530(0x5fa, float:2.144E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r12 = r2.getBoolean(r0, r14)
            r0 = 4847(0x12ef, float:6.792E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.getBoolean(r0, r14)
            r5.A0F = r0
            java.lang.String r3 = "highlight_management_source"
            java.io.Serializable r0 = r2.getSerializable(r3)
            if (r0 == 0) goto L_0x004b
            java.io.Serializable r0 = r2.getSerializable(r3)
            X.Ki3 r0 = (X.Ki3) r0
            r5.A02 = r0
        L_0x004b:
            r0 = 768(0x300, float:1.076E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r2.getBoolean(r0, r14)
            r5.A0G = r0
            r0 = 3437(0xd6d, float:4.816E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.getBoolean(r0, r14)
            r5.A0H = r0
            r0 = 3455(0xd7f, float:4.841E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.getBoolean(r0, r14)
            r5.A0I = r0
            r0 = 3351(0xd17, float:4.696E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.util.ArrayList r0 = r2.getStringArrayList(r0)
            r5.A0Q = r0
            android.os.Bundle r2 = r5.requireArguments()
            java.lang.String r0 = "edit_highlights_reel_id"
            java.lang.String r0 = r2.getString(r0)
            r5.A0A = r0
            com.instagram.common.session.UserSession r0 = X.DbX.A0U(r5)
            r5.A04 = r0
            X.02m r3 = X.02m.A0p
            X.0xx r2 = X.AnonymousClass07a.A00(r5)
            X.LGa r0 = new X.LGa
            r0.<init>(r2, r3)
            r5.A0K = r0
            com.instagram.common.session.UserSession r0 = r5.A04
            X.WT0 r0 = X.WT0.A00(r0)
            r5.A01 = r0
            if (r18 != 0) goto L_0x00ab
            if (r12 == 0) goto L_0x00ab
            com.instagram.common.session.UserSession r0 = r5.A04
            X.C64184LSr.A03(r0)
        L_0x00ab:
            X.WNa r4 = new X.WNa
            r4.<init>(r5)
            X.WNb r3 = new X.WNb
            r3.<init>(r5)
            android.content.Context r2 = r5.requireContext()
            X.LCw r0 = new X.LCw
            r0.<init>(r2, r4, r3)
            r5.A0L = r0
            X.1YN r4 = X.AnonymousClass2bO.A00()
            X.WPS r6 = new X.WPS
            r6.<init>(r5)
            com.instagram.common.session.UserSession r7 = r5.A04
            com.instagram.quickpromotion.intf.QuickPromotionSlot r9 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A06
            X.AnonymousClass2bO.A00()
            r0 = 0
            X.WZX r3 = new X.WZX
            r3.<init>(r5, r14)
            X.WZZ r2 = new X.WZZ
            r2.<init>(r5, r14)
            X.2bW r8 = X.2bV.A04(r3, r2)
            X.2qi r2 = r4.A02(r5, r6, r7, r8, r9)
            r5.A0O = r2
            androidx.fragment.app.FragmentActivity r3 = r5.requireActivity()
            android.content.Context r4 = r5.requireContext()
            com.instagram.common.session.UserSession r10 = r5.A04
            boolean r15 = r5.A0F
            X.2qi r11 = r5.A0O
            X.UdK r2 = new X.UdK
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r16 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r5.A00 = r2
            X.2qi r2 = r5.A0O
            r2.Dh3()
            X.UdK r2 = r5.A00
            r5.A0V(r2)
            X.UdK r3 = r5.A00
            boolean r2 = r5.A0R
            r3.A02 = r2
            r3.A0C()
            java.lang.String r2 = X.AnonymousClass7TF.A0b()
            r5.A0B = r2
            X.07f r4 = r5.getViewModelStore()
            com.instagram.common.session.UserSession r3 = r5.A04
            X.0xx r7 = X.AnonymousClass07a.A00(r5)
            java.lang.String r9 = r5.getModuleName()
            boolean r2 = r5.A0H
            X.KEE r6 = new X.KEE
            r8 = r3
            r10 = r13
            r11 = r2
            r6.<init>(r7, r8, r9, r10, r11)
            X.2YN r3 = new X.2YN
            r3.<init>(r6, r4)
            java.lang.Class<X.Jj7> r2 = X.C60308Jj7.class
            X.2YL r2 = r3.A00(r2)
            X.Jj7 r2 = (X.C60308Jj7) r2
            r5.A03 = r2
            android.content.Context r2 = r5.requireContext()
            int r2 = X.C66582MXn.A01(r2)
            r5.A0J = r2
            android.content.Context r3 = r5.requireContext()
            int r2 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            X.2js r0 = X.C227752jr.A00(r3, r0, r14)
            r5.A0M = r0
            X.Jj7 r3 = r5.A03
            java.lang.String r2 = r5.A0A
            r0 = 1
            X.C60308Jj7.A01(r3, r2, r0)
            boolean r0 = r5.A0I
            if (r0 == 0) goto L_0x0175
            android.view.Window r3 = X.DbV.A0G(r5)
            if (r3 == 0) goto L_0x0175
            android.view.View r2 = r3.getDecorView()
            boolean r0 = X.2db.A0B(r2, r3)
            if (r0 == 0) goto L_0x0175
            X.2db.A07(r2, r3, r14)
        L_0x0175:
            r0 = -259044417(0xfffffffff08f4bbf, float:-3.5478342E29)
            X.AnonymousClass0fD.A09(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.archive.fragment.ArchiveReelFragment.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1345131084);
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.layout_feed);
        AnonymousClass0fD.A09(1289206806, A022);
        return A0C2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1553111013);
        super.onDestroyView();
        1OP.A03(this.A04).A0A(this);
        unregisterLifecycleListener(this.mDropFrameWatcher);
        C228172ku r1 = this.A0U;
        C227762js r0 = this.A0M;
        ArrayList arrayList = r1.A00;
        arrayList.remove(r0);
        C361778gm r02 = this.A0P;
        if (r02 != null) {
            arrayList.remove(r02);
        }
        this.A01.A04.remove(this);
        ArchiveReelFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0fD.A09(111825219, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-589546467);
        ArchiveReelFragment.super.onPause();
        C64184LSr.A00(this.A04).A06.remove(this);
        C64184LSr A002 = C64184LSr.A00(this.A04);
        A002.A06.remove(this.A00);
        C17933ViO viO = this.mViewPortObserver;
        if (viO.A04) {
            viO.A04 = false;
            viO.A01.clear();
            viO.A03.clear();
            Choreographer.getInstance().removeFrameCallback(viO.A06);
        }
        AnonymousClass0fD.A09(-1347532810, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1709929027);
        super.onResume();
        C64184LSr.A00(this.A04).A06.add(this);
        C64184LSr A002 = C64184LSr.A00(this.A04);
        A002.A06.add(this.A00);
        Runnable runnable = this.A09;
        if (runnable != null) {
            runnable.run();
        }
        A01(this);
        A05(this);
        this.mViewPortObserver.A00();
        A02(this);
        AnonymousClass0fD.A09(-688615862, A022);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A032 = AnonymousClass0fD.A03(-1571032066);
        this.A0U.onScroll(absListView, i, i2, i3);
        AnonymousClass0fD.A0A(881284529, A032);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A032 = AnonymousClass0fD.A03(-1078772019);
        this.A0U.onScrollStateChanged(absListView, i);
        AnonymousClass0fD.A0A(904329432, A032);
    }

    public final void DcC(Reel reel) {
        A05(this);
    }

    public final void Dcl(Reel reel) {
        A05(this);
    }
}
