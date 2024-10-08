package X;

import android.view.MotionEvent;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.List;

public final class P8H implements AnonymousClass7DS {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final AnonymousClass7X4 A02;

    public P8H(AnonymousClass0iw r2, UserSession userSession, AnonymousClass7X4 r4) {
        0qQ.A0B(r4, 1);
        this.A02 = r4;
        this.A01 = userSession;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ boolean DRa(MotionEvent motionEvent, Object obj, Object obj2) {
        NYS nys = (NYS) obj;
        PBS pbs = (PBS) obj2;
        boolean A1b = C51973G9u.A1b(nys, pbs, motionEvent);
        boolean BCL = nys.BCL();
        MessageIdentifier BSG = nys.BSG();
        AnonymousClass7X4 r14 = this.A02;
        if (!C70020Nvy.A00((C332927Wz) r14, BSG, BCL)) {
            C67000MgY.A00(this.A00, this.A01, (Long) null, "selfie_thumbnail_xma", "tap", "direct_thread", (String) null, DbY.A0m("viewer_is_sender", String.valueOf(nys.CU2())));
            List A1N = 0sr.A1N(nys.A00);
            IgProgressImageView igProgressImageView = pbs.A03;
            ((C332917Wy) r14).Cpz(igProgressImageView, C68168N3i.A00(igProgressImageView), AnonymousClass05K.A00, A1N, 0, nys.BCL(), false);
        }
        return A1b;
    }
}
