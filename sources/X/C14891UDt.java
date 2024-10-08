package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.UDt  reason: case insensitive filesystem */
public final class C14891UDt extends C249703kE {
    public final View A00;
    public final TextView A01;
    public final IgImageView A02;
    public final IgImageView A03;
    public final RoundedCornerFrameLayout A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14891UDt(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A04 = (RoundedCornerFrameLayout) AnonymousClass7TE.A0b(view, R.id.image_container);
        this.A02 = JTR.A0i(view, R.id.avatar);
        this.A03 = JTR.A0i(view, R.id.image);
        this.A01 = DbW.A0B(view, R.id.primary_text);
        this.A00 = AnonymousClass7TE.A0b(view, R.id.remove_button);
    }
}
