package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

public final class UDY extends C249703kE {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final CircularImageView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDY(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = view;
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.account_section_title);
        this.A02 = A0R;
        C13988Tno.A16(A0R, true);
        this.A01 = AnonymousClass7TE.A0d(view, R.id.account_section_subtitle);
        this.A03 = (CircularImageView) view.findViewById(R.id.account_section_avatar);
        AnonymousClass7TF.A0G(view, R.id.account_section_arrow).setVisibility(0);
    }
}
