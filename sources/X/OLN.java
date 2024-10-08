package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

public final class OLN {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final Context A04;

    public final void A00(int i, int i2, int i3) {
        TextView textView = this.A03;
        Context context = this.A04;
        DbT.A18(context, textView, i);
        DbT.A18(context, this.A02, i2);
        this.A01.setImageResource(i3);
    }

    public OLN(View view, Context context) {
        this.A00 = view;
        this.A04 = context;
        this.A01 = DbX.A0J(view, R.id.icon);
        this.A03 = C66582MXn.A0F(view);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.content);
    }
}
