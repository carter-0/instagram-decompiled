package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Joj  reason: case insensitive filesystem */
public final class C60636Joj extends C249703kE {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final IgImageView A03;

    public C60636Joj(View view) {
        super(view);
        this.A00 = view;
        this.A01 = DbX.A0J(view, R.id.suggestion_icon);
        this.A03 = DbX.A0b(view, R.id.circular_suggestion_icon);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.suggestion_text);
    }
}
