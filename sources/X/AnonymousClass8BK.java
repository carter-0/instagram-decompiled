package X;

import android.view.View;
import com.instagram.ui.widget.drawing.FloatingIndicator;

/* renamed from: X.8BK  reason: invalid class name */
public final class AnonymousClass8BK implements AnonymousClass8BL {
    public final /* synthetic */ AnonymousClass8BA A00;

    public AnonymousClass8BK(AnonymousClass8BA r1) {
        this.A00 = r1;
    }

    public final void D4X(AnonymousClass8BU r4, int i, int i2) {
        AnonymousClass8BA r2 = this.A00;
        if (r2.A0D == r2.A1j.get()) {
            AnonymousClass8BA.A0A(r2, r4, i2);
        } else {
            AnonymousClass8BA.A09(r2, r4.A00, i, true);
        }
        FloatingIndicator floatingIndicator = r2.A1r;
        floatingIndicator.getClass();
        floatingIndicator.A00();
    }

    public final void D4Y(int i, float f, float f2) {
        AnonymousClass8BA r2 = this.A00;
        AnonymousClass8BA.A09(r2, i, 2, false);
        FloatingIndicator floatingIndicator = r2.A1r;
        floatingIndicator.getClass();
        float f3 = f2 - r2.A0l;
        float f4 = r2.A0m;
        float f5 = f;
        floatingIndicator.A01(f5, f2, f, f3, f4, i, 1, 500, true);
    }

    public final void DIC(boolean z, int i) {
        if (!z) {
            AnonymousClass8ME r1 = (AnonymousClass8ME) this.A00.A1g.get();
            27p.A01(r1.A0r).A1I(r1.A13(), i, 2);
        }
        AnonymousClass8BA r12 = this.A00;
        r12.A17.A00.requestDisallowInterceptTouchEvent(z);
        AnonymousClass8O4 r13 = (AnonymousClass8O4) r12.A1c.get();
        if (AnonymousClass8O4.A08(r13)) {
            View[] viewArr = {r13.A0M};
            if (z) {
                C315596kB.A08(viewArr, true);
                return;
            }
            C71392co r0 = C315596kB.A02;
            C294975nL.A04((C295005nO) null, viewArr, true);
        }
    }
}
