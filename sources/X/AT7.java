package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.OdinContext;
import java.util.Collection;

public final class AT7 implements C258943zt {
    public final AnonymousClass0JP A00;
    public final C258943zt A01;
    public final C258913zq A02;
    public final String A03;
    public final Boolean A04;

    public final AnonymousClass40G ATg(OdinContext odinContext) {
        0sn r2;
        String str;
        AnonymousClass40G ATg;
        if (AnonymousClass7TF.A1Y(this.A04, true)) {
            AnonymousClass40G EJD = this.A02.EJD(this.A03);
            if (!EJD.A02) {
                r2 = 0sn.A00;
                str = EJD.A01;
            } else if (this.A00.now() > AnonymousClass7TE.A0R(EJD.A00) + 2592000000L) {
                r2 = 0sn.A00;
                str = AnonymousClass000.A00(3962);
            } else {
                C258943zt r1 = this.A01;
                if (r1 != null && (ATg = r1.ATg((OdinContext) null)) != null) {
                    return ATg;
                }
                r2 = 0sn.A00;
                str = "shared prefs source not available";
            }
            return new AnonymousClass40G(r2, str, false);
        }
        AnonymousClass40G E6N = this.A02.E6N((Long) null, this.A03);
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

    public AT7(AnonymousClass0JP r1, C258943zt r2, C258913zq r3, Boolean bool, String str) {
        AnonymousClass7TG.A1O(r1, r3);
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = str;
        this.A01 = r2;
        this.A04 = bool;
    }
}
