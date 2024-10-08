package X;

import android.view.View;

/* renamed from: X.FSq  reason: case insensitive filesystem */
public final class C50184FSq implements C252203oj {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C319656qy A02;
    public final /* synthetic */ C62320sa A03;

    public final void DmB(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public C50184FSq(C319656qy r1, C62320sa r2, float f, int i) {
        this.A02 = r1;
        this.A00 = f;
        this.A01 = i;
        this.A03 = r2;
    }

    public final void DmC(2cs r6) {
        Double valueOf;
        if (r6 != null && (valueOf = Double.valueOf(r6.A09.A00)) != null && valueOf.doubleValue() == 0.0d) {
            this.A03.invoke();
        }
    }

    public final void DmE(2cs r14) {
        View view;
        C319656qy r10 = this.A02;
        float f = (float) ((2cs) r10.A02.getValue()).A09.A00;
        float f2 = this.A00;
        int i = this.A01;
        View view2 = r10.A00;
        if (view2 != null && (view = r10.A01) != null) {
            float f3 = 1.0f - 0.0f;
            float f4 = f2 - 0.0f;
            float f5 = 0.0f;
            if (f3 != 0.0f) {
                f5 = (f - 0.0f) / f3;
            }
            float f6 = (f5 * f4) + 0.0f;
            float f7 = 0.5f - 1.0f;
            float f8 = 0.0f;
            if (f3 != 0.0f) {
                f8 = (f - 0.0f) / f3;
            }
            float f9 = (f8 * f7) + 1.0f;
            view.setScaleX(f9);
            view.setScaleY(f9);
            view.setTranslationX(-f6);
            view2.setTranslationX(f6);
            if (f6 == f2) {
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                AnonymousClass0eM r0 = r10.A03;
                ((2cs) r0.getValue()).A06(((2cs) r0.getValue()).A09.A00 - ((double) i));
            }
        }
    }
}
