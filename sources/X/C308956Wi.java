package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;

/* renamed from: X.6Wi  reason: invalid class name and case insensitive filesystem */
public final class C308956Wi extends C308916We {
    public final Context A00;
    public final ReelHeaderAttributionType A01 = ReelHeaderAttributionType.SUGGESTED_REEL_ATTRIBUTION;
    public final C255773uh A02;
    public final C250973mM A03;
    public final C316276lO A04;
    public final String A05;

    public C308956Wi(Context context, AnonymousClass0iw r3, UserSession userSession, C255773uh r5, C250973mM r6, C316276lO r7) {
        super(r3, userSession, r5);
        this.A00 = context;
        this.A04 = r7;
        this.A03 = r6;
        this.A02 = r5;
        String string = context.getString(2131974700);
        0qQ.A07(string);
        this.A05 = string;
    }
}
