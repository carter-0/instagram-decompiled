package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: X.3bs  reason: invalid class name and case insensitive filesystem */
public final class C244863bs extends C243063Xg {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final 2Tf A05;
    public final 2T4 A06;
    public final C244843bq A07;

    public C244863bs(2Tf r2, 2T4 r3, C244843bq r4, int i, int i2, int i3, int i4, int i5) {
        super(i3, false);
        this.A07 = r4;
        this.A06 = r3;
        this.A05 = r2;
        this.A04 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A01 = i5;
    }

    public final String A04() {
        return "layout";
    }

    public final int A02() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass2T6 A03() {
        long A002 = C244873bt.A00(this.A04, this.A00);
        Set set = 2SN.A00;
        if (!set.isEmpty()) {
            ArrayList<C7850QbY> arrayList = null;
            ArrayList<2SM> arrayList2 = null;
            for (Object next : set) {
                String[] strArr = ((2SM) next).A00;
                if (03t.A0O("Litho.ComponentTree.Layout", strArr) || 03t.A0O("*", strArr)) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    arrayList2.add(next);
                }
            }
            if (arrayList2 == null) {
                arrayList2 = 0sn.A00;
            }
            if (!arrayList2.isEmpty()) {
                for (Object next2 : arrayList2) {
                    if (next2 instanceof C7850QbY) {
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        arrayList.add(next2);
                    }
                }
                if (arrayList == null) {
                    arrayList = 0sn.A00;
                }
                0qQ.A0C(arrayList, "null cannot be cast to non-null type kotlin.collections.List<com.facebook.rendercore.debug.TraceListener<kotlin.Any?>>");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C244843bq r15 = this.A07;
                linkedHashMap.put("root", r15.A01.A0J());
                linkedHashMap.put("sizeConstraints", C245073cH.A04(A002));
                int i = this.A03;
                linkedHashMap.put("version", Integer.valueOf(i));
                linkedHashMap.put("source", C392969vg.A00(this.A01));
                ArrayList arrayList3 = new ArrayList(0Yv.A1E(arrayList, 10));
                for (C7850QbY A012 : arrayList) {
                    arrayList3.add(A012.A01("Litho.ComponentTree.Layout"));
                }
                long currentTimeMillis = System.currentTimeMillis();
                long nanoTime = System.nanoTime();
                int i2 = this.A02;
                2T4 A003 = C244923by.A00(this.A05, this.A06, r15, this, i, i2, A002);
                String str = "Litho.ComponentTree.Layout";
                C7846QbU qbU = new C7846QbU(str, String.valueOf(i2), linkedHashMap, currentTimeMillis, System.nanoTime() - nanoTime);
                int i3 = 0;
                for (Object next3 : arrayList) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        0sr.A1T();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    ((C7850QbY) next3).A02(qbU, arrayList3.get(i3));
                    i3 = i4;
                }
                for (2SM A004 : arrayList2) {
                    A004.A00(qbU);
                }
                return A003;
            }
        }
        return C244923by.A00(this.A05, this.A06, this.A07, this, this.A03, this.A02, A002);
    }
}
