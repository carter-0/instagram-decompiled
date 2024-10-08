package X;

import android.graphics.PointF;
import android.view.View;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;

/* renamed from: X.Lbt  reason: case insensitive filesystem */
public final class C64438Lbt implements C317406nD {
    public SurfaceCropFilterModel.FitTransformParams A00;
    public SurfaceCropFilterModel.FitTransformParams A01;
    public final /* synthetic */ C64942Lkh A02;

    private void A01(2cs r7, float f, float f2, float f3) {
        double d;
        C71392co r0;
        r7.A06 = false;
        if (Math.abs(f) > 100.0f) {
            View view = this.A02.A01;
            view.getClass();
            d = (double) (f / AnonymousClass7TE.A02(view));
        } else {
            d = 0.0d;
        }
        r7.A07(d);
        int i = (((double) AnonymousClass7TE.A00(f2, f3)) > 0.001d ? 1 : (((double) AnonymousClass7TE.A00(f2, f3)) == 0.001d ? 0 : -1));
        C64942Lkh lkh = this.A02;
        if (i > 0) {
            r0 = lkh.A0Y;
        } else {
            r0 = lkh.A0Z;
        }
        r7.A09(r0);
        r7.A06((double) f3);
        r7.A08((double) f2, false);
    }

    public C64438Lbt(SurfaceCropFilterModel.FitTransformParams fitTransformParams, SurfaceCropFilterModel.FitTransformParams fitTransformParams2, C64942Lkh lkh, float f, float f2) {
        this.A02 = lkh;
        this.A00 = fitTransformParams;
        this.A01 = fitTransformParams2;
        lkh.A0a.A04.add(this);
        A01(lkh.A0V, -f, fitTransformParams.A00, fitTransformParams2.A00);
        A01(lkh.A0W, f2, fitTransformParams.A01, fitTransformParams2.A01);
        2cs r2 = lkh.A0X;
        JTP.A1K(r2, fitTransformParams.A02);
        if (fitTransformParams2.A02 != fitTransformParams.A02) {
            r2.A07(0.0d);
            r2.A06((double) fitTransformParams2.A02);
        }
    }

    public final void Cuk(2cp r10) {
        C64942Lkh lkh = this.A02;
        SurfaceCropFilter surfaceCropFilter = lkh.A08;
        if (surfaceCropFilter != null) {
            SurfaceCropFilterModel.FitTransformParams fitTransformParams = lkh.A0S;
            C71412ct r7 = lkh.A0X.A09;
            fitTransformParams.A02 = (float) r7.A00;
            C71412ct r1 = lkh.A0V.A09;
            fitTransformParams.A00 = (float) r1.A00;
            C71412ct r2 = lkh.A0W.A09;
            fitTransformParams.A01 = (float) r2.A00;
            surfaceCropFilter.A0M(fitTransformParams);
            C64942Lkh.A03(lkh);
            if (r10.A00) {
                r10.A04.remove(this);
                if (lkh.A0D != null && 2Ht.A02(lkh.A0b)) {
                    lkh.A0c.AAC(new PointF((float) r1.A00, (float) r2.A00), lkh.A0D, (float) r7.A00);
                }
            }
        }
    }

    public final void Cxs(2cp r8) {
        C64942Lkh lkh = this.A02;
        SurfaceCropFilter surfaceCropFilter = lkh.A08;
        if (surfaceCropFilter != null) {
            SurfaceCropFilterModel.FitTransformParams fitTransformParams = this.A00;
            surfaceCropFilter.A0L(fitTransformParams);
            SurfaceCropFilter surfaceCropFilter2 = lkh.A08;
            SurfaceCropFilterModel.FitTransformParams fitTransformParams2 = this.A01;
            if (!surfaceCropFilter2.A0Q(fitTransformParams2)) {
                0qQ.A0B(fitTransformParams, 0);
                fitTransformParams2.A02 = fitTransformParams.A02;
                fitTransformParams2.A00 = fitTransformParams.A00;
                fitTransformParams2.A01 = fitTransformParams.A01;
            }
            A00(lkh.A0V, fitTransformParams.A00, fitTransformParams2.A00);
            A00(lkh.A0W, fitTransformParams.A01, fitTransformParams2.A01);
            2cs r5 = lkh.A0X;
            double d = r5.A01;
            double d2 = (double) fitTransformParams2.A02;
            if (d != d2) {
                r5.A06(d2);
            }
        }
    }

    private void A00(2cs r6, float f, float f2) {
        double d;
        int i = (((double) AnonymousClass7TE.A00(f, f2)) > 0.001d ? 1 : (((double) AnonymousClass7TE.A00(f, f2)) == 0.001d ? 0 : -1));
        C71392co r1 = r6.A05;
        if (i > 0) {
            C71392co r0 = this.A02.A0Y;
            if (r1 != r0) {
                r6.A09(r0);
                d = (double) f2;
            } else {
                d = (double) f2;
                if (r6.A01 == d) {
                    return;
                }
            }
            r6.A06(d);
            return;
        }
        C71392co r02 = this.A02.A0Z;
        if (r1 != r02) {
            r6.A09(r02);
        }
    }
}
