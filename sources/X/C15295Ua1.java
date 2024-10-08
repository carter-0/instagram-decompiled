package X;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Iterator;

/* renamed from: X.Ua1  reason: case insensitive filesystem */
public final class C15295Ua1 extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "CanvasFragment";
    public int A00;
    public C15697Uh3 A01;
    public C11377SQo A02;
    public C15696Uh2 A03;
    public Reel A04;
    public SpinnerImageView A05;
    public String A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public int A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F = true;
    public boolean A0G;
    public final AnonymousClass0eM A0H = C227642jf.A02(this);

    public static final void A00(C15295Ua1 ua1, boolean z) {
        C15295Ua1 ua12 = ua1;
        SpinnerImageView spinnerImageView = ua1.A05;
        if (spinnerImageView == null) {
            0qQ.A0F("spinnerImageView");
            throw AnonymousClass00P.createAndThrow();
        }
        DbS.A1T(spinnerImageView);
        String str = ua1.A06;
        if (str != null) {
            DisplayMetrics A0H2 = 0nA.A0H(ua1.requireContext());
            String str2 = ua1.A0C;
            UserSession A0l = AnonymousClass7TE.A0l(ua1.A0H);
            0qQ.A0B(A0l, 3);
            new C17918Vi9(ua12, A0l, ua1.A0D, str2, str, A0H2.heightPixels, A0H2.widthPixels, z).A00();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        bundle.putBoolean("CanvasFragment.IS_FIRST_LOAD", this.A0F);
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0113, code lost:
        if (r4.A0F == false) goto L_0x0115;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0147  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r20, android.os.Bundle r21) {
        /*
            r19 = this;
            r5 = 0
            r1 = r20
            X.0qQ.A0B(r1, r5)
            r4 = r19
            r0 = r21
            super.onViewCreated(r1, r0)
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x0134
            X.Uh2 r13 = r4.A03
            if (r13 == 0) goto L_0x0134
            android.view.View r2 = r13.A03
            java.lang.String r1 = "Required value was null."
            if (r2 == 0) goto L_0x0159
            X.WXB r0 = new X.WXB
            r0.<init>(r2)
            r13.A05 = r0
            r2.setTag(r0)
            X.VrV r12 = r13.A0F
            X.WXB r6 = r13.A05
            if (r6 == 0) goto L_0x0153
            X.1Xj r11 = r13.A0H
            X.3W1 r9 = r13.A0I
            X.0qQ.A0B(r11, r5)
            boolean r0 = r11.CeS()
            if (r0 == 0) goto L_0x0130
            X.2uK r0 = r13.A06
            if (r0 == 0) goto L_0x014d
            X.1Xj r0 = r0.A0G()
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0130
            X.3da r17 = X.C245853da.SHOW
        L_0x0048:
            X.2uK r0 = r13.A06
            if (r0 == 0) goto L_0x0147
            X.3TO r10 = r0.A0I(r11)
            com.instagram.common.session.UserSession r14 = r13.A0G
            r1 = 1
            r0 = 3
            X.DbW.A1N(r9, r0, r10)
            r8 = 6
            X.0qQ.A0B(r14, r8)
            r6.A00 = r9
            X.3TS r7 = r6.A02
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r0 = r7.A01()
            r9.A0S(r0)
            com.instagram.ui.widget.framelayout.MediaFrameLayout r3 = r6.A06
            float r0 = r11.A0l()
            r3.A00 = r0
            com.instagram.feed.widget.IgProgressImageView r2 = r6.A04
            X.2s5 r0 = X.C18426VrV.A01
            r2.setPostProcessor(r0)
            X.3gz r0 = new X.3gz
            r0.<init>()
            r2.setProgressiveImageConfig(r0)
            r2.setEnableProgressBar(r1)
            r1 = 2131435565(0x7f0b202d, float:1.8492976E38)
            X.WXH r0 = new X.WXH
            r0.<init>(r13, r5)
            r2.A0A(r0, r1)
            X.3fS r1 = r12.A00
            if (r1 != 0) goto L_0x0096
            X.3fS r1 = new X.3fS
            r1.<init>(r14)
            r12.A00 = r1
        L_0x0096:
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r2)
            X.3fX r0 = r1.A00(r0, r11)
            X.C247843h0.A00(r13, r0, r2)
            com.instagram.ui.mediaactions.MediaActionsView r1 = r6.A05
            X.4Jd r12 = new X.4Jd
            r12.<init>(r14)
            java.lang.String r0 = r13.A0J
            X.9IB r0 = r12.A00(r11, r0)
            X.AnonymousClass4Je.A00(r0, r9, r2, r1, r10)
            boolean r2 = r11.A6W(r14)
            r1 = 0
            X.9IQ r0 = new X.9IQ
            r0.<init>((java.lang.Integer) r1, (int) r8, (boolean) r2)
            X.C250563lf.A0f(r0, r7, r9)
            X.3V4 r0 = r6.A03
            X.WXC r15 = new X.WXC
            r15.<init>(r13, r6)
            r18 = r5
            r16 = r0
            X.AnonymousClass4Jq.A01(r13, r14, r15, r16, r17, r18)
            r0 = 66
            X.WBH.A01(r3, r0, r13, r6)
            r2 = 200(0xc8, double:9.9E-322)
        L_0x00d3:
            boolean r0 = r4.A0E
            java.lang.String r7 = "controller"
            if (r0 == 0) goto L_0x00f7
            X.Uh3 r6 = r4.A01
            if (r6 == 0) goto L_0x013b
            X.WGq r0 = r6.A0H
            java.util.List r0 = r0.A07
            r0.add(r6)
            android.view.View r1 = r6.A00
            java.lang.String r0 = "canvasContainer"
            if (r1 == 0) goto L_0x0137
            r1.setVisibility(r5)
            android.view.View r1 = r6.A00
            if (r1 == 0) goto L_0x0137
            int r0 = r6.A0E
            float r0 = (float) r0
            r1.setTranslationY(r0)
        L_0x00f7:
            boolean r0 = r4.A0E
            if (r0 == 0) goto L_0x011a
            boolean r0 = r4.A0F
            if (r0 == 0) goto L_0x011a
            android.os.Handler r1 = new android.os.Handler
            r1.<init>()
            X.Wj4 r0 = new X.Wj4
            r0.<init>(r4)
            r1.postDelayed(r0, r2)
        L_0x010c:
            boolean r0 = r4.A0G
            if (r0 == 0) goto L_0x0115
            boolean r1 = r4.A0F
            r0 = 1
            if (r1 != 0) goto L_0x0116
        L_0x0115:
            r0 = 0
        L_0x0116:
            A00(r4, r0)
            return
        L_0x011a:
            X.Uh3 r3 = r4.A01
            if (r3 == 0) goto L_0x013b
            android.view.View r2 = r3.A00
            java.lang.String r1 = "canvasContainer"
            if (r2 == 0) goto L_0x013f
            r0 = 0
            r2.setTranslationY(r0)
            android.view.View r0 = r3.A00
            if (r0 == 0) goto L_0x013f
            r0.setVisibility(r5)
            goto L_0x010c
        L_0x0130:
            X.3da r17 = X.C245853da.HIDDEN
            goto L_0x0048
        L_0x0134:
            r2 = 0
            goto L_0x00d3
        L_0x0137:
            X.0qQ.A0F(r0)
            goto L_0x0142
        L_0x013b:
            X.0qQ.A0F(r7)
            goto L_0x0142
        L_0x013f:
            X.0qQ.A0F(r1)
        L_0x0142:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0147:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x014d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0153:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0159:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15295Ua1.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void A01() {
        String str;
        if (!this.A0E || this.A08) {
            A02();
            return;
        }
        C15697Uh3 uh3 = this.A01;
        if (uh3 == null) {
            str = "controller";
        } else {
            View view = uh3.A00;
            if (view == null) {
                str = "canvasContainer";
            } else {
                C15697Uh3.A01(uh3, view.getTranslationY(), 0.0f);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A02() {
        ViewGroup viewGroup;
        C15697Uh3 uh3 = this.A01;
        if (uh3 == null) {
            0qQ.A0F("controller");
            throw AnonymousClass00P.createAndThrow();
        }
        uh3.A03();
        C11377SQo sQo = this.A02;
        if (!(sQo == null || (viewGroup = sQo.A01) == null || viewGroup.getChildCount() == 0)) {
            long now = sQo.A04.now() - sQo.A00;
            boolean z = true;
            Iterator A0u = AnonymousClass7TF.A0u(sQo.A05);
            while (A0u.hasNext()) {
                if (((C17331VRk) C51971G9r.A0p(A0u)).A00 == AnonymousClass05K.A00) {
                    z = false;
                }
            }
            C12914TDd tDd = new C12914TDd(sQo);
            if (now > 12000 || z) {
                tDd.run();
            } else {
                sQo.A03.postDelayed(tDd, 12000 - now);
            }
        }
        if (this.A08) {
            DbT.A1K(this);
            return;
        }
        Activity parent = requireActivity().getParent();
        if (parent instanceof AnonymousClass2ZP) {
            ((AnonymousClass2ZP) parent).Enj(0);
        }
        if (isAdded()) {
            DbT.A1I(this);
        }
    }

    public final String getModuleName() {
        String str = this.A0B;
        if (str != null) {
            return str;
        }
        0qQ.A0F("_moduleName");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0H);
    }

    public final boolean onBackPressed() {
        A01();
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: X.5pf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: X.4gz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: X.4gz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: X.4gz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: X.4gz} */
    /* JADX WARNING: type inference failed for: r0v19 */
    /* JADX WARNING: type inference failed for: r24v2, types: [X.5pf] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0133, code lost:
        if (r1 != null) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0145, code lost:
        if (X.C16535Uwf.A04 == X.C16535Uwf.A01.get(r8)) goto L_0x0147;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r35) {
        /*
            r34 = this;
            r0 = -2044215473(0xffffffff8627bf4f, float:-3.154976E-35)
            int r4 = X.AnonymousClass0fD.A02(r0)
            r12 = r34
            r5 = r35
            X.C15295Ua1.super.onCreate(r5)
            android.os.Bundle r7 = r12.requireArguments()
            r0 = 58
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.String r0 = r7.getString(r0)
            r12.A06 = r0
            r0 = 450(0x1c2, float:6.3E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.String r3 = r7.getString(r0)
            r9 = 1
            r0 = 0
            if (r3 == 0) goto L_0x00df
            int r1 = r3.length()
            if (r1 == 0) goto L_0x00df
            java.lang.String r1 = "canvas_"
            java.lang.String r1 = X.002.A0R(r1, r3)
        L_0x0038:
            r12.A0B = r1
            r1 = 451(0x1c3, float:6.32E-43)
            java.lang.String r1 = X.Pxd.A00(r1)
            boolean r22 = r7.getBoolean(r1)
            r1 = 499(0x1f3, float:6.99E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            java.lang.String r27 = r7.getString(r1)
            r1 = 449(0x1c1, float:6.29E-43)
            java.lang.String r1 = X.Pxd.A00(r1)
            java.lang.String r1 = r7.getString(r1)
            r12.A07 = r1
            r1 = 500(0x1f4, float:7.0E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            int r1 = r7.getInt(r1)
            r12.A00 = r1
            r1 = 456(0x1c8, float:6.39E-43)
            java.lang.String r1 = X.Pxd.A00(r1)
            java.lang.String r28 = r7.getString(r1)
            r1 = 455(0x1c7, float:6.38E-43)
            java.lang.String r1 = X.Pxd.A00(r1)
            int r30 = r7.getInt(r1)
            r1 = 453(0x1c5, float:6.35E-43)
            java.lang.String r1 = X.Pxd.A00(r1)
            java.util.ArrayList r2 = r7.getStringArrayList(r1)
            r1 = 454(0x1c6, float:6.36E-43)
            java.lang.String r1 = X.Pxd.A00(r1)
            java.lang.String r6 = r7.getString(r1)
            if (r6 == 0) goto L_0x0098
            X.0eM r1 = r12.A0H
            com.instagram.model.reels.Reel r1 = X.C13991Tnr.A0S(r6, r1)
            r12.A04 = r1
        L_0x0098:
            r1 = 57
            java.lang.String r1 = X.Pxd.A00(r1)
            boolean r1 = r7.getBoolean(r1)
            r12.A0E = r1
            r1 = 884(0x374, float:1.239E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r1 = r7.getBoolean(r1, r0)
            r12.A0G = r1
            r1 = 2138(0x85a, float:2.996E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r1 = r7.getBoolean(r1, r0)
            r12.A08 = r1
            r1 = 452(0x1c4, float:6.33E-43)
            java.lang.String r1 = X.Pxd.A00(r1)
            int r1 = r7.getInt(r1)
            r12.A0A = r1
            if (r35 == 0) goto L_0x00d2
            java.lang.String r1 = "CanvasFragment.IS_FIRST_LOAD"
            boolean r1 = r5.getBoolean(r1)
            r12.A0F = r1
        L_0x00d2:
            r1 = 445(0x1bd, float:6.24E-43)
            java.lang.String r1 = X.Pxd.A00(r1)
            java.lang.String r10 = r7.getString(r1)
            if (r10 == 0) goto L_0x0106
            goto L_0x00e3
        L_0x00df:
            java.lang.String r1 = "canvas"
            goto L_0x0038
        L_0x00e3:
            java.lang.String r6 = r12.A06     // Catch:{ Exception -> 0x0106 }
            if (r6 == 0) goto L_0x0106
            X.VzD r8 = X.C18734VzD.A04     // Catch:{ Exception -> 0x0106 }
            java.lang.Class<X.6nB> r5 = X.C317386nB.class
            X.5tH r1 = new X.5tH     // Catch:{ Exception -> 0x0106 }
            r1.<init>(r5, r9)     // Catch:{ Exception -> 0x0106 }
            X.1XR r5 = r1.A00(r10)     // Catch:{ Exception -> 0x0106 }
            X.6L1 r5 = (X.AnonymousClass6L1) r5     // Catch:{ Exception -> 0x0106 }
            X.0qQ.A0B(r5, r9)     // Catch:{ Exception -> 0x0106 }
            java.lang.String r1 = r5.A01     // Catch:{ Exception -> 0x0106 }
            if (r1 == 0) goto L_0x0106
            X.VZX r1 = r5.A00     // Catch:{ Exception -> 0x0106 }
            if (r1 == 0) goto L_0x0106
            android.util.LruCache r1 = r8.A01     // Catch:{ Exception -> 0x0106 }
            r1.put(r6, r5)     // Catch:{ Exception -> 0x0106 }
        L_0x0106:
            X.0eM r10 = r12.A0H
            X.1E8 r5 = X.DbX.A0d(r10)
            java.lang.String r1 = r12.A07
            X.1Xj r1 = r5.A02(r1)
            com.instagram.model.reels.Reel r5 = r12.A04
            r15 = 0
            if (r5 == 0) goto L_0x0203
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r10)
            com.instagram.model.reels.Reel r6 = r12.A04
            if (r6 == 0) goto L_0x0217
            int r5 = r12.A00
            X.1OP r11 = X.1OP.$redex_init_class
            X.0qQ.A0B(r8, r0)
            X.5pf r0 = new X.5pf
            r24 = r0
            r25 = r8
            r26 = r6
            r29 = r5
            r24.<init>(r25, r26, r27, r28, r29, r30)
        L_0x0133:
            if (r1 == 0) goto L_0x0200
        L_0x0135:
            X.1Xy r5 = r1.A0C
            java.lang.String r8 = r5.Aoh()
            if (r8 == 0) goto L_0x0200
            X.Uwf r6 = X.C16535Uwf.GRID_TEMPLATE
            java.util.Map r5 = X.C16535Uwf.A01
            java.lang.Object r5 = r5.get(r8)
            if (r6 != r5) goto L_0x0200
        L_0x0147:
            r12.A09 = r9
            if (r1 == 0) goto L_0x01fe
            if (r9 == 0) goto L_0x01fe
            boolean r5 = r1.A5H()
            if (r5 == 0) goto L_0x01fb
            X.1Xj r8 = r1.A1b()
        L_0x0157:
            int r5 = X.JTT.A06(r12)
            float r6 = (float) r5
            float r5 = r8.A0l()
            float r6 = r6 / r5
            int r5 = (int) r6
            r6 = 446(0x1be, float:6.25E-43)
            java.lang.String r6 = X.Pxd.A00(r6)
            int r32 = r7.getInt(r6)
            r6 = 448(0x1c0, float:6.28E-43)
            java.lang.String r6 = X.Pxd.A00(r6)
            int[] r6 = r7.getIntArray(r6)
            if (r6 != 0) goto L_0x017e
            r6 = 2
            int[] r6 = new int[r6]
            r6 = {0, 0} // fill-array
        L_0x017e:
            r8 = 447(0x1bf, float:6.26E-43)
            java.lang.String r8 = X.Pxd.A00(r8)
            int[] r30 = r7.getIntArray(r8)
            com.instagram.common.session.UserSession r25 = X.AnonymousClass7TE.A0l(r10)
            X.Uh2 r7 = new X.Uh2
            r23 = r7
            r24 = r12
            r26 = r1
            r27 = r3
            r29 = r6
            r31 = r5
            r33 = r22
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r12.A03 = r7
            r12.registerLifecycleListener(r7)
        L_0x01a4:
            android.content.Context r7 = r12.requireContext()
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r10)
            X.6aT r14 = new X.6aT
            r14.<init>(r7, r12, r6)
            boolean r7 = r12.A09
            X.Uh2 r6 = r12.A03
            if (r6 == 0) goto L_0x01b8
            r15 = r6
        L_0x01b8:
            int r6 = r12.A0A
            X.Uh3 r11 = new X.Uh3
            r13 = r12
            r19 = r2
            r20 = r5
            r21 = r6
            r23 = r7
            r18 = r3
            r17 = r1
            r16 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r12.A01 = r11
            r12.registerLifecycleListener(r11)
            if (r1 == 0) goto L_0x01e9
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r10)
            java.lang.String r0 = X.C231122qu.A07(r0, r1)
            r12.A0C = r0
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r10)
            java.lang.String r0 = X.C231122qu.A0F(r0, r1)
            r12.A0D = r0
        L_0x01e9:
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r10)
            X.SQo r0 = new X.SQo
            r0.<init>(r1, r2)
            r12.A02 = r0
            r0 = 231100043(0xdc64e8b, float:1.2221601E-30)
            X.AnonymousClass0fD.A09(r0, r4)
            return
        L_0x01fb:
            r8 = r1
            goto L_0x0157
        L_0x01fe:
            r5 = 0
            goto L_0x01a4
        L_0x0200:
            r9 = 0
            goto L_0x0147
        L_0x0203:
            java.lang.String r0 = r12.A07
            if (r0 == 0) goto L_0x0214
            if (r1 == 0) goto L_0x0214
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r10)
            X.4jb r0 = new X.4jb
            r0.<init>(r5, r1)
            goto L_0x0135
        L_0x0214:
            r0 = r15
            goto L_0x0133
        L_0x0217:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -2104414796(0xffffffff82912db4, float:-2.1332067E-37)
            X.AnonymousClass0fD.A09(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15295Ua1.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(949854318);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_canvas, viewGroup, false);
        SpinnerImageView spinnerImageView = (SpinnerImageView) inflate.requireViewById(R.id.empty_state_view_loading_spinner);
        this.A05 = spinnerImageView;
        if (spinnerImageView == null) {
            0qQ.A0F("spinnerImageView");
            throw AnonymousClass00P.createAndThrow();
        }
        WB8.A00(spinnerImageView, 14, this);
        if (this.A09) {
            inflate.requireViewById(R.id.canvas_container).setBackgroundColor(0);
            WB8.A00(DbY.A0F(inflate, R.id.canvas_back_button_stub), 15, this);
        }
        AnonymousClass0fD.A09(-246971156, A022);
        return inflate;
    }

    public final void onDestroyView() {
        C15696Uh2 uh2;
        int A022 = AnonymousClass0fD.A02(-1955960843);
        super.onDestroyView();
        C15697Uh3 uh3 = this.A01;
        if (uh3 == null) {
            0qQ.A0F("controller");
            throw AnonymousClass00P.createAndThrow();
        }
        uh3.A03();
        if (this.A09 && (uh2 = this.A03) != null) {
            uh2.onDestroyView();
        }
        AnonymousClass0fD.A09(-1429063235, A022);
    }

    public final void onResume() {
        Window window;
        int A022 = AnonymousClass0fD.A02(-937050999);
        super.onResume();
        Activity rootActivity = getRootActivity();
        if (rootActivity == null || (window = rootActivity.getWindow()) == null) {
            IllegalStateException A0y = AnonymousClass7TE.A0y();
            AnonymousClass0fD.A09(1168601583, A022);
            throw A0y;
        }
        2db.A07(window.getDecorView(), window, false);
        Activity parent = requireActivity().getParent();
        if (parent instanceof AnonymousClass2ZP) {
            ((AnonymousClass2ZP) parent).Enj(8);
        }
        if (this.A0F) {
            this.A0F = false;
        }
        AnonymousClass0fD.A09(-1202536811, A022);
    }
}
