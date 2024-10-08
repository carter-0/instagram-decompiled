package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.JoC  reason: case insensitive filesystem */
public final class C60603JoC extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final IgdsListCell A02;

    public C60603JoC(View view) {
        super(view);
        this.A00 = AnonymousClass7TG.A0R(view, R.id.earnings_section_title);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.earnings_section_period);
        this.A02 = (IgdsListCell) AnonymousClass7TF.A0F(view, R.id.earnings_amount_text);
    }
}
