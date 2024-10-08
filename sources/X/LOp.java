package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class LOp {
    public Map A00 = 0Yt.A0E();
    public final UserSession A01;

    public LOp(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final synchronized void A01(C16679UzF uzF, String str, boolean z) {
        synchronized (this) {
            0qQ.A0B(uzF, 0);
            if (z) {
                C61047Jvl A002 = A00(this, str);
                LinkedHashSet A012 = 094.A01(uzF.A00, (Set) A002.A02);
                0qQ.A0B(A012, 0);
                A002.A02 = A012;
                if (A012.size() == A002.A00) {
                    Iterator it = ((Set) A00(this, str).A01).iterator();
                    while (it.hasNext()) {
                        int A0F = AnonymousClass7TG.A0F(it);
                        02m.A0p.markerPoint(A0F, AnonymousClass000.A00(4379));
                        02m.A0p.markerEnd(A0F, 3);
                    }
                    Map map = this.A00;
                    if (str == null) {
                        str = "mixed_merchant";
                    }
                    this.A00 = 0Yt.A09(str, map);
                }
            }
        }
    }

    public final synchronized void A02(C16679UzF uzF, String str, boolean z) {
        0qQ.A0B(uzF, 0);
        if (z) {
            C61047Jvl A002 = A00(this, str);
            LinkedHashSet A012 = 094.A01(uzF.A00, (Set) A002.A03);
            0qQ.A0B(A012, 0);
            A002.A03 = A012;
            if (A012.size() == A002.A00) {
                0sl r0 = 0sl.A00;
                0qQ.A0B(r0, 0);
                A002.A02 = r0;
                A002.A03 = r0;
            }
        }
    }

    public final synchronized void A03(String str) {
        synchronized (this) {
            C61047Jvl A002 = A00(this, str);
            if (((Set) A002.A01).contains(37370080)) {
                if (!((Set) A002.A02).isEmpty()) {
                    02m.A0p.markerAnnotate(37370080, "failed_sections", (String[]) ((Set) A002.A02).toArray(new String[0]));
                }
                02m.A0p.markerEnd(37370080, 2);
                Map map = this.A00;
                if (str == null) {
                    str = "mixed_merchant";
                }
                this.A00 = 0Yt.A09(str, map);
            }
        }
    }

    public static final C61047Jvl A00(LOp lOp, String str) {
        String str2;
        Map map = lOp.A00;
        if (str == null) {
            str2 = "mixed_merchant";
        } else {
            str2 = str;
        }
        Object obj = map.get(str2);
        if (obj == null) {
            obj = new C61047Jvl();
            Map map2 = lOp.A00;
            if (str == null) {
                str = "mixed_merchant";
            }
            lOp.A00 = 0Yt.A0C(map2, AnonymousClass7TE.A1L(str, obj));
        }
        return (C61047Jvl) obj;
    }
}
