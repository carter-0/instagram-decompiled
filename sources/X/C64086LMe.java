package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.LMe  reason: case insensitive filesystem */
public final class C64086LMe {
    public final 1Vf A00;
    public final C251983oI A01;
    public final 1Vg A02;
    public final 1Vg A03;

    public C64086LMe(C251983oI r3) {
        this.A01 = r3;
        this.A00 = new C60720Jq9(r3, this, 2);
        this.A02 = new C60724JqD(r3, this, 6);
        this.A03 = new C60724JqD(r3, this, 7);
    }

    public static void A00(C64086LMe lMe, HashMap hashMap) {
        int i;
        Set keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            HashMap hashMap2 = new HashMap(999);
            Iterator it = hashMap.keySet().iterator();
            loop0:
            while (true) {
                i = 0;
                while (it.hasNext()) {
                    Object A0a = AnonymousClass7TF.A0a(it);
                    hashMap2.put(A0a, hashMap.get(A0a));
                    i++;
                    if (i == 999) {
                        A00(lMe, hashMap2);
                        hashMap2.clear();
                    }
                }
                break loop0;
            }
            if (i > 0) {
                A00(lMe, hashMap2);
                return;
            }
            return;
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SELECT `id`,`medium_id`,`suggestion_id` FROM `suggestion_medium` WHERE `suggestion_id` IN (");
        int size = keySet.size();
        1wO.A00(A1A, size);
        1WY A0M = JTO.A0M(AnonymousClass7TF.A0l(")", A1A), size);
        Iterator it2 = keySet.iterator();
        int i2 = 1;
        while (it2.hasNext()) {
            A0M.ADh(i2, AnonymousClass7TE.A18(it2));
            i2++;
        }
        Cursor A002 = 1wT.A00(lMe.A01, A0M, false);
        try {
            int A003 = 1Wd.A00(A002, "suggestion_id");
            if (A003 != -1) {
                while (A002.moveToNext()) {
                    ArrayList arrayList = (ArrayList) hashMap.get(A002.getString(A003));
                    if (arrayList != null) {
                        arrayList.add(new C63770L6c(A002.getLong(0), A002.getString(1), A002.getString(2)));
                    }
                }
            }
        } finally {
            A002.close();
        }
    }
}
