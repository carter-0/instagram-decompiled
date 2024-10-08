package X;

import androidx.viewpager.widget.ViewPager;

/* renamed from: X.Lru  reason: case insensitive filesystem */
public final class C65354Lru implements C66492MTv {
    public final ViewPager A00;

    public final int Au4() {
        return this.A00.getCurrentItem();
    }

    public final void ETY(int i, boolean z) {
        this.A00.setCurrentItem(i);
    }

    public C65354Lru(ViewPager viewPager) {
        this.A00 = viewPager;
    }
}
