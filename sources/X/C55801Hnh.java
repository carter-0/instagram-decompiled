package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.List;

/* renamed from: X.Hnh  reason: case insensitive filesystem */
public final class C55801Hnh {
    public final View A00;
    public final View A01;
    public final ViewGroup A02;
    public final List A03 = AnonymousClass7TE.A1C();
    public final SpinnerImageView A04;

    public C55801Hnh(View view, UserSession userSession) {
        AnonymousClass7TG.A1P(view, userSession);
        View A0b = AnonymousClass7TE.A0b(view, R.id.comment_emoji_picker_v1_parent);
        this.A01 = A0b;
        this.A00 = AnonymousClass7TE.A0b(view, R.id.emoji_picker_v1_divider);
        this.A04 = (SpinnerImageView) AnonymousClass7TE.A0b(view, R.id.row_feed_emoji_picker_loading_spinner);
        ViewGroup A0C = DbU.A0C(view, R.id.comment_emoji_picker_v1_emoji_container);
        this.A02 = A0C;
        if (182.A06(0Tu.A05, userSession, 36323032343915261L)) {
            A0b.setPadding(0, 0, 0, 0);
        }
        Context context = A0C.getContext();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_star_medium);
        int i = 0;
        do {
            IgFrameLayout A012 = C337077fe.A01(context, dimensionPixelSize, false);
            this.A02.addView(A012);
            this.A03.add(A012);
            i++;
        } while (i < 8);
    }
}
