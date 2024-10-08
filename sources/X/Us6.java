package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

public final class Us6 extends UEW {
    public final View A00;
    public final View A01 = this.A00.findViewById(R.id.divider);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Us6(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = view;
        TextView A0d = AnonymousClass7TE.A0d(view, R.id.button_label);
        0qQ.A0B(A0d, 0);
        this.A01 = A0d;
        ImageView A0G = DbS.A0G(this.A00, R.id.button);
        0qQ.A0B(A0G, 0);
        this.A00 = A0G;
    }
}
