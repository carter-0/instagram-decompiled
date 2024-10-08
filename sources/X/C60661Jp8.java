package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* renamed from: X.Jp8  reason: case insensitive filesystem */
public final class C60661Jp8 extends C249703kE {
    public final Context A00;
    public final IgdsMediaButton A01;
    public final IgdsMediaButton A02;
    public final IgdsMediaButton A03;
    public final IgdsMediaButton A04;
    public final IgdsMediaButton A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60661Jp8(Context context, View view, C63654L1q l1q) {
        super(view);
        AnonymousClass7TG.A1Q(context, l1q);
        this.A00 = context;
        View findViewById = view.findViewById(R.id.clips_count_display_button);
        IgdsMediaButton igdsMediaButton = (IgdsMediaButton) findViewById;
        LY6.A01(igdsMediaButton, 37, l1q);
        0qQ.A07(findViewById);
        this.A01 = igdsMediaButton;
        this.A02 = (IgdsMediaButton) AnonymousClass7TE.A0b(view, R.id.messages_count_display_button);
        IgdsMediaButton igdsMediaButton2 = (IgdsMediaButton) view.findViewById(R.id.stories_count_display_button);
        LY6.A01(igdsMediaButton2, 38, l1q);
        this.A04 = igdsMediaButton2;
        this.A03 = (IgdsMediaButton) AnonymousClass7TE.A0b(view, R.id.photos_count_display_button);
        this.A05 = (IgdsMediaButton) AnonymousClass7TE.A0b(view, R.id.user_count_display_button);
    }
}
