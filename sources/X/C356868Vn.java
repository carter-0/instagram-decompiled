package X;

import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;

/* renamed from: X.8Vn  reason: invalid class name and case insensitive filesystem */
public final class C356868Vn implements AnonymousClass82C {
    public final /* synthetic */ C356858Vm A00;

    public C356868Vn(C356858Vm r1) {
        this.A00 = r1;
    }

    public final void DBZ(CameraAREffect cameraAREffect, boolean z, boolean z2) {
        AnonymousClass84B r6;
        if (!z) {
            C3504784u r10 = null;
            CameraAREffect cameraAREffect2 = cameraAREffect;
            String str = cameraAREffect2.A0B;
            C356858Vm r2 = this.A00;
            AnonymousClass848 r1 = r2.A0D;
            0qQ.A0A(cameraAREffect2);
            String str2 = cameraAREffect2.A0K;
            0qQ.A07(str2);
            if (r1.A02(str2)) {
                r6 = ((AnonymousClass84D) r1.A00.getValue()).A00;
            } else {
                r6 = null;
            }
            C357638Yz r5 = r2.A0I;
            C3494680m r4 = r5.A08;
            if (r4.A00 instanceof AnonymousClass80O) {
                C394779yg.A00(r2.A0H).A01(C390939s5.SELECTED_EFFECT);
            }
            UserSession userSession = r2.A0H;
            String str3 = cameraAREffect2.A0K;
            String str4 = cameraAREffect2.A0M;
            0qQ.A07(str4);
            String str5 = cameraAREffect2.A0C;
            Integer A0N = r2.A0K.A0N();
            Integer A08 = r5.A08();
            C279284yO r8 = (C279284yO) r4.A00;
            AnonymousClass8DO r9 = r2.A0Q;
            AnonymousClass80D r22 = r2.A0M;
            if (r22.A3d) {
                r10 = r22.A1p;
            }
            String str6 = str5;
            C59895JbK.A0F(r6, userSession, r8, r9, r10, A0N, A08, str3, str4, str, str6, cameraAREffect2.A0I, 1, z2, cameraAREffect2.CbC(), false);
        }
    }
}
