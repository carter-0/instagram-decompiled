package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.DoD  reason: case insensitive filesystem */
public final class C46959DoD extends C249703kE {
    public final IgTextView A00;
    public final IgTextView A01;
    public final IgTextView A02;

    public C46959DoD(View view) {
        super(view);
        this.A01 = DbX.A0Z(view, R.id.row_order_number);
        this.A02 = DbX.A0Z(view, R.id.row_order_price);
        this.A00 = DbX.A0Z(view, R.id.row_order_date_status);
    }
}
