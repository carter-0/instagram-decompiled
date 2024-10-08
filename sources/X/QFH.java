package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

public final class QFH extends C249703kE {
    public final TextView A00;
    public final View A01;
    public final /* synthetic */ C7973QeM A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QFH(View view, C7973QeM qeM) {
        super(view);
        this.A02 = qeM;
        TextView A0d = AnonymousClass7TE.A0d(view, R.id.title);
        this.A00 = A0d;
        View findViewById = view.findViewById(R.id.divider);
        this.A01 = findViewById;
        0qQ.A05(A0d);
        SRn.A02(A0d, RH2.A0v);
        Context A0S = AnonymousClass7TE.A0S(view);
        0qQ.A07(findViewById);
        C11386SQz.A00(A0S, findViewById, 19, false);
    }
}
