package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Jp1  reason: case insensitive filesystem */
public final class C60654Jp1 extends C249703kE {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final IgLinearLayout A03;
    public final IgImageView A04;

    public C60654Jp1(View view) {
        super(view);
        this.A00 = view;
        this.A03 = (IgLinearLayout) AnonymousClass7TF.A0F(view, R.id.icon_container);
        this.A04 = DbX.A0b(view, R.id.icon);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.title);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.subtitle);
    }
}
