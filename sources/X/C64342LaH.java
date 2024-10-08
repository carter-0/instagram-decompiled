package X;

import android.view.View;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout;

/* renamed from: X.LaH  reason: case insensitive filesystem */
public final class C64342LaH implements AnonymousClass08u {
    public final /* synthetic */ IgSegmentedTabLayout A00;
    public final /* synthetic */ C60066Jeq A01;

    public C64342LaH(IgSegmentedTabLayout igSegmentedTabLayout, C60066Jeq jeq) {
        this.A00 = igSegmentedTabLayout;
        this.A01 = jeq;
    }

    public final void onPageScrollStateChanged(int i) {
        IgSegmentedTabLayout igSegmentedTabLayout = this.A00;
        igSegmentedTabLayout.A01 = igSegmentedTabLayout.A02;
        igSegmentedTabLayout.A02 = i;
    }

    public final void onPageScrolled(int i, float f, int i2) {
        IgSegmentedTabLayout igSegmentedTabLayout = this.A00;
        int i3 = igSegmentedTabLayout.A02;
        if (i3 == 1 || (i3 == 2 && igSegmentedTabLayout.A01 == 1)) {
            C60066Jeq jeq = this.A01;
            View childAt = jeq.getChildAt((int) Math.ceil((double) (((float) i) + f)));
            View childAt2 = jeq.getChildAt(i);
            float A0B = (float) (JTR.A0B(igSegmentedTabLayout, childAt2) / 2);
            igSegmentedTabLayout.scrollTo((int) (((((float) childAt.getLeft()) - ((float) (JTR.A0B(igSegmentedTabLayout, childAt) / 2))) * f) + ((1.0f - f) * (((float) childAt2.getLeft()) - A0B))), 0);
            jeq.onPageScrolled(i, f, i2);
        }
    }

    public final void onPageSelected(int i) {
    }
}
