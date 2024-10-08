package X;

import android.view.animation.Animation;
import com.instagram.genericsurvey.fragment.AdBakeOffFragment;
import com.instagram.genericsurvey.fragment.BakeoffFeedPairSectionController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class WCQ implements Animation.AnimationListener {
    public void onAnimationEnd(Animation animation) {
        C16308Usc usc = (C16308Usc) this;
        AdBakeOffFragment adBakeOffFragment = usc.A00;
        AdBakeOffFragment.A03(adBakeOffFragment);
        String str = usc.A01;
        if ("bakeoff_feed_item".equals(str)) {
            BakeoffFeedPairSectionController bakeoffFeedPairSectionController = adBakeOffFragment.bakeoffFeedPairSectionController;
            if (bakeoffFeedPairSectionController != null) {
                Collection collection = (Collection) adBakeOffFragment.A09.get(adBakeOffFragment.A00);
                0qQ.A0B(collection, 0);
                bakeoffFeedPairSectionController.A00 = new ArrayList(collection);
                bakeoffFeedPairSectionController.pagerAdapter.notifyDataSetChanged();
            }
        } else if ("bakeoff_reel".equals(str)) {
            C19730WeX weX = adBakeOffFragment.bakeoffStoryPairSectionController;
            if (weX != null) {
                weX.A01((List) adBakeOffFragment.A09.get(adBakeOffFragment.A00));
            }
            C19730WeX weX2 = adBakeOffFragment.bakeoffStoryPairSectionController;
            if (weX2 != null) {
                weX2.A00();
            }
        }
        VC8.A00(AnonymousClass7TE.A0l(adBakeOffFragment.A0B), adBakeOffFragment, adBakeOffFragment.A07, VCA.A00(adBakeOffFragment.A03, adBakeOffFragment.A00), "which_is_better", adBakeOffFragment.A00);
        AdBakeOffFragment.A04(adBakeOffFragment, 0, true, true);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
