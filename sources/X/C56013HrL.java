package X;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import java.util.List;

/* renamed from: X.HrL  reason: case insensitive filesystem */
public final class C56013HrL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final C305586Iq A07;
    public final C59664JSj A08;
    public final I24 A09;
    public final IFI A0A;
    public final C55580Hk0 A0B;
    public final LazyStaggeredGridState A0C;
    public final C285855Sz A0D;
    public final List A0E;
    public final C262224Cq A0F;
    public final boolean A0G;
    public final boolean A0H;

    public C56013HrL(C305586Iq r8, C59664JSj jSj, C55580Hk0 hk0, LazyStaggeredGridState lazyStaggeredGridState, C285855Sz r12, List list, C262224Cq r14, int i, int i2, int i3, int i4, long j, long j2, boolean z, boolean z2) {
        this.A0C = lazyStaggeredGridState;
        this.A0E = list;
        this.A08 = jSj;
        this.A0B = hk0;
        this.A05 = j;
        boolean z3 = z;
        this.A0G = z3;
        C305586Iq r2 = r8;
        this.A07 = r8;
        this.A03 = i;
        this.A06 = j2;
        this.A01 = i2;
        this.A00 = i3;
        this.A0H = z2;
        this.A04 = i4;
        this.A0F = r14;
        this.A0D = r12;
        this.A0A = new IFI(r2, jSj, this, hk0, z3);
        this.A09 = lazyStaggeredGridState.A0C;
        this.A02 = hk0.A01.length;
    }

    public final long A00(C59664JSj jSj, int i, int i2) {
        int i3;
        if (((IFP) jSj).A01.A01.A00(i)) {
            i3 = this.A02;
            i2 = 0;
        } else {
            i3 = 1;
        }
        return (((long) (i3 + i2)) & 4294967295L) | (((long) i2) << 32);
    }
}
