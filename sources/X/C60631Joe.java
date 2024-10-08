package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Joe  reason: case insensitive filesystem */
public final class C60631Joe extends C249703kE {
    public final View A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgImageView A03;

    public C60631Joe(View view) {
        super(view);
        this.A00 = view;
        this.A03 = DbX.A0b(view, R.id.reels_item_image);
        this.A02 = DbX.A0Z(view, R.id.reels_item_earnings);
        this.A01 = DbX.A0Z(view, R.id.reels_item_date);
    }
}
