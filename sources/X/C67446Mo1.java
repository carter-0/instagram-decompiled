package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Mo1  reason: case insensitive filesystem */
public final class C67446Mo1 {
    public final ImageView A00;
    public final ImageView A01;
    public final TextView A02;
    public final IgdsButton A03;
    public final IgdsButton A04;

    public C67446Mo1(View view) {
        0qQ.A0B(view, 1);
        this.A02 = DbW.A0B(view, R.id.title_text_view);
        this.A04 = (IgdsButton) AnonymousClass7TE.A0b(view, R.id.see_all_action_view);
        this.A03 = (IgdsButton) AnonymousClass7TE.A0b(view, R.id.clear_action_view);
        this.A00 = (ImageView) AnonymousClass7TE.A0b(view, R.id.dismiss_button);
        this.A01 = (ImageView) AnonymousClass7TE.A0b(view, R.id.history_icon_action_view);
    }

    public static final void A00(View view) {
        0qQ.A0B(view, 0);
        view.setVisibility(8);
    }
}
