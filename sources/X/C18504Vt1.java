package X;

import android.graphics.Paint;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Vt1  reason: case insensitive filesystem */
public final class C18504Vt1 {
    public static final long A08 = JTR.A0N(TimeUnit.SECONDS);
    public float A00;
    public Paint A01;
    public final float A02;
    public final long A03;
    public final C17558VaC A04;
    public final C17558VaC A05;
    public final boolean A06;
    public final int[] A07;

    public C18504Vt1(C17558VaC vaC, C17558VaC vaC2, int[] iArr, float f, boolean z) {
        this.A07 = iArr;
        this.A05 = vaC;
        this.A04 = vaC2;
        this.A06 = z;
        float f2 = vaC.A03 - vaC.A02;
        float f3 = vaC2.A03 - vaC2.A02;
        float f4 = vaC.A05 - vaC.A04;
        float f5 = vaC2.A05 - vaC2.A04;
        this.A02 = (float) (90.0d - Math.toDegrees(Math.atan2((double) ((f2 * f3) + (f4 * f5)), (double) ((f2 * f5) - (f3 * f4)))));
        this.A03 = ((long) f) * A08;
    }
}
