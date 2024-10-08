package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2pz  reason: invalid class name and case insensitive filesystem */
public final class C230662pz {
    public final UserSession A00;
    public final C228182kv A01;
    public final C227802jw A02;
    public final Map A03 = new LinkedHashMap();
    public final AnonymousClass0eM A04 = AnonymousClass1YB.A00(new AnonymousClass9LY(this, 27));

    public C230662pz(UserSession userSession, C228182kv r4, C227802jw r5) {
        0qQ.A0B(r4, 3);
        this.A02 = r5;
        this.A00 = userSession;
        this.A01 = r4;
    }

    public final void A01(String str) {
        AnonymousClass2rI r5 = (AnonymousClass2rI) this.A02.getAdapter();
        AnonymousClass2rW r6 = (AnonymousClass2rW) r5.A00;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = r6.A02.iterator();
        0qQ.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            1Xg r2 = (1Xg) next;
            0qQ.A0B(r2, 0);
            if (r2.A06 != 1UQ.A08 || !0qQ.A0K(r2.A09, str)) {
                arrayList2.add(next);
            } else {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            r6.A0C(it2.next());
        }
        r6.A01 = Collections.unmodifiableList(arrayList2);
        AnonymousClass2rW.A00(r6);
        r5.A0A(-1);
    }

    public static final List A00(C54077Gz1 gz1, C230662pz r5) {
        List<C55923Hpk> list = gz1.A0B;
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        for (C55923Hpk A002 : list) {
            arrayList.add(A002.A00());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            if (!1sd.A00(r5.A00).A05((1Xj) next)) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }
}
