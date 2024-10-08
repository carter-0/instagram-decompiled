package X;

import com.instagram.tagging.model.Tag;
import com.instagram.tagging.widget.TagsLayout;

/* renamed from: X.LyT  reason: case insensitive filesystem */
public final class C65713LyT implements C66471MSz {
    public final /* synthetic */ TagsLayout A00;
    public final /* synthetic */ C247063fi A01;

    public C65713LyT(TagsLayout tagsLayout, C247063fi r2) {
        this.A00 = tagsLayout;
        this.A01 = r2;
    }

    public final void EEh(Tag tag) {
        if (tag != null) {
            TagsLayout tagsLayout = this.A00;
            tagsLayout.removeView(tagsLayout.findViewWithTag(tag));
        }
        C51965G9l.A1W(this.A01.A00.A00, tag);
    }
}
