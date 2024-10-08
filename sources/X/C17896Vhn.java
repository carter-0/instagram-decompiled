package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.Vhn  reason: case insensitive filesystem */
public final class C17896Vhn {
    public final Context A00;
    public final AnonymousClass07i A01;
    public final UserSession A02;
    public final HashMap A03 = new HashMap();
    public final Set A04 = Collections.newSetFromMap(new WeakHashMap());
    public final C18062Vko A05;

    public final void A00(AnonymousClass3HX r3, String str) {
        0qQ.A0B(str, 0);
        if (r3 != null) {
            this.A03.put(str, 1OP.A05(this.A02).A0I(r3, false));
            MediaMapPin mediaMapPin = (MediaMapPin) this.A05.A02.get(str);
            if (mediaMapPin != null) {
                mediaMapPin.A08 = r3;
            }
        }
    }

    public C17896Vhn(Context context, AnonymousClass07i r3, UserSession userSession, C18062Vko vko) {
        AnonymousClass7TG.A1Q(userSession, vko);
        this.A00 = context;
        this.A02 = userSession;
        this.A05 = vko;
        this.A01 = r3;
    }
}
