package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.JoO  reason: case insensitive filesystem */
public final class C60615JoO extends C249703kE {
    public final IgTextView A00;
    public final IgTextView A01;
    public final CircularImageView A02;

    public C60615JoO(View view) {
        super(view);
        this.A02 = (CircularImageView) AnonymousClass7TF.A0F(view, R.id.option_voter_avatar);
        this.A00 = DbX.A0Z(view, R.id.option_voter_primary_name);
        this.A01 = DbX.A0Z(view, R.id.option_voter_secondary_name);
    }
}
