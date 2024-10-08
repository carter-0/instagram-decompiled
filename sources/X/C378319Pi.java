package X;

import android.graphics.RectF;
import android.view.View;

/* renamed from: X.9Pi  reason: invalid class name and case insensitive filesystem */
public final class C378319Pi implements Runnable {
    public final /* synthetic */ RectF A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ AnonymousClass8WJ A02;
    public final /* synthetic */ C295005nO A03;

    public C378319Pi(RectF rectF, View view, AnonymousClass8WJ r3, C295005nO r4) {
        this.A02 = r3;
        this.A01 = view;
        this.A00 = rectF;
        this.A03 = r4;
    }

    public final void run() {
        View view;
        AnonymousClass8WJ r9 = this.A02;
        boolean z = r9.A0F;
        if (z) {
            view = r9.A0B;
        } else {
            view = this.A01;
        }
        C71392co r0 = C315596kB.A02;
        C294975nL A012 = C294975nL.A01(view, 0);
        A012.A0G();
        boolean z2 = r9.A0H;
        RectF rectF = this.A00;
        if (!z2) {
            float width = rectF.width();
            float f = (float) r9.A06;
            float f2 = width / f;
            float centerX = rectF.centerX();
            float centerY = rectF.centerY();
            float f3 = f / 2.0f;
            float f4 = ((float) r9.A05) / 2.0f;
            A012.A0U(f2, 1.0f, f3);
            A012.A0V(f2, 1.0f, f4);
            A012.A0S(centerX - f3, 0.0f);
            A012.A0T(centerY - f4, 0.0f);
        } else {
            A012.A0U(0.0f, 1.0f, rectF.centerX());
            A012.A0V(0.0f, 1.0f, rectF.centerY());
        }
        if (z) {
            A012.A06 = new AgC(r9, 0);
        }
        A012.A04 = 0;
        C294975nL A0A = A012.A0E(C59681JTn.A00).A0A();
        A0A.A05 = this.A03;
        A0A.A0H();
        this.A01.setVisibility(0);
    }
}
