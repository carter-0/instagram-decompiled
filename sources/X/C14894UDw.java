package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.UDw  reason: case insensitive filesystem */
public final class C14894UDw extends C249703kE {
    public final View A00;
    public final View A01;
    public final IgEditText A02;
    public final IgdsButton A03;
    public final IgdsButton A04;

    public C14894UDw(View view) {
        super(view);
        this.A01 = view;
        this.A03 = JTR.A0n(view, R.id.question_sheet_action_button);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.question_input);
        this.A04 = JTR.A0n(view, R.id.question_input_submit_button);
        this.A02 = (IgEditText) AnonymousClass7TF.A0F(view, R.id.question_input_edit_text);
    }
}
