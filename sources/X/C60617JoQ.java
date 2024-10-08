package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.JoQ  reason: case insensitive filesystem */
public final class C60617JoQ extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final IgdsSwitch A02;

    public C60617JoQ(View view) {
        super(view);
        this.A01 = DbW.A0B(view, R.id.title);
        this.A00 = DbW.A0B(view, R.id.description);
        this.A02 = (IgdsSwitch) AnonymousClass7TE.A0b(view, R.id.allow_ads_switch);
        view.findViewById(R.id.section_title).setVisibility(8);
    }
}
