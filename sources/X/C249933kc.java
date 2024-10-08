package X;

import java.io.Closeable;

/* renamed from: X.3kc  reason: invalid class name and case insensitive filesystem */
public abstract class C249933kc extends C249943kd {
    public 15p A03() {
        return ((C268544da) this).A09;
    }

    public C252503pD A04(16F r5) {
        C268544da r3 = (C268544da) this;
        C268544da.A01("p", r5);
        C269454f9 r2 = r3.A00;
        if (r5.A10() == null && r5.A1J() == null) {
            return null;
        }
        C252503pD r0 = (C252503pD) r3.A0A(r5, r2, r3.A05.A09(C252503pD.class));
        if (r0 == null) {
            return C383839gL.A00;
        }
        return r0;
    }

    public Object A05(16F r7, TA4 ta4) {
        C268544da r5 = (C268544da) this;
        C268544da.A01("p", r7);
        return r5.A0A(r7, r5.A00, r5.A05.A07((C269754fd) null, AnonymousClass4eE.A09, ta4.A00));
    }

    public void A06(17Z r6, Object obj) {
        C268544da r4 = (C268544da) this;
        C268544da.A01("g", r6);
        C269294et r3 = r4.A01;
        if (r3.A0D(C269424f6.INDENT_OUTPUT) && r6.A00 == null) {
            15v r1 = r3.A05;
            if (r1 instanceof C638815x) {
                r1 = ((C638815x) r1).AMF();
            }
            r6.A00 = r1;
        }
        if (!r3.A0D(C269424f6.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            r4.A09(r3).A0X(r6, obj);
            if (r3.A0D(C269424f6.FLUSH_AFTER_WRITE_VALUE)) {
                r6.flush();
                return;
            }
            return;
        }
        Closeable closeable = (Closeable) obj;
        try {
            r4.A09(r3).A0X(r6, obj);
            if (r3.A0D(C269424f6.FLUSH_AFTER_WRITE_VALUE)) {
                r6.flush();
            }
            closeable.close();
        } catch (Exception e) {
            C269574fL.A0B((17Z) null, closeable, e);
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
