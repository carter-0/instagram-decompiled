package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.io.Serializable;
import java.util.List;

public abstract class SuT implements C13901TjO, Serializable {
    public final T9n A00;
    public transient List A01;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        if (r2 != r0) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r4 = r7.getClass();
        r2 = r6.A0C;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.fasterxml.jackson.databind.JsonSerializer A02(X.C269504fE r5, X.C8244Qkx r6, java.lang.Object r7) {
        /*
            com.fasterxml.jackson.databind.JsonSerializer r0 = r6.A02
            if (r0 != 0) goto L_0x0069
            java.lang.Class r4 = r7.getClass()
            X.SIF r2 = r6.A0C
            com.fasterxml.jackson.databind.JsonSerializer r0 = r2.A00(r4)
            if (r0 != 0) goto L_0x0069
            boolean r0 = r6 instanceof X.C8243Qkq
            if (r0 == 0) goto L_0x004b
            X.Qkq r6 = (X.C8243Qkq) r6
            X.4eF r0 = r6.A00
            if (r0 == 0) goto L_0x0046
            X.4eF r0 = r5.A0A(r0, r4)
            com.fasterxml.jackson.databind.JsonSerializer r3 = r5.A0E(r6, r0)
        L_0x0022:
            X.SGT r2 = r6.A00
            boolean r0 = r3.A08()
            if (r0 == 0) goto L_0x0039
            boolean r0 = r3 instanceof com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer
            if (r0 == 0) goto L_0x0039
            r0 = r3
            com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer r0 = (com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer) r0
            X.SGT r1 = r0.A00
            X.Qm3 r0 = new X.Qm3
            r0.<init>(r2, r1)
            r2 = r0
        L_0x0039:
            com.fasterxml.jackson.databind.JsonSerializer r1 = r3.A07(r2)
            X.SIF r0 = r6.A0C
            X.SIF r0 = r0.A01(r1, r4)
        L_0x0043:
            r6.A0C = r0
        L_0x0045:
            return r1
        L_0x0046:
            com.fasterxml.jackson.databind.JsonSerializer r3 = r5.A0I(r6, r4)
            goto L_0x0022
        L_0x004b:
            X.4eF r0 = r6.A00
            if (r0 == 0) goto L_0x0060
            X.4eF r0 = r5.A0A(r0, r4)
            com.fasterxml.jackson.databind.JsonSerializer r1 = r5.A0D(r6, r0)
            java.lang.Class r0 = r0.A00
            X.SIF r0 = r2.A01(r1, r0)
        L_0x005d:
            if (r2 == r0) goto L_0x0045
            goto L_0x0043
        L_0x0060:
            com.fasterxml.jackson.databind.JsonSerializer r1 = r5.A0H(r6, r4)
            X.SIF r0 = r2.A01(r1, r4)
            goto L_0x005d
        L_0x0069:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SuT.A02(X.4fE, X.Qkx, java.lang.Object):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public static boolean A03(JsonSerializer jsonSerializer, C269504fE r2, Object obj, Object obj2) {
        if (C8244Qkx.A0H == obj) {
            return jsonSerializer.A0B(r2, obj2);
        }
        return obj.equals(obj2);
    }

    public final T9n BSh() {
        if (!(this instanceof C8174Qif)) {
            return this.A00;
        }
        C8174Qif qif = (C8174Qif) this;
        T9n t9n = qif.A00;
        C8218QkR qkR = qif.A00;
        if (qkR != null) {
            return t9n.A01(qkR.BSh().A06);
        }
        return t9n;
    }

    public SuT(T9n t9n) {
        this.A00 = t9n == null ? T9n.A09 : t9n;
    }

    public final C269314ev AVO(C269144ee r4, Class cls) {
        C8208QkH BRS;
        C269314ev A04;
        C269314ev A002 = r4.A00();
        C268854eA A012 = r4.A01();
        if (A012 == null || (BRS = BRS()) == null || (A04 = A012.A04(BRS)) == null) {
            return A002;
        }
        return A002.A00(A04);
    }

    public final C269194ej AVP(C269144ee r5, Class cls) {
        C268854eA A012 = r5.A01();
        C8208QkH BRS = BRS();
        if (BRS == null) {
            return ((C269304eu) r5).A01.A00;
        }
        BRS.A04();
        C269194ej r1 = ((C269304eu) r5).A01.A00;
        if (A012 != null) {
            return r1.A00(A012.A06(BRS));
        }
        return r1;
    }

    public SuT(SuT suT) {
        this.A00 = suT.A00;
    }
}
