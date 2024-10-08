package X;

import android.os.Handler;
import java.io.File;

/* renamed from: X.7tq  reason: invalid class name and case insensitive filesystem */
public final class C345637tq extends C344467ru implements C345647tr {
    public final C39904AIm A00;

    public final void ESa(Integer num) {
        0qQ.A0B(num, 0);
        this.A00.A04 = num;
    }

    public final void ESZ(Integer num) {
        this.A00.A03 = num;
    }

    public final void Ef7(int i, int i2) {
        C39904AIm aIm = this.A00;
        if (C39904AIm.A03(aIm)) {
            aIm.A01 = i;
            aIm.A00 = i2;
            return;
        }
        aIm.A06.post(new C41109AoV(aIm, i, i2));
    }

    public final void EzZ(A3G a3g, File file, boolean z) {
        this.A00.A04(a3g, true);
    }

    public C345637tq(C343837qt r5) {
        this.A00 = r5;
        C344407ro r3 = (C344407ro) A09(C343737qi.A00, new C344407ro());
        Handler handler = (Handler) r5.Apu(C343737qi.A0I);
        if (handler == null) {
            C343937r3 r1 = C343927r2.A00;
            C343837qt r0 = this.A00;
            r0.getClass();
            handler = ((C343927r2) r0.Apf(r1)).BAM("Lite-SurfacePipe-Thread");
        }
        this.A00 = new C39904AIm(handler, r5, r3, ((Boolean) A09(B35.A02, false)).booleanValue());
    }
}
