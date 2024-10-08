package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;
import com.instagram.user.model.User;

/* renamed from: X.6XN  reason: invalid class name */
public final class AnonymousClass6XN extends C308916We {
    public final AnonymousClass0iw A00;
    public final ReelHeaderAttributionType A01;
    public final C255773uh A02;
    public final C316276lO A03;
    public final C317126ml A04;
    public final User A05;
    public final String A06;
    public final Context A07;

    public AnonymousClass6XN(Context context, AnonymousClass0iw r5, UserSession userSession, C255773uh r7, C316276lO r8, C317126ml r9) {
        super(r5, userSession, r7);
        User user;
        String str;
        this.A03 = r8;
        this.A07 = context;
        this.A02 = r7;
        this.A04 = r9;
        this.A00 = r5;
        1Xj r0 = r7.A0b;
        if (r0 != null) {
            user = r0.A0C.Bnb();
        } else {
            user = null;
        }
        this.A05 = user;
        Resources resources = context.getResources();
        if (user != null) {
            str = user.getUsername();
        } else {
            str = null;
        }
        String string = resources.getString(2131962809, new Object[]{str});
        0qQ.A07(string);
        this.A06 = string;
        this.A01 = ReelHeaderAttributionType.RESHARED_REEL_ATTRIBUTION;
    }
}
