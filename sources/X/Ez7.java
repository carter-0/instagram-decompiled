package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

public final class Ez7 {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final CircularImageView A03;

    public Ez7(ViewGroup viewGroup) {
        this.A03 = DbU.A0X(viewGroup, R.id.avatar_image_view);
        this.A02 = Dba.A06(viewGroup);
        this.A01 = DbU.A0G(viewGroup, R.id.full_name);
        this.A00 = viewGroup.requireViewById(R.id.login_button);
    }
}
