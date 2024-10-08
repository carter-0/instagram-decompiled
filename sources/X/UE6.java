package X;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class UE6 extends C249703kE {
    public final TextView A00;
    public final FragmentActivity A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final IgImageView A04;
    public final IgImageView A05;
    public final IgImageView A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UE6(View view, FragmentActivity fragmentActivity, AnonymousClass0iw r4, UserSession userSession) {
        super(view);
        AnonymousClass7TG.A1U(view, userSession, fragmentActivity);
        0qQ.A0B(r4, 4);
        this.A03 = userSession;
        this.A01 = fragmentActivity;
        this.A02 = r4;
        this.A04 = view.findViewById(R.id.spotlight_tray_cover_image_bottom);
        this.A05 = view.findViewById(R.id.spotlight_tray_cover_image_middle);
        this.A06 = view.findViewById(R.id.spotlight_tray_cover_image_top);
        this.A00 = AnonymousClass7TE.A0d(view, R.id.spotlight_tray_item_label);
    }
}
