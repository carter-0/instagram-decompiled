package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;

/* renamed from: X.4Fb  reason: invalid class name and case insensitive filesystem */
public final class C262584Fb extends C2364333s {
    public final Context A00;
    public final Fragment A01;
    public final AnonymousClass4DU A02;
    public final AnonymousClass0eM A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final UserSession A08;
    public final AnonymousClass3D1 A09;
    public final boolean A0A;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C262584Fb(android.content.Context r5, androidx.fragment.app.Fragment r6, com.instagram.common.session.UserSession r7, X.AnonymousClass4DU r8, boolean r9, boolean r10, boolean r11, boolean r12, boolean r13) {
        /*
            r4 = this;
            r0 = 1
            X.0qQ.A0B(r5, r0)
            r0 = 9
            X.0qQ.A0B(r6, r0)
            if (r11 == 0) goto L_0x0067
            X.33u r0 = X.C2364533u.A00
        L_0x000d:
            X.33v r0 = (X.C2364633v) r0
            r2 = 0
            r4.<init>(r0)
            r4.A00 = r5
            r4.A04 = r9
            r4.A02 = r8
            r4.A08 = r7
            r4.A06 = r10
            r4.A0A = r12
            r4.A05 = r13
            r4.A01 = r6
            r1 = 18
            X.9LP r0 = new X.9LP
            r0.<init>(r4, r1)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r4.A03 = r0
            X.0Tu r3 = X.0Tu.A05
            r0 = 36327151217752261(0x810f5a000938c5, double:3.0367749355788634E-306)
            boolean r0 = X.182.A06(r3, r7, r0)
            if (r0 == 0) goto L_0x0065
            r0 = 37
            X.9Kt r1 = new X.9Kt
            r1.<init>(r7, r0)
            java.lang.Class<X.3D1> r0 = X.AnonymousClass3D1.class
            java.lang.Object r0 = r7.A01(r0, r1)
            X.3D1 r0 = (X.AnonymousClass3D1) r0
        L_0x004c:
            r4.A09 = r0
            if (r13 != 0) goto L_0x0061
            if (r0 != 0) goto L_0x0061
            if (r10 != 0) goto L_0x0061
            if (r12 != 0) goto L_0x0061
            r0 = 36327151217621187(0x810f5a000738c3, double:3.0367749354959717E-306)
            boolean r0 = X.182.A06(r3, r7, r0)
            if (r0 == 0) goto L_0x0062
        L_0x0061:
            r2 = 1
        L_0x0062:
            r4.A07 = r2
            return
        L_0x0065:
            r0 = 0
            goto L_0x004c
        L_0x0067:
            X.4Fc r0 = X.C262594Fc.A00
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C262584Fb.<init>(android.content.Context, androidx.fragment.app.Fragment, com.instagram.common.session.UserSession, X.4DU, boolean, boolean, boolean, boolean, boolean):void");
    }

    public final void A06(C286575Wy r18, C247453gM r19, int i) {
        int i2;
        C247453gM r4 = r19;
        0qQ.A0B(r4, 0);
        C286575Wy r8 = r18;
        r8.ExV(-932055365);
        int i3 = i;
        if ((i & 6) == 0) {
            int i4 = 2;
            if (r8.AGw(r4)) {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            int i5 = 16;
            if (r8.AGw(this)) {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i2 & 19) != 18 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1106409053, "com.instagram.feed.adapter.row.ufi.MediaUfiComposeBinder.UfiRoot (MediaUfiComposeBinder.kt:154)");
            }
            String A0R = 002.A0R("UfiRoot:", r4.A07.A00.getId());
            if (Systrace.A0E(1)) {
                0fS.A01(A0R, 1669748721);
            }
            try {
                AnonymousClass4DU r0 = this.A02;
                String moduleName = r0.getModuleName();
                C286885Ye.A03(r8, this.A08, moduleName, AnonymousClass5PI.A01(r8, new C377449Lw(5, r4, this), -1577631772), 196608, 4, false, r0.isOrganicEligible(), r0.isSponsoredEligible());
                if (0fL.A02()) {
                    0fL.A00(125765537);
                }
            } finally {
                if (Systrace.A0E(1)) {
                    0fS.A00(-1275381967);
                }
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JGO(i3, 19, (Object) this, (Object) r4);
        }
    }

    public final void A05(View view) {
        0sL r1;
        if (this.A06) {
            if (Systrace.A0E(1)) {
                0fS.A01("deactivate", 1273343754);
            }
            try {
                GWO gwo = (GWO) view;
                0fg.A01("MetaComposeView:deactivate", 1047942157);
                if (gwo.A03 && (r1 = (0sL) gwo.A0B.getValue()) != null) {
                    GWO.A03(gwo, r1, false);
                }
                if (!Systrace.A0E(1)) {
                }
            } catch (Throwable th) {
                if (Systrace.A0E(1)) {
                }
                throw th;
            } finally {
                0fg.A00(-1439313569);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0054: MOVE  (r1v6 androidx.activity.ComponentActivity) = (r1v5 androidx.activity.ComponentActivity)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final android.view.ViewGroup A04(android.content.Context r8) {
        /*
            r7 = this;
            r0 = -265903098(0xfffffffff026a406, float:-2.0629122E29)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r4 = 0
            X.0qQ.A0B(r8, r4)
            r5 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)
            if (r0 == 0) goto L_0x001b
            r1 = 408716308(0x185c8414, float:2.8501016E-24)
            java.lang.String r0 = "newView"
            X.0fS.A01(r0, r1)
        L_0x001b:
            boolean r0 = r7.A07     // Catch:{ all -> 0x0102 }
            if (r0 == 0) goto L_0x00e9
            X.3D1 r0 = r7.A09     // Catch:{ all -> 0x0102 }
            if (r0 == 0) goto L_0x0035
            X.0eM r0 = r0.A01     // Catch:{ all -> 0x0102 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0102 }
            X.OYc r0 = (X.OYc) r0     // Catch:{ all -> 0x0102 }
            X.01W r0 = r0.A00     // Catch:{ all -> 0x0102 }
            java.lang.Object r3 = r0.A0S()     // Catch:{ all -> 0x0102 }
            X.GWO r3 = (X.GWO) r3     // Catch:{ all -> 0x0102 }
            if (r3 != 0) goto L_0x00d1
        L_0x0035:
            java.lang.String r1 = "createMetaComposeView"
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)     // Catch:{ all -> 0x0102 }
            if (r0 == 0) goto L_0x0043
            r0 = 8659760(0x842330, float:1.2134908E-38)
            X.0fS.A01(r1, r0)     // Catch:{ all -> 0x0102 }
        L_0x0043:
            X.GWO r3 = new X.GWO     // Catch:{ all -> 0x00b1 }
            r3.<init>(r8)     // Catch:{ all -> 0x00b1 }
            boolean r0 = r7.A0A     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x00c5
            android.app.Activity r1 = X.C70782Va.A00(r8)     // Catch:{ all -> 0x00b1 }
            boolean r0 = r1 instanceof androidx.activity.ComponentActivity     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x00c5
            androidx.activity.ComponentActivity r1 = (androidx.activity.ComponentActivity) r1     // Catch:{ all -> 0x00b1 }
            if (r1 == 0) goto L_0x00c5
            boolean r0 = r3.isAttachedToWindow()     // Catch:{ all -> 0x00b1 }
            if (r0 != 0) goto L_0x00c5
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r1.findViewById(r0)     // Catch:{ all -> 0x00b1 }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ all -> 0x00b1 }
            android.view.View r1 = r0.getChildAt(r4)     // Catch:{ all -> 0x00b1 }
            X.0qQ.A0A(r1)     // Catch:{ all -> 0x00b1 }
            X.5PL r0 = X.AnonymousClass5PK.A00(r1)     // Catch:{ all -> 0x00b1 }
            if (r0 != 0) goto L_0x0078
            androidx.compose.runtime.Recomposer r0 = X.AnonymousClass5PK.A02(r1)     // Catch:{ all -> 0x00b1 }
        L_0x0078:
            r3.setParentCompositionContext(r0)     // Catch:{ all -> 0x00b1 }
            java.lang.String r1 = "prepareAndroidComposeView"
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x0089
            r0 = -1703698937(0xffffffff9a739e07, float:-5.0378876E-23)
            X.0fS.A01(r1, r0)     // Catch:{ all -> 0x00b1 }
        L_0x0089:
            X.5PL r0 = X.GWO.A00(r3)     // Catch:{ all -> 0x009d }
            r3.A07(r0)     // Catch:{ all -> 0x009d }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x00c5
            r0 = -506004640(0xffffffffe1d6fb60, float:-4.957146E20)
            X.0fS.A00(r0)     // Catch:{ all -> 0x00b1 }
            goto L_0x00c5
        L_0x009d:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x00aa
            r0 = -422905301(0xffffffffe6cafa2b, float:-4.792664E23)
            X.0fS.A00(r0)     // Catch:{ all -> 0x00b1 }
        L_0x00aa:
            r0 = 1212778161(0x484986b1, float:206362.77)
            X.AnonymousClass0fD.A0A(r0, r2)     // Catch:{ all -> 0x00b1 }
            throw r1     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)     // Catch:{ all -> 0x0102 }
            if (r0 == 0) goto L_0x00be
            r0 = -1586901598(0xffffffffa169cda2, float:-7.9215623E-19)
            X.0fS.A00(r0)     // Catch:{ all -> 0x0102 }
        L_0x00be:
            r0 = 1375240688(0x51f881f0, float:1.33416485E11)
            X.AnonymousClass0fD.A0A(r0, r2)     // Catch:{ all -> 0x0102 }
            throw r1     // Catch:{ all -> 0x0102 }
        L_0x00c5:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)     // Catch:{ all -> 0x0102 }
            if (r0 == 0) goto L_0x00d1
            r0 = -490515054(0xffffffffe2c35592, float:-1.8016405E21)
            X.0fS.A00(r0)     // Catch:{ all -> 0x0102 }
        L_0x00d1:
            boolean r0 = r7.A05     // Catch:{ all -> 0x0102 }
            if (r0 == 0) goto L_0x00ef
            X.0eM r0 = r7.A03     // Catch:{ all -> 0x0102 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x0102 }
            android.view.Window r1 = (android.view.Window) r1     // Catch:{ all -> 0x0102 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x0102 }
            X.IHi r0 = new X.IHi     // Catch:{ all -> 0x0102 }
            r0.<init>(r1)     // Catch:{ all -> 0x0102 }
            r3.setViewCompositionStrategy(r0)     // Catch:{ all -> 0x0102 }
            goto L_0x00ef
        L_0x00e9:
            androidx.compose.ui.platform.ComposeView r3 = new androidx.compose.ui.platform.ComposeView     // Catch:{ all -> 0x0102 }
            r0 = 0
            r3.<init>(r8, r0, r4)     // Catch:{ all -> 0x0102 }
        L_0x00ef:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)
            if (r0 == 0) goto L_0x00fb
            r0 = -1246280189(0xffffffffb5b74603, float:-1.3654939E-6)
            X.0fS.A00(r0)
        L_0x00fb:
            r0 = 1830592044(0x6d1c9e2c, float:3.02943E27)
            X.AnonymousClass0fD.A0A(r0, r2)
            return r3
        L_0x0102:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)
            if (r0 == 0) goto L_0x010f
            r0 = -1412052892(0xffffffffabd5c864, float:-1.519018E-12)
            X.0fS.A00(r0)
        L_0x010f:
            r0 = -940012999(0xffffffffc7f88a39, float:-127252.445)
            X.AnonymousClass0fD.A0A(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C262584Fb.A04(android.content.Context):android.view.ViewGroup");
    }
}
