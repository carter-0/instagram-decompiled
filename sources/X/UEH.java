package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

public final class UEH extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UEH(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A04 = DbW.A0B(view, R.id.earnings_section_title);
        this.A03 = DbW.A0B(view, R.id.earnings_date);
        this.A02 = DbW.A0B(view, R.id.estimated_earnings_title);
        this.A01 = DbW.A0B(view, R.id.amount_earned);
        this.A00 = DbW.A0B(view, R.id.active_members);
        this.A07 = DbW.A0B(view, R.id.num_active_members);
        this.A05 = DbW.A0B(view, R.id.expired_membership);
        this.A08 = DbW.A0B(view, R.id.num_expired_membership);
        this.A06 = DbW.A0B(view, R.id.net_new);
        this.A09 = DbW.A0B(view, R.id.num_net_new);
    }
}
