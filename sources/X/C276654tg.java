package X;

import com.instagram.common.lispy.lang.BloksScript;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4tg  reason: invalid class name and case insensitive filesystem */
public abstract class C276654tg {
    public static final int[] A00 = {135, 134, 153};

    public static void A01(C276544tV r10) {
        int A002;
        C277014uI A003;
        Object obj;
        C276624td r1;
        int[] iArr = A00;
        int i = 0;
        do {
            int i2 = iArr[i];
            Object A004 = C276544tV.A00(r10, i2);
            if (A004 instanceof String) {
                String str = (String) A004;
                C276634te r3 = r10.A01;
                if (r3 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(i2));
                    r1 = new C276624td(r3, arrayList);
                } else {
                    r1 = null;
                }
                obj = new BloksScript(r1, str, (List) null, r10.A03);
            } else {
                if (A004 instanceof List) {
                    List list = (List) A004;
                    ArrayList arrayList2 = new ArrayList(list.size());
                    for (int i3 = 0; i3 < list.size(); i3 += 2) {
                        Object obj2 = list.get(i3 + 1);
                        if (!(obj2 == null || (A003 = C280054zv.A00(r10, obj2, A002)) == null)) {
                            arrayList2.add(Integer.valueOf((A002 = C276474tO.A00((String) list.get(i3)))));
                            arrayList2.add(A003);
                        }
                    }
                    obj = arrayList2;
                }
                i++;
            }
            r10.A0P(i2, obj);
            i++;
        } while (i < 3);
    }

    public static void A00(C276634te r7, C276534tU r8, C276424tJ r9, String str) {
        ArrayList arrayList;
        int A002 = C276474tO.A00(str);
        switch (r9.E2K().intValue()) {
            case 0:
                ArrayList arrayList2 = new ArrayList();
                int i = 0;
                while (r9.Crg() != AnonymousClass05K.A01) {
                    if (r9.E2K() == AnonymousClass05K.A0C) {
                        C276664th r5 = new C276664th(r7);
                        List list = r5.A00;
                        list.add(Integer.valueOf(A002));
                        list.add(Integer.valueOf(i));
                        arrayList2.add(C276524tT.A00(r5, r9));
                        i++;
                    } else {
                        arrayList2.add(C276514tS.A00(r9));
                    }
                }
                arrayList = arrayList2;
                break;
            case 2:
                C276664th r2 = new C276664th(r7);
                r2.A00.add(Integer.valueOf(A002));
                arrayList = C276524tT.A00(r2, r9);
                break;
            case 5:
                arrayList = r9.E2L().Eyf();
                break;
            case 6:
                arrayList = C7294Q2t.A00((C276634te) null, r9.E2L());
                break;
            case 7:
                arrayList = r9.E2L().CsM();
                break;
            case 8:
                arrayList = Boolean.valueOf(r9.E2L().ADz());
                break;
            default:
                return;
        }
        r8.A0P(A002, arrayList);
    }
}
