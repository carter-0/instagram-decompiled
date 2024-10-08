package X;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.instagram.android.R;

/* renamed from: X.WEh  reason: case insensitive filesystem */
public final class C18954WEh implements AnonymousClass08u {
    public final int A00;
    public final Object A01;

    public C18954WEh(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onPageScrollStateChanged(int i) {
        if (3 - this.A00 == 0) {
            for (AnonymousClass08u onPageScrollStateChanged : ((Wv7) this.A01).A00) {
                onPageScrollStateChanged.onPageScrollStateChanged(i);
            }
        }
    }

    public final void onPageScrolled(int i, float f, int i2) {
        View view;
        View view2;
        switch (this.A00) {
            case 2:
                ViewPager viewPager = ((C19199WPf) this.A01).A08;
                0qQ.A0B(viewPager, 0);
                int childCount = viewPager.getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 < childCount) {
                        view = viewPager.getChildAt(i3);
                        Object tag = view.getTag(R.id.effect_info_attributions_item_view_holder);
                        if (!(tag instanceof C17670Vc1) || ((C17670Vc1) tag).A00 != i) {
                            i3++;
                        }
                    } else {
                        view = null;
                    }
                }
                int i4 = i + 1;
                int childCount2 = viewPager.getChildCount();
                int i5 = 0;
                while (true) {
                    if (i5 < childCount2) {
                        view2 = viewPager.getChildAt(i5);
                        Object tag2 = view2.getTag(R.id.effect_info_attributions_item_view_holder);
                        if (!(tag2 instanceof C17670Vc1) || ((C17670Vc1) tag2).A00 != i4) {
                            i5++;
                        }
                    } else {
                        view2 = null;
                    }
                }
                if (view != null) {
                    C18486Vsh.A00(view, 1.0f - f);
                }
                if (view2 != null) {
                    C18486Vsh.A00(view2, f);
                    return;
                }
                return;
            case 3:
                for (AnonymousClass08u onPageScrolled : ((Wv7) this.A01).A00) {
                    onPageScrolled.onPageScrolled(i, f, i2);
                }
                return;
            default:
                return;
        }
    }

    public final void onPageSelected(int i) {
        WGU wgu;
        C16678UzE uzE;
        String str;
        WGU A0M;
        C16678UzE uzE2;
        String str2;
        05G r2;
        Object value;
        ULF ulf;
        int i2 = i;
        switch (this.A00) {
            case 0:
                C15278UZg uZg = (C15278UZg) this.A01;
                DbS.A1D(uZg);
                if (i == 0) {
                    wgu = uZg.A02;
                    if (wgu != null) {
                        uzE = C16678UzE.LOCATIONS_SELECTION;
                        str = "region_tab";
                    } else {
                        return;
                    }
                } else if (i == 1 && (wgu = uZg.A02) != null) {
                    uzE = C16678UzE.LOCATIONS_SELECTION;
                    str = "local_tab";
                } else {
                    return;
                }
                wgu.A0F(uzE, str);
                return;
            case 1:
                UZP uzp = (UZP) this.A01;
                DbS.A1D(uzp);
                if (i != 0) {
                    if (i == 1) {
                        A0M = C13990Tnq.A0M(uzp.A05);
                        uzE2 = C16678UzE.LOCATIONS_SELECTION;
                        str2 = "local_tab";
                    }
                    r2 = ((U92) uzp.A07.getValue()).A02.A04;
                    do {
                        value = r2.getValue();
                        ulf = (ULF) value;
                    } while (!r2.AIY(value, ULF.A00(ulf.A03, ulf.A02, ulf.A05, ulf.A04, i2, ulf.A01, ulf.A06)));
                    return;
                }
                A0M = C13990Tnq.A0M(uzp.A05);
                uzE2 = C16678UzE.LOCATIONS_SELECTION;
                str2 = "region_tab";
                A0M.A0F(uzE2, str2);
                r2 = ((U92) uzp.A07.getValue()).A02.A04;
                do {
                    value = r2.getValue();
                    ulf = (ULF) value;
                } while (!r2.AIY(value, ULF.A00(ulf.A03, ulf.A02, ulf.A05, ulf.A04, i2, ulf.A01, ulf.A06)));
                return;
            case 2:
                C19199WPf.A02((C19199WPf) this.A01);
                return;
            default:
                for (AnonymousClass08u onPageSelected : ((Wv7) this.A01).A00) {
                    onPageSelected.onPageSelected(i);
                }
                return;
        }
    }
}
