package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class UD2 extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final ViewGroup A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UD2(ViewGroup viewGroup) {
        super(viewGroup);
        0qQ.A0B(viewGroup, 1);
        this.A02 = viewGroup;
        this.A00 = AnonymousClass7TG.A0R(viewGroup, R.id.primary_text);
        this.A01 = AnonymousClass7TG.A0R(viewGroup, R.id.subtitle_text);
    }
}
