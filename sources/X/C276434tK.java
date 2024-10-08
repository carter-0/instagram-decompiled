package X;

import java.io.IOException;

/* renamed from: X.4tK  reason: invalid class name and case insensitive filesystem */
public final class C276434tK implements C276444tL {
    public 16F A00;

    public final boolean ADz() {
        16L A11;
        16F r0 = this.A00;
        if (r0 == null || (A11 = r0.A11()) == null) {
            throw new IOException();
        }
        int ordinal = A11.ordinal();
        if (ordinal == 10) {
            return true;
        }
        if (ordinal == 11) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("illegal token for boolean type ");
        sb.append(A11);
        throw new IllegalArgumentException(sb.toString());
    }

    public final int CNd() {
        16F r0 = this.A00;
        if (r0 != null) {
            return r0.A0i();
        }
        throw new IOException();
    }

    public final long ClN() {
        16F r0 = this.A00;
        if (r0 != null) {
            return r0.A0j();
        }
        throw new IOException();
    }

    public final Number CsM() {
        Number valueOf;
        16F r3 = this.A00;
        if (r3 != null) {
            16L A11 = r3.A11();
            if (A11 != null) {
                int ordinal = A11.ordinal();
                if (ordinal == 9) {
                    valueOf = Double.valueOf(r3.A0g());
                } else if (ordinal == 8) {
                    valueOf = Long.valueOf(r3.A0j());
                }
                return valueOf;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("illegal token for number type ");
            sb.append(A11);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IOException();
    }

    public final String Eyf() {
        String A1P;
        16F r0 = this.A00;
        if (r0 != null && (A1P = r0.A1P()) != null) {
            return A1P;
        }
        throw new IOException();
    }

    public final boolean isNull() {
        16L r2;
        16F r0 = this.A00;
        if (r0 != null) {
            r2 = r0.A11();
        } else {
            r2 = null;
        }
        if (r2 == 16L.A0G) {
            return true;
        }
        return false;
    }
}
