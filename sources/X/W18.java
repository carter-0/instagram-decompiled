package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class W18 {
    public static final AnonymousClass2R4 A03;
    public final C17651Vbh A00 = new C17651Vbh(A03, 0);
    public final AnonymousClass2R4 A01 = new Object();
    public final double[] A02 = new double[2];

    /* JADX WARNING: type inference failed for: r0v0, types: [X.2R4, java.lang.Object] */
    static {
        ? obj = new Object();
        obj.A01 = 0.0d;
        obj.A03 = 0.0d;
        obj.A02 = 1.0d;
        obj.A00 = 1.0d;
        A03 = obj;
    }

    public static void A00(C17651Vbh vbh, W18 w18, AnonymousClass2R4 r10, Collection collection) {
        double d = r10.A01;
        double d2 = r10.A02;
        if (d > d2) {
            AnonymousClass2R4 r6 = w18.A01;
            r6.A03 = r10.A03;
            r6.A00 = r10.A00;
            r6.A01 = d;
            r6.A02 = d2;
            r6.A02 = 1.0d;
            A00(vbh, w18, r6, collection);
            r6.A03 = r10.A03;
            r6.A00 = r10.A00;
            r6.A01 = r10.A01;
            r6.A02 = r10.A02;
            r6.A01 = 0.0d;
            A00(vbh, w18, r6, collection);
            return;
        }
        AnonymousClass2R4 r4 = vbh.A06;
        if (r4.A01 <= d2 && d <= r4.A02 && r4.A03 <= r10.A00 && r10.A03 <= r4.A00) {
            if (!vbh.A04) {
                A00(vbh.A01, w18, r10, collection);
                A00(vbh.A00, w18, r10, collection);
                A00(vbh.A03, w18, r10, collection);
                A00(vbh.A02, w18, r10, collection);
                return;
            }
            boolean A012 = r10.A01(r4);
            ArrayList arrayList = vbh.A07;
            if (A012) {
                collection.addAll(arrayList);
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                X2C x2c = (X2C) it.next();
                double[] dArr = w18.A02;
                x2c.AmS(dArr);
                if (r10.A00(dArr[0], dArr[1])) {
                    collection.add(x2c);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [X.2R4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v1, types: [X.2R4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v2, types: [X.2R4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v1, types: [X.2R4, java.lang.Object] */
    public static boolean A01(X2C x2c, C17651Vbh vbh, W18 w18) {
        int i;
        W18 w182 = w18;
        double[] dArr = w182.A02;
        X2C x2c2 = x2c;
        x2c2.AmS(dArr);
        C17651Vbh vbh2 = vbh;
        AnonymousClass2R4 r8 = vbh2.A06;
        boolean z = true;
        if (!r8.A00(dArr[0], dArr[1])) {
            return false;
        }
        if (vbh2.A04) {
            ArrayList arrayList = vbh2.A07;
            if (arrayList.size() < 40 || (i = vbh2.A05) > 20) {
                arrayList.add(x2c2);
                return z;
            }
            double d = r8.A01;
            double d2 = r8.A02;
            double d3 = (d + d2) * 0.5d;
            double d4 = r8.A03;
            double d5 = (d4 + r8.A00) * 0.5d;
            ? obj = new Object();
            obj.A01 = d3;
            obj.A03 = d4;
            obj.A02 = d2;
            obj.A00 = d5;
            int i2 = i + 1;
            vbh2.A00 = new C17651Vbh(obj, i2);
            double d6 = r8.A01;
            double d7 = r8.A00;
            ? obj2 = new Object();
            obj2.A01 = d6;
            obj2.A03 = d5;
            obj2.A02 = d3;
            obj2.A00 = d7;
            vbh2.A03 = new C17651Vbh(obj2, i2);
            double d8 = r8.A01;
            double d9 = r8.A03;
            ? obj3 = new Object();
            obj3.A01 = d8;
            obj3.A03 = d9;
            obj3.A02 = d3;
            obj3.A00 = d5;
            vbh2.A01 = new C17651Vbh(obj3, i2);
            double d10 = r8.A02;
            double d11 = r8.A00;
            ? obj4 = new Object();
            obj4.A01 = d3;
            obj4.A03 = d5;
            obj4.A02 = d10;
            obj4.A00 = d11;
            vbh2.A02 = new C17651Vbh(obj4, i2);
            vbh2.A04 = false;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                X2C x2c3 = (X2C) arrayList.get(i3);
                if (!A01(x2c3, vbh2.A01, w182) && !A01(x2c3, vbh2.A00, w182) && !A01(x2c3, vbh2.A03, w182)) {
                    A01(x2c3, vbh2.A02, w182);
                }
            }
            arrayList.clear();
        }
        if (A01(x2c2, vbh2.A01, w182) || A01(x2c2, vbh2.A00, w182) || A01(x2c2, vbh2.A03, w182)) {
            return true;
        }
        z = false;
        if (A01(x2c2, vbh2.A02, w182)) {
            return true;
        }
        return z;
    }
}
