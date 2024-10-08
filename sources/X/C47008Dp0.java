package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Dp0  reason: case insensitive filesystem */
public final class C47008Dp0 extends C249703kE {
    public final View A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgImageView A03;
    public final IgImageView A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47008Dp0(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A03 = DbX.A0b(view, R.id.background_content);
        this.A04 = DbX.A0b(view, R.id.end_card_image);
        this.A02 = DbX.A0Z(view, R.id.end_card_description);
        this.A01 = DbX.A0Z(view, R.id.watch_more_label);
    }
}
