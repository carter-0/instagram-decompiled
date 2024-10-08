package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.JpD  reason: case insensitive filesystem */
public final class C60666JpD extends C249703kE {
    public final View A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final TextView A05;
    public final TextView A06;

    public C60666JpD(View view) {
        super(view);
        this.A01 = AnonymousClass7TE.A0b(view, R.id.container);
        this.A04 = AnonymousClass7TE.A0b(view, R.id.tag_event_label);
        this.A02 = AnonymousClass7TE.A0b(view, R.id.event_row);
        this.A00 = AnonymousClass7TE.A0b(view, R.id.chevron_icon);
        this.A03 = AnonymousClass7TE.A0b(view, R.id.remove_event_icon);
        this.A06 = DbW.A0B(view, R.id.event_title);
        this.A05 = DbW.A0B(view, R.id.event_details);
    }
}
