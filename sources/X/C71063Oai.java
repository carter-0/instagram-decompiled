package X;

import android.content.Context;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Oai  reason: case insensitive filesystem */
public final class C71063Oai {
    public final Context A00;
    public final AnonymousClass2t9 A01;
    public final UserSession A02;
    public final OZV A03;
    public final Map A04 = AnonymousClass7TE.A1H();
    public final boolean A05;
    public final boolean A06;

    public static final List A00(C71063Oai oai, Collection collection) {
        String str;
        C317486nL[] A07 = C317486nL.A04.A07(oai.A02);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : collection) {
            C317486nL r2 = (C317486nL) next;
            C317486nL r0 = (C317486nL) 03t.A06(A07, r2.A00);
            if (r0 != null) {
                str = r0.A02;
            } else {
                str = null;
            }
            JTR.A1P(str, r2.A02, next, A1C);
        }
        return A1C;
    }

    public static final void A01(ViewModelListUpdate viewModelListUpdate, C71063Oai oai, List list, boolean z) {
        Map map = oai.A04;
        map.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C70594OCr oCr = (C70594OCr) it.next();
            C8916RFj rFj = oCr.A00;
            if (rFj != C8916RFj.A05 || z) {
                map.put(rFj, C51968G9o.A0t(viewModelListUpdate.A00));
                viewModelListUpdate.A00(new C71981OuD(AnonymousClass7TE.A16(oai.A00, rFj.A00)));
            }
            A02(viewModelListUpdate, oCr.A01, 1.0f);
        }
    }

    public C71063Oai(Context context, AnonymousClass0iw r12, UserSession userSession, OZV ozv, int i, boolean z, boolean z2) {
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = ozv;
        this.A05 = z2;
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(context);
        A002.A01(new NOQ(context, new O88(this), i));
        AnonymousClass0iw r5 = r12;
        this.A01 = DbU.A0U(A002, new C68585NOh(context, r5, this.A02, new PRI(this, 1), i, this.A05));
        this.A06 = !z;
    }

    public static final void A02(ViewModelListUpdate viewModelListUpdate, List list, float f) {
        int i = 0;
        int A002 = C70002Hb.A00(0, C51966G9m.A06(list), 6);
        if (A002 >= 0) {
            while (true) {
                viewModelListUpdate.A00(new C71974Otz(new C3251571g(list, i, 6), f));
                if (i != A002) {
                    i += 6;
                } else {
                    return;
                }
            }
        }
    }
}
