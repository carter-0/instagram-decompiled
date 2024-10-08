package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import java.util.LinkedHashMap;

/* renamed from: X.8uZ  reason: invalid class name and case insensitive filesystem */
public final class C369418uZ {
    public static /* synthetic */ ValueMapFilterModel A00(TransformMatrixParams transformMatrixParams, String str, float[] fArr, int i) {
        float[] fArr2;
        TransformMatrixParams transformMatrixParams2 = transformMatrixParams;
        float[] fArr3 = fArr;
        TypedParameterMap typedParameterMap = null;
        if ((i & 2) != 0) {
            fArr3 = C366498p3.A00();
        }
        if ((i & 4) != 0) {
            fArr2 = C366498p3.A00();
        } else {
            fArr2 = null;
        }
        boolean z = false;
        if ((i & 8) != 0) {
            z = true;
        }
        if ((i & 16) != 0) {
            Integer num = AnonymousClass05K.A00;
            transformMatrixParams2 = new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false);
        }
        if ((i & 32) != 0) {
            typedParameterMap = new TypedParameterMap(new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap());
        }
        String str2 = str;
        0qQ.A0B(str2, 0);
        0qQ.A0B(fArr3, 1);
        0qQ.A0B(fArr2, 2);
        0qQ.A0B(transformMatrixParams2, 4);
        0qQ.A0B(typedParameterMap, 5);
        return new ValueMapFilterModel(typedParameterMap, transformMatrixParams2, str2, fArr3, fArr2, z);
    }
}
