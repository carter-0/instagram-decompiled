package X;

/* renamed from: X.GZg  reason: case insensitive filesystem */
public final class C52607GZg implements AnonymousClass6J1 {
    public final AnonymousClass69H A00;
    public final C52642GaG A01 = C52642GaG.A00;
    public final C305636Ix A02;
    public final GZF A03;

    public final int BGq(Object obj) {
        return this.A02.BGq(obj);
    }

    public final Object BK0(int i) {
        Object BK0 = this.A02.BK0(i);
        if (BK0 == null) {
            return this.A00.A02(i);
        }
        return BK0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C52607GZg)) {
            return false;
        }
        return 0qQ.A0K(this.A00, ((C52607GZg) obj).A00);
    }

    public final int getItemCount() {
        return ((C305596Ir) this.A00.A00()).A00;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C52607GZg(AnonymousClass69H r2, C305636Ix r3, GZF gzf) {
        this.A03 = gzf;
        this.A00 = r2;
        this.A02 = r3;
    }

    public final void A6j(C286575Wy r11, Object obj, int i, int i2) {
        int i3;
        C286575Wy r5 = r11;
        r11.ExV(-1201380429);
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
                0fL.A01(718717601, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item (LazyLayoutPager.kt:206)");
            }
            AnonymousClass6JD.A00(this.A03.A0L, r5, obj2, AnonymousClass5PI.A01(r11, new JGC(this, i, 5), 1142237095), i4, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
            if (0fL.A02()) {
                0fL.A00(832610037);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = GSJ.A01(obj, this, i, i2, 3);
        }
    }

    public final /* synthetic */ Object Aqn(int i) {
        return null;
    }
}
