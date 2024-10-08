package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.UnK  reason: case insensitive filesystem */
public final class C16031UnK extends C14898UEa {
    public final IgLinearLayout A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final CircularImageView A03;

    public C16031UnK(View view, UserSession userSession) {
        super(view, userSession);
        this.A02 = DbX.A0Z(view, R.id.customer_info_title);
        this.A01 = DbX.A0Z(view, R.id.customer_info_description);
        this.A00 = (IgLinearLayout) AnonymousClass7TF.A0F(view, R.id.customer_info_questions_container);
        this.A03 = DbX.A0a(view, R.id.profile_image);
    }
}
