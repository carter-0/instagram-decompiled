package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

public final class UDK extends C249703kE {
    public final ViewGroup A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDK(ViewGroup viewGroup) {
        super(viewGroup);
        0qQ.A0B(viewGroup, 1);
        this.A00 = viewGroup;
        this.A02 = AnonymousClass7TG.A0R(viewGroup, R.id.primary_text);
        this.A03 = AnonymousClass7TG.A0R(viewGroup, R.id.secondary_text);
        this.A01 = DbX.A0J(viewGroup, R.id.chevron_icon);
    }
}
