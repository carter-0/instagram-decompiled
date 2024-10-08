package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Job  reason: case insensitive filesystem */
public final class C60628Job extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;

    public C60628Job(View view) {
        super(view);
        this.A02 = DbW.A0B(view, R.id.section_title);
        TextView A0B = DbW.A0B(view, R.id.section_action);
        this.A00 = A0B;
        this.A01 = DbW.A0B(view, R.id.description);
        2eS.A01(A0B);
    }
}
