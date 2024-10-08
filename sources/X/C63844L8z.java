package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsRadioButton;

/* renamed from: X.L8z  reason: case insensitive filesystem */
public final class C63844L8z {
    public final View A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final IgdsRadioButton A04;

    public C63844L8z(View view) {
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A01 = (IgSimpleImageView) AnonymousClass7TE.A0b(view, R.id.icon);
        this.A03 = Dba.A0E(view, R.id.label);
        this.A02 = Dba.A0E(view, R.id.description);
        this.A04 = (IgdsRadioButton) AnonymousClass7TE.A0b(view, R.id.recipient_picker_radio_button);
    }
}
