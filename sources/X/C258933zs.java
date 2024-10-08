package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.OdinContext;
import java.util.Collection;

/* renamed from: X.3zs  reason: invalid class name and case insensitive filesystem */
public final class C258933zs implements C258943zt {
    public final C258913zq A00;
    public final String A01;

    public C258933zs(C258913zq r2, String str) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(str, 2);
        this.A00 = r2;
        this.A01 = str;
    }

    public final AnonymousClass40G ATg(OdinContext odinContext) {
        String str;
        C258913zq r4 = this.A00;
        String str2 = this.A01;
        if (odinContext == null || (str = odinContext.A01) == null) {
            str = "";
        }
        if (str2.equals("FB_CP")) {
            str2 = 002.A0T(str2, str, '_');
        }
        AnonymousClass40G E6N = r4.E6N((Long) null, str2);
        if (!E6N.A02) {
            return AnonymousClass40H.A00(E6N, 0sn.A00);
        }
        Collection values = ((Example) E6N.A00).A02.values();
        0qQ.A07(values);
        return new AnonymousClass40G(00k.A0a(values), (String) null, true);
    }

    public final String getId() {
        return "Server";
    }
}
