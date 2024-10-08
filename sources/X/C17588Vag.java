package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Vag  reason: case insensitive filesystem */
public final class C17588Vag {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;

    public C17588Vag(View view) {
        this.A01 = view;
        this.A05 = Dba.A06(view);
        this.A04 = Dba.A05(view);
        this.A03 = DbU.A0G(view, R.id.button);
        this.A00 = view.requireViewById(R.id.dismiss_button);
        this.A02 = DbU.A0F(view, R.id.icon);
    }
}
