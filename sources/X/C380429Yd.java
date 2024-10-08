package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.9Yd  reason: invalid class name and case insensitive filesystem */
public final class C380429Yd extends C249703kE {
    public final IgTextView A00;
    public final View A01;

    /* JADX WARNING: type inference failed for: r2v1, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.widget.ImageView] */
    public C380429Yd(View view) {
        super(view);
        this.A01 = view;
        this.A00 = AnonymousClass7TE.A0b(view, R.id.segment_time);
        ? r2 = (RoundedCornerImageView) view.findViewById(R.id.thumbnail_image);
        r2.setImageDrawable(view.getContext().getDrawable(R.drawable.item_template_placeholder));
        r2.setStrokeEnabled(false);
    }
}
