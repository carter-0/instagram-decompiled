package X;

import com.instagram.api.schemas.StoryMusicPickAggregationVisibility;
import java.util.List;

/* renamed from: X.JxU  reason: case insensitive filesystem */
public final class C61118JxU extends AnonymousClass0T0 implements MWP {
    public final StoryMusicPickAggregationVisibility A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61118JxU) {
                C61118JxU jxU = (C61118JxU) obj;
                if (this.A00 != jxU.A00 || !0qQ.A0K(this.A01, jxU.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public C61118JxU(StoryMusicPickAggregationVisibility storyMusicPickAggregationVisibility, List list) {
        AnonymousClass7TG.A1O(storyMusicPickAggregationVisibility, list);
        this.A00 = storyMusicPickAggregationVisibility;
        this.A01 = list;
    }
}
