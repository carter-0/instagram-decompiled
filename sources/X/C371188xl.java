package X;

import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.camera.effect.mq.IgCameraEffectsController;

/* renamed from: X.8xl  reason: invalid class name and case insensitive filesystem */
public final class C371188xl extends 0ng {
    public final /* synthetic */ CameraAREffect A00;
    public final /* synthetic */ IgCameraEffectsController A01;
    public final /* synthetic */ C371148xg A02;
    public final /* synthetic */ C371158xh A03;
    public final /* synthetic */ String A04;

    public final void run() {
        C352718Eo r0;
        IgCameraEffectsController igCameraEffectsController = this.A01;
        CameraAREffect cameraAREffect = this.A00;
        C371148xg r2 = this.A02;
        boolean z = false;
        if (cameraAREffect.A0Z.get("avatarSDK") != null) {
            z = true;
        }
        AnonymousClass8yN r4 = null;
        if (z) {
            r4 = new AnonymousClass8yN(new AQS(igCameraEffectsController, r2), (String) null);
        }
        String str = this.A04;
        C371208xn r3 = new C371208xn(igCameraEffectsController.A0I, igCameraEffectsController, this.A03, str);
        C312196dz r22 = igCameraEffectsController.A0L;
        if (r22 != null) {
            C340307l3 r02 = igCameraEffectsController.A08;
            if (r02 != null) {
                r0 = r02.ALQ();
            } else {
                0kD.A01("IgCameraEffectsController", "mCameraController is unexpectedly null");
                r0 = new C352718Eo();
            }
            String str2 = cameraAREffect.A0Q;
            if (str2 != null) {
                r0.A04 = str2;
            }
            r22.Cg9(r4, r0.A00(), cameraAREffect, r3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C371188xl(CameraAREffect cameraAREffect, IgCameraEffectsController igCameraEffectsController, C371148xg r4, C371158xh r5, String str) {
        super(704592045);
        this.A01 = igCameraEffectsController;
        this.A00 = cameraAREffect;
        this.A02 = r4;
        this.A04 = str;
        this.A03 = r5;
    }
}
