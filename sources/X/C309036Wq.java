package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;

/* renamed from: X.6Wq  reason: invalid class name and case insensitive filesystem */
public final class C309036Wq extends C308916We {
    public final ReelHeaderAttributionType A00 = ReelHeaderAttributionType.STORY_SNAPSHOT;
    public final C255773uh A01;
    public final C316276lO A02;
    public final String A03;
    public final Context A04;
    public final AnonymousClass0iw A05;

    public C309036Wq(Context context, AnonymousClass0iw r3, UserSession userSession, C255773uh r5, C316276lO r6) {
        super(r3, userSession, r5);
        this.A02 = r6;
        this.A04 = context;
        this.A01 = r5;
        this.A05 = r3;
        String string = context.getString(2131974525);
        0qQ.A07(string);
        this.A03 = string;
    }
}
