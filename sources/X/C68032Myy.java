package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Myy  reason: case insensitive filesystem */
public final class C68032Myy extends C249703kE {
    public final View A00;
    public final ImageView A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final IgdsButton A05;
    public final View A06;

    public C68032Myy(View view) {
        super(view);
        this.A06 = view;
        this.A00 = view;
        this.A02 = DbX.A0J(view, R.id.icon_imageview);
        this.A04 = AnonymousClass7TG.A0R(view, R.id.contact_sync_title);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.contact_sync_subtitle);
        this.A05 = JTR.A0n(view, R.id.contact_sync_action_button);
        this.A01 = DbX.A0J(view, R.id.dismiss_button);
    }
}
