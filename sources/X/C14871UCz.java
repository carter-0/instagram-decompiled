package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.UCz  reason: case insensitive filesystem */
public final class C14871UCz extends C249703kE {
    public final ConstraintLayout A00;
    public final IgTextView A01;
    public final IgImageView A02;

    public C14871UCz(View view) {
        super(view);
        this.A00 = (ConstraintLayout) AnonymousClass7TF.A0F(view, R.id.container);
        this.A01 = DbX.A0Z(view, R.id.text_filter);
        this.A02 = DbX.A0b(view, R.id.image_filter);
    }
}
