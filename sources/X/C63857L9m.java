package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.L9m  reason: case insensitive filesystem */
public final class C63857L9m {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final TextView A03;
    public final C252063oV A04;
    public final C64162LRd A05;

    public C63857L9m(View view, UserSession userSession) {
        0qQ.A0B(view, 1);
        View A0b = AnonymousClass7TE.A0b(view, R.id.row_add_to_exclusive_story_container);
        this.A00 = A0b;
        this.A02 = (ImageView) AnonymousClass7TE.A0b(view, R.id.icon);
        this.A03 = DbW.A0B(view, R.id.label);
        this.A04 = 2b1.A00(view.findViewById(R.id.show_fans_label_stub));
        View A0F = DbY.A0F(view, R.id.one_tap_button_view_stub);
        0qQ.A07(A0F);
        this.A01 = A0F;
        this.A05 = new C64162LRd(A0b, userSession, AnonymousClass05K.A01);
    }
}
