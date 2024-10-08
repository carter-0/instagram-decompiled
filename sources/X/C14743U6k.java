package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.U6k  reason: case insensitive filesystem */
public final class C14743U6k extends ConstraintLayout {
    public final IgTextView A00 = DbT.A0a(this, R.id.body_text_view);
    public final IgTextView A01 = DbT.A0a(this, R.id.header_text_view);
    public final CircularImageView A02 = DbU.A0X(this, R.id.reviewer_image);

    public C14743U6k(Context context) {
        super(context, (AttributeSet) null, 0);
        View.inflate(context, R.layout.lead_gen_view_creatives_social_proof, this);
    }
}
