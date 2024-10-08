package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;
import com.instagram.user.model.User;

/* renamed from: X.6XY  reason: invalid class name */
public final class AnonymousClass6XY extends C308916We {
    public final C3499182k A00;
    public final ReelHeaderAttributionType A01;
    public final C250973mM A02;
    public final C316276lO A03;
    public final C317126ml A04;
    public final User A05;
    public final String A06;
    public final Context A07;
    public final AnonymousClass0iw A08;
    public final C255773uh A09;

    public AnonymousClass6XY(Context context, AnonymousClass0iw r6, UserSession userSession, C255773uh r8, C250973mM r9, C316276lO r10, C317126ml r11) {
        super(r6, userSession, r8);
        C3499182k r0;
        String str;
        this.A07 = context;
        this.A03 = r10;
        this.A09 = r8;
        this.A04 = r11;
        this.A08 = r6;
        this.A02 = r9;
        User user = r8.A0i;
        this.A05 = user;
        1Xj r02 = r8.A0b;
        if (r02 != null) {
            r0 = r02.A0C.BAJ();
        } else {
            r0 = null;
        }
        this.A00 = r0;
        Resources resources = context.getResources();
        if (user != null) {
            str = user.getUsername();
        } else {
            str = "";
        }
        String string = resources.getString(2131971457, new Object[]{str});
        0qQ.A07(string);
        this.A06 = string;
        this.A01 = ReelHeaderAttributionType.CAMPFIRE_ATTRIBUTION;
    }
}
