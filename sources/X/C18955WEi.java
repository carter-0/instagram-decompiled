package X;

import com.instagram.genericsurvey.fragment.AdBakeOffFragment;
import com.instagram.genericsurvey.fragment.BakeoffFeedPairSectionController;
import java.lang.ref.Reference;
import java.util.Map;

/* renamed from: X.WEi  reason: case insensitive filesystem */
public final class C18955WEi implements AnonymousClass08u {
    public int A00;
    public final /* synthetic */ BakeoffFeedPairSectionController A01;

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageScrolled(int i, float f, int i2) {
    }

    public C18955WEi(BakeoffFeedPairSectionController bakeoffFeedPairSectionController) {
        this.A01 = bakeoffFeedPairSectionController;
    }

    public final void onPageSelected(int i) {
        C54172H1s h1s;
        C54172H1s h1s2;
        int i2 = this.A00;
        if (i2 != i) {
            Map map = ((U84) this.A01.pagerAdapter).A01;
            Reference reference = (Reference) C51968G9o.A10(map, i2);
            if (reference != null) {
                h1s = (C54172H1s) reference.get();
            } else {
                h1s = null;
            }
            Reference reference2 = (Reference) C51968G9o.A10(map, i);
            if (reference2 != null) {
                h1s2 = (C54172H1s) reference2.get();
            } else {
                h1s2 = null;
            }
            if (h1s != null) {
                AnonymousClass2xS r1 = h1s.A00;
                if (r1 != null) {
                    r1.A0C("fragment_paused");
                }
                0qQ.A0F("feedVideoModule");
                throw AnonymousClass00P.createAndThrow();
            }
            if (h1s2 != null) {
                AnonymousClass2xS r0 = h1s2.A00;
                if (r0 != null) {
                    r0.A0F.A0D.sendEmptyMessage(0);
                }
                0qQ.A0F("feedVideoModule");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        AdBakeOffFragment.A04(this.A01.A02, i, JTQ.A1O(this.A00, i), false);
        this.A00 = i;
    }
}
