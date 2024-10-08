package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.Mei  reason: case insensitive filesystem */
public final class C66900Mei extends C228422le {
    public final float A00;
    public final int A01;
    public final RecyclerView A02;
    public final ViewPager2 A03;

    public final View A03(C252553pI r2) {
        0qQ.A0B(r2, 0);
        if (this.A03.A06.A06.A07) {
            return null;
        }
        return super.A03(r2);
    }

    public final AnonymousClass52T A05(C252553pI r4) {
        0qQ.A0B(r4, 0);
        if (r4 instanceof C252563pJ) {
            return new C67603Mqb(this.A02.getContext(), this, 3);
        }
        return null;
    }

    public C66900Mei(RecyclerView recyclerView, ViewPager2 viewPager2, float f, int i) {
        this.A03 = viewPager2;
        this.A02 = recyclerView;
        this.A00 = f;
        this.A01 = i;
    }
}
