package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public abstract class V9L {
    public static final C60340gF A00(C307896Rx r9, AnonymousClass6Tm r10) {
        Object obj;
        ArrayList arrayList = (ArrayList) r10.A03(0);
        C277014uI r1 = ((C280064zw) r10.A02()).A00;
        C307786Rm r0 = r9.A03;
        if (r0 != null) {
            C17486VXn vXn = new C17486VXn(r0.A00, r9, r1);
            0qQ.A0B(arrayList, 0);
            if (!arrayList.isEmpty()) {
                Activity activity = vXn.A00;
                if (activity instanceof FragmentActivity) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator A1G = AnonymousClass7TE.A1G(arrayList);
                    while (true) {
                        obj = "INVALID_PERMISSION_NAME";
                        if (!A1G.hasNext()) {
                            break;
                        }
                        Object obj2 = C17150VKc.A00.get(AnonymousClass7TF.A0a(A1G));
                        if (obj2 != null) {
                            obj = obj2;
                        }
                        arrayList2.add(obj);
                    }
                    if (arrayList2.contains(obj)) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(JTT.A08(arrayList));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            linkedHashMap.put(it.next(), "DENIED");
                        }
                        C299275ur.A00(vXn.A01, Pxj.A0a(linkedHashMap), vXn.A02);
                    }
                    Activity parent = activity.getParent();
                    if (parent == null) {
                        parent = activity;
                    }
                    C19253WRm wRm = new C19253WRm(vXn, 0);
                    String[] A1a = Pxf.A1a(arrayList2, 0);
                    C13990Tnq.A0k(parent, wRm, A1a, A1a.length);
                    return C60340gF.A00;
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(JTT.A08(arrayList));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashMap2.put(it2.next(), "DENIED");
            }
            C299275ur.A00(vXn.A01, Pxj.A0a(linkedHashMap2), vXn.A02);
            return C60340gF.A00;
        }
        throw AnonymousClass7TE.A0y();
    }
}
