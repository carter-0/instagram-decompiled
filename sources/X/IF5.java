package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;

public final class IF5 implements C59663JSi {
    public final C52893GeT A00;
    public final C305636Ix A01;
    public final LazyGridState A02;

    public final Object Aqn(int i) {
        return this.A00.A01(i);
    }

    public final int BGq(Object obj) {
        return this.A01.BGq(obj);
    }

    public final Object BK0(int i) {
        Object BK0 = this.A01.BK0(i);
        if (BK0 == null) {
            return this.A00.A02(i);
        }
        return BK0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IF5)) {
            return false;
        }
        return 0qQ.A0K(this.A00, ((IF5) obj).A00);
    }

    public final int getItemCount() {
        return ((C305596Ir) this.A00.A00()).A00;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public IF5(C52893GeT geT, LazyGridState lazyGridState, C305636Ix r3) {
        this.A02 = lazyGridState;
        this.A00 = geT;
        this.A01 = r3;
    }

    public final void A6j(C286575Wy r11, Object obj, int i, int i2) {
        int i3;
        C286575Wy r5 = r11;
        r11.ExV(1493551140);
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
                0fL.A01(-1809820591, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item (LazyGridItemProvider.kt:74)");
            }
            AnonymousClass6JD.A00(this.A02.A0D, r5, obj2, AnonymousClass5PI.A01(r11, new JGC(this, i, 2), 726189336), i4, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
            if (0fL.A02()) {
                0fL.A00(-774613370);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = GSJ.A01(obj, this, i, i2, 1);
        }
    }
}
