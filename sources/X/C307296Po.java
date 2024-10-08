package X;

import android.view.View;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.6Po  reason: invalid class name and case insensitive filesystem */
public final class C307296Po implements C2365734g {
    public final /* synthetic */ C307286Pn A00;

    public C307296Po(C307286Pn r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        0qQ.A0B(view, 0);
        C307286Pn r1 = this.A00;
        IgTextView requireViewById = view.requireViewById(R.id.question_title);
        0qQ.A0B(requireViewById, 0);
        r1.A02 = requireViewById;
        IgdsButton igdsButton = (IgdsButton) view.requireViewById(R.id.action_button_v2);
        0qQ.A0B(igdsButton, 0);
        r1.A03 = igdsButton;
        LinearLayout linearLayout = (LinearLayout) view.requireViewById(R.id.question_list);
        0qQ.A0B(linearLayout, 0);
        r1.A01 = linearLayout;
        View requireViewById2 = view.requireViewById(R.id.answer_options_container);
        0qQ.A0B(requireViewById2, 0);
        r1.A00 = requireViewById2;
    }
}
