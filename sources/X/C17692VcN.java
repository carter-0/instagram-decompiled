package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.VcN  reason: case insensitive filesystem */
public final class C17692VcN {
    public final View A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final ImageView A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final IgTextView A08;
    public final IgTextView A09;
    public final IgTextView A0A;

    public C17692VcN(View view) {
        0qQ.A0B(view, 1);
        this.A04 = view;
        this.A01 = AnonymousClass7TF.A0G(view, R.id.location_information_wrapper);
        this.A09 = DbX.A0Z(view, R.id.location_info_row_1);
        this.A0A = DbX.A0Z(view, R.id.location_info_row_2);
        this.A02 = AnonymousClass7TF.A0G(view, R.id.location_info_link_wrapper);
        this.A06 = DbX.A0Z(view, R.id.location_directions);
        this.A08 = DbX.A0Z(view, R.id.links_separator);
        this.A07 = DbX.A0Z(view, R.id.location_information);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.direct_button);
        this.A03 = AnonymousClass7TF.A0G(view, R.id.save_button);
        this.A05 = DbX.A0J(view, R.id.save_icon);
    }
}
