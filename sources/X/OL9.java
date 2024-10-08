package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class OL9 {
    public ViewGroup A00;
    public TextView A01;
    public IgImageView A02;
    public final ViewStub A03;

    public OL9(ViewStub viewStub) {
        0qQ.A0B(viewStub, 1);
        this.A03 = viewStub;
    }

    public final void A00() {
        if (this.A00 == null) {
            View inflate = this.A03.inflate();
            C66580MXl.A1R(inflate);
            ViewGroup viewGroup = (ViewGroup) inflate;
            this.A02 = DbT.A0b(viewGroup, R.id.reel_app_attribution_icon);
            this.A01 = DbU.A0G(viewGroup, R.id.reel_app_attribution_action_text);
            this.A00 = viewGroup;
        }
    }
}
