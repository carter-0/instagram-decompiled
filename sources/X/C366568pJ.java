package X;

import android.util.SparseArray;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter;

/* renamed from: X.8pJ  reason: invalid class name and case insensitive filesystem */
public final class C366568pJ {
    public final SparseArray A00 = new SparseArray();
    public final FilterChain A01;

    public final ColorFilter A00(int i) {
        int i2;
        ColorFilter colorFilter;
        SparseArray sparseArray = this.A00;
        if (sparseArray.get(i) != null) {
            Object obj = sparseArray.get(i);
            0qQ.A07(obj);
            return (ColorFilter) obj;
        }
        FilterModel filterModel = (FilterModel) this.A01.A01.get(17);
        0qQ.A0C(filterModel, "null cannot be cast to non-null type com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter");
        SplitScreenFilter splitScreenFilter = (SplitScreenFilter) filterModel;
        FilterModel filterModel2 = splitScreenFilter.A01;
        if (filterModel2 != null) {
            i2 = C366508p8.A00(filterModel2.getFilterName());
        } else {
            i2 = AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        if (i2 == i) {
            FilterModel filterModel3 = splitScreenFilter.A01;
            0qQ.A0C(filterModel3, "null cannot be cast to non-null type com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter");
            colorFilter = (ColorFilter) filterModel3;
        } else {
            colorFilter = new ColorFilter(C366508p8.A01(i), false);
            colorFilter.A00 = 0.5f;
        }
        sparseArray.put(i, colorFilter);
        return colorFilter;
    }

    public C366568pJ(FilterChain filterChain) {
        this.A01 = filterChain;
    }
}
