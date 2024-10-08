package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Gj2  reason: case insensitive filesystem */
public abstract class C53130Gj2 extends C249703kE {
    public final View A00;
    public final TextView A01;
    public final TextView A02;

    public C53130Gj2(View view) {
        super(view);
        this.A00 = view;
        this.A02 = AnonymousClass7TG.A0R(view, R.id.collection_name);
        View findViewById = view.findViewById(R.id.collection_description);
        if (findViewById != null) {
            this.A01 = (TextView) findViewById;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
