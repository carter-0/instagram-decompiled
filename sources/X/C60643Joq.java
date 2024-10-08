package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Joq  reason: case insensitive filesystem */
public final class C60643Joq extends C249703kE {
    public final View A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgImageView A03;

    public C60643Joq(View view) {
        super(view);
        this.A00 = view;
        this.A03 = DbX.A0b(view, R.id.next_step_icon);
        this.A02 = DbX.A0Z(view, R.id.next_step_title);
        this.A01 = DbX.A0Z(view, R.id.next_step_subtitle);
    }
}
