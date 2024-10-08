package X;

import android.graphics.SurfaceTexture;
import android.view.WindowManager;

public final class AXP implements XBS {
    public SurfaceTexture A00;
    public int A01;
    public int A02;
    public final Object A03 = new Object();
    public final WindowManager A04;
    public final C40097ARj A05;

    public final void onCameraClosed() {
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.7v7] */
    public final C346407v7 BHQ() {
        Integer num;
        if (this.A01 == 1) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A01;
        }
        ? obj = new Object();
        obj.A00 = num;
        return obj;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.7v8] */
    public final C346417v8 BHV() {
        int rotation = this.A04.getDefaultDisplay().getRotation();
        int i = this.A02;
        ? obj = new Object();
        obj.A00 = rotation;
        obj.A01 = i;
        return obj;
    }

    public final SurfaceTexture BHY() {
        SurfaceTexture surfaceTexture;
        Object obj = this.A03;
        synchronized (obj) {
            if (this.A00 == null) {
                try {
                    obj.wait(2000);
                } catch (InterruptedException e) {
                    0KC.A0F("IgCameraVideoInputV1", "Wait for SurfaceTexture was interrupted", e);
                }
                if (this.A00 == null) {
                    0wb.A02(0kg.A07, "IgCameraVideoInputV1", "MP: Failed SurfaceTexture creation for camera preview", AnonymousClass7TE.A0z("Failed SurfaceTexture creation for camera preview"));
                }
            }
            surfaceTexture = this.A00;
        }
        return surfaceTexture;
    }

    public final C365408n3 CE6() {
        return this.A05;
    }

    public final void EQR(int i, int i2) {
        C40097ARj aRj = this.A05;
        aRj.A0G = new C365368mz(i2, i, i, i2, 0, 0);
        C346337v0 r2 = aRj.A03;
        if (r2 != null) {
            r2.A00(aRj.A0G.A02, aRj.A0G.A01);
        }
    }

    public AXP(WindowManager windowManager) {
        this.A04 = windowManager;
        this.A05 = new C40097ARj(new C380689Zd(), C365378n0.DISABLE, C365138mb.A01, C365468nA.CROP, this);
    }

    public final void EQO(int i) {
        this.A01 = i;
    }

    public final void Ejw(int i) {
        this.A02 = i;
    }
}
