package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;

/* renamed from: X.6Wg  reason: invalid class name and case insensitive filesystem */
public final class C308936Wg extends C308916We {
    public final Context A00;
    public final ReelHeaderAttributionType A01 = ReelHeaderAttributionType.ROLL_CALL_TIMEBOX;
    public final C255773uh A02;
    public final AnonymousClass3BK A03;
    public final C316276lO A04;
    public final String A05;
    public final AnonymousClass0iw A06;

    public C308936Wg(Context context, AnonymousClass0iw r3, UserSession userSession, C255773uh r5, C316276lO r6) {
        super(r3, userSession, r5);
        this.A04 = r6;
        this.A00 = context;
        this.A02 = r5;
        this.A06 = r3;
        this.A03 = AnonymousClass3BJ.A00(userSession);
        String string = context.getString(2131953225);
        0qQ.A07(string);
        this.A05 = string;
    }
}
