package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3sH  reason: invalid class name and case insensitive filesystem */
public final class C254313sH {
    public static final C254313sH A00 = new Object();

    public static final C254323sI A00(String str) {
        return new C254323sI(str, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), -1);
    }

    public final C254323sI A03(C254273sD r13, C254323sI r14) {
        ArrayList arrayList = new ArrayList(r14.A07);
        ArrayList arrayList2 = new ArrayList(r14.A02);
        ArrayList arrayList3 = new ArrayList(r14.A06);
        ArrayList arrayList4 = new ArrayList(r14.A04);
        ArrayList arrayList5 = new ArrayList(r14.A03);
        ArrayList arrayList6 = new ArrayList(r14.A05);
        long j = r14.A00;
        switch (r13.BzO().intValue()) {
            case 0:
                A01(r13, arrayList);
                float Bba = r13.Bba();
                if (Bba >= 1.0f || Bba < 0.5f) {
                    if (Bba == 1.0f) {
                        A01(r13, arrayList2);
                        A01(r13, arrayList4);
                        break;
                    }
                } else {
                    A01(r13, arrayList2);
                    break;
                }
                break;
            case 1:
                A02(r13, arrayList);
                A02(r13, arrayList2);
                A02(r13, arrayList4);
                A02(r13, arrayList5);
                A02(r13, arrayList6);
                break;
            default:
                if ((!arrayList.isEmpty()) || r13.B7K()) {
                    float Bba2 = r13.Bba();
                    if (Bba2 >= 1.0f || Bba2 < 0.5f) {
                        if (Bba2 != 1.0f) {
                            if (Bba2 < 0.5f && Bba2 >= 0.0f) {
                                if (r13.B7K()) {
                                    A05(r13, arrayList);
                                }
                                A02(r13, arrayList2);
                                A02(r13, arrayList4);
                                break;
                            } else {
                                0KC.A0C("UnifiedTimeEntryMerger", "when percent is zero percent, it should never be FBMerlinVPVStatusUpdate status.");
                                break;
                            }
                        } else {
                            A05(r13, arrayList4);
                        }
                    } else {
                        A02(r13, arrayList4);
                    }
                    A05(r13, arrayList2);
                    if (r13.B7K()) {
                        A05(r13, arrayList);
                        break;
                    }
                }
                break;
        }
        return new C254323sI(r14.A01, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, j);
    }

    public final C254303sG A04(C254273sD r5, C254303sG r6) {
        C254323sI r3 = r6.A00;
        C254323sI r2 = r6.A01;
        if (r5.BVl()) {
            r3 = A03(r5, r3);
        } else {
            if (r5.BzO() == AnonymousClass05K.A01 && !r3.A00()) {
                r3 = A03(r5, r3);
            }
            r2 = A03(r5, r2);
        }
        return new C254303sG(r2, r3);
    }

    public static final void A01(C254273sD r6, List list) {
        C254333sJ r4;
        if (list.isEmpty()) {
            r4 = new C254333sJ(r6.C7E(), -1);
        } else {
            C254333sJ r1 = (C254333sJ) list.get(list.size() - 1);
            if (r1.A01 != -1 && r1.A00 == -1) {
                0KC.A0C("UnifiedTimeEntryMerger", "Unexpected last time entry with exit timestamp placeholder");
            }
            r4 = new C254333sJ(r6.C7E(), -1);
        }
        list.add(r4);
    }

    public static final void A02(C254273sD r6, List list) {
        if (!list.isEmpty()) {
            C254333sJ r5 = (C254333sJ) list.get(list.size() - 1);
            if (r5.A00 == -1) {
                list.set(list.size() - 1, new C254333sJ(r5.A01, r6.C7E()));
            }
        }
    }

    public final void A05(C254273sD r7, List list) {
        if (!list.isEmpty()) {
            C254333sJ r5 = (C254333sJ) list.get(list.size() - 1);
            if (r5.A01 == -1 || r5.A00 == -1) {
                return;
            }
        }
        A01(r7, list);
    }
}
