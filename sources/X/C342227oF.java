package X;

import com.instagram.creation.capture.quickcapture.aspectratioutil.FullHeightLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.7oF  reason: invalid class name and case insensitive filesystem */
public final class C342227oF {
    public TargetViewSizeProvider A00;
    public int A01 = -1;
    public final C342217oE A02;

    public C342227oF(TargetViewSizeProvider targetViewSizeProvider, C342217oE r3) {
        0qQ.A0B(targetViewSizeProvider, 1);
        this.A00 = targetViewSizeProvider;
        this.A02 = r3;
    }

    public final void A00(int i) {
        int i2;
        int min;
        float A04;
        float f;
        float f2;
        int max;
        NineSixteenLayoutConfigImpl nineSixteenLayoutConfigImpl = (NineSixteenLayoutConfigImpl) this.A00;
        if (!(nineSixteenLayoutConfigImpl instanceof FullHeightLayoutConfigImpl)) {
            i2 = nineSixteenLayoutConfigImpl.A0E;
        } else if (nineSixteenLayoutConfigImpl.A02 <= 0.5625f) {
            i2 = ((nineSixteenLayoutConfigImpl.A08 - nineSixteenLayoutConfigImpl.A05) - nineSixteenLayoutConfigImpl.A03) - nineSixteenLayoutConfigImpl.A0A;
        } else {
            i2 = nineSixteenLayoutConfigImpl.A0K.getHeight();
        }
        TargetViewSizeProvider targetViewSizeProvider = this.A00;
        NineSixteenLayoutConfigImpl nineSixteenLayoutConfigImpl2 = (NineSixteenLayoutConfigImpl) targetViewSizeProvider;
        int i3 = i;
        int max2 = Math.max(0, (nineSixteenLayoutConfigImpl2.A0I + i) - nineSixteenLayoutConfigImpl2.A0G);
        boolean CTv = targetViewSizeProvider.CTv();
        if (CTv) {
            min = 0;
            A04 = 1.0f;
        } else {
            int BQc = targetViewSizeProvider.BQc();
            int i4 = nineSixteenLayoutConfigImpl2.A0A;
            if (BQc == 0) {
                min = Math.min(i3, i4);
            } else {
                int i5 = i4 + BQc;
                double d = (double) BQc;
                double d2 = (double) max2;
                min = Math.min((int) AnonymousClass37Q.A04(d2, d, (double) (BQc + i5), 0.0d, (double) i5), i5) - BQc;
            }
            double d3 = (double) min;
            A04 = (float) AnonymousClass37Q.A04(d3, (double) (i4 / 2), (double) i4, 0.0d, 1.0d);
        }
        int max3 = Math.max(max2 + min, 0);
        float f3 = (float) i2;
        float f4 = 1.0f - (((float) max3) / f3);
        if (f4 < 0.3f) {
            max3 = (int) (f3 * (1.0f - 0.3f));
            f4 = 0.3f;
        }
        if (CTv) {
            f = (float) nineSixteenLayoutConfigImpl2.A0A;
            f2 = f - (f * f4);
            max3 = (int) (((float) max3) + f2);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        if (f4 != 0.3f || (max = this.A01) < 0) {
            int i6 = nineSixteenLayoutConfigImpl2.A0B;
            max = (int) Math.max(0.0f, (((float) i6) + (((float) (nineSixteenLayoutConfigImpl2.A09 - i6)) / 2.0f)) - (((float) nineSixteenLayoutConfigImpl2.A04) - (((((float) (nineSixteenLayoutConfigImpl2.A0H + max3)) - f2) - ((((float) min) + f) / 2.0f)) - ((float) nineSixteenLayoutConfigImpl2.A03))));
            if (f4 == 0.3f) {
                this.A01 = max;
            }
        }
        this.A02.Dx2(max3, max, f4, A04);
    }
}
