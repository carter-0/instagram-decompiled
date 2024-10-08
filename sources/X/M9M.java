package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

public final /* synthetic */ class M9M implements Runnable {
    public final /* synthetic */ LE9 A00;
    public final /* synthetic */ SurfaceCropFilter A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ M9M(LE9 le9, SurfaceCropFilter surfaceCropFilter, String str, boolean z) {
        this.A00 = le9;
        this.A02 = str;
        this.A01 = surfaceCropFilter;
        this.A03 = z;
    }

    public final void run() {
        LE9 le9 = this.A00;
        String str = this.A02;
        SurfaceCropFilter surfaceCropFilter = this.A01;
        boolean z = this.A03;
        C344207rU r4 = le9.A00;
        if (r4 != null) {
            r4.A03();
            C63839L8u l8u = new C63839L8u(le9.A02, ((C345807u7) r4.A02(C345807u7.A00)).Avx(), le9.A05);
            le9.A01 = l8u;
            Context context = l8u.A01;
            l8u.A00 = C63994LHs.A01(context, z);
            FilterGroupModel filterGroupModel = l8u.A04;
            filterGroupModel.EWj(surfaceCropFilter.A00, 3);
            if (z) {
                float f = (((float) l8u.A00) * 0.17f) / 2.5f;
                Integer num = AnonymousClass05K.A00;
                ValueMapFilterModel A002 = C369418uZ.A00(new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false), "gaussian_blur", (float[]) null, 46);
                A002.A00("sigma", f);
                A002.A00("kernel_size", f * 3.0f);
                filterGroupModel.EWj(A002, 25);
            }
            if (182.A06(0Tu.A05, l8u.A03, 36329247161204609L)) {
                GainmapFilter gainmapFilter = new GainmapFilter();
                gainmapFilter.A09 = 0;
                gainmapFilter.A01(true);
                filterGroupModel.EWj(gainmapFilter, 28);
            }
            C364988mL r6 = l8u.A02;
            r6.A07(((FilterGroupModelImpl) filterGroupModel).A02);
            AnonymousClass9WF r0 = new AnonymousClass9WF((C364958mI) null, (SurfaceCropFilter) null, new C364798m1(context.getContentResolver(), 0cp.A03(str), (Uri) null), false);
            r6.A0B(r0);
            r6.A0A(r0.A02);
            int i = l8u.A00;
            r6.A06(i, i, 0, false, false);
            int i2 = l8u.A00;
            r6.A05(i2, i2);
            int i3 = l8u.A00;
            r6.A09((C346267ut) null, i3, i3);
            le9.A04.postDelayed(le9.A06, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        }
    }
}
