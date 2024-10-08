package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.Dol  reason: case insensitive filesystem */
public final class C46993Dol extends C249703kE {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final CircularImageView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46993Dol(ViewGroup viewGroup) {
        super(viewGroup);
        0qQ.A0B(viewGroup, 1);
        this.A03 = DbX.A0a(viewGroup, R.id.avatar_image_view);
        this.A02 = AnonymousClass7TG.A0R(viewGroup, R.id.title);
        this.A00 = AnonymousClass7TF.A0G(viewGroup, R.id.login_button);
        this.A01 = AnonymousClass7TF.A0G(viewGroup, R.id.option_button);
    }
}
