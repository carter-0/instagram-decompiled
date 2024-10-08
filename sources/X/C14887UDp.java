package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.UDp  reason: case insensitive filesystem */
public final class C14887UDp extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final IgImageView A02;
    public final IgdsButton A03;
    public final IgdsButton A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14887UDp(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A02 = JTR.A0i(view, R.id.merchant_avatar);
        this.A01 = DbW.A0B(view, R.id.title);
        TextView A0B = DbW.A0B(view, R.id.subtitle);
        this.A00 = A0B;
        this.A03 = C13989Tnp.A0X(view, R.id.accept_button);
        this.A04 = C13989Tnp.A0X(view, R.id.decline_button);
        03v.A0B(A0B, new U7B(0));
        DbT.A1H(A0B);
        A0B.setLongClickable(false);
    }
}
