package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.rtc.rsys.camera.IgLiteCameraProxy;

public final class ONG {
    public final /* synthetic */ C70989OVd A00;

    public final void A01(CameraAREffect cameraAREffect, Boolean bool, String str, C62320sa r19, C62320sa r20, boolean z, boolean z2) {
        C62320sa r4 = r20;
        0qQ.A0B(r4, 6);
        C70989OVd oVd = this.A00;
        CameraAREffect cameraAREffect2 = cameraAREffect;
        GL3 gl3 = new GL3(23, cameraAREffect2, oVd, false);
        MJ8 mj8 = new MJ8(49, r4, oVd);
        C73846Pkj pkj = C73846Pkj.A00;
        0qQ.A0B(pkj, 5);
        C71143Odx odx = oVd.A0Z;
        C62320sa r11 = r19;
        0qQ.A0B(r11, 6);
        C71143Odx.A04(odx, new C41666AyI(cameraAREffect2, odx, bool, str, gl3, pkj, r11, mj8, z, z2));
    }

    public ONG(C70989OVd oVd) {
        this.A00 = oVd;
    }

    public final void A00(long j) {
        C71143Odx.A04(this.A00.A0Z, new GQ2(j, 12));
    }

    public final void A02(boolean z, int i) {
        NCZ ncz = this.A00.A0Z.A06;
        if (ncz != null && (ncz.A0B.getValue() instanceof IgLiteCameraProxy)) {
            NCn A002 = NCZ.A00(ncz);
            0qQ.A0C(A002, "null cannot be cast to non-null type com.instagram.rtc.rsys.camera.IgLiteCameraProxy");
            AnonymousClass9g8 A003 = C39870ACr.A00(((IgLiteCameraProxy) A002).A03(), true);
            if (A003 != null) {
                A003.A01 = z;
                A003.A00(811);
                synchronized (A003) {
                    ColorFilter colorFilter = A003.A00;
                    if (colorFilter != null) {
                        colorFilter.A00 = ((float) i) / 100.0f;
                    }
                }
            }
        }
    }
}
