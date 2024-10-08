package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Gj9  reason: case insensitive filesystem */
public final class C53137Gj9 extends C249703kE {
    public final ViewGroup A00;
    public final TextView A01;
    public final TextView A02;
    public final /* synthetic */ GUB A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53137Gj9(View view, GUB gub) {
        super(view);
        0qQ.A0B(view, 2);
        this.A03 = gub;
        ViewGroup A0I = DbX.A0I(view, R.id.disclosure_bar_container);
        this.A00 = A0I;
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.disclosure_header);
        this.A02 = A0R;
        TextView A0R2 = AnonymousClass7TG.A0R(view, R.id.disclosure_body);
        this.A01 = A0R2;
        A0R.setText(2131960830);
        A0R2.setText(2131960827);
        ID2.A02(A0I, 60, view, gub);
    }
}
