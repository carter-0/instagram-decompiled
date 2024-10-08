package X;

import android.util.SparseArray;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class AEQ {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterGroup} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ExternalRenderFilterModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.detector.DefectDetectorFilter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter} */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01bd, code lost:
        r4 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel) r4;
        r2 = X.0wj.A01.AEf(r0.A00(), 817895413);
        r2.ABQ("restoredFilter", r4.getFilterName());
        r2.ABR("isValueMapFilter", r4 instanceof com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel);
        r2.ABQ("navChain", java.lang.String.valueOf(X.AnonymousClass1QI.A00.A02.A00));
        r2.report();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01ee, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        throw X.AnonymousClass7TF.A0W("Unknown filter model class: ", r2);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel A01(com.instagram.common.session.UserSession r16, X.C266864aT r17) {
        /*
            r15 = 0
            r0 = r17
            X.0qQ.A0B(r0, r15)
            java.lang.String r2 = r0.A0L
            if (r2 == 0) goto L_0x020f
            int r1 = r2.hashCode()
            r5 = 0
            java.lang.String r3 = "Required value was null."
            r4 = r16
            switch(r1) {
                case -1833923782: goto L_0x018f;
                case -1829917960: goto L_0x015c;
                case -199019139: goto L_0x0138;
                case -179908303: goto L_0x00fc;
                case -109262157: goto L_0x00c1;
                case -34594531: goto L_0x0084;
                case 537596042: goto L_0x0059;
                case 1377318199: goto L_0x004a;
                case 2034439124: goto L_0x001d;
                default: goto L_0x0016;
            }
        L_0x0016:
            java.lang.String r0 = "Unknown filter model class: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r0, r2)
            throw r0
        L_0x001d:
            r1 = 2821(0xb05, float:3.953E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0016
            java.lang.String r6 = r0.A00()
            java.util.List r1 = r0.A0S
            float[] r7 = X.00k.A0w(r1)
            java.util.List r1 = r0.A0R
            float[] r8 = X.00k.A0w(r1)
            float r9 = r0.A0B
            boolean r10 = r0.A0W
            boolean r11 = r0.A0Y
            boolean r12 = r0.A0X
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r5 = r0.A0H
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter r4 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x01bd
        L_0x004a:
            java.lang.String r3 = "defect_detection"
            boolean r1 = r2.equals(r3)
            if (r1 == 0) goto L_0x0016
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.detector.DefectDetectorFilter r4 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.detector.DefectDetectorFilter
            r4.<init>(r3)
            goto L_0x01bd
        L_0x0059:
            r1 = 3091(0xc13, float:4.331E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0016
            java.lang.String r6 = r0.A0K
            if (r6 == 0) goto L_0x01ef
            java.lang.String r7 = r0.A00()
            java.util.List r1 = r0.A0S
            float[] r8 = X.00k.A0w(r1)
            java.util.List r1 = r0.A0R
            float[] r9 = X.00k.A0w(r1)
            boolean r10 = r0.A0X
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r5 = r0.A0H
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ExternalRenderFilterModel r4 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ExternalRenderFilterModel
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto L_0x01bd
        L_0x0084:
            java.lang.String r1 = "gradient_transform"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0016
            java.util.List r1 = r0.A0V
            if (r1 == 0) goto L_0x01f9
            float[] r8 = X.00k.A0w(r1)
            java.util.List r1 = r0.A0Q
            if (r1 == 0) goto L_0x01f4
            float[] r9 = X.00k.A0w(r1)
            float r12 = r0.A06
            float r13 = r0.A05
            float r14 = r0.A02
            boolean r2 = r0.A0X
            java.lang.String r7 = r0.A00()
            java.util.List r1 = r0.A0S
            float[] r10 = X.00k.A0w(r1)
            java.util.List r1 = r0.A0R
            float[] r11 = X.00k.A0w(r1)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r6 = r0.A0H
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter r4 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter
            r16 = r15
            r17 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01bd
        L_0x00c1:
            r1 = 4183(0x1057, float:5.862E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0016
            java.lang.String r7 = r0.A00()
            java.util.List r1 = r0.A0S
            float[] r8 = X.00k.A0w(r1)
            java.util.List r1 = r0.A0R
            float[] r9 = X.00k.A0w(r1)
            boolean r10 = r0.A0X
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r1 = r0.A0H
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r6 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r6.<init>(r1)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap r1 = r0.A0G
            if (r1 == 0) goto L_0x01fe
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap r5 = r1.A00()
            X.AnonymousClass7TG.A1O(r8, r9)
            r1 = 5
            X.0qQ.A0B(r5, r1)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r4 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto L_0x01bd
        L_0x00fc:
            java.lang.String r1 = "split_screen"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0016
            X.4aT r2 = r0.A0I
            X.4aT r1 = r0.A0J
            float r3 = r0.A0A
            if (r2 == 0) goto L_0x0136
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r7 = A01(r4, r2)
        L_0x0110:
            if (r1 == 0) goto L_0x0116
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r5 = A01(r4, r1)
        L_0x0116:
            java.lang.String r10 = r0.A00()
            java.util.List r1 = r0.A0S
            float[] r11 = X.00k.A0w(r1)
            java.util.List r1 = r0.A0R
            float[] r12 = X.00k.A0w(r1)
            boolean r2 = r0.A0X
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r1 = r0.A0H
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter r4 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter
            r6 = r4
            r8 = r5
            r9 = r1
            r13 = r3
            r14 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x01bd
        L_0x0136:
            r7 = r5
            goto L_0x0110
        L_0x0138:
            java.lang.String r1 = "gainmap"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0016
            float r9 = r0.A0B
            java.lang.String r6 = r0.A00()
            java.util.List r1 = r0.A0S
            float[] r7 = X.00k.A0w(r1)
            java.util.List r1 = r0.A0R
            float[] r8 = X.00k.A0w(r1)
            boolean r10 = r0.A0X
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r5 = r0.A0H
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter r4 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto L_0x01bd
        L_0x015c:
            r1 = 1365(0x555, float:1.913E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0016
            java.util.HashMap r1 = r0.A0P
            if (r1 == 0) goto L_0x0205
            android.util.SparseArray r5 = A00(r4, r1)
            android.util.SparseArray r6 = new android.util.SparseArray
            r6.<init>()
            java.lang.String r8 = r0.A00()
            boolean r11 = r0.A0X
            java.util.List r1 = r0.A0S
            float[] r9 = X.00k.A0w(r1)
            java.util.List r1 = r0.A0R
            float[] r10 = X.00k.A0w(r1)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r7 = r0.A0H
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterGroup r4 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterGroup
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x01bd
        L_0x018f:
            java.lang.String r1 = "filter_chain"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0016
            java.util.HashMap r1 = r0.A0P
            if (r1 == 0) goto L_0x020a
            android.util.SparseArray r5 = A00(r4, r1)
            android.util.SparseArray r6 = new android.util.SparseArray
            r6.<init>()
            java.lang.String r8 = r0.A00()
            boolean r11 = r0.A0X
            java.util.List r1 = r0.A0S
            float[] r9 = X.00k.A0w(r1)
            java.util.List r1 = r0.A0R
            float[] r10 = X.00k.A0w(r1)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r7 = r0.A0H
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain r4 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
        L_0x01bd:
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r4 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel) r4
            X.0wj r2 = X.0wj.A01
            r1 = 817895413(0x30c017f5, float:1.3976648E-9)
            java.lang.String r0 = r0.A00()
            X.0f9 r2 = r2.AEf(r0, r1)
            java.lang.String r1 = r4.getFilterName()
            java.lang.String r0 = "restoredFilter"
            r2.ABQ(r0, r1)
            boolean r1 = r4 instanceof com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel
            java.lang.String r0 = "isValueMapFilter"
            r2.ABR(r0, r1)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r0 = r0.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "navChain"
            r2.ABQ(r0, r1)
            r2.report()
            return r4
        L_0x01ef:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x01f4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x01f9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x01fe:
            java.lang.String r0 = "IgSerializableFilterModel representing ValueMapFilterModel MUST have non-null TypedParameterMap"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0205:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x020a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x020f:
            java.lang.String r0 = "filterModelClass"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AEQ.A01(com.instagram.common.session.UserSession, X.4aT):com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel");
    }

    public static final void A02(FilterChain filterChain, String str, float[] fArr) {
        float[] textureTransform;
        0qQ.A0B(fArr, 1);
        Integer A00 = C366708pX.A00(filterChain);
        if (A00 != null) {
            FilterModel filterModel = (FilterModel) filterChain.A01.get(A00.intValue());
            if (filterModel != null && (textureTransform = filterModel.getTextureTransform()) != null && !Arrays.equals(textureTransform, fArr)) {
                String arrays = Arrays.toString(textureTransform);
                0qQ.A07(arrays);
                String arrays2 = Arrays.toString(fArr);
                0qQ.A07(arrays2);
                String A0v = 002.A0v("previous filterChain transform matrix: ", arrays, "\ntranscoding transform matrix: ", arrays2, 10);
                0f9 AEf = 0wj.A01.AEf(str, 817897553);
                AEf.ABR("error_01_percent", C366708pX.A03(textureTransform, fArr));
                AEf.ABQ("navChain", String.valueOf(AnonymousClass1QI.A00.A02.A00));
                AEf.ABQ("debugMessage", A0v);
                AEf.report();
            }
        }
    }

    public static final SparseArray A00(UserSession userSession, HashMap hashMap) {
        SparseArray sparseArray = new SparseArray(hashMap.size());
        Iterator A0s = AnonymousClass7TF.A0s(hashMap);
        while (A0s.hasNext()) {
            Map.Entry entry = (Map.Entry) AnonymousClass7TF.A0a(A0s);
            Object key = entry.getKey();
            0qQ.A07(key);
            int parseInt = Integer.parseInt((String) key);
            Object value = entry.getValue();
            0qQ.A07(value);
            sparseArray.put(parseInt, A01(userSession, (C266864aT) value));
        }
        return sparseArray;
    }
}
