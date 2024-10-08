package com.instagram.direct.inbox.fragment;

import X.0wc;
import X.11Z;
import X.1wn;
import X.28D;
import X.2da;
import X.2el;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass1Nd;
import X.AnonymousClass2t9;
import X.AnonymousClass2tC;
import X.AnonymousClass30Y;
import X.AnonymousClass3BQ;
import X.AnonymousClass3DZ;
import X.AnonymousClass4DH;
import X.AnonymousClass4DS;
import X.AnonymousClass7BY;
import X.AnonymousClass7TE;
import X.AnonymousClass9VB;
import X.C251033mS;
import X.C254783t2;
import X.C273434mZ;
import X.C294875nB;
import X.C337237fw;
import X.C337257fy;
import X.C66583MXo;
import X.C66650MaJ;
import X.C67058MhZ;
import X.C68963Nbq;
import X.C71046OaO;
import X.C71892Osa;
import X.C71932OtG;
import X.C72208OyY;
import X.C72917PPb;
import X.C73420PcH;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbX;
import X.DbY;
import X.EG8;
import X.EGN;
import X.FZN;
import X.G6V;
import X.OJj;
import X.OPY;
import X.PE1;
import X.PE3;
import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class DirectSearchInboxSeeAllFragment extends AnonymousClass4DH implements C294875nB, AnonymousClass4DS, G6V {
    public int A00;
    public int A01;
    public int A02;
    public Activity A03;
    public Context A04;
    public AnonymousClass2t9 A05;
    public UserSession A06;
    public C72208OyY A07;
    public AnonymousClass7BY A08;
    public C251033mS A09;
    public C337237fw A0A;
    public C337257fy A0B;
    public String A0C;
    public String A0D;
    public ArrayList A0E;
    public ArrayList A0F;
    public ArrayList A0G;
    public ArrayList A0H;
    public ArrayList A0I;
    public ArrayList A0J;
    public ArrayList A0K;
    public Set A0L = AnonymousClass7TE.A1F();
    public Set A0M = AnonymousClass7TE.A1F();
    public Set A0N = AnonymousClass7TE.A1F();
    public Set A0O = AnonymousClass7TE.A1F();
    public Set A0P = AnonymousClass7TE.A1F();
    public Set A0Q = AnonymousClass7TE.A1F();
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public int A0V;
    public int A0W;
    public int A0X = 0;
    public RectF A0Y;
    public 0wc A0Z;
    public 2el A0a;
    public C68963Nbq A0b;
    public C66650MaJ A0c;
    public FZN A0d;
    public DirectThreadKey A0e;
    public Integer A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public boolean A0k;
    public boolean A0l = false;
    public boolean A0m;
    public final OJj A0n = new Object();
    public final 1wn A0o = C71932OtG.A00(this, 29);
    public RecyclerView mRecyclerView;

    public final /* synthetic */ void Cj6(DirectSearchResult directSearchResult, int i, int i2, int i3, int i4, int i5) {
    }

    public final /* synthetic */ void Cj7(View view, DirectSearchResult directSearchResult, int i, int i2, int i3, int i4) {
    }

    public final void D8N(DirectShareTarget directShareTarget) {
    }

    public final /* synthetic */ void D9P(DirectShareTarget directShareTarget) {
    }

    public final void Dk7(RectF rectF, View view, C67058MhZ mhZ, DirectShareTarget directShareTarget, String str, List list, boolean z, boolean z2) {
    }

    public final void DpB(View view, C67058MhZ mhZ, DirectSearchResult directSearchResult, String str, int i, int i2, int i3, int i4, boolean z) {
        DirectSearchResult directSearchResult2 = directSearchResult;
        C68963Nbq nbq = this.A0b;
        if (nbq != null && (directSearchResult instanceof DirectShareTarget)) {
            PE1 A002 = A00((DirectShareTarget) directSearchResult2, i, i2, i3, i4, z);
            FZN fzn = this.A0d;
            if (fzn == null) {
                fzn = new FZN(new PE3(1, nbq, this));
                this.A0d = fzn;
            }
            this.A0a.A05(view, DbU.A0a(fzn, AnonymousClass30Y.A00(A002, (Object) null, A002.A0A)));
        }
    }

    public final void configureActionBar(2da r3) {
        r3.Etr(true);
        r3.setTitle(this.A0i);
        r3.Eu4(true);
    }

    public final String getModuleName() {
        return "DIRECT_SEARCH_INBOX_SELL_ALL_FRAGMENT";
    }

    private PE1 A00(DirectShareTarget directShareTarget, int i, int i2, int i3, int i4, boolean z) {
        DirectShareTarget directShareTarget2 = directShareTarget;
        String A092 = directShareTarget2.A09();
        C254783t2 A0c2 = DbS.A0c(directShareTarget2);
        List A14 = DbT.A14(directShareTarget2);
        boolean A0E2 = directShareTarget2.A0E();
        return new PE1((AnonymousClass9VB) null, directShareTarget2.A08, A0c2, directShareTarget2.A04(this.A06.A06, this.A0S), A092, this.A0D, this.A0b.A01, this.A0g, (String) null, A14, i2, i3, i4, i, A0E2, z);
    }

    public final void Dhj() {
        C337257fy r0 = this.A0B;
        if (r0 != null) {
            r0.EJE();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.instagram.model.direct.DirectSearchResult} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.instagram.model.direct.DirectShareTarget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.instagram.model.direct.DirectShareTarget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.instagram.model.direct.DirectShareTarget} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dk6(X.C67058MhZ r29, com.instagram.model.direct.DirectSearchResult r30, java.lang.String r31, int r32, int r33, int r34, int r35, int r36) {
        /*
            r28 = this;
            r4 = r30
            boolean r0 = r4 instanceof com.instagram.model.direct.DirectShareTarget
            r11 = r28
            if (r0 == 0) goto L_0x00a4
            com.instagram.model.direct.DirectShareTarget r4 = (com.instagram.model.direct.DirectShareTarget) r4
            java.lang.Boolean r0 = r4.A0B
            if (r0 != 0) goto L_0x0089
            r17 = 0
            r10 = r32
            r9 = r33
            r16 = r35
            r13 = r36
            r12 = r4
            r14 = r10
            r15 = r9
            X.PE1 r19 = r11.A00(r12, r13, r14, r15, r16, r17)
            r4.A01()
            java.lang.String r1 = r4.A07()
            r11.A0C = r1
            X.7BY r0 = r11.A08
            if (r0 == 0) goto L_0x0031
            if (r1 != 0) goto L_0x0031
            r0.A02(r4)
        L_0x0031:
            X.OyY r8 = r11.A07
            if (r8 == 0) goto L_0x0068
            java.lang.String r7 = r11.A0D
            long r5 = (long) r10
            long r2 = (long) r9
            r0 = r34
            long r0 = (long) r0
            r20 = r8
            r21 = r4
            r22 = r7
            r23 = r13
            r24 = r5
            r26 = r2
            r20.A0A(r21, r22, r23, r24, r26)
            r18 = r8
            r20 = r4
            r21 = r13
            r22 = r5
            r24 = r2
            r26 = r0
            r18.A08(r19, r20, r21, r22, r24, r26)
            X.Nbq r1 = r11.A0b
            if (r1 == 0) goto L_0x0068
            X.PE1 r0 = r11.A00(r12, r13, r14, r15, r16, r17)
            r1.A02(r0)
            r1.A01()
        L_0x0068:
            androidx.fragment.app.FragmentActivity r10 = r11.requireActivity()
            r11.A03 = r10
            java.lang.String r5 = r11.A0C
            if (r5 == 0) goto L_0x008a
            X.OJj r6 = r11.A0n
            com.instagram.common.session.UserSession r3 = r11.A06
            X.7BY r2 = r11.A08
            X.OyY r1 = r11.A07
            java.lang.String r0 = r11.A0D
            boolean r14 = r0.isEmpty()
            r7 = r10
            r8 = r11
            r13 = r5
            r9 = r3
            r10 = r1
            r11 = r2
            r6.A00(r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0089:
            return
        L_0x008a:
            com.instagram.common.session.UserSession r14 = r11.A06
            X.0wc r13 = r11.A0Z
            java.lang.String r1 = r11.A0j
            r16 = 0
            r0 = 6
            X.P4D r15 = new X.P4D
            r15.<init>(r11, r0)
            r19 = r31
            r12 = r11
            r20 = r16
            r17 = r4
            r18 = r1
            X.OPY.A01(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x00a4:
            X.OyY r0 = r11.A07
            r0.A09(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.fragment.DirectSearchInboxSeeAllFragment.Dk6(X.MhZ, com.instagram.model.direct.DirectSearchResult, java.lang.String, int, int, int, int, int):void");
    }

    public final void Dnr(C67058MhZ mhZ, DirectSearchResult directSearchResult, Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView, int i, int i2, int i3, int i4, int i5) {
        this.A0c.A02(reel, AnonymousClass3BQ.DIRECT_INBOX_SEARCH, gradientSpinnerAvatarView);
        C72208OyY oyY = this.A07;
        int i6 = i;
        if (oyY != null) {
            DirectSearchResult directSearchResult2 = directSearchResult;
            int i7 = i2;
            int i8 = i5;
            oyY.A08(A00((DirectShareTarget) directSearchResult2, i8, i6, i7, i4, true), directSearchResult2, i8, (long) i6, (long) i7, (long) i3);
            oyY.A09(directSearchResult2);
        }
        this.A0f = Integer.valueOf(i + 1);
    }

    public final void DpD(View view) {
        if (view != null) {
            this.A0a.A04(view);
        }
    }

    public final AnonymousClass0wW getSession() {
        return this.A06;
    }

    public final void DpC(RectF rectF, 28D r14, DirectShareTarget directShareTarget) {
        Context requireContext = requireContext();
        boolean isResumed = isResumed();
        UserSession userSession = this.A06;
        FragmentActivity requireActivity = requireActivity();
        DirectCameraViewModel A032 = C71046OaO.A03(this.A06, directShareTarget);
        RectF rectF2 = rectF;
        OPY.A00(requireActivity, requireContext, rectF2, this.A0Y, r14, userSession, (C273434mZ) null, this.A0e, A032, this.A0j, isResumed);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1);
            activity.finish();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r0 = -1766147028(0xffffffff96babc2c, float:-3.0168674E-25)
            int r1 = X.AnonymousClass0fD.A02(r0)
            r2 = r18
            r0 = r19
            com.instagram.direct.inbox.fragment.DirectSearchInboxSeeAllFragment.super.onCreate(r0)
            android.os.Bundle r5 = r2.mArguments
            r5.getClass()
            com.instagram.common.session.UserSession r0 = X.DbX.A0U(r2)
            r2.A06 = r0
            android.content.Context r3 = r2.requireContext()
            r2.A04 = r3
            r0 = 2131100272(0x7f060270, float:1.781292E38)
            int r0 = r3.getColor(r0)
            r2.A00 = r0
            r0 = 104(0x68, float:1.46E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r5.getString(r0)
            r2.A0i = r0
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_QUERY"
            java.lang.String r6 = ""
            java.lang.String r0 = r5.getString(r0, r6)
            r2.A0D = r0
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MNET_REQUEST_ID"
            java.lang.String r0 = r5.getString(r0)
            r2.A0g = r0
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEE_ALL_SECTION_RANK_INDEX"
            int r0 = r5.getInt(r0)
            r2.A02 = r0
            r0 = 430(0x1ae, float:6.03E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r0 = r5.getInt(r0)
            r2.A01 = r0
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_FACEBOOK_FRIENDS"
            java.util.ArrayList r0 = r5.getParcelableArrayList(r0)
            r2.A0G = r0
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_FACEBOOK_NON_FRIENDS"
            java.util.ArrayList r0 = r5.getParcelableArrayList(r0)
            r2.A0H = r0
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_INSTAGRAM_NON_CONTACTS"
            java.util.ArrayList r0 = r5.getParcelableArrayList(r0)
            r2.A0K = r0
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_INSTAGRAM_BUSINESSES_ONLY_NON_CONTACTS"
            java.util.ArrayList r0 = r5.getParcelableArrayList(r0)
            r2.A0J = r0
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CHANNELS"
            java.util.ArrayList r0 = r5.getParcelableArrayList(r0)
            r2.A0I = r0
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_AI_AGENTS"
            java.util.ArrayList r0 = r5.getParcelableArrayList(r0)
            r2.A0E = r0
            r0 = 221(0xdd, float:3.1E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r5.getString(r0)
            r2.A0j = r0
            java.lang.String r0 = "DirectInboxFragment.DIRECT_VISUAL_MESSAGE_REPLAY_THREAD_KEY"
            android.os.Parcelable r4 = r5.getParcelable(r0)
            java.lang.Class<com.instagram.model.direct.DirectThreadKey> r3 = com.instagram.model.direct.DirectThreadKey.class
            android.os.Parcelable$Creator r0 = com.instagram.model.direct.DirectThreadKey.CREATOR
            java.lang.Object r0 = X.0B0.A01(r0, r4, r3)
            com.instagram.model.direct.DirectThreadKey r0 = (com.instagram.model.direct.DirectThreadKey) r0
            r2.A0e = r0
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_ON_DIRECT_SEND_SUCCESS_EXIT_BOUNDS"
            android.os.Parcelable r4 = r5.getParcelable(r0)
            java.lang.Class<android.graphics.RectF> r3 = android.graphics.RectF.class
            android.os.Parcelable$Creator r0 = android.graphics.RectF.CREATOR
            java.lang.Object r0 = X.0B0.A01(r0, r4, r3)
            android.graphics.RectF r0 = (android.graphics.RectF) r0
            r2.A0Y = r0
            r0 = 587(0x24b, float:8.23E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r15 = 0
            boolean r0 = r5.getBoolean(r0, r15)
            r2.A0R = r0
            java.lang.String r0 = "direct_channel_preset_type"
            java.lang.String r0 = r5.getString(r0, r6)
            r2.A0h = r0
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_IS_MSYS_ENABLED"
            boolean r0 = r5.getBoolean(r0)
            r2.A0l = r0
            com.instagram.common.session.UserSession r0 = r2.A06
            X.0wc r0 = X.AnonymousClass0kN.A01(r2, r0)
            r2.A0Z = r0
            com.instagram.common.session.UserSession r0 = r2.A06
            X.OyY r3 = X.C72208OyY.A00(r0)
            r2.A07 = r3
            com.instagram.common.session.UserSession r0 = r2.A06
            java.lang.Object r0 = X.C73467Pd9.A00(r0, r3)
            X.Nbq r0 = (X.C68963Nbq) r0
            r2.A0b = r0
            com.instagram.common.session.UserSession r0 = r2.A06
            X.7BY r0 = X.AnonymousClass7BY.A00(r0)
            r2.A08 = r0
            com.instagram.common.session.UserSession r0 = r2.A06
            X.0Tu r5 = X.0Tu.A05
            r3 = 36313944192977219(0x81035700040943, double:3.0284227599307066E-306)
            boolean r0 = X.DbY.A1Y(r5, r0, r3)
            r2.A0S = r0
            com.instagram.common.session.UserSession r0 = r2.A06
            r3 = 36317521900475658(0x8106980000150a, double:3.030685316558991E-306)
            boolean r0 = X.DbY.A1Y(r5, r0, r3)
            r2.A0m = r0
            com.instagram.common.session.UserSession r0 = r2.A06
            X.0qQ.A0B(r0, r15)
            r3 = 36320416709026194(0x81093a00092192, double:3.0325160051428086E-306)
            boolean r0 = X.182.A06(r5, r0, r3)
            r2.A0T = r0
            com.instagram.common.session.UserSession r0 = r2.A06
            X.0qQ.A0B(r0, r15)
            r3 = 36320416708895120(0x81093a00072190, double:3.032516005059917E-306)
            boolean r0 = X.182.A06(r5, r0, r3)
            r2.A0U = r0
            com.instagram.common.session.UserSession r3 = r2.A06
            r7 = 0
            X.MaJ r0 = new X.MaJ
            r0.<init>(r2, r3, r7)
            r2.A0c = r0
            boolean r0 = r2.A0R
            if (r0 == 0) goto L_0x0149
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r2.A0F = r0
        L_0x0149:
            java.util.ArrayList r0 = r2.A0G
            if (r0 == 0) goto L_0x0153
            java.util.HashSet r0 = X.C66580MXl.A12(r0)
            r2.A0M = r0
        L_0x0153:
            java.util.ArrayList r0 = r2.A0K
            if (r0 == 0) goto L_0x015d
            java.util.HashSet r0 = X.C66580MXl.A12(r0)
            r2.A0Q = r0
        L_0x015d:
            java.util.ArrayList r0 = r2.A0J
            if (r0 == 0) goto L_0x0167
            java.util.HashSet r0 = X.C66580MXl.A12(r0)
            r2.A0P = r0
        L_0x0167:
            java.util.ArrayList r0 = r2.A0H
            if (r0 == 0) goto L_0x0171
            java.util.HashSet r0 = X.C66580MXl.A12(r0)
            r2.A0N = r0
        L_0x0171:
            java.util.ArrayList r0 = r2.A0I
            if (r0 == 0) goto L_0x017b
            java.util.HashSet r0 = X.C66580MXl.A12(r0)
            r2.A0O = r0
        L_0x017b:
            java.util.ArrayList r0 = r2.A0E
            if (r0 == 0) goto L_0x0185
            java.util.HashSet r0 = X.C66580MXl.A12(r0)
            r2.A0L = r0
        L_0x0185:
            java.util.ArrayList r0 = r2.A0I
            if (r0 != 0) goto L_0x01a0
            boolean r0 = r2.A0S
            if (r0 == 0) goto L_0x0260
            com.instagram.common.session.UserSession r6 = r2.A06
            X.0Tu r0 = X.0Tu.A06
            r3 = 36595419169622161(0x82035700030891, double:3.206428668569725E-306)
            java.lang.Long r0 = X.AnonymousClass7TF.A0Y(r0, r6, r3)
        L_0x019a:
            int r0 = r0.intValue()
            r2.A0X = r0
        L_0x01a0:
            boolean r0 = r2.A0m
            if (r0 == 0) goto L_0x024f
            com.instagram.common.session.UserSession r0 = r2.A06
            r3 = 36598996877315416(0x82069800020d58, double:3.208691225321212E-306)
            java.lang.Long r0 = X.AnonymousClass7TF.A0Y(r5, r0, r3)
        L_0x01af:
            int r0 = r0.intValue()
            r2.A0W = r0
            com.instagram.common.session.UserSession r6 = r2.A06
            X.0qQ.A0B(r6, r15)
            boolean r0 = X.AnonymousClass9B8.A07(r6)
            if (r0 == 0) goto L_0x024c
            r3 = 36601316159918218(0x8208b40006108a, double:3.2101579489782254E-306)
            int r0 = X.DbS.A04(r5, r6, r3)
        L_0x01c9:
            r2.A0V = r0
            com.instagram.common.session.UserSession r0 = r2.A06
            r3 = 36314811776961332(0x810421000d0b34, double:3.02897142353574E-306)
            boolean r0 = X.DbY.A1Y(r5, r0, r3)
            r2.A0k = r0
            com.instagram.common.session.UserSession r3 = r2.A06
            X.O8G r0 = new X.O8G
            r0.<init>(r3)
            X.0xa r3 = r0.A00
            java.lang.String r0 = "debug_overlay_enabled"
            r3.getBoolean(r0, r15)
            boolean r0 = r2.A0R
            if (r0 == 0) goto L_0x0221
            com.instagram.common.session.UserSession r5 = r2.A06
            android.content.Context r4 = r2.requireContext()
            X.0gy r0 = X.AnonymousClass07i.A00(r2)
            X.2lw r3 = new X.2lw
            r3.<init>(r4, r0)
            java.lang.String r0 = r2.A0h
            r6 = r3
            r8 = r0
            r9 = r7
            r10 = r15
            X.PPe r0 = X.C67562Mpw.A01(r5, r6, r7, r8, r9, r10)
        L_0x0203:
            r2.A0B = r0
            com.instagram.common.session.UserSession r0 = r2.A06
            X.1Ng r4 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.Osa> r3 = X.C71892Osa.class
            X.1wn r0 = r2.A0o
            r4.A01(r0, r3)
            com.instagram.common.session.UserSession r0 = r2.A06
            X.3mS r0 = X.C251033mS.A00(r0)
            r2.A09 = r0
            r0 = 1399014554(0x5363449a, float:9.7610852E11)
            X.AnonymousClass0fD.A09(r0, r1)
            return
        L_0x0221:
            android.content.Context r4 = r2.requireContext()
            com.instagram.common.session.UserSession r5 = r2.A06
            android.content.Context r3 = r2.requireContext()
            X.0gy r0 = X.AnonymousClass07i.A00(r2)
            X.2lw r6 = new X.2lw
            r6.<init>(r3, r0)
            java.lang.String r8 = "universal"
            java.lang.String r9 = "direct_user_search_nullstate"
            boolean r0 = r2.A0l
            int r13 = r2.A0X
            int r12 = r2.A0W
            int r11 = r2.A0V
            r14 = 20
            r10 = r7
            r16 = r15
            r17 = r0
            X.7eL r0 = X.C67562Mpw.A05(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0203
        L_0x024c:
            r0 = 0
            goto L_0x01c9
        L_0x024f:
            r3 = 36598996877249879(0x82069800010d57, double:3.208691225279766E-306)
            X.0tM r0 = X.AnonymousClass0yP.A00(r3)
            java.lang.Object r0 = r0.getDefaultValue()
            java.lang.Number r0 = (java.lang.Number) r0
            goto L_0x01af
        L_0x0260:
            r3 = 36595419169622161(0x82035700030891, double:3.206428668569725E-306)
            X.0tM r0 = X.AnonymousClass0yP.A00(r3)
            java.lang.Object r0 = r0.getDefaultValue()
            java.lang.Number r0 = (java.lang.Number) r0
            goto L_0x019a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.fragment.DirectSearchInboxSeeAllFragment.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v6, types: [X.2tF, java.lang.Object] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1795662520);
        View inflate = layoutInflater.inflate(R.layout.inbox_search_see_all_fragment, viewGroup, false);
        this.mRecyclerView = DbX.A0K(inflate);
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(requireActivity());
        A002.A01(new EGN(this, this.A06, this, "inbox_search", this.A0k));
        A002.A01(new EG8(this.A04, this));
        A002.A01(new Object());
        this.A05 = DbU.A0U(A002, new Object());
        DbY.A15(this, this.mRecyclerView);
        this.mRecyclerView.setAdapter(this.A05);
        C337257fy r1 = this.A0B;
        if (r1 != null) {
            C337237fw r0 = this.A0A;
            if (r0 == null) {
                r0 = new C72917PPb(this, 0);
                this.A0A = r0;
            }
            r1.EcJ(r0);
            r1.EhX(this.A0D);
        }
        11Z.A02(new C73420PcH(this));
        2el A003 = 2el.A00();
        this.A0a = A003;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            A003.A06(recyclerView, AnonymousClass3DZ.A00(this));
        }
        C66583MXo.A0z(this);
        AnonymousClass0fD.A09(-1659185192, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-2013262766);
        super.onDestroy();
        this.A0C = null;
        this.A0f = null;
        AnonymousClass1Nd.A00(this.A06).A02(this.A0o, C71892Osa.class);
        C337257fy r0 = this.A0B;
        if (r0 != null) {
            r0.DDU();
        }
        AnonymousClass0fD.A09(1125921899, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1062315630);
        super.onResume();
        Integer num = this.A0f;
        if (num != null) {
            this.A05.notifyItemChanged(num.intValue());
            this.A0f = null;
        }
        AnonymousClass0fD.A09(-1904823336, A022);
    }
}
