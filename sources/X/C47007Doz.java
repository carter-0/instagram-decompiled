package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Doz  reason: case insensitive filesystem */
public final class C47007Doz extends C249703kE {
    public final ImageView A00;
    public final TextView A01;
    public final C252063oV A02;
    public final C252063oV A03;
    public final C252063oV A04;

    public C47007Doz(View view) {
        super(view);
        this.A00 = (ImageView) AnonymousClass7TE.A0b(view, R.id.menu_option_icon);
        this.A01 = DbW.A0B(view, R.id.menu_option_text);
        this.A03 = 2b1.A00(view.findViewById(R.id.profile_menu_option_dot_badge_stub));
        this.A04 = DbU.A0Z(view, R.id.profile_menu_option_new_badge_stub);
        this.A02 = 2b1.A00(view.findViewById(R.id.blue_badge_stub));
    }
}
