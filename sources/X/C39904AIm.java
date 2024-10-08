package X;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.AIm  reason: case insensitive filesystem */
public final class C39904AIm {
    public int A00;
    public int A01;
    public C344477rv A02;
    public Integer A03;
    public Integer A04 = AnonymousClass05K.A00;
    public boolean A05;
    public final Handler A06;
    public final SparseArray A07 = new SparseArray();
    public final SparseArray A08 = new SparseArray();
    public final SparseArray A09 = new SparseArray();
    public final C343837qt A0A;
    public final C344407ro A0B;
    public final Map A0C = AnonymousClass7TE.A1E();
    public final Map A0D = AnonymousClass7TE.A1E();

    public static void A00(A3D a3d, C39904AIm aIm, int i, int i2) {
        A3D a3d2;
        int i3;
        int i4;
        C39904AIm aIm2 = aIm;
        Map map = aIm.A0C;
        map.getClass();
        Iterator it = map.keySet().iterator();
        while (true) {
            a3d2 = a3d;
            i3 = i;
            i4 = i2;
            if (!it.hasNext()) {
                break;
            }
            int A0F = AnonymousClass7TG.A0F(it);
            Object obj = aIm.A08.get(A0F);
            obj.getClass();
            int A0M = AnonymousClass7TE.A0M(obj);
            Object obj2 = aIm.A07.get(A0F);
            obj2.getClass();
            int A0M2 = AnonymousClass7TE.A0M(obj2);
            if (A03(aIm)) {
                A01(a3d2, aIm2, A0F, A0M, A0M2, i3, i4);
            } else {
                aIm.A06.post(new C41251Aqn(a3d2, aIm2, A0F, A0M, A0M2, i3, i4));
            }
        }
        Map map2 = aIm.A0D;
        map2.getClass();
        Iterator it2 = map2.keySet().iterator();
        while (it2.hasNext()) {
            int A0F2 = AnonymousClass7TG.A0F(it2);
            Object obj3 = aIm.A08.get(A0F2);
            obj3.getClass();
            int A0M3 = AnonymousClass7TE.A0M(obj3);
            Object obj4 = aIm.A07.get(A0F2);
            obj4.getClass();
            int A0M4 = AnonymousClass7TE.A0M(obj4);
            if (A03(aIm)) {
                A01(a3d2, aIm2, A0F2, A0M3, A0M4, i3, i4);
            } else {
                aIm.A06.post(new C41251Aqn(a3d2, aIm2, A0F2, A0M3, A0M4, i3, i4));
            }
        }
    }

    public static void A01(A3D a3d, C39904AIm aIm, int i, int i2, int i3, int i4, int i5) {
        SparseArray sparseArray = aIm.A08;
        sparseArray.getClass();
        SparseArray sparseArray2 = aIm.A07;
        sparseArray2.getClass();
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        int i10 = i5;
        if (sparseArray.get(i) == null || AnonymousClass7TE.A0M(sparseArray.get(i)) != i2 || sparseArray2.get(i) == null || AnonymousClass7TE.A0M(sparseArray2.get(i)) != i8 || aIm.A01 != i9 || aIm.A00 != i10) {
            sparseArray.put(i, Integer.valueOf(i2));
            sparseArray2.put(i, Integer.valueOf(i8));
            aIm.A01 = i9;
            aIm.A00 = i10;
            Map map = aIm.A0C;
            map.getClass();
            Integer valueOf = Integer.valueOf(i);
            if ((map.containsKey(valueOf) || aIm.A0D.containsKey(valueOf)) && sparseArray.get(i) != null && AnonymousClass7TE.A0M(sparseArray.get(i)) != 0 && sparseArray2.get(i) != null && AnonymousClass7TE.A0M(sparseArray2.get(i)) != 0 && aIm.A01 != 0 && aIm.A00 != 0) {
                map.get(valueOf);
                C40138ATe aTe = (C40138ATe) aIm.A0D.get(valueOf);
                if (aTe != null) {
                    aTe.A01(i2, i8, 0);
                }
                aIm.A02.FLA(i6, i7, i8, aIm.A05, i9, i10);
                if (a3d != null) {
                    C345657ts r3 = a3d.A00;
                    List list = r3.A0B.A00;
                    int size = list.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        ((C341027mD) list.get(i11)).DVh(i9, i10, 0, 0, r3.A03);
                    }
                }
            }
        }
    }

    public static boolean A03(C39904AIm aIm) {
        return AnonymousClass7TF.A1W(aIm.A06.getLooper(), Looper.myLooper());
    }

    public C39904AIm(Handler handler, C343837qt r3, C344407ro r4, boolean z) {
        this.A0A = r3;
        this.A06 = handler;
        this.A0B = r4;
        this.A05 = z;
    }

    public static void A02(C39904AIm aIm, A3G a3g, Set set, boolean z) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            int i = aIm.A01;
            int i2 = aIm.A00;
            Integer valueOf = Integer.valueOf(i);
            C40139ATf aTf = new C40139ATf(aIm.A0B, Integer.valueOf(i2), 0, valueOf, 5);
            aIm.A02.BQ8().A8c(aTf, intValue);
            SparseArray sparseArray = aIm.A09;
            sparseArray.put(intValue, aTf);
            C40139ATf aTf2 = (C40139ATf) sparseArray.get(intValue);
            aTf2.getClass();
            C40144ATk aTk = new C40144ATk(aIm, a3g, num);
            if (aTf2.A09 == null) {
                aTk.DCn(AnonymousClass7TE.A0z("GlContext is null during takePhoto()"));
            } else {
                aTf2.A00.A00.post(new C40955Am1(aTk, aTf2));
            }
        }
        if (z) {
            aIm.A02.EEt((Long) null);
        }
    }

    public final void A04(A3G a3g, boolean z) {
        HashSet A1F = AnonymousClass7TE.A1F();
        AnonymousClass7TF.A1M(A1F, 0);
        if (A03(this)) {
            A02(this, a3g, A1F, z);
        } else {
            this.A06.post(new C41194Aps(this, a3g, A1F, z));
        }
    }
}
