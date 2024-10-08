package X;

import android.opengl.Matrix;
import android.util.SparseArray;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.detector.DefectDetectorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.DataDrivenFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.DataDrivenGraphFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ExternalRenderFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterGroup;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.4aT  reason: invalid class name and case insensitive filesystem */
public final class C266864aT {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public float A0E;
    public float A0F;
    public TypedParameterMap A0G;
    public TransformMatrixParams A0H;
    public C266864aT A0I;
    public C266864aT A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public HashMap A0P;
    public List A0Q;
    public List A0R;
    public List A0S;
    public List A0T;
    public List A0U;
    public List A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C266864aT(FilterModel filterModel) {
        this();
        C266864aT r0;
        SparseArray sparseArray;
        0qQ.A0B(filterModel, 1);
        String filterName = filterModel.getFilterName();
        0qQ.A0B(filterName, 0);
        this.A0M = filterName;
        this.A0S = 03t.A0F(filterModel.getTextureTransform());
        this.A0R = 03t.A0F(filterModel.getContentTransform());
        this.A0X = filterModel.isEnabled();
        this.A0H = new TransformMatrixParams(filterModel.getTransformMatrixParams());
        if (filterModel instanceof ColorFilter) {
            this.A0L = AnonymousClass000.A00(2821);
            ColorFilter colorFilter = (ColorFilter) filterModel;
            this.A0B = colorFilter.A00;
            this.A0W = colorFilter.A01;
            return;
        }
        if (filterModel instanceof FilterChain) {
            this.A0L = AnonymousClass000.A00(4783);
            sparseArray = ((FilterChain) filterModel).A01;
        } else if (filterModel instanceof FilterGroup) {
            this.A0L = AnonymousClass000.A00(1365);
            sparseArray = ((FilterGroup) filterModel).A01;
        } else if (filterModel instanceof GradientTransformFilter) {
            this.A0L = AnonymousClass000.A00(1392);
            GradientTransformFilter gradientTransformFilter = (GradientTransformFilter) filterModel;
            this.A0V = 03t.A0F(gradientTransformFilter.A08);
            this.A0Q = 03t.A0F(gradientTransformFilter.A07);
            this.A06 = gradientTransformFilter.A02;
            this.A05 = gradientTransformFilter.A01;
            this.A02 = gradientTransformFilter.A00;
            return;
        } else if (filterModel instanceof SplitScreenFilter) {
            this.A0L = AnonymousClass000.A00(5278);
            SplitScreenFilter splitScreenFilter = (SplitScreenFilter) filterModel;
            this.A0A = splitScreenFilter.A00;
            FilterModel filterModel2 = splitScreenFilter.A01;
            C266864aT r1 = null;
            if (filterModel2 != null) {
                r0 = new C266864aT(filterModel2);
            } else {
                r0 = null;
            }
            this.A0I = r0;
            FilterModel filterModel3 = splitScreenFilter.A03;
            this.A0J = filterModel3 != null ? new C266864aT(filterModel3) : r1;
            return;
        } else if (filterModel instanceof GainmapFilter) {
            this.A0L = "gainmap";
            this.A0B = ((GainmapFilter) filterModel).A07;
            return;
        } else if (filterModel instanceof ExternalRenderFilterModel) {
            this.A0L = AnonymousClass000.A00(3091);
            this.A0K = ((ExternalRenderFilterModel) filterModel).A02;
            return;
        } else if (filterModel instanceof DataDrivenFilter) {
            this.A0L = AnonymousClass000.A00(2972);
            this.A0N = ((DataDrivenFilter) filterModel).A00;
            return;
        } else if (filterModel instanceof DataDrivenGraphFilter) {
            this.A0L = AnonymousClass000.A00(2973);
            this.A0O = ((DataDrivenGraphFilter) filterModel).A00;
            return;
        } else if (filterModel instanceof ValueMapFilterModel) {
            this.A0L = AnonymousClass000.A00(4183);
            this.A0G = ((ValueMapFilterModel) filterModel).A01;
            return;
        } else if (filterModel instanceof DefectDetectorFilter) {
            this.A0L = AnonymousClass000.A00(4698);
            return;
        } else {
            throw new IllegalArgumentException("Unknown FilterModel implementation!");
        }
        0qQ.A0B(sparseArray, 0);
        HashMap hashMap = new HashMap(sparseArray.size());
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            hashMap.put(String.valueOf(sparseArray.keyAt(i)), new C266864aT((FilterModel) sparseArray.valueAt(i)));
        }
        this.A0P = hashMap;
    }

    public final String A00() {
        String str = this.A0M;
        if (str != null) {
            return str;
        }
        0qQ.A0F("filterName");
        throw AnonymousClass00P.createAndThrow();
    }

    public C266864aT() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        this.A0S = 03t.A0F(fArr);
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        this.A0R = 03t.A0F(fArr2);
        Integer num = AnonymousClass05K.A00;
        this.A0H = new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false);
    }
}
