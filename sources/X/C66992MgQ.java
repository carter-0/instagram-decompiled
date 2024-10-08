package X;

import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.MgQ  reason: case insensitive filesystem */
public final class C66992MgQ {
    public 2Rw A00;
    public C231402rc A01;
    public C323836yB A02;
    public C66993MgR A03;
    public boolean A04;
    public final ViewPager2 A05;
    public final TabLayout A06;
    public final C74301Psb A07;

    public final void A00() {
        if (!this.A04) {
            ViewPager2 viewPager2 = this.A05;
            2Rw r0 = viewPager2.A04.A0A;
            this.A00 = r0;
            if (r0 != null) {
                this.A04 = true;
                TabLayout tabLayout = this.A06;
                C66993MgR mgR = new C66993MgR(tabLayout);
                this.A03 = mgR;
                viewPager2.A05(mgR);
                C66994MgS mgS = new C66994MgS(viewPager2);
                this.A02 = mgS;
                tabLayout.A0D(mgS);
                C66995MgT mgT = new C66995MgT(this);
                this.A01 = mgT;
                this.A00.registerAdapterDataObserver(mgT);
                A01();
                tabLayout.A0A(0.0f, viewPager2.A00, true, true);
                return;
            }
            throw AnonymousClass7TE.A0z("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw AnonymousClass7TE.A0z("TabLayoutMediator is already attached");
    }

    public final void A01() {
        int min;
        TabLayout tabLayout = this.A06;
        tabLayout.A09();
        2Rw r0 = this.A00;
        if (r0 != null) {
            int itemCount = r0.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                C324746zp A062 = tabLayout.A06();
                this.A07.D5R(A062, i);
                tabLayout.A0E(A062, false);
            }
            if (itemCount > 0 && (min = Math.min(this.A05.A00, tabLayout.A0c.size() - 1)) != tabLayout.getSelectedTabPosition()) {
                tabLayout.A0F(tabLayout.A07(min), true);
            }
        }
    }

    public C66992MgQ(ViewPager2 viewPager2, TabLayout tabLayout, C74301Psb psb) {
        this.A06 = tabLayout;
        this.A05 = viewPager2;
        this.A07 = psb;
    }
}
