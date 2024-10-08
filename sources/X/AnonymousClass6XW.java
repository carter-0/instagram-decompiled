package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;

/* renamed from: X.6XW  reason: invalid class name */
public final class AnonymousClass6XW extends C308916We {
    public final ReelHeaderAttributionType A00;
    public final C255773uh A01;
    public final C316276lO A02;
    public final C317126ml A03;
    public final String A04;
    public final String A05;
    public final Context A06;
    public final AnonymousClass0iw A07;

    public AnonymousClass6XW(Context context, AnonymousClass0iw r4, UserSession userSession, C255773uh r6, C316276lO r7, C317126ml r8) {
        super(r4, userSession, r6);
        String str;
        LwN lwN;
        this.A06 = context;
        this.A02 = r7;
        this.A01 = r6;
        this.A03 = r8;
        this.A07 = r4;
        C255783ui A002 = C289745e8.A00(AnonymousClass3WT.CHALLENGE_CHAT, r6.A0b());
        if (A002 == null || (lwN = A002.A0w) == null) {
            str = null;
        } else {
            str = lwN.A00.A08;
        }
        this.A04 = str;
        String string = context.getString(2131971747);
        0qQ.A07(string);
        this.A05 = string;
        this.A00 = ReelHeaderAttributionType.CHANNEL_CHALLENGE_ATTRIBUTION;
    }
}
