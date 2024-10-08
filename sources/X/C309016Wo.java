package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;

/* renamed from: X.6Wo  reason: invalid class name and case insensitive filesystem */
public final class C309016Wo extends C308916We {
    public final ReelHeaderAttributionType A00 = ReelHeaderAttributionType.SUPERLATIVE;
    public final C250973mM A01;
    public final C316276lO A02;
    public final String A03;
    public final Context A04;
    public final AnonymousClass0iw A05;
    public final C255773uh A06;

    public C309016Wo(Context context, AnonymousClass0iw r3, UserSession userSession, C255773uh r5, C250973mM r6, C316276lO r7) {
        super(r3, userSession, r5);
        this.A02 = r7;
        this.A04 = context;
        this.A06 = r5;
        this.A05 = r3;
        this.A01 = r6;
        String string = context.getString(2131974764);
        0qQ.A07(string);
        this.A03 = string;
    }
}
