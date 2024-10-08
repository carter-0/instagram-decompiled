package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UsB  reason: case insensitive filesystem */
public final class C16293UsB extends UFN {
    public final ViewPager A00;
    public final IgSegmentedTabLayout A01;
    public final List A02 = new ArrayList();
    public final C20954X6h A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16293UsB(0hq r2, ViewPager viewPager, C20954X6h x6h, IgSegmentedTabLayout igSegmentedTabLayout) {
        super(r2);
        0qQ.A0B(viewPager, 3);
        this.A03 = x6h;
        this.A00 = viewPager;
        this.A01 = igSegmentedTabLayout;
        igSegmentedTabLayout.setViewPager(viewPager);
        this.mContainer = viewPager;
        viewPager.setAdapter(this);
    }

    public final void A00(List list, int i) {
        List<Object> list2 = this.A02;
        list2.clear();
        list2.addAll(list);
        IgSegmentedTabLayout igSegmentedTabLayout = this.A01;
        C60066Jeq jeq = igSegmentedTabLayout.A04;
        jeq.removeAllViews();
        jeq.A02 = -1;
        jeq.A00 = -1;
        for (Object C3n : list2) {
            C49627Ezk C3n2 = this.A03.C3n(C3n);
            0qQ.A0B(C3n2, 0);
            igSegmentedTabLayout.A02((View.OnClickListener) null, C3n2);
        }
        notifyDataSetChanged();
        if (list2.isEmpty()) {
            return;
        }
        if (i < 0 || i >= list2.size()) {
            throw DbW.A0a("Cannot set tab position to invalid position = ", i);
        }
        igSegmentedTabLayout.A01(i, true);
        this.A00.setCurrentItem(i);
    }

    public final Fragment createItem(int i) {
        return this.A03.ALb(this.A02.get(i));
    }

    public final int getCount() {
        return this.A02.size();
    }
}
