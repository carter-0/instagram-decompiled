package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Mxe  reason: case insensitive filesystem */
public final class C67954Mxe extends C249703kE {
    public final ImageView A00;
    public final TextView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67954Mxe(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.row_simple_text_title);
        this.A00 = DbX.A0J(view, R.id.row_icon);
        view.requireViewById(R.id.row_simple_text_description).setVisibility(8);
        DbT.A1F(view, R.id.row_address_dot, 8);
        DbT.A1F(view, R.id.row_simple_text_extra_info, 8);
    }
}
