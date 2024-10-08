package X;

import com.facebook.vmasaver.VmaSaver;

/* renamed from: X.51a  reason: invalid class name and case insensitive filesystem */
public final class C2802751a implements AnonymousClass0c8 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final boolean A06;

    public C2802751a() {
        0yU.A07(AnonymousClass0yP.A00(36314115992586659L));
        this.A06 = 0yU.A07(AnonymousClass0yP.A00(36314115992914341L));
        this.A04 = (int) 0yU.A01(AnonymousClass0yP.A00(36595590969166008L));
        this.A03 = (int) 0yU.A01(AnonymousClass0yP.A00(36595590968969398L));
        this.A00 = (int) 0yU.A01(AnonymousClass0yP.A00(36595590968903861L));
        this.A01 = (int) 0yU.A01(AnonymousClass0yP.A00(36595590969100471L));
        this.A02 = (int) 0yU.A01(AnonymousClass0yP.A00(36595590969362617L));
        this.A05 = (int) 0yU.A01(AnonymousClass0yP.A00(36595590969559227L));
    }

    public final void CuY(0TS r5) {
        int ordinal = r5.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            if (this.A06) {
                VmaSaver.freeWebviewReservedMemory();
            }
            if (ordinal != 1) {
                int i = this.A04;
                if (i == 1 || i == 2) {
                    VmaSaver.freeCompactingGcSemiSpace((long) this.A03);
                }
                int i2 = this.A00;
                if (i2 == 1 || i2 == 2) {
                    VmaSaver.shrinkArtRegionSpace(this.A01, this.A02);
                }
                int i3 = this.A05;
                if (!(i3 == 3 || i3 == 4)) {
                    if (!(i3 == 1 || i3 == 2)) {
                        return;
                    }
                }
                VmaSaver.setJemallocRetain(false);
            } else {
                if (this.A04 == 1) {
                    VmaSaver.freeCompactingGcSemiSpace((long) this.A03);
                }
                if (this.A00 == 1) {
                    VmaSaver.shrinkArtRegionSpace(this.A01, this.A02);
                }
                int i4 = this.A05;
                if (i4 != 3) {
                    if (i4 != 1) {
                        return;
                    }
                }
                VmaSaver.setJemallocRetain(false);
            }
            VmaSaver.purgeJemallocHeap();
        }
    }
}
