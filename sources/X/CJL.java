package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.CreateModeType;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CJL extends 17P implements AnonymousClass5OM {
    public DT7 A00;
    public List A01;

    public final List Alk() {
        return A08(94431075, CIR.class);
    }

    public final List B8Z() {
        return this.A01;
    }

    public final C46278DTh B9H() {
        return (C46278DTh) A05(541661630, CKH.class);
    }

    public final C46238DRt BA8() {
        return (C46238DRt) A05(1841734510, CKT.class);
    }

    public final List BdY() {
        return A08(-276693162, CN1.class);
    }

    public final DT7 C4f() {
        DT7 dt7 = this.A00;
        if (dt7 == null) {
            return (DT7) A05(-732727820, CSo.class);
        }
        return dt7;
    }

    public final CreateModeType CAL() {
        return (CreateModeType) A0N(3575610, DKS.A00);
    }

    public final AnonymousClass5OM E7H(1E9 r4) {
        ArrayList arrayList;
        ImmutableList A08 = A08(1778619833, ImmutablePandoUserDict.class);
        if (A08 != null) {
            arrayList = AnonymousClass7TG.A0r(A08);
            Iterator it = A08.iterator();
            while (it.hasNext()) {
                C41847B3o.A1P(r4, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A01 = arrayList;
        DT7 C4f = C4f();
        if (C4f != null) {
            C4f.EAU(r4);
        } else {
            C4f = null;
        }
        this.A00 = C4f;
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.5OM, com.facebook.pando.TreeJNI, X.CJL] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CWS.A00(this));
    }

    public final String C75() {
        return A0i(1825632156);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass5OL F2C(X.1E9 r11) {
        /*
            r10 = this;
            java.util.List r0 = r10.Alk()
            r4 = 0
            if (r0 == 0) goto L_0x0023
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x000f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = r1.next()
            X.DT8 r0 = (X.DT8) r0
            X.BE1 r0 = r0.F1D()
            r7.add(r0)
            goto L_0x000f
        L_0x0023:
            r7 = r4
        L_0x0024:
            java.lang.Class<com.instagram.user.model.ImmutablePandoUserDict> r1 = com.instagram.user.model.ImmutablePandoUserDict.class
            r0 = 1778619833(0x6a0395b9, float:3.976908E25)
            com.google.common.collect.ImmutableList r0 = r10.A08(r0, r1)
            if (r0 == 0) goto L_0x0055
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0037:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0041
            X.C41847B3o.A1P(r11, r2, r1)
            goto L_0x0037
        L_0x0041:
            if (r2 == 0) goto L_0x0055
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r2)
            java.util.Iterator r1 = r2.iterator()
        L_0x004b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0056
            X.C41847B3o.A1Q(r11, r8, r1)
            goto L_0x004b
        L_0x0055:
            r8 = r4
        L_0x0056:
            X.DTh r0 = r10.B9H()
            if (r0 == 0) goto L_0x0092
            X.BEs r2 = r0.F3J()
        L_0x0060:
            X.DRt r0 = r10.BA8()
            if (r0 == 0) goto L_0x0090
            X.BEw r3 = r0.F3X()
        L_0x006a:
            java.lang.String r5 = r10.A0W()
            java.util.List r0 = r10.BdY()
            if (r0 == 0) goto L_0x0094
            java.util.ArrayList r9 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x007c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0095
            java.lang.Object r0 = r1.next()
            X.DTK r0 = (X.DTK) r0
            X.BFo r0 = r0.F7Y()
            r9.add(r0)
            goto L_0x007c
        L_0x0090:
            r3 = r4
            goto L_0x006a
        L_0x0092:
            r2 = r4
            goto L_0x0060
        L_0x0094:
            r9 = r4
        L_0x0095:
            X.DT7 r0 = r10.C4f()
            if (r0 == 0) goto L_0x009f
            X.BIw r4 = r0.FGV(r11)
        L_0x009f:
            r0 = 1825632156(0x6cd0ef9c, float:2.0207048E27)
            java.lang.String r6 = r10.A0i(r0)
            com.instagram.api.schemas.CreateModeType r1 = r10.CAL()
            X.5OL r0 = new X.5OL
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CJL.F2C(X.1E9):X.5OL");
    }

    public final AnonymousClass5OL F2D(1E6 r2) {
        return F2C(C41847B3o.A0q(r2));
    }

    public final String getName() {
        return A0W();
    }
}
