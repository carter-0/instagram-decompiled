package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.F0e  reason: case insensitive filesystem */
public final class C49647F0e {
    public String A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;

    public C49647F0e(View view) {
        0qQ.A0B(view, 1);
        this.A05 = AnonymousClass7TE.A0d(view, R.id.text);
        this.A06 = AnonymousClass7TE.A0d(view, R.id.serial);
        this.A02 = view.findViewById(R.id.serial_layout);
        this.A04 = DbS.A0G(view, R.id.selected);
        this.A01 = view.findViewById(R.id.answer_container);
        this.A03 = view.findViewById(R.id.serial_layout_extra_margin);
    }
}
