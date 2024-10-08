package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;

/* renamed from: X.9da  reason: invalid class name and case insensitive filesystem */
public final class C382369da extends C366058o7 {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = -1;
    public int A03 = -1;
    public FilterModel A04;
    public C366548pF A05;
    public final C366118oD A06;
    public final Integer A07;

    public C382369da(C366028o4 r15, C365998o1 r16, Integer num, boolean z) {
        super((C344407ro) null);
        ValueMapFilterModel valueMapFilterModel;
        this.A06 = new C366118oD(r15, r16, (C364708lr) null, z, false, false);
        Integer num2 = num;
        this.A07 = num2;
        int intValue = num2.intValue();
        FilterModel filterModel = null;
        if (intValue == 2) {
            FilterChain filterChain = new FilterChain();
            Integer num3 = AnonymousClass05K.A01;
            filterChain.A01(C369418uZ.A00(new TransformMatrixParams(num3, num3, 1.0f, 0.0f, 0.0f, 0.0f, false), AnonymousClass000.A00(1865), (float[]) null, 46), 0);
            Integer num4 = AnonymousClass05K.A00;
            filterChain.A01(C369418uZ.A00(new TransformMatrixParams(num4, num4, 1.0f, 0.0f, 0.0f, 0.0f, false), AnonymousClass000.A00(1605), (float[]) null, 46), 1);
            valueMapFilterModel = filterChain;
        } else if (intValue != 3) {
            if (intValue == 4) {
                valueMapFilterModel = C369408uY.A01(true);
            }
            this.A04 = filterModel;
        } else {
            valueMapFilterModel = C369408uY.A01(false);
        }
        filterModel = valueMapFilterModel;
        this.A04 = filterModel;
    }
}
