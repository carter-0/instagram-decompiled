package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class CRw extends 17P implements C250753m0 {
    public Map A00;
    public List A01;

    public final C257543xZ AZ1() {
        return (C257543xZ) A05(-1593201482, C44031CRr.class);
    }

    public final C269824fk AlN() {
        return (C269824fk) A05(-1077203130, C44030CRq.class);
    }

    public final C257543xZ Axo() {
        return (C257543xZ) A05(1446414091, C44031CRr.class);
    }

    public final C269824fk BCp() {
        return (C269824fk) A05(1588497204, C44030CRq.class);
    }

    public final C269854fn BKG() {
        return (C269854fn) A05(-1822059410, C44033CRt.class);
    }

    public final Map BRh() {
        Map map = this.A00;
        if (map == null) {
            return null;
        }
        return map;
    }

    public final List BRk() {
        return this.A01;
    }

    public final C250753m0 EA2(1E9 r4) {
        ArrayList arrayList;
        Map map = this.A00;
        if (map == null) {
            map = null;
        }
        this.A00 = map;
        ImmutableList A08 = A08(1498308178, ImmutablePandoUserDict.class);
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
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.17P} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C250743lz FFF(X.1E9 r23) {
        /*
            r22 = this;
            r3 = r22
            X.3xZ r1 = r3.AZ1()
            r0 = 0
            if (r1 == 0) goto L_0x00b1
            X.3xY r9 = r1.FF9()
        L_0x000d:
            java.lang.String r14 = X.C41845B3m.A0r(r3)
            r1 = 305089521(0x122f4bf1, float:5.531387E-28)
            java.lang.String r15 = r3.A0i(r1)
            X.4fk r1 = r3.AlN()
            if (r1 == 0) goto L_0x00ae
            X.4fj r7 = r1.FF8()
        L_0x0022:
            r1 = 549275112(0x20bd45e8, float:3.2064105E-19)
            java.lang.String r16 = r3.A0i(r1)
            java.lang.String r17 = r3.A0T()
            X.3xZ r1 = r3.Axo()
            if (r1 == 0) goto L_0x00ac
            X.3xY r10 = r1.FF9()
        L_0x0037:
            X.4fk r1 = r3.BCp()
            if (r1 == 0) goto L_0x00aa
            X.4fj r8 = r1.FF8()
        L_0x0041:
            X.4fn r1 = r3.BKG()
            if (r1 == 0) goto L_0x00a8
            X.4fm r11 = r1.FFB()
        L_0x004b:
            java.util.Map r4 = r3.A00
            r5 = r23
            if (r4 != 0) goto L_0x006f
            r1 = r0
        L_0x0052:
            java.lang.Class<com.instagram.user.model.ImmutablePandoUserDict> r4 = com.instagram.user.model.ImmutablePandoUserDict.class
            r2 = 1498308178(0x594e5e52, float:3.63047197E15)
            com.google.common.collect.ImmutableList r2 = r3.A08(r2, r4)
            if (r2 == 0) goto L_0x00c8
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r2)
            java.util.Iterator r4 = r2.iterator()
        L_0x0065:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x00b4
            X.C41847B3o.A1P(r5, r6, r4)
            goto L_0x0065
        L_0x006f:
            int r1 = r4.size()
            int r1 = X.0se.A0L(r1)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r1)
            java.util.Set r1 = r4.entrySet()
            java.util.Iterator r6 = r1.iterator()
        L_0x0084:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x00a2
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r4 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            X.17K r1 = (X.AnonymousClass17K) r1
            X.17K r1 = r5.A00(r1)
            r2.put(r4, r1)
            goto L_0x0084
        L_0x00a2:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>(r2)
            goto L_0x0052
        L_0x00a8:
            r11 = r0
            goto L_0x004b
        L_0x00aa:
            r8 = r0
            goto L_0x0041
        L_0x00ac:
            r10 = r0
            goto L_0x0037
        L_0x00ae:
            r7 = r0
            goto L_0x0022
        L_0x00b1:
            r9 = r0
            goto L_0x000d
        L_0x00b4:
            if (r6 == 0) goto L_0x00c8
            java.util.ArrayList r0 = X.AnonymousClass7TG.A0r(r6)
            java.util.Iterator r4 = r6.iterator()
        L_0x00be:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x00c8
            X.C41847B3o.A1Q(r5, r0, r4)
            goto L_0x00be
        L_0x00c8:
            r2 = 625144022(0x2542f0d6, float:1.6908416E-16)
            java.lang.Boolean r12 = r3.getOptionalBooleanValueByHashCode(r2)
            java.lang.String r18 = r3.A0X()
            java.lang.String r19 = X.C41845B3m.A0p(r3)
            r2 = -1037596717(0xffffffffc22787d3, float:-41.88264)
            java.lang.Integer r13 = r3.getOptionalIntValueByHashCode(r2)
            X.3lz r6 = new X.3lz
            r20 = r1
            r21 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CRw.FFF(X.1E9):X.3lz");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRw, X.3m0] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44909Cmz.A00(this));
    }

    public final String Aei() {
        return A0i(305089521);
    }

    public final String Avm() {
        return A0i(549275112);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRw] */
    public final Boolean BvW() {
        return getOptionalBooleanValueByHashCode(625144022);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRw] */
    public final Integer C5c() {
        return getOptionalIntValueByHashCode(-1037596717);
    }

    public final C250743lz FFG(1E6 r2) {
        return FFF(C41846B3n.A0S(r2));
    }

    public final String getBackgroundColor() {
        return C41845B3m.A0r(this);
    }

    public final String getDescription() {
        return A0T();
    }

    public final String getText() {
        return A0X();
    }

    public final String getTextColor() {
        return C41845B3m.A0p(this);
    }
}
