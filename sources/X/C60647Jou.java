package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Jou  reason: case insensitive filesystem */
public final class C60647Jou extends C249703kE {
    public final Context A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;
    public final IgTextView A03;

    public C60647Jou(View view) {
        super(view);
        this.A00 = view.getContext();
        this.A03 = DbX.A0Z(view, R.id.title);
        this.A02 = DbX.A0Z(view, R.id.subtitle);
        this.A01 = DbX.A0Y(view, R.id.button);
    }
}
