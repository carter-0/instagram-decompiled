package X;

import android.animation.ValueAnimator;
import android.view.animation.BaseInterpolator;

/* renamed from: X.Ixh  reason: case insensitive filesystem */
public final class C58796Ixh extends 0Yg implements 0sP {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final long A04;
    public final Object A05;
    public final Object A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58796Ixh(Object obj, Object obj2, float f, float f2, float f3, int i, long j) {
        super(1);
        this.A03 = i;
        this.A02 = f;
        this.A01 = f2;
        this.A04 = j;
        this.A00 = f3;
        this.A06 = obj;
        this.A05 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = obj;
        if (this.A03 == 0) {
            AnonymousClass5Q4 r5 = (AnonymousClass5Q4) obj2;
            C51970G9q.A15(r5);
            float A002 = C51966G9m.A00(r5, this.A02, C51969G9p.A01(r5) * 0.8333333f);
            float f = this.A01;
            float F06 = A002 - r5.F06(f / 2.0f);
            long j = this.A04;
            r5.AQV((C288195bW) null, C289635dw.A00, r5.F06(this.A00), 1.0f, 3, j, C289325dP.A00(A002, A002));
            AnonymousClass2DO r6 = (AnonymousClass2DO) this.A06;
            C288195bW r7 = (C288195bW) this.A05;
            AnonymousClass5QF r3 = ((AnonymousClass5QC) r5.Ayw()).A01;
            r3.FHv(F06, F06);
            try {
                r6.A01(r7, r5, 1.0f, C288015bE.A00(r5.F06(f), r5.F06(f)));
            } finally {
                float f2 = -F06;
                r3.FHv(f2, f2);
            }
        } else if (((AnonymousClass3Y5) this.A06).A05.A03("clips_swipe_left_nudge_chevron_component") != null) {
            float f3 = this.A02;
            float f4 = this.A00;
            float f5 = this.A01;
            2V5 r9 = (2V5) this.A05;
            long j2 = this.A04;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f3, f4});
            BaseInterpolator baseInterpolator = C53892Gvx.A03;
            ofFloat.setInterpolator(baseInterpolator);
            ofFloat.setDuration(533);
            ofFloat.addUpdateListener(new I84(r9, 26));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{f4, f5});
            ofFloat2.setInterpolator(baseInterpolator);
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(2);
            ofFloat2.setDuration(j2);
            ofFloat2.setStartDelay(533);
            ofFloat2.addUpdateListener(new I84(r9, 27));
            ofFloat2.start();
        }
        return C60340gF.A00;
    }
}
