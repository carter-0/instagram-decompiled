package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.GraphGuardianContent;
import com.instagram.api.schemas.ImmutablePandoGraphGuardianContent;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CMa extends 17P implements C335587dC {
    public C337317g7 A00;
    public C270844hO A01;
    public List A02;
    public 1Xj A03;
    public User A04;
    public List A05;
    public List A06;
    public List A07;
    public List A08;

    public final void A0q(1E9 r6) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList A0p;
        ArrayList arrayList3;
        User user;
        ArrayList arrayList4;
        C337317g7 r0 = this.A00;
        if (r0 == null) {
            r0 = (C337317g7) A05(-323028952, CI7.class);
        }
        C270844hO r4 = null;
        if (r0 != null) {
            r0.E74(r6);
        } else {
            r0 = null;
        }
        this.A00 = r0;
        List<G90> BAC = BAC();
        if (BAC != null) {
            arrayList = AnonymousClass7TF.A0p(BAC);
            for (G90 g90 : BAC) {
                g90.E8C(r6);
                arrayList.add(g90);
            }
        } else {
            arrayList = null;
        }
        this.A05 = arrayList;
        this.A03 = C41847B3o.A0u(r6, this, 1939536937);
        Class<ImmutablePandoUserDict> cls = ImmutablePandoUserDict.class;
        ImmutableList A082 = A08(1647260332, cls);
        if (A082 != null) {
            arrayList2 = AnonymousClass7TF.A0p(A082);
            Iterator it = A082.iterator();
            while (it.hasNext()) {
                C41847B3o.A1P(r6, arrayList2, it);
            }
        } else {
            arrayList2 = null;
        }
        this.A06 = arrayList2;
        List<C46228DRj> list = this.A02;
        if (list == null && (list = A08(947936814, CKE.class)) == null) {
            A0p = null;
        } else {
            A0p = AnonymousClass7TF.A0p(list);
            for (C46228DRj dRj : list) {
                dRj.E7Q(r6);
                A0p.add(dRj);
            }
        }
        this.A02 = A0p;
        ImmutableList A083 = A08(-1612548628, cls);
        if (A083 != null) {
            arrayList3 = AnonymousClass7TF.A0p(A083);
            Iterator it2 = A083.iterator();
            while (it2.hasNext()) {
                C41847B3o.A1P(r6, arrayList3, it2);
            }
        } else {
            arrayList3 = null;
        }
        this.A07 = arrayList3;
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) A07(cls);
        if (immutablePandoUserDict != null) {
            user = C41845B3m.A0b(r6, immutablePandoUserDict);
        } else {
            user = null;
        }
        this.A04 = user;
        C270844hO r02 = this.A01;
        if (!(r02 == null && (r02 = (C270844hO) A05(1934820225, C44026CRj.class)) == null)) {
            r02.E9y(r6);
            r4 = r02;
        }
        this.A01 = r4;
        ImmutableList A084 = A08(111578632, cls);
        if (A084 != null) {
            arrayList4 = AnonymousClass7TF.A0p(A084);
            Iterator it3 = A084.iterator();
            while (it3.hasNext()) {
                C41847B3o.A1P(r6, arrayList4, it3);
            }
        } else {
            arrayList4 = null;
        }
        this.A08 = arrayList4;
    }

    public final List Amb() {
        return A08(1666777871, HCW.class);
    }

    public final C337297g5 B8B() {
        return (C337297g5) A05(-1813145531, CKA.class);
    }

    public final List BAC() {
        List list = this.A05;
        if (list == null) {
            return A08(-1237460524, COM.class);
        }
        return list;
    }

    public final List Bey() {
        return A08(1123011774, CQF.class);
    }

    public final GraphGuardianContent By9() {
        return (GraphGuardianContent) A05(-1225322343, ImmutablePandoGraphGuardianContent.class);
    }

    public final List C2q() {
        return this.A07;
    }

    public final C337337gB CCs() {
        return (C337337gB) A05(1420423129, CQh.class);
    }

    public final List CD6() {
        return this.A08;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CMa] */
    public final Boolean Ae2() {
        return getOptionalBooleanValueByHashCode(-592063754);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CMa] */
    public final Boolean BAl() {
        return getOptionalBooleanValueByHashCode(-1571575418);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CMa] */
    public final boolean BBY() {
        return getBooleanValueByHashCode(140636634);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CMa] */
    public final Integer BCY() {
        return getOptionalIntValueByHashCode(1809213148);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CMa] */
    public final Boolean BUA() {
        return getOptionalBooleanValueByHashCode(1361887688);
    }

    public final String BaL() {
        return A0i(1630607433);
    }

    public final String BjE() {
        return A0i(1582405670);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CMa] */
    public final Boolean BuD() {
        return getOptionalBooleanValueByHashCode(-525352034);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CMa] */
    public final Integer C4K() {
        return getOptionalIntValueByHashCode(169889308);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CMa] */
    public final Integer C4L() {
        return getOptionalIntValueByHashCode(-1960232141);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CMa] */
    public final Integer C8s() {
        return getOptionalIntValueByHashCode(-253163307);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CMa] */
    public final Boolean CCT() {
        return getOptionalBooleanValueByHashCode(1419958838);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CMa] */
    public final Boolean CaR() {
        return getOptionalBooleanValueByHashCode(-1416067627);
    }

    public final String getNextMaxId() {
        return A0i(1314516130);
    }
}
