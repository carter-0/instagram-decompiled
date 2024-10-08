package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;
import com.instagram.user.model.User;

/* renamed from: X.6Ww  reason: invalid class name and case insensitive filesystem */
public final class C309086Ww extends C308916We {
    public final ReelHeaderAttributionType A00 = ReelHeaderAttributionType.GROUP_PROFILE_ATTRIBUTION;
    public final C255773uh A01;
    public final C250973mM A02;
    public final C316276lO A03;
    public final C317126ml A04;
    public final String A05 = "group_profile";
    public final String A06 = A00(this);
    public final Context A07;

    public static final String A00(C309086Ww r2) {
        User A2A;
        1Xj r1 = r2.A01.A0b;
        if (r1 == null || (A2A = r1.A2A(r2.A01)) == null) {
            return "";
        }
        String string = r2.A07.getString(2131963210, new Object[]{A2A.getUsername()});
        0qQ.A07(string);
        return string;
    }

    public C309086Ww(Context context, AnonymousClass0iw r3, UserSession userSession, C255773uh r5, C250973mM r6, C316276lO r7, C317126ml r8) {
        super(r3, userSession, r5);
        this.A07 = context;
        this.A03 = r7;
        this.A01 = r5;
        this.A02 = r6;
        this.A04 = r8;
    }
}
