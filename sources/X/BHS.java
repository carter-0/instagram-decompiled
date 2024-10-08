package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StoryTextAttributionType;
import java.util.List;

public final class BHS extends AnonymousClass0T0 implements DTS {
    public final StoryTextAttributionType A00;
    public final String A01;
    public final List A02;

    public final BHS FBi() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BHS) {
                BHS bhs = (BHS) obj;
                if (this.A00 != bhs.A00 || !0qQ.A0K(this.A02, bhs.A02) || !0qQ.A0K(this.A01, bhs.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final StoryTextAttributionType AdA() {
        return this.A00;
    }

    public final List Agp() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryTextAttribution", C44455CfD.A00(this));
    }

    public final String getText() {
        return this.A01;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A00)));
    }

    public BHS(StoryTextAttributionType storyTextAttributionType, String str, List list) {
        AnonymousClass7TG.A1U(storyTextAttributionType, list, str);
        this.A00 = storyTextAttributionType;
        this.A02 = list;
        this.A01 = str;
    }
}
