package instagram.features.clips.viewer.video;

import X.AnonymousClass07V;
import X.AnonymousClass07i;
import X.AnonymousClass7TG;
import X.C51971G9r;
import X.HnX;
import X.I04;
import X.LVB;
import android.content.Context;
import com.instagram.common.session.UserSession;

public final class ClipsMidcardVirtualVideoPlayerController {
    public boolean A00;
    public boolean A01;
    public final Context A02;
    public final AnonymousClass07V A03;
    public final AnonymousClass07i A04;
    public final UserSession A05;
    public HnX midcardPlayerManager;
    public I04 sequentialPlayerManager;

    public final void A00() {
        this.A00 = false;
        HnX hnX = this.midcardPlayerManager;
        if (hnX != null) {
            LVB lvb = hnX.A00;
            if (lvb != null) {
                lvb.A00();
            }
            C51971G9r.A1K(this.A05);
        }
        I04 i04 = this.sequentialPlayerManager;
        if (i04 != null) {
            LVB lvb2 = i04.A01;
            if (lvb2 != null) {
                lvb2.A00 = false;
                lvb2.A02.A05();
            }
            LVB lvb3 = i04.A01;
            if (lvb3 != null) {
                lvb3.A00();
            }
            i04.A01 = null;
            i04.A04.clear();
            i04.A00 = -1;
            C51971G9r.A1K(this.A05);
        }
    }

    public ClipsMidcardVirtualVideoPlayerController(Context context, AnonymousClass07V r2, AnonymousClass07i r3, UserSession userSession) {
        AnonymousClass7TG.A1Q(userSession, r2);
        this.A02 = context;
        this.A05 = userSession;
        this.A03 = r2;
        this.A04 = r3;
    }
}
