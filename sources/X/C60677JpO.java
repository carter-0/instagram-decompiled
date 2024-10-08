package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.JpO  reason: case insensitive filesystem */
public final class C60677JpO extends C249703kE {
    public Context A00;
    public Resources A01;
    public final View A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final FragmentActivity A09;
    public final UserSession A0A;

    public C60677JpO(UserSession userSession, FragmentActivity fragmentActivity, View view) {
        super(view);
        this.A0A = userSession;
        this.A09 = fragmentActivity;
        this.A08 = AnonymousClass7TG.A0R(view, R.id.earnings_section_title);
        this.A06 = AnonymousClass7TG.A0R(view, R.id.amount_earned);
        this.A07 = AnonymousClass7TG.A0R(view, R.id.incentive_match_amount);
        this.A05 = AnonymousClass7TG.A0R(view, R.id.earnings_date);
        this.A04 = AnonymousClass7TG.A0R(view, R.id.badges_received);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.badges_amount);
        this.A02 = AnonymousClass7TF.A0G(view, R.id.see_supporters);
        Context A0S = AnonymousClass7TE.A0S(view);
        this.A00 = A0S;
        this.A01 = AnonymousClass7TF.A0A(A0S);
    }
}
