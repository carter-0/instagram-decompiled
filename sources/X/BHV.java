package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.api.schemas.StoryPromptTappableDataIntf;
import java.util.List;

public final class BHV extends AnonymousClass0T0 implements DUU {
    public final StoryPromptTappableData A00;
    public final BHW A01;
    public final List A02;
    public final List A03;

    public final BHV FBo(1E9 r1) {
        return this;
    }

    public final BHV FBp(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BHV) {
                BHV bhv = (BHV) obj;
                if (!0qQ.A0K(this.A01, bhv.A01) || !0qQ.A0K(this.A02, bhv.A02) || !0qQ.A0K(this.A00, bhv.A00) || !0qQ.A0K(this.A03, bhv.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C46264DSt BOE() {
        return this.A01;
    }

    public final List BQO() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ StoryPromptTappableDataIntf Bhq() {
        return this.A00;
    }

    public final List Bkq() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryTrendingPromptInfo", C44461CfJ.A00(this));
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A03, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A02, AnonymousClass7TG.A0C(this.A01) * 31)));
    }

    public BHV(StoryPromptTappableData storyPromptTappableData, BHW bhw, List list, List list2) {
        AnonymousClass7TG.A1Q(list, storyPromptTappableData);
        0qQ.A0B(list2, 4);
        this.A01 = bhw;
        this.A02 = list;
        this.A00 = storyPromptTappableData;
        this.A03 = list2;
    }

    public final DUU E9B(1E9 r1) {
        return this;
    }
}
