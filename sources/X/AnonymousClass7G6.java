package X;

import android.view.View;

/* renamed from: X.7G6  reason: invalid class name */
public final class AnonymousClass7G6 implements AnonymousClass7G7 {
    public final /* synthetic */ AnonymousClass7EZ A00;
    public final /* synthetic */ C328217Dy A01;

    public AnonymousClass7G6(AnonymousClass7EZ r1, C328217Dy r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void E0W(float f, float f2) {
        if (!(this.A01 instanceof C66816Md2)) {
            f = 0.0f;
        }
        float f3 = f + f2;
        AnonymousClass7EZ r1 = this.A00;
        r1.A0M.BJd().setTranslationX(f3);
        View view = r1.A00;
        if (view != null) {
            view.setTranslationX(f3);
        }
        AnonymousClass7EL r0 = r1.A04;
        if (r0 != null) {
            r0.A01(f3);
        }
    }
}
