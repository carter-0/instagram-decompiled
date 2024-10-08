package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.6XM  reason: invalid class name */
public final class AnonymousClass6XM extends C308916We {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final ReelHeaderAttributionType A02;
    public final C255783ui A03;
    public final C316276lO A04;
    public final C317126ml A05;
    public final User A06;
    public final String A07;
    public final C255773uh A08;

    public AnonymousClass6XM(Context context, AnonymousClass0iw r4, UserSession userSession, C255773uh r6, C316276lO r7, C317126ml r8) {
        super(r4, userSession, r6);
        C255783ui r1;
        String str;
        C42058BFl bFl;
        this.A00 = context;
        this.A04 = r7;
        this.A08 = r6;
        this.A05 = r8;
        this.A01 = r4;
        List Bkd = r6.Bkd(AnonymousClass3WT.PHOTO_CRED_STICKER);
        User user = null;
        if (Bkd != null) {
            r1 = (C255783ui) 00k.A0J(Bkd);
        } else {
            r1 = null;
        }
        this.A03 = r1;
        if (!(r1 == null || (bFl = r1.A0L) == null)) {
            User user2 = bFl.A00;
            if (user2 != null) {
                user2.Bh3();
            }
            user = bFl.A00;
        }
        this.A06 = user;
        if (user != null) {
            str = user.getUsername();
        } else {
            str = "";
        }
        this.A07 = str;
        this.A02 = ReelHeaderAttributionType.SHARE_TO_FRIENDS_STORY_ATTRIBUTION;
    }
}
