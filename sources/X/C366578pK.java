package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import java.util.List;

/* renamed from: X.8pK  reason: invalid class name and case insensitive filesystem */
public final class C366578pK {
    public final FilterChain A00;
    public final C366568pJ A01;

    public static final void A00(ValueMapFilterModel valueMapFilterModel, List list) {
        if (valueMapFilterModel != null) {
            valueMapFilterModel.A03("highlight", new float[]{((Number) list.get(0)).floatValue() / 255.0f, ((Number) list.get(1)).floatValue() / 255.0f, ((Number) list.get(2)).floatValue() / 255.0f});
            valueMapFilterModel.A03("midtone", new float[]{((Number) list.get(3)).floatValue() / 255.0f, ((Number) list.get(4)).floatValue() / 255.0f, ((Number) list.get(5)).floatValue() / 255.0f});
            valueMapFilterModel.A03("shadow", new float[]{((Number) list.get(6)).floatValue() / 255.0f, ((Number) list.get(7)).floatValue() / 255.0f, ((Number) list.get(8)).floatValue() / 255.0f});
        }
    }

    public final void A01(int i, int i2, float f) {
        ColorFilter colorFilter;
        ColorFilter colorFilter2;
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (i != i2 || f == 0.0f || f == 1.0f) {
            FilterModel filterModel = (FilterModel) this.A00.A01.get(17);
            0qQ.A0C(filterModel, "null cannot be cast to non-null type com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter");
            SplitScreenFilter splitScreenFilter = (SplitScreenFilter) filterModel;
            splitScreenFilter.A00 = f;
            boolean z = false;
            if (f > 0.0f) {
                z = true;
            }
            FilterModel filterModel2 = null;
            if (!z) {
                colorFilter = null;
            } else if (i != 1112) {
                colorFilter = this.A01.A00(i);
            } else {
                ValueMapFilterModel A002 = C369418uZ.A00((TransformMatrixParams) null, C366508p8.A01(i), (float[]) null, 62);
                A002.A00("strength", 0.3f);
                colorFilter = A002;
            }
            splitScreenFilter.A01 = colorFilter;
            splitScreenFilter.A02 = colorFilter;
            if (splitScreenFilter.A00 < 1.0f) {
                if (i2 != 1112) {
                    colorFilter2 = this.A01.A00(i2);
                } else {
                    ValueMapFilterModel A003 = C369418uZ.A00((TransformMatrixParams) null, C366508p8.A01(i2), (float[]) null, 62);
                    A003.A00("strength", 0.3f);
                    colorFilter2 = A003;
                }
                filterModel2 = colorFilter2;
            }
            splitScreenFilter.A03 = filterModel2;
            splitScreenFilter.A04 = filterModel2;
        } else {
            throw new IllegalArgumentException("If the left and right filters have the same id only one must be fully visible");
        }
    }

    public final void A02(List list, int i, int i2) {
        if (list != null) {
            FilterModel filterModel = (FilterModel) this.A00.A01.get(17);
            0qQ.A0C(filterModel, "null cannot be cast to non-null type com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter");
            SplitScreenFilter splitScreenFilter = (SplitScreenFilter) filterModel;
            if (i == 1112) {
                A00((ValueMapFilterModel) splitScreenFilter.A01, list);
            }
            if (i2 == 1112) {
                A00((ValueMapFilterModel) splitScreenFilter.A03, list);
            }
        }
    }

    public C366578pK(FilterChain filterChain, C366568pJ r2) {
        this.A00 = filterChain;
        this.A01 = r2;
    }
}
