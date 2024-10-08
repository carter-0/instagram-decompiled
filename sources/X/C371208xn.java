package X;

import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.camera.effect.mq.IgCameraEffectsController;

/* renamed from: X.8xn  reason: invalid class name and case insensitive filesystem */
public final class C371208xn implements C371218xo {
    public final /* synthetic */ C312156dv A00;
    public final /* synthetic */ IgCameraEffectsController A01;
    public final /* synthetic */ C371158xh A02;
    public final /* synthetic */ String A03;

    public C371208xn(C312156dv r1, IgCameraEffectsController igCameraEffectsController, C371158xh r3, String str) {
        this.A01 = igCameraEffectsController;
        this.A02 = r3;
        this.A03 = str;
        this.A00 = r1;
    }

    public final void DBV(C371458yK r7, C8993RKl rKl, CameraAREffect cameraAREffect) {
        boolean z;
        C3497681r r4;
        String str;
        C371158xh r5 = this.A02;
        if (rKl != null) {
            String str2 = this.A03;
            z = false;
            0qQ.A0B(str2, 0);
            0kD.A07("CameraEffectFacade", "Unable to load the effect", rKl);
            r4 = r5.A01.A03;
            r4.AVc(rKl, str2);
            r5.A00.A00();
        } else {
            String str3 = this.A03;
            z = false;
            0qQ.A0B(str3, 0);
            r4 = r5.A01.A03;
            r4.Cln(str3);
            C252683pV r1 = r5.A00.A00;
            if (!r1.CQG()) {
                C301205yj.A00(C371558yb.A00, r1);
                r1.AI3((Throwable) null);
            }
        }
        IgCameraEffectsController igCameraEffectsController = this.A01;
        if (cameraAREffect != igCameraEffectsController.A09) {
            if (cameraAREffect != null) {
                String str4 = cameraAREffect.A0K;
                0qQ.A0B(str4, z ? 1 : 0);
                r4.FMm(str4, "stale_request");
            }
            if (r7 != null && (str = r7.A02) != null) {
                C312156dv r3 = this.A00;
                r3.endCancel(r3.getInstanceIdWithString(16321564, str), "User switches to new effect before ARD fetch success");
                return;
            }
            return;
        }
        igCameraEffectsController.A00 = r7;
        igCameraEffectsController.A0D = z;
        IgCameraEffectsController.A01(C312596el.USER_INTERACTION, igCameraEffectsController, "onEffectLoaded", z, z);
    }

    public final void Deo(C352728Ep r5, String str) {
        C371158xh r3 = this.A02;
        String str2 = r5.A00;
        String str3 = r5.A01;
        0qQ.A0B(str, 0);
        r3.A01.A03.Clo(str, str2, str3);
    }
}
