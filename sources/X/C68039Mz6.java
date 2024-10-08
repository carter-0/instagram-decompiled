package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Mz6  reason: case insensitive filesystem */
public final class C68039Mz6 extends C249703kE {
    public final View A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final IgImageView A07;
    public final C70936OSj A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68039Mz6(View view, AnonymousClass4DH r3, UserSession userSession, C70936OSj oSj) {
        super(view);
        C51974G9v.A1M(r3, userSession, oSj);
        this.A00 = view;
        this.A01 = r3;
        this.A02 = userSession;
        this.A08 = oSj;
        this.A07 = DbX.A0b(view, R.id.direct_inbox_campaign_item_thumbnail);
        this.A06 = DbX.A0Z(view, R.id.direct_inbox_campaign_active_date);
        this.A04 = DbX.A0Z(view, R.id.direct_inbox_campaign_budget_spent);
        this.A03 = DbX.A0Z(view, R.id.direct_inbox_campaign_info_divider);
        this.A05 = DbX.A0Z(view, R.id.direct_inbox_campaign_message_counter);
    }
}
