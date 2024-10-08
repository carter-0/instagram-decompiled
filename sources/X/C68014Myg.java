package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.instagram.android.R;

/* renamed from: X.Myg  reason: case insensitive filesystem */
public final class C68014Myg extends C249703kE {
    public final View A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final AnonymousClass7D5 A03;
    public final C332807Wl A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68014Myg(View view, AnonymousClass7D5 r3, C332807Wl r4) {
        super(view);
        AnonymousClass7TG.A1P(view, r3);
        this.A00 = view;
        this.A04 = r4;
        this.A03 = r3;
        this.A02 = (LinearLayout) AnonymousClass7TF.A0F(view, R.id.message_add_custom_reactions_pill_container);
        this.A01 = DbX.A0J(view, R.id.add_reaction);
    }
}
