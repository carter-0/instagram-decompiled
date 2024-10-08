package X;

import com.instagram.tagging.model.Tag;
import com.instagram.tagging.widget.TagsLayout;

/* renamed from: X.LyR  reason: case insensitive filesystem */
public final class C65711LyR implements C66470MSy {
    public final /* synthetic */ TagsLayout A00;

    public C65711LyR(TagsLayout tagsLayout) {
        this.A00 = tagsLayout;
    }

    public final void EDf(1Xj r3, Tag tag) {
        if (tag != null) {
            TagsLayout tagsLayout = this.A00;
            tagsLayout.removeView(tagsLayout.findViewWithTag(tag));
        }
    }
}
