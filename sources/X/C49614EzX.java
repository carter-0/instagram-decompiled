package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.EzX  reason: case insensitive filesystem */
public final class C49614EzX {
    public final ViewGroup A00;
    public final CheckBox A01;
    public final TextView A02;
    public final TextView A03;
    public final CircularImageView A04;

    public C49614EzX(View view) {
        0qQ.A0B(view, 1);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.row_page_name);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.row_page_category);
        this.A04 = DbX.A0a(view, R.id.row_page_imageview);
        CheckBox checkBox = (CheckBox) AnonymousClass7TF.A0F(view, R.id.checkbox);
        this.A01 = checkBox;
        this.A00 = DbX.A0I(view, R.id.row_page_container);
        2eS.A04(checkBox, AnonymousClass05K.A02);
    }
}
