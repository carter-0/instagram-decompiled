package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.button.IgdsRadioButton;

/* renamed from: X.L8y  reason: case insensitive filesystem */
public final class C63843L8y {
    public final View A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final CircularImageView A03;
    public final IgdsRadioButton A04;

    public C63843L8y(View view) {
        0qQ.A0B(view, 1);
        this.A00 = AnonymousClass7TE.A0b(view, R.id.row_add_to_story_container);
        this.A03 = (CircularImageView) AnonymousClass7TE.A0b(view, R.id.row_add_to_story_profile_picture);
        this.A01 = Dba.A0E(view, R.id.add_to_story_label);
        IgTextView A0E = Dba.A0E(view, R.id.sharing_preferences_label);
        this.A02 = A0E;
        this.A04 = (IgdsRadioButton) AnonymousClass7TE.A0b(view, R.id.recipient_picker_radio_button);
        A0E.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }
}
