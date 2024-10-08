package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgCheckBox;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.direct.ui.polls.PollMessageOptionView;

/* renamed from: X.Mxs  reason: case insensitive filesystem */
public final class C67968Mxs extends C249703kE {
    public final IgCheckBox A00;
    public final IgSimpleImageView A01;
    public final PollMessageOptionView A02;

    public C67968Mxs(View view) {
        super(view);
        IgSimpleImageView A0Y = DbX.A0Y(view, R.id.poll_message_add_icon);
        this.A01 = A0Y;
        this.A00 = (IgCheckBox) AnonymousClass7TF.A0F(view, R.id.poll_message_new_option_check_button);
        PollMessageOptionView pollMessageOptionView = (PollMessageOptionView) AnonymousClass7TF.A0F(view, R.id.poll_message_new_option_view);
        this.A02 = pollMessageOptionView;
        IgEditText igEditText = pollMessageOptionView.A00;
        if (igEditText == null) {
            0qQ.A0F("editText");
            throw AnonymousClass00P.createAndThrow();
        }
        igEditText.setBackground((Drawable) null);
        C71395Oju.A00(A0Y, 0, this);
    }
}
