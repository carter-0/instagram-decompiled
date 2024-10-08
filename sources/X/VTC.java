package X;

import android.view.View;
import android.widget.FrameLayout;
import com.instagram.android.R;

public abstract class VTC {
    public final View A00;
    public final FrameLayout A01;

    public VTC(FrameLayout frameLayout) {
        this.A01 = frameLayout;
        this.A00 = frameLayout.requireViewById(R.id.background_view);
    }
}
