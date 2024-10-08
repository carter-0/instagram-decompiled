package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.6PL  reason: invalid class name */
public final class AnonymousClass6PL {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public IgImageView A08;
    public final C252063oV A09;

    public AnonymousClass6PL(ViewStub viewStub) {
        0qQ.A0B(viewStub, 1);
        C252063oV A012 = 2b1.A01(viewStub, false, false);
        this.A09 = A012;
        A012.EeU(new AnonymousClass6PM(this));
    }

    public final View A00() {
        View view = this.A00;
        if (view != null) {
            return view;
        }
        0qQ.A0F("cardView");
        throw AnonymousClass00P.createAndThrow();
    }
}
