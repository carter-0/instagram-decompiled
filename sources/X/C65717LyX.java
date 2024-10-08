package X;

import com.instagram.tagging.widget.TagsLayout;

/* renamed from: X.LyX  reason: case insensitive filesystem */
public final class C65717LyX implements C295005nO {
    public final /* synthetic */ C60046JeE A00;
    public final /* synthetic */ TagsLayout A01;

    public C65717LyX(C60046JeE jeE, TagsLayout tagsLayout) {
        this.A01 = tagsLayout;
        this.A00 = jeE;
    }

    public final void onFinish() {
        this.A01.removeView(this.A00);
    }
}
