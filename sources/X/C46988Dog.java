package X;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Dog  reason: case insensitive filesystem */
public final class C46988Dog extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final ConstraintLayout A02;
    public final IgImageView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46988Dog(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A02 = (ConstraintLayout) AnonymousClass7TE.A0b(view, R.id.direct_inbox_message_setting_container);
        this.A01 = DbW.A0B(view, R.id.direct_inbox_message_setting_title);
        this.A00 = DbW.A0B(view, R.id.direct_inbox_message_setting_description);
        this.A03 = AnonymousClass7TE.A0b(view, R.id.direct_inbox_message_setting_nav_button);
    }
}
