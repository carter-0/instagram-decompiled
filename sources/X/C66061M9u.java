package X;

import android.graphics.Bitmap;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.M9u  reason: case insensitive filesystem */
public final class C66061M9u implements Runnable {
    public final /* synthetic */ C364988mL A00;
    public final /* synthetic */ LAM A01;
    public final /* synthetic */ C63927LDk A02;
    public final /* synthetic */ C64149LQm A03;
    public final /* synthetic */ C365358my A04;

    public C66061M9u(C364988mL r1, LAM lam, C63927LDk lDk, C64149LQm lQm, C365358my r5) {
        this.A04 = r5;
        this.A03 = lQm;
        this.A01 = lam;
        this.A00 = r1;
        this.A02 = lDk;
    }

    public final void run() {
        C367428qj B8o = this.A04.B8o();
        C64149LQm lQm = this.A03;
        if (!lQm.A0M || B8o == null) {
            C64149LQm.A00((Bitmap) null, this.A00, this.A01, this.A02, lQm);
            return;
        }
        LAM lam = this.A01;
        C364988mL r6 = this.A00;
        C63927LDk lDk = this.A02;
        FilterGroupModel filterGroupModel = lQm.A0F;
        FilterModel B5u = filterGroupModel.B5u(5);
        if (B5u != null) {
            B5u.setEnabled(false);
        }
        if (B8o.A04.A00) {
            FilterModel B5u2 = filterGroupModel.B5u(8);
            if (B5u2 != null) {
                if (B5u2 instanceof GradientTransformFilter) {
                    ((GradientTransformFilter) B5u2).A05 = true;
                } else if (B5u2 instanceof ValueMapFilterModel) {
                    ValueMapFilterModel valueMapFilterModel = (ValueMapFilterModel) B5u2;
                    if (0qQ.A0K(valueMapFilterModel.A03, AnonymousClass000.A00(1392))) {
                        valueMapFilterModel.A02("u_isGainmapEnabled", false);
                    }
                }
            }
            FilterModel B5u3 = filterGroupModel.B5u(3);
            if (B5u3 != null && (B5u3 instanceof SurfaceCropFilterModel)) {
                ((SurfaceCropFilterModel) B5u3).A08 = "gainmap_alpha";
            }
            FilterModel B5u4 = filterGroupModel.B5u(28);
            if (B5u4 != null && (B5u4 instanceof GainmapFilter)) {
                GainmapFilter gainmapFilter = (GainmapFilter) B5u4;
                gainmapFilter.A0A = true;
                gainmapFilter.A09 = 4;
                gainmapFilter.A01(true);
            }
        }
        Bitmap A002 = r6.A00();
        if (A002 == null) {
            lDk.A00(AnonymousClass7TE.A0z("SDR Bitmap is null!"));
            return;
        }
        float A003 = 2Ht.A00(lQm.A09);
        C64149LQm.A01(new C64420Lbb(A002, r6, lam, lDk, lQm, B8o), r6, lQm, B8o, AnonymousClass7TE.A05((float) lQm.A03, A003), AnonymousClass7TE.A05((float) lQm.A02, A003));
    }
}
