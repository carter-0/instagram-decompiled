package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.My4  reason: case insensitive filesystem */
public final class C67979My4 extends C249703kE {
    public final ImageView A00;
    public final TextView A01;
    public final TextView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67979My4(View view, C70493O8s o8s) {
        super(view);
        0qQ.A0B(o8s, 2);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.sort_and_filter_label);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.sort_and_filter_subtitle);
        ImageView A0J = DbX.A0J(view, R.id.sort_and_filter_button);
        this.A00 = A0J;
        AnonymousClass0fU.A00(new C71402Ok1(o8s, 40), A0J);
    }
}
