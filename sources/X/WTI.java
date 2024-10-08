package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;

public final class WTI implements C240963Ni {
    public final /* synthetic */ C358248ab A00;

    public final void DEN() {
    }

    public final void DO4(C240983Nk r9) {
        0qQ.A0B(r9, 0);
        ImageView A0J = DbX.A0J(this.A00.A0Z, R.id.igds_headline_url_image);
        int i = r9.A01;
        int i2 = r9.A00;
        if (i > 0 && 0.0f - 0.0f > 0.0f) {
            C14347TuU.A00(A0J, 0.0f, 0.0f, 0.0f, i, i2);
        }
        ViewGroup.LayoutParams layoutParams = A0J.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -2;
            layoutParams.height = -2;
            A0J.setLayoutParams(layoutParams);
        }
    }

    public WTI(C358248ab r1) {
        this.A00 = r1;
    }
}
