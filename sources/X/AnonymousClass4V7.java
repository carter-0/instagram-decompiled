package X;

import java.util.List;

/* renamed from: X.4V7  reason: invalid class name */
public final class AnonymousClass4V7 extends AnonymousClass4UD {
    public AnonymousClass4VG A00;
    public AnonymousClass4VG A01;
    public AnonymousClass4VG A02;
    public C283845Jo A03;
    public C45306CuA A04;
    public C283865Jq A05;
    public C283905Ju A06;
    public C283905Ju A07;
    public C283885Js A08;
    public AnonymousClass4V8 A09 = new Object();
    public List A0A;
    public List A0B;
    public List A0C;

    public final C246643ew A00() {
        C45306CuA cuA = this.A04;
        if (cuA == null) {
            return null;
        }
        C61081JwJ jwJ = cuA.A00;
        R9S r9s = cuA.A01;
        if (r9s == null) {
            if (jwJ == null) {
                return null;
            }
            r9s = (R9S) jwJ.A00;
            String str = jwJ.A01;
            if (r9s == null) {
                if (str != null) {
                    r9s = (R9S) Ci2.parseFromJson(16P.A00(str)).A00;
                    if (r9s == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            cuA.A01 = r9s;
        }
        return r9s.A01();
    }

    public final void A01() {
        AnonymousClass4VG r1 = this.A01;
        if (r1 != null) {
            r1.A02 = AnonymousClass05K.A01;
        }
        AnonymousClass4VG r12 = this.A02;
        if (r12 != null) {
            r12.A02 = AnonymousClass05K.A0C;
        }
        AnonymousClass4VG r13 = this.A00;
        if (r13 != null) {
            r13.A02 = AnonymousClass05K.A0N;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        sb.append(getClass().getSimpleName());
        sb.append(" : ");
        sb.append(this.A09);
        sb.append(this.A03);
        sb.append('}');
        return sb.toString();
    }
}
