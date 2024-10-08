package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.concurrent.CancellationException;

public final class K6W extends AnonymousClass4DH implements AnonymousClass4DR, X5L {
    public static final String __redex_internal_original_name = "IgLiveCaptureFragment";
    public C18078Vl7 A00;
    public C340307l3 A01;
    public A96 A02;
    public LGO A03;
    public C65816M0i A04;
    public M0Y A05;
    public LOO A06;
    public C64873LjZ A07;
    public LGX A08;
    public C62423KfY A09;
    public C262204Co A0A;
    public C16380Utx A0B;
    public C313886hJ A0C;
    public final AnonymousClass0eM A0D = C66292MMb.A00(this, 0eO.A02, 7);
    public final AnonymousClass0eM A0E = C227642jf.A02(this);
    public final C313556gd A0F = new M0N(this);
    public C62118KaQ bottomsheetManagerView;
    public LA5 broadcastStatsView;
    public C60034Jdk cameraZoomView;
    public C57105IOt capturePrepareView;
    public L7N cobroadcastView;
    public C62246Kcg commentsView;
    public C57106IOu composerView;
    public C64872LjY donationBarView;
    public C65026Lm4 drawingView;
    public L7O endView;
    public C64993LlW eyedropperColorPickerView;
    public C64998Llb faceFilterView;
    public C62255Kcp headerView;
    public L9R hostModerationView;
    public C64083LMb hostOptionsView;
    public L7P inviteToJoinView;
    public C64874Lja layoutManagerView;
    public LGN likesView;
    public C62259Kct mediaButtonsView;
    public LEE mentionView;
    public LNA nuxTutorialView;
    public LRB optionsDialogView;
    public LB2 overlayBurnInView;
    public LEJ overlayVisibilityView;
    public L9Q scaleMediaView;
    public L5U ssiSheetView;
    public C62265Kcz stateView;
    public C65025Lm3 textStickersView;
    public L5T timeWarningView;
    public C62266Kd0 ufiView;

    public final void DNB(boolean z, boolean z2) {
    }

    public final String getModuleName() {
        return "live_broadcast";
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        C65816M0i m0i = this.A04;
        if (m0i != null) {
            bundle.putInt(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, m0i.A05.ordinal());
            bundle.putString("media_id", m0i.A0A);
            bundle.putString(TraceFieldType.BroadcastId, m0i.A09);
            bundle.putString("saved_video_file_path", m0i.A0C);
            super.onSaveInstanceState(bundle);
        }
    }

    public static final UserSession A00(K6W k6w) {
        return AnonymousClass7TE.A0l(k6w.A0E);
    }

    public static final void A01(Bundle bundle, K6W k6w, boolean z) {
        C65816M0i m0i = k6w.A04;
        if (m0i != null) {
            m0i.A01(C62635Kj6.STOPPED);
        }
        Intent intent = null;
        if (bundle != null) {
            intent = DbS.A09();
            intent.putExtras(bundle);
        }
        FragmentActivity activity = k6w.getActivity();
        if (activity != null) {
            int i = 0;
            if (z) {
                i = -1;
            }
            activity.setResult(i, intent);
            activity.finish();
            return;
        }
        0wb.A03("IgLiveCaptureFragment.closeFragment", 002.A1D("Activity is null: success=", z));
    }

    public static final void A02(K6W k6w, String str) {
        C313756gx A0R = DbZ.A0R(k6w.A0D);
        C65816M0i m0i = k6w.A04;
        String str2 = null;
        if (m0i != null) {
            str2 = m0i.A0A;
        }
        C357498Yd r2 = C357488Yc.A03;
        A0R.A0X(str2, ((AnonymousClass3NV) JTS.A0Z(r2, k6w).A0A.getValue()).A01, JTO.A11(JTS.A0Z(r2, k6w).A0I), true);
        LGO lgo = k6w.A03;
        if (lgo == null) {
            0qQ.A0F("supLiveDelegate");
            throw AnonymousClass00P.createAndThrow();
        }
        lgo.A00();
        C65816M0i m0i2 = k6w.A04;
        if (m0i2 != null) {
            m0i2.A02(AnonymousClass05K.A01, str, true);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A0E);
    }

    public final boolean onBackPressed() {
        if (JTR.A1a(C313776gz.A0K.A00(AnonymousClass7TE.A0l(this.A0E), C313666go.BROADCASTER).A02().A0m)) {
            LNA lna = this.nuxTutorialView;
            if (lna == null) {
                return true;
            }
            LES les = ((C60195JhE) lna.A08.getValue()).A04;
            les.A0N.Epw(false);
            les.A0M.Epw(false);
            return true;
        }
        M0Y m0y = this.A05;
        if (m0y == null) {
            return false;
        }
        C65816M0i m0i = m0y.A0C;
        C62635Kj6 kj6 = m0i.A05;
        if (kj6.A00()) {
            if (C51971G9r.A1b(m0y.A0G)) {
                return true;
            }
            if (!C278264wZ.A04(m0y.A06)) {
                m0y.A0E.A01 = true;
                m0y.A0D.A01(m0i);
            }
            MG2.A01(m0y, DbV.A0J(m0y.A05), 37);
            return true;
        } else if (!kj6.A01()) {
            m0i.A02(AnonymousClass05K.A01, "onBackPressed", false);
            m0y.A09.A01();
            return false;
        } else {
            m0y.A0I.invoke(true, (Object) null);
            return true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: X.X5L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r53v0, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v1, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v0, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r79v0, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v1, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v2, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v3, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v1, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v3, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v43, resolved type: X.4DH} */
    /* JADX WARNING: type inference failed for: r6v44, types: [X.L1x, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r87, android.os.Bundle r88) {
        /*
            r86 = this;
            r17 = 0
            r3 = r87
            r0 = r17
            X.0qQ.A0B(r3, r0)
            r0 = r86
            r30 = r88
            r1 = r30
            super.onViewCreated(r3, r1)
            r1 = 2131434484(0x7f0b1bf4, float:1.8490783E38)
            android.view.View r78 = X.AnonymousClass7TE.A0b(r3, r1)
            r1 = 2131434483(0x7f0b1bf3, float:1.8490781E38)
            android.view.View r32 = X.AnonymousClass7TE.A0b(r3, r1)
            r1 = r32
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r32 = r1
            r4 = r32
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            X.0eM r1 = r0.A0E
            r85 = r1
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r85)
            r1 = 26
            X.MIh r2 = new X.MIh
            r2.<init>(r0, r1)
            r13 = 1
            r46 = 0
            X.Utx r1 = new X.Utx
            r5 = r1
            r6 = r4
            r7 = r0
            r8 = r0
            r10 = r46
            r11 = r0
            r12 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0.A0B = r1
            androidx.fragment.app.FragmentActivity r5 = r0.requireActivity()
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r85)
            X.6go r4 = X.C313666go.BROADCASTER
            X.KDm r1 = new X.KDm
            r1.<init>(r0, r2, r4)
            X.2YN r2 = X.JTO.A0L(r1, r5)
            java.lang.Class<X.6hJ> r1 = X.C313886hJ.class
            X.2YL r1 = r2.A00(r1)
            X.6hJ r1 = (X.C313886hJ) r1
            r0.A0C = r1
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r85)
            X.7l3 r2 = r0.A01
            java.lang.String r16 = "cameraDeviceController"
            if (r2 == 0) goto L_0x02f2
            boolean r1 = r2 instanceof X.C340297l2
            if (r1 == 0) goto L_0x014e
            X.7l2 r2 = (X.C340297l2) r2
        L_0x0078:
            android.content.Context r1 = r0.requireContext()
            X.LGO r8 = new X.LGO
            r8.<init>(r1, r0, r2, r5)
            r0.A03 = r8
            X.Vl7 r5 = r0.A00
            X.0xi r31 = X.0tS.A4E
            X.0tS r1 = r31.A00()
            boolean r2 = r1.A0e()
            com.instagram.common.session.UserSession r7 = r8.A06
            android.content.Context r1 = r8.A03
            android.content.Context r1 = r1.getApplicationContext()
            boolean r1 = X.C362988ir.A01(r1, r7)
            if (r1 == 0) goto L_0x00af
            X.LyJ r6 = new X.LyJ
            r6.<init>(r3, r5, r8, r2)
            X.1pd r5 = X.C362988ir.A00()
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r3)
            java.lang.String r1 = "sup:SupLiveDelegate:setupGlassesErrorOverlay"
            r5.A01(r2, r7, r6, r1)
        L_0x00af:
            X.Vl7 r7 = r0.A00
            if (r7 == 0) goto L_0x00c6
            X.0tS r6 = r31.A00()
            X.0s0 r5 = r6.A1t
            X.0YZ[] r2 = X.0tS.A4G
            r1 = 227(0xe3, float:3.18E-43)
            boolean r2 = X.AnonymousClass7TG.A1a(r6, r5, r2, r1)
            X.XBm r1 = r7.A0B
            r1.ARg(r2)
        L_0x00c6:
            android.content.Context r48 = r0.requireContext()
            com.instagram.common.session.UserSession r54 = X.AnonymousClass7TE.A0l(r85)
            X.0gy r49 = X.AnonymousClass07i.A00(r0)
            X.0xx r61 = X.DbV.A0J(r0)
            X.M0X r56 = X.C64139LPo.A00(r0)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r85)
            X.KbY r6 = X.C64139LPo.A01(r0, r1)
            android.content.Context r5 = r0.requireContext()
            X.LRP r9 = r6.A00
            if (r9 != 0) goto L_0x00f5
            com.instagram.common.session.UserSession r2 = r6.A01
            X.0iw r1 = r6.A00
            X.LRP r9 = new X.LRP
            r9.<init>(r5, r1, r2)
            r6.A00 = r9
        L_0x00f5:
            java.lang.Integer r44 = X.AnonymousClass05K.A00
            X.8Yd r2 = X.C357488Yc.A03
            X.LEQ r1 = X.JTS.A0Z(r2, r0)
            X.0Ud r1 = r1.A0A
            java.lang.Object r5 = r1.getValue()
            X.3NV r29 = X.AnonymousClass3NV.A06
            r1 = r29
            boolean r74 = X.AnonymousClass7TF.A1W(r5, r1)
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r85)
            r1 = r17
            X.0Tu r18 = X.DbS.A0J(r5, r1)
            r6 = 36310881881031008(0x81008e00000160, double:3.0264861415249823E-306)
            r1 = r18
            boolean r1 = X.182.A06(r1, r5, r6)
            if (r1 == 0) goto L_0x0541
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r85)
            X.1Av r1 = X.1Au.A00(r1)
            java.lang.String r5 = "reel"
            boolean r1 = r1.A24(r5)
            if (r1 == 0) goto L_0x0541
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r85)
            X.1Av r1 = X.1Au.A00(r1)
            java.util.Set r1 = r1.A0I(r5)
            java.util.List r1 = X.00k.A0X(r1)
            java.util.Set r1 = X.00k.A0k(r1)
            X.L1x r6 = new X.L1x
            r6.<init>()
            r6.A00 = r1
            goto L_0x0151
        L_0x014e:
            r2 = r10
            goto L_0x0078
        L_0x0151:
            java.io.StringWriter r5 = X.JTO.A0v()     // Catch:{ IOException -> 0x0162 }
            X.17W r1 = X.JTO.A0Q(r5)     // Catch:{ IOException -> 0x0162 }
            X.LJG.A00(r1, r6)     // Catch:{ IOException -> 0x0162 }
            java.lang.String r66 = X.JTP.A0n(r1, r5)     // Catch:{ IOException -> 0x0162 }
            goto L_0x0543
        L_0x0162:
            r6 = move-exception
            java.lang.String r5 = r6.toString()
            java.lang.String r1 = "IgLive.EndBroadcastProblem"
            X.0wb.A06(r1, r5, r6)
            java.lang.String r66 = ""
            goto L_0x0543
        L_0x0170:
            X.1X4 r39 = X.1X4.A00
            if (r39 == 0) goto L_0x0818
            com.instagram.common.session.UserSession r41 = X.AnonymousClass7TE.A0l(r85)
            r6 = r17
            X.0qQ.A0B(r10, r6)
            X.6hO r7 = new X.6hO
            r7.<init>(r10)
            r6 = 2131434958(0x7f0b1dce, float:1.8491745E38)
            android.view.View r6 = X.AnonymousClass7TE.A0b(r3, r6)
            com.instagram.ui.widget.slidecontentlayout.SlideContentLayout r6 = (com.instagram.ui.widget.slidecontentlayout.SlideContentLayout) r6
            r40 = r0
            r42 = r6
            r43 = r7
            X.LdG r37 = r39.A00(r40, r41, r42, r43, r44)
            X.6hJ r9 = r0.A0C
            if (r9 == 0) goto L_0x053c
            X.6hO r8 = new X.6hO
            r8.<init>(r10)
            r6 = 12
            X.JFy r7 = new X.JFy
            r7.<init>(r0, r6)
            X.MMb r47 = X.C66292MMb.A01(r0, r6)
            r6 = 13
            X.MMb r48 = X.C66292MMb.A01(r0, r6)
            X.M0Y r6 = new X.M0Y
            r33 = r6
            r35 = r0
            r38 = r8
            r39 = r15
            r40 = r5
            r41 = r9
            r42 = r1
            r43 = r11
            r44 = r12
            r45 = r13
            r49 = r14
            r50 = r7
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            X.Utx r5 = r0.A0B
            if (r5 == 0) goto L_0x0537
            r5.A00 = r6
            r0.A05 = r6
            X.KfY r7 = r0.A09
            if (r7 == 0) goto L_0x07f7
            r6 = r32
            r5 = r17
            X.0qQ.A0B(r6, r5)
            X.LOa r6 = r7.A08
            r5 = r32
            r6.A05 = r5
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r85)
            android.content.Context r5 = r0.requireContext()
            X.3Gj r6 = X.C239403Gi.A01(r5, r6)
            X.M0Y r5 = r0.A05
            r6.A02 = r5
            X.Kj6 r7 = r1.A05
            if (r88 == 0) goto L_0x0227
            X.Kj6[] r7 = X.C62635Kj6.values()
            java.lang.String r6 = "state"
            r5 = r30
            int r5 = r5.getInt(r6)
            r7 = r7[r5]
            java.lang.String r6 = "broadcast_id"
            r5 = r30
            java.lang.String r5 = r5.getString(r6)
            if (r5 == 0) goto L_0x0213
            r1.A09 = r5
        L_0x0213:
            java.lang.String r6 = "media_id"
            r5 = r30
            java.lang.String r5 = r5.getString(r6)
            r1.A0A = r5
            java.lang.String r6 = "saved_video_file_path"
            r5 = r30
            java.lang.String r5 = r5.getString(r6)
            r1.A0C = r5
        L_0x0227:
            r1.A01(r7)
            X.0eM r5 = r0.A0D
            X.6gx r9 = X.DbZ.A0R(r5)
            X.LEQ r5 = X.JTS.A0Z(r2, r0)
            X.0Ud r5 = r5.A0I
            java.lang.String r8 = X.JTO.A11(r5)
            java.lang.String r5 = r1.A0A
            X.LEQ r1 = X.JTS.A0Z(r2, r0)
            X.0Ud r1 = r1.A0A
            java.lang.Object r1 = r1.getValue()
            X.3NV r1 = (X.AnonymousClass3NV) r1
            java.lang.String r7 = r1.A01
            r1 = r21
            X.0qQ.A0B(r7, r1)
            X.1Ln r6 = X.DbT.A0J(r9)
            boolean r1 = X.DbT.A1Y(r6)
            if (r1 == 0) goto L_0x0288
            if (r8 == 0) goto L_0x0288
            X.DbW.A17(r6, r9)
            java.lang.String r1 = "live_stream_start"
            X.DbV.A1M(r6, r1)
            java.lang.String r1 = "start_live_button"
            r6.A0p(r1)
            r1 = 330(0x14a, float:4.62E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            X.JTS.A1G(r6, r1, r8)
            java.lang.String r1 = r9.A01
            r6.A0v(r1)
            java.lang.String r1 = "live_id"
            X.0eP r5 = X.AnonymousClass7TE.A1L(r1, r5)
            java.lang.String r1 = "audience"
            java.util.LinkedHashMap r1 = X.DbY.A0p(r1, r7, r5)
            r6.A0w(r1)
            r6.Cgf()
        L_0x0288:
            X.Utx r10 = r0.A0B
            if (r10 == 0) goto L_0x0537
            X.LGO r5 = r0.A03
            if (r5 == 0) goto L_0x080e
            X.6hJ r11 = r0.A0C
            if (r11 == 0) goto L_0x053c
            X.KfY r9 = r0.A09
            if (r9 == 0) goto L_0x07f7
            X.M0Y r8 = r0.A05
            com.instagram.common.session.UserSession r30 = X.AnonymousClass7TE.A0l(r85)
            X.LEQ r1 = X.JTS.A0Z(r2, r0)
            X.0Ud r1 = r1.A0J
            java.lang.Object r12 = r1.getValue()
            java.lang.String r12 = (java.lang.String) r12
            X.LEQ r1 = X.JTS.A0Z(r2, r0)
            X.0Ud r1 = r1.A0A
            java.lang.Object r7 = r1.getValue()
            X.3NV r7 = (X.AnonymousClass3NV) r7
            X.LEQ r1 = X.JTS.A0Z(r2, r0)
            X.0Ud r1 = r1.A0B
            java.lang.Object r6 = r1.getValue()
            java.util.List r6 = (java.util.List) r6
            X.LEQ r1 = X.JTS.A0Z(r2, r0)
            X.0Ud r1 = r1.A0E
            boolean r34 = X.JTR.A1a(r1)
            X.Kcz r1 = new X.Kcz
            r28 = r1
            r29 = r0
            r31 = r7
            r32 = r12
            r33 = r6
            r28.<init>(r29, r30, r31, r32, r33, r34)
            r0.stateView = r1
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r85)
            X.Kd0 r1 = new X.Kd0
            r1.<init>(r3, r0, r6, r4)
            r0.ufiView = r1
            com.instagram.common.session.UserSession r25 = X.AnonymousClass7TE.A0l(r85)
            X.Kd0 r1 = r0.ufiView
            if (r1 != 0) goto L_0x02f7
            java.lang.String r16 = "ufiView"
        L_0x02f2:
            X.0qQ.A0F(r16)
            goto L_0x07fa
        L_0x02f7:
            android.view.View r6 = r1.A02
            X.IOu r1 = new X.IOu
            r21 = r1
            r22 = r3
            r23 = r6
            r24 = r0
            r26 = r4
            r21.<init>(r22, r23, r24, r25, r26)
            r0.composerView = r1
            com.instagram.common.session.UserSession r23 = X.AnonymousClass7TE.A0l(r85)
            X.KaQ r1 = new X.KaQ
            r21 = r1
            r22 = r0
            r24 = r4
            r25 = r8
            r26 = r11
            r21.<init>(r22, r23, r24, r25, r26)
            r0.bottomsheetManagerView = r1
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r85)
            X.KaQ r6 = r0.bottomsheetManagerView
            if (r6 != 0) goto L_0x032a
            java.lang.String r16 = "bottomsheetManagerView"
            goto L_0x02f2
        L_0x032a:
            X.LMb r1 = new X.LMb
            r1.<init>(r0, r7, r6)
            r0.hostOptionsView = r1
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r85)
            X.LA5 r1 = new X.LA5
            r1.<init>(r3, r0, r6, r4)
            r0.broadcastStatsView = r1
            com.instagram.common.session.UserSession r26 = X.AnonymousClass7TE.A0l(r85)
            X.7l3 r8 = r0.A01
            if (r8 == 0) goto L_0x02f2
            X.LjZ r1 = r0.A07
            if (r1 != 0) goto L_0x034b
            java.lang.String r16 = "captureController"
            goto L_0x02f2
        L_0x034b:
            android.view.GestureDetector r7 = r1.A03
            X.A96 r1 = r0.A02
            r16 = r27
            if (r1 == 0) goto L_0x02f2
            X.82X r1 = r1.A01
            X.Jdk r6 = new X.Jdk
            r21 = r6
            r22 = r7
            r23 = r0
            r24 = r8
            r25 = r1
            r21.<init>(r22, r23, r24, r25, r26)
            android.view.View r1 = r0.requireView()
            r1.setOnTouchListener(r6)
            r0.cameraZoomView = r6
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r85)
            X.HjK r6 = new X.HjK
            r6.<init>(r0)
            X.IOt r1 = new X.IOt
            r1.<init>(r3, r0, r7, r6)
            r0.capturePrepareView = r1
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r85)
            X.L7N r1 = new X.L7N
            r1.<init>(r0, r6, r10, r9)
            r0.cobroadcastView = r1
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r85)
            X.LEQ r1 = X.JTS.A0Z(r2, r0)
            X.0Ud r1 = r1.A0E
            boolean r2 = X.JTR.A1a(r1)
            X.Kcg r1 = new X.Kcg
            r1.<init>(r3, r0, r6, r2)
            r0.commentsView = r1
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r85)
            android.view.View r2 = r0.requireView()
            X.LjY r1 = new X.LjY
            r1.<init>(r2, r0, r6, r4)
            r0.donationBarView = r1
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r85)
            X.L7O r1 = new X.L7O
            r1.<init>(r0, r2)
            r0.endView = r1
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r85)
            X.Kcp r1 = new X.Kcp
            r1.<init>(r3, r0, r2)
            r0.headerView = r1
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r85)
            X.L9R r1 = new X.L9R
            r1.<init>(r0, r2)
            r0.hostModerationView = r1
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r85)
            X.L7P r1 = new X.L7P
            r1.<init>(r3, r0, r2)
            r0.inviteToJoinView = r1
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r85)
            X.Lja r1 = new X.Lja
            r1.<init>(r0, r2, r4)
            r0.layoutManagerView = r1
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r85)
            X.LGN r1 = new X.LGN
            r1.<init>(r3, r0, r2, r4)
            r0.likesView = r1
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r85)
            X.LEE r1 = new X.LEE
            r1.<init>(r3, r0, r2, r4)
            r0.mentionView = r1
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r85)
            X.LNA r1 = new X.LNA
            r1.<init>(r3, r0, r2)
            r0.nuxTutorialView = r1
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r85)
            X.LRB r1 = new X.LRB
            r1.<init>(r0, r2, r4)
            r0.optionsDialogView = r1
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r85)
            r12 = 2131434309(0x7f0b1b45, float:1.8490428E38)
            X.LEJ r2 = new X.LEJ
            r6 = r2
            r7 = r3
            r8 = r0
            r10 = r5
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.Kct r1 = r0.mediaButtonsView
            if (r1 == 0) goto L_0x042e
            X.0eM r1 = r1.A09
            android.view.View r1 = X.AnonymousClass7TH.A06(r1)
            if (r1 == 0) goto L_0x042e
            r2.A00 = r1
        L_0x042e:
            r0.overlayVisibilityView = r2
            android.view.View r5 = r0.requireView()
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r85)
            X.L9Q r1 = new X.L9Q
            r1.<init>(r5, r0, r2, r4)
            r0.scaleMediaView = r1
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r85)
            X.L5U r1 = new X.L5U
            r1.<init>(r0, r2)
            r0.ssiSheetView = r1
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r85)
            X.L5T r1 = new X.L5T
            r1.<init>(r3, r0, r2)
            r0.timeWarningView = r1
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r85)
            X.A96 r2 = r0.A02
            if (r2 == 0) goto L_0x02f2
            X.Llb r1 = new X.Llb
            r1.<init>(r0, r5, r2, r4)
            r0.faceFilterView = r1
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r85)
            r1 = r17
            X.0qQ.A0B(r2, r1)
            r4 = 36325686633378950(0x810e0500013486, double:3.0358487265237736E-306)
            r1 = r18
            boolean r1 = X.182.A06(r1, r2, r4)
            if (r1 == 0) goto L_0x0485
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r85)
            X.Lm4 r1 = new X.Lm4
            r1.<init>(r3, r0, r2)
            r0.drawingView = r1
        L_0x0485:
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r85)
            r1 = r17
            X.0qQ.A0B(r2, r1)
            r4 = 36325686633313413(0x810e0500003485, double:3.035848726482328E-306)
            r1 = r18
            boolean r1 = X.182.A06(r1, r2, r4)
            if (r1 == 0) goto L_0x04a6
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r85)
            X.Lm3 r1 = new X.Lm3
            r1.<init>(r3, r0, r2)
            r0.textStickersView = r1
        L_0x04a6:
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r85)
            r1 = r17
            X.0qQ.A0B(r2, r1)
            r1 = r18
            boolean r1 = X.182.A06(r1, r2, r4)
            if (r1 != 0) goto L_0x04c4
            r4 = 36325686633378950(0x810e0500013486, double:3.0358487265237736E-306)
            r1 = r18
            boolean r1 = X.182.A06(r1, r2, r4)
            if (r1 == 0) goto L_0x04e7
        L_0x04c4:
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r85)
            X.LlW r1 = new X.LlW
            r1.<init>(r3, r0, r2)
            r0.eyedropperColorPickerView = r1
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r85)
            X.A96 r4 = r0.A02
            if (r4 == 0) goto L_0x02f2
            X.Lm4 r3 = r0.drawingView
            X.Lm3 r2 = r0.textStickersView
            X.LB2 r1 = new X.LB2
            r5 = r1
            r6 = r0
            r8 = r4
            r9 = r3
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            r0.overlayBurnInView = r1
        L_0x04e7:
            X.KfY r6 = r0.A09
            if (r6 == 0) goto L_0x07f7
            X.Utx r5 = r0.A0B
            if (r5 == 0) goto L_0x0537
            r6.A0C = r5
            androidx.constraintlayout.widget.ConstraintLayout r1 = r5.A03
            int r0 = r1.getWidth()
            r6.A01 = r0
            int r0 = r1.getHeight()
            r6.A00 = r0
            android.content.Context r4 = r6.A05
            android.view.SurfaceView r0 = new android.view.SurfaceView
            r0.<init>(r4)
            X.L7B r3 = new X.L7B
            r3.<init>(r0)
            android.view.View r2 = r3.A01
            com.instagram.common.session.UserSession r0 = r6.A07
            java.lang.String r1 = r0.A06
            r0 = 2131965191(0x7f133507, float:1.9567185E38)
            java.lang.String r0 = r4.getString(r0)
            r5.A02(r2, r1, r0)
            X.LzK r2 = new X.LzK
            r2.<init>(r3, r5, r6)
            X.LWZ r1 = new X.LWZ
            r1.<init>(r2, r3)
            java.util.Map r0 = r3.A02
            X.0qQ.A06(r0)
            r0.put(r2, r1)
            android.view.SurfaceView r0 = r3.A00
            android.view.SurfaceHolder r0 = r0.getHolder()
            r0.addCallback(r1)
            return
        L_0x0537:
            X.0qQ.A0F(r20)
            goto L_0x07fa
        L_0x053c:
            X.0qQ.A0F(r22)
            goto L_0x07fa
        L_0x0541:
            java.lang.String r66 = ""
        L_0x0543:
            X.LEQ r1 = X.JTS.A0Z(r2, r0)
            X.0Ud r1 = r1.A0C
            java.lang.Object r1 = r1.getValue()
            X.LMa r1 = (X.C64082LMa) r1
            if (r1 == 0) goto L_0x0815
            java.lang.String r12 = r1.A02
        L_0x0553:
            X.LEQ r1 = X.JTS.A0Z(r2, r0)
            X.0Ud r1 = r1.A0C
            java.lang.Object r1 = r1.getValue()
            X.LMa r1 = (X.C64082LMa) r1
            if (r1 == 0) goto L_0x0812
            com.instagram.model.fundraiser.NewFundraiserInfo r11 = r1.A01
        L_0x0563:
            X.LEQ r1 = X.JTS.A0Z(r2, r0)
            X.0Ud r1 = r1.A0C
            java.lang.Object r1 = r1.getValue()
            X.LMa r1 = (X.C64082LMa) r1
            if (r1 == 0) goto L_0x0573
            com.instagram.model.fundraiser.FundraiserDisplayInfoModel r10 = r1.A00
        L_0x0573:
            X.LEQ r1 = X.JTS.A0Z(r2, r0)
            X.0Ud r1 = r1.A0E
            boolean r75 = X.JTR.A1a(r1)
            X.LEQ r1 = X.JTS.A0Z(r2, r0)
            X.0Ud r1 = r1.A0J
            java.lang.Object r8 = r1.getValue()
            java.lang.String r8 = (java.lang.String) r8
            X.LEQ r1 = X.JTS.A0Z(r2, r0)
            X.0Ud r1 = r1.A0D
            java.lang.Object r7 = r1.getValue()
            java.lang.String r7 = (java.lang.String) r7
            X.LEQ r1 = X.JTS.A0Z(r2, r0)
            X.0Ud r1 = r1.A0B
            java.lang.Object r6 = r1.getValue()
            java.util.List r6 = (java.util.List) r6
            X.LEQ r1 = X.JTS.A0Z(r2, r0)
            X.0Ud r1 = r1.A0A
            java.lang.Object r5 = r1.getValue()
            X.3NV r5 = (X.AnonymousClass3NV) r5
            X.LEQ r1 = X.JTS.A0Z(r2, r0)
            X.0Ud r1 = r1.A0H
            boolean r76 = X.JTR.A1a(r1)
            X.LGO r1 = r0.A03
            java.lang.String r28 = "supLiveDelegate"
            if (r1 == 0) goto L_0x080e
            boolean r77 = r1.A03()
            X.LEQ r1 = X.JTS.A0Z(r2, r0)
            X.0Ud r1 = r1.A0F
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            long r72 = X.DbY.A04(r1)
            X.LEQ r1 = X.JTS.A0Z(r2, r0)
            X.0Ud r1 = r1.A0I
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            X.LBN r58 = new X.LBN
            r62 = r58
            r63 = r10
            r64 = r11
            r65 = r5
            r67 = r12
            r68 = r8
            r69 = r7
            r70 = r1
            r71 = r6
            r62.<init>(r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r74, r75, r76, r77)
            X.7l3 r8 = r0.A01
            if (r8 == 0) goto L_0x02f2
            X.A96 r1 = r0.A02
            java.lang.String r27 = "liveMediaPipeline"
            if (r1 == 0) goto L_0x080a
            X.82X r11 = r1.A01
            X.0tS r6 = r31.A00()
            X.0s0 r7 = r6.A1N
            X.0YZ[] r5 = X.0tS.A4G
            r1 = 97
            boolean r62 = X.AnonymousClass7TG.A1a(r6, r7, r5, r1)
            X.Vl7 r10 = r0.A00
            X.LGO r7 = r0.A03
            if (r7 == 0) goto L_0x080e
            r1 = 24
            X.JK0 r6 = new X.JK0
            r6.<init>(r0, r1)
            r1 = 36
            X.MP8 r5 = new X.MP8
            r5.<init>(r0, r1)
            X.KfY r1 = new X.KfY
            r47 = r1
            r50 = r10
            r51 = r8
            r52 = r11
            r53 = r0
            r55 = r7
            r57 = r9
            r59 = r5
            r60 = r6
            r47.<init>(r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62)
            r0.A09 = r1
            androidx.fragment.app.FragmentActivity r48 = r0.requireActivity()
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r85)
            X.KfY r1 = r0.A09
            r26 = r1
            java.lang.String r19 = "liveStreamController"
            if (r1 == 0) goto L_0x07f7
            X.7l3 r1 = r0.A01
            r25 = r1
            if (r1 == 0) goto L_0x02f2
            X.LGO r1 = r0.A03
            r24 = r1
            if (r1 == 0) goto L_0x080e
            X.LEQ r1 = X.JTS.A0Z(r2, r0)
            X.0Ud r1 = r1.A0J
            java.lang.Object r6 = r1.getValue()
            java.lang.String r6 = (java.lang.String) r6
            X.LEQ r1 = X.JTS.A0Z(r2, r0)
            X.0Ud r1 = r1.A0B
            java.lang.Object r5 = r1.getValue()
            java.util.List r5 = (java.util.List) r5
            X.6hJ r1 = r0.A0C
            r23 = r1
            java.lang.String r22 = "questionViewModel"
            if (r1 == 0) goto L_0x053c
            X.6h0 r8 = X.C313776gz.A0K
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r85)
            X.6gz r20 = r8.A00(r1, r4)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r85)
            X.KbY r15 = X.C64139LPo.A01(r0, r1)
            r21 = 2
            r1 = r21
            X.AnonymousClass7TF.A1F(r7, r1, r5)
            r13 = 10
            r1 = r20
            X.0qQ.A0B(r1, r13)
            r14 = 11
            X.0qQ.A0B(r15, r14)
            X.KbY r9 = X.C64139LPo.A01(r0, r7)
            android.content.Context r1 = r48.getBaseContext()
            X.0qQ.A07(r1)
            X.M0X r56 = r9.A01(r1)
            X.KbY r10 = X.C64139LPo.A01(r0, r7)
            android.content.Context r12 = r48.getBaseContext()
            X.0qQ.A07(r12)
            X.LRP r1 = r10.A00
            if (r1 != 0) goto L_0x06c5
            com.instagram.common.session.UserSession r11 = r10.A01
            X.0iw r9 = r10.A00
            X.LRP r1 = new X.LRP
            r1.<init>(r12, r9, r11)
            r10.A00 = r1
        L_0x06c5:
            X.0tS r53 = r31.A00()
            X.1Av r54 = X.1Au.A00(r7)
            X.1Ng r51 = X.AnonymousClass1Nd.A00(r7)
            X.M0i r9 = new X.M0i
            r47 = r9
            r49 = r25
            r50 = r0
            r52 = r7
            r55 = r24
            r57 = r1
            r58 = r15
            r59 = r20
            r60 = r23
            r61 = r26
            r62 = r6
            r63 = r5
            r47.<init>(r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63)
            r0.A04 = r9
            com.instagram.common.session.UserSession r34 = X.AnonymousClass7TE.A0l(r85)
            X.0eE r5 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r85)
            com.instagram.user.model.User r35 = r5.A01(r1)
            X.6gd r10 = r0.A0F
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r85)
            X.6gz r38 = r8.A00(r1, r4)
            r33 = r0
            r36 = r10
            r37 = r4
            X.LGX r5 = X.C63489Kxt.A00(r33, r34, r35, r36, r37, r38)
            r0.A08 = r5
            java.lang.String r11 = "reactionsPresenter"
            X.L2n r1 = new X.L2n
            r1.<init>(r0)
            r5.A01 = r1
            androidx.fragment.app.FragmentActivity r34 = r0.requireActivity()
            r9 = r3
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            X.7l3 r8 = r0.A01
            if (r8 == 0) goto L_0x02f2
            X.LGX r7 = r0.A08
            if (r7 == 0) goto L_0x0806
            X.KfY r6 = r0.A09
            if (r6 == 0) goto L_0x07f7
            X.M0X r39 = X.C64139LPo.A00(r0)
            X.A96 r5 = r0.A02
            if (r5 == 0) goto L_0x080a
            com.instagram.common.session.UserSession r37 = X.AnonymousClass7TE.A0l(r85)
            X.MMb r42 = X.C66292MMb.A01(r0, r13)
            X.MMb r43 = X.C66292MMb.A01(r0, r14)
            X.LjZ r1 = new X.LjZ
            r33 = r1
            r35 = r9
            r36 = r8
            r38 = r5
            r40 = r7
            r41 = r6
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r0.A07 = r1
            X.M0i r1 = r0.A04
            java.lang.String r20 = "gridPreviewProvider"
            if (r1 == 0) goto L_0x0288
            com.instagram.common.session.UserSession r80 = X.AnonymousClass7TE.A0l(r85)
            X.LEQ r5 = X.JTS.A0Z(r2, r0)
            X.0Ud r5 = r5.A0A
            java.lang.Object r9 = r5.getValue()
            X.3NV r9 = (X.AnonymousClass3NV) r9
            java.lang.String r8 = r1.A0A
            X.LEQ r5 = X.JTS.A0Z(r2, r0)
            X.0Ud r5 = r5.A0I
            java.lang.Object r7 = r5.getValue()
            java.lang.String r7 = (java.lang.String) r7
            X.LGO r6 = r0.A03
            if (r6 == 0) goto L_0x080e
            X.LOO r5 = new X.LOO
            r76 = r5
            r77 = r3
            r79 = r0
            r81 = r6
            r82 = r9
            r83 = r8
            r84 = r7
            r76.<init>(r77, r78, r79, r80, r81, r82, r83, r84)
            r0.A06 = r5
            X.LEQ r5 = X.JTS.A0Z(r2, r0)
            X.0Ud r5 = r5.A0E
            boolean r5 = X.JTR.A1a(r5)
            if (r5 == 0) goto L_0x07be
            com.instagram.common.session.UserSession r37 = X.AnonymousClass7TE.A0l(r85)
            android.content.Context r34 = r0.requireContext()
            r6 = 37
            X.MP8 r5 = new X.MP8
            r5.<init>(r1, r6)
            X.LEK r46 = new X.LEK
            r33 = r46
            r35 = r3
            r36 = r0
            r38 = r4
            r39 = r5
            r33.<init>(r34, r35, r36, r37, r38, r39)
        L_0x07be:
            android.content.Context r34 = r0.requireContext()
            com.instagram.common.session.UserSession r36 = X.AnonymousClass7TE.A0l(r85)
            X.LEQ r5 = X.JTS.A0Z(r2, r0)
            X.0Ud r5 = r5.A0A
            java.lang.Object r6 = r5.getValue()
            r5 = r29
            boolean r51 = X.AnonymousClass7TF.A1W(r6, r5)
            X.LEQ r5 = X.JTS.A0Z(r2, r0)
            X.0Ud r5 = r5.A0A
            java.lang.Object r5 = r5.getValue()
            X.3NV r5 = (X.AnonymousClass3NV) r5
            X.LGO r15 = r0.A03
            if (r15 == 0) goto L_0x080e
            r6 = 27
            X.MIh r14 = new X.MIh
            r14.<init>(r0, r6)
            X.LGX r13 = r0.A08
            if (r13 == 0) goto L_0x0806
            X.LjZ r12 = r0.A07
            if (r12 != 0) goto L_0x07ff
            java.lang.String r19 = "captureController"
        L_0x07f7:
            X.0qQ.A0F(r19)
        L_0x07fa:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x07ff:
            X.LOO r11 = r0.A06
            if (r11 != 0) goto L_0x0170
            java.lang.String r19 = "endScreenController"
            goto L_0x07f7
        L_0x0806:
            X.0qQ.A0F(r11)
            goto L_0x07fa
        L_0x080a:
            X.0qQ.A0F(r27)
            goto L_0x07fa
        L_0x080e:
            X.0qQ.A0F(r28)
            goto L_0x07fa
        L_0x0812:
            r11 = r10
            goto L_0x0563
        L_0x0815:
            r12 = r10
            goto L_0x0553
        L_0x0818:
            java.lang.String r16 = "instance"
            goto L_0x02f2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K6W.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0013: MOVE  (r1v9 com.instagram.base.activity.BaseFragmentActivity) = (r1v0 com.instagram.base.activity.BaseFragmentActivity)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = -780746300(0xffffffffd176c1c4, float:-6.62383E10)
            int r5 = X.AnonymousClass0fD.A02(r0)
            X.K6W.super.onCreate(r9)
            androidx.fragment.app.FragmentActivity r1 = r8.requireActivity()
            boolean r0 = r1 instanceof com.instagram.base.activity.BaseFragmentActivity
            r7 = 0
            if (r0 == 0) goto L_0x001b
            com.instagram.base.activity.BaseFragmentActivity r1 = (com.instagram.base.activity.BaseFragmentActivity) r1
            if (r1 == 0) goto L_0x001b
            r0 = 0
            r1.A0l(r0)
        L_0x001b:
            androidx.fragment.app.FragmentActivity r1 = r8.requireActivity()
            boolean r0 = r1 instanceof com.instagram.base.activity.BaseFragmentActivity
            if (r0 == 0) goto L_0x002a
            com.instagram.base.activity.BaseFragmentActivity r1 = (com.instagram.base.activity.BaseFragmentActivity) r1
            if (r1 == 0) goto L_0x002a
            r0 = 1
            r1.A05 = r0
        L_0x002a:
            android.content.Context r4 = r8.requireContext()
            X.0eM r6 = r8.A0E
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r6)
            X.8Yd r0 = X.C357488Yc.A03
            X.LEQ r0 = X.JTS.A0Z(r0, r8)
            X.0Ud r0 = r0.A0G
            java.lang.String r2 = X.JTO.A11(r0)
            X.M0H r1 = new X.M0H
            r1.<init>(r8)
            X.A96 r0 = new X.A96
            r0.<init>(r4, r3, r1, r2)
            r8.A02 = r0
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r6)
            android.content.Context r0 = r8.getContext()
            if (r0 == 0) goto L_0x005a
            android.content.Context r7 = r0.getApplicationContext()
        L_0x005a:
            boolean r0 = X.C362988ir.A01(r7, r1)
            if (r0 == 0) goto L_0x007b
            X.1pd r0 = X.C362988ir.A00()
            X.VgJ r4 = X.1pd.A00(r0)
            android.content.Context r3 = r8.requireContext()
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r6)
            r0 = 3
            X.WdV r1 = new X.WdV
            r1.<init>(r8, r0)
            java.lang.String r0 = "IgLiveCaptureFragment"
            r4.A00(r3, r2, r1, r0)
        L_0x007b:
            android.content.Context r2 = r8.requireContext()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r6)
            java.lang.String r0 = "live_base"
            X.7l3 r4 = X.C340217kt.A00(r2, r1, r0)
            boolean r0 = r4 instanceof X.C340297l2
            if (r0 == 0) goto L_0x00b5
            r3 = r4
            X.7l2 r3 = (X.C340297l2) r3
            X.Vl7 r2 = r8.A00
            if (r2 == 0) goto L_0x00b5
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            X.Kcc r0 = X.LKG.A01(r0)
            X.0eM r0 = r0.A0F
            java.lang.Object r1 = r0.getValue()
            X.LR1 r1 = (X.LR1) r1
            r2.A0G = r1
            X.XBm r0 = r2.A0B
            r0.EVb(r1)
            X.C18078Vl7.A00(r2)
            X.Ldg r0 = new X.Ldg
            r0.<init>(r3, r8)
            r3.A04 = r0
        L_0x00b5:
            r8.A01 = r4
            r0 = 1658610346(0x62dc62aa, float:2.0326966E21)
            X.AnonymousClass0fD.A09(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K6W.onCreate(android.os.Bundle):void");
    }

    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1265071196);
        0qQ.A0B(layoutInflater, 0);
        View A092 = DbW.A09(layoutInflater, viewGroup, R.layout.layout_iglive_capture, false);
        AnonymousClass0fD.A09(-1286829562, A022);
        return A092;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0023: MOVE  (r1v6 com.instagram.base.activity.BaseFragmentActivity) = (r1v1 com.instagram.base.activity.BaseFragmentActivity)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onDestroy() {
        /*
            r6 = this;
            r0 = -941864863(0xffffffffc7dc4861, float:-112784.76)
            int r5 = X.AnonymousClass0fD.A02(r0)
            super.onDestroy()
            androidx.fragment.app.FragmentActivity r3 = r6.requireActivity()
            boolean r1 = r3 instanceof com.instagram.base.activity.BaseFragmentActivity
            r0 = 0
            if (r1 == 0) goto L_0x0066
            com.instagram.base.activity.BaseFragmentActivity r3 = (com.instagram.base.activity.BaseFragmentActivity) r3
        L_0x0015:
            r2 = 1
            if (r3 == 0) goto L_0x001b
            r3.A0l(r2)
        L_0x001b:
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            boolean r0 = r1 instanceof com.instagram.base.activity.BaseFragmentActivity
            if (r0 == 0) goto L_0x002a
            com.instagram.base.activity.BaseFragmentActivity r1 = (com.instagram.base.activity.BaseFragmentActivity) r1
            if (r1 == 0) goto L_0x002a
            r0 = 0
            r1.A05 = r0
        L_0x002a:
            X.Vl7 r0 = r6.A00
            if (r0 == 0) goto L_0x0039
            X.XBm r1 = r0.A0B
            boolean r0 = r1.isConnected()
            if (r0 != r2) goto L_0x0039
            r1.disconnect()
        L_0x0039:
            X.0eM r4 = r6.A0E
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r4)
            r3 = 0
            X.0qQ.A0B(r1, r3)
            X.6h0 r0 = X.C313776gz.A0K
            X.6go r2 = X.C313666go.BROADCASTER
            r0.A01(r1, r2)
            X.8Yd r1 = X.C357488Yc.A03
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            r1.A02(r0)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r4)
            X.0qQ.A0B(r1, r3)
            X.6gn r0 = X.C313646gm.A0A
            r0.A01(r1, r2)
            r0 = -286159300(0xffffffffeef18e3c, float:-3.737892E28)
            X.AnonymousClass0fD.A09(r0, r5)
            return
        L_0x0066:
            r3 = r0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K6W.onDestroy():void");
    }

    public final void onDestroyView() {
        String str;
        int A022 = AnonymousClass0fD.A02(-1039162592);
        super.onDestroyView();
        M0Y m0y = this.A05;
        if (m0y != null) {
            m0y.A0B.A02();
            LGX lgx = m0y.A0F;
            lgx.A01();
            LOO loo = m0y.A0D;
            new C61507KAm(loo).A02(new Void[0]);
            C65816M0i m0i = m0y.A0C;
            m0i.A06 = null;
            m0i.A07 = null;
            m0i.A08 = null;
            loo.A06 = null;
            C64873LjZ ljZ = m0y.A0E;
            ljZ.A00 = null;
            if (!m0i.A05.A01()) {
                m0i.A0X.A0J();
            }
            C62423KfY kfY = m0i.A0X;
            kfY.A02 = null;
            kfY.A0E = null;
            kfY.A0C();
            AnonymousClass1Nd.A00(m0i.A0R).A02(m0i.A0Q, C64622LfA.class);
            A96 a96 = ljZ.A06;
            a96.A00 = null;
            1Ng r2 = a96.A02;
            if (r2 != null) {
                r2.A02(a96.A03, C366888pq.class);
            }
            a96.A01.A03();
            lgx.A01 = null;
            lgx.A02 = true;
            m0y.A07.destroy();
        }
        this.A05 = null;
        this.A04 = null;
        Activity rootActivity = getRootActivity();
        0qQ.A0A(rootActivity);
        Window window = rootActivity.getWindow();
        0qQ.A07(window);
        2db.A07(this.mView, window, true);
        C239403Gi.A01(requireContext(), AnonymousClass7TE.A0l(this.A0E)).A02 = null;
        C18078Vl7 vl7 = this.A00;
        if (vl7 != null && vl7.A0J) {
            vl7.A08(false);
        }
        C18078Vl7 vl72 = this.A00;
        if (vl72 != null) {
            vl72.A07(__redex_internal_original_name);
        }
        C57105IOt iOt = this.capturePrepareView;
        if (iOt == null) {
            str = "capturePrepareView";
        } else {
            AnonymousClass7TH.A06(iOt.A0B).animate().cancel();
            ((C60249Ji6) iOt.A0C.getValue()).A00();
            C62265Kcz kcz = this.stateView;
            if (kcz == null) {
                str = "stateView";
            } else {
                kcz.A01();
                AnonymousClass0fD.A09(-629414804, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onPause() {
        M0Y m0y;
        String str;
        int A022 = AnonymousClass0fD.A02(2127614974);
        K6W.super.onPause();
        C18078Vl7 vl7 = this.A00;
        if ((vl7 == null || !vl7.A0B.isStreaming()) && (m0y = this.A05) != null) {
            C65816M0i m0i = m0y.A0C;
            if (m0i.A05 == C62635Kj6.CONNECTING) {
                m0i.A00();
                m0y.A0I.invoke(AnonymousClass7TE.A0u(), (Object) null);
            }
            C62423KfY kfY = m0i.A0X;
            kfY.A0a.A0F("onPause");
            kfY.A0O = true;
            if (kfY.A0K != AnonymousClass05K.A0N) {
                C62423KfY.A03((C21478XcN) null, kfY, AnonymousClass05K.A01, (String) null, true);
                C62423KfY.A08(kfY);
                C63937LDx lDx = kfY.A0d;
                lDx.A02.removeCallbacks(lDx.A04);
            }
            2MD.A01();
        }
        C262204Co r0 = this.A0A;
        if (r0 != null) {
            r0.AG7((CancellationException) null);
        }
        this.A0A = null;
        C62265Kcz kcz = this.stateView;
        if (kcz == null) {
            str = "stateView";
        } else {
            C60284Jig A002 = kcz.A00();
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
                C62246Kcg kcg = this.commentsView;
                if (kcg == null) {
                    str = "commentsView";
                } else {
                    kcg.A06();
                    LRB lrb = this.optionsDialogView;
                    if (lrb == null) {
                        str = "optionsDialogView";
                    } else {
                        C262204Co r03 = lrb.A00;
                        if (r03 != null) {
                            r03.AG7((CancellationException) null);
                        }
                        lrb.A00 = null;
                        AnonymousClass0fD.A09(-1828728549, A022);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onResume() {
        String str;
        C340297l2 r1;
        int A022 = AnonymousClass0fD.A02(-632880762);
        super.onResume();
        Activity rootActivity = getRootActivity();
        0qQ.A0A(rootActivity);
        Window window = rootActivity.getWindow();
        0qQ.A07(window);
        2db.A07(this.mView, window, false);
        M0Y m0y = this.A05;
        if (m0y != null) {
            C62423KfY kfY = m0y.A0C.A0X;
            kfY.A0a.A0F("onResume");
            kfY.A0O = false;
            if (kfY.A0K != AnonymousClass05K.A0N) {
                if (kfY.A0R) {
                    11Z.A02(new M8B(kfY.A0D, kfY));
                    kfY.A0R = false;
                } else if (kfY.A09 != null) {
                    C62423KfY.A07(kfY);
                }
                kfY.A0d.A00();
            }
            2MD.A01();
            M0Y.A02(m0y, true);
        }
        C18078Vl7 vl7 = this.A00;
        if (vl7 != null && vl7.A0B.isStreaming()) {
            C340307l3 r12 = this.A01;
            if (r12 == null) {
                str = "cameraDeviceController";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            } else if ((r12 instanceof C340297l2) && (r1 = (C340297l2) r12) != null) {
                r1.A0D();
                r1.A0P((C279284yO) null, "sup_media_stream");
                r1.EI4(true);
            }
        }
        0rm A11 = C51965G9l.A11();
        07U r6 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHL(viewLifecycleOwner, r6, A11, this, (AnonymousClass4D7) null, 36), AnonymousClass07a.A00(viewLifecycleOwner));
        C62265Kcz kcz = this.stateView;
        if (kcz == null) {
            str = "stateView";
        } else {
            C60284Jig.A00(kcz.A00());
            LGN lgn = this.likesView;
            if (lgn == null) {
                str = "likesView";
            } else {
                lgn.A01().A05();
                C62246Kcg kcg = this.commentsView;
                if (kcg == null) {
                    str = "commentsView";
                } else {
                    kcg.A07();
                    LRB lrb = this.optionsDialogView;
                    if (lrb == null) {
                        str = "optionsDialogView";
                    } else {
                        lrb.A02();
                        this.A0A = JTS.A0t(this, new C66186MGx(this, (AnonymousClass4D7) null, 40), C313776gz.A0K.A00(AnonymousClass7TE.A0l(this.A0E), C313666go.BROADCASTER).A03().A00);
                        AnonymousClass0fD.A09(257433397, A022);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onStart() {
        String str;
        int A022 = AnonymousClass0fD.A02(-2053450924);
        K6W.super.onStart();
        Activity rootActivity = getRootActivity();
        if (rootActivity instanceof AnonymousClass2ZP) {
            ((AnonymousClass2ZP) rootActivity).Enj(8);
        }
        M0Y m0y = this.A05;
        if (m0y != null) {
            C64873LjZ ljZ = m0y.A0E;
            ljZ.A05.DmJ(ljZ.A02);
            M0Y.A02(m0y, true);
        }
        C18078Vl7 vl7 = this.A00;
        if (vl7 != null && vl7.A0B.isStreaming()) {
            M0X A002 = C64139LPo.A00(this);
            M0X.A0A(A002, AnonymousClass05K.A0Q);
            A002.A04 = 1;
            1Ln A023 = M0X.A02(A002, AnonymousClass05K.A0S);
            A023.A0Q("sup_state", 1L);
            A023.Cgf();
        }
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
                C62266Kd0 kd0 = this.ufiView;
                if (kd0 == null) {
                    str = "ufiView";
                } else {
                    JTP.A18(kd0.A03, kd0.A05);
                    C65025Lm3 lm3 = this.textStickersView;
                    if (lm3 != null) {
                        JTP.A17(lm3.A05, lm3.A07);
                    }
                    AnonymousClass0fD.A09(604498711, A022);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onStop() {
        C340297l2 r1;
        String str;
        int A022 = AnonymousClass0fD.A02(-2080951857);
        K6W.super.onStop();
        Activity rootActivity = getRootActivity();
        if (rootActivity instanceof AnonymousClass2ZP) {
            ((AnonymousClass2ZP) rootActivity).Enj(0);
        }
        C18078Vl7 vl7 = this.A00;
        if (vl7 == null || !vl7.A0B.isStreaming()) {
            C340307l3 r12 = this.A01;
            if (r12 == null) {
                str = "cameraDeviceController";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            if ((r12 instanceof C340297l2) && (r1 = (C340297l2) r12) != null) {
                C340297l2.A05(C390989sA.A03, r1);
            }
            M0Y m0y = this.A05;
            if (m0y != null) {
                m0y.A0E.A05.onStop();
                M0Y.A02(m0y, false);
            }
        }
        C18078Vl7 vl72 = this.A00;
        if (vl72 != null) {
            vl72.A05(new UUj(vl72, 3), AnonymousClass000.A00(1863));
        }
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
                C62266Kd0 kd0 = this.ufiView;
                if (kd0 == null) {
                    str = "ufiView";
                } else {
                    kd0.A05.onStop();
                    C65025Lm3 lm3 = this.textStickersView;
                    if (lm3 != null) {
                        lm3.A07.onStop();
                    }
                    AnonymousClass0fD.A09(1488415532, A022);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
