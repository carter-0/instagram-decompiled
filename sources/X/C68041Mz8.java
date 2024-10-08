package X;

import android.app.Activity;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Mz8  reason: case insensitive filesystem */
public final class C68041Mz8 extends C249703kE {
    public final Activity A00;
    public final View A01;
    public final AnonymousClass4DH A02;
    public final UserSession A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final IgImageView A08;
    public final C70936OSj A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68041Mz8(Activity activity, View view, AnonymousClass4DH r4, UserSession userSession) {
        super(view);
        C51974G9v.A1M(r4, userSession, activity);
        this.A01 = view;
        this.A02 = r4;
        this.A03 = userSession;
        this.A00 = activity;
        this.A09 = new C70936OSj(r4, userSession);
        this.A08 = DbX.A0b(view, R.id.direct_inbox_campaign_thread_profile_image);
        this.A04 = DbX.A0Z(view, R.id.direct_inbox_campaign_thread_name);
        this.A06 = DbX.A0Z(view, R.id.direct_inbox_campaign_thread_message_preview);
        this.A05 = DbX.A0Z(view, R.id.direct_inbox_campaign_thread_message_preview_divider);
        this.A07 = DbX.A0Z(view, R.id.direct_inbox_campaign_thread_message_preview_timestamp);
    }
}
