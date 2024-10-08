package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.JoK  reason: case insensitive filesystem */
public final class C60611JoK extends C249703kE {
    public final IgSimpleImageView A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;

    public C60611JoK(View view) {
        super(view);
        this.A00 = DbX.A0Y(view, R.id.left_action_imageview);
        this.A02 = DbX.A0Z(view, R.id.title_textview);
        this.A01 = DbX.A0Y(view, R.id.right_action_imageview);
    }
}
