package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.VbD  reason: case insensitive filesystem */
public final class C17621VbD {
    public View A00;
    public IgImageView A01;
    public final View A02;
    public final View A03;
    public final ViewStub A04;
    public final TextView A05;
    public final C240963Ni A06 = new WTJ(this, 1);

    public C17621VbD(View view) {
        0qQ.A0B(view, 1);
        this.A04 = JTR.A0X(view, R.id.acr_preview_image_stub);
        this.A02 = AnonymousClass7TF.A0G(view, R.id.acr_action_button);
        this.A03 = AnonymousClass7TF.A0G(view, R.id.hide_acr_button);
        this.A05 = AnonymousClass7TG.A0R(view, R.id.your_auto_created_clip_subtitle);
    }
}
