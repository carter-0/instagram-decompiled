package X;

import android.util.Pair;
import android.util.SparseArray;
import com.facebook.litho.ComponentsSystrace;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.7gu  reason: invalid class name and case insensitive filesystem */
public abstract class C337787gu {
    public static final List A00 = new ArrayList();

    public static C337797gv A00(C337667gi r25, C337587ga r26, C337587ga r27, C337557gX r28, String str, String str2, String str3, String str4, List list) {
        String str5;
        String str6;
        List<C337587ga> list2;
        int intValue;
        List list3;
        String str7;
        int i = 0;
        boolean z = false;
        C337587ga r1 = r26;
        if (r26 == null) {
            z = true;
        }
        boolean z2 = false;
        C337587ga r9 = r27;
        if (r27 == null) {
            z2 = true;
        }
        if (z) {
            if (z2) {
                throw new IllegalStateException("Both currentRoot and newRoot are null.");
            }
        } else if (z2) {
            int i2 = r1.A00;
            list.add(r1);
            int i3 = r1.A00;
            C337797gv r10 = new C337797gv();
            r10.A00 = i3;
            r10.A02 = r9;
            r10.A01 = null;
            for (int i4 = 0; i4 < i2; i4++) {
                r10.A01(C337897h5.A00(C338347ho.A00(), (Object) null, (Object) null, 3, 0));
            }
            return r10;
        }
        if (r26 == null) {
            str5 = "";
        } else if (r1.A01 == null) {
            str5 = r1.getClass().getSimpleName();
        } else {
            str5 = 002.A0g(str2, "->", r1.getClass().getSimpleName());
        }
        if (r27 == null) {
            str6 = "";
        } else if (r9.A01 == null) {
            str6 = r9.getClass().getSimpleName();
        } else {
            str6 = 002.A0g(str3, "->", r9.getClass().getSimpleName());
        }
        if (z || r1.A00 != r9.A00 || r9.A07 || (r1 != r9 && !r1.CSo(r9))) {
            r25.A00(true, r1, r9, str, str5, str6, str4);
            if (r9 instanceof C337767gs) {
                boolean isTracing = ComponentsSystrace.A00.isTracing();
                if (isTracing) {
                    1Kb A002 = ComponentsSystrace.A00("generateChangeSet");
                    if (z) {
                        str7 = "<null>";
                    } else {
                        str7 = r1.A04;
                    }
                    A002.ACP(str7, "current_root");
                    A002.ACP(str5, "update_prefix");
                    A002.flush();
                }
                if (!z) {
                    i = r1.A00;
                }
                C337797gv r102 = new C337797gv();
                r102.A00 = i;
                r102.A02 = r9;
                C337557gX r0 = null;
                r102.A01 = null;
                C337557gX r2 = r9.A02;
                if (r26 != null) {
                    r0 = r1.A02;
                }
                r9.A03(r102, r1, r9, r2, r0, r2);
                r9.A00 = r102.A00;
                if (!isTracing) {
                    return r102;
                }
                ComponentsSystrace.A01();
                return r102;
            }
            C337797gv r103 = new C337797gv();
            r103.A00 = 0;
            r103.A02 = r9;
            r103.A01 = null;
            HashMap A003 = C337587ga.A00(r1);
            HashMap A004 = C337587ga.A00(r9);
            if (r26 == null || (list3 = r1.A05) == null) {
                list2 = A00;
            } else {
                list2 = new ArrayList<>(list3);
            }
            List list4 = r9.A05;
            if (list4 == null) {
                list4 = A00;
            }
            int i5 = -1;
            int i6 = -1;
            for (int i7 = 0; i7 < list4.size(); i7++) {
                String str8 = ((C337587ga) list4.get(i7)).A03;
                if (A003.containsKey(str8)) {
                    Pair pair = (Pair) A003.get(str8);
                    C337587ga r3 = (C337587ga) pair.first;
                    int intValue2 = ((Number) pair.second).intValue();
                    if (i5 > intValue2) {
                        for (int i8 = 0; i8 < r3.A00; i8++) {
                            int i9 = 0;
                            for (C337587ga r02 : list2) {
                                if (r02.A03.equals(str8)) {
                                    break;
                                }
                                i9 += r02.A00;
                            }
                            r103.A01(new C337897h5((C338367hq) null, (List) null, (List) null, (List) null, 0, i9, i6, 1));
                        }
                        list2.remove(intValue2);
                        list2.add(i5, r3);
                        int size = list2.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            C337587ga r22 = (C337587ga) list2.get(i10);
                            Pair pair2 = (Pair) A003.get(r22.A03);
                            if (((Number) pair2.second).intValue() != i10) {
                                A003.put(r22.A03, new Pair(pair2.first, Integer.valueOf(i10)));
                            }
                        }
                    } else if (intValue2 > i5) {
                        int i11 = 0;
                        for (C337587ga r12 : list2) {
                            if (r12.A03.equals(str8)) {
                                break;
                            }
                            i11 += r12.A00;
                        }
                        i6 = (i11 + ((C337587ga) list2.get(intValue2)).A00) - 1;
                        i5 = intValue2;
                    }
                }
            }
            SparseArray sparseArray = new SparseArray();
            for (int i12 = 0; i12 < list2.size(); i12++) {
                String str9 = ((C337587ga) list2.get(i12)).A03;
                C337587ga r13 = (C337587ga) list2.get(i12);
                if (A004.get(str9) == null) {
                    sparseArray.put(i12, A00(r25, r13, (C337587ga) null, r28, str, str5, str6, str4, list));
                }
            }
            for (int i13 = 0; i13 < list4.size(); i13++) {
                C337587ga r5 = (C337587ga) list4.get(i13);
                Pair pair3 = (Pair) A003.get(r5.A03);
                if (pair3 == null || (intValue = ((Number) pair3.second).intValue()) < 0) {
                    sparseArray.put(i, C337797gv.A00((C337797gv) sparseArray.get(i), A00(r25, (C337587ga) null, r5, r28, str, str5, str6, str4, list)));
                } else {
                    sparseArray.put(intValue, C337797gv.A00((C337797gv) sparseArray.get(intValue), A00(r25, (C337587ga) list2.get(intValue), r5, r28, str, str5, str6, str4, list)));
                    i = intValue;
                }
            }
            int size2 = sparseArray.size();
            for (int i14 = 0; i14 < size2; i14++) {
                r103 = C337797gv.A00(r103, (C337797gv) sparseArray.valueAt(i14));
            }
            r9.A00 = r103.A00;
            return r103;
        }
        int i15 = r1.A00;
        C337797gv r104 = new C337797gv();
        r104.A00 = i15;
        r104.A02 = r9;
        r104.A01 = null;
        r9.A00 = i15;
        r25.A00(false, r1, r9, str, str5, str6, str4);
        return r104;
    }
}
