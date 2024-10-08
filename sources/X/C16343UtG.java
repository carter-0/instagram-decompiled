package X;

import androidx.viewpager.widget.ViewPager;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UtG  reason: case insensitive filesystem */
public final class C16343UtG extends C16294UsC implements C74372Ptm {
    public final ViewPager A00;
    public final FixedTabBar A01;
    public final XBP A02;
    public final List A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16343UtG(0hq r5, ViewPager viewPager, FixedTabBar fixedTabBar, XBP xbp, List list, boolean z, boolean z2) {
        super(r5, xbp, list);
        C51973G9u.A0r(3, viewPager, fixedTabBar, list);
        0mk.A02(viewPager.getContext());
        this.A02 = xbp;
        this.A00 = viewPager;
        this.A01 = fixedTabBar;
        this.A03 = list;
        int i = 0;
        if (z2 && list.size() == 1) {
            i = 8;
        }
        fixedTabBar.setVisibility(i);
        fixedTabBar.A0A = z;
        fixedTabBar.A06 = this;
        List<Object> list2 = this.A03;
        ArrayList A0r = AnonymousClass7TG.A0r(list2);
        for (Object AN9 : list2) {
            A0r.add(this.A02.AN9(AN9));
        }
        fixedTabBar.setTabs(A0r);
        ViewPager A05 = A05();
        this.mContainer = A05;
        A05.setAdapter(this);
        A05.A0J(new FR9(this, 2));
        viewPager.A0J(fixedTabBar);
    }

    public final void setMode(int i) {
        super.setMode(i);
        this.A01.A02(i);
    }
}
