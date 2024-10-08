package X;

import android.graphics.Bitmap;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.nio.FloatBuffer;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.pytorch.IValue;
import org.pytorch.Tensor;

/* renamed from: X.ATz  reason: case insensitive filesystem */
public final class C40159ATz implements C353718Iu {
    public final List A00 = AnonymousClass7TE.A1C();
    public final List A01 = AnonymousClass7TE.A1C();
    public final C353738Iw A02;
    public final C353698Is A03;
    public final A7P A04;
    public final AnonymousClass84N A05;

    public static C392209uO A01(AbstractList abstractList, AbstractList abstractList2, int i) {
        return (C392209uO) abstractList2.get(((Number) abstractList.get(i)).intValue() - 1);
    }

    /* JADX WARNING: type inference failed for: r0v61, types: [X.9uO, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v120, types: [X.9uO, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v136, types: [X.9uO, java.lang.Object] */
    public final List Awo(AE1 ae1, C353668Ip r30, String str) {
        Object A0K;
        2HY r4;
        List<C392209uO> list;
        int i;
        ArrayList A1C = AnonymousClass7TE.A1C();
        String str2 = str;
        C39748A7o A002 = r30.A00(str2);
        if (A002 != null) {
            List list2 = A002.A05;
            ArrayList A0p = AnonymousClass7TF.A0p(list2);
            Iterator it = list2.iterator();
            int i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        break;
                    }
                    ((Number) next).longValue();
                    AnonymousClass7TF.A1M(A0p, i2);
                    i2 = i3;
                } else {
                    if (A0p.isEmpty()) {
                        r4 = new 2HY(0, 0);
                    } else {
                        int size = A0p.size();
                        int A0M = AnonymousClass7TE.A0M(00k.A0I(A0p));
                        if (size == 1) {
                            A0K = 00k.A0I(A0p);
                        } else {
                            A0K = 00k.A0K(A0p);
                        }
                        r4 = new 2HY(A0M, AnonymousClass7TE.A0M(A0K));
                    }
                    AE1 ae12 = ae1;
                    for (C390729rk r17 : ae12.A03) {
                        List list3 = A002.A04;
                        ArrayList A1C2 = AnonymousClass7TE.A1C();
                        int i4 = 0;
                        for (Object next2 : list3) {
                            int i5 = i4 + 1;
                            if (i4 >= 0) {
                                ((Number) next2).floatValue();
                                int i6 = r4.A00;
                                if (i4 <= r4.A01 && i6 <= i4) {
                                    A1C2.add(next2);
                                }
                                i4 = i5;
                            }
                        }
                        int ordinal = r17.ordinal();
                        if (ordinal == 0) {
                            List A0d = 00k.A0d(A1C2, ae12.A01);
                            int size2 = A0d.size();
                            for (int i7 = 0; i7 < size2; i7++) {
                                if (i7 < A002.A05.size()) {
                                    A1C.add(new C39796A9r(r17, str2, AnonymousClass7TG.A00(A0d, i7), i7, (int) AnonymousClass7TE.A0P(AnonymousClass7TE.A0R(A002.A05.get(i7))), ae12.A00));
                                }
                            }
                        } else if (ordinal == 1) {
                            Iterator it2 = C393129vw.A00(A1C2).iterator();
                            while (it2.hasNext()) {
                                int A0F = AnonymousClass7TG.A0F(it2);
                                int A0P = (int) AnonymousClass7TE.A0P(AnonymousClass7TE.A0R(A002.A05.get(A0F)));
                                int i8 = ae12.A00;
                                A1C.add(new C39796A9r(r17, str2, AnonymousClass7TG.A00(A002.A04, A0F), A0F, Math.max(0, A0P - (i8 / 2)), i8));
                            }
                        } else if (ordinal == 2) {
                            ArrayList A003 = C393129vw.A00(A1C2);
                            List list4 = A002.A04;
                            if (A003.isEmpty()) {
                                ? obj = new Object();
                                obj.A02 = 0;
                                obj.A00 = 5;
                                obj.A01 = 0;
                                list = AnonymousClass7TE.A1I(obj);
                            } else {
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                ArrayList A1C3 = AnonymousClass7TE.A1C();
                                Iterator it3 = A003.iterator();
                                int i9 = 0;
                                while (it3.hasNext()) {
                                    int A0F2 = AnonymousClass7TG.A0F(it3);
                                    Integer valueOf = Integer.valueOf(A0F2);
                                    if (!linkedHashSet.contains(valueOf)) {
                                        linkedHashSet.add(valueOf);
                                        float A004 = AnonymousClass7TG.A00(list4, A0F2);
                                        int max = Math.max(A0F2 - 1, 0);
                                        while (max >= 0 && !linkedHashSet.contains(Integer.valueOf(max)) && AnonymousClass7TG.A00(list4, max) > A004 * 0.85f) {
                                            linkedHashSet.add(Integer.valueOf(max));
                                            max--;
                                        }
                                        int min = Math.min(max + 1, A0F2);
                                        int min2 = Math.min(A0F2 + 1, list4.size() - 1);
                                        while (min2 <= list4.size() - 1 && !linkedHashSet.contains(Integer.valueOf(min2)) && AnonymousClass7TG.A00(list4, min2) > A004 * 0.85f) {
                                            linkedHashSet.add(Integer.valueOf(min2));
                                            min2++;
                                        }
                                        int max2 = Math.max(min2 - 1, A0F2);
                                        i9 = (max2 - min) + 1;
                                        ? obj2 = new Object();
                                        obj2.A02 = min;
                                        obj2.A00 = max2;
                                        obj2.A01 = A0F2;
                                        A1C3.add(obj2);
                                    }
                                }
                                if (i9 * IgNetworkConsentStorage.MAX_ENTRIES <= 3000) {
                                    ArrayList A0p2 = AnonymousClass7TF.A0p(A1C3);
                                    Iterator it4 = A1C3.iterator();
                                    while (it4.hasNext()) {
                                        C392209uO r6 = (C392209uO) it4.next();
                                        AnonymousClass7TF.A1I(Integer.valueOf(r6.A02 - 1), r6, A0p2);
                                    }
                                    ArrayList A1C4 = AnonymousClass7TE.A1C();
                                    Iterator it5 = A0p2.iterator();
                                    while (true) {
                                        i = 0;
                                        if (!it5.hasNext()) {
                                            break;
                                        }
                                        Object next3 = it5.next();
                                        if (AnonymousClass7TE.A0M(((0eP) next3).A00) >= 0) {
                                            A1C4.add(next3);
                                        }
                                    }
                                    ArrayList A0U = 00k.A0U(A1C4);
                                    ArrayList A0p3 = AnonymousClass7TF.A0p(A1C3);
                                    Iterator it6 = A1C3.iterator();
                                    while (it6.hasNext()) {
                                        C392209uO r7 = (C392209uO) it6.next();
                                        AnonymousClass7TF.A1I(Integer.valueOf(r7.A00 + 1), r7, A0p3);
                                    }
                                    ArrayList A1C5 = AnonymousClass7TE.A1C();
                                    for (Object next4 : A0p3) {
                                        if (AnonymousClass7TE.A0M(((0eP) next4).A00) < list4.size()) {
                                            A1C5.add(next4);
                                        }
                                    }
                                    ArrayList A0U2 = 00k.A0U(A1C5);
                                    00k.A0g(A0U, new ArV((Object) list4, 0));
                                    00k.A0g(A0U2, new ArV((Object) list4, 1));
                                    int i10 = 0;
                                    while (i < A0U.size() && i10 < A0U2.size() && i9 * IgNetworkConsentStorage.MAX_ENTRIES <= 3000) {
                                        if (A00(A0U, i) >= A00(A0U2, i10)) {
                                            ((C392209uO) ((0eP) A0U.get(i)).A01).A02 = A00(A0U, i);
                                            i++;
                                        } else {
                                            ((C392209uO) ((0eP) A0U2.get(i10)).A01).A00 = A00(A0U2, i10);
                                            i10++;
                                        }
                                        i9++;
                                    }
                                    while (i < A0U.size() && i9 * IgNetworkConsentStorage.MAX_ENTRIES <= 3000) {
                                        ((C392209uO) ((0eP) A0U.get(i)).A01).A02 = A00(A0U, i);
                                        i++;
                                        i9++;
                                    }
                                    while (i10 < A0U2.size() && i9 * IgNetworkConsentStorage.MAX_ENTRIES <= 3000) {
                                        ((C392209uO) ((0eP) A0U2.get(i10)).A01).A02 = A00(A0U2, i10);
                                        i10++;
                                        i9++;
                                    }
                                }
                                int size3 = A1C3.size();
                                ArrayList arrayList = new ArrayList(size3);
                                for (int i11 = 0; i11 < size3; i11++) {
                                    AnonymousClass7TF.A1M(arrayList, -1);
                                }
                                int size4 = A1C3.size();
                                int i12 = 0;
                                int i13 = 1;
                                while (i12 < size4) {
                                    arrayList.set(i12, Integer.valueOf(i13));
                                    int i14 = i12 + 1;
                                    if (i14 < A1C3.size() && ((C392209uO) A1C3.get(i14)).A02 - ((C392209uO) A1C3.get(i12)).A00 > 2) {
                                        i13++;
                                    }
                                    i12 = i14;
                                }
                                if (i13 == A1C3.size()) {
                                    list = A1C3;
                                } else {
                                    ArrayList arrayList2 = new ArrayList(i13);
                                    for (int i15 = 0; i15 < i13; i15++) {
                                        ? obj3 = new Object();
                                        obj3.A02 = list4.size() - 1;
                                        obj3.A00 = 0;
                                        obj3.A01 = list4.size() - 1;
                                        arrayList2.add(obj3);
                                    }
                                    int size5 = arrayList.size();
                                    for (int i16 = 0; i16 < size5; i16++) {
                                        A01(arrayList, arrayList2, i16).A02 = Math.min(A01(arrayList, arrayList2, i16).A02, ((C392209uO) A1C3.get(i16)).A02);
                                        A01(arrayList, arrayList2, i16).A00 = Math.max(A01(arrayList, arrayList2, i16).A00, ((C392209uO) A1C3.get(i16)).A00);
                                        A01(arrayList, arrayList2, i16).A01 = Math.min(A01(arrayList, arrayList2, i16).A01, ((C392209uO) A1C3.get(i16)).A01);
                                    }
                                    list = arrayList2;
                                }
                            }
                            for (C392209uO r9 : list) {
                                int i17 = r9.A02;
                                int i18 = i17 * IgNetworkConsentStorage.MAX_ENTRIES;
                                int i19 = r9.A00 - i17;
                                int i20 = 2500;
                                if (i19 != 0) {
                                    i20 = i19 * IgNetworkConsentStorage.MAX_ENTRIES;
                                }
                                int i21 = r9.A01;
                                A1C.add(new C39796A9r(r17, str2, AnonymousClass7TG.A00(A002.A04, i21), i21, i18, i20));
                            }
                        } else {
                            throw AnonymousClass7TE.A1K();
                        }
                    }
                }
            }
            0sr.A1T();
            throw AnonymousClass00P.createAndThrow();
        }
        if (A1C.isEmpty()) {
            return A1C;
        }
        if (A1C.size() > 1) {
            01V.A1D(A1C, new C41283ArO(0));
        }
        return 00k.A0g(00k.A0U(00k.A0d(A1C, Math.min(1, A1C.size()))), new C41283ArO(1));
    }

    public final void CyD(long j, int i, Bitmap bitmap) {
        0qQ.A0B(bitmap, 0);
        if (i == 0) {
            this.A00.clear();
            this.A01.clear();
        }
        C353738Iw r1 = this.A02;
        r1.A01 = new C40154ATu(this, i, j);
        r1.A00(bitmap);
    }

    public final void DxQ(C353668Ip r14, String str, boolean z, boolean z2) {
        Tensor tensor;
        List<Object> list = this.A00;
        if (AnonymousClass7TE.A1b(list)) {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (Object obj : list) {
                    if (obj == null) {
                        return;
                    }
                }
            }
            A7P a7p = this.A04;
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0r.add(((C39707A5y) it.next()).A02);
            }
            a7p.A00 = new C382389dc(A0r);
            a7p.A01 = new C40155ATv(this, r14, str);
            String str2 = a7p.A02;
            float[] fArr = null;
            if (AnonymousClass7TF.A1V(str2)) {
                C348037xm r6 = a7p.A03;
                if (r6 == null) {
                    r6 = C347997xi.A00(str2);
                    a7p.A03 = r6;
                }
                C370308wB r1 = a7p.A00;
                if ((r1 instanceof C382389dc) && r6 != null) {
                    0qQ.A0C(r1, "null cannot be cast to non-null type com.facebook.onecamera.components.ml.intf.MlInputFloatArrays");
                    List list2 = ((C382389dc) r1).A00;
                    0qQ.A0B(list2, 0);
                    int size = list2.size();
                    int length = ((float[]) list2.get(0)).length;
                    FloatBuffer allocateFloatBuffer = Tensor.allocateFloatBuffer(size * length);
                    for (int i = 0; i < size; i++) {
                        for (int i2 = 0; i2 < length; i2++) {
                            allocateFloatBuffer.put((i * length) + i2, ((float[]) list2.get(i))[i2]);
                        }
                    }
                    IValue forward = r6.A00.forward(IValue.from(Tensor.fromBlob(allocateFloatBuffer, new long[]{1, (long) size, (long) length}, XF6.CONTIGUOUS)));
                    if (!(forward == null || (tensor = forward.toTensor()) == null)) {
                        fArr = tensor.getDataAsFloatArray();
                    }
                } else {
                    return;
                }
            }
            C370288w9 r0 = a7p.A01;
            if (r0 != null) {
                r0.DYh(fArr);
            }
        }
    }

    public final void D8U() {
        this.A00.clear();
    }

    public C40159ATz(C353698Is r4, AnonymousClass84N r5) {
        this.A05 = r5;
        this.A03 = r4;
        this.A02 = new C353738Iw(r4, 0sr.A1P(new C353728Iv[]{C353728Iv.CONCEPT_SCORES, C353728Iv.AESTHETICS_SCORES, C353728Iv.EMBEDDINGS}));
        this.A04 = new A7P(r5);
    }

    public static int A00(AbstractList abstractList, int i) {
        return ((Number) ((0eP) abstractList.get(i)).A00).intValue();
    }
}
