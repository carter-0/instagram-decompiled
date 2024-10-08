package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;

public abstract class S4V {
    public View A00;
    public final int A01;
    public final ViewStub A02;

    public final View A00() {
        View view = this.A00;
        if (view != null) {
            return view;
        }
        0qQ.A0F("itemView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A01() {
        if (this instanceof C8100Qgs) {
            C8100Qgs qgs = (C8100Qgs) this;
            ImageView imageView = qgs.A01;
            if (imageView != null) {
                S71.A00(imageView);
            }
            ImageView imageView2 = qgs.A00;
            if (imageView2 != null) {
                S71.A00(imageView2);
            }
        }
    }

    public S4V(ViewStub viewStub, int i) {
        this.A02 = viewStub;
        this.A01 = i;
    }
}
