package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;

public final class VX3 {
    public final ConstraintLayout A00;
    public final IgdsButton A01;
    public final IgdsButton A02;

    public VX3(View view) {
        this.A00 = (ConstraintLayout) AnonymousClass7TE.A0b(view, R.id.feedback_buttons_container);
        this.A01 = C13989Tnp.A0X(view, R.id.irrelevant_match_button);
        this.A02 = C13989Tnp.A0X(view, R.id.relevant_match_button);
    }
}
