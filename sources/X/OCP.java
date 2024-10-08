package X;

import android.view.View;
import com.instagram.android.R;

public abstract class OCP {
    public final View A00;
    public final View A01;

    public OCP(View view) {
        this.A01 = view;
        this.A00 = AnonymousClass7TE.A0b(view, R.id.background_view);
    }
}
