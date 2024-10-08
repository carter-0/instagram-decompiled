package X;

import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.GAe  reason: case insensitive filesystem */
public final class C51981GAe {
    public final C227232is A00;

    public final void A00() {
        C52012GBj A0N = this.A00.A0N();
        ViewPager2 viewPager2 = A0N.A00;
        if (viewPager2 != null && viewPager2.A04.canScrollVertically(-1)) {
            C267324bN A04 = C52012GBj.A04(A0N);
            A0N.A0L(true);
            AnonymousClass7TF.A0D().postDelayed(new C57883Ii0(A04, A0N), 500);
        }
    }

    public C51981GAe(C227232is r1) {
        this.A00 = r1;
    }
}
