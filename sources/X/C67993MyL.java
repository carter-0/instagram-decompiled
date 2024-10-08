package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.MyL  reason: case insensitive filesystem */
public final class C67993MyL extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final IgView A02;
    public final IgImageView A03;

    public C67993MyL(View view) {
        super(view);
        this.A03 = DbX.A0b(view, R.id.row_image);
        this.A01 = C66582MXn.A0F(view);
        this.A00 = AnonymousClass7TG.A0R(view, R.id.subtitle);
        this.A02 = (IgView) AnonymousClass7TF.A0F(view, R.id.thread_state_indicator);
    }
}
