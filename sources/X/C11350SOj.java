package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.SOj  reason: case insensitive filesystem */
public final class C11350SOj {
    public long A00;
    public long A01;
    public long A02;
    public boolean A03;
    public boolean A04;
    public long A05;
    public long A06;
    public final C10597Rur A07;
    public final List A08;
    public final Map A09;
    public final C13473Tb0 A0A;

    public final C11335SNp A01(Class cls) {
        Map map = this.A09;
        C11335SNp sNp = (C11335SNp) map.get(cls);
        if (sNp != null) {
            return sNp;
        }
        C11335SNp A002 = A00(cls);
        map.put(cls, A002);
        return A002;
    }

    public C11350SOj(C10597Rur rur, C13473Tb0 tb0) {
        AnonymousClass3Qk.A02(tb0);
        this.A07 = rur;
        this.A0A = tb0;
        this.A05 = 1800000;
        this.A06 = 3024000000L;
        this.A09 = AnonymousClass7TE.A1E();
        this.A08 = AnonymousClass7TE.A1C();
    }

    public static C11335SNp A00(Class cls) {
        try {
            return (C11335SNp) Pxg.A0i(cls);
        } catch (Exception e) {
            if (e instanceof InstantiationException) {
                throw Pxe.A0h("dataType doesn't have default constructor", e);
            } else if (e instanceof IllegalAccessException) {
                throw Pxe.A0h("dataType default constructor is not accessible", e);
            } else if (e instanceof ReflectiveOperationException) {
                throw Pxe.A0h("Linkage exception", e);
            } else {
                throw C41845B3m.A0j(e);
            }
        }
    }

    public final void A02(C11335SNp sNp) {
        AnonymousClass3Qk.A02(sNp);
        Class<?> cls = sNp.getClass();
        if (cls.getSuperclass() == C11335SNp.class) {
            sNp.A02(A01(cls));
            return;
        }
        throw Pxe.A0g();
    }

    public C11350SOj(C11350SOj sOj) {
        this.A07 = sOj.A07;
        this.A0A = sOj.A0A;
        this.A00 = sOj.A00;
        this.A01 = sOj.A01;
        this.A02 = sOj.A02;
        this.A05 = sOj.A05;
        this.A06 = sOj.A06;
        this.A08 = AnonymousClass7TE.A1D(sOj.A08);
        this.A09 = new HashMap(sOj.A09.size());
        Iterator A0u = AnonymousClass7TF.A0u(sOj.A09);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            C11335SNp A002 = A00((Class) A1J.getKey());
            ((C11335SNp) A1J.getValue()).A02(A002);
            this.A09.put(A1J.getKey(), A002);
        }
    }
}
