package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.GeV  reason: case insensitive filesystem */
public final class C52895GeV extends C267794cD implements View.OnAttachStateChangeListener, AnonymousClass5VG, ViewTreeObserver.OnGlobalFocusChangeListener {
    public View A00;

    public final void AC1(AnonymousClass5Wa r3) {
        r3.EQj(false);
        r3.EVU(new C58142In8(this, 1));
        r3.EVe(new C58142In8(this, 2));
    }

    private final C268794e0 A00() {
        C267794cD r1 = this.A03;
        if (!r1.A08) {
            I2E.A01(C273654mx.A00(1012));
            throw AnonymousClass00P.createAndThrow();
        }
        if ((r1.A00 & 1024) != 0) {
            boolean z = false;
            for (C267794cD r8 = r1.A02; r8 != null; r8 = r8.A02) {
                if ((r8.A01 & 1024) != 0) {
                    C267794cD r5 = r8;
                    C285045Pl r4 = null;
                    do {
                        if (r5 instanceof C268794e0) {
                            C268794e0 r52 = (C268794e0) r5;
                            if (z) {
                                return r52;
                            }
                            z = true;
                        } else if ((r5.A01 & 1024) != 0 && (r5 instanceof C267944cV)) {
                            int i = 0;
                            for (C267794cD r2 = ((C267944cV) r5).A00; r2 != null; r2 = r2.A02) {
                                if ((r2.A01 & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        r5 = r2;
                                    } else {
                                        r4 = C51973G9u.A0C(r4);
                                        if (r5 != null) {
                                            r4.A09(r5);
                                            r5 = null;
                                        }
                                        r4.A09(r2);
                                    }
                                }
                            }
                            if (i == 1) {
                                continue;
                            }
                        }
                        r5 = AnonymousClass5WH.A00(r4);
                        continue;
                    } while (r5 != null);
                }
            }
        }
        throw AnonymousClass7TE.A0z("Could not find focus target of embedded view wrapper");
    }

    public final void A0E() {
        C56173Hu2.A01(this).addOnAttachStateChangeListener(this);
    }

    public final void A0F() {
        C56173Hu2.A01(this).removeOnAttachStateChangeListener(this);
        this.A00 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        if (r0 != false) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0080 A[EDGE_INSN: B:49:0x0080->B:33:0x0080 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onGlobalFocusChanged(android.view.View r9, android.view.View r10) {
        /*
            r8 = this;
            X.5R6 r0 = X.AnonymousClass5WH.A02(r8)
            X.4co r0 = r0.A0A
            if (r0 == 0) goto L_0x004a
            android.view.View r7 = X.C56173Hu2.A01(r8)
            X.4co r0 = X.AnonymousClass5WH.A05(r8)
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            X.5QZ r4 = r0.A0S
            X.4co r6 = X.AnonymousClass5WH.A05(r8)
            r3 = 1
            r5 = 0
            if (r9 == 0) goto L_0x0087
            boolean r0 = r9.equals(r6)
            if (r0 != 0) goto L_0x0087
            android.view.ViewParent r1 = r9.getParent()
        L_0x0026:
            if (r1 == 0) goto L_0x0087
            android.view.ViewParent r0 = r7.getParent()
            if (r1 != r0) goto L_0x0082
            r2 = 1
        L_0x002f:
            if (r10 == 0) goto L_0x0080
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L_0x0080
            android.view.ViewParent r1 = r10.getParent()
        L_0x003b:
            if (r1 == 0) goto L_0x0080
            android.view.ViewParent r0 = r7.getParent()
            if (r1 != r0) goto L_0x007b
            r0 = 1
        L_0x0044:
            if (r2 == 0) goto L_0x004b
            if (r0 == 0) goto L_0x0062
        L_0x0048:
            r8.A00 = r10
        L_0x004a:
            return
        L_0x004b:
            if (r0 == 0) goto L_0x0062
            r8.A00 = r10
            X.4e0 r2 = r8.A00()
            X.5cg r0 = r2.A0I()
            boolean r0 = r0.BBB()
            if (r0 != 0) goto L_0x004a
            X.5QY r4 = (X.AnonymousClass5QY) r4
            X.5Qd r1 = r4.A04
            goto L_0x0089
        L_0x0062:
            r10 = 0
            if (r2 == 0) goto L_0x0048
            r8.A00 = r10
            X.4e0 r0 = r8.A00()
            X.5cg r0 = r0.A0I()
            boolean r0 = r0.CTr()
            if (r0 == 0) goto L_0x004a
            r0 = 8
            r4.AHe(r0, r5, r3, r5)
            return
        L_0x007b:
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x003b
        L_0x0080:
            r0 = 0
            goto L_0x0044
        L_0x0082:
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x0026
        L_0x0087:
            r2 = 0
            goto L_0x002f
        L_0x0089:
            boolean r0 = r1.A00     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x0090
            X.C285195Qd.A00(r1)     // Catch:{ all -> 0x0099 }
        L_0x0090:
            r1.A00 = r3     // Catch:{ all -> 0x0099 }
            X.C56664I6t.A04(r2)     // Catch:{ all -> 0x0099 }
            X.C285195Qd.A01(r1)
            return
        L_0x0099:
            r0 = move-exception
            X.C285195Qd.A01(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52895GeV.onGlobalFocusChanged(android.view.View, android.view.View):void");
    }

    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
    }

    public final void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }
}
