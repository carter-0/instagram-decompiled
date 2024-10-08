package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.Eyn  reason: case insensitive filesystem */
public final class C49578Eyn {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final CircularImageView A03;

    public C49578Eyn(ViewGroup viewGroup) {
        this.A03 = DbU.A0X(viewGroup, R.id.avatar_imageview);
        this.A02 = DbU.A0G(viewGroup, R.id.username_textview);
        this.A00 = viewGroup.requireViewById(R.id.option_button);
        this.A01 = viewGroup.requireViewById(R.id.option_button_dots);
    }
}
