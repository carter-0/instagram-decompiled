package X;

import com.facebook.common.dextricks.Constants;

/* renamed from: X.N3t  reason: case insensitive filesystem */
public final class C68178N3t extends AnonymousClass0T0 {
    public final C62320sa A00;
    public final C62320sa A01;
    public final C62320sa A02;
    public final C62320sa A03;
    public final C62320sa A04;
    public final C62320sa A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public C68178N3t() {
        this((C62320sa) null, (C62320sa) null, 65535, false, false);
    }

    public /* synthetic */ C68178N3t(C62320sa r11, C62320sa r12, int i, boolean z, boolean z2) {
        C73697PiK piK;
        C73699PiM piM;
        C73700PiN piN;
        C73701PiO piO = null;
        boolean z3 = true;
        boolean A1P = AnonymousClass7TF.A1P(i & 1);
        boolean A1Q = C51966G9m.A1Q(i & 2, z);
        boolean A1P2 = AnonymousClass7TF.A1P(i & 8);
        r11 = (i & 16) != 0 ? C73696PiJ.A00 : r11;
        boolean A1P3 = AnonymousClass7TF.A1P(i & 256);
        if ((i & 1024) != 0) {
            piK = C73697PiK.A00;
        } else {
            piK = null;
        }
        r12 = (i & C249703kE.FLAG_MOVED) != 0 ? C73698PiL.A00 : r12;
        z3 = (i & 4096) == 0 ? z2 : z3;
        if ((i & 8192) != 0) {
            piM = C73699PiM.A00;
        } else {
            piM = null;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            piN = C73700PiN.A00;
        } else {
            piN = null;
        }
        piO = (i & Constants.LOAD_RESULT_PGO) != 0 ? C73701PiO.A00 : piO;
        0qQ.A0B(r11, 5);
        DbW.A1P(piK, 11, r12);
        C51973G9u.A0v(14, piM, piN, piO);
        this.A07 = A1P;
        this.A06 = A1Q;
        this.A09 = A1P2;
        this.A01 = r11;
        this.A08 = A1P3;
        this.A05 = piK;
        this.A00 = r12;
        this.A0A = z3;
        this.A04 = piM;
        this.A03 = piN;
        this.A02 = piO;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68178N3t) {
                C68178N3t n3t = (C68178N3t) obj;
                if (this.A07 != n3t.A07 || this.A06 != n3t.A06 || this.A09 != n3t.A09 || !0qQ.A0K(this.A01, n3t.A01) || this.A08 != n3t.A08 || !0qQ.A0K(this.A05, n3t.A05) || !0qQ.A0K(this.A00, n3t.A00) || this.A0A != n3t.A0A || !0qQ.A0K(this.A04, n3t.A04) || !0qQ.A0K(this.A03, n3t.A03) || !0qQ.A0K(this.A02, n3t.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A06, C51965G9l.A05(this.A07));
        int A002 = C54732HQn.A00();
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A05, (AnonymousClass7TF.A09(this.A08, (((AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A09(this.A09, (A092 + A002) * 31)) + A002) * 31) + A002) * 31 * 31) + A002) * 31))))));
    }
}
