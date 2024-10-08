package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Dp4  reason: case insensitive filesystem */
public final class C47012Dp4 extends C249703kE {
    public final View A00;
    public final ImageView A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;

    public C47012Dp4(View view) {
        super(view);
        this.A00 = view;
        this.A01 = DbX.A0J(view, R.id.image_check_list_item);
        this.A05 = AnonymousClass7TG.A0R(view, R.id.text_check_list_item);
        this.A04 = AnonymousClass7TE.A0d(view, R.id.text_check_list_item_subtitle);
        this.A02 = DbX.A0J(view, R.id.image_check_list_item_status);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.text_progress);
    }
}
