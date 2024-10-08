package X;

import android.os.Build;
import android.util.SparseArray;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter;
import com.instagram.common.session.UserSession;

public final class LDP {
    public float A00;
    public boolean A01;
    public final boolean A02;
    public final Integer A03;

    public LDP(UserSession userSession, C364808m2 r7, Integer num) {
        boolean A05;
        0qQ.A0B(r7, 2);
        this.A03 = num;
        int intValue = num.intValue();
        boolean z = false;
        int i = Build.VERSION.SDK_INT;
        if (intValue != 0) {
            A05 = (i >= 34 && r7.Cdi() && 2Ht.A06(userSession)) ? 182.A06(0Tu.A05, userSession, 36321670839019129L) : A05;
            this.A02 = z;
            this.A00 = 1.0f;
        }
        if (i >= 34 && r7.Cdi()) {
            A05 = 2Ht.A05(userSession);
        }
        this.A02 = z;
        this.A00 = 1.0f;
        if (A05) {
            z = true;
        }
        this.A02 = z;
        this.A00 = 1.0f;
    }

    public final void A00(FilterChain filterChain, C367428qj r8) {
        SurfaceCropFilterModel surfaceCropFilterModel;
        GainmapFilter gainmapFilter;
        boolean z;
        String str;
        SparseArray sparseArray = filterChain.A01;
        FilterModel filterModel = (FilterModel) sparseArray.get(3);
        if (filterModel == null || !(filterModel instanceof SurfaceCropFilterModel)) {
            surfaceCropFilterModel = null;
        } else {
            surfaceCropFilterModel = (SurfaceCropFilterModel) filterModel;
        }
        FilterModel filterModel2 = (FilterModel) sparseArray.get(28);
        if (filterModel2 == null || !(filterModel2 instanceof GainmapFilter)) {
            gainmapFilter = null;
        } else {
            gainmapFilter = (GainmapFilter) filterModel2;
        }
        if (surfaceCropFilterModel != null && gainmapFilter != null) {
            if (this.A03.intValue() != 0) {
                int i = 0;
                if (!this.A02 || r8 == null || !r8.A04.A00) {
                    z = false;
                    str = "normal";
                } else {
                    z = true;
                    str = "gainmap_alpha";
                }
                surfaceCropFilterModel.A08 = str;
                gainmapFilter.A0A = true;
                if (z) {
                    i = 4;
                }
                gainmapFilter.A09 = i;
                gainmapFilter.A01(true);
                return;
            }
            if (this.A02 && r8 != null && r8.A04.A00) {
                0rh r2 = r8.A05;
                if (r2.A00 > 1.0f) {
                    surfaceCropFilterModel.A08 = "gainmap_alpha";
                    gainmapFilter.A0A = true;
                    C367428qj.A00(gainmapFilter, r8);
                    gainmapFilter.A05 = r2.A00;
                    gainmapFilter.A09 = 2;
                    gainmapFilter.A01(false);
                    gainmapFilter.A00(this.A00);
                    this.A01 = true;
                    return;
                }
            }
            surfaceCropFilterModel.A08 = "normal";
            gainmapFilter.A0A = false;
            this.A01 = false;
        }
    }
}
