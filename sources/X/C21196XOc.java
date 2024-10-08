package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.XOc  reason: case insensitive filesystem */
public final class C21196XOc extends XOX {
    public static final Set A06;
    public final AnonymousClass983 A00;
    public final Xnm A01;
    public final Xnn A02;
    public final Xnj A03;
    public final Xnk A04;
    public final C3740497y A05;

    public final boolean A00() {
        return C51969G9p.A1a(this.A04, Xnk.A02);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21196XOc)) {
            return false;
        }
        C21196XOc xOc = (C21196XOc) obj;
        if (!2Ob.A00(xOc.A01, this.A01) || !2Ob.A00(xOc.A02, this.A02) || !2Ob.A00(xOc.A03, this.A03) || !2Ob.A00(xOc.A00, this.A00) || !2Ob.A00(xOc.A04, this.A04) || !2Ob.A00(xOc.A05, this.A05)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{C21196XOc.class, this.A01, this.A02, this.A03, this.A00, this.A04, this.A05});
    }

    public final String toString() {
        return String.format("EciesParameters(curveType=%s, hashType=%s, pointFormat=%s, demParameters=%s, variant=%s, salt=%s)", new Object[]{this.A01, this.A02, this.A03, this.A00, this.A04, this.A05});
    }

    static {
        try {
            HashSet A1F = AnonymousClass7TE.A1F();
            AnonymousClass99Y r1 = AnonymousClass99Y.A02;
            A1F.add(AnonymousClass99Z.A00(r1, 16));
            A1F.add(AnonymousClass99Z.A00(r1, 32));
            C3743799f r5 = C3743799f.A02;
            C3743699e r4 = C3743699e.A03;
            A1F.add(C3743899g.A00(r4, r5, 16, 32, 16, 16));
            A1F.add(C3743899g.A00(r4, r5, 32, 32, 16, 32));
            A1F.add(new C3744299k(C3744199j.A02));
            A1F.add(new AnonymousClass981(AnonymousClass98C.A02, 64));
            A06 = Collections.unmodifiableSet(A1F);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public C21196XOc(AnonymousClass983 r1, Xnm xnm, Xnn xnn, Xnj xnj, Xnk xnk, C3740497y r6) {
        this.A01 = xnm;
        this.A02 = xnn;
        this.A03 = xnj;
        this.A00 = r1;
        this.A04 = xnk;
        this.A05 = r6;
    }
}
