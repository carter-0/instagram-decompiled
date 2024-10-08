package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;

/* renamed from: X.9PO  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9PO implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass8LU A00;

    public /* synthetic */ AnonymousClass9PO(AnonymousClass8LU r1) {
        this.A00 = r1;
    }

    public final void onChanged(Object obj) {
        AnonymousClass8LU r5 = this.A00;
        C354188Kz r3 = r5.A0o;
        float floatValue = ((Number) obj).floatValue();
        C366398or r6 = r3.A04;
        TransformMatrixConfig transformMatrixConfig = r3.A05;
        if (!(transformMatrixConfig == null || r6 == null)) {
            r6.A00 = true;
            TransformMatrixParams transformMatrixParams = transformMatrixConfig.A08;
            transformMatrixParams.A01 = floatValue;
            transformMatrixParams.A00 = 0.0f;
            transformMatrixConfig.A04(0.0f);
            transformMatrixConfig.A05(0.0f);
            C354188Kz.A03(r3);
            boolean z = false;
            if (floatValue == 1.0f && r3.A0E.A02.A01.A04 != null) {
                if (!182.A06(0Tu.A05, r3.A0C, 36322989393849045L)) {
                    z = true;
                }
            }
            r6.A00 = !z;
        }
        C378369Pn r0 = r5.A0B;
        if (r0 != null) {
            r0.A02();
        }
    }
}
