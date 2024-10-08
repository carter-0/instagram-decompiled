package X;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;

public final class IFP implements C59664JSj {
    public final C305636Ix A00;
    public final C52894GeU A01;
    public final LazyStaggeredGridState A02;

    public final Object Aqn(int i) {
        return this.A01.A01(i);
    }

    public final int BGq(Object obj) {
        return this.A00.BGq(obj);
    }

    public final Object BK0(int i) {
        Object BK0 = this.A00.BK0(i);
        if (BK0 == null) {
            return this.A01.A02(i);
        }
        return BK0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IFP)) {
            return false;
        }
        return 0qQ.A0K(this.A01, ((IFP) obj).A01);
    }

    public final int getItemCount() {
        return ((C305596Ir) this.A01.A00()).A00;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public IFP(C305636Ix r1, C52894GeU geU, LazyStaggeredGridState lazyStaggeredGridState) {
        this.A02 = lazyStaggeredGridState;
        this.A01 = geU;
        this.A00 = r1;
    }

    public final void A6j(C286575Wy r11, Object obj, int i, int i2) {
        int i3;
        C286575Wy r5 = r11;
        r11.ExV(89098518);
        int i4 = i;
        if ((i2 & 6) == 0) {
            i3 = G9t.A05(r11, i) | i2;
        } else {
            i3 = i2;
        }
        Object obj2 = obj;
        if ((i2 & 48) == 0) {
            i3 |= G9t.A0F(r11, obj);
        }
        if ((i2 & 384) == 0) {
            i3 |= G9t.A0Q(r11, this);
        }
        if ((i3 & 147) != 146 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1289168211, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl.Item (LazyStaggeredGridItemProvider.kt:76)");
            }
            AnonymousClass6JD.A00(this.A02.A0A, r5, obj2, AnonymousClass5PI.A01(r11, new JGC(this, i, 4), 608834466), i4, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
            if (0fL.A02()) {
                0fL.A00(331837716);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = GSJ.A01(obj, this, i, i2, 2);
        }
    }
}
