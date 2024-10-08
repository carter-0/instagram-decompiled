package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;

public final class VWP {
    public final Context A00;
    public final View A01;
    public final ImageView A02;

    public VWP(View view, int i) {
        this.A00 = AnonymousClass7TE.A0S(view);
        this.A01 = view.findViewById(i);
        this.A02 = DbS.A0G(view, R.id.sticker);
    }
}
