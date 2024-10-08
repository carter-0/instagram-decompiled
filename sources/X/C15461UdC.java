package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: X.UdC  reason: case insensitive filesystem */
public final class C15461UdC extends C331047Ph implements C231302rO, X3C, X3F {
    public final UlS A00 = new UYK(this);
    public final C64184LSr A01;
    public final Map A02 = new HashMap();
    public final SortedMap A03 = new TreeMap();
    public final Context A04;
    public final C15569Uex A05;
    public final C231802sQ A06 = new WWZ(this);

    public C15461UdC(Context context, C15386Ubl ubl, AnonymousClass0iw r11, UserSession userSession) {
        this.A04 = context;
        C64184LSr A002 = C64184LSr.A00(userSession);
        this.A01 = A002;
        C15569Uex uex = new C15569Uex(context, this, ubl, r11, userSession);
        this.A05 = uex;
        A0B(uex);
        A002.A06.add(this);
    }

    public final Set Brl() {
        return this.A01.A05.keySet();
    }

    public final void DQl() {
        C64184LSr lSr = this.A01;
        if (!lSr.A08()) {
            lSr.A05(this.A04);
        }
        Iterator A16 = Pxg.A16(lSr.A07.values());
        while (A16.hasNext()) {
            1Xj A0t = C51966G9m.A0t(A16);
            this.A03.put(Long.valueOf(A0t.A1A()), A0t);
        }
        UlS ulS = this.A00;
        ulS.A04();
        this.A02.clear();
        ulS.A0A(new ArrayList(this.A03.values()));
        A0C();
    }

    public final boolean isEmpty() {
        if (this.A00.A02() == 0) {
            return true;
        }
        return false;
    }

    public final void A0C() {
        A06();
        UlS ulS = this.A00;
        ulS.A08(this.A06);
        if (!isEmpty()) {
            for (int i = 0; i < ulS.A02(); i++) {
                C3251571g A0e = C13989Tnp.A0e(ulS, i);
                Map map = this.A02;
                AnonymousClass6u8 r2 = (AnonymousClass6u8) map.get(AnonymousClass7TF.A0h(A0e));
                if (r2 == null) {
                    r2 = new AnonymousClass6u8();
                    map.put(AnonymousClass7TF.A0h(A0e), r2);
                }
                boolean z = true;
                if (i != ulS.A02() - 1) {
                    z = false;
                }
                r2.A00(i, z);
                A09(this.A05, A0e, r2);
            }
        }
        A07();
    }

    public final void EZ4(int i) {
        A0C();
    }
}
