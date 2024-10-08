package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.UDq  reason: case insensitive filesystem */
public final class C14888UDq extends C249703kE {
    public TextView A00;
    public TextView A01;
    public final C252063oV A02;
    public final C252063oV A03;
    public final AnonymousClass0eM A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14888UDq(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A04 = C20693WxP.A00(view, 2);
        C252063oV A0T = C66581MXm.A0T(view, R.id.attribution_stub);
        this.A02 = A0T;
        this.A03 = C66581MXm.A0T(view, R.id.featured_product_permission_overlay);
        A0T.EeU(new C19296WTe(this, 2));
    }
}
