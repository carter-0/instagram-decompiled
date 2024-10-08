package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.DataDrivenFilter;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.9Zl  reason: invalid class name and case insensitive filesystem */
public final class C380759Zl extends C367538r5 {
    public final void ACC(FilterManagerImpl filterManagerImpl) {
        0qQ.A0B(filterManagerImpl, 0);
        DataDrivenFilter dataDrivenFilter = (DataDrivenFilter) this.A00;
        filterManagerImpl.setStringParameter("glslShaderString", dataDrivenFilter.A00);
        HashMap hashMap = dataDrivenFilter.A04;
        if (hashMap != null) {
            Iterator it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                Object obj = hashMap.get(A18);
                if (obj instanceof Integer) {
                    filterManagerImpl.setIntParameter(A18, AnonymousClass7TE.A0M(obj));
                } else if ((obj instanceof Float) || (obj instanceof Double)) {
                    filterManagerImpl.setFloatParameter(A18, AnonymousClass7TE.A04(obj));
                } else if (obj instanceof Boolean) {
                    filterManagerImpl.setBoolParameter(A18, AnonymousClass7TE.A1a(obj));
                } else if (obj instanceof C346337v0) {
                    filterManagerImpl.setTextureInput(A18, (C346337v0) obj);
                } else if (obj instanceof float[]) {
                    filterManagerImpl.setFloatArrayParameter(A18, (float[]) obj);
                }
            }
        }
    }

    public final void ACB(FilterManagerImpl filterManagerImpl, float[] fArr, float[] fArr2) {
        AnonymousClass7TG.A1T(filterManagerImpl, fArr, fArr2);
        filterManagerImpl.setFloatArrayParameter("texture_transform", fArr);
        filterManagerImpl.setFloatArrayParameter("content_transform", fArr2);
    }
}
