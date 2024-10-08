package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag$CANVAS;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6aT  reason: invalid class name and case insensitive filesystem */
public final class C310126aT {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final Map A03 = new HashMap();
    public final C310136aU A04 = new C310136aU(this);

    public C310126aT(Context context, AnonymousClass0iw r3, UserSession userSession) {
        0qQ.A0B(userSession, 3);
        this.A00 = context;
        this.A01 = r3;
        this.A02 = userSession;
    }

    public static final void A00(C310126aT r5, ImageUrl imageUrl) {
        Map map = r5.A03;
        String url = imageUrl.getUrl();
        if (!map.containsKey(url)) {
            1OO A0J = 1NK.A00().A0J(imageUrl, r5.A01.getModuleName());
            A0J.A0I = true;
            A0J.A0F = true;
            A0J.A02(r5.A04);
            C226952iF A002 = A0J.A00();
            map.put(url, A002);
            DLogTag$CANVAS dLogTag$CANVAS = DLogTag$CANVAS.INSTANCE;
            0qQ.A07(url);
            DLog.d(dLogTag$CANVAS, 002.A0R("Enqueue ", C63100KrT.A00(url)), new Object[0]);
            A002.E5t();
        }
    }
}
