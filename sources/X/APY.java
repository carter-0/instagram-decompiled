package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;

public final /* synthetic */ class APY implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass8KK A00;

    public /* synthetic */ APY(AnonymousClass8KK r1) {
        this.A00 = r1;
    }

    public final void onChanged(Object obj) {
        C366398or r0;
        AnonymousClass8KK r6 = this.A00;
        float A04 = AnonymousClass7TE.A04(obj);
        TransformMatrixConfig transformMatrixConfig = r6.A01;
        if (transformMatrixConfig != null && (r0 = r6.A00) != null) {
            boolean z = true;
            r0.A00 = true;
            TransformMatrixParams transformMatrixParams = transformMatrixConfig.A08;
            transformMatrixParams.A01 = A04;
            transformMatrixParams.A00 = 0.0f;
            transformMatrixConfig.A04(0.0f);
            transformMatrixConfig.A05(0.0f);
            AnonymousClass8KK.A02(r6);
            if (r6.A09.A02.A01.A04 != null) {
                if (!182.A06(0Tu.A05, r6.A08, 36322989393849045L)) {
                    C366398or r1 = r6.A00;
                    if (A04 == 1.0f) {
                        z = false;
                    }
                    r1.A00 = z;
                }
            }
        }
    }
}
