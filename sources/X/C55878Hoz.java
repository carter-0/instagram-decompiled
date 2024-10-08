package X;

import android.content.Context;
import com.instagram.api.schemas.MusicPageTabType;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hoz  reason: case insensitive filesystem */
public final class C55878Hoz {
    public Integer A00;
    public 05G A01;
    public final Context A02;
    public final MusicPageTabType A03;
    public final C229352nF A04;
    public final UserSession A05;
    public final C55555Hjb A06;
    public final String A07;
    public final AnonymousClass0eM A08;
    public final 05G A09 = C51967G9n.A0u();

    public C55878Hoz(Context context, MusicPageTabType musicPageTabType, UserSession userSession, String str) {
        0qQ.A0B(musicPageTabType, 2);
        this.A07 = str;
        this.A03 = musicPageTabType;
        this.A02 = context;
        this.A05 = userSession;
        this.A04 = C51967G9n.A0Y(userSession);
        this.A06 = new C55555Hjb(userSession);
        this.A08 = C58679Ivo.A00(this, 12);
        this.A01 = C51970G9q.A10(false);
        this.A00 = AnonymousClass05K.A00;
    }
}
