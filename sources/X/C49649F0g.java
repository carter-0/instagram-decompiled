package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.F0g  reason: case insensitive filesystem */
public final class C49649F0g {
    public final View A00;
    public final View A01;
    public final ViewGroup A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;

    public C49649F0g(View view) {
        0qQ.A0B(view, 1);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.like_and_view_count_header_container);
        this.A02 = DbX.A0I(view, R.id.like_and_view_count_container);
        this.A05 = AnonymousClass7TG.A0R(view, R.id.like_count_text);
        this.A06 = AnonymousClass7TG.A0R(view, R.id.video_view_count_text);
        this.A04 = AnonymousClass7TG.A0R(view, R.id.impression_count_text);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.explanation_message);
        this.A01 = AnonymousClass7TF.A0G(view, R.id.divider);
    }
}
