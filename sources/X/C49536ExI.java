package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.ExI  reason: case insensitive filesystem */
public final class C49536ExI {
    public final TextView A00;
    public final CircularImageView A01;
    public final C71662eb A02;

    public C49536ExI(ViewGroup viewGroup) {
        this.A01 = DbU.A0X(viewGroup, R.id.avatar_imageview);
        this.A00 = DbU.A0G(viewGroup, R.id.username_textview);
        this.A02 = DbY.A0T(viewGroup, R.id.checkbox_viewstub);
    }
}
