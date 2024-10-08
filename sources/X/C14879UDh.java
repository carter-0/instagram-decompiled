package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.UDh  reason: case insensitive filesystem */
public final class C14879UDh extends C249703kE {
    public final View A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgImageView A03;
    public final IgdsButton A04;

    public C14879UDh(View view) {
        super(view);
        this.A00 = AnonymousClass7TE.A0b(view, R.id.priority_action);
        this.A03 = JTR.A0i(view, R.id.priority_action_cell_icon);
        this.A02 = Dba.A0E(view, R.id.priority_action_cell_title);
        this.A01 = Dba.A0E(view, R.id.priority_action_cell_subtitle);
        this.A04 = C13989Tnp.A0X(view, R.id.priority_action_cell_button);
    }
}
