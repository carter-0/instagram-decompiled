package X;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.instagram.android.R;

public final class QFB extends C249703kE {
    public final TextView A00;
    public final MaterialCalendarGridView A01;

    public QFB(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView A0d = AnonymousClass7TE.A0d(linearLayout, R.id.month_title);
        this.A00 = A0d;
        03v.A0I(A0d, true);
        this.A01 = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (!z) {
            A0d.setVisibility(8);
        }
    }
}
