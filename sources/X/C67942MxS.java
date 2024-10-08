package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgCheckBox;
import com.instagram.direct.ui.polls.PollMessageVotersView;

/* renamed from: X.MxS  reason: case insensitive filesystem */
public final class C67942MxS extends C249703kE {
    public final IgCheckBox A00;
    public final PollMessageVotersView A01;

    public C67942MxS(View view) {
        super(view);
        this.A00 = (IgCheckBox) AnonymousClass7TF.A0F(view, R.id.poll_message_option_check_button);
        this.A01 = (PollMessageVotersView) AnonymousClass7TF.A0F(view, R.id.option_voters);
    }
}
