package X;

import android.os.Bundle;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.List;

/* renamed from: X.ARs  reason: case insensitive filesystem */
public final class C40105ARs implements AnonymousClass6e9, C41801B1g {
    public B32 A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public final void EQP(Integer num) {
    }

    public final void ER8(Integer num) {
    }

    public final List EzQ(Bundle bundle) {
        B32 b32;
        0qQ.A0B(bundle, 0);
        if (bundle.containsKey("commandType")) {
            int i = bundle.getInt("commandType");
            if (i == 0) {
                if (bundle.containsKey("position")) {
                    int i2 = bundle.getInt("position");
                    B32 b322 = this.A00;
                    if (b322 != null) {
                        b322.setCaptureDevicePosition(i2);
                    }
                }
            } else if (i == 1) {
                if (bundle.containsKey("captureContext")) {
                    int i3 = bundle.getInt("captureContext");
                    B32 b323 = this.A00;
                    if (b323 != null) {
                        b323.setCaptureContext(i3);
                        return null;
                    }
                }
            } else if (i == 2) {
                if (bundle.containsKey(IgReactMediaPickerNativeModule.WIDTH) && bundle.containsKey(IgReactMediaPickerNativeModule.HEIGHT)) {
                    int i4 = bundle.getInt(IgReactMediaPickerNativeModule.WIDTH);
                    int i5 = bundle.getInt(IgReactMediaPickerNativeModule.HEIGHT);
                    B32 b324 = this.A00;
                    if (b324 != null) {
                        b324.setCaptureDeviceSize(i4, i5);
                        return null;
                    }
                }
            } else if (i == 3) {
                if (bundle.containsKey(IgReactMediaPickerNativeModule.WIDTH) && bundle.containsKey(IgReactMediaPickerNativeModule.HEIGHT) && bundle.containsKey("density")) {
                    int i6 = bundle.getInt(IgReactMediaPickerNativeModule.WIDTH);
                    int i7 = bundle.getInt(IgReactMediaPickerNativeModule.HEIGHT);
                    float f = bundle.getFloat("density");
                    B32 b325 = this.A00;
                    if (b325 != null) {
                        b325.setPreviewViewInfo(i6, i7, f);
                        return null;
                    }
                }
            } else if (i == 4) {
                if (bundle.containsKey("deviceRotation")) {
                    int i8 = bundle.getInt("deviceRotation");
                    B32 b326 = this.A00;
                    if (b326 != null) {
                        b326.setRotation(i8);
                        return null;
                    }
                }
            } else if (i == 5) {
                if (bundle.containsKey("top") && bundle.containsKey("left") && bundle.containsKey("bottom") && bundle.containsKey("right")) {
                    int i9 = bundle.getInt("top");
                    int i10 = bundle.getInt("left");
                    int i11 = bundle.getInt("bottom");
                    int i12 = bundle.getInt("right");
                    B32 b327 = this.A00;
                    if (b327 != null) {
                        b327.setEffectSafeAreaInsets(i9, i10, i11, i12);
                        return null;
                    }
                }
            } else if (i == 6) {
                if (bundle.containsKey("zoomFactor")) {
                    float f2 = bundle.getFloat("zoomFactor");
                    B32 b328 = this.A00;
                    if (b328 != null) {
                        b328.setZoomFactor(f2);
                        return null;
                    }
                }
            } else if (i == 7) {
                B32 b329 = this.A00;
                if (b329 != null) {
                    b329.startRecording();
                    return null;
                }
            } else if (i == 8) {
                B32 b3210 = this.A00;
                if (b3210 != null) {
                    b3210.stopRecording();
                    return null;
                }
            } else if (i == 9) {
                B32 b3211 = this.A00;
                if (b3211 != null) {
                    b3211.capturePhoto();
                    return null;
                }
            } else if (i == 10 && (b32 = this.A00) != null) {
                b32.finishCapturePhoto();
                return null;
            }
        }
        return null;
    }

    public final void capturePhoto() {
    }

    public final void finishCapturePhoto() {
    }

    public final void setCaptureDeviceSize(int i, int i2) {
    }

    public final void setPreviewViewInfo(int i, int i2, float f) {
    }

    public final void setRotation(int i) {
    }

    public final void setZoomFactor(float f) {
    }

    public final void startRecording() {
    }

    public final void stop() {
        this.A00 = null;
    }

    public final void stopRecording() {
    }

    public final int Bp1() {
        return this.A02;
    }

    public final int Bp2() {
        return this.A03;
    }

    public final int Bp3() {
        return this.A04;
    }

    public final int Bp4() {
        return this.A05;
    }

    public final float CHe() {
        return this.A01;
    }

    public C40105ARs(int i, int i2, int i3, int i4, float f) {
        this.A05 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A04 = i4;
        this.A01 = f;
    }

    public final void A8v(B32 b32) {
        this.A00 = b32;
    }
}
