package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.igds.components.button.IgdsRadioButton;

/* renamed from: X.MyP  reason: case insensitive filesystem */
public final class C67997MyP extends C249703kE {
    public final View A00;
    public final TextView A01;
    public final IgSimpleImageView A02;
    public final IgdsRadioButton A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67997MyP(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A01 = DbW.A0B(view, R.id.direct_inbox_filter_option_title);
        this.A03 = (IgdsRadioButton) AnonymousClass7TE.A0b(view, R.id.direct_inbox_filter_option_radio);
        this.A02 = (IgSimpleImageView) AnonymousClass7TE.A0b(view, R.id.direct_inbox_filter_option_icon);
    }
}
