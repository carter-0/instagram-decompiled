package X;

import android.content.Context;
import com.facebook.rsys.camera.gen.Camera;
import com.facebook.rsys.camera.gen.CameraApi;
import java.util.ArrayList;
import org.webrtc.EglBase;
import org.webrtc.SurfaceTextureHelper;

/* renamed from: X.9qF  reason: invalid class name and case insensitive filesystem */
public final class C389809qF extends NCn {
    public CameraApi A00;
    public String A01 = Camera.FRONT_FACING_CAMERA.identifier;
    public SurfaceTextureHelper A02;
    public final C340307l3 A03;
    public final OAP A04;
    public final EglBase.Context A05;
    public final Context A06;
    public final AnonymousClass8GD A07 = new C382569du(this, 8);

    public final boolean isSwitchCameraFacingSupported() {
        return true;
    }

    public final void setApi(CameraApi cameraApi) {
        0qQ.A0B(cameraApi, 0);
        this.A00 = cameraApi;
    }

    public final void setCameraMode(int i) {
    }

    public final void setTargetCaptureResolution(int i, int i2) {
    }

    public final int setTargetCaptureSettings(int i, int i2, int i3) {
        return 0;
    }

    public final void setTargetFps(int i) {
    }

    public final ArrayList createAvailableCameras() {
        return ADX.A00.A00(this.A06);
    }

    public final CameraApi getApi() {
        CameraApi cameraApi = this.A00;
        if (cameraApi != null) {
            return cameraApi;
        }
        throw AnonymousClass7TE.A0z(C66579MXk.A00(166));
    }

    public final boolean isCameraCurrentlyFacingFront() {
        return 0qQ.A0K(this.A01, Camera.FRONT_FACING_CAMERA.identifier);
    }

    public final void release() {
        SurfaceTextureHelper surfaceTextureHelper = this.A02;
        if (surfaceTextureHelper != null) {
            this.A03.disconnect();
            surfaceTextureHelper.dispose();
            this.A02 = null;
        }
    }

    public final void setCamera(Camera camera) {
        if (camera != null && !0qQ.A0K(camera.identifier, this.A01)) {
            this.A03.EzI(this.A07);
            this.A01 = camera.identifier;
        }
    }

    public final void setCameraOn(boolean z, int i) {
        if (z) {
            CameraApi cameraApi = this.A00;
            if (cameraApi != null) {
                cameraApi.setCameraState(1);
            }
            SurfaceTextureHelper surfaceTextureHelper = this.A02;
            if (surfaceTextureHelper == null) {
                surfaceTextureHelper = SurfaceTextureHelper.create("rsys_live_camera_capture", this.A05);
                0qQ.A07(surfaceTextureHelper);
            }
            this.A02 = surfaceTextureHelper;
            surfaceTextureHelper.stopListening();
            surfaceTextureHelper.setTextureSize(405, 720);
            surfaceTextureHelper.startListening(new C73544Peb(this));
            OAP oap = this.A04;
            C40692Ah9 ah9 = new C40692Ah9(surfaceTextureHelper.surfaceTexture);
            if (C65819M0l.A0K != null) {
                oap.A00.A01 = ah9;
                return;
            }
            C18594Vul vul = C65819M0l.A0L;
            if (vul != null) {
                vul.A04(AnonymousClass7TE.A1I(ah9));
                return;
            }
            return;
        }
        this.A03.EyH((AnonymousClass8GD) null);
        SurfaceTextureHelper surfaceTextureHelper2 = this.A02;
        if (surfaceTextureHelper2 != null) {
            surfaceTextureHelper2.stopListening();
        }
        CameraApi cameraApi2 = this.A00;
        if (cameraApi2 != null) {
            cameraApi2.setCameraState(0);
        }
    }

    public C389809qF(Context context, C340307l3 r4, OAP oap, EglBase.Context context2) {
        this.A06 = context;
        this.A03 = r4;
        this.A04 = oap;
        this.A05 = context2;
    }
}
