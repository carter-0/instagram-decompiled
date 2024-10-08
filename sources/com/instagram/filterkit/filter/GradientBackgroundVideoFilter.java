package com.instagram.filterkit.filter;

import X.0f9;
import X.0qQ;
import X.0wj;
import X.17k;
import X.AnonymousClass7TF;
import X.C13989Tnp;
import X.C353948Ka;
import X.C365358my;
import X.Tt7;
import X.Tt8;
import X.X98;
import X.XBw;
import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;

public final class GradientBackgroundVideoFilter extends VideoFilter {
    public GradientBackgroundVideoFilter(UserSession userSession, Context context, boolean z) {
        super(context, new Tt8(), C353948Ka.A00(userSession).A01(753));
        17k.A0H(AnonymousClass7TF.A1Q(this.A01), "useSamplerExternalOES must be set prior to calling getProgram");
        this.A0G = z;
        A04(true);
    }

    public final void A03(X98 x98, C365358my r13, XBw xBw) {
        float[] fArr = this.A0I;
        float[] fArr2 = this.A0H;
        Bitmap bitmap = this.A05;
        if (!((fArr == null || fArr2 == null) && bitmap == null)) {
            Tt7 tt7 = this.A07;
            if (tt7 instanceof Tt8) {
                0qQ.A0C(tt7, "null cannot be cast to non-null type com.instagram.filterkit.filter.GradientBackgroundFilterRenderSetup");
                Tt8 tt8 = (Tt8) tt7;
                if (!(fArr == null || fArr2 == null)) {
                    float f = fArr[0];
                    float f2 = fArr[1];
                    float f3 = fArr[2];
                    float[] fArr3 = tt8.A0A;
                    fArr3[0] = f;
                    fArr3[1] = f2;
                    fArr3[2] = f3;
                    fArr3[3] = 1.0f;
                    float f4 = fArr2[0];
                    float f5 = fArr2[1];
                    float f6 = fArr2[2];
                    float[] fArr4 = tt8.A07;
                    fArr4[0] = f4;
                    fArr4[1] = f5;
                    fArr4[2] = f6;
                    fArr4[3] = 1.0f;
                }
                if (bitmap != null) {
                    0f9 AEf = 0wj.A01.AEf("GRADIENT BACKGROUND BITMAP", 817895413);
                    AEf.ABQ("use case", "GradientBackgroundVideoFilter");
                    AEf.report();
                    tt8.A00 = bitmap;
                }
            }
        }
        super.A03(x98, r13, xBw);
    }

    public final void A06(float f, float f2, boolean z) {
        if (f < f2) {
            Tt7 tt7 = this.A07;
            if (tt7 != null) {
                float f3 = (1.0f - (f / f2)) * 0.5f;
                0qQ.A0C(tt7, "null cannot be cast to non-null type com.instagram.filterkit.filter.GradientBackgroundFilterRenderSetup");
                Tt8 tt8 = (Tt8) tt7;
                float f4 = 1.0f - f3;
                if (z) {
                    float[] fArr = tt8.A08;
                    C13989Tnp.A1V(fArr, 0.0f, f3);
                    fArr[2] = 1.0f;
                    fArr[3] = f4;
                    return;
                }
                float[] fArr2 = tt8.A08;
                C13989Tnp.A1V(fArr2, f3, 1.0f);
                fArr2[2] = f4;
                fArr2[3] = 0.0f;
                return;
            }
            return;
        }
        throw new IllegalStateException("toAspectRatio taller than fromAspectRatio");
    }
}
