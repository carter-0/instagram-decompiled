package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.OEb  reason: case insensitive filesystem */
public final class C70630OEb {
    public final View A00;
    public final TextView A01;
    public final TextView A02;

    public C70630OEb(View view) {
        this.A00 = view;
        this.A02 = DbU.A0G(view, R.id.bottom_sheet_header_title);
        TextView A0G = DbU.A0G(view, R.id.bottom_sheet_header_info);
        this.A01 = A0G;
        DbT.A1H(A0G);
    }
}
