package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.OHo  reason: case insensitive filesystem */
public final class C70719OHo {
    public final IgFrameLayout A00;
    public final C252063oV A01;
    public final C252063oV A02;
    public final C252063oV A03;
    public final C252063oV A04;
    public final C252063oV A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;

    public C70719OHo(View view, UserSession userSession, int i) {
        IgFrameLayout igFrameLayout = (IgFrameLayout) AnonymousClass7TF.A0F(view, i);
        this.A00 = igFrameLayout;
        this.A02 = DbU.A0Z(igFrameLayout, R.id.direct_multi_media_play_icon_view_stub);
        this.A04 = DbU.A0Z(igFrameLayout, R.id.privacy_overlay_image_container_legacy_view_stub);
        this.A03 = DbU.A0Z(igFrameLayout, R.id.privacy_overlay_image_container_flat_view_stub);
        this.A07 = C73916Plr.A00(userSession, this, 42);
        this.A06 = C73916Plr.A00(userSession, this, 41);
        this.A05 = DbU.A0Z(igFrameLayout, R.id.privacy_overlay_stub);
        this.A01 = DbU.A0Z(igFrameLayout, R.id.determinate_progress_overlay);
    }
}
