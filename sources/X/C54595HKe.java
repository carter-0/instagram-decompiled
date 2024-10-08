package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.HKe  reason: case insensitive filesystem */
public final class C54595HKe extends C53108Gig {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final 1Xj A05;

    public C54595HKe(View view, AnonymousClass0iw r3, UserSession userSession, 1Xj r5) {
        super(view);
        this.A00 = r3;
        this.A01 = userSession;
        this.A05 = r5;
        this.A04 = DbX.A0Z(view, R.id.insight_text_style_holder);
        this.A03 = DbX.A0Z(view, R.id.insight_title);
        this.A02 = DbX.A0Z(view, R.id.insight_subtitle);
    }
}
