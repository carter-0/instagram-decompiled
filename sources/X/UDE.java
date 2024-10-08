package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

public final class UDE extends C249703kE {
    public final Context A00;
    public final TextView A01;
    public final TextView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDE(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A01 = DbW.A0B(view, R.id.description);
        this.A02 = DbW.A0B(view, R.id.social_proof);
        this.A00 = AnonymousClass7TE.A0S(view);
    }
}
