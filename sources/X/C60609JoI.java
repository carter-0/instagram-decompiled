package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.JoI  reason: case insensitive filesystem */
public final class C60609JoI extends C249703kE {
    public final View A00;
    public final TextView A01;
    public final TextView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60609JoI(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A02 = DbW.A0B(view, R.id.folder_row_name_view);
        this.A01 = DbW.A0B(view, R.id.folder_row_footnote_view);
    }
}
