package X;

import android.os.Handler;
import java.io.File;

/* renamed from: X.7ts  reason: invalid class name and case insensitive filesystem */
public final class C345657ts extends C344467ru implements C344397rn, C345647tr {
    public C39904AIm A00;
    public C345547th A01;
    public C346027uT A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Handler A07;
    public final A3D A08 = new A3D(this);
    public final C344337rh A09 = new AU2(this);
    public final C341147mP A0A;
    public final C3496981j A0B = new C3496981j();
    public final C344407ro A0C;

    public final void AQS(Runnable runnable) {
    }

    public final boolean EAg() {
        return false;
    }

    public final /* synthetic */ void Eeo(C341907ni r1, Object obj) {
    }

    public final /* synthetic */ void Egk(C341837nb r1) {
    }

    public final void A9j(C346027uT r4) {
        this.A00.A02.BQ8().A8c(new C346037uU(this.A0C, r4), 0);
    }

    public final void AAM(C341027mD r8) {
        C341027mD r1 = r8;
        if (this.A0B.A01(r8)) {
            C39904AIm aIm = this.A00;
            int i = aIm.A01;
            int i2 = aIm.A00;
            if (i > 0 && i2 > 0) {
                r1.DVh(i, i2, 0, 0, this.A03);
            }
        }
    }

    public final C341047mF C3L() {
        throw new UnsupportedOperationException();
    }

    public final boolean CKl() {
        return this.A00.A02.CKm();
    }

    public final void EEN(C346027uT r3) {
        this.A00.A02.BQ8().EDi(0, r3);
    }

    public final void EEg(C341027mD r2) {
        this.A0B.A02(r2);
    }

    public final void ESZ(Integer num) {
        this.A00.A03 = num;
    }

    public final void ESa(Integer num) {
        this.A00.A04 = num;
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

    public final void EgY(boolean z) {
        C346027uT r0 = this.A02;
        if (r0 != null) {
            r0.A0D = z;
        }
    }

    public final void EqK(C341827na r2) {
        throw new UnsupportedOperationException();
    }

    public final void EzZ(A3G a3g, File file, boolean z) {
        boolean z2 = false;
        if (this.A0A == null) {
            z2 = true;
        }
        this.A00.A04(a3g, z2);
    }

    public C345657ts(C343837qt r6) {
        this.A00 = r6;
        C344407ro r4 = (C344407ro) A09(C343737qi.A00, new C344407ro());
        this.A0C = r4;
        Handler handler = (Handler) r6.Apu(C343737qi.A0I);
        if (handler == null) {
            C343937r3 r1 = C343927r2.A00;
            C343837qt r0 = this.A00;
            r0.getClass();
            handler = ((C343927r2) r0.Apf(r1)).BAM("Lite-SurfacePipe-Thread");
        }
        this.A07 = handler;
        boolean booleanValue = ((Boolean) A09(B35.A02, false)).booleanValue();
        this.A03 = booleanValue;
        this.A00 = new C39904AIm(handler, r6, r4, booleanValue);
        if (((Boolean) A09(B35.A00, false)).booleanValue()) {
            C21097XEl xEl = new C21097XEl(handler);
            this.A0A = xEl;
            xEl.Env(30);
        }
        this.A06 = ((Boolean) A09(B35.A01, false)).booleanValue();
    }
}
