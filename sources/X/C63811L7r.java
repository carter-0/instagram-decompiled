package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.L7r  reason: case insensitive filesystem */
public final class C63811L7r {
    public final View A00;
    public final IgTextView A01;
    public final IgSimpleImageView A02;
    public final IgTextView A03;

    public C63811L7r(Context context, View view) {
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A01 = Dba.A0E(view, R.id.number_of_lists);
        IgSimpleImageView igSimpleImageView = (IgSimpleImageView) AnonymousClass7TE.A0b(view, R.id.icon);
        this.A02 = igSimpleImageView;
        IgTextView A0E = Dba.A0E(view, R.id.label);
        this.A03 = A0E;
        igSimpleImageView.setImageDrawable(C346697vb.A00(context));
        A0E.setText(2131953262);
    }
}
