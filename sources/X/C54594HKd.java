package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.HKd  reason: case insensitive filesystem */
public final class C54594HKd extends C53108Gig {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final RoundedCornerImageView A04;
    public final 1Xj A05;

    public C54594HKd(View view, AnonymousClass0iw r3, UserSession userSession, 1Xj r5) {
        super(view);
        this.A00 = r3;
        this.A01 = userSession;
        this.A05 = r5;
        this.A04 = (RoundedCornerImageView) AnonymousClass7TF.A0F(view, R.id.insight_image);
        this.A03 = DbX.A0Z(view, R.id.insight_title);
        this.A02 = DbX.A0Z(view, R.id.insight_subtitle);
    }
}
