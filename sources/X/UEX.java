package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class UEX extends C249703kE {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final IgImageView A03;
    public final C252063oV A04;
    public final C252063oV A05;
    public final C252063oV A06;
    public final C252063oV A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UEX(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A01 = view;
        this.A00 = AnonymousClass7TE.A0b(view, R.id.comment_container);
        this.A03 = JTR.A0i(view, R.id.circular_image_view);
        this.A06 = C66581MXm.A0T(view, R.id.circular_image_emoji_stub);
        this.A05 = C66581MXm.A0T(view, R.id.circular_image_emoji_animated_stub);
        this.A02 = DbW.A0B(view, R.id.comment_message);
        this.A04 = C66581MXm.A0T(view, R.id.comment_action_button_stub);
        this.A07 = C66581MXm.A0T(view, R.id.comment_featured_image_stub);
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof UEX) && 0qQ.A0K(this.A01, ((UEX) obj).A01));
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
