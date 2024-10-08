package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8wd  reason: invalid class name and case insensitive filesystem */
public final class C370538wd extends C300585xS implements C370548we {
    public C254703su A00;
    public C370878xD A01;
    public NHP A02;
    public Boolean A03;
    public Boolean A04;
    public String A05;
    public String A06;
    public List A07 = Collections.emptyList();
    public List A08 = Collections.emptyList();
    public boolean A09 = false;

    public final boolean A03() {
        C242373Tu r0 = this.A0Z;
        if (r0 == null || !r0.A01()) {
            return false;
        }
        return true;
    }

    public final boolean CKJ() {
        Boolean bool = this.A04;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final void A02() {
        super.A01();
        C254703su r1 = this.A00;
        if (r1 != null) {
            r1.A1m(AnonymousClass05K.A0j);
        }
        for (C254703su A1m : this.A07) {
            A1m.A1m(AnonymousClass05K.A0j);
        }
        for (C254703su A1m2 : this.A08) {
            A1m2.A1m(AnonymousClass05K.A0j);
        }
        NHP nhp = this.A02;
        if (nhp != null) {
            for (C254703su A1m3 : nhp.A04) {
                A1m3.A1m(AnonymousClass05K.A0j);
            }
        }
        if (!CKJ()) {
            this.A06 = null;
        }
    }

    public final boolean A04(UserSession userSession) {
        C242373Tu r0;
        if (!A03() && ((r0 = this.A0Z) == null || !r0.A03(userSession))) {
            Iterator it = this.A07.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C254703su) it.next()).A10 == 2FW.A0n) {
                        break;
                    }
                } else {
                    A5N a5n = this.A0g;
                    if (a5n != null && (a5n.A00 != null || a5n.A01 != null)) {
                        return true;
                    }
                    C272964li r1 = this.A0m;
                    if (r1 == null) {
                        return false;
                    }
                    if (!r1.A08) {
                        Long l = r1.A05;
                        if (l == null || System.currentTimeMillis() - l.longValue() >= 1209600000) {
                            return false;
                        }
                        return true;
                    }
                }
            }
        }
        return true;
    }
}
