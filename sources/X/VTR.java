package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

public final class VTR {
    public final TextView A00;
    public final TextView A01;

    public VTR(View view) {
        this.A00 = DbW.A0B(view, R.id.username_attribution);
        this.A01 = DbW.A0B(view, R.id.view_media_attribution);
    }
}
