package X;

import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.6yE  reason: invalid class name and case insensitive filesystem */
public final class C323866yE implements 08t {
    public boolean A00;
    public final /* synthetic */ TabLayout A01;

    public C323866yE(TabLayout tabLayout) {
        this.A01 = tabLayout;
    }

    public final void Cty(08m r3, 08m r4, ViewPager viewPager) {
        TabLayout tabLayout = this.A01;
        if (tabLayout.A0J == viewPager) {
            tabLayout.A0C(r4, this.A00);
        }
    }
}
