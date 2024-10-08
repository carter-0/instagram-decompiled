package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;

/* renamed from: X.6XC  reason: invalid class name */
public final class AnonymousClass6XC extends C308916We {
    public final Context A00;
    public final 1Xj A01;
    public final ReelHeaderAttributionType A02 = ReelHeaderAttributionType.CAMERA_FORMAT_ATTRIBUTION;
    public final C255773uh A03;
    public final C317126ml A04;
    public final C316326lT A05;
    public final String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6XC(Context context, AnonymousClass0iw r3, UserSession userSession, 1Xj r5, C255773uh r6, C317126ml r7, C316326lT r8) {
        super(r3, userSession, r6);
        0qQ.A0B(r8, 6);
        this.A00 = context;
        this.A03 = r6;
        this.A01 = r5;
        this.A04 = r7;
        this.A05 = r8;
        String string = context.getString(2131971668);
        0qQ.A07(string);
        this.A06 = string;
    }
}
