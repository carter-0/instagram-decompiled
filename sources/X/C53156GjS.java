package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.GjS  reason: case insensitive filesystem */
public final class C53156GjS extends C249703kE implements AnonymousClass2xU {
    public final TextView A00;
    public final TextView A01;
    public final IgdsButton A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53156GjS(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A01 = DbW.A0B(view, R.id.title);
        this.A00 = DbW.A0B(view, R.id.subtitle);
        this.A02 = (IgdsButton) AnonymousClass7TE.A0b(view, R.id.action_button);
    }

    public final void DQp(AnonymousClass3W1 r2, int i) {
        0qQ.A0B(r2, 0);
        if (i == 21) {
            C54981HaE.A00(this, r2);
        }
    }
}
