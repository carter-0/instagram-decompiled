package X;

import androidx.viewpager2.widget.ViewPager2;

public final class UFV extends C14072TpM {
    public final int A00;
    public final Object A01;

    public UFV(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void A01(int i) {
        String str;
        switch (this.A00) {
            case 0:
                ViewPager2 viewPager2 = (ViewPager2) this.A01;
                viewPager2.clearFocus();
                if (viewPager2.hasFocus()) {
                    viewPager2.A04.requestFocus(2);
                    return;
                }
                return;
            case 1:
                UZO uzo = (UZO) this.A01;
                if (uzo.A01) {
                    uzo.A01 = false;
                    return;
                }
                WGU wgu = uzo.A00;
                if (wgu != null) {
                    C16678UzE uzE = C16678UzE.AD_PREVIEW;
                    if (1 - C13989Tnp.A08(2, i) != 0) {
                        str = "add_preview_instagram_tab";
                    } else {
                        str = "add_preview_facebook_tab";
                    }
                    wgu.A0F(uzE, str);
                    return;
                }
                return;
            default:
                C15998Umf umf = (C15998Umf) this.A01;
                ViewPager2 viewPager22 = umf.A00;
                if (viewPager22 != null) {
                    viewPager22.post(new C20228WnS(umf, i));
                    return;
                }
                return;
        }
    }
}
