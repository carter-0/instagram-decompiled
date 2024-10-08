package X;

import android.app.Application;
import android.content.Context;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.72Q  reason: invalid class name */
public final class AnonymousClass72Q {
    public final Context A00;
    public final UserSession A01;
    public final Map A02;
    public final Map A03;

    public AnonymousClass72Q(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A01 = userSession;
        if (!(context instanceof Application) && 182.A06(0Tu.A05, userSession, 36330836299105054L)) {
            context = context.getApplicationContext();
            0qQ.A07(context);
        }
        this.A00 = context;
        this.A02 = new HashMap();
        this.A03 = new HashMap();
    }

    public final Medium A00(1Xj r11) {
        int i;
        String str;
        0qQ.A0B(r11, 0);
        Map map = this.A03;
        Medium medium = (Medium) map.get(r11);
        if (medium != null) {
            return medium;
        }
        boolean CeS = r11.CeS();
        int A0y = r11.A0y();
        int A0x = r11.A0x();
        if (r11.CeS()) {
            i = (int) r11.A1B();
        } else {
            i = 0;
        }
        String A2n = r11.A2n();
        ImageUrl A1Q = r11.A1Q();
        if (A1Q != null) {
            str = A1Q.getUrl();
        } else {
            str = null;
        }
        Medium A04 = C282665Eg.A04(A2n, str, A0y, A0x, i, CeS);
        map.put(r11, A04);
        this.A02.put(String.valueOf(A04.A05), r11);
        return A04;
    }

    public final C290815g0 A01(List list, List list2) {
        0qQ.A0B(list, 0);
        return new C290815g0(new MB3(this.A00, this.A01, list, list2, this.A02), 576);
    }
}
