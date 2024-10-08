package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;

/* renamed from: X.Mmf  reason: case insensitive filesystem */
public final class C67363Mmf {
    public static final C67363Mmf A00 = new Object();

    public final void A00(List list, C62320sa r13, boolean z) {
        C295805ow r1;
        C297005r0 r2;
        C295795ov r9;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        Object r22;
        int i;
        C298795u2 r12;
        C296935qt r92;
        VZS vzs;
        C298795u2 r8;
        Object obj;
        C298795u2 r0;
        C298795u2 r14;
        int i2 = 0;
        for (Object next : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            C297005r0 r4 = (C297005r0) next;
            if (r4 != null) {
                List list2 = r4.A02;
                if (list2.size() == 1 && (list2.get(0) instanceof HAU) && i2 >= 1) {
                    Object obj2 = list.get(i2 - 1);
                    if (obj2 instanceof C297005r0) {
                        List list3 = ((C297005r0) obj2).A02;
                        if (list3.size() == 1 && (list3.get(0) instanceof HAU)) {
                            0qQ.A0C(r4, "null cannot be cast to non-null type com.instagram.discovery.recyclerview.model.GridItemSection");
                            Object obj3 = list2.get(0);
                            0qQ.A0C(obj3, "null cannot be cast to non-null type com.instagram.discovery.recyclerview.model.TriMediaKeywordGridItemViewModel");
                            ((HAU) obj3).A01 = false;
                        }
                    }
                }
            }
            i2 = i3;
        }
        for (Object next2 : list) {
            C295795ov r23 = ((C297005r0) next2).A01;
            Integer num = null;
            if (r23 != null) {
                r1 = r23.A00;
            } else {
                r1 = null;
            }
            C295805ow r6 = C295805ow.INTEREST_KEYWORD_RECOMMENDATION;
            if (r1 == r6) {
                if (!(r23 == null || (r14 = r23.A06) == null)) {
                    num = r14.A02;
                }
                Integer num2 = AnonymousClass05K.A0C;
                if (num == num2) {
                    if (next2 != null) {
                        ListIterator listIterator = list.listIterator();
                        boolean z2 = false;
                        while (listIterator.hasNext()) {
                            C297005r0 r3 = (C297005r0) listIterator.next();
                            if (z) {
                                if (r3.A01 != null) {
                                    list.indexOf(r3);
                                    Iterator it = r3.A02.iterator();
                                    while (true) {
                                        r8 = null;
                                        if (!it.hasNext()) {
                                            obj = null;
                                            break;
                                        }
                                        obj = it.next();
                                        C295795ov r15 = ((C296935qt) obj).A03;
                                        if (r15 != null && r15.A00 == r6 && (r0 = r15.A06) != null && r0.A02 == num2) {
                                            break;
                                        }
                                    }
                                    r92 = (C296935qt) obj;
                                    if (r92 != null) {
                                        C295795ov r16 = r92.A03;
                                        if (!(r16 == null || (r16.A00 == r6 && (r8 = r16.A06) != null && r8.A02 == num2))) {
                                            r8 = null;
                                        }
                                        0qQ.A0A(r8);
                                        vzs = new VZS(r8, r8.A00().A04, true, false);
                                    }
                                } else {
                                    r92 = (C296935qt) 00k.A0J(r3.A02);
                                    if (r92 != null) {
                                        vzs = (VZS) r13.invoke();
                                    }
                                }
                                r92.A00 = vzs;
                            }
                            if (z2) {
                                listIterator.previous();
                                if (z) {
                                    r9 = null;
                                    arrayList = new ArrayList();
                                    linkedHashMap = new LinkedHashMap();
                                    String obj4 = UUID.randomUUID().toString();
                                    0qQ.A07(obj4);
                                    i = 0;
                                    C296935qt r17 = new C296935qt(C296895qp.A01(135.0f, 0, 0), obj4);
                                    C296995qz r02 = new C296995qz(0, 0);
                                    arrayList.add(r17);
                                    linkedHashMap.put(r17, r02);
                                } else {
                                    C295795ov r18 = r3.A01;
                                    if (r18 == null) {
                                        r9 = null;
                                        arrayList = new ArrayList();
                                        linkedHashMap = new LinkedHashMap();
                                        String obj5 = UUID.randomUUID().toString();
                                        0qQ.A07(obj5);
                                        r22 = new C296935qt(C296895qp.A00(), obj5);
                                    } else if (r18.A00 == r6 && (r12 = r18.A06) != null && r12.A02 == num2) {
                                        r9 = null;
                                        arrayList = new ArrayList();
                                        linkedHashMap = new LinkedHashMap();
                                        r22 = new C69008Nck(C296895qp.A00(), r12);
                                    }
                                    C296995qz r03 = new C296995qz(0, 0);
                                    arrayList.add(r22);
                                    linkedHashMap.put(r22, r03);
                                    i = 1;
                                }
                                listIterator.add(new C297005r0(r9, arrayList, linkedHashMap, i));
                            }
                            z2 = true;
                            C295795ov r19 = null;
                            while (listIterator.hasNext()) {
                                Object next3 = listIterator.next();
                                r19 = null;
                                if ((next3 instanceof C297005r0) && (r2 = (C297005r0) next3) != null) {
                                    r19 = r2.A01;
                                }
                                if (!0qQ.A0K(r3.A01, r19)) {
                                    break;
                                }
                            }
                            if (!0qQ.A0K(r3.A01, r19)) {
                                listIterator.previous();
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }
}
