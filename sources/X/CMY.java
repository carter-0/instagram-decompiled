package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CMY extends 17P implements DV1 {
    public List A00;
    public DSL A01;
    public 1Xj A02;

    public final 1Xj Aep() {
        return this.A02;
    }

    public final C233502vp Ana() {
        return (C233502vp) A04(537407194, C44038CSu.class);
    }

    public final DSL BVo() {
        DSL dsl = this.A01;
        if (dsl == null) {
            return (DSL) A05(-404842575, CMZ.class);
        }
        return dsl;
    }

    public final Long AiI() {
        return A0L(-383562417);
    }

    public final String Aij() {
        return A0i(2025574677);
    }

    public final String Aik() {
        return A0i(-1841869723);
    }

    public final String Air() {
        return C41847B3o.A1C(this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CMY] */
    public final boolean BAv() {
        return getBooleanValueByHashCode(-32359658);
    }

    public final long BJY() {
        return A03(-2141142810);
    }

    public final String BVt() {
        return A0h(-1852539703);
    }

    public final String C9L() {
        return A0h(-1938614671);
    }

    public final DV1 E7l(1E9 r5) {
        ArrayList arrayList;
        this.A02 = C41847B3o.A0u(r5, this, 2045709715);
        List list = this.A00;
        if (list == null) {
            list = A08(94750499, B5k.class);
        }
        DSL dsl = null;
        if (list != null) {
            arrayList = AnonymousClass7TG.A0r(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C41848B3p.A1U(r5, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        DSL BVo = BVo();
        if (BVo != null) {
            BVo.E7m(r5);
            dsl = BVo;
        }
        this.A01 = dsl;
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: X.17P} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C42053BFg F6m(X.1E9 r24) {
        /*
            r23 = this;
            r2 = 2045709715(0x79ef0d93, float:1.5515428E35)
            r0 = r23
            r1 = r24
            X.1Xj r2 = X.C41847B3o.A0u(r1, r0, r2)
            r5 = 0
            if (r2 == 0) goto L_0x00a3
            X.1Xj r6 = X.C41846B3n.A0Y(r1, r2)
        L_0x0012:
            r2 = -383562417(0xffffffffe9234d4f, float:-1.2338749E25)
            java.lang.Long r9 = r0.A0L(r2)
            r2 = 2025574677(0x78bbd115, float:3.0475006E34)
            java.lang.String r10 = r0.A0i(r2)
            r2 = -1841869723(0xffffffff92374c65, float:-5.783878E-28)
            java.lang.String r11 = r0.A0i(r2)
            java.lang.String r12 = X.C41847B3o.A1C(r0)
            X.2vp r2 = r0.Ana()
            X.2vo r7 = r2.FGd()
            java.util.List r2 = r0.A00
            if (r2 != 0) goto L_0x0091
            r3 = 94750499(0x5a5c723, float:1.5589677E-35)
            java.lang.Class<X.B5k> r2 = X.B5k.class
            com.google.common.collect.ImmutableList r2 = r0.A08(r3, r2)
            if (r2 != 0) goto L_0x0091
            r3 = r5
        L_0x0043:
            r2 = -1750224411(0xffffffff97adb1e5, float:-1.122477E-24)
            java.lang.Boolean r8 = r0.getOptionalBooleanValueByHashCode(r2)
            r2 = -32359658(0xfffffffffe123b16, float:-4.859352E37)
            boolean r22 = r0.getBooleanValueByHashCode(r2)
            r2 = -737588055(0xffffffffd4094ca9, float:-2.35878665E12)
            java.lang.String r13 = r0.A0i(r2)
            r2 = -2141142810(0xffffffff8060c0e6, float:-8.885407E-39)
            long r20 = r0.A03(r2)
            r2 = -900774058(0xffffffffca4f4756, float:-3396053.5)
            java.lang.String r14 = r0.A0k(r2)
            r2 = 954925063(0x38eb0007, float:1.1205678E-4)
            java.lang.String r15 = r0.A0i(r2)
            X.DSL r2 = r0.BVo()
            if (r2 == 0) goto L_0x0077
            X.B7n r5 = r2.F6n(r1)
        L_0x0077:
            r1 = -1852539703(0xffffffff91947cc9, float:-2.3427188E-28)
            java.lang.String r16 = r0.A0h(r1)
            java.lang.String r17 = r0.A0Y()
            r1 = -1938614671(0xffffffff8c731671, float:-1.8726792E-31)
            java.lang.String r18 = r0.A0h(r1)
            X.BFg r4 = new X.BFg
            r19 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22)
            return r4
        L_0x0091:
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r2)
            java.util.Iterator r4 = r2.iterator()
        L_0x0099:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0043
            X.C41848B3p.A1Q(r1, r3, r4)
            goto L_0x0099
        L_0x00a3:
            r6 = r5
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CMY.F6m(X.1E9):X.BFg");
    }

    public final String getMediaId() {
        return A0k(-900774058);
    }

    public final String getMessage() {
        return A0i(954925063);
    }

    public final String getTitle() {
        return A0Y();
    }
}
