package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Mxn  reason: case insensitive filesystem */
public final class C67963Mxn extends C249703kE {
    public final IgSimpleImageView A00;
    public final IgTextView A01;
    public final IgTextView A02;

    public C67963Mxn(View view) {
        super(view);
        this.A02 = JTO.A0X(view, R.id.title);
        this.A01 = JTO.A0X(view, R.id.subtitle);
        this.A00 = (IgSimpleImageView) view.findViewById(R.id.subtitle_icon);
    }
}
