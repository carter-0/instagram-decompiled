package X;

import android.view.View;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;

public final class W9A implements View.OnClickListener {
    public final /* synthetic */ C316236lK A00;

    public W9A(C316236lK r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1491462872);
        C316236lK r1 = this.A00;
        C252063oV r0 = r1.A02;
        if (r0 != null) {
            AnonymousClass7TH.A0R(r0.getView());
        }
        IgBouncyUfiButtonImageView igBouncyUfiButtonImageView = r1.A04;
        igBouncyUfiButtonImageView.setVisibility(0);
        igBouncyUfiButtonImageView.performClick();
        AnonymousClass0fD.A0C(-1792076905, A05);
    }
}
