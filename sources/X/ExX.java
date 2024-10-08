package X;

import android.view.View;
import android.widget.EditText;
import com.instagram.android.R;

public abstract class ExX {
    public final View A00;
    public final View A01;
    public final EditText A02;

    public ExX(View view) {
        this.A00 = view.requireViewById(R.id.direct_private_share_message_view);
        this.A01 = view.requireViewById(R.id.sharesheet_write_message_header);
        EditText A0E = DbU.A0E(view, R.id.direct_private_share_message_box);
        this.A02 = A0E;
        A0E.setHint(view.getContext().getString(2131960523));
        A0E.setTextSize(0, (float) view.getResources().getDimensionPixelSize(R.dimen.account_group_management_row_text_size));
    }
}
