package com.instagram.direct.inbox.fragment;

import X.0Tu;
import X.0wb;
import X.0wc;
import X.1wn;
import X.28D;
import X.2da;
import X.2el;
import X.AnonymousClass000;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass0kN;
import X.AnonymousClass0wW;
import X.AnonymousClass1Nd;
import X.AnonymousClass2t9;
import X.AnonymousClass2tC;
import X.AnonymousClass30Y;
import X.AnonymousClass3AS;
import X.AnonymousClass3DZ;
import X.AnonymousClass4DH;
import X.AnonymousClass4DS;
import X.AnonymousClass7BY;
import X.AnonymousClass9VB;
import X.C251033mS;
import X.C254783t2;
import X.C294875nB;
import X.C48843El5;
import X.C67058MhZ;
import X.C68963Nbq;
import X.C71892Osa;
import X.C71932OtG;
import X.C71982OuE;
import X.C72208OyY;
import X.C73467Pd9;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbX;
import X.DbY;
import X.EGN;
import X.EGY;
import X.EKF;
import X.FZN;
import X.OJj;
import X.PE1;
import X.PE3;
import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.List;

public class DirectSearchInboxEditHistoryFragment extends AnonymousClass4DH implements C294875nB, AnonymousClass4DS {
    public Activity A00;
    public UserSession A01;
    public C72208OyY A02;
    public AnonymousClass7BY A03;
    public DirectShareTarget A04;
    public String A05;
    public 0wc A06;
    public AnonymousClass2t9 A07;
    public 2el A08;
    public C68963Nbq A09;
    public FZN A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public final OJj A0F = new Object();
    public final 1wn A0G = C71932OtG.A00(this, 27);
    public RecyclerView mRecyclerView;

    public final /* synthetic */ void Cj6(DirectSearchResult directSearchResult, int i, int i2, int i3, int i4, int i5) {
    }

    public final /* synthetic */ void Cj7(View view, DirectSearchResult directSearchResult, int i, int i2, int i3, int i4) {
    }

    public final /* synthetic */ void D9P(DirectShareTarget directShareTarget) {
    }

    public final void Dk7(RectF rectF, View view, C67058MhZ mhZ, DirectShareTarget directShareTarget, String str, List list, boolean z, boolean z2) {
    }

    public final void DpB(View view, C67058MhZ mhZ, DirectSearchResult directSearchResult, String str, int i, int i2, int i3, int i4, boolean z) {
        DirectSearchResult directSearchResult2 = directSearchResult;
        C68963Nbq nbq = this.A09;
        if (nbq != null && (directSearchResult instanceof DirectShareTarget)) {
            PE1 A002 = A00((DirectShareTarget) directSearchResult2, i, i2, i3, i4);
            FZN fzn = this.A0A;
            if (fzn == null) {
                fzn = new FZN(new PE3(0, nbq, this));
                this.A0A = fzn;
            }
            this.A08.A05(view, DbU.A0a(fzn, AnonymousClass30Y.A00(A002, (Object) null, A002.A0A)));
        }
    }

    public final void DpC(RectF rectF, 28D r2, DirectShareTarget directShareTarget) {
    }

    public final void configureActionBar(2da r3) {
        r3.Etr(true);
        r3.setTitle(getString(2131964278));
        r3.Eu4(true);
    }

    public final String getModuleName() {
        return "DirectSearchInboxEditHistoryFragment";
    }

    private PE1 A00(DirectShareTarget directShareTarget, int i, int i2, int i3, int i4) {
        String str;
        DirectShareTarget directShareTarget2 = directShareTarget;
        String A092 = directShareTarget2.A09();
        C254783t2 A0c = DbS.A0c(directShareTarget2);
        List A14 = DbT.A14(directShareTarget2);
        boolean A0E2 = directShareTarget2.A0E();
        Integer A042 = directShareTarget2.A04(this.A01.A06, false);
        String str2 = this.A0C;
        C68963Nbq nbq = this.A09;
        if (nbq != null) {
            str = nbq.A01;
        } else {
            str = null;
        }
        return new PE1((AnonymousClass9VB) null, directShareTarget2.A08, A0c, A042, A092, str2, str, this.A0B, (String) null, A14, i2, i3, i4, i, A0E2, false);
    }

    public final void D8N(DirectShareTarget directShareTarget) {
        this.A03.A03(directShareTarget);
        A01(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.instagram.model.direct.DirectSearchResult} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.instagram.model.direct.DirectShareTarget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.instagram.model.direct.DirectShareTarget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.instagram.model.direct.DirectShareTarget} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dk6(X.C67058MhZ r24, com.instagram.model.direct.DirectSearchResult r25, java.lang.String r26, int r27, int r28, int r29, int r30, int r31) {
        /*
            r23 = this;
            r4 = r25
            boolean r0 = r4 instanceof com.instagram.model.direct.DirectShareTarget
            r11 = r23
            if (r0 == 0) goto L_0x00a7
            com.instagram.model.direct.DirectShareTarget r4 = (com.instagram.model.direct.DirectShareTarget) r4
            r10 = r27
            r9 = r28
            r22 = r30
            r8 = r31
            r18 = r4
            r17 = r11
            r19 = r8
            r20 = r10
            r21 = r9
            X.PE1 r13 = r17.A00(r18, r19, r20, r21, r22)
            r4.A01()
            java.lang.String r0 = r4.A07()
            r11.A05 = r0
            if (r0 != 0) goto L_0x0030
            X.7BY r0 = r11.A03
            r0.A02(r4)
        L_0x0030:
            X.OyY r12 = r11.A02
            if (r12 == 0) goto L_0x006d
            java.lang.String r7 = r11.A0C
            long r2 = (long) r10
            long r5 = (long) r9
            r0 = r29
            long r0 = (long) r0
            r14 = r12
            r15 = r4
            r16 = r7
            r17 = r8
            r18 = r2
            r20 = r5
            r14.A0A(r15, r16, r17, r18, r20)
            r7 = 18
            if (r8 != r7) goto L_0x004e
            r2 = -1
        L_0x004e:
            r14 = r4
            r15 = r8
            r16 = r2
            r18 = r5
            r20 = r0
            r12.A08(r13, r14, r15, r16, r18, r20)
            X.Nbq r1 = r11.A09
            if (r1 == 0) goto L_0x006d
            r3 = r11
            r5 = r8
            r6 = r10
            r7 = r9
            r8 = r22
            X.PE1 r0 = r3.A00(r4, r5, r6, r7, r8)
            r1.A02(r0)
            r1.A01()
        L_0x006d:
            androidx.fragment.app.FragmentActivity r10 = r11.requireActivity()
            r11.A00 = r10
            java.lang.String r3 = r11.A05
            if (r3 == 0) goto L_0x008d
            r11.A04 = r4
            X.OJj r5 = r11.A0F
            com.instagram.common.session.UserSession r2 = r11.A01
            X.7BY r1 = r11.A03
            X.OyY r0 = r11.A02
            r13 = 1
            r6 = r10
            r7 = r11
            r11 = r4
            r12 = r3
            r8 = r2
            r9 = r0
            r10 = r1
            r5.A00(r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x008c:
            return
        L_0x008d:
            com.instagram.common.session.UserSession r14 = r11.A01
            X.0wc r13 = r11.A06
            java.lang.String r1 = r11.A0D
            r16 = 0
            r0 = 3
            X.P4D r15 = new X.P4D
            r15.<init>(r11, r0)
            r19 = r26
            r12 = r11
            r20 = r16
            r17 = r4
            r18 = r1
            X.OPY.A01(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x00a7:
            X.OyY r0 = r11.A02
            if (r0 == 0) goto L_0x008c
            r0.A09(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.fragment.DirectSearchInboxEditHistoryFragment.Dk6(X.MhZ, com.instagram.model.direct.DirectSearchResult, java.lang.String, int, int, int, int, int):void");
    }

    public final void Dnr(C67058MhZ mhZ, DirectSearchResult directSearchResult, Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView, int i, int i2, int i3, int i4, int i5) {
        0wb.A01.Ew0("DirectSearchInboxEditHistoryFragment", "Story ring should not be accessible here.");
    }

    public final void DpD(View view) {
        if (view != null) {
            this.A08.A04(view);
        }
    }

    public final AnonymousClass0wW getSession() {
        return this.A01;
    }

    public static void A01(DirectSearchInboxEditHistoryFragment directSearchInboxEditHistoryFragment) {
        ViewModelListUpdate A0R = DbS.A0R();
        ImmutableList A012 = directSearchInboxEditHistoryFragment.A03.A01();
        if (!A012.isEmpty()) {
            A0R.A00(new C71982OuE(new EKF(directSearchInboxEditHistoryFragment, 2), AnonymousClass05K.A05, AnonymousClass05K.A01, (Object) null));
            UserSession userSession = directSearchInboxEditHistoryFragment.A01;
            A0R.A01(C48843El5.A00(userSession, C251033mS.A00(userSession), A012, 18, 0, -1, 0, true, false, false));
        } else {
            A0R.A00(new EGY(directSearchInboxEditHistoryFragment.getString(2131968416)));
        }
        directSearchInboxEditHistoryFragment.A07.A05(A0R);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-668620990);
        DirectSearchInboxEditHistoryFragment.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        bundle2.getClass();
        this.A01 = DbX.A0U(this);
        this.A0D = bundle2.getString(AnonymousClass000.A00(221));
        C72208OyY A002 = C72208OyY.A00(this.A01);
        this.A02 = A002;
        this.A09 = (C68963Nbq) C73467Pd9.A00(this.A01, A002);
        this.A03 = AnonymousClass7BY.A00(this.A01);
        this.A0E = DbY.A1Y(0Tu.A05, this.A01, 36314811776961332L);
        this.A06 = AnonymousClass0kN.A01(this, this.A01);
        this.A0C = bundle2.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_QUERY", "");
        this.A0B = bundle2.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MNET_REQUEST_ID");
        AnonymousClass1Nd.A00(this.A01).A01(this.A0G, C71892Osa.class);
        AnonymousClass0fD.A09(1721145842, A022);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v5, types: [X.2tF, java.lang.Object] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1004690580);
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.inbox_search_see_all_fragment);
        this.mRecyclerView = DbX.A0K(A0C2);
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(requireActivity());
        A002.A01(new EGN(this, this.A01, this, "inbox_search", this.A0E));
        A002.A01(new Object());
        this.A07 = DbU.A0U(A002, new Object());
        DbY.A15(this, this.mRecyclerView);
        this.mRecyclerView.setAdapter(this.A07);
        this.mRecyclerView.setItemAnimator((AnonymousClass3AS) null);
        A01(this);
        2el A003 = 2el.A00();
        this.A08 = A003;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            A003.A06(recyclerView, AnonymousClass3DZ.A00(this));
        }
        AnonymousClass0fD.A09(1197107570, A022);
        return A0C2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-59985368);
        super.onDestroy();
        this.A05 = null;
        this.A04 = null;
        AnonymousClass1Nd.A00(this.A01).A02(this.A0G, C71892Osa.class);
        AnonymousClass0fD.A09(-1325528534, A022);
    }
}
