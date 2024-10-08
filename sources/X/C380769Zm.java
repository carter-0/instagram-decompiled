package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.DataDrivenGraphFilter;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.9Zm  reason: invalid class name and case insensitive filesystem */
public final class C380769Zm extends C367538r5 {
    public final void ACC(FilterManagerImpl filterManagerImpl) {
        0qQ.A0B(filterManagerImpl, 0);
        DataDrivenGraphFilter dataDrivenGraphFilter = (DataDrivenGraphFilter) this.A00;
        if (dataDrivenGraphFilter.A02) {
            filterManagerImpl.setStringParameter("jsonFilterGraph", dataDrivenGraphFilter.A00);
            dataDrivenGraphFilter.A02 = false;
        }
        HashMap hashMap = dataDrivenGraphFilter.A05;
        if (hashMap != null) {
            Iterator it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                AbstractMap abstractMap = (AbstractMap) hashMap.get(A18);
                if (abstractMap != null) {
                    Iterator it2 = abstractMap.keySet().iterator();
                    while (it2.hasNext()) {
                        String A182 = AnonymousClass7TE.A18(it2);
                        Object obj = abstractMap.get(A182);
                        if (obj instanceof Integer) {
                            filterManagerImpl.setGraphNodeIntParameter(A18, A182, AnonymousClass7TE.A0M(obj));
                        } else if ((obj instanceof Float) || (obj instanceof Double)) {
                            filterManagerImpl.setGraphNodeFloatParameter(A18, A182, AnonymousClass7TE.A04(obj));
                        } else if (obj instanceof Boolean) {
                            filterManagerImpl.setGraphNodeBoolParameter(A18, A182, AnonymousClass7TE.A1a(obj));
                        } else if (obj instanceof C346337v0) {
                            throw AnonymousClass7TE.A15("set Texture uniform in Data driven graph node not added yet!");
                        } else if (obj instanceof float[]) {
                            filterManagerImpl.setGraphNodeFloatArrayParameter(A18, A182, (float[]) obj);
                        }
                    }
                    continue;
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
