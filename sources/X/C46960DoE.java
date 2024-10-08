package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* renamed from: X.DoE  reason: case insensitive filesystem */
public final class C46960DoE extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final ColorFilterAlphaImageView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46960DoE(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.title);
        this.A00 = AnonymousClass7TG.A0R(view, R.id.message);
        this.A02 = (ColorFilterAlphaImageView) AnonymousClass7TF.A0F(view, R.id.dismiss_button);
    }
}
