package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.DoX  reason: case insensitive filesystem */
public final class C46979DoX extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final IgdsCheckBox A02;
    public final GradientSpinnerAvatarView A03;

    public C46979DoX(View view) {
        super(view);
        this.A03 = DbX.A0j(view, R.id.row_imageview);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.row_title);
        this.A00 = AnonymousClass7TG.A0R(view, R.id.row_subtitle);
        this.A02 = (IgdsCheckBox) AnonymousClass7TF.A0F(view, R.id.checkbox);
    }
}
