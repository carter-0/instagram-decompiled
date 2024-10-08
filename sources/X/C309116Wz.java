package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelHeaderAttributionType;

/* renamed from: X.6Wz  reason: invalid class name and case insensitive filesystem */
public final class C309116Wz extends C308916We {
    public final Context A00;
    public final Reel A01;
    public final ReelHeaderAttributionType A02;
    public final C255773uh A03;
    public final C316276lO A04;
    public final C317126ml A05;
    public final String A06;
    public final AnonymousClass0eM A07;

    public C309116Wz(Context context, AnonymousClass0iw r5, UserSession userSession, Reel reel, C255773uh r8, C316276lO r9, C317126ml r10) {
        super(r5, userSession, r8);
        this.A00 = context;
        this.A04 = r9;
        this.A01 = reel;
        this.A03 = r8;
        this.A05 = r10;
        this.A07 = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9M1(18, userSession, this));
        String str = this.A01.A0o;
        this.A06 = str == null ? "" : str;
        this.A02 = ReelHeaderAttributionType.HIGHLIGHTS_ATTRIBUTION;
    }
}
