package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

public final class F09 {
    public final ViewGroup A00;
    public final CheckBox A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final CircularImageView A05;

    public F09(View view) {
        this.A03 = DbU.A0G(view, R.id.page_name);
        this.A04 = DbU.A0G(view, R.id.page_sub_title);
        this.A02 = DbU.A0G(view, R.id.page_description);
        this.A05 = DbU.A0X(view, R.id.page_profile_image);
        this.A00 = DbU.A0C(view, R.id.row_page_container);
        CheckBox checkBox = (CheckBox) view.requireViewById(R.id.checkbox);
        this.A01 = checkBox;
        2eS.A04(checkBox, AnonymousClass05K.A02);
    }
}
