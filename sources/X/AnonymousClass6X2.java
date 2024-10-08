package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;
import com.instagram.user.model.User;

/* renamed from: X.6X2  reason: invalid class name */
public final class AnonymousClass6X2 extends AnonymousClass6X3 {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final ReelHeaderAttributionType A02;
    public final C316276lO A03;
    public final C317126ml A04;
    public final User A05;
    public final User A06;

    public AnonymousClass6X2(Context context, AnonymousClass0iw r4, UserSession userSession, C255773uh r6, C316276lO r7, C317126ml r8) {
        super(r4, userSession, r6);
        User user;
        User user2;
        this.A00 = context;
        this.A03 = r7;
        this.A04 = r8;
        this.A01 = r4;
        1Xj r1 = r6.A0b;
        if (r1 != null) {
            user = r1.A0C.BnZ();
        } else {
            user = null;
        }
        this.A06 = user;
        if (r1 != null) {
            user2 = r1.A0C.Bna();
        } else {
            user2 = null;
        }
        this.A05 = user2;
        this.A02 = ReelHeaderAttributionType.CLIPS_FULL_SCREEN_RESHARE_ATTRIBUTION;
    }
}
