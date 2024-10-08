package X;

import com.facebook.gltf.jni.GltfRenderSession;
import com.facebook.gltf.jni.Photo3DCameraControl;

/* renamed from: X.SHh  reason: case insensitive filesystem */
public final class C11247SHh {
    public int A00;
    public int A01;
    public C10325RqN A02;
    public boolean A03;
    public boolean A04;
    public final C315826kc A05;

    public C11247SHh(C315826kc r2) {
        0qQ.A0B(r2, 2);
        this.A05 = r2;
    }

    public static final void A00(C11247SHh sHh) {
        float cameraZ;
        int i;
        C10325RqN rqN = sHh.A02;
        if (sHh.A04 && rqN != null) {
            C315856kh r4 = sHh.A05.A00;
            float[] boundingBox = ((GltfRenderSession) rqN.A00.getValue()).getBoundingBox();
            0qQ.A07(boundingBox);
            r4.EPx(boundingBox);
            if (r4 instanceof Y10) {
                Y10 y10 = (Y10) r4;
                AnonymousClass0eM r1 = rqN.A00;
                float extrasHFov = ((GltfRenderSession) r1.getValue()).getExtrasHFov();
                float extrasVFov = ((GltfRenderSession) r1.getValue()).getExtrasVFov();
                float tan = (float) Math.tan((double) (extrasHFov / 2.0f));
                float tan2 = (float) Math.tan((double) (extrasVFov / 2.0f));
                if (tan2 > 0.0f && (i = sHh.A00) > 0) {
                    float f = tan / tan2;
                    float f2 = ((float) sHh.A01) / ((float) i);
                    if (f < f2) {
                        extrasVFov = ((float) Math.atan((double) (tan / f2))) * 2.0f;
                    } else if (f > f2) {
                        extrasHFov = ((float) Math.atan((double) (tan2 * f2))) * 2.0f;
                    }
                }
                ((Photo3DCameraControl) y10.A00.getValue()).setHVFov(extrasHFov, extrasVFov);
            }
            if (sHh.A03) {
                cameraZ = 3.0f;
            } else {
                cameraZ = ((GltfRenderSession) rqN.A00.getValue()).getCameraZ();
            }
            r4.EHw(cameraZ);
        }
    }

    public final void A01() {
        C10325RqN rqN = this.A02;
        if (rqN != null) {
            ((GltfRenderSession) rqN.A00.getValue()).release();
            this.A02 = null;
        }
    }
}
