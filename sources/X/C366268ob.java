package X;

import com.instagram.camera.effect.models.CameraAREffect;
import java.util.Map;

/* renamed from: X.8ob  reason: invalid class name and case insensitive filesystem */
public final class C366268ob implements AnonymousClass8DE {
    public final /* synthetic */ C366258oa A00;

    public C366268ob(C366258oa r1) {
        this.A00 = r1;
    }

    public final void AVf(AnonymousClass87G r17, Map map) {
        boolean z;
        C366068o8 r1 = this.A00.A07;
        C314446iH r0 = r1.A03;
        if (r0 != null) {
            z = r0.COT();
        } else {
            z = false;
        }
        C366098oB r3 = r1.A0F;
        CameraAREffect A002 = r17.A00();
        if (A002 != null) {
            27r A01 = 27p.A01(r3.A00);
            String str = A002.A0K;
            C59725JVj jVj = C59725JVj.POST_CAPTURE;
            C279294yP A003 = C359198cG.A00(r3.A01);
            String str2 = A002.A0B;
            CameraAREffect A004 = r17.A00();
            boolean z2 = true;
            if (A004 == null || !A004.CbC()) {
                z2 = false;
            }
            A01.A13(A003, jVj, str, (String) null, str2, map, (Map) null, -1, 2, z2, z);
        }
    }

    public final int BMI() {
        return C366258oa.A00(this.A00);
    }
}
