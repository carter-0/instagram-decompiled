package X;

import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.6Iz  reason: invalid class name and case insensitive filesystem */
public final class C305646Iz implements AnonymousClass6J0 {
    public final C305226Ha A00;
    public final C304996Ga A01;
    public final C305636Ix A02;
    public final LazyListState A03;

    public final Object Aqn(int i) {
        return this.A01.A01(i);
    }

    public final int BGq(Object obj) {
        return this.A02.BGq(obj);
    }

    public final Object BK0(int i) {
        Object BK0 = this.A02.BK0(i);
        if (BK0 == null) {
            return this.A01.A02(i);
        }
        return BK0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C305646Iz)) {
            return false;
        }
        return 0qQ.A0K(this.A01, ((C305646Iz) obj).A01);
    }

    public final int getItemCount() {
        return ((C305596Ir) this.A01.A00()).A00;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public C305646Iz(C305226Ha r1, C304996Ga r2, LazyListState lazyListState, C305636Ix r4) {
        this.A03 = lazyListState;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r4;
    }

    public final void A6j(C286575Wy r16, Object obj, int i, int i2) {
        int i3;
        C286575Wy r5 = r16;
        r5.ExV(-462424778);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 6) == 0) {
            int i6 = 2;
            if (r5.AGs(i5)) {
                i6 = 4;
            }
            i3 = i6 | i2;
        } else {
            i3 = i4;
        }
        Object obj2 = obj;
        if ((i2 & 48) == 0) {
            int i7 = 16;
            if (r5.AGw(obj2)) {
                i7 = 32;
            }
            i3 |= i7;
        }
        if ((i4 & 384) == 0) {
            int i8 = 128;
            if (r5.AGu(this)) {
                i8 = 256;
            }
            i3 |= i8;
        }
        if ((i3 & 147) != 146 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1732587333, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:75)");
            }
            AnonymousClass6JD.A00(this.A03.A0E, r5, obj2, AnonymousClass5PI.A01(r5, new C377329Lk(this, i5, 0), -824725566), i5, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
            if (0fL.A02()) {
                0fL.A00(-1152810109);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new GSJ(obj2, i5, this, i4, 0);
        }
    }
}
