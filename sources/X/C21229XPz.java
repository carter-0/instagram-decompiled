package X;

import android.view.animation.Animation;
import com.instagram.tagging.widget.TagsLayout;

/* renamed from: X.XPz  reason: case insensitive filesystem */
public final class C21229XPz extends WCQ {
    public final /* synthetic */ C60046JeE A00;
    public final /* synthetic */ TagsLayout A01;

    public C21229XPz(C60046JeE jeE, TagsLayout tagsLayout) {
        this.A01 = tagsLayout;
        this.A00 = jeE;
    }

    public final void onAnimationEnd(Animation animation) {
        this.A01.post(new Y24(this));
    }
}
