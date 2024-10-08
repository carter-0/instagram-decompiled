package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.ITi  reason: case insensitive filesystem */
public final class C57221ITi implements AnonymousClass342 {
    public final Fragment A00;
    public final ReelViewerFragment A01;

    public final void FND(AnonymousClass345 r5, AnonymousClass343 r6) {
        C313056fm r2;
        if (this.A00.isResumed() && (r2 = this.A01.mViewPager) != null) {
            C313046fl r1 = (C313046fl) r2;
            if (r1.A05.getCount() != 0 && r1.A04.getAdapter() != null) {
                ReboundViewPager reboundViewPager = ((C313046fl) r2).A04;
                int i = reboundViewPager.A08;
                int i2 = reboundViewPager.A09;
                int i3 = reboundViewPager.A0A;
                if (i - i2 < 0) {
                    i3 = i2;
                } else if (i3 - i < 0) {
                    i2 = i3;
                }
                while (i2 <= i3) {
                    r6.A02(r5, i2);
                    i2++;
                }
            }
        }
    }

    public C57221ITi(Fragment fragment, ReelViewerFragment reelViewerFragment) {
        this.A00 = fragment;
        this.A01 = reelViewerFragment;
    }
}
