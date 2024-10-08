package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsRadioButton;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.UDg  reason: case insensitive filesystem */
public final class C14878UDg extends C249703kE {
    public final View A00;
    public final TextView A01 = AnonymousClass7TG.A0R(this.itemView, R.id.channel_name);
    public final TextView A02 = AnonymousClass7TG.A0R(this.itemView, R.id.channel_subtitle);
    public final IgdsRadioButton A03 = ((IgdsRadioButton) AnonymousClass7TF.A0F(this.itemView, R.id.channel_toggle));
    public final GradientSpinnerAvatarView A04 = ((GradientSpinnerAvatarView) AnonymousClass7TF.A0F(this.itemView, R.id.channel_icon));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14878UDg(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = view;
    }
}
