package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StoryTrendingPromptSubType;
import java.util.List;

public final class BHW extends AnonymousClass0T0 implements C46264DSt {
    public final StoryTrendingPromptSubType A00;
    public final List A01;

    public BHW(StoryTrendingPromptSubType storyTrendingPromptSubType, List list) {
        0qQ.A0B(list, 1);
        this.A01 = list;
        this.A00 = storyTrendingPromptSubType;
    }

    public final BHW FBq() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BHW) {
                BHW bhw = (BHW) obj;
                if (!0qQ.A0K(this.A01, bhw.A01) || this.A00 != bhw.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List BQX() {
        return this.A01;
    }

    public final StoryTrendingPromptSubType Bht() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryTrendingPromptLoggingInfo", C44463CfL.A00(this));
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A01) + AnonymousClass7TG.A0C(this.A00);
    }
}
