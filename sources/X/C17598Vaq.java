package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Vaq  reason: case insensitive filesystem */
public final class C17598Vaq {
    public final Context A00;
    public final AnonymousClass07i A01;
    public final UserSession A02;
    public final VPA A03;
    public final String A04;
    public final Map A05 = new HashMap();

    public C17598Vaq(Context context, AnonymousClass07i r3, UserSession userSession, VPA vpa, String str) {
        AnonymousClass7TG.A1O(vpa, userSession);
        this.A03 = vpa;
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = r3;
        this.A04 = str;
    }
}
