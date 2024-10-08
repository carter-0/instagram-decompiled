package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.MwR  reason: case insensitive filesystem */
public abstract class C67883MwR extends C249703kE {
    public final void A01(C66788McZ mcZ) {
        Object obj;
        Object Brn;
        2EM r2;
        Object obj2;
        int i;
        if (this instanceof C67480Moa) {
            C67480Moa moa = (C67480Moa) this;
            ArrayList A1C = AnonymousClass7TE.A1C();
            List<C66787McY> list = mcZ.A01;
            boolean z = true;
            boolean A1W = C51970G9q.A1W(list.size(), 3);
            Context A0S = AnonymousClass7TE.A0S(moa.A02);
            int A02 = DbS.A02(A0S, (C51966G9m.A06(list) * 8) + 32);
            int i2 = 0;
            for (C66787McY A00 : list) {
                C67331Mm7 A002 = C67330Mm6.A00(A0S, A00, moa.A03, mcZ.A02);
                if (A1W) {
                    C67328Mm4 mm4 = moa.A05;
                    mm4.A00(A002, C67516MpB.A00, false);
                    mm4.itemView.measure(0, 0);
                    A002.A00 = mm4.itemView.getMeasuredWidth();
                    i2 += mm4.itemView.getMeasuredWidth();
                } else {
                    A002.A00 = (moa.A01 - A02) / list.size();
                }
                A1C.add(A002);
            }
            UserSession userSession = moa.A03;
            if (2El.A08(userSession)) {
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                for (Object next : list) {
                    if (((C66787McY) next).A02 instanceof 2Ej) {
                        A1C2.add(next);
                    }
                }
                if (A1C2.size() >= 5) {
                    z = false;
                }
                A1C.add(new C67332Mm8(AnonymousClass7TF.A0d(A0S.getResources(), 2131959517), z));
            }
            if (A1W && (i = (moa.A01 - i2) - A02) > 0) {
                Iterator it = A1C.iterator();
                while (it.hasNext()) {
                    ((C67332Mm8) it.next()).A00 += i / A1C.size();
                }
            }
            C67325Mm1 mm1 = moa.A06;
            if (!moa.A00 && 2El.A07(userSession)) {
                Iterator it2 = list.iterator();
                while (true) {
                    r2 = null;
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (C51966G9m.A1a(((C66787McY) obj2).A02, AnonymousClass43I.A00)) {
                        break;
                    }
                }
                C66787McY mcY = (C66787McY) obj2;
                if (mcY != null) {
                    r2 = (2EM) mcY.A02;
                }
                moa.A00 = true;
                if (r2 != null) {
                    C74491Pvl pvl = moa.A04;
                    if (!r2.equals(pvl.Brn())) {
                        pvl.Eji(r2);
                    }
                }
            }
            Iterator it3 = list.iterator();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                C66787McY mcY2 = (C66787McY) it3.next();
                if (2El.A0H(userSession)) {
                    C67237MkX Brv = moa.A04.Brv();
                    if (Brv != null) {
                        obj = Brv.A00;
                    } else {
                        obj = null;
                    }
                    Brn = mcY2.A02;
                } else {
                    obj = mcY2.A02;
                    Brn = moa.A04.Brn();
                }
                if (!0qQ.A0K(obj, Brn)) {
                    i4++;
                } else if (i4 >= 0) {
                    i3 = i4;
                }
            }
            List list2 = mm1.A02;
            list2.clear();
            list2.addAll(A1C);
            mm1.A00 = Integer.valueOf(i3);
            mm1.notifyDataSetChanged();
            return;
        }
        NWK nwk = (NWK) this;
        0qQ.A0B(mcZ, 0);
        View view = nwk.A01;
        ViewGroup.MarginLayoutParams A0G = DbX.A0G(view);
        Context A0S2 = AnonymousClass7TE.A0S(view);
        A0G.topMargin = DbY.A01(A0S2);
        view.setLayoutParams(A0G);
        List list3 = mcZ.A01;
        if (list3.size() == 3) {
            int A022 = (nwk.A00 - DbS.A02(A0S2, (C51966G9m.A06(list3) * 8) + 32)) / list3.size();
            C67328Mm4 mm42 = new C67328Mm4(AnonymousClass7TE.A0b(view, R.id.pill_0));
            C67328Mm4 mm43 = new C67328Mm4(AnonymousClass7TE.A0b(view, R.id.pill_1));
            C67328Mm4 mm44 = new C67328Mm4(AnonymousClass7TE.A0b(view, R.id.pill_2));
            NWK.A00(nwk, mm42, mcZ, 0, A022);
            NWK.A00(nwk, mm43, mcZ, 1, A022);
            NWK.A00(nwk, mm44, mcZ, 2, A022);
            return;
        }
        throw AnonymousClass7TE.A0z("Unsupported tab count");
    }
}
