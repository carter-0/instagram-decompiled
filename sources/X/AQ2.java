package X;

import androidx.fragment.app.Fragment;

public final class AQ2 implements AnonymousClass08u {
    public final /* synthetic */ AnonymousClass902 A00;

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageScrolled(int i, float f, int i2) {
    }

    public AQ2(AnonymousClass902 r1) {
        this.A00 = r1;
    }

    public final void onPageSelected(int i) {
        C41829B2k b2k;
        AnonymousClass902 r5 = this.A00;
        AnonymousClass86D r6 = r5.A04;
        if (r6 != null) {
            AnonymousClass902.A01(r5, i);
            if (i == 0) {
                AnonymousClass7TH.A0R(r5.A02);
                C264044Oj.A00(r6.A0E).Chl(AnonymousClass903.A00(r6.A03), AnonymousClass90C.MINI_GALLERY, r6.A05(), "search");
            } else {
                int i2 = i - 1;
                r6.A02.A02 = Integer.valueOf(i2);
                AnonymousClass7TF.A16(r5.A02);
                String str = ((AnonymousClass9JA) r5.A06.get(i2)).A03;
                0qQ.A0B(str, 0);
                C264044Oj.A00(r6.A0E).Chl(AnonymousClass903.A00(r6.A03), AnonymousClass90C.MINI_GALLERY, r6.A05(), str);
            }
            AnonymousClass90B r2 = r5.A03;
            if (r2 != null) {
                int i3 = r2.A00;
                if (i3 >= 0 && (b2k = (Fragment) r2.A02.get(i3)) != null) {
                    b2k.DVy();
                }
                C41829B2k b2k2 = (Fragment) r2.A02.get(i);
                if (b2k2 != null) {
                    b2k2.DW7();
                }
                r2.A00 = i;
            }
        }
    }
}
