package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgButton;

/* renamed from: X.VbR  reason: case insensitive filesystem */
public final class C17635VbR {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final IgButton A06;

    public C17635VbR(View view) {
        this.A05 = Dba.A06(view);
        this.A02 = DbU.A0G(view, R.id.description);
        this.A03 = DbU.A0G(view, R.id.learn_more);
        this.A06 = (IgButton) view.requireViewById(R.id.learn_more_button);
        this.A04 = DbU.A0G(view, R.id.secondary_cta);
        this.A01 = DbU.A0G(view, R.id.bottom_notice);
        this.A00 = view.requireViewById(R.id.dismiss_button);
    }
}
