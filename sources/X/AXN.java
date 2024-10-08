package X;

import com.instagram.camera.effect.models.CameraAREffect;

public final class AXN implements AnonymousClass82C {
    public final int A00;
    public final Object A01;

    public AXN(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DBZ(CameraAREffect cameraAREffect, boolean z, boolean z2) {
        switch (this.A00) {
            case 0:
                String str = cameraAREffect.A0K;
                0qQ.A07(str);
                C301205yj.A00(new A3Y(str), (C249523jv) this.A01);
                return;
            case 1:
                C249523jv r2 = (C249523jv) this.A01;
                String str2 = cameraAREffect.A0K;
                0qQ.A07(str2);
                C301205yj.A00(new A3Y(str2), r2);
                r2.AI3((Throwable) null);
                return;
            case 2:
                ((C40375Ab8) this.A01).A09.A00();
                02m.A0p.markerEnd(181540910, 2);
                return;
            default:
                C14270Tst tst = C14273Tsw.A0X;
                C17703VcY vcY = ((C14273Tsw) this.A01).A0K;
                if (vcY != null) {
                    vcY.A05.A0G.remove(this);
                    return;
                }
                return;
        }
    }
}
