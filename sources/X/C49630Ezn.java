package X;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.checkbox.IgdsCheckBox;

/* renamed from: X.Ezn  reason: case insensitive filesystem */
public final class C49630Ezn {
    public final LinearLayout A00;
    public final TextView A01;
    public final TextView A02;
    public final CircularImageView A03;
    public final IgdsCheckBox A04;

    public C49630Ezn(ViewGroup viewGroup) {
        this.A03 = DbU.A0X(viewGroup, R.id.avatar_image_view);
        this.A02 = Dba.A06(viewGroup);
        this.A01 = DbU.A0G(viewGroup, R.id.full_name);
        this.A04 = (IgdsCheckBox) viewGroup.requireViewById(R.id.list_view_item_checkbox);
        this.A00 = (LinearLayout) viewGroup.requireViewById(R.id.multiple_account_user_row);
    }
}
