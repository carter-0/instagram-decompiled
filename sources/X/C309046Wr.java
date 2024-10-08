package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;

/* renamed from: X.6Wr  reason: invalid class name and case insensitive filesystem */
public final class C309046Wr extends C308916We {
    public final ReelHeaderAttributionType A00 = ReelHeaderAttributionType.STORIES_TEASER;
    public final C255773uh A01;
    public final C316276lO A02;
    public final String A03;
    public final Context A04;

    public C309046Wr(Context context, AnonymousClass0iw r3, UserSession userSession, C255773uh r5, C316276lO r6) {
        super(r3, userSession, r5);
        this.A04 = context;
        this.A02 = r6;
        this.A01 = r5;
        String string = context.getString(2131961546);
        0qQ.A07(string);
        this.A03 = string;
    }
}
