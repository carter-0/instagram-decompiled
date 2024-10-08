package X;

import android.os.Bundle;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.List;

/* renamed from: X.ARr  reason: case insensitive filesystem */
public final class C40104ARr implements B32, B38 {
    public float A00 = 1.0f;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final List A05 = AnonymousClass7TE.A1C();

    public final void FKT(Bundle bundle) {
    }

    public static 0eP A00() {
        return new 0eP("serviceType", 12);
    }

    public final void CMw(C371698yt r4) {
        int i;
        int i2;
        int i3;
        float f;
        AnonymousClass6e9 r0;
        AnonymousClass6e9 r02;
        AnonymousClass6e9 r03;
        AnonymousClass6e9 r04;
        AnonymousClass6e9 r05;
        AnonymousClass6e9 r06;
        if (r4 != null) {
            C371628yi r1 = C371678yq.A01;
            if (C371698yt.A01(r4, r1)) {
                C371678yq r2 = (C371678yq) r4.A02(r1);
                int i4 = 0;
                if (r2 == null || (r06 = r2.A00) == null) {
                    i = 0;
                } else {
                    i = r06.Bp4();
                }
                this.A04 = i;
                if (r2 == null || (r05 = r2.A00) == null) {
                    i2 = 0;
                } else {
                    i2 = r05.Bp2();
                }
                this.A02 = i2;
                if (r2 == null || (r04 = r2.A00) == null) {
                    i3 = 0;
                } else {
                    i3 = r04.Bp1();
                }
                this.A01 = i3;
                if (!(r2 == null || (r03 = r2.A00) == null)) {
                    i4 = r03.Bp3();
                }
                this.A03 = i4;
                if (r2 == null || (r02 = r2.A00) == null) {
                    f = 1.0f;
                } else {
                    f = r02.CHe();
                }
                setZoomFactor(f);
                if (r2 != null && (r0 = r2.A00) != null) {
                    r0.A8v(this);
                }
            }
        }
    }

    public final List EzR() {
        List list = this.A05;
        if (list.isEmpty()) {
            return null;
        }
        List A0a = 00k.A0a(list);
        list.clear();
        return A0a;
    }

    public final void capturePhoto() {
        AnonymousClass7TH.A0d(AnonymousClass05K.A1I, this.A05, A00());
    }

    public final void finishCapturePhoto() {
        AnonymousClass7TH.A0d(AnonymousClass05K.A02, this.A05, A00());
    }

    public final void setCaptureContext(int i) {
        AnonymousClass7TH.A0c("captureContext", Integer.valueOf(i), this.A05, A00(), AnonymousClass7TH.A0J(AnonymousClass05K.A01));
    }

    public final void setCaptureDevicePosition(int i) {
        AnonymousClass7TH.A0c("position", Integer.valueOf(i), this.A05, A00(), AnonymousClass7TH.A0J(AnonymousClass05K.A00));
    }

    public final void setCaptureDeviceSize(int i, int i2) {
        AnonymousClass7TH.A0f(this.A05, AnonymousClass7TH.A0h(IgReactMediaPickerNativeModule.HEIGHT, Integer.valueOf(i2), A00(), AnonymousClass7TH.A0J(AnonymousClass05K.A0C), AnonymousClass7TE.A1L(IgReactMediaPickerNativeModule.WIDTH, Integer.valueOf(i))));
    }

    public final void setEffectSafeAreaInsets(int i, int i2, int i3, int i4) {
        AnonymousClass7TH.A0f(this.A05, new 0eP[]{A00(), AnonymousClass7TH.A0J(AnonymousClass05K.A0j), AnonymousClass7TE.A1L("top", Integer.valueOf(i)), AnonymousClass7TE.A1L("left", Integer.valueOf(i2)), AnonymousClass7TE.A1L("bottom", Integer.valueOf(i3)), AnonymousClass7TE.A1L("right", Integer.valueOf(i4))});
    }

    public final void setPreviewViewInfo(int i, int i2, float f) {
        AnonymousClass7TH.A0f(this.A05, new 0eP[]{A00(), AnonymousClass7TH.A0J(AnonymousClass05K.A0N), AnonymousClass7TE.A1L(IgReactMediaPickerNativeModule.WIDTH, Integer.valueOf(i)), AnonymousClass7TE.A1L(IgReactMediaPickerNativeModule.HEIGHT, Integer.valueOf(i2)), AnonymousClass7TE.A1L("density", Float.valueOf(f))});
    }

    public final void setRotation(int i) {
        AnonymousClass7TH.A0c("deviceRotation", Integer.valueOf(i), this.A05, A00(), AnonymousClass7TH.A0J(AnonymousClass05K.A0Y));
    }

    public final void setZoomFactor(float f) {
        this.A00 = f;
        AnonymousClass7TH.A0c("zoomFactor", Float.valueOf(f), this.A05, A00(), AnonymousClass7TH.A0J(AnonymousClass05K.A0u));
    }

    public final void startRecording() {
        AnonymousClass7TH.A0d(AnonymousClass05K.A15, this.A05, A00());
    }

    public final void stopRecording() {
        AnonymousClass7TH.A0d(AnonymousClass05K.A1F, this.A05, A00());
    }

    public final Bundle BH4() {
        return Q21.A00(A00(), AnonymousClass7TE.A1L("safeAreaTop", Integer.valueOf(this.A04)), AnonymousClass7TE.A1L("safeAreaLeft", Integer.valueOf(this.A02)), AnonymousClass7TE.A1L("safeAreaBottom", Integer.valueOf(this.A01)), AnonymousClass7TE.A1L("safeAreaRight", Integer.valueOf(this.A03)), AnonymousClass7TE.A1L("zoomFactor", Float.valueOf(this.A00)));
    }
}
