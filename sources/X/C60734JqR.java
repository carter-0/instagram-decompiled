package X;

import java.util.Iterator;

/* renamed from: X.JqR  reason: case insensitive filesystem */
public final class C60734JqR extends C22025XtK {
    public LGH A00;
    public String A01;
    public String A02;
    public C39660A4a A03;
    public final AnonymousClass8CN A04;

    public final boolean A09() {
        if (this.A03 != null || !A08()) {
            return true;
        }
        try {
            C39660A4a A002 = C39660A4a.A00(this.A01, 0);
            A002.A00.loadMethod("forward");
            this.A03 = A002;
            return true;
        } catch (Exception e) {
            0KC.A0F("Text2FilterExecuTorchProcessor", "Failed to load color model", e);
            return false;
        }
    }

    public C60734JqR(AnonymousClass8CN r1) {
        this.A04 = r1;
    }

    public static final Integer A00(Iterable iterable) {
        Object next;
        Iterator it = 00k.A0p(iterable).iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                Comparable comparable = (Comparable) ((0k0) next).A01;
                do {
                    Object next2 = it.next();
                    Comparable comparable2 = (Comparable) ((0k0) next2).A01;
                    if (comparable.compareTo(comparable2) < 0) {
                        next = next2;
                        comparable = comparable2;
                    }
                } while (it.hasNext());
            }
        }
        0k0 r4 = (0k0) next;
        if (r4 != null) {
            return Integer.valueOf(r4.A00);
        }
        return null;
    }

    public final boolean A0A() {
        String str;
        if (!A08() || (str = this.A02) == null) {
            return false;
        }
        LGH lgh = this.A00;
        if (lgh == null) {
            lgh = new LGH(str);
            this.A00 = lgh;
        }
        if (lgh.A00()) {
            return true;
        }
        return lgh.A01();
    }
}
