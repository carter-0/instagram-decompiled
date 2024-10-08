package X;

import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.Tp0  reason: case insensitive filesystem */
public final class C14052Tp0 {
    public C231402rc A00;
    public final AnonymousClass05A A01 = new C18940WDt(this, 1);
    public final AnonymousClass05A A02 = new C18940WDt(this, 0);
    public final /* synthetic */ ViewPager2 A03;
    public final /* synthetic */ ViewPager2 A04;

    public C14052Tp0(ViewPager2 viewPager2) {
        this.A04 = viewPager2;
        this.A03 = viewPager2;
    }

    public final void A00() {
        int itemCount;
        04x r1;
        ViewPager2 viewPager2 = this.A04;
        int i = 16908360;
        03v.A09(viewPager2, 16908360);
        03v.A09(viewPager2, 16908361);
        03v.A09(viewPager2, 16908358);
        03v.A09(viewPager2, 16908359);
        2Rw r0 = viewPager2.A04.A0A;
        if (r0 != null && (itemCount = r0.getItemCount()) != 0 && viewPager2.A0B) {
            if (viewPager2.getOrientation() == 0) {
                int i2 = 16908361;
                if (viewPager2.A02.A07.getLayoutDirection() == 1) {
                    i2 = 16908360;
                    i = 16908361;
                }
                if (viewPager2.A00 < itemCount - 1) {
                    03v.A0E(viewPager2, new 04x(i2, (CharSequence) null), this.A02);
                }
                if (viewPager2.A00 > 0) {
                    r1 = new 04x(i, (CharSequence) null);
                } else {
                    return;
                }
            } else {
                if (viewPager2.A00 < itemCount - 1) {
                    03v.A0E(viewPager2, new 04x(16908359, (CharSequence) null), this.A02);
                }
                if (viewPager2.A00 > 0) {
                    r1 = new 04x(16908358, (CharSequence) null);
                } else {
                    return;
                }
            }
            03v.A0E(viewPager2, r1, this.A01);
        }
    }
}
