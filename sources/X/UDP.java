package X;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;

public final class UDP extends C249703kE {
    public V4V A00;
    public final LinearLayout A01;
    public final TextView A02;
    public final TextView A03;

    public UDP(View view) {
        super(view);
        this.A01 = (LinearLayout) view.requireViewById(R.id.sticker_container);
        this.A03 = Dba.A06(view);
        this.A02 = Dba.A05(view);
    }
}
