package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.6lS  reason: invalid class name and case insensitive filesystem */
public final class C316316lS {
    public ViewGroup A00;
    public ImageView A01;
    public TextView A02;
    public final ViewStub A03;

    public C316316lS(ViewStub viewStub) {
        0qQ.A0B(viewStub, 1);
        this.A03 = viewStub;
    }

    public final void A00() {
        ViewGroup viewGroup;
        if (this.A00 == null) {
            View inflate = this.A03.inflate();
            if ((inflate instanceof ViewGroup) && (viewGroup = (ViewGroup) inflate) != null) {
                this.A00 = viewGroup;
                this.A01 = (ImageView) viewGroup.findViewById(R.id.effect_attribution_icon);
                this.A02 = (TextView) viewGroup.findViewById(R.id.effect_attribution_label);
            }
        }
    }
}
