package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.JoE  reason: case insensitive filesystem */
public final class C60605JoE extends C249703kE {
    public final View A00;
    public final IgTextView A01;
    public final CircularImageView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60605JoE(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A02 = (CircularImageView) AnonymousClass7TF.A0F(view, R.id.avatar_view);
        this.A01 = DbX.A0Z(view, R.id.username);
    }
}
