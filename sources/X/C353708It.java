package X;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.8It  reason: invalid class name and case insensitive filesystem */
public final class C353708It implements C353718Iu {
    public C353758Iy A00;
    public final List A01;
    public final C353738Iw A02;
    public final C353698Is A03;

    public final List Awo(AE1 ae1, C353668Ip r22, String str) {
        ArrayList arrayList = new ArrayList();
        String str2 = str;
        C39748A7o A002 = r22.A00(str2);
        if (A002 != null) {
            AE1 ae12 = ae1;
            for (C390729rk r14 : ae12.A03) {
                ArrayList arrayList2 = new ArrayList();
                int size = A002.A02.size() - 1;
                for (int i = 0; i < size; i++) {
                    int i2 = i;
                    arrayList2.add(new C39796A9r(r14, str2, ((Number) A002.A04.get(i)).floatValue(), i2, (int) (((Number) A002.A05.get(i)).longValue() / 1000), ae12.A00));
                }
                if (arrayList2.size() > 1) {
                    01V.A1D(arrayList2, new C41276ArH());
                }
                if (r14 == C390729rk.VIDEO_SEGMENTS_USER_DEFINED) {
                    ArrayList arrayList3 = new ArrayList();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    int size2 = arrayList2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        if (!linkedHashSet.contains(Integer.valueOf(((C39796A9r) arrayList2.get(i3)).A02))) {
                            arrayList3.add(arrayList2.get(i3));
                            linkedHashSet.add(Integer.valueOf(((C39796A9r) arrayList2.get(i3)).A02 - 1));
                            linkedHashSet.add(Integer.valueOf(((C39796A9r) arrayList2.get(i3)).A02 + 1));
                        }
                    }
                    arrayList2 = arrayList3;
                }
                ArrayList A0U = 00k.A0U(00k.A0d(arrayList2, Math.min(1, arrayList2.size())));
                if (A0U.size() > 1) {
                    01V.A1D(A0U, new C41275ArG());
                }
                arrayList.addAll(A0U);
            }
        }
        return arrayList;
    }

    public final void CyD(long j, int i, Bitmap bitmap) {
        0qQ.A0B(bitmap, 0);
        if (i == 0) {
            List list = this.A01;
            synchronized (list) {
                list.clear();
            }
        }
        C353738Iw r1 = this.A02;
        r1.A01 = new C40156ATw(this, i, j);
        r1.A00(bitmap);
    }

    public final void D8U() {
        C353738Iw r1 = this.A02;
        r1.A01 = null;
        r1.A00 = null;
        r1.A02 = null;
    }

    public final void DxQ(C353668Ip r8, String str, boolean z, boolean z2) {
        List<C392219uP> list = this.A01;
        synchronized (list) {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    if (it.hasNext()) {
                        float f = ((C392219uP) next).A00;
                        do {
                            Object next2 = it.next();
                            float f2 = ((C392219uP) next2).A00;
                            if (Float.compare(f, f2) < 0) {
                                next = next2;
                                f = f2;
                            }
                        } while (it.hasNext());
                    }
                    C39748A7o a7o = new C39748A7o();
                    a7o.A01 = str;
                    a7o.A00 = (int) (((C392219uP) next).A02 / 1000);
                    ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
                    for (C392219uP r0 : list) {
                        arrayList.add(Integer.valueOf(r0.A01));
                    }
                    a7o.A02 = arrayList;
                    ArrayList arrayList2 = new ArrayList(0Yv.A1E(list, 10));
                    for (C392219uP r02 : list) {
                        arrayList2.add(Long.valueOf(r02.A02));
                    }
                    a7o.A05 = arrayList2;
                    ArrayList arrayList3 = new ArrayList(0Yv.A1E(list, 10));
                    for (C392219uP r03 : list) {
                        arrayList3.add(Float.valueOf(r03.A00));
                    }
                    a7o.A04 = arrayList3;
                    r8.A01(a7o);
                    list.clear();
                } else {
                    throw new NoSuchElementException();
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.8Iy] */
    public C353708It(C353698Is r6) {
        this.A03 = r6;
        this.A02 = new C353738Iw(r6, 0sr.A1P(new C353728Iv[]{C353728Iv.CONCEPT_SCORES, C353728Iv.AESTHETICS_SCORES, C353728Iv.EMBEDDINGS}));
        ? obj = new Object();
        obj.A00 = new ArrayList();
        int i = 0;
        do {
            obj.A00.add(Float.valueOf(0.0f));
            i++;
        } while (i < 128);
        this.A00 = obj;
        this.A01 = new ArrayList();
    }
}
