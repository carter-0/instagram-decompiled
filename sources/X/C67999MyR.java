package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* renamed from: X.MyR  reason: case insensitive filesystem */
public final class C67999MyR extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final CircularImageView A02;
    public final ConstrainedImageView A03;

    public C67999MyR(View view) {
        super(view);
        this.A02 = DbX.A0a(view, R.id.row_avatar);
        this.A00 = AnonymousClass7TG.A0R(view, R.id.primary_name);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.subtitle);
        this.A03 = (ConstrainedImageView) AnonymousClass7TF.A0F(view, R.id.main_emoji);
    }
}
