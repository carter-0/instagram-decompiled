package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.DoC  reason: case insensitive filesystem */
public final class C46958DoC extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final IgImageView A02;

    public C46958DoC(View view) {
        super(view);
        this.A02 = DbX.A0b(view, R.id.row_image);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.title);
        this.A00 = AnonymousClass7TG.A0R(view, R.id.subtitle);
    }
}
