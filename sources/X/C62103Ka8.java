package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.tagging.widget.TagsInteractiveLayout;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Ka8  reason: case insensitive filesystem */
public final class C62103Ka8 extends C62940Kos {
    public IgImageView A00;
    public TagsInteractiveLayout A01;
    public MediaFrameLayout A02;

    public C62103Ka8(View view) {
        Context context = view.getContext();
        C71662eb A0T = DbY.A0T(view, R.id.media_tag_indicator_stub);
        this.A02 = A0T;
        A0T.A02 = new C64886Ljm(1, context, this);
        this.A02 = (MediaFrameLayout) view.requireViewById(R.id.image_container);
        IgImageView A0b = DbT.A0b(view, R.id.tag_image_view);
        this.A00 = A0b;
        03v.A0B(A0b, new C60078JfK(this, 4));
        this.A01 = (TagsInteractiveLayout) view.requireViewById(R.id.combined_tagging_layout);
    }
}
