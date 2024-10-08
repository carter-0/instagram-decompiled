package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.ui.text.ConstrainedEditText;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.8WF  reason: invalid class name */
public final class AnonymousClass8WF implements AnonymousClass8WG {
    public final View A00;
    public final UserSession A01;
    public final C355948Rz A02;
    public final AnonymousClass8BA A03;
    public final C352888Fl A04;
    public final AnonymousClass8FA A05;
    public final C3509286x A06;
    public final AnonymousClass80U A07;
    public final AnonymousClass88F A08;
    public final InteractiveDrawableContainer A09;
    public final boolean A0A;
    public final TouchInterceptorFrameLayout A0B;
    public final C3499582p A0C;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 == false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass8WF r3) {
        /*
            X.88F r0 = r3.A08
            r2 = 1
            if (r0 == 0) goto L_0x000c
            X.804 r0 = r0.A04
            boolean r1 = r0 instanceof X.C339987kV
            r0 = 1
            if (r1 != 0) goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r1 = r3.A0B
            if (r0 == 0) goto L_0x0023
            X.8Fl r0 = r3.A04
            X.87h r0 = r0.A1E
            X.8Jc r0 = r0.A00()
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L_0x0023
        L_0x001f:
            r1.setKeepObservingAfterRequestDisallowTouchEvent(r2)
            return
        L_0x0023:
            r2 = 0
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8WF.A00(X.8WF):void");
    }

    public final void A01() {
        C358368an r3 = (C358368an) ((AnonymousClass8ME) this.A03.A1g.get()).A1e.get();
        ConstrainedEditText constrainedEditText = r3.A1j;
        C294975nL.A05(new View[]{constrainedEditText}, false);
        constrainedEditText.setHint("");
        constrainedEditText.setOnTouchListener(r3.A05);
    }

    public AnonymousClass8WF(View view, UserSession userSession, TouchInterceptorFrameLayout touchInterceptorFrameLayout, C355948Rz r4, AnonymousClass8BA r5, C352888Fl r6, C3499582p r7, AnonymousClass8FA r8, C3509286x r9, AnonymousClass80U r10, AnonymousClass88F r11, InteractiveDrawableContainer interactiveDrawableContainer, boolean z) {
        this.A01 = userSession;
        this.A05 = r8;
        this.A04 = r6;
        this.A06 = r9;
        this.A0C = r7;
        interactiveDrawableContainer.getClass();
        this.A09 = interactiveDrawableContainer;
        this.A02 = r4;
        this.A03 = r5;
        this.A07 = r10;
        this.A0A = z;
        touchInterceptorFrameLayout.getClass();
        this.A0B = touchInterceptorFrameLayout;
        view.getClass();
        this.A00 = view;
        this.A08 = r11;
    }

    public final void DcW(AnonymousClass804 r2) {
        A00(this);
        this.A0C.A02.A01.A06 = r2;
    }
}
