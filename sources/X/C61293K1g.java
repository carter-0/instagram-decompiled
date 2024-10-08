package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.K1g  reason: case insensitive filesystem */
public final class C61293K1g extends 1XP implements C336537em {
    public CU3 A00;
    public C62941Kot A01;

    public final Object B3J() {
        return null;
    }

    public final String BjE() {
        return null;
    }

    public final Integer BlQ() {
        return null;
    }

    public final String BnF() {
        return null;
    }

    public final List Bqo() {
        return null;
    }

    public final boolean CKA() {
        return false;
    }

    public final String getNextMaxId() {
        return null;
    }

    public final List getItems() {
        C318046oG r1;
        List<C317876nz> list;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (C317876nz r12 : this.A01.A00()) {
            0qQ.A0B(r12, 1);
            A1C.add(new C317456nI(r12));
        }
        List list2 = this.A01.A01;
        if (list2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                C317966o8 A0a = JTO.A0a(it);
                String str = A0a.A0a;
                A0a.A0S = str;
                C317876nz r0 = C317876nz.A1e;
                List singletonList = Collections.singletonList(A0a);
                if (A0a.A0S.startsWith("cutout_video_")) {
                    r1 = C318046oG.CUTOUT_VIDEO;
                } else {
                    r1 = C318046oG.CUTOUT_PHOTO;
                }
                A1C2.add(new C317876nz(r1, str, singletonList));
            }
            list = A1C2;
        }
        for (C317876nz r13 : list) {
            A1C.add(new C317456nI(r13));
        }
        A1C.addAll((Collection) C63281KuQ.A00(JTR.A16(this.A01.A05)).first);
        A1C.addAll((Collection) C63281KuQ.A00(JTR.A16(this.A01.A04)).first);
        return A1C;
    }
}
