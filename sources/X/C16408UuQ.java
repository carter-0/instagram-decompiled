package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* renamed from: X.UuQ  reason: case insensitive filesystem */
public final class C16408UuQ extends C54010Gxs {
    public final IgdsMediaButton A00;
    public final IgdsMediaButton A01;
    public final IgdsMediaButton A02;
    public final IgdsMediaButton A03;
    public final IgdsMediaButton A04;

    public C16408UuQ(View view) {
        super(view);
        this.A00 = (IgdsMediaButton) AnonymousClass7TE.A0b(view, R.id.clips_count_display_button);
        this.A01 = (IgdsMediaButton) AnonymousClass7TE.A0b(view, R.id.messages_count_display_button);
        this.A03 = (IgdsMediaButton) AnonymousClass7TE.A0b(view, R.id.stories_count_display_button);
        this.A02 = (IgdsMediaButton) AnonymousClass7TE.A0b(view, R.id.photos_count_display_button);
        this.A04 = (IgdsMediaButton) AnonymousClass7TE.A0b(view, R.id.user_count_display_button);
    }
}
