package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ob6  reason: case insensitive filesystem */
public final class C71083Ob6 {
    public RecyclerView A00;
    public N47 A01;
    public List A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Context A06;
    public final View.OnTouchListener A07;
    public final AnonymousClass0iw A08;
    public final UserSession A09;
    public final C70433O6k A0A;
    public final C67741Mtu A0B;
    public final OZQ A0C;
    public final C69319NjK A0D;
    public final String A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0eM A0H;

    public C71083Ob6(Context context, View.OnTouchListener onTouchListener, AnonymousClass0iw r18, UserSession userSession, C252063oV r20, C70433O6k o6k, C67741Mtu mtu, C69319NjK njK, String str, String str2) {
        View.OnTouchListener onTouchListener2 = onTouchListener;
        UserSession userSession2 = userSession;
        DbW.A1O(userSession2, 2, onTouchListener2);
        C67741Mtu mtu2 = mtu;
        0qQ.A0B(mtu2, 10);
        this.A06 = context;
        this.A09 = userSession2;
        AnonymousClass0iw r7 = r18;
        this.A08 = r7;
        this.A0A = o6k;
        this.A07 = onTouchListener2;
        String str3 = str;
        this.A0E = str3;
        this.A0D = njK;
        this.A0B = mtu2;
        0Tu r6 = 0Tu.A05;
        int i = 3;
        this.A03 = 182.A06(r6, userSession2, 36317732356101611L) ? 2 : 3;
        this.A05 = 182.A06(r6, userSession2, 36317732356101611L) ? 4 : i;
        this.A04 = 182.A06(r6, userSession2, 36317732356101611L) ? 40 : 30;
        this.A02 = AnonymousClass7TE.A1C();
        this.A0C = new OZQ(C69447Nlr.AI_STICKER, r7, userSession2, str3, str2, C66580MXl.A15(this, 7), C66580MXl.A15(this, 8), new C73607Pgi(this, 0));
        this.A0F = C73923Pm3.A01(this, 25);
        this.A0H = C73923Pm3.A01(this, 27);
        this.A0G = C73923Pm3.A01(this, 26);
        this.A01 = new N47(AnonymousClass05K.A0C, AnonymousClass05K.A01, (String) null, (List) 0sn.A00, true);
        ((GridLayoutManager) this.A0F.getValue()).A01 = new C67774MuY(this, 2);
        r20.EeU(new C72245OzD(this, 1));
    }

    public final void A04(String str) {
        0qQ.A0B(str, 0);
        N47 n47 = this.A01;
        0sn r4 = 0sn.A00;
        int i = 0;
        A01(N47.A00(AnonymousClass05K.A0C, (Integer) n47.A02, n47.A04, r4, false), this);
        int length = str.length() - 1;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A13 = Dbc.A13(str, i2);
            if (z) {
                if (!A13) {
                    break;
                }
                length--;
            } else if (!A13) {
                z = true;
            } else {
                i++;
            }
        }
        if (Dba.A0c(str, length, i).length() != 0) {
            this.A02 = AnonymousClass7TE.A1C();
            OZQ ozq = this.A0C;
            C71002OVz oVz = new C71002OVz(str, r4);
            ozq.A00 = oVz;
            ozq.A0A.invoke();
            OZQ.A01(ozq, oVz, false);
        }
    }

    public static Integer A00(C71083Ob6 ob6) {
        if (C69923NuP.A00(ob6.A09).booleanValue()) {
            return AnonymousClass05K.A01;
        }
        return C69926NuS.A00((Integer) ob6.A01.A02);
    }

    public static final void A01(N47 n47, C71083Ob6 ob6) {
        C232262tL jyU;
        String string;
        ob6.A01 = n47;
        O6Z o6z = (O6Z) ob6.A0H.getValue();
        Context context = ob6.A06;
        N47 n472 = ob6.A01;
        0qQ.A0B(n472, 1);
        ViewModelListUpdate A0R = DbS.A0R();
        Number number = (Number) n472.A03;
        Integer num = AnonymousClass05K.A0C;
        boolean z = true;
        if (number != num) {
            int intValue = number.intValue();
            if (intValue == 0) {
                string = context.getString(2131958618);
            } else if (intValue != 1) {
                string = "";
            } else {
                string = n472.A04;
                if (string == null) {
                    string = AnonymousClass7TE.A16(context, 2131958617);
                }
            }
            0qQ.A0A(string);
            jyU = new C64760Lhc(string);
        } else {
            List list = (List) n472.A01;
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            int i = 0;
            for (Object next : list) {
                int i2 = i + 1;
                if (i < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    A0r.add(new N60((C61077JwF) next, i));
                    i = i2;
                }
            }
            A0R.A01(A0r);
            if (n472.A05) {
                int i3 = o6z.A00;
                ArrayList A0v = DbS.A0v(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    A0v.add(new N60((C61077JwF) null, 0));
                }
                A0R.A01(A0v);
            }
            Object obj = n472.A02;
            if (obj != AnonymousClass05K.A01) {
                if (obj != num) {
                    z = false;
                }
                jyU = new C61178JyU(z);
            }
            ((C70692OGn) ob6.A0G.getValue()).A00.A05(A0R);
        }
        A0R.A00(jyU);
        ((C70692OGn) ob6.A0G.getValue()).A00.A05(A0R);
    }

    public static final void A02(C71083Ob6 ob6, Integer num, String str) {
        05G r1 = ob6.A0B.A04;
        C68175N3q n3q = (C68175N3q) r1.getValue();
        HMC hmc = HMC.Failed;
        boolean z = n3q.A05;
        String str2 = n3q.A03;
        String str3 = n3q.A02;
        boolean z2 = n3q.A06;
        C45274Ctd ctd = n3q.A00;
        DbY.A1S(hmc, str2);
        r1.Epw(new C68175N3q(ctd, hmc, str2, str3, str, z, z2));
        A01(N47.A00(num, AnonymousClass05K.A01, str, 0sn.A00, false), ob6);
    }

    public final void A03() {
        Integer num;
        N47 n47 = this.A01;
        Integer num2 = AnonymousClass05K.A0C;
        if (C69923NuP.A00(this.A09).booleanValue()) {
            num = AnonymousClass05K.A01;
        } else {
            num = num2;
        }
        A01(N47.A00(num2, num, n47.A04, (List) n47.A01, true), this);
        this.A0C.A02();
    }
}
