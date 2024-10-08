package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.MyV  reason: case insensitive filesystem */
public final class C68003MyV extends C249703kE {
    public final Context A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;

    public C68003MyV(View view) {
        super(view);
        this.A01 = view;
        this.A03 = AnonymousClass7TG.A0R(view, R.id.row_title);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.row_subtitle);
        this.A00 = AnonymousClass7TE.A0S(view);
    }
}
