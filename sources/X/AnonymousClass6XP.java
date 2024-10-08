package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;

/* renamed from: X.6XP  reason: invalid class name */
public final class AnonymousClass6XP extends C308916We {
    public final Context A00;
    public final ReelHeaderAttributionType A01;
    public final C255773uh A02;
    public final AnonymousClass8D7 A03;
    public final C316276lO A04;
    public final C317126ml A05;
    public final String A06;
    public final AnonymousClass0iw A07;

    public AnonymousClass6XP(Context context, AnonymousClass0iw r4, UserSession userSession, C255773uh r6, C316276lO r7, C317126ml r8) {
        super(r4, userSession, r6);
        AnonymousClass8D7 r0;
        this.A00 = context;
        this.A04 = r7;
        this.A02 = r6;
        this.A05 = r8;
        this.A07 = r4;
        C255783ui A002 = C289745e8.A00(AnonymousClass3WT.MESSAGE_SHARE, r6.A0b());
        String str = null;
        if (A002 != null) {
            r0 = A002.A13;
        } else {
            r0 = null;
        }
        this.A03 = r0;
        this.A06 = r0 != null ? r0.A01() : str;
        this.A01 = ReelHeaderAttributionType.MESSAGE_SHARE_ATTRIBUTION;
    }
}
