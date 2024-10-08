package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.capture.quickcapture.freetransform.widget.ClipTransformItemView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.KLs  reason: case insensitive filesystem */
public final class C61779KLs extends C60680JpR {
    public final IgTextView A00;
    public final ClipTransformItemView A01;
    public final RoundedCornerFrameLayout A02;

    public C61779KLs(View view) {
        super(view);
        this.A02 = (RoundedCornerFrameLayout) AnonymousClass7TE.A0b(view, R.id.empty_thumbnail_background);
        this.A00 = Dba.A0E(view, R.id.color_transform_name_text);
        this.A01 = (ClipTransformItemView) AnonymousClass7TE.A0b(view, R.id.clip_transform_item_view);
    }
}
