package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.JpK  reason: case insensitive filesystem */
public final class C60673JpK extends C249703kE {
    public Context A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final FragmentActivity A06;
    public final UserSession A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60673JpK(UserSession userSession, FragmentActivity fragmentActivity, View view) {
        super(view);
        0qQ.A0B(view, 3);
        this.A00 = view.getContext();
        this.A07 = userSession;
        this.A06 = fragmentActivity;
        this.A01 = DbU.A0G(view, R.id.earnings_total_title);
        this.A03 = DbU.A0G(view, R.id.header_description_one);
        this.A05 = DbU.A0G(view, R.id.matching_description);
        this.A04 = DbU.A0G(view, R.id.header_description_two);
        this.A02 = DbU.A0G(view, R.id.date_range);
    }
}
