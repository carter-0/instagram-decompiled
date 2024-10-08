package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.VZa  reason: case insensitive filesystem */
public final class C17521VZa {
    public final ImageView A00;
    public final LinearLayout A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;

    public C17521VZa(View view) {
        this.A03 = DbU.A0G(view, R.id.super_title);
        this.A04 = Dba.A06(view);
        this.A02 = DbU.A0G(view, R.id.secondary_title);
        this.A00 = DbU.A0F(view, R.id.toggle);
        this.A01 = (LinearLayout) view.requireViewById(R.id.operation_hours_container);
    }
}
