package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.selectableview.SingleSelectableAvatar;

/* renamed from: X.Ezy  reason: case insensitive filesystem */
public final class C49641Ezy {
    public final ViewGroup A00;
    public final CheckBox A01;
    public final TextView A02;
    public final TextView A03;
    public final SingleSelectableAvatar A04;

    public C49641Ezy(View view) {
        this.A00 = DbU.A0C(view, R.id.row_user_container);
        this.A03 = DbU.A0G(view, R.id.row_user_username);
        this.A02 = DbU.A0G(view, R.id.row_user_info);
        this.A04 = (SingleSelectableAvatar) view.requireViewById(R.id.row_single_user_imageview);
        this.A01 = (CheckBox) view.requireViewById(R.id.row_user_checkbox);
    }
}
