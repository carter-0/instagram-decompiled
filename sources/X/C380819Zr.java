package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.InstagramFilterFactoryProvider;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.PanFilter;

/* renamed from: X.9Zr  reason: invalid class name and case insensitive filesystem */
public final class C380819Zr extends C367538r5 {
    public final float[] A00 = new float[16];

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r1 == 3) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ACB(com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl r7, float[] r8, float[] r9) {
        /*
            r6 = this;
            r0 = 0
            X.0qQ.A0B(r7, r0)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r5 = r6.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.PanFilter r5 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.PanFilter) r5
            int r1 = r5.A01
            r4 = 12
            r3 = 1077936128(0x40400000, float:3.0)
            r2 = 1082130432(0x40800000, float:4.0)
            if (r1 == 0) goto L_0x003b
            r0 = 1
            if (r1 == r0) goto L_0x001d
            r0 = 2
            r4 = 13
            if (r1 == r0) goto L_0x003b
            r0 = 3
            if (r1 != r0) goto L_0x0026
        L_0x001d:
            float[] r1 = r5.A06
            float r0 = r5.A00
            float r0 = r0 * r2
            float r0 = r0 - r3
            float r0 = -r0
        L_0x0024:
            r1[r4] = r0
        L_0x0026:
            float[] r2 = r5.A06
            float[] r1 = r6.A00
            int r0 = r2.length
            X.0Yw.A0S(r2, r1, r0)
            java.lang.String r0 = "texture_transform"
            r7.setFloatArrayParameter(r0, r1)
            float[] r1 = r5.A05
            java.lang.String r0 = "content_transform"
            r7.setFloatArrayParameter(r0, r1)
            return
        L_0x003b:
            float[] r1 = r5.A06
            float r0 = r5.A00
            float r0 = r0 * r2
            float r0 = r0 - r3
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C380819Zr.ACB(com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl, float[], float[]):void");
    }

    public final void ACC(FilterManagerImpl filterManagerImpl) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C380819Zr(InstagramFilterFactoryProvider instagramFilterFactoryProvider, PanFilter panFilter) {
        super(instagramFilterFactoryProvider, panFilter);
        AnonymousClass7TG.A1O(panFilter, instagramFilterFactoryProvider);
    }
}
