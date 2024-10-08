package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.U6l  reason: case insensitive filesystem */
public final class C14744U6l extends ConstraintLayout {
    public final int A00;
    public final IgLinearLayout A01 = ((IgLinearLayout) requireViewById(R.id.description_container));
    public final IgTextView A02 = DbT.A0a(this, R.id.body_text_view);
    public final IgTextView A03 = DbT.A0a(this, R.id.header_text_view);
    public final RoundedCornerImageView A04 = ((RoundedCornerImageView) requireViewById(R.id.service_image));

    public C14744U6l(Context context) {
        super(context, (AttributeSet) null, 0);
        View.inflate(context, R.layout.lead_gen_view_creatives_service, this);
        this.A00 = (int) 0nA.A04(context, 12);
    }
}
