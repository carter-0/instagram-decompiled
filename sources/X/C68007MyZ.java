package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.MyZ  reason: case insensitive filesystem */
public final class C68007MyZ extends C249703kE {
    public final GradientSpinnerAvatarView A00;
    public final TextView A01;
    public final TextView A02;
    public final IgdsSwitch A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68007MyZ(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = DbX.A0j(view, R.id.avatar);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.primary_text);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.secondary_text);
        this.A03 = (IgdsSwitch) AnonymousClass7TF.A0F(view, R.id.switch_button);
    }
}
