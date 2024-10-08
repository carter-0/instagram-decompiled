package X;

import android.os.SystemClock;
import android.util.SparseIntArray;

/* renamed from: X.ATe  reason: case insensitive filesystem */
public final class C40138ATe implements C344747sM, C345107sw, C346257us {
    public int A00;
    public int A01;
    public C345897uG A02;
    public final C345127sy A03 = new Object();
    public final C345057sr A04 = new C345047sq();
    public volatile C346267ut A05;

    public final void CMa(C344567s4 r1) {
    }

    public final void release() {
    }

    public static void A00(C40138ATe aTe) {
        if (aTe.A02 != null) {
            C345127sy r4 = aTe.A03;
            if (r4.A04 == null) {
                C346327uz r3 = new C346327uz("BlankInput");
                r3.A03 = 3553;
                r3.A04 = 8;
                r3.A02 = 8;
                SparseIntArray sparseIntArray = r3.A0A;
                sparseIntArray.put(10241, 9729);
                sparseIntArray.put(10240, 9729);
                sparseIntArray.put(10242, 33071);
                sparseIntArray.put(10243, 33071);
                r4.A04 = new C346337v0(r3);
            }
            C346267ut r0 = aTe.A05;
            if (r0 != null) {
                r0.DGm();
            }
        }
    }

    public final C345067ss A01(int i, int i2, int i3) {
        C345057sr r1 = this.A04;
        r1.A09(this.A01, this.A00, i, i2, 0, false, false);
        this.A03.A01 = i3;
        return r1.A08();
    }

    public final void ACn(C345897uG r1) {
        this.A02 = r1;
        A00(this);
    }

    public final C345137sz B82() {
        C345127sy r2 = this.A03;
        r2.A05 = this.A04.A08();
        r2.A03 = SystemClock.elapsedRealtimeNanos();
        return r2;
    }

    public final /* synthetic */ int BHN() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void detach() {
        /*
            r2 = this;
            X.7uG r0 = r2.A02
            if (r0 == 0) goto L_0x0010
            X.7sy r1 = r2.A03
            X.7v0 r0 = r1.A04
            if (r0 == 0) goto L_0x0010
            r0.A01()
            r0 = 0
            r1.A04 = r0
        L_0x0010:
            r0 = 0
            r2.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40138ATe.detach():void");
    }

    public final C345067ss FKc(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        return A01(i, i2, i6);
    }

    public final void EeQ(C346267ut r1) {
        this.A05 = r1;
    }
}
