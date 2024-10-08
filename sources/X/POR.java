package X;

import android.content.Intent;
import android.graphics.Point;

public final class POR implements C74487Pvh {
    public final /* synthetic */ C70989OVd A00;

    public POR(C70989OVd oVd) {
        this.A00 = oVd;
    }

    public final void APN() {
        C71143Odx.A04(this.A00.A0Z, C74145Ppm.A00);
    }

    public final void DWk() {
        C71143Odx.A04(this.A00.A0Z, C74139Ppg.A00);
    }

    public final void EzT() {
        C71143Odx odx = this.A00.A0Z;
        C71143Odx.A04(odx, new C74186PqS(18, (Object) odx, (Object) AnonymousClass05K.A00));
    }

    public final void FJc(boolean z) {
        C71143Odx.A04(this.A00.A0Z, new GL4(z, 14));
    }

    public final void ARe(Intent intent, Point point) {
        AnonymousClass7TG.A1N(intent, point);
        C71143Odx.A04(this.A00.A0Z, new C74186PqS(19, (Object) intent, (Object) point));
    }
}
