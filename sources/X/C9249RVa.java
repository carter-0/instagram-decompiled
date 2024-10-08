package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* renamed from: X.RVa  reason: case insensitive filesystem */
public abstract class C9249RVa {
    public static String A00(C337827gy r20, String str, List list) {
        String str2;
        String str3;
        String str4;
        List list2 = list;
        ListIterator listIterator = list2.listIterator();
        int i = 0;
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex() + 1;
            Object next = listIterator.next();
            ListIterator listIterator2 = list2.listIterator(nextIndex);
            while (listIterator2.hasNext()) {
                Object next2 = listIterator2.next();
                if (C337827gy.A00(r20, next, next2)) {
                    String str5 = "null";
                    if (next != null) {
                        str2 = next.toString();
                    } else {
                        str2 = str5;
                    }
                    if (next2 != null) {
                        str3 = next2.toString();
                    } else {
                        str3 = str5;
                    }
                    if (next != null) {
                        str4 = C66581MXm.A0y(next);
                    } else {
                        str4 = str5;
                    }
                    String A0g = 002.A0g("<cls>", str4, "</cls>");
                    if (next2 != null) {
                        str5 = C66581MXm.A0y(next2);
                    }
                    String A0g2 = 002.A0g("<cls>", str5, "</cls>");
                    C62320sa r17 = C11145SCa.A00;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (2SO.A02.compareTo(2SN.A00()) >= 0) {
                        Set set = 2SN.A00;
                        if (!set.isEmpty()) {
                            ArrayList<2SM> arrayList = null;
                            for (Object next3 : set) {
                                String[] strArr = ((2SM) next3).A00;
                                if (03t.A0O("Litho.DebugInfo", strArr) || 03t.A0O("*", strArr)) {
                                    if (arrayList == null) {
                                        arrayList = AnonymousClass7TE.A1C();
                                    }
                                    arrayList.add(next3);
                                }
                            }
                            if (arrayList == null) {
                                arrayList = 0sn.A00;
                            }
                            if (AnonymousClass7TE.A1b(arrayList)) {
                                LinkedHashMap A1H = AnonymousClass7TE.A1H();
                                A1H.put("section", str);
                                A1H.put("size", C51968G9o.A0t(list2));
                                A1H.put("item", str2);
                                A1H.put("item-type", A0g);
                                A1H.put("other-item", str3);
                                A1H.put("other-item-type", A0g2);
                                A1H.put("index", Integer.valueOf(i));
                                A1H.put("next-index", Integer.valueOf(nextIndex));
                                A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "DuplicateItemsInSection");
                                PzP pzP = new PzP(currentTimeMillis, "Litho.DebugInfo", (String) r17.invoke(), A1H);
                                for (2SM A00 : arrayList) {
                                    A00.A00(pzP);
                                }
                            }
                        }
                    }
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append("Duplicates are [type:");
                    A1A.append(A0g);
                    A1A.append(" hash:");
                    A1A.append(System.identityHashCode(next));
                    A1A.append(" position:");
                    A1A.append(i);
                    Pxg.A1P("] and [type:", A0g2, " hash:", A1A);
                    A1A.append(System.identityHashCode(next2));
                    A1A.append(" position:");
                    A1A.append(nextIndex);
                    return AnonymousClass7TF.A0l("]", A1A);
                }
                nextIndex++;
            }
            i++;
        }
        return null;
    }
}
