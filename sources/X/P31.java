package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;

public final class P31 implements C327807Cg {
    public final /* synthetic */ NJ8 A00;

    public final void ESW(int i, int i2, int i3, int i4) {
    }

    public final void setBackgroundColor(int i) {
    }

    public P31(NJ8 nj8) {
        this.A00 = nj8;
    }

    public final void EPw(Drawable drawable) {
        View findViewById;
        View view = this.A00.mView;
        if (view != null && (findViewById = view.findViewById(R.id.thread_background_view)) != null) {
            findViewById.setBackground(drawable);
        }
    }
}
