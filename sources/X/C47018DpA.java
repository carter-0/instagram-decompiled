package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.DpA  reason: case insensitive filesystem */
public final class C47018DpA extends C249703kE {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final IgImageView A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47018DpA(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A05 = AnonymousClass7TE.A0b(view, R.id.icon);
        this.A04 = DbW.A0B(view, R.id.title);
        this.A02 = DbW.A0B(view, R.id.message);
        this.A03 = DbW.A0B(view, R.id.primary_button);
        this.A01 = (ImageView) AnonymousClass7TE.A0b(view, R.id.dismiss_button);
    }
}
