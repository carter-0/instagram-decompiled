package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

public final class OGM {
    public final View A00;
    public final View A01;
    public final ConstraintLayout A02;
    public final IgTextView A03;
    public final IgTextView A04;

    public OGM(View view) {
        0qQ.A0B(view, 1);
        this.A01 = view;
        this.A02 = (ConstraintLayout) AnonymousClass7TE.A0b(view, R.id.ig_basic_metadata_footer_container);
        this.A04 = Dba.A0E(view, R.id.footer_title);
        this.A03 = Dba.A0E(view, R.id.footer_subtitle);
        this.A00 = AnonymousClass7TE.A0b(view, R.id.footer_chevron_right);
    }
}
