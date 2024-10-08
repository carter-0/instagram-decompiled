package X;

import com.instagram.common.typedurl.ImageCacheKey;
import com.instagram.common.uigraph.UiGraph;
import java.util.Iterator;
import java.util.Map;

public final class INR implements C64421Ml {
    public final Map A00 = AnonymousClass7TE.A1H();
    public final UiGraph A01;

    public INR(UiGraph uiGraph) {
        0qQ.A0B(uiGraph, 1);
        this.A01 = uiGraph;
    }

    public final void A7b(AnonymousClass2iL r3) {
        0qQ.A0B(r3, 0);
        this.A00.put(((ImageCacheKey) r3.A0L.AjH()).A03, r3);
    }

    public final void AHN(C55468HiC hiC) {
        Map map = this.A00;
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            hiC.A00.A0O.remove(((ImageCacheKey) ((AnonymousClass2iL) C51971G9r.A0p(A0u)).A0L.AjH()).A03);
        }
        map.clear();
    }

    public final AnonymousClass2iL BDS() {
        String str;
        UiGraph uiGraph = this.A01;
        AnonymousClass34Q r2 = new AnonymousClass34Q((AnonymousClass34N) null, (AnonymousClass34P) null);
        J6I j6i = new J6I(this, 25);
        String str2 = 1Rm.A00().A00;
        0qQ.A07(str2);
        AnonymousClass46R A02 = uiGraph.A02(r2, str2, j6i);
        boolean z = true;
        if (A02 == null || !A02.hasNext()) {
            z = false;
        }
        Object obj = null;
        if (z) {
            Map map = this.A00;
            C226952iF r0 = ((1yX) AnonymousClass46R.A00(A02, false).A00).A01.A00;
            if (r0 != null) {
                str = r0.AjI();
            } else {
                str = null;
            }
            AnonymousClass2iL r02 = (AnonymousClass2iL) map.get(str);
            if (r02 != null) {
                return r02;
            }
            Iterator A0v = AnonymousClass7TF.A0v(map);
            if (A0v.hasNext()) {
                obj = A0v.next();
                if (A0v.hasNext()) {
                    int A0C = ((AnonymousClass2iL) obj).A0C();
                    do {
                        Object next = A0v.next();
                        int A0C2 = ((AnonymousClass2iL) next).A0C();
                        if (A0C < A0C2) {
                            obj = next;
                            A0C = A0C2;
                        }
                    } while (A0v.hasNext());
                }
            }
        } else {
            Iterator A0v2 = AnonymousClass7TF.A0v(this.A00);
            if (A0v2.hasNext()) {
                obj = A0v2.next();
                if (A0v2.hasNext()) {
                    int A0C3 = ((AnonymousClass2iL) obj).A0C();
                    do {
                        Object next2 = A0v2.next();
                        int A0C4 = ((AnonymousClass2iL) next2).A0C();
                        if (A0C3 < A0C4) {
                            obj = next2;
                            A0C3 = A0C4;
                        }
                    } while (A0v2.hasNext());
                }
            }
        }
        return (AnonymousClass2iL) obj;
    }

    public final boolean ED5(AnonymousClass2iL r3) {
        return AnonymousClass7TF.A1V(this.A00.remove(((ImageCacheKey) r3.A0L.AjH()).A03));
    }

    public final void FHb(C64421Ml r3) {
        Map map = this.A00;
        if (!map.isEmpty()) {
            Iterator A0v = AnonymousClass7TF.A0v(map);
            while (A0v.hasNext()) {
                r3.A7b((AnonymousClass2iL) A0v.next());
            }
        }
    }

    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }
}
