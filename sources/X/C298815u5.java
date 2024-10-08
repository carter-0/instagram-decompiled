package X;

import com.instagram.api.schemas.ClipsSpecialResponseType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5u5  reason: invalid class name and case insensitive filesystem */
public class C298815u5 extends C298825u6 implements C298835u7, AnonymousClass1XV {
    public ClipsSpecialResponseType A00;
    public Integer A01;

    public final boolean Cdj() {
        Boolean bool = true;
        return bool.equals(this.A03);
    }

    public final void A00() {
        List list = this.A09;
        String str = this.A04;
        List list2 = this.A0A;
        0qQ.A0A(list2);
        List list3 = this.A0B;
        HashMap hashMap = this.A08;
        C276104sZ r1 = this.A02;
        0qQ.A0A(r1);
        this.A01 = new C293575l0(r1, this.A03, str, this.A06, hashMap, list, list2, list3);
    }

    public final List Ahh() {
        return 0sn.A00;
    }

    public final HashMap Ahj() {
        return this.A08;
    }

    public final List Ao1() {
        List<BE8> list = this.A0B;
        if (list == null) {
            return 0sn.A00;
        }
        ArrayList arrayList = new ArrayList();
        for (BE8 A03 : list) {
            C267324bN A032 = C295325ny.A03(A03);
            if (A032 != null) {
                arrayList.add(A032);
            }
        }
        return arrayList;
    }

    public final List Ao2() {
        List list = this.A0B;
        if (list == null) {
            return 0sn.A00;
        }
        return list;
    }

    public List Ao4() {
        if (!this.A0A.isEmpty()) {
            List<C276014sL> list = this.A0A;
            ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
            for (C276014sL A02 : list) {
                arrayList.add(C295325ny.A02(A02));
            }
            return arrayList;
        }
        List<C276014sL> list2 = this.A09;
        if (list2 == null) {
            return 0sn.A00;
        }
        ArrayList arrayList2 = new ArrayList(0Yv.A1E(list2, 10));
        for (C276014sL A022 : list2) {
            arrayList2.add(C295325ny.A02(A022));
        }
        return arrayList2;
    }

    public final String BaG() {
        return this.A06;
    }

    public C276114sa BaP() {
        return this.A02;
    }

    public final String Bnn() {
        return this.A04;
    }

    public String getNextMaxId() {
        return this.A02.A00;
    }

    public boolean CP6() {
        if (CPJ() || this.A02.A01) {
            return true;
        }
        return false;
    }

    public final boolean CPJ() {
        1Xj r0;
        if (0qQ.A0K(getNextMaxId(), "0") || ((!this.A0A.isEmpty()) && (r0 = ((C267324bN) Ao4().get(0)).A02) != null && r0.A0C.BsQ() != null)) {
            return true;
        }
        return false;
    }
}
