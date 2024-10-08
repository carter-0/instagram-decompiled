package X;

import com.facebook.gltf.jni.GLTFCameraOrientation;
import com.facebook.gltf.jni.TurntableCameraControl;

public final class Y11 implements C315856kh {
    public final AnonymousClass0eM A00 = AnonymousClass0eN.A01(Y6U.A00);

    public final void E2l(float f, float f2, float f3, float f4, float f5, float f6) {
        A00(this).pinchMove(f, f2, f3, 0.0f, 0.0f, 0.0f);
    }

    public final void EaF(boolean z) {
        A00(this).setIsFullscreen(false);
    }

    public final void FJN(GLTFCameraOrientation gLTFCameraOrientation, double d) {
        0qQ.A0B(gLTFCameraOrientation, 0);
        A00(this).update(gLTFCameraOrientation, d);
    }

    public static TurntableCameraControl A00(Y11 y11) {
        return (TurntableCameraControl) y11.A00.getValue();
    }

    public final void EKo(float f) {
        A00(this).scrollUpdate(0.5f);
    }

    public final float Bcb() {
        return A00(this).getPitch();
    }

    public final float BoZ() {
        return A00(this).getRoll();
    }

    public final float CHW() {
        return A00(this).getYaw();
    }

    public final void E1d(float f, float f2) {
        A00(this).panEnd(f, f2);
    }

    public final void E1e(float f, float f2) {
        A00(this).panMove(f, f2);
    }

    public final void E1f() {
        A00(this).panStart();
    }

    public final void E2k() {
        A00(this).pinchEnd();
    }

    public final void E2m() {
        A00(this).pinchStart();
    }

    public final void EHw(float f) {
        A00(this).resetCamera();
    }

    public final void EPx(float[] fArr) {
        A00(this).setBoundingBox(fArr);
    }

    public final void Ezl(float f, float f2, float f3) {
        A00(this).tiltUpdate(f, f2, f3);
    }
}
