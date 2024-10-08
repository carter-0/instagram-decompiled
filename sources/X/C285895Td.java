package X;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Deprecated;

@Deprecated(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
/* renamed from: X.5Td  reason: invalid class name and case insensitive filesystem */
public final class C285895Td implements C285905Te {
    public C286145Uc A00 = C286145Uc.A06;
    public C285975Tl A01 = new C285975Tl("", C285965Tk.A01);
    public Runnable A02;
    public List A03 = new ArrayList();
    public 0sP A04 = C285945Ti.A00;
    public 0sP A05 = C285955Tj.A00;
    public boolean A06;
    public Rect A07;
    public final View A08;
    public final C285045Pl A09;
    public final C286165Ue A0A;
    public final C285925Tg A0B;
    public final Executor A0C;
    public final AnonymousClass0eM A0D = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9L8(this, 39));

    public final void Ex5(C286145Uc r2, C285975Tl r3, 0sP r4, 0sP r5) {
        this.A06 = true;
        this.A01 = r3;
        this.A00 = r2;
        this.A04 = r4;
        this.A05 = r5;
        A00(C286185Ug.StartInput);
    }

    public final void EyE() {
        this.A06 = false;
        this.A04 = C41676AyT.A00;
        this.A05 = C41677AyU.A00;
        this.A07 = null;
        A00(C286185Ug.StopInput);
    }

    public C285895Td(View view, C268134cp r7) {
        C285915Tf r4 = new C285915Tf(view);
        C285935Th r0 = new C285935Th(Choreographer.getInstance());
        this.A08 = view;
        this.A0B = r4;
        this.A0C = r0;
        this.A0A = new C286165Ue(r7, r4);
        this.A09 = new C285045Pl(new C286185Ug[16]);
    }

    private final void A00(C286185Ug r3) {
        this.A09.A09(r3);
        if (this.A02 == null) {
            C57700If3 if3 = new C57700If3(this);
            this.A0C.execute(if3);
            this.A02 = if3;
        }
    }

    public static final void A01(C285895Td r2) {
        C285915Tf r22 = (C285915Tf) r2.A0B;
        ((InputMethodManager) r22.A02.getValue()).restartInput(r22.A00);
    }

    public final void CLp() {
        A00(C286185Ug.HideKeyboard);
    }

    @Deprecated(message = "This method should not be called, used BringIntoViewRequester instead.")
    public final void Crs(AnonymousClass5VN r6) {
        Rect rect;
        this.A07 = new Rect(AnonymousClass1GB.A01(r6.A01), AnonymousClass1GB.A01(r6.A03), AnonymousClass1GB.A01(r6.A02), AnonymousClass1GB.A01(r6.A00));
        if (this.A03.isEmpty() && (rect = this.A07) != null) {
            this.A08.requestRectangleOnScreen(new Rect(rect));
        }
    }

    public final void EvH() {
        A00(C286185Ug.ShowKeyboard);
    }

    public final void Ex4() {
        A00(C286185Ug.StartInput);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (X.0qQ.A0K(r6.A02, r14.A02) == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FLd(X.C285975Tl r13, X.C285975Tl r14) {
        /*
            r12 = this;
            X.5Tl r6 = r12.A01
            long r4 = r6.A00
            long r2 = r14.A00
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x000c
            r0 = 1
        L_0x000c:
            r5 = 0
            if (r0 == 0) goto L_0x001a
            X.5Tk r1 = r6.A02
            X.5Tk r0 = r14.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            r8 = 0
            if (r0 != 0) goto L_0x001b
        L_0x001a:
            r8 = 1
        L_0x001b:
            r12.A01 = r14
            java.util.List r4 = r12.A03
            int r6 = r4.size()
            r1 = 0
        L_0x0024:
            if (r1 >= r6) goto L_0x0039
            java.lang.Object r0 = r4.get(r1)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r0 = r0.get()
            X.IE7 r0 = (X.IE7) r0
            if (r0 == 0) goto L_0x0036
            r0.A02 = r14
        L_0x0036:
            int r1 = r1 + 1
            goto L_0x0024
        L_0x0039:
            X.5Ue r7 = r12.A0A
            java.lang.Object r6 = r7.A0C
            monitor-enter(r6)
            r1 = 0
            r7.A04 = r1     // Catch:{ all -> 0x010c }
            r7.A03 = r1     // Catch:{ all -> 0x010c }
            r7.A02 = r1     // Catch:{ all -> 0x010c }
            X.AyS r0 = X.C41675AyS.A00     // Catch:{ all -> 0x010c }
            r7.A05 = r0     // Catch:{ all -> 0x010c }
            r7.A01 = r1     // Catch:{ all -> 0x010c }
            r7.A00 = r1     // Catch:{ all -> 0x010c }
            monitor-exit(r6)
            boolean r0 = X.0qQ.A0K(r13, r14)
            if (r0 == 0) goto L_0x0083
            if (r8 == 0) goto L_0x0080
            X.5Tg r4 = r12.A0B
            int r5 = X.C285965Tk.A01(r2)
            int r6 = X.C285965Tk.A00(r2)
            X.5Tl r0 = r12.A01
            X.5Tk r0 = r0.A02
            r8 = -1
            if (r0 == 0) goto L_0x0081
            long r0 = r0.A00
            int r7 = X.C285965Tk.A01(r0)
            int r8 = X.C285965Tk.A00(r0)
        L_0x0071:
            X.5Tf r4 = (X.C285915Tf) r4
            X.0eM r0 = r4.A02
            java.lang.Object r3 = r0.getValue()
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            android.view.View r4 = r4.A00
            r3.updateSelection(r4, r5, r6, r7, r8)
        L_0x0080:
            return
        L_0x0081:
            r7 = -1
            goto L_0x0071
        L_0x0083:
            if (r13 == 0) goto L_0x00a7
            X.5Tq r0 = r13.A01
            java.lang.String r1 = r0.A00
            X.5Tq r0 = r14.A01
            java.lang.String r0 = r0.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00a3
            long r0 = r13.A00
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x00a7
            X.5Tk r1 = r13.A02
            X.5Tk r0 = r14.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00a7
        L_0x00a3:
            A01(r12)
            return
        L_0x00a7:
            int r2 = r4.size()
        L_0x00ab:
            if (r5 >= r2) goto L_0x0080
            java.lang.Object r0 = r4.get(r5)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r1 = r0.get()
            X.IE7 r1 = (X.IE7) r1
            if (r1 == 0) goto L_0x0107
            X.5Tl r8 = r12.A01
            X.5Tg r3 = r12.A0B
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0107
            r1.A02 = r8
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x00df
            int r9 = r1.A01
            android.view.inputmethod.ExtractedText r7 = X.C54754HRm.A00(r8)
            r6 = r3
            X.5Tf r6 = (X.C285915Tf) r6
            X.0eM r0 = r6.A02
            java.lang.Object r1 = r0.getValue()
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            android.view.View r0 = r6.A00
            r1.updateExtractedText(r0, r9, r7)
        L_0x00df:
            X.5Tk r0 = r8.A02
            r11 = -1
            if (r0 == 0) goto L_0x010a
            long r0 = r0.A00
            int r10 = X.C285965Tk.A01(r0)
            int r11 = X.C285965Tk.A00(r0)
        L_0x00ee:
            long r0 = r8.A00
            int r8 = X.C285965Tk.A01(r0)
            int r9 = X.C285965Tk.A00(r0)
            X.5Tf r3 = (X.C285915Tf) r3
            X.0eM r0 = r3.A02
            java.lang.Object r6 = r0.getValue()
            android.view.inputmethod.InputMethodManager r6 = (android.view.inputmethod.InputMethodManager) r6
            android.view.View r7 = r3.A00
            r6.updateSelection(r7, r8, r9, r10, r11)
        L_0x0107:
            int r5 = r5 + 1
            goto L_0x00ab
        L_0x010a:
            r10 = -1
            goto L_0x00ee
        L_0x010c:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C285895Td.FLd(X.5Tl, X.5Tl):void");
    }

    public final void FLn(AnonymousClass5VN r4, AnonymousClass5VN r5, C3022462f r6, JS3 js3, C285975Tl r8, 0sP r9) {
        C286165Ue r2 = this.A0A;
        synchronized (r2.A0C) {
            r2.A04 = r8;
            r2.A03 = js3;
            r2.A02 = r6;
            r2.A05 = r9;
            r2.A01 = r4;
            r2.A00 = r5;
            if (r2.A06 || r2.A0B) {
                C286165Ue.A00(r2);
            }
        }
    }
}
