package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.button.IgdsRadioButton;

public final class L90 {
    public Boolean A00;
    public final View A01;
    public final TextView A02;
    public final CircularImageView A03;
    public final IgdsRadioButton A04;

    public L90(View view) {
        0qQ.A0B(view, 1);
        this.A01 = AnonymousClass7TE.A0b(view, R.id.row_add_to_story_container);
        this.A03 = (CircularImageView) AnonymousClass7TE.A0b(view, R.id.row_add_to_story_profile_picture);
        this.A02 = DbW.A0B(view, R.id.sharing_preferences_label);
        this.A04 = (IgdsRadioButton) AnonymousClass7TE.A0b(view, R.id.recipient_picker_radio_button);
    }
}
