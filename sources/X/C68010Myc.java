package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.model.direct.DirectSearchPrompt;

/* renamed from: X.Myc  reason: case insensitive filesystem */
public final class C68010Myc extends C249703kE {
    public int A00;
    public DirectSearchPrompt A01;
    public final TextView A02;
    public final IgSimpleImageView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68010Myc(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A02 = C66582MXn.A0F(view);
        this.A03 = DbX.A0Y(view, R.id.icon);
    }
}
