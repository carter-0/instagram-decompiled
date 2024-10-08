package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Luw  reason: case insensitive filesystem */
public final class C65533Luw implements AnonymousClass2sT {
    public UserSession A00;
    public ClipsDraftRepository A01;
    public AnonymousClass3Q2 A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final ImageView A07;
    public final ImageView A08;
    public final ImageView A09;
    public final ImageView A0A;
    public final ProgressBar A0B;
    public final TextView A0C;
    public final IgImageView A0D;
    public final IgdsButton A0E;

    public C65533Luw(View view) {
        0qQ.A0B(view, 1);
        this.A03 = AnonymousClass7TF.A0G(view, R.id.row_pending_container);
        this.A0D = DbX.A0b(view, R.id.row_pending_media_imageview);
        this.A09 = DbX.A0J(view, R.id.row_pending_media_imageview_overlay);
        this.A0A = DbX.A0J(view, R.id.row_pending_media_retry_button);
        this.A07 = DbX.A0J(view, R.id.row_pending_media_discard_button);
        this.A08 = DbX.A0J(view, R.id.row_pending_media_options_button);
        this.A0B = (ProgressBar) AnonymousClass7TF.A0F(view, R.id.row_pending_media_progress_bar);
        this.A06 = AnonymousClass7TF.A0G(view, R.id.row_pending_media_status_text_views);
        this.A0C = AnonymousClass7TG.A0R(view, R.id.row_pending_media_status_textview);
        this.A04 = AnonymousClass7TF.A0G(view, R.id.vertical_divider);
        this.A05 = AnonymousClass7TF.A0G(view, R.id.row_pending_media_imageview_container);
        this.A0E = JTR.A0n(view, R.id.row_pending_media_reshare_button);
    }

    public final void DaJ(AnonymousClass3Q2 r3) {
        0qQ.A0B(r3, 0);
        this.A0B.post(new M7X(this, r3));
    }

    public final 1ua A00() {
        1ud r2 = 1ua.A0G;
        Context A0S = AnonymousClass7TE.A0S(this.A0C);
        UserSession userSession = this.A00;
        if (userSession != null) {
            return r2.A01(A0S, userSession);
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A01() {
        AnonymousClass3Q2 r0 = this.A02;
        if (r0 != null) {
            A00().A07(AnonymousClass6WL.A02(AnonymousClass7TE.A0S(this.A0C)), r0.A35, false);
        }
        UserSession userSession = this.A00;
        if (userSession != null) {
            0xI A002 = C59882Jb5.A00(AnonymousClass05K.A15);
            A002.A0C("reason", "pending_media_cancel_tap");
            DbU.A1R(A002, userSession);
        }
    }

    public final void A02(boolean z) {
        String str;
        Context A0S = AnonymousClass7TE.A0S(this.A0C);
        if (z) {
            AnonymousClass3Q2 r0 = this.A02;
            if (r0 != null) {
                AnonymousClass55U r02 = r0.A6I;
                if (!(r02 == null || (str = r02.A02) == null || !00l.A0d(str, "VIDEO_RENDER_ERROR", false))) {
                    C358248ab A0Y = DbS.A0Y(A0S);
                    A0Y.A09(2131969308);
                    A0Y.A08(2131969307);
                    LV2.A01(A0Y, this, 19, 2131969290);
                    Dba.A1M(A0Y);
                    Dba.A0t(LV2.A00(this, 20), A0Y, 2131969304);
                    return;
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        1ua A002 = A00();
        AnonymousClass3Q2 r03 = this.A02;
        if (r03 != null) {
            JTU.A0g(A0S, r03, A002);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
