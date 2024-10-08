package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.Myt  reason: case insensitive filesystem */
public final class C68027Myt extends C249703kE {
    public final View A00;
    public final TextView A01;
    public final IgImageButton A02;
    public final IgImageButton A03;
    public final IgImageButton A04;
    public final TextView A05;

    public C68027Myt(View view) {
        super(view);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.title_container);
        TextView A0F = C66582MXn.A0F(view);
        this.A01 = A0F;
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.see_all);
        this.A05 = A0R;
        this.A03 = (IgImageButton) AnonymousClass7TF.A0F(view, R.id.media_left);
        this.A02 = (IgImageButton) AnonymousClass7TF.A0F(view, R.id.media_center);
        this.A04 = (IgImageButton) AnonymousClass7TF.A0F(view, R.id.media_right);
        A0F.setFocusable(true);
        A0R.setFocusable(true);
    }
}
