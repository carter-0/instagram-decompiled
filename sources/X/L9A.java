package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

public final class L9A {
    public final View A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final C258433z0 A04;

    public L9A(View view) {
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A03 = DbX.A0Z(view, R.id.prompt_text);
        this.A01 = DbX.A0Y(view, R.id.add_yours_participation_facepile);
        this.A02 = DbX.A0Z(view, R.id.add_yours_participation_count);
        this.A04 = new C258433z0(view);
    }
}
