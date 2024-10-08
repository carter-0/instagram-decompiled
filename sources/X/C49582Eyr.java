package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Eyr  reason: case insensitive filesystem */
public final class C49582Eyr {
    public final View A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;
    public final IgTextView A03;

    public C49582Eyr(View view) {
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A01 = (IgSimpleImageView) AnonymousClass7TE.A0b(view, R.id.icon);
        this.A02 = Dba.A0E(view, R.id.label);
        this.A03 = Dba.A0E(view, R.id.new_badge);
    }
}
