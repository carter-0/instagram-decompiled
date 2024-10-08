package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;

/* renamed from: X.Myf  reason: case insensitive filesystem */
public final class C68013Myf extends C249703kE {
    public final View A00;
    public final IgSimpleImageView A01;
    public final IgSimpleImageView A02;
    public final IgTextView A03;
    public final IgView A04;

    public C68013Myf(View view) {
        super(view);
        this.A00 = view;
        this.A02 = DbX.A0Y(view, R.id.icon);
        this.A03 = DbX.A0Z(view, R.id.title);
        this.A04 = (IgView) AnonymousClass7TF.A0F(view, R.id.thread_state_indicator);
        this.A01 = DbX.A0Y(view, R.id.chevron);
    }
}
