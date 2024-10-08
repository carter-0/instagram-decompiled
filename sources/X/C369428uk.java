package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.InstagramFilterFactoryProvider;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import java.util.Map;

/* renamed from: X.8uk  reason: invalid class name and case insensitive filesystem */
public final class C369428uk implements C366548pF {
    public final ValueMapFilterModel A00;
    public final InstagramFilterFactoryProvider A01;
    public final float[] A02 = new float[16];
    public final float[] A03 = new float[16];

    public C369428uk(InstagramFilterFactoryProvider instagramFilterFactoryProvider, ValueMapFilterModel valueMapFilterModel) {
        0qQ.A0B(valueMapFilterModel, 1);
        0qQ.A0B(instagramFilterFactoryProvider, 2);
        this.A00 = valueMapFilterModel;
        this.A01 = instagramFilterFactoryProvider;
    }

    public final void ABv(FilterManagerImpl filterManagerImpl, C346337v0 r2, String str) {
    }

    public final void AC0(FilterManagerImpl filterManagerImpl) {
        0qQ.A0B(filterManagerImpl, 0);
        ValueMapFilterModel valueMapFilterModel = this.A00;
        if (filterManagerImpl.mCachedModel != valueMapFilterModel) {
            filterManagerImpl.mCachedModel = valueMapFilterModel;
            filterManagerImpl.createFilter(this.A01.createFilterFactory(valueMapFilterModel.A03));
        }
    }

    public final void ACC(FilterManagerImpl filterManagerImpl) {
        0qQ.A0B(filterManagerImpl, 0);
        ValueMapFilterModel valueMapFilterModel = this.A00;
        TypedParameterMap A002 = valueMapFilterModel.A01.A00();
        for (Map.Entry entry : A002.A02.entrySet()) {
            String str = (String) entry.getKey();
            try {
                filterManagerImpl.setFloatParameter(str, ((Number) entry.getValue()).floatValue());
            } catch (Exception e) {
                throw new RuntimeException(002.A0u("setFloatParameter() failed! Filter: ", valueMapFilterModel.A03, " Key: ", str), e);
            }
        }
        for (Map.Entry entry2 : A002.A01.entrySet()) {
            String str2 = (String) entry2.getKey();
            try {
                filterManagerImpl.setFloatArrayParameter(str2, (float[]) entry2.getValue());
            } catch (Exception e2) {
                throw new RuntimeException(002.A0u("setFloatArrayParameter() failed! Filter: ", valueMapFilterModel.A03, " Key: ", str2), e2);
            }
        }
        for (Map.Entry entry3 : A002.A03.entrySet()) {
            String str3 = (String) entry3.getKey();
            try {
                filterManagerImpl.setIntParameter(str3, ((Number) entry3.getValue()).intValue());
            } catch (Exception e3) {
                throw new RuntimeException(002.A0u("setIntParameter() failed! Filter: ", valueMapFilterModel.A03, " Key: ", str3), e3);
            }
        }
        for (Map.Entry entry4 : A002.A00.entrySet()) {
            String str4 = (String) entry4.getKey();
            try {
                filterManagerImpl.setBoolParameter(str4, ((Boolean) entry4.getValue()).booleanValue());
            } catch (Exception e4) {
                throw new RuntimeException(002.A0u("setBoolParameter() failed! Filter: ", valueMapFilterModel.A03, " Key: ", str4), e4);
            }
        }
        for (Map.Entry entry5 : A002.A04.entrySet()) {
            String str5 = (String) entry5.getKey();
            try {
                filterManagerImpl.setStringParameter(str5, (String) entry5.getValue());
            } catch (Exception e5) {
                throw new RuntimeException(002.A0u("setStringParameter() failed! Filter: ", valueMapFilterModel.A03, " Key: ", str5), e5);
            }
        }
        for (Map.Entry entry6 : A002.A05.entrySet()) {
            String str6 = (String) entry6.getKey();
            try {
                filterManagerImpl.setTextureInputPath(str6, (String) entry6.getValue());
            } catch (Exception e6) {
                throw new RuntimeException(002.A0u("setTextureInputPath() failed! Filter: ", valueMapFilterModel.A03, " Key: ", str6), e6);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0031, code lost:
        if (r8 != null) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ACB(com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl r19, float[] r20, float[] r21) {
        /*
            r18 = this;
            r14 = r21
            r10 = r20
            r9 = 0
            r3 = r19
            X.0qQ.A0B(r3, r9)
            r5 = 1
            X.0qQ.A0B(r10, r5)
            r4 = 2
            X.0qQ.A0B(r14, r4)
            r6 = r18
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r2 = r6.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r7 = r2.A02
            java.lang.Integer r0 = r7.A06
            int r0 = r0.intValue()
            r1 = 3
            if (r0 == r9) goto L_0x0038
            if (r0 == r5) goto L_0x0033
            if (r0 == r4) goto L_0x005f
            if (r0 != r1) goto L_0x0068
            float[] r8 = r6.A03
            float[] r12 = r2.A05
            r11 = r9
            r13 = r9
            android.opengl.Matrix.multiplyMM(r8, r9, r10, r11, r12, r13)
        L_0x0030:
            r10 = r8
            if (r8 == 0) goto L_0x0038
        L_0x0033:
            java.lang.String r0 = "texture_transform"
            r3.setFloatArrayParameter(r0, r10)
        L_0x0038:
            java.lang.Integer r0 = r7.A05
            int r0 = r0.intValue()
            if (r0 == r9) goto L_0x005b
            if (r0 == r5) goto L_0x0056
            if (r0 == r4) goto L_0x005c
            if (r0 != r1) goto L_0x0062
            float[] r12 = r6.A02
            float[] r0 = r2.A04
            r13 = r9
            r15 = r9
            r17 = r9
            r16 = r0
            android.opengl.Matrix.multiplyMM(r12, r13, r14, r15, r16, r17)
        L_0x0053:
            r14 = r12
            if (r12 == 0) goto L_0x005b
        L_0x0056:
            java.lang.String r0 = "content_transform"
            r3.setFloatArrayParameter(r0, r14)
        L_0x005b:
            return
        L_0x005c:
            float[] r12 = r2.A04
            goto L_0x0053
        L_0x005f:
            float[] r8 = r2.A05
            goto L_0x0030
        L_0x0062:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0068:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C369428uk.ACB(com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl, float[], float[]):void");
    }

    public final FilterModel B5t() {
        return this.A00;
    }
}
