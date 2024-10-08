package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;

/* renamed from: X.6Wf  reason: invalid class name and case insensitive filesystem */
public final class C308926Wf extends C308916We {
    public final ReelHeaderAttributionType A00 = ReelHeaderAttributionType.ROLL_CALL_FIRST_TAKE;
    public final C255773uh A01;
    public final AnonymousClass3BK A02;
    public final C316276lO A03;
    public final String A04;
    public final Context A05;
    public final AnonymousClass0iw A06;

    public C308926Wf(Context context, AnonymousClass0iw r3, UserSession userSession, C255773uh r5, C316276lO r6) {
        super(r3, userSession, r5);
        this.A03 = r6;
        this.A05 = context;
        this.A01 = r5;
        this.A06 = r3;
        this.A02 = AnonymousClass3BJ.A00(userSession);
        String string = context.getString(2131953225);
        0qQ.A07(string);
        this.A04 = string;
    }
}
