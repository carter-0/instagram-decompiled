package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Dok  reason: case insensitive filesystem */
public final class C46992Dok extends C249703kE {
    public final View A00;
    public final TextView A01;
    public final C252063oV A02;
    public final C355568Qm A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46992Dok(View view, C355568Qm r4) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A03 = r4;
        this.A01 = AnonymousClass7TG.A0R(view, R.id.pill_text);
        this.A02 = DbU.A0Z(view, R.id.pill_icon_stub);
        if (r4 != null) {
            view.setOnLongClickListener(new FPV(0, r4, this));
        }
    }
}
