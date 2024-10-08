package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;

public final class OGL {
    public final View A00;
    public final View A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final IgdsButton A04;

    public OGL(View view) {
        0qQ.A0B(view, 1);
        this.A01 = view;
        this.A00 = AnonymousClass7TE.A0b(view, R.id.event_owner_avatar);
        this.A03 = Dba.A0E(view, R.id.event_title);
        this.A02 = Dba.A0E(view, R.id.event_date);
        this.A04 = (IgdsButton) AnonymousClass7TE.A0b(view, R.id.reminder_button);
    }
}
