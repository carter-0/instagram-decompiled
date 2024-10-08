package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.reels.netego.ShoppingNetegoInStoryIconType;
import com.instagram.model.reels.netego.ShoppingNetegoInStorySuggestionType;
import com.instagram.model.reels.netego.ShoppingNetegoType;
import java.util.ArrayList;
import java.util.List;

public final class CRo extends 17P implements C239683Hp {
    public List A00;
    public List A01;

    public final C66565MWt AhJ() {
        return (C66565MWt) A05(-1682227716, C62004KVb.class);
    }

    public final C66565MWt AwS() {
        return (C66565MWt) A05(1701718064, C62004KVb.class);
    }

    public final C66565MWt AwT() {
        return (C66565MWt) A05(507156368, C62004KVb.class);
    }

    public final ShoppingNetegoInStoryIconType BE8() {
        return (ShoppingNetegoInStoryIconType) A0N(3226745, DOV.A00);
    }

    public final Long BEY() {
        return A0L(3355);
    }

    public final ShoppingNetegoType BVs() {
        return (ShoppingNetegoType) A0N(-1852539703, DOW.A00);
    }

    public final List Bga() {
        List list = this.A00;
        if (list == null) {
            return A08(-1003761308, CRm.class);
        }
        return list;
    }

    public final List Btt() {
        List list = this.A01;
        if (list == null) {
            return A08(109413437, CRn.class);
        }
        return list;
    }

    public final C66565MWt C2a() {
        return (C66565MWt) A05(-2060497896, C62004KVb.class);
    }

    public final ShoppingNetegoInStorySuggestionType C2s() {
        return (ShoppingNetegoInStorySuggestionType) A0N(-1649467243, DOX.A00);
    }

    public final C66565MWt C7m() {
        return (C66565MWt) A05(110371416, C62004KVb.class);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.17P} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C239673Ho FF3(X.1E9 r22) {
        /*
            r21 = this;
            r3 = r21
            X.MWt r0 = r3.AhJ()
            r10 = 0
            if (r0 == 0) goto L_0x0065
            X.JzF r6 = r0.FF0()
        L_0x000d:
            X.MWt r0 = r3.AwS()
            if (r0 == 0) goto L_0x0063
            X.JzF r7 = r0.FF0()
        L_0x0017:
            X.MWt r0 = r3.AwT()
            if (r0 == 0) goto L_0x0061
            X.JzF r8 = r0.FF0()
        L_0x0021:
            r0 = -1992012396(0xffffffff89444d94, float:-2.3629119E-33)
            java.lang.Integer r15 = r3.getOptionalIntValueByHashCode(r0)
            com.instagram.model.reels.netego.ShoppingNetegoInStoryIconType r11 = r3.BE8()
            r0 = 3355(0xd1b, float:4.701E-42)
            java.lang.Long r16 = r3.A0L(r0)
            r0 = -1947593954(0xffffffff8bea131e, float:-9.0162286E-32)
            java.lang.Boolean r14 = r3.getOptionalBooleanValueByHashCode(r0)
            com.instagram.model.reels.netego.ShoppingNetegoType r13 = r3.BVs()
            java.util.List r0 = r3.Bga()
            r4 = r22
            if (r0 == 0) goto L_0x0067
            java.util.ArrayList r1 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x004d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0068
            java.lang.Object r0 = r2.next()
            X.DUh r0 = (X.C46304DUh) r0
            X.BIe r0 = r0.FEy(r4)
            r1.add(r0)
            goto L_0x004d
        L_0x0061:
            r8 = r10
            goto L_0x0021
        L_0x0063:
            r7 = r10
            goto L_0x0017
        L_0x0065:
            r6 = r10
            goto L_0x000d
        L_0x0067:
            r1 = r10
        L_0x0068:
            java.util.List r2 = r3.Btt()
            if (r2 == 0) goto L_0x008a
            java.util.ArrayList r0 = X.AnonymousClass7TF.A0p(r2)
            java.util.Iterator r5 = r2.iterator()
        L_0x0076:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x008b
            java.lang.Object r2 = r5.next()
            X.DUX r2 = (X.DUX) r2
            X.BIf r2 = r2.FEz(r4)
            r0.add(r2)
            goto L_0x0076
        L_0x008a:
            r0 = r10
        L_0x008b:
            X.MWt r2 = r3.C2a()
            if (r2 == 0) goto L_0x00b8
            X.JzF r9 = r2.FF0()
        L_0x0095:
            com.instagram.model.reels.netego.ShoppingNetegoInStorySuggestionType r12 = r3.C2s()
            X.MWt r2 = r3.C7m()
            if (r2 == 0) goto L_0x00a3
            X.JzF r10 = r2.FF0()
        L_0x00a3:
            java.lang.String r17 = X.C41847B3o.A1B(r3)
            r2 = 273609178(0x104ef1da, float:4.0812652E-29)
            java.lang.String r18 = r3.A0i(r2)
            X.3Ho r5 = new X.3Ho
            r20 = r0
            r19 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r5
        L_0x00b8:
            r9 = r10
            goto L_0x0095
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CRo.FF3(X.1E9):X.3Ho");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRo, X.3Hp] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44900Cmq.A00(this));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRo] */
    public final Integer AzH() {
        return getOptionalIntValueByHashCode(-1992012396);
    }

    public final String C9L() {
        return C41847B3o.A1B(this);
    }

    public final String CBA() {
        return A0i(273609178);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRo] */
    public final Boolean Cdn() {
        return getOptionalBooleanValueByHashCode(-1947593954);
    }

    public final C239683Hp EA1(1E9 r5) {
        ArrayList arrayList;
        List<C46304DUh> Bga = Bga();
        ArrayList arrayList2 = null;
        if (Bga != null) {
            arrayList = AnonymousClass7TF.A0p(Bga);
            for (C46304DUh dUh : Bga) {
                dUh.E9z(r5);
                arrayList.add(dUh);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        List<DUX> Btt = Btt();
        if (Btt != null) {
            arrayList2 = AnonymousClass7TF.A0p(Btt);
            for (DUX dux : Btt) {
                dux.EA0(r5);
                arrayList2.add(dux);
            }
        }
        this.A01 = arrayList2;
        return this;
    }
}
