package X;

import java.util.ArrayList;

/* renamed from: X.8g5  reason: invalid class name and case insensitive filesystem */
public final class C361348g5 {
    public final ArrayList A00;
    public final ArrayList A01;
    public final 05G A02;
    public final 05G A03;
    public final AnonymousClass0Ud A04;
    public final AnonymousClass0Ud A05;

    public final void A01(C359548d5 r4, C293505kq r5) {
        0qQ.A0B(r4, 0);
        ArrayList arrayList = this.A01;
        if (arrayList.size() >= 20) {
            018.A13(arrayList);
            05G r1 = this.A03;
            r1.Epw(Integer.valueOf(((Number) r1.getValue()).intValue() - 1));
        }
        arrayList.add(new 0eP(r4, r5));
        05G r12 = this.A03;
        r12.Epw(Integer.valueOf(((Number) r12.getValue()).intValue() + 1));
    }

    public final void A00() {
        this.A01.clear();
        this.A03.Epw(0);
        this.A00.clear();
        this.A02.Epw(0);
    }

    public C361348g5() {
        ArrayList arrayList = new ArrayList(20);
        this.A01 = arrayList;
        02z A012 = 106.A01(Integer.valueOf(arrayList.size()));
        this.A03 = A012;
        this.A05 = 10b.A03(A012);
        ArrayList arrayList2 = new ArrayList(20);
        this.A00 = arrayList2;
        02z A013 = 106.A01(Integer.valueOf(arrayList2.size()));
        this.A02 = A013;
        this.A04 = 10b.A03(A013);
    }
}
