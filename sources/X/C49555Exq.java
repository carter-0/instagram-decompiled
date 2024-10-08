package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.checkbox.IgdsCheckBox;

/* renamed from: X.Exq  reason: case insensitive filesystem */
public final class C49555Exq {
    public final TextView A00;
    public final CircularImageView A01;
    public final IgdsCheckBox A02;

    public C49555Exq(ViewGroup viewGroup) {
        this.A01 = DbU.A0X(viewGroup, R.id.row_user_avatar);
        this.A00 = DbU.A0G(viewGroup, R.id.row_username_textview);
        this.A02 = (IgdsCheckBox) viewGroup.requireViewById(R.id.select_checkbox);
    }
}
