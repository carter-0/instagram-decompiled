package X;

import java.util.Arrays;

/* renamed from: X.9uT  reason: invalid class name and case insensitive filesystem */
public abstract class C392259uT {
    public final int A00() {
        if (this instanceof B0Q) {
            return ((B0Q) this).A00;
        }
        if (this instanceof B0P) {
            return ((B0P) this).A00;
        }
        if (this instanceof B0O) {
            return ((B0O) this).A00;
        }
        if (this instanceof B0N) {
            return ((B0N) this).A00;
        }
        if (this instanceof B0M) {
            return ((B0M) this).A00;
        }
        if (this instanceof B0L) {
            return ((B0L) this).A00;
        }
        if (this instanceof B0K) {
            return ((B0K) this).A00;
        }
        if (this instanceof B0R) {
            return ((B0R) this).A00;
        }
        if (this instanceof B0J) {
            return ((B0J) this).A00;
        }
        if (this instanceof B0I) {
            return ((B0I) this).A00;
        }
        if (this instanceof B0H) {
            return ((B0H) this).A00;
        }
        return ((B0G) this).A00;
    }

    public final Object A01() {
        Object copyOf;
        if (this instanceof B0Q) {
            B0Q b0q = (B0Q) this;
            short[] copyOf2 = Arrays.copyOf(b0q.A01, b0q.A00);
            0qQ.A07(copyOf2);
            return new C360398eW(copyOf2);
        } else if (this instanceof B0P) {
            B0P b0p = (B0P) this;
            long[] copyOf3 = Arrays.copyOf(b0p.A01, b0p.A00);
            0qQ.A07(copyOf3);
            return new C360258eI(copyOf3);
        } else if (this instanceof B0O) {
            B0O b0o = (B0O) this;
            int[] copyOf4 = Arrays.copyOf(b0o.A01, b0o.A00);
            0qQ.A07(copyOf4);
            return new C360328eP(copyOf4);
        } else if (this instanceof B0N) {
            B0N b0n = (B0N) this;
            byte[] copyOf5 = Arrays.copyOf(b0n.A01, b0n.A00);
            0qQ.A07(copyOf5);
            return new C360468ed(copyOf5);
        } else {
            if (this instanceof B0M) {
                B0M b0m = (B0M) this;
                copyOf = Arrays.copyOf(b0m.A01, b0m.A00);
            } else if (this instanceof B0L) {
                B0L b0l = (B0L) this;
                copyOf = Arrays.copyOf(b0l.A01, b0l.A00);
            } else if (this instanceof B0K) {
                B0K b0k = (B0K) this;
                copyOf = Arrays.copyOf(b0k.A01, b0k.A00);
            } else if (this instanceof B0R) {
                B0R b0r = (B0R) this;
                copyOf = Arrays.copyOf(b0r.A01, b0r.A00);
            } else if (this instanceof B0J) {
                B0J b0j = (B0J) this;
                copyOf = Arrays.copyOf(b0j.A01, b0j.A00);
            } else if (this instanceof B0I) {
                B0I b0i = (B0I) this;
                copyOf = Arrays.copyOf(b0i.A01, b0i.A00);
            } else if (this instanceof B0H) {
                B0H b0h = (B0H) this;
                copyOf = Arrays.copyOf(b0h.A01, b0h.A00);
            } else {
                B0G b0g = (B0G) this;
                copyOf = Arrays.copyOf(b0g.A01, b0g.A00);
            }
            0qQ.A07(copyOf);
            return copyOf;
        }
    }
}
