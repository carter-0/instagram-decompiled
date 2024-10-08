package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsRadioButton;

/* renamed from: X.Myo  reason: case insensitive filesystem */
public final class C68022Myo extends C249703kE {
    public final View A00;
    public final TextView A01 = AnonymousClass7TG.A0R(this.itemView, R.id.theme_name);
    public final TextView A02 = AnonymousClass7TG.A0R(this.itemView, R.id.theme_subtitle);
    public final IgImageView A03 = DbX.A0b(this.itemView, R.id.theme_icon);
    public final IgImageView A04 = JTO.A0Y(this.itemView, R.id.theme_selected_overlay);
    public final IgdsRadioButton A05 = ((IgdsRadioButton) AnonymousClass7TF.A0F(this.itemView, R.id.theme_toggle));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68022Myo(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = view;
    }
}
