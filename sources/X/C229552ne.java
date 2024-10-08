package X;

import android.view.Choreographer;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2ne  reason: invalid class name and case insensitive filesystem */
public final class C229552ne {
    public static final AnonymousClass0eM A0B = AnonymousClass0eN.A01(C229562nf.A00);
    public long A00;
    public boolean A01;
    public float A02;
    public int A03;
    public final Choreographer.FrameCallback A04 = new C229582nh(this);
    public final C229542nd A05;
    public final AnonymousClass0Ud A06;
    public final C229572ng A07;
    public final C229532nc A08;
    public final C229592ni A09 = new C229592ni(this);
    public final boolean A0A;

    public C229552ne(C229572ng r2, C229532nc r3, C229542nd r4, AnonymousClass0Ud r5, boolean z) {
        0qQ.A0B(r2, 2);
        this.A05 = r4;
        this.A07 = r2;
        this.A06 = r5;
        this.A08 = r3;
        this.A0A = z;
    }

    public static final void A00(C229552ne r10, long j, long j2) {
        float f;
        if (j != j2) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            AnonymousClass0Ud r8 = r10.A06;
            int A012 = AnonymousClass1GB.A01(((float) (j2 - j)) / ((float) ((long) (((float) timeUnit.toNanos(1)) / ((Number) r8.getValue()).floatValue())))) - 1;
            if (A012 < 0) {
                A012 = 0;
            } else if (A012 > 100) {
                A012 = 100;
            }
            r10.A03 += A012;
            float f2 = r10.A02;
            float f3 = (float) A012;
            if (f3 >= 4.0f) {
                f = f3 / 4.0f;
            } else {
                f = 0.0f;
            }
            r10.A02 = f2 + f;
            r10.A00 = j2;
            C229532nc r1 = r10.A08;
            r1.DH2(j2, ((long) (A012 + 1)) * ((long) (((float) timeUnit.toNanos(1)) / ((Number) r8.getValue()).floatValue())));
            if (f3 >= 4.0f) {
                r1.DMx(j2, A012);
            } else if (A012 > 0) {
                r1.DlZ(j2);
            }
        }
    }

    public final C229502nY A01() {
        float f;
        int i = 0;
        if (this.A01) {
            this.A01 = false;
            C229542nd r0 = this.A05;
            r0.A00.removeFrameCallback(this.A04);
            if (this.A0A) {
                A00(this, this.A00, System.nanoTime());
            }
            i = this.A03;
            f = this.A02;
        } else {
            f = 0.0f;
        }
        return new C229502nY(i, f);
    }

    public final void A02() {
        if (!this.A01) {
            this.A03 = 0;
            this.A02 = 0.0f;
            this.A00 = System.nanoTime();
            this.A01 = true;
            C229542nd r0 = this.A05;
            r0.A00.postFrameCallback(this.A04);
        }
    }
}
