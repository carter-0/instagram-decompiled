package com.instagram.video.live.mvvm.view;

import X.0eO;
import X.0qQ;
import X.17i;
import X.1Cn;
import X.1Ln;
import X.1Ng;
import X.1OP;
import X.2MD;
import X.2YL;
import X.2db;
import X.A96;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0t1;
import X.AnonymousClass0wW;
import X.AnonymousClass0xx;
import X.AnonymousClass2ZP;
import X.AnonymousClass4D7;
import X.AnonymousClass4DH;
import X.AnonymousClass4DR;
import X.AnonymousClass547;
import X.AnonymousClass7TE;
import X.AnonymousClass82X;
import X.C16380Utx;
import X.C20614Wvv;
import X.C227642jf;
import X.C239403Gi;
import X.C262204Co;
import X.C270194gL;
import X.C313546gc;
import X.C313626gk;
import X.C313646gm;
import X.C313656gn;
import X.C313666go;
import X.C313776gz;
import X.C313786h0;
import X.C313886hJ;
import X.C318116oQ;
import X.C340217kt;
import X.C340307l3;
import X.C366888pq;
import X.C57106IOu;
import X.C60034Jdk;
import X.C60284Jig;
import X.C62118KaQ;
import X.C62177KbZ;
import X.C62244Kce;
import X.C62253Kcn;
import X.C62259Kct;
import X.C62264Kcy;
import X.C62422KfX;
import X.C64514LdG;
import X.C64856LjI;
import X.C64872LjY;
import X.C64873LjZ;
import X.C64874Lja;
import X.C64998Llb;
import X.C66184MGv;
import X.C66186MGx;
import X.C66292MMb;
import X.DbS;
import X.DbT;
import X.DbV;
import X.DbW;
import X.DbX;
import X.JTP;
import X.JTR;
import X.JTS;
import X.L7M;
import X.L9Q;
import X.LA5;
import X.LEE;
import X.LEJ;
import X.LGN;
import X.LGX;
import X.LRB;
import X.LRP;
import X.LRy;
import X.M0I;
import X.M0M;
import X.M0W;
import X.MTA;
import X.MTC;
import X.X5L;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;

public final class IgLiveWithGuestFragment extends AnonymousClass4DH implements AnonymousClass4DR, C313626gk, X5L, MTA, MTC {
    public C340307l3 A00;
    public C270194gL A01;
    public User A02;
    public A96 A03;
    public C64514LdG A04;
    public M0W A05;
    public C64873LjZ A06;
    public LGX A07;
    public C62422KfX A08;
    public String A09;
    public C262204Co A0A;
    public boolean A0B;
    public C16380Utx A0C;
    public String A0D;
    public final C313546gc A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G = C227642jf.A02(this);
    public final Set A0H = AnonymousClass7TE.A1F();
    public C62118KaQ bottomsheetManagerView;
    public LA5 broadcastStatsView;
    public C60034Jdk cameraZoomView;
    public L7M cobroadcastView;
    public C62244Kce commentsView;
    public C57106IOu composerView;
    public C64872LjY donationBarView;
    public C64998Llb faceFilterView;
    public C62253Kcn headerView;
    public C64874Lja layoutManagerView;
    public LGN likesView;
    public C62259Kct mediaButtonsView;
    public LEE mentionView;
    public LRB optionsDialogView;
    public LEJ overlayVisibilityView;
    public L9Q scaleMediaView;
    public C62264Kcy stateView;
    public C64856LjI ufiView;

    public final boolean COF() {
        return false;
    }

    public final void Cfr() {
    }

    public final /* synthetic */ void DBF(long j) {
    }

    public final String getModuleName() {
        return "live_cobroadcast";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: X.X5L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: X.4DH} */
    /* JADX WARNING: type inference failed for: r7v10, types: [X.LjG, X.Kcn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r25, android.os.Bundle r26) {
        /*
            r24 = this;
            r9 = 0
            r7 = r25
            X.0qQ.A0B(r7, r9)
            r0 = r24
            r1 = r26
            super.onViewCreated(r7, r1)
            X.0eM r4 = r0.A0G
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r4)
            android.content.Context r1 = r0.getContext()
            r2 = 0
            if (r1 == 0) goto L_0x0415
            android.content.Context r1 = r1.getApplicationContext()
        L_0x001e:
            boolean r1 = X.C362988ir.A01(r1, r3)
            if (r1 == 0) goto L_0x0044
            X.0tS r1 = X.DbT.A0h()
            boolean r1 = r1.A0e()
            if (r1 == 0) goto L_0x0044
            X.LyH r8 = new X.LyH
            r8.<init>(r7, r0)
            X.1pd r6 = X.C362988ir.A00()
            android.content.Context r5 = X.AnonymousClass7TE.A0S(r7)
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r4)
            java.lang.String r1 = "sup:IgLiveWithGuestFragment"
            r6.A01(r5, r3, r8, r1)
        L_0x0044:
            r1 = 2131434483(0x7f0b1bf3, float:1.8490781E38)
            android.view.ViewGroup r8 = X.DbX.A0I(r7, r1)
            r14 = r8
            androidx.constraintlayout.widget.ConstraintLayout r14 = (androidx.constraintlayout.widget.ConstraintLayout) r14
            com.instagram.common.session.UserSession r17 = X.AnonymousClass7TE.A0l(r4)
            r1 = 28
            X.MIh r3 = new X.MIh
            r3.<init>(r0, r1)
            X.4gL r1 = r0.A01
            X.Utx r13 = new X.Utx
            r15 = r0
            r16 = r0
            r18 = r1
            r19 = r0
            r20 = r3
            r21 = r9
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r0.A0C = r13
            X.KfX r10 = r0.A08
            if (r10 == 0) goto L_0x0120
            java.lang.String r5 = r0.A0D
            if (r5 != 0) goto L_0x007f
            java.lang.String r12 = "broadcasterId"
        L_0x0077:
            X.0qQ.A0F(r12)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x007f:
            java.util.Map r11 = r13.A05
            java.lang.Object r1 = r11.get(r5)
            if (r1 != 0) goto L_0x0091
            android.content.Context r3 = r13.A02
            android.widget.Space r1 = new android.widget.Space
            r1.<init>(r3)
            r13.A02(r1, r5, r2)
        L_0x0091:
            java.util.Set r1 = r0.A0H
            java.util.Iterator r12 = r1.iterator()
        L_0x0097:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x00d2
            com.instagram.user.model.User r5 = X.DbT.A0k(r12)
            java.lang.String r3 = r5.getId()
            java.lang.String r1 = X.DbU.A0u(r4)
            boolean r1 = X.0qQ.A0K(r3, r1)
            if (r1 != 0) goto L_0x0097
            java.lang.String r3 = r5.getId()
            java.lang.Object r1 = r11.get(r3)
            if (r1 != 0) goto L_0x0097
            android.content.Context r1 = r13.A02
            android.widget.Space r5 = new android.widget.Space
            r5.<init>(r1)
            r13.A02(r5, r3, r2)
            android.os.Handler r3 = X.AnonymousClass7TF.A0D()
            X.M86 r1 = new X.M86
            r1.<init>(r5, r13)
            r5 = 10000(0x2710, double:4.9407E-320)
            r3.postDelayed(r1, r5)
            goto L_0x0097
        L_0x00d2:
            r10.A06 = r13
            androidx.constraintlayout.widget.ConstraintLayout r3 = r13.A03
            int r1 = r3.getWidth()
            r10.A01 = r1
            int r1 = r3.getHeight()
            r10.A00 = r1
            android.content.Context r11 = r10.A05
            android.view.SurfaceView r1 = new android.view.SurfaceView
            r1.<init>(r11)
            X.L7B r6 = new X.L7B
            r6.<init>(r1)
            android.view.View r5 = r6.A01
            com.instagram.common.session.UserSession r1 = r10.A07
            java.lang.String r3 = r1.A06
            r1 = 2131965211(0x7f13351b, float:1.9567225E38)
            java.lang.String r1 = r11.getString(r1)
            r13.A02(r5, r3, r1)
            X.LzJ r5 = new X.LzJ
            r5.<init>(r13, r10)
            X.LWZ r3 = new X.LWZ
            r3.<init>(r5, r6)
            java.util.Map r1 = r6.A02
            X.0qQ.A06(r1)
            r1.put(r5, r3)
            android.view.SurfaceView r1 = r6.A00
            android.view.SurfaceHolder r1 = r1.getHolder()
            r1.addCallback(r3)
            X.0qQ.A0B(r8, r9)
            X.LOa r1 = r10.A08
            r1.A05 = r8
        L_0x0120:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            android.os.Bundle r3 = r0.requireArguments()
            java.lang.String r1 = "args.tagged_business_partner_ids"
            java.util.ArrayList r1 = r3.getStringArrayList(r1)
            if (r1 != 0) goto L_0x0132
            X.0sn r1 = X.0sn.A00
        L_0x0132:
            java.util.Iterator r5 = r1.iterator()
        L_0x0136:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0153
            java.lang.String r3 = X.AnonymousClass7TE.A18(r5)
            X.17i r1 = X.JTR.A0u(r4)
            com.instagram.user.model.User r3 = r1.A02(r3)
            if (r3 == 0) goto L_0x0136
            com.instagram.pendingmedia.model.BrandedContentTag r1 = new com.instagram.pendingmedia.model.BrandedContentTag
            r1.<init>((com.instagram.user.model.User) r3)
            r6.add(r1)
            goto L_0x0136
        L_0x0153:
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r4)
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r10 = X.DbX.A0l(r1, r4)
            X.6gc r6 = r0.A0E
            X.6go r1 = X.C313666go.GUEST
            X.6h0 r5 = X.C313776gz.A0K
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r4)
            X.6gz r13 = r5.A00(r3, r1)
            r8 = r0
            r11 = r6
            r12 = r1
            X.LGX r3 = X.C63489Kxt.A00(r8, r9, r10, r11, r12, r13)
            r0.A07 = r3
            X.0eM r5 = r0.A0F
            java.lang.Object r8 = r5.getValue()
            X.6hJ r8 = (X.C313886hJ) r8
            java.lang.String r3 = r0.A09
            java.lang.String r12 = "broadcastId"
            if (r3 == 0) goto L_0x0077
            r8.A03(r6, r3)
            java.lang.Object r8 = r5.getValue()
            X.6hJ r8 = (X.C313886hJ) r8
            java.lang.String r3 = r0.A09
            if (r3 == 0) goto L_0x0077
            r8.A04(r3)
            r3 = 2131434958(0x7f0b1dce, float:1.8491745E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r7, r3)
            com.instagram.ui.widget.slidecontentlayout.SlideContentLayout r3 = (com.instagram.ui.widget.slidecontentlayout.SlideContentLayout) r3
            X.1X4 r13 = X.1X4.A00
            if (r13 == 0) goto L_0x0411
            com.instagram.common.session.UserSession r15 = X.AnonymousClass7TE.A0l(r4)
            java.lang.Integer r18 = X.AnonymousClass05K.A0C
            r14 = r0
            r16 = r3
            r17 = r6
            X.LdG r7 = r13.A00(r14, r15, r16, r17, r18)
            X.M0K r6 = new X.M0K
            r6.<init>(r0)
            X.MXE r3 = r7.A00
            r3.EhZ(r6)
            r0.A04 = r7
            java.lang.Object r3 = r5.getValue()
            X.6hJ r3 = (X.C313886hJ) r3
            X.2Fk r7 = r3.A00
            r3 = 38
            X.MP8 r6 = new X.MP8
            r6.<init>(r0, r3)
            r3 = 55
            X.DbV.A1F(r0, r7, r6, r3)
            androidx.fragment.app.FragmentActivity r14 = r0.requireActivity()
            X.JTO.A1Z(r14)
            android.view.View r15 = r0.requireView()
            java.lang.String r3 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r15, r3)
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15
            X.7l3 r9 = r0.A00
            if (r9 == 0) goto L_0x040d
            X.LGX r8 = r0.A07
            if (r8 != 0) goto L_0x01ec
            java.lang.String r12 = "reactionsPresenter"
            goto L_0x0077
        L_0x01ec:
            X.KfX r7 = r0.A08
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.video.live.streaming.common.IgLiveStreamingBaseController"
            X.0qQ.A0C(r7, r3)
            X.M0W r6 = r0.A05
            if (r6 == 0) goto L_0x0409
            X.A96 r3 = r0.A03
            if (r3 != 0) goto L_0x01ff
            java.lang.String r12 = "liveMediaPipeline"
            goto L_0x0077
        L_0x01ff:
            com.instagram.common.session.UserSession r17 = X.AnonymousClass7TE.A0l(r4)
            r10 = 15
            X.MMb r22 = X.C66292MMb.A01(r0, r10)
            r10 = 16
            X.MMb r23 = X.C66292MMb.A01(r0, r10)
            X.LjZ r13 = new X.LjZ
            r20 = r8
            r21 = r7
            r16 = r9
            r18 = r3
            r19 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r0.A06 = r13
            r13.A00 = r0
            X.Utx r3 = r0.A0C
            java.lang.Object r7 = r5.getValue()
            X.6hJ r7 = (X.C313886hJ) r7
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r4)
            java.lang.String r6 = r0.A09
            if (r6 == 0) goto L_0x0077
            X.Kcy r5 = new X.Kcy
            r5.<init>(r0, r8, r6)
            r0.stateView = r5
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r4)
            android.view.View r9 = r0.requireView()
            r13 = 2131626101(0x7f0e0875, float:1.8879429E38)
            X.LjI r5 = new X.LjI
            r8 = r5
            r10 = r0
            r12 = r1
            r8.<init>(r9, r10, r11, r12, r13)
            r0.ufiView = r5
            com.instagram.common.session.UserSession r12 = X.AnonymousClass7TE.A0l(r4)
            android.view.View r9 = r0.requireView()
            X.LjI r5 = r0.ufiView
            if (r5 != 0) goto L_0x025e
            java.lang.String r12 = "ufiView"
            goto L_0x0077
        L_0x025e:
            android.view.View r6 = r5.A02
            X.IOu r5 = new X.IOu
            r8 = r5
            r10 = r6
            r11 = r0
            r13 = r1
            r8.<init>(r9, r10, r11, r12, r13)
            r0.composerView = r5
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r4)
            X.KaQ r5 = new X.KaQ
            r8 = r5
            r9 = r0
            r11 = r1
            r12 = r2
            r13 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            r0.bottomsheetManagerView = r5
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r4)
            android.view.View r6 = r0.requireView()
            X.LA5 r5 = new X.LA5
            r5.<init>(r6, r0, r7, r1)
            r0.broadcastStatsView = r5
            com.instagram.common.session.UserSession r18 = X.AnonymousClass7TE.A0l(r4)
            X.7l3 r6 = r0.A00
            if (r6 == 0) goto L_0x040d
            X.LjZ r5 = r0.A06
            if (r5 != 0) goto L_0x029a
            java.lang.String r12 = "captureController"
            goto L_0x0077
        L_0x029a:
            android.view.GestureDetector r14 = r5.A03
            X.A96 r5 = r0.A03
            java.lang.String r12 = "liveMediaPipeline"
            if (r5 == 0) goto L_0x0077
            X.82X r5 = r5.A01
            X.Jdk r13 = new X.Jdk
            r15 = r0
            r16 = r6
            r17 = r5
            r13.<init>(r14, r15, r16, r17, r18)
            android.view.View r5 = r0.requireView()
            r5.setOnTouchListener(r13)
            r0.cameraZoomView = r13
            com.instagram.common.session.UserSession r15 = X.AnonymousClass7TE.A0l(r4)
            X.M0W r7 = r0.A05
            if (r7 == 0) goto L_0x0409
            android.os.Bundle r6 = r0.requireArguments()
            java.lang.String r5 = "args.server_info"
            java.lang.String r19 = r6.getString(r5, r2)
            X.L2o r5 = new X.L2o
            r5.<init>(r0)
            X.L7M r13 = new X.L7M
            r14 = r0
            r16 = r3
            r17 = r7
            r18 = r5
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r0.cobroadcastView = r13
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r4)
            android.view.View r14 = r0.requireView()
            X.4gL r5 = r0.A01
            r3 = 2
            X.0qQ.A0B(r9, r3)
            r3 = 39
            X.Wxb r11 = new X.Wxb
            r11.<init>(r3, r9, r0, r5)
            r3 = 5
            X.MMN r6 = new X.MMN
            r6.<init>(r0, r3)
            X.0eO r7 = X.0eO.A02
            r5 = 6
            X.MMN r3 = new X.MMN
            r3.<init>(r6, r5)
            X.0eM r10 = X.AnonymousClass0eN.A00(r7, r3)
            java.lang.Class<X.KdM> r3 = X.C62288KdM.class
            X.0Yh r8 = X.DbS.A0z(r3)
            r3 = 7
            X.MMN r6 = new X.MMN
            r6.<init>(r10, r3)
            r5 = 49
            X.Wvv r3 = new X.Wvv
            r3.<init>(r5, r2, r10)
            X.2kA r3 = X.DbS.A0I(r6, r11, r3, r8)
            java.lang.Object r5 = r3.getValue()
            X.KdH r5 = (X.C62283KdH) r5
            r3 = 4
            X.0qQ.A0B(r5, r3)
            X.Kce r3 = new X.Kce
            r13 = r3
            r15 = r0
            r16 = r9
            r17 = r1
            r18 = r5
            r13.<init>(r14, r15, r16, r17, r18)
            r3.A05()
            r0.commentsView = r3
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r4)
            android.view.View r5 = r0.requireView()
            X.LjY r3 = new X.LjY
            r3.<init>(r5, r0, r6, r1)
            r0.donationBarView = r3
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r4)
            X.A96 r5 = r0.A03
            if (r5 == 0) goto L_0x0077
            X.Llb r3 = new X.Llb
            r3.<init>(r0, r6, r5, r1)
            r0.faceFilterView = r3
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r4)
            android.view.View r8 = r0.requireView()
            X.4gL r5 = r0.A01
            r3 = 2
            X.0qQ.A0B(r9, r3)
            r6 = 3
            r3 = 9
            X.MMn r10 = X.C66304MMn.A01(r9, r5, r3)
            X.MM8 r5 = new X.MM8
            r5.<init>(r0, r6)
            r3 = 4
            X.0eM r7 = X.MM8.A00(r5, r7, r3)
            java.lang.Class<X.Jhw> r3 = X.C60239Jhw.class
            X.0Yh r6 = X.DbS.A0z(r3)
            r3 = 5
            X.MM8 r5 = new X.MM8
            r5.<init>(r7, r3)
            r3 = 10
            X.MMn r3 = X.C66304MMn.A01(r7, r2, r3)
            X.2kA r3 = X.DbS.A0I(r5, r10, r3, r6)
            java.lang.Object r3 = r3.getValue()
            X.Jhw r3 = (X.C60239Jhw) r3
            X.Kcn r7 = new X.Kcn
            r7.<init>(r8, r0, r9, r3)
            X.2Fk r6 = r3.A00
            X.07Z r5 = r0.getViewLifecycleOwner()
            X.2gO r3 = r7.A0D
            r6.A06(r5, r3)
            r0.headerView = r7
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r4)
            X.Lja r3 = new X.Lja
            r3.<init>(r0, r5, r1)
            r0.layoutManagerView = r3
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r4)
            android.view.View r5 = r0.requireView()
            X.LGN r3 = new X.LGN
            r3.<init>(r5, r0, r6, r1)
            r0.likesView = r3
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r4)
            android.view.View r5 = r0.requireView()
            X.LEE r3 = new X.LEE
            r3.<init>(r5, r0, r6, r1)
            r0.mentionView = r3
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r4)
            X.LRB r3 = new X.LRB
            r3.<init>(r0, r5, r1)
            r0.optionsDialogView = r3
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r4)
            android.view.View r6 = r0.requireView()
            r11 = 2131434386(0x7f0b1b92, float:1.8490584E38)
            X.LEJ r3 = new X.LEJ
            r5 = r3
            r7 = r0
            r9 = r2
            r10 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.Kct r2 = r0.mediaButtonsView
            if (r2 == 0) goto L_0x03f7
            X.0eM r2 = r2.A09
            android.view.View r2 = X.AnonymousClass7TH.A06(r2)
            if (r2 == 0) goto L_0x03f7
            r3.A00 = r2
        L_0x03f7:
            r0.overlayVisibilityView = r3
            android.view.View r5 = r0.requireView()
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r4)
            X.L9Q r2 = new X.L9Q
            r2.<init>(r5, r0, r3, r1)
            r0.scaleMediaView = r2
            return
        L_0x0409:
            java.lang.String r12 = "liveWithGuestWaterfall"
            goto L_0x0077
        L_0x040d:
            java.lang.String r12 = "cameraDeviceController"
            goto L_0x0077
        L_0x0411:
            java.lang.String r12 = "instance"
            goto L_0x0077
        L_0x0415:
            r1 = r2
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.view.IgLiveWithGuestFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final boolean COG() {
        C62422KfX kfX = this.A08;
        if (kfX == null || !kfX.A0C || kfX.A0F || kfX.A0B || kfX.A0E) {
            return false;
        }
        return true;
    }

    public final void DMr(int i, boolean z) {
        C64514LdG ldG = this.A04;
        if (i > 0) {
            if (ldG != null) {
                ldG.A00.CfM();
                return;
            }
        } else if (ldG != null) {
            ldG.A00.CfL();
            return;
        }
        0qQ.A0F("igLiveQuestionsController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DNB(boolean z, boolean z2) {
        LGX lgx = this.A07;
        if (lgx == null) {
            0qQ.A0F("reactionsPresenter");
            throw AnonymousClass00P.createAndThrow();
        } else {
            lgx.A04(z2);
        }
    }

    public final boolean EtF(String str) {
        String str2 = this.A09;
        if (str2 != null) {
            return !str2.equals(str);
        }
        0qQ.A0F("broadcastId");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0G);
    }

    public final boolean onBackPressed() {
        if (this.A0B) {
            return false;
        }
        L7M l7m = this.cobroadcastView;
        if (l7m == null) {
            0qQ.A0F("cobroadcastView");
            throw AnonymousClass00P.createAndThrow();
        }
        2YL A0H2 = DbS.A0H(l7m.A02);
        C66184MGv.A02(A0H2, C318116oQ.A00(A0H2), 15);
        return true;
    }

    public IgLiveWithGuestFragment() {
        C66292MMb A012 = C66292MMb.A01(this, 14);
        AnonymousClass0eM A002 = C66292MMb.A00(C66292MMb.A01(this, 17), 0eO.A02, 18);
        this.A0F = DbS.A0I(C66292MMb.A01(A002, 19), A012, new C20614Wvv(35, (Object) null, A002), DbS.A0z(C313886hJ.class));
        this.A0E = new M0M();
    }

    public final Integer Bdi(String str) {
        if (EtF(str)) {
            return AnonymousClass05K.A0N;
        }
        return null;
    }

    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        Set A062;
        int A022 = AnonymousClass0fD.A02(-1671163225);
        IgLiveWithGuestFragment.super.onCreate(bundle);
        AnonymousClass0eM r4 = this.A0G;
        UserSession A0l = AnonymousClass7TE.A0l(r4);
        0qQ.A0B(A0l, 0);
        C313786h0 r0 = C313776gz.A0K;
        C313666go r8 = C313666go.GUEST;
        r0.A01(A0l, r8);
        UserSession A0S = DbW.A0S(r4, 0);
        C313656gn r7 = C313646gm.A0A;
        r7.A01(A0S, r8);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            String string = bundle2.getString("args.broadcaster_id");
            0qQ.A0A(string);
            this.A0D = string;
            String string2 = bundle2.getString("args.broadcast_id");
            0qQ.A0A(string2);
            this.A09 = string2;
        }
        ReelStore A052 = 1OP.A05(AnonymousClass7TE.A0l(r4));
        String str4 = this.A09;
        String str5 = "broadcastId";
        if (str4 != null) {
            Reel A0M = A052.A0M(str4);
            if (A0M != null) {
                C270194gL r1 = A0M.A0H;
                if (r1 != null) {
                    this.A02 = r1.A03();
                } else {
                    r1 = null;
                }
                this.A01 = r1;
            }
            Context requireContext = requireContext();
            UserSession A0l2 = AnonymousClass7TE.A0l(r4);
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                str = bundle3.getString("IgLiveCapture.ARGUMENTS_KEY_EXTRA_FACE_EFFECT_ID");
            } else {
                str = null;
            }
            this.A03 = new A96(requireContext, A0l2, new M0I(this), str);
            this.A00 = C340217kt.A00(requireContext(), AnonymousClass7TE.A0l(r4), AnonymousClass000.A00(5010));
            C270194gL r02 = this.A01;
            if (!(r02 == null || (A062 = r02.A06()) == null)) {
                Iterator it = A062.iterator();
                while (it.hasNext()) {
                    User A0d = JTP.A0d(it);
                    Set set = this.A0H;
                    0qQ.A0A(A0d);
                    set.add(A0d);
                    JTR.A0u(r4).A01(A0d, true, false);
                }
            }
            Set set2 = this.A0H;
            set2.add(DbX.A0l(AnonymousClass0t1.A01, r4));
            Context requireContext2 = requireContext();
            1Cn r5 = new 1Cn(requireContext());
            String str6 = this.A09;
            if (str6 != null) {
                String str7 = this.A0D;
                str5 = "broadcasterId";
                if (str7 != null) {
                    String string3 = requireArguments().getString("args.media_id");
                    if (string3 == null) {
                        string3 = "";
                    }
                    Bundle bundle4 = this.mArguments;
                    if (bundle4 == null || (str2 = bundle4.getString("args.tracking_token")) == null) {
                        str2 = "";
                    }
                    Bundle bundle5 = this.mArguments;
                    if (bundle5 == null || (str3 = bundle5.getString("args.invite_type")) == null) {
                        str3 = "";
                    }
                    this.A05 = new M0W(requireContext2, DbX.A0P(this, r4), this, r5, str6, str7, string3, str2, str3, set2);
                    C313646gm A002 = r7.A00(this, DbW.A0S(r4, 0), r8);
                    0qQ.A0C(A002, "null cannot be cast to non-null type com.instagram.video.live.mvvm.model.logger.store.IgLiveParticipantLoggerStore");
                    C62177KbZ kbZ = (C62177KbZ) A002;
                    M0W m0w = this.A05;
                    String str8 = "liveWithGuestWaterfall";
                    if (m0w != null) {
                        kbZ.A01 = m0w;
                        if (this.A02 == null) {
                            m0w.A0A("invalid_broadcaster", "failed to retrieve from reel store");
                            17i A0u = JTR.A0u(r4);
                            String str9 = this.A0D;
                            if (str9 != null) {
                                User A023 = A0u.A02(str9);
                                this.A02 = A023;
                                if (A023 == null) {
                                    M0W m0w2 = this.A05;
                                    if (m0w2 != null) {
                                        m0w2.A0A("invalid_broadcaster", "failed to retrieve from user cache");
                                    }
                                }
                            }
                        }
                        M0W m0w3 = this.A05;
                        if (m0w3 != null) {
                            C340307l3 r03 = this.A00;
                            if (r03 == null) {
                                str8 = "cameraDeviceController";
                            } else {
                                m0w3.A02 = JTP.A0j(r03.CPy() ? 1 : 0);
                                C239403Gi.A01(requireContext(), AnonymousClass7TE.A0l(r4)).A02 = this;
                                M0W m0w4 = this.A05;
                                if (m0w4 != null) {
                                    Integer num = m0w4.A03;
                                    Integer num2 = AnonymousClass05K.A00;
                                    if (num == num2) {
                                        1Ln A032 = M0W.A03(m0w4, num2);
                                        LRy.A01(m0w4.A09, A032);
                                        A032.Cgf();
                                        m0w4.A03 = AnonymousClass05K.A01;
                                    } else {
                                        M0W.A07(m0w4, num2, "entering guest screen");
                                    }
                                    AnonymousClass0fD.A09(1886662836, A022);
                                    return;
                                }
                            }
                        }
                    }
                    0qQ.A0F(str8);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
        0qQ.A0F(str5);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        String str;
        AnonymousClass547 r0;
        int A022 = AnonymousClass0fD.A02(132597672);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater2, 0);
        C270194gL r02 = this.A01;
        if (r02 == null || (r0 = r02.A08) == null) {
            i = 0;
            i2 = 0;
        } else {
            i = r0.A00;
            i2 = r0.A01;
        }
        Context A052 = DbT.A05(requireContext());
        AnonymousClass0eM r1 = this.A0G;
        UserSession A0l = AnonymousClass7TE.A0l(r1);
        String str2 = this.A09;
        if (str2 == null) {
            str = "broadcastId";
        } else {
            AnonymousClass0xx A0J = DbV.A0J(this);
            C340307l3 r13 = this.A00;
            if (r13 == null) {
                str = "cameraDeviceController";
            } else {
                A96 a96 = this.A03;
                if (a96 == null) {
                    str = "liveMediaPipeline";
                } else {
                    AnonymousClass82X r14 = a96.A01;
                    M0W m0w = this.A05;
                    if (m0w == null) {
                        str = "liveWithGuestWaterfall";
                    } else {
                        LRP lrp = new LRP(requireContext(), this, AnonymousClass7TE.A0l(r1));
                        Bundle bundle2 = this.mArguments;
                        0qQ.A0A(bundle2);
                        boolean z = bundle2.getBoolean("args.camera_front_facing", true);
                        String string = requireArguments().getString("args.server_info", (String) null);
                        requireArguments().getString("args.video_call_id", (String) null);
                        M0W m0w2 = m0w;
                        LRP lrp2 = lrp;
                        C62422KfX kfX = new C62422KfX(A052, r13, r14, this, A0l, lrp2, m0w2, this, str2, string, A0J, i, i2, z);
                        this.A08 = kfX;
                        kfX.A0G = requireArguments().getBoolean("args.live_trace_enabled", false);
                        View A0D2 = DbT.A0D(layoutInflater2, viewGroup, R.layout.layout_iglive_livewith, false);
                        AnonymousClass0fD.A09(-411326300, A022);
                        return A0D2;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(916481787);
        super.onDestroy();
        C62422KfX kfX = this.A08;
        if (kfX != null) {
            kfX.A0C();
        }
        C62264Kcy kcy = this.stateView;
        if (kcy == null) {
            0qQ.A0F("stateView");
            throw AnonymousClass00P.createAndThrow();
        }
        kcy.A01();
        C313776gz.A0K.A01(JTS.A0J(this.A0G), C313666go.GUEST);
        AnonymousClass0fD.A09(-1616070020, A022);
    }

    public final void onDestroyView() {
        String str;
        int A022 = AnonymousClass0fD.A02(-774921778);
        super.onDestroyView();
        C64873LjZ ljZ = this.A06;
        if (ljZ == null) {
            str = "captureController";
        } else {
            ljZ.A04.setOnTouchListener((View.OnTouchListener) null);
            ljZ.A00 = null;
            A96 a96 = ljZ.A06;
            a96.A00 = null;
            1Ng r2 = a96.A02;
            if (r2 != null) {
                r2.A02(a96.A03, C366888pq.class);
            }
            a96.A01.A03();
            Activity rootActivity = getRootActivity();
            0qQ.A0A(rootActivity);
            Window window = rootActivity.getWindow();
            0qQ.A07(window);
            2db.A07(this.mView, window, true);
            C64514LdG ldG = this.A04;
            if (ldG == null) {
                str = "igLiveQuestionsController";
            } else {
                ldG.destroy();
                ((C313886hJ) this.A0F.getValue()).A02();
                this.A0C = null;
                C239403Gi.A01(requireContext(), AnonymousClass7TE.A0l(this.A0G)).A02 = null;
                AnonymousClass0fD.A09(190875149, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(219327594);
        IgLiveWithGuestFragment.super.onPause();
        M0W m0w = this.A05;
        String str = "liveWithGuestWaterfall";
        if (m0w != null) {
            m0w.A0A.removeCallbacks(m0w.A0G);
            if (this.A06 == null) {
                str = "captureController";
            } else {
                2MD.A01();
                C62422KfX kfX = this.A08;
                if (kfX != null) {
                    kfX.A0I();
                }
                C262204Co r0 = this.A0A;
                if (r0 != null) {
                    r0.AG7((CancellationException) null);
                }
                this.A0A = null;
                C62264Kcy kcy = this.stateView;
                if (kcy == null) {
                    str = "stateView";
                } else {
                    C60284Jig A002 = kcy.A00();
                    C262204Co r02 = A002.A00;
                    if (r02 != null) {
                        r02.AG7((CancellationException) null);
                    }
                    A002.A00 = null;
                    LGN lgn = this.likesView;
                    if (lgn == null) {
                        str = "likesView";
                    } else {
                        lgn.A02();
                        C62244Kce kce = this.commentsView;
                        if (kce == null) {
                            str = "commentsView";
                        } else {
                            kce.A06();
                            LRB lrb = this.optionsDialogView;
                            if (lrb == null) {
                                str = "optionsDialogView";
                            } else {
                                C262204Co r03 = lrb.A00;
                                if (r03 != null) {
                                    r03.AG7((CancellationException) null);
                                }
                                lrb.A00 = null;
                                M0W m0w2 = this.A05;
                                if (m0w2 != null) {
                                    1Ln A032 = M0W.A03(m0w2, AnonymousClass05K.A0j);
                                    A032.A0R("reason", "user_initiated");
                                    A032.Cgf();
                                    AnonymousClass0fD.A09(2099586336, A022);
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

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(429081936);
        super.onResume();
        Activity rootActivity = getRootActivity();
        0qQ.A0A(rootActivity);
        Window window = rootActivity.getWindow();
        0qQ.A07(window);
        2db.A07(this.mView, window, false);
        M0W m0w = this.A05;
        String str = "liveWithGuestWaterfall";
        if (m0w != null) {
            m0w.A0F.A04();
            if (m0w.A07) {
                JTR.A1A(m0w.A0A, m0w.A0G);
            }
            if (this.A06 == null) {
                str = "captureController";
            } else {
                2MD.A01();
                C62422KfX kfX = this.A08;
                if (kfX != null) {
                    kfX.A0F = false;
                    if (!kfX.A0B) {
                        if (kfX.A04 != null) {
                            C62422KfX.A02(kfX);
                        }
                        kfX.A0M.A00();
                    }
                }
                this.A0A = JTS.A0t(this, new C66186MGx(this, (AnonymousClass4D7) null, 41), C313776gz.A0K.A00(AnonymousClass7TE.A0l(this.A0G), C313666go.GUEST).A03().A00);
                C62264Kcy kcy = this.stateView;
                if (kcy == null) {
                    str = "stateView";
                } else {
                    C60284Jig.A00(kcy.A00());
                    LGN lgn = this.likesView;
                    if (lgn == null) {
                        str = "likesView";
                    } else {
                        lgn.A01().A05();
                        C62244Kce kce = this.commentsView;
                        if (kce == null) {
                            str = "commentsView";
                        } else {
                            kce.A07();
                            LRB lrb = this.optionsDialogView;
                            if (lrb == null) {
                                str = "optionsDialogView";
                            } else {
                                lrb.A02();
                                M0W m0w2 = this.A05;
                                if (m0w2 != null) {
                                    if (m0w2.A03 == AnonymousClass05K.A0C) {
                                        1Ln A032 = M0W.A03(m0w2, AnonymousClass05K.A0u);
                                        A032.A0R("reason", "user_initiated");
                                        A032.Cgf();
                                    }
                                    AnonymousClass0fD.A09(-1362669190, A022);
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

    public final void onStart() {
        AnonymousClass2ZP r1;
        String str;
        int A022 = AnonymousClass0fD.A02(-453565877);
        IgLiveWithGuestFragment.super.onStart();
        C57106IOu iOu = this.composerView;
        if (iOu == null) {
            str = "composerView";
        } else {
            JTP.A18(iOu.A08, iOu.A0A);
            C64874Lja lja = this.layoutManagerView;
            if (lja == null) {
                str = "layoutManagerView";
            } else {
                JTP.A18(lja.A01, lja.A03);
                C64856LjI ljI = this.ufiView;
                if (ljI == null) {
                    str = "ufiView";
                } else {
                    JTP.A18(ljI.A03, ljI.A05);
                    C64873LjZ ljZ = this.A06;
                    if (ljZ == null) {
                        str = "captureController";
                    } else {
                        ljZ.A05.DmJ(ljZ.A02);
                        Activity rootActivity = getRootActivity();
                        if ((rootActivity instanceof AnonymousClass2ZP) && (r1 = (AnonymousClass2ZP) rootActivity) != null) {
                            r1.Enj(8);
                        }
                        AnonymousClass0fD.A09(152218628, A022);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onStop() {
        AnonymousClass2ZP r1;
        String str;
        int A022 = AnonymousClass0fD.A02(-874941369);
        IgLiveWithGuestFragment.super.onStop();
        C57106IOu iOu = this.composerView;
        if (iOu == null) {
            str = "composerView";
        } else {
            iOu.A0A.onStop();
            C64874Lja lja = this.layoutManagerView;
            if (lja == null) {
                str = "layoutManagerView";
            } else {
                lja.A03.onStop();
                C64856LjI ljI = this.ufiView;
                if (ljI == null) {
                    str = "ufiView";
                } else {
                    ljI.A05.onStop();
                    C64873LjZ ljZ = this.A06;
                    if (ljZ == null) {
                        str = "captureController";
                    } else {
                        ljZ.A05.onStop();
                        Activity rootActivity = getRootActivity();
                        if ((rootActivity instanceof AnonymousClass2ZP) && (r1 = (AnonymousClass2ZP) rootActivity) != null) {
                            r1.Enj(0);
                        }
                        AnonymousClass0fD.A09(-1986668189, A022);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
