package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ContextualLinkCtaType;
import java.util.ArrayList;
import java.util.List;

public final class CJJ extends 17P implements C46306DUj {
    public C67161s9 A00;
    public List A01;

    public final AnonymousClass1s2 AqV() {
        return (AnonymousClass1s2) A05(835063916, B60.class);
    }

    public final ContextualLinkCtaType ArC() {
        return (ContextualLinkCtaType) A0M(1025591537, DKR.A00);
    }

    public final C67161s9 BP1() {
        C67161s9 r0 = this.A00;
        if (r0 == null) {
            return (C67161s9) A05(-1255143223, B63.class);
        }
        return r0;
    }

    public final List Bhr() {
        List list = this.A01;
        if (list == null) {
            return A08(821870812, CPQ.class);
        }
        return list;
    }

    public final List BoE() {
        return A08(452501036, C389439pc.class);
    }

    public final C270564gw C4a() {
        return (C270564gw) A05(-180351661, CR1.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CJJ, X.DUj] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CWN.A00(this));
    }

    public final C46306DUj E7F(1E9 r4) {
        C67161s9 BP1 = BP1();
        ArrayList arrayList = null;
        if (BP1 != null) {
            BP1.E9a(r4);
        } else {
            BP1 = null;
        }
        this.A00 = BP1;
        List<AnonymousClass5B2> Bhr = Bhr();
        if (Bhr != null) {
            arrayList = AnonymousClass7TG.A0r(Bhr);
            for (AnonymousClass5B2 r0 : Bhr) {
                r0.E8u(r4);
                arrayList.add(r0);
            }
        }
        this.A01 = arrayList;
        return this;
    }

    public final BER F28(1E9 r9) {
        1s1 r3;
        1s8 r4;
        ArrayList arrayList;
        ArrayList arrayList2;
        AnonymousClass1s2 AqV = AqV();
        C279584ys r5 = null;
        if (AqV != null) {
            r3 = AqV.FDf();
        } else {
            r3 = null;
        }
        ContextualLinkCtaType ArC = ArC();
        C67161s9 BP1 = BP1();
        if (BP1 != null) {
            r4 = BP1.FDh(r9);
        } else {
            r4 = null;
        }
        List<AnonymousClass5B2> Bhr = Bhr();
        if (Bhr != null) {
            arrayList = AnonymousClass7TF.A0p(Bhr);
            for (AnonymousClass5B2 FAt : Bhr) {
                arrayList.add(FAt.FAt(r9));
            }
        } else {
            arrayList = null;
        }
        List<C248923io> BoE = BoE();
        if (BoE != null) {
            arrayList2 = AnonymousClass7TF.A0p(BoE);
            for (C248923io FDp : BoE) {
                arrayList2.add(FDp.FDp());
            }
        } else {
            arrayList2 = null;
        }
        C270564gw C4a = C4a();
        if (C4a != null) {
            r5 = C4a.FDm();
        }
        return new BER(ArC, r3, r4, r5, arrayList, arrayList2);
    }

    public final BER F29(1E6 r2) {
        return F28(C41846B3n.A0S(r2));
    }
}
