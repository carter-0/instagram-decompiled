package X;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.MyS  reason: case insensitive filesystem */
public final class C68000MyS extends C249703kE {
    public final LinearLayout A00;
    public final TextView A01;
    public final AnonymousClass7D5 A02;
    public final C332807Wl A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68000MyS(View view, AnonymousClass7D5 r3, C332807Wl r4) {
        super(view);
        AnonymousClass7TG.A1P(view, r3);
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = (LinearLayout) AnonymousClass7TF.A0F(view, R.id.message_overflow_reactions_pill_container);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.overflow_text);
    }
}
