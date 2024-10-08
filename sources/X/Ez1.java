package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

public final class Ez1 {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final CircularImageView A03;

    public Ez1(View view) {
        this.A00 = view.requireViewById(R.id.uhl_account_row);
        this.A03 = DbU.A0X(view, R.id.uhl_account_profile_image);
        this.A01 = DbU.A0G(view, R.id.uhl_account_full_name);
        this.A02 = DbU.A0G(view, R.id.uhl_account_username);
    }
}
