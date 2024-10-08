package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.reels.dashboard.ui.quickreaction.ReactionCountBarView;

public final class UD9 extends C249703kE {
    public final TextView A00;
    public final ConstrainedImageView A01;
    public final ReactionCountBarView A02;

    public UD9(View view) {
        super(view);
        this.A01 = (ConstrainedImageView) view.findViewById(R.id.reaction_display);
        this.A00 = AnonymousClass7TE.A0d(view, R.id.reaction_count);
        this.A02 = (ReactionCountBarView) view.findViewById(R.id.reaction_count_bar);
    }
}
