package X;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Myh  reason: case insensitive filesystem */
public final class C68015Myh extends C249703kE {
    public final View A00;
    public final LinearLayout A01;
    public final TextView A02;
    public final AnonymousClass7D5 A03;
    public final C332807Wl A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68015Myh(View view, AnonymousClass7D5 r3, C332807Wl r4) {
        super(view);
        AnonymousClass7TG.A1P(view, r3);
        this.A00 = view;
        this.A04 = r4;
        this.A03 = r3;
        this.A01 = (LinearLayout) AnonymousClass7TF.A0F(view, R.id.message_overflow_reactions_pill_container);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.overflow_text);
    }
}
