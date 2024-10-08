package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hov  reason: case insensitive filesystem */
public final class C55874Hov {
    public final H34 A00;
    public final 05G A01 = 106.A01((Object) null);
    public final 05G A02 = C51970G9q.A10(false);
    public final 05G A03 = 106.A01((Object) null);
    public final 05G A04 = C51970G9q.A10(true);
    public final Context A05;
    public final AnonymousClass07i A06;
    public final AnonymousClass0iw A07;
    public final UserSession A08;

    /* JADX WARNING: type inference failed for: r4v0, types: [X.4hF, java.lang.Object] */
    public C55874Hov(Context context, AnonymousClass07i r10, AnonymousClass0iw r11, UserSession userSession) {
        0qQ.A0B(r10, 4);
        this.A05 = context;
        this.A08 = userSession;
        this.A07 = r11;
        this.A06 = r10;
        ? obj = new Object();
        H34 h34 = new H34(context, r10, obj, r11, userSession, 1);
        this.A00 = h34;
        h34.A03(new IMW(this, 1));
    }
}
