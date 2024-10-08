package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StoryTrendingPromptMediaSubType;

public final class BHX extends AnonymousClass0T0 implements C46265DSu {
    public final StoryTrendingPromptMediaSubType A00;
    public final String A01;

    public final BHX FBr() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BHX) {
                BHX bhx = (BHX) obj;
                if (!0qQ.A0K(this.A01, bhx.A01) || this.A00 != bhx.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final StoryTrendingPromptMediaSubType BQy() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryTrendingPromptMediaLoggingInfo", C44465CfN.A00(this));
    }

    public final String getMediaId() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0O(this.A01));
    }

    public BHX(StoryTrendingPromptMediaSubType storyTrendingPromptMediaSubType, String str) {
        AnonymousClass7TG.A1O(str, storyTrendingPromptMediaSubType);
        this.A01 = str;
        this.A00 = storyTrendingPromptMediaSubType;
    }
}
