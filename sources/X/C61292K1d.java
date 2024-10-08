package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.K1d  reason: case insensitive filesystem */
public final class C61292K1d extends 1XP {
    public C62573Ki6 A00 = C62573Ki6.A0B;
    public C61288K0z A01;
    public User A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public HashMap A09 = AnonymousClass7TE.A1E();
    public List A0A = AnonymousClass7TE.A1C();
    public List A0B;
    public boolean A0C = false;
    public boolean A0D = true;
    public final Map A0E = AnonymousClass7TE.A1E();
    public final Map A0F = AnonymousClass7TE.A1E();
    public final List A0G = AnonymousClass7TE.A1C();
    public final Map A0H = AnonymousClass7TE.A1E();
    public final Map A0I = AnonymousClass7TE.A1E();
    public final Map A0J = AnonymousClass7TE.A1E();
    public final Set A0K = AnonymousClass7TE.A1F();

    public final void A02(UserSession userSession, C61292K1d k1d, boolean z) {
        boolean z2;
        C62573Ki6 ki6 = k1d.A00;
        if (ki6 != this.A00) {
            this.A00 = ki6;
        }
        if (!2PP.A00(k1d.A08, this.A08)) {
            this.A08 = k1d.A08;
            z2 = true;
        } else {
            z2 = false;
        }
        String str = k1d.A05;
        if (str != null && !2PP.A00(str, this.A05)) {
            this.A05 = k1d.A05;
            z2 = true;
        }
        User user = k1d.A02;
        if (user != null && !2PP.A00(user, this.A02)) {
            this.A02 = k1d.A02;
        }
        if (z) {
            this.A0F.clear();
            this.A0A.clear();
            List list = this.A0B;
            if (list != null) {
                list.clear();
            }
        }
        if (!2PP.A00(k1d.A07, this.A07)) {
            this.A07 = k1d.A07;
            z2 = true;
        }
        Iterator it = k1d.A0A.iterator();
        while (it.hasNext()) {
            1Xj A0t = C51966G9m.A0t(it);
            if (A00(A0t)) {
                Map map = this.A0F;
                if (!map.containsKey(A0t.getId())) {
                    this.A0A.add(A0t);
                    map.put(A0t.getId(), A0t);
                    z2 = true;
                }
            }
        }
        List<C270194gL> list2 = k1d.A0B;
        if (list2 == null) {
            list2 = AnonymousClass7TE.A1C();
        }
        for (C270194gL r2 : list2) {
            if (r2.A02() == null) {
                String str2 = r2.A0X;
                str2.getClass();
                0wb.A03("InvalidLiveBroadcastInIGTVFeed", 002.A0R("id: ", str2));
            } else {
                List list3 = this.A0B;
                if (list3 == null) {
                    list3 = AnonymousClass7TE.A1C();
                }
                this.A0B = list3;
                Map map2 = this.A0E;
                String str3 = r2.A0X;
                str3.getClass();
                if (!map2.containsKey(str3)) {
                    this.A0B.add(r2);
                    String str4 = r2.A0X;
                    str4.getClass();
                    map2.put(str4, r2);
                    z2 = true;
                }
            }
        }
        if (!2PP.A00(k1d.A06, this.A06)) {
            this.A06 = k1d.A06;
            z2 = true;
        }
        if (!2PP.A00(Boolean.valueOf(k1d.A0D), Boolean.valueOf(this.A0D))) {
            this.A0D = k1d.A0D;
            z2 = true;
        }
        if (!2PP.A00(Boolean.valueOf(k1d.A0C), Boolean.valueOf(this.A0C))) {
            this.A0C = k1d.A0C;
            z2 = true;
        }
        if (!2PP.A00(k1d.A04, this.A04)) {
            this.A04 = k1d.A04;
        } else if (!z2) {
            return;
        }
        AnonymousClass1Nd.A00(userSession).A05(new C64657Lfj(this));
    }

    public C61292K1d(C62573Ki6 ki6, String str, String str2) {
        this.A03 = str;
        this.A00 = ki6;
        this.A08 = str2;
    }

    public static boolean A00(1Xj r2) {
        if (r2.CeS() && r2.A52()) {
            return true;
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("id: ");
        A1A.append(r2.getId());
        A1A.append(" type: ");
        0wb.A03("InvalidVideoMediaInIGTVFeed", AnonymousClass7TF.A0i(r2.BR7(), A1A));
        return false;
    }

    public final ArrayList A01(UserSession userSession) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (this.A0B != null) {
            C278164wN A002 = C278164wN.A00(userSession);
            for (C270194gL r1 : this.A0B) {
                C278114wI r0 = r1.A06;
                if (r0 == null) {
                    r0 = C278114wI.UNKNOWN;
                }
                if (!r0.A00() && !A002.A02(r1)) {
                    A1C.add(r1);
                }
            }
        }
        return A1C;
    }

    public C61292K1d() {
    }
}
