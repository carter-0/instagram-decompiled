package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.MgL  reason: case insensitive filesystem */
public final class C66987MgL {
    public static int A02;
    public final int A00;
    public final C74365Ptf A01;

    private final boolean A00(Object obj) {
        int i;
        if (!(obj == null || (i = this.A00) == -1 || !((C66967Mg0) obj).A0F)) {
            int i2 = A02;
            if (i2 >= i) {
                return false;
            }
            A02 = i2 + 1;
        }
        return true;
    }

    public final List A01() {
        Object obj;
        ArrayList arrayList = new ArrayList();
        C14198Trd B1u = this.A01.B1u();
        A02 = 0;
        List list = B1u.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            Object obj3 = B1u.A01.get(i);
            if (!(obj2 instanceof C232262tL)) {
                if (obj2 instanceof C66632Ma1) {
                    if (A00(obj3) && obj3 != null) {
                        obj2 = new C66974Mg7((C66967Mg0) obj3, (C66632Ma1) obj2);
                        arrayList.add(obj2);
                    }
                } else if (obj2 instanceof C69160Nfj) {
                    if (A00(obj3) && obj3 != null) {
                        obj2 = new C69169Nfs((C69160Nfj) obj2, (C66967Mg0) obj3);
                        arrayList.add(obj2);
                    }
                } else if (obj2 instanceof C69158Nfh) {
                    if (A00(obj3) && obj3 != null) {
                        obj2 = new C69172Nfv((C69158Nfh) obj2, (C66967Mg0) obj3);
                        arrayList.add(obj2);
                    }
                } else if (obj2 instanceof C67387Mn4) {
                    if (A00(obj3) && obj3 != null) {
                        obj2 = new C67441Mnw((C67387Mn4) obj2, (C66967Mg0) obj3);
                        arrayList.add(obj2);
                    }
                } else if (obj2 instanceof C69159Nfi) {
                    C69159Nfi nfi = (C69159Nfi) obj2;
                    if (!(nfi.A06() == null || !A00(obj3) || obj3 == null)) {
                        obj2 = new C69168Nfr(nfi, (C66967Mg0) obj3);
                        arrayList.add(obj2);
                    }
                } else if (!C61069Jw7.A00(3, obj2)) {
                    if (obj2 instanceof N3M) {
                        obj = new C69166Nfp((N3M) obj2);
                    } else if (obj2 instanceof C70329O2h) {
                        obj2 = new C69164Nfn();
                    } else if (obj2 instanceof C46568DhA) {
                        obj = new C46565Dh7((C46568DhA) obj2);
                    } else {
                        if ((obj2 instanceof C69156Nff) && A00(obj3) && obj3 != null) {
                            obj2 = new C69170Nft((C69156Nff) obj2, (C66967Mg0) obj3);
                            arrayList.add(obj2);
                        }
                    }
                    obj2 = obj;
                    arrayList.add(obj2);
                } else if (obj3 != null) {
                    obj2 = new C67443Mny((C61069Jw7) obj2, (C70327O2f) obj3);
                    arrayList.add(obj2);
                }
            }
            if (obj2 == null) {
            }
            arrayList.add(obj2);
        }
        return 00k.A0a(arrayList);
    }

    public C66987MgL(C74365Ptf ptf, int i) {
        this.A01 = ptf;
        this.A00 = i;
    }
}
