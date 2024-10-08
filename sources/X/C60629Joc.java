package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.Joc  reason: case insensitive filesystem */
public final class C60629Joc extends C249703kE {
    public final View A00;
    public final TextView A01;
    public final CircularImageView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60629Joc(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = AnonymousClass7TE.A0b(view, R.id.row_container);
        this.A02 = (CircularImageView) AnonymousClass7TE.A0b(view, R.id.profile_picture);
        this.A01 = DbW.A0B(view, R.id.title);
    }
}
