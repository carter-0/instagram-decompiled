package X;

import android.graphics.Rect;
import java.util.concurrent.CancellationException;

/* renamed from: X.Gb9  reason: case insensitive filesystem */
public final class C52697Gb9 implements C285905Te {
    public JLL A00;
    public C56884IGf A01;
    public C262204Co A02;
    public 0V2 A03;

    private final void A01(0sP r11) {
        JLL jll = this.A00;
        if (jll != null) {
            1Er r5 = null;
            MHG mhg = new MHG((AnonymousClass4D7) null, (Object) this, (Object) jll, (Object) r11, 4);
            C267794cD r7 = (C267794cD) jll;
            if (r7.A08) {
                C262224Cq A05 = r7.A05();
                r5 = 1Eo.A03(AnonymousClass05K.A0N, 19B.A00, new MH2((Object) r7, (Object) mhg, (AnonymousClass4D7) null, 16), A05);
            }
            this.A02 = r5;
        }
    }

    public final void Ex4() {
        A01((0sP) null);
    }

    public final void Ex5(C286145Uc r7, C285975Tl r8, 0sP r9, 0sP r10) {
        A01(new C58790Ixb(2, r8, r9, r10, r7, this));
    }

    public static final 0V2 A00(C52697Gb9 gb9) {
        0V2 r0 = gb9.A03;
        if (r0 != null) {
            return r0;
        }
        if (!C55296HfP.A00) {
            return null;
        }
        05D A012 = 10D.A01(AnonymousClass05K.A0C, 1, 0);
        gb9.A03 = A012;
        return A012;
    }

    public final void A02(JLL jll) {
        if (this.A00 == jll) {
            this.A00 = null;
            return;
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Expected textInputModifierNode to be ");
        A1A.append(jll);
        A1A.append(C273654mx.A00(431));
        throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0i(this.A00, A1A));
    }

    public final void CLp() {
        JLL jll = this.A00;
        if (jll != null) {
            C286225Uk r0 = (C286225Uk) C288795cU.A00(AnonymousClass5YA.A0A, (C52698GbA) jll);
            if (r0 != null) {
                r0.hide();
            }
        }
    }

    public final void Crs(AnonymousClass5VN r7) {
        Rect rect;
        C56884IGf iGf = this.A01;
        if (iGf != null) {
            iGf.A00 = new Rect(AnonymousClass1GB.A01(r7.A01), AnonymousClass1GB.A01(r7.A03), AnonymousClass1GB.A01(r7.A02), AnonymousClass1GB.A01(r7.A00));
            if (iGf.A06.isEmpty() && (rect = iGf.A00) != null) {
                iGf.A09.requestRectangleOnScreen(new Rect(rect));
            }
        }
    }

    public final void EvH() {
        JLL jll = this.A00;
        if (jll != null) {
            C286225Uk r0 = (C286225Uk) C288795cU.A00(AnonymousClass5YA.A0A, (C52698GbA) jll);
            if (r0 != null) {
                r0.show();
            }
        }
    }

    public final void EyE() {
        C262204Co r1 = this.A02;
        if (r1 != null) {
            r1.AG7((CancellationException) null);
        }
        this.A02 = null;
        0V2 A002 = A00(this);
        if (A002 != null) {
            A002.EID();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (X.0qQ.A0K(r7.A02, r15.A02) == false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FLd(X.C285975Tl r14, X.C285975Tl r15) {
        /*
            r13 = this;
            X.IGf r4 = r13.A01
            if (r4 == 0) goto L_0x0084
            X.5Tl r7 = r4.A05
            long r0 = r7.A00
            long r2 = r15.A00
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1Q(r5)
            r6 = 0
            if (r0 == 0) goto L_0x001e
            X.5Tk r1 = r7.A02
            X.5Tk r0 = r15.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            r8 = 0
            if (r0 != 0) goto L_0x001f
        L_0x001e:
            r8 = 1
        L_0x001f:
            r4.A05 = r15
            java.util.List r5 = r4.A06
            int r7 = r5.size()
            r1 = 0
        L_0x0028:
            if (r1 >= r7) goto L_0x003d
            java.lang.Object r0 = r5.get(r1)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r0 = r0.get()
            X.IE8 r0 = (X.IE8) r0
            if (r0 == 0) goto L_0x003a
            r0.A02 = r15
        L_0x003a:
            int r1 = r1 + 1
            goto L_0x0028
        L_0x003d:
            X.I0D r7 = r4.A0B
            java.lang.Object r1 = r7.A0B
            monitor-enter(r1)
            r0 = 0
            r7.A04 = r0     // Catch:{ all -> 0x004e }
            r7.A03 = r0     // Catch:{ all -> 0x004e }
            r7.A02 = r0     // Catch:{ all -> 0x004e }
            r7.A01 = r0     // Catch:{ all -> 0x004e }
            r7.A00 = r0     // Catch:{ all -> 0x004e }
            goto L_0x0051
        L_0x004e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0051:
            monitor-exit(r1)
            boolean r0 = X.0qQ.A0K(r14, r15)
            if (r0 == 0) goto L_0x0087
            if (r8 == 0) goto L_0x0084
            X.MRM r5 = r4.A0A
            int r6 = X.C285965Tk.A01(r2)
            int r7 = X.C285965Tk.A00(r2)
            X.5Tl r0 = r4.A05
            X.5Tk r0 = r0.A02
            r9 = -1
            if (r0 == 0) goto L_0x0085
            long r0 = r0.A00
            int r8 = X.C285965Tk.A01(r0)
            int r9 = X.C285965Tk.A00(r0)
        L_0x0075:
            X.IFb r5 = (X.C56854IFb) r5
            X.0eM r0 = r5.A01
            java.lang.Object r4 = r0.getValue()
            android.view.inputmethod.InputMethodManager r4 = (android.view.inputmethod.InputMethodManager) r4
            android.view.View r5 = r5.A00
            r4.updateSelection(r5, r6, r7, r8, r9)
        L_0x0084:
            return
        L_0x0085:
            r8 = -1
            goto L_0x0075
        L_0x0087:
            if (r14 == 0) goto L_0x00b9
            X.5Tq r0 = r14.A01
            java.lang.String r1 = r0.A00
            X.5Tq r0 = r15.A01
            java.lang.String r0 = r0.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00a7
            long r0 = r14.A00
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x00b9
            X.5Tk r1 = r14.A02
            X.5Tk r0 = r15.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00b9
        L_0x00a7:
            X.MRM r2 = r4.A0A
            X.IFb r2 = (X.C56854IFb) r2
            X.0eM r0 = r2.A01
            java.lang.Object r1 = r0.getValue()
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            android.view.View r0 = r2.A00
            r1.restartInput(r0)
            return
        L_0x00b9:
            int r2 = r5.size()
        L_0x00bd:
            if (r6 >= r2) goto L_0x0084
            java.lang.Object r0 = r5.get(r6)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r1 = r0.get()
            X.IE8 r1 = (X.IE8) r1
            if (r1 == 0) goto L_0x0119
            X.5Tl r8 = r4.A05
            X.MRM r3 = r4.A0A
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0119
            r1.A02 = r8
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x00f1
            int r10 = r1.A01
            android.view.inputmethod.ExtractedText r9 = X.C51976G9y.A09(r8)
            r7 = r3
            X.IFb r7 = (X.C56854IFb) r7
            X.0eM r0 = r7.A01
            java.lang.Object r1 = r0.getValue()
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            android.view.View r0 = r7.A00
            r1.updateExtractedText(r0, r10, r9)
        L_0x00f1:
            X.5Tk r0 = r8.A02
            r12 = -1
            if (r0 == 0) goto L_0x011c
            long r0 = r0.A00
            int r11 = X.C285965Tk.A01(r0)
            int r12 = X.C285965Tk.A00(r0)
        L_0x0100:
            long r0 = r8.A00
            int r9 = X.C285965Tk.A01(r0)
            int r10 = X.C285965Tk.A00(r0)
            X.IFb r3 = (X.C56854IFb) r3
            X.0eM r0 = r3.A01
            java.lang.Object r7 = r0.getValue()
            android.view.inputmethod.InputMethodManager r7 = (android.view.inputmethod.InputMethodManager) r7
            android.view.View r8 = r3.A00
            r7.updateSelection(r8, r9, r10, r11, r12)
        L_0x0119:
            int r6 = r6 + 1
            goto L_0x00bd
        L_0x011c:
            r11 = -1
            goto L_0x0100
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52697Gb9.FLd(X.5Tl, X.5Tl):void");
    }

    public final void FLn(AnonymousClass5VN r4, AnonymousClass5VN r5, C3022462f r6, JS3 js3, C285975Tl r8, 0sP r9) {
        C56884IGf iGf = this.A01;
        if (iGf != null) {
            I0D i0d = iGf.A0B;
            synchronized (i0d.A0B) {
                i0d.A04 = r8;
                i0d.A03 = js3;
                i0d.A02 = r6;
                i0d.A01 = r4;
                i0d.A00 = r5;
                if (i0d.A05 || i0d.A0A) {
                    I0D.A00(i0d);
                }
            }
        }
    }
}
