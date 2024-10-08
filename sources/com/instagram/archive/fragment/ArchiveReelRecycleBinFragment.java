package com.instagram.archive.fragment;

import X.0S7;
import X.0Yh;
import X.0eO;
import X.0lg;
import X.0qQ;
import X.1OP;
import X.2HY;
import X.2bv;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass1YB;
import X.AnonymousClass32A;
import X.AnonymousClass32G;
import X.AnonymousClass3BQ;
import X.AnonymousClass3BU;
import X.AnonymousClass4DR;
import X.AnonymousClass4DT;
import X.AnonymousClass6UY;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C13991Tnr;
import X.C15469UdK;
import X.C16162Upn;
import X.C17118VIo;
import X.C17662Vbs;
import X.C17933ViO;
import X.C18887WAz;
import X.C19482WaU;
import X.C19517Wb3;
import X.C21048XBp;
import X.C227252iu;
import X.C227642jf;
import X.C227752jr;
import X.C227762js;
import X.C227862kA;
import X.C228172ku;
import X.C230222pE;
import X.C249383je;
import X.C252063oV;
import X.C255773uh;
import X.C311566ct;
import X.C320156rr;
import X.C3251571g;
import X.C361778gm;
import X.C51971G9r;
import X.C55977Hqi;
import X.C59689JTv;
import X.C59721JVf;
import X.C60285Jih;
import X.C61079JwH;
import X.C61323K2k;
import X.C61324K2l;
import X.C66582MXn;
import X.DbS;
import X.DbT;
import X.DbU;
import X.JTP;
import X.MME;
import X.MMI;
import X.MMZ;
import X.UYL;
import X.VVA;
import X.X6E;
import android.os.Bundle;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.model.reels.Reel;
import com.instagram.ui.emptystaterow.EmptyStateView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ArchiveReelRecycleBinFragment extends AnonymousClass32G implements AnonymousClass4DR, C311566ct, C227252iu, AbsListView.OnScrollListener, C21048XBp, AnonymousClass4DT, C230222pE, X6E {
    public C15469UdK A00;
    public C227762js A01;
    public EmptyStateView A02;
    public C361778gm A03;
    public String A04;
    public int A05;
    public final C228172ku A06 = new C228172ku();
    public final Set A07 = new LinkedHashSet();
    public final Set A08 = new LinkedHashSet();
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B = C227642jf.A02(this);
    public C252063oV downloadAllButtonStubHolder;
    public C252063oV fastScrollStubHolder;
    public C17933ViO viewPortObserver;

    public final boolean CbJ() {
        return true;
    }

    public final void Cvv(C19517Wb3 wb3, Reel reel, List list, int i, int i2, int i3, boolean z) {
        String str;
        ArrayList A0q = AnonymousClass7TF.A0q(list, 1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Reel A0S = C13991Tnr.A0S(AnonymousClass7TE.A18(it), this.A0B);
            if (A0S != null) {
                A0q.add(A0S);
            }
        }
        AnonymousClass32A r4 = (AnonymousClass32A) this.A0A.getValue();
        String str2 = this.A04;
        if (str2 == null) {
            str = "reelViewerSessionId";
        } else {
            r4.A0C = str2;
            FragmentActivity requireActivity = requireActivity();
            0S7.A00(this);
            ListView listView = this.A04;
            C15469UdK udK = this.A00;
            if (udK == null) {
                str = "adapter";
            } else {
                r4.A05 = new C16162Upn(listView, requireActivity, udK, this);
                r4.A0D = DbU.A0u(this.A0B);
                r4.A06(reel, AnonymousClass3BQ.ARCHIVE_RECYCLE_BIN, wb3, A0q, A0q, i3);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DFj(Reel reel, AnonymousClass6UY r2) {
    }

    public final void DMh(String str) {
    }

    public final void DMi(String str) {
    }

    public final void DPq(String str, String str2) {
    }

    public final void DQ3(String str, String str2) {
    }

    public final void DQo(String str, String str2) {
    }

    public final void DQr(String str, String str2) {
    }

    public final void DVy() {
    }

    public final void DW7() {
    }

    public final String getModuleName() {
        return AnonymousClass000.A00(1097);
    }

    public final boolean onBackPressed() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x022c, code lost:
        if (r0 > 0) goto L_0x022e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r21, android.os.Bundle r22) {
        /*
            r20 = this;
            r5 = 0
            r6 = r21
            X.0qQ.A0B(r6, r5)
            r3 = r20
            r0 = r22
            super.onViewCreated(r6, r0)
            com.instagram.ui.emptystaterow.EmptyStateView r0 = X.C13991Tnr.A0V(r3)
            r3.A02 = r0
            r0 = 2131432651(0x7f0b14cb, float:1.8487065E38)
            android.view.View r0 = r6.requireViewById(r0)
            r4 = 0
            X.3oV r0 = X.2b1.A01(r0, r5, r5)
            r3.fastScrollStubHolder = r0
            X.2js r7 = r3.A01
            java.lang.String r17 = "scrollableNavigationHelper"
            if (r7 == 0) goto L_0x023f
            X.3Ar r2 = r3.getScrollingViewProxy()
            X.UdK r1 = r3.A00
            java.lang.String r11 = "adapter"
            if (r1 == 0) goto L_0x00bd
            int r0 = r3.A05
            r7.A06(r1, r2, r0)
            X.0S7.A00(r3)
            android.widget.ListView r1 = r3.A04
            r0 = 31
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            com.instagram.ui.widget.refresh.RefreshableListView r1 = (com.instagram.ui.widget.refresh.RefreshableListView) r1
            r1.APL()
            r1.A07 = r5
            r1.setOnScrollListener(r3)
            X.0eM r0 = r3.A09
            r19 = r0
            java.lang.Object r0 = r19.getValue()
            X.Jih r0 = (X.C60285Jih) r0
            X.0Ud r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            X.JwH r0 = (X.C61079JwH) r0
            java.lang.Object r2 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r2 != r0) goto L_0x0071
            X.UdK r0 = r3.A00
            if (r0 == 0) goto L_0x00bd
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0071
            r4 = 1
        L_0x0071:
            X.C46445Df7.A01(r3, r4)
            A03(r3)
            X.0S7.A00(r3)
            android.widget.ListView r4 = r3.A04
            X.0qQ.A07(r4)
            r4.setVerticalScrollBarEnabled(r5)
            android.content.Context r0 = r3.requireContext()
            int r10 = X.C16856V8l.A00(r0)
            X.UdK r8 = r3.A00
            r7 = 0
            if (r8 == 0) goto L_0x00bd
            int r0 = r8.getCount()
            r9 = 0
            if (r0 <= 0) goto L_0x00b1
            int r2 = r0 + -1
            X.0S7.A00(r3)
            android.widget.ListView r0 = r3.A04
            android.view.View r7 = r8.getView(r2, r7, r0)
            X.0qQ.A07(r7)
            int r2 = X.JTT.A06(r3)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            X.C13989Tnp.A19(r7, r2, r0)
            int r9 = r7.getMeasuredHeight()
        L_0x00b1:
            X.8gm r0 = r3.A03
            if (r0 != 0) goto L_0x00ca
            X.2ku r0 = r3.A06
            X.2js r2 = r3.A01
            if (r2 != 0) goto L_0x00c5
            r11 = r17
        L_0x00bd:
            X.0qQ.A0F(r11)
        L_0x00c0:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00c5:
            java.util.ArrayList r0 = r0.A00
            r0.remove(r2)
        L_0x00ca:
            X.0eM r0 = r3.A0B
            r18 = r0
            com.instagram.common.session.UserSession r12 = X.AnonymousClass7TE.A0l(r18)
            X.Us9 r8 = new X.Us9
            r8.<init>(r4)
            X.UdK r7 = r3.A00
            if (r7 == 0) goto L_0x00bd
            X.3oV r0 = r3.fastScrollStubHolder
            if (r0 == 0) goto L_0x023b
            android.view.View r4 = r0.getView()
            r0 = 4
            X.0qQ.A0B(r4, r0)
            X.AgZ r2 = new X.AgZ
            r2.<init>(r8, r7, r10, r9)
            X.8gm r0 = new X.8gm
            r10 = r0
            r11 = r4
            r13 = r7
            r14 = r2
            r15 = r8
            r16 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r3.A03 = r0
            r13 = 0
            r0.A00 = r13
            X.2ku r7 = r3.A06
            r7.A01(r0)
            r0 = 2131428134(0x7f0b0326, float:1.8477904E38)
            android.view.View r9 = X.DbY.A0F(r6, r0)
            X.C66580MXl.A1R(r9)
            X.0qQ.A0B(r9, r5)
            r4 = 1
            android.content.Context r12 = r9.getContext()
            r11 = 1162141696(0x4544e000, float:3150.0)
            r0 = 1161822208(0x45400000, float:3072.0)
            float r11 = r11 / r0
            r0 = 2131438585(0x7f0b2bf9, float:1.8499101E38)
            android.view.View r8 = X.AnonymousClass7TF.A0G(r9, r0)
            X.0qQ.A0A(r12)
            int r0 = X.AnonymousClass0nB.A01(r12)
            float r2 = (float) r0
            r10 = 1065353216(0x3f800000, float:1.0)
            float r0 = X.0mi.A00(r11, r13, r10)
            float r2 = r2 * r0
            int r0 = (int) r2
            X.0nA.A0f(r8, r0)
            r2 = 1061158912(0x3f400000, float:0.75)
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0223
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0223
            r2 = 2131100230(0x7f060246, float:1.7812836E38)
        L_0x0141:
            int r0 = r12.getColor(r2)
            X.Pxf.A1B(r8, r0)
            r0 = 2131439184(0x7f0b2e50, float:1.8500316E38)
            android.widget.TextView r8 = X.DbU.A0G(r9, r0)
            r2 = 2131974264(0x7f135878, float:1.9585587E38)
            r0 = 1120403456(0x42c80000, float:100.0)
            int r0 = X.AnonymousClass7TE.A06(r0, r11)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.DbX.A13(r12, r8, r0, r2)
            r0 = 2131439183(0x7f0b2e4f, float:1.8500314E38)
            android.widget.TextView r14 = X.DbU.A0G(r9, r0)
            r13 = 2131974263(0x7f135877, float:1.9585585E38)
            r0 = 1162141696(0x4544e000, float:3150.0)
            r16 = 1149239296(0x44800000, float:1024.0)
            float r0 = r0 / r16
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r15 = "%.2f"
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r8 = java.lang.String.format(r0, r15, r2)
            r0 = 1161822208(0x45400000, float:3072.0)
            float r0 = r0 / r16
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = java.lang.String.format(r0, r15, r2)
            X.JTR.A18(r12, r14, r8, r0, r13)
            r0 = 2131431417(0x7f0b0ff9, float:1.8484563E38)
            android.widget.TextView r8 = X.AnonymousClass7TG.A0R(r9, r0)
            int r0 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x021d
            r2 = 8
            r8.setVisibility(r2)
            r0 = 2131431418(0x7f0b0ffa, float:1.8484565E38)
            X.DbT.A1F(r9, r0, r2)
        L_0x01af:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r18)
            X.3BV r0 = X.1OP.A03(r0)
            r0.A09(r3)
            X.2js r0 = r3.A01
            if (r0 == 0) goto L_0x023f
            r7.A01(r0)
            X.8gm r0 = r3.A03
            if (r0 == 0) goto L_0x01c8
            r7.A03(r0)
        L_0x01c8:
            X.VM5 r2 = new X.VM5
            r2.<init>(r1)
            X.Wip r0 = new X.Wip
            r0.<init>(r3)
            X.WNV r1 = new X.WNV
            r1.<init>(r0)
            X.ViO r0 = new X.ViO
            r0.<init>(r2, r1)
            r3.viewPortObserver = r0
            r0 = 2131428129(0x7f0b0321, float:1.8477894E38)
            android.view.View r0 = r6.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r5, r5)
            r3.downloadAllButtonStubHolder = r0
            if (r0 == 0) goto L_0x0237
            android.view.View r1 = r0.getView()
            r0 = 28
            X.C18887WAz.A00(r1, r0, r3)
            X.ViO r0 = r3.viewPortObserver
            if (r0 == 0) goto L_0x0233
            X.WNU r1 = new X.WNU
            r1.<init>(r3)
            java.util.List r0 = r0.A08
            r0.add(r1)
            java.lang.Object r0 = r19.getValue()
            X.Jih r0 = (X.C60285Jih) r0
            X.0Ud r0 = r0.A04
            androidx.lifecycle.CoroutineLiveData r2 = X.DbT.A0G(r0)
            X.07Z r1 = r3.getViewLifecycleOwner()
            X.WEB r0 = new X.WEB
            r0.<init>(r3, r4)
            r2.A06(r1, r0)
            return
        L_0x021d:
            r0 = 26
            X.C13988Tno.A15(r8, r0)
            goto L_0x01af
        L_0x0223:
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x022e
            int r0 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            r2 = 2131100628(0x7f0603d4, float:1.7813643E38)
            if (r0 <= 0) goto L_0x0141
        L_0x022e:
            r2 = 2131100714(0x7f06042a, float:1.7813817E38)
            goto L_0x0141
        L_0x0233:
            java.lang.String r11 = "viewPortObserver"
            goto L_0x00bd
        L_0x0237:
            java.lang.String r11 = "downloadAllButtonStubHolder"
            goto L_0x00bd
        L_0x023b:
            java.lang.String r11 = "fastScrollStubHolder"
            goto L_0x00bd
        L_0x023f:
            X.0qQ.A0F(r17)
            goto L_0x00c0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.archive.fragment.ArchiveReelRecycleBinFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A02(ArchiveReelRecycleBinFragment archiveReelRecycleBinFragment) {
        int i;
        long j;
        Integer num;
        C60285Jih jih = (C60285Jih) archiveReelRecycleBinFragment.A09.getValue();
        List<C55977Hqi> A002 = C60285Jih.A00(jih.A01, (Map) ((C59721JVf) jih.A00.A06.getValue()).A00);
        ArrayList arrayList = new ArrayList();
        for (C55977Hqi hqi : A002) {
            C255773uh r7 = hqi.A03;
            Reel reel = hqi.A02;
            if (!(hqi instanceof UYL)) {
                if (hqi instanceof C61323K2k) {
                    i = hqi.A00;
                    j = hqi.A01;
                    num = AnonymousClass05K.A01;
                } else if (hqi instanceof C61324K2l) {
                    i = hqi.A00;
                    j = hqi.A01;
                    num = AnonymousClass05K.A0C;
                }
                r7 = null;
            } else if (r7 != null) {
                i = hqi.A00;
                j = hqi.A01;
                num = AnonymousClass05K.A0N;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
            arrayList.add(new C17662Vbs(reel, r7, num, i, j));
        }
        C15469UdK udK = archiveReelRecycleBinFragment.A00;
        if (udK == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        }
        udK.A0D(arrayList);
        A03(archiveReelRecycleBinFragment);
    }

    public static final void A03(ArchiveReelRecycleBinFragment archiveReelRecycleBinFragment) {
        if (archiveReelRecycleBinFragment.A02 != null) {
            AnonymousClass0eM r2 = archiveReelRecycleBinFragment.A09;
            if (((C61079JwH) ((C60285Jih) r2.getValue()).A04.getValue()).A01 == AnonymousClass05K.A01) {
                EmptyStateView emptyStateView = archiveReelRecycleBinFragment.A02;
                if (emptyStateView != null) {
                    emptyStateView.A0L();
                }
            } else if (((C61079JwH) ((C60285Jih) r2.getValue()).A04.getValue()).A01 == AnonymousClass05K.A0N) {
                EmptyStateView emptyStateView2 = archiveReelRecycleBinFragment.A02;
                if (emptyStateView2 != null) {
                    emptyStateView2.A0J();
                }
            } else {
                C15469UdK udK = archiveReelRecycleBinFragment.A00;
                if (udK == null) {
                    DbS.A13();
                    throw AnonymousClass00P.createAndThrow();
                }
                boolean isEmpty = udK.isEmpty();
                EmptyStateView emptyStateView3 = archiveReelRecycleBinFragment.A02;
                if (isEmpty) {
                    if (emptyStateView3 != null) {
                        emptyStateView3.A0I();
                    }
                } else if (emptyStateView3 != null) {
                    emptyStateView3.A0K();
                }
            }
            EmptyStateView emptyStateView4 = archiveReelRecycleBinFragment.A02;
            if (emptyStateView4 != null) {
                emptyStateView4.A0H();
            }
        }
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return DbT.A0X(this.A0B);
    }

    public final C227762js BD0() {
        C227762js r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("scrollableNavigationHelper");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        r0 = r2.A0B;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DMj(java.lang.String r3, boolean r4) {
        /*
            r2 = this;
            X.0eM r0 = r2.A09
            java.lang.Object r0 = r0.getValue()
            X.Jih r0 = (X.C60285Jih) r0
            com.instagram.archive.data.ArchiveStoryRecycleBinRepository r0 = r0.A00
            X.05G r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            X.JVf r0 = (X.C59721JVf) r0
            java.lang.Object r0 = r0.A00
            java.util.Map r0 = (java.util.Map) r0
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L_0x0033
            if (r4 != 0) goto L_0x0033
            X.0eM r0 = r2.A0B
            com.instagram.model.reels.Reel r1 = X.C13991Tnr.A0S(r3, r0)
            if (r1 == 0) goto L_0x0033
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            boolean r0 = r1.A15(r0)
            if (r0 != 0) goto L_0x0033
            A02(r2)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.archive.fragment.ArchiveReelRecycleBinFragment.DMj(java.lang.String, boolean):void");
    }

    public ArchiveReelRecycleBinFragment() {
        MMI mmi = new MMI(this, 49);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MME(new MME(this, 1), 2));
        this.A09 = new C227862kA(new MME(A002, 3), mmi, new MMZ(41, (Object) null, (Object) A002), new 0Yh(C60285Jih.class));
        this.A0A = AnonymousClass1YB.A00(new MME(this, 0));
    }

    public static final void A01(ArchiveReelRecycleBinFragment archiveReelRecycleBinFragment) {
        0S7.A00(archiveReelRecycleBinFragment);
        ListView listView = archiveReelRecycleBinFragment.A04;
        0qQ.A07(listView);
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int lastVisiblePosition = listView.getLastVisiblePosition();
        ArrayList arrayList = new ArrayList();
        2HY r0 = new 2HY(firstVisiblePosition + 1, lastVisiblePosition);
        int i = r0.A00;
        int i2 = r0.A01;
        boolean z = false;
        if (i <= i2) {
            while (true) {
                C15469UdK udK = archiveReelRecycleBinFragment.A00;
                if (udK == null) {
                    DbS.A13();
                    throw AnonymousClass00P.createAndThrow();
                }
                Object item = udK.getItem(i);
                0qQ.A07(item);
                if (item instanceof VVA) {
                    C3251571g r4 = ((VVA) item).A00;
                    int A012 = r4.A01();
                    for (int i3 = 0; i3 < A012; i3++) {
                        Reel reel = ((C17662Vbs) r4.A02(i3)).A03;
                        if (reel != null) {
                            z = C51971G9r.A1Z(reel.getId(), "placeholder", z);
                            if (!reel.A0z(AnonymousClass7TE.A0l(archiveReelRecycleBinFragment.A0B))) {
                                Set set = archiveReelRecycleBinFragment.A07;
                                if (!set.contains(reel.getId())) {
                                    String A0r = JTP.A0r(reel);
                                    arrayList.add(A0r);
                                    set.add(A0r);
                                }
                            }
                        }
                    }
                }
                if (i != i2) {
                    i++;
                } else if (z) {
                    ((C60285Jih) archiveReelRecycleBinFragment.A09.getValue()).A01(false);
                }
            }
        }
        C19482WaU waU = new C19482WaU(1, arrayList, archiveReelRecycleBinFragment);
        archiveReelRecycleBinFragment.A08.add(waU);
        if (DbT.A1b(arrayList)) {
            1OP.A03(AnonymousClass7TE.A0l(archiveReelRecycleBinFragment.A0B)).A07(AnonymousClass3BU.ON_TAP, waU, AnonymousClass000.A00(1097), (String) null, arrayList);
        }
    }

    public final void Cvx(C17662Vbs vbs) {
        C59689JTv.A0F(requireContext(), "archive_media_unavailable", 2131953144);
    }

    public final void EKl() {
        0S7.A00(this);
        ListView listView = this.A04;
        0qQ.A07(listView);
        C17118VIo.A00(listView, this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-277291414);
        ArchiveReelRecycleBinFragment.super.onCreate(bundle);
        C15469UdK udK = new C15469UdK(requireActivity(), requireContext(), this, this, (ArchiveReelFragment) null, (ArchiveReelFragment) null, this, AnonymousClass7TE.A0l(this.A0B), (2bv) null, false, false, true, true, true);
        this.A00 = udK;
        A0V(udK);
        this.A04 = AnonymousClass7TG.A0j();
        this.A05 = C66582MXn.A01(requireContext());
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        this.A01 = C227752jr.A00(requireContext(), (Float) null, false);
        ((C60285Jih) this.A09.getValue()).A01(true);
        AnonymousClass0fD.A09(-1859073182, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1882990144);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_feed_with_storage_quota, false);
        AnonymousClass0fD.A09(722715783, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1071206279);
        super.onDestroyView();
        1OP.A03(AnonymousClass7TE.A0l(this.A0B)).A0A(this);
        C228172ku r1 = this.A06;
        C227762js r0 = this.A01;
        if (r0 == null) {
            0qQ.A0F("scrollableNavigationHelper");
            throw AnonymousClass00P.createAndThrow();
        }
        ArrayList arrayList = r1.A00;
        arrayList.remove(r0);
        C361778gm r02 = this.A03;
        if (r02 != null) {
            arrayList.remove(r02);
        }
        this.A02 = null;
        ArchiveReelRecycleBinFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0fD.A09(-1754076009, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1261385908);
        ArchiveReelRecycleBinFragment.super.onPause();
        C17933ViO viO = this.viewPortObserver;
        if (viO != null) {
            if (viO.A04) {
                viO.A04 = false;
                viO.A01.clear();
                viO.A03.clear();
                Choreographer.getInstance().removeFrameCallback(viO.A06);
            }
            AnonymousClass0fD.A09(161192862, A022);
            return;
        }
        0qQ.A0F("viewPortObserver");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1040752687);
        super.onResume();
        EmptyStateView emptyStateView = this.A02;
        if (emptyStateView != null) {
            emptyStateView.A0R(C320156rr.ERROR, R.drawable.loadmore_icon_refresh_compound);
        }
        EmptyStateView emptyStateView2 = this.A02;
        if (emptyStateView2 != null) {
            emptyStateView2.A0N(new C18887WAz(this, 27), C320156rr.ERROR);
        }
        EmptyStateView emptyStateView3 = this.A02;
        if (emptyStateView3 != null) {
            emptyStateView3.A0T(C320156rr.EMPTY, 2131974261);
        }
        EmptyStateView emptyStateView4 = this.A02;
        if (emptyStateView4 != null) {
            emptyStateView4.A0S(C320156rr.EMPTY, 2131974261);
        }
        EmptyStateView emptyStateView5 = this.A02;
        if (emptyStateView5 != null) {
            emptyStateView5.A0Q(C320156rr.EMPTY, 2131974261);
        }
        EmptyStateView emptyStateView6 = this.A02;
        if (emptyStateView6 != null) {
            emptyStateView6.A0R(C320156rr.EMPTY, R.drawable.empty_state_private);
        }
        A02(this);
        C17933ViO viO = this.viewPortObserver;
        if (viO != null) {
            viO.A00();
            A01(this);
            AnonymousClass0fD.A09(-818861739, A022);
            return;
        }
        0qQ.A0F("viewPortObserver");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A0D = AnonymousClass7TG.A0D(absListView, 1223695442);
        this.A06.onScroll(absListView, i, i2, i3);
        AnonymousClass0fD.A0A(620697833, A0D);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A0D = AnonymousClass7TG.A0D(absListView, -1742311383);
        this.A06.onScrollStateChanged(absListView, i);
        AnonymousClass0fD.A0A(-357891439, A0D);
    }

    public final void DcC(Reel reel) {
        A02(this);
    }

    public final void Dcl(Reel reel) {
        A02(this);
    }
}
