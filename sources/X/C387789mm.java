package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.9mm  reason: invalid class name and case insensitive filesystem */
public final class C387789mm extends AnonymousClass9YS {
    public TextView A00;
    public IgSimpleImageView A01;
    public final View A02;
    public final UserSession A03;
    public final AnonymousClass3NM A04;
    public final 0sP A05;

    public C387789mm(View view, UserSession userSession, 0sP r6) {
        super(view);
        this.A05 = r6;
        this.A03 = userSession;
        this.A02 = AnonymousClass7TF.A0G(view, R.id.invite_upsell_view);
        this.A01 = (IgSimpleImageView) AnonymousClass7TF.A0F(view, R.id.invite_upsell_icon);
        this.A00 = AnonymousClass7TG.A0R(view, R.id.invite_upsell_title);
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(view);
        A0m.A07 = true;
        this.A04 = C386359kT.A00(A0m, this, 14);
    }
}
