package X;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.VbV  reason: case insensitive filesystem */
public final class C17639VbV {
    public final View A00;
    public final CheckBox A01;
    public final ImageView A02;
    public final ImageView A03;
    public final TextView A04;
    public final TextView A05;
    public final C252063oV A06;

    public C17639VbV(View view) {
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A02 = DbX.A0J(view, R.id.catalog_image);
        this.A04 = AnonymousClass7TG.A0R(view, R.id.catalog_main_text);
        this.A05 = AnonymousClass7TG.A0R(view, R.id.catalog_sub_text);
        this.A01 = (CheckBox) AnonymousClass7TF.A0F(view, R.id.catalog_checkbox);
        this.A03 = DbX.A0J(view, R.id.info_image);
        this.A06 = C66581MXm.A0T(view, R.id.catalog_checkbox_spinner);
    }
}
