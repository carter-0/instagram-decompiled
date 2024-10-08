package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.GnE  reason: case insensitive filesystem */
public final class C53382GnE extends AnonymousClass0T0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public C53382GnE(C54653HMk hMk, Integer num) {
        this.A00 = 1;
        this.A00 = 1;
        this.A02 = hMk;
        this.A01 = num;
        this.A06 = false;
        this.A05 = false;
        this.A04 = false;
        this.A03 = null;
    }

    public final boolean equals(Object obj) {
        C53382GnE gnE;
        boolean z;
        boolean z2;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C53382GnE) {
                    gnE = (C53382GnE) obj;
                    if (gnE.A00 == 0 && 0qQ.A0K(this.A02, gnE.A02) && this.A04 == gnE.A04 && this.A05 == gnE.A05 && 0qQ.A0K(this.A01, gnE.A01)) {
                        z = this.A06;
                        z2 = gnE.A06;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C53382GnE) {
                    gnE = (C53382GnE) obj;
                    if (gnE.A00 == 1 && this.A02 == gnE.A02 && this.A01 == gnE.A01 && this.A06 == gnE.A06 && this.A05 == gnE.A05) {
                        z = this.A04;
                        z2 = gnE.A04;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            default:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C53382GnE)) {
                    return false;
                }
                C53382GnE gnE2 = (C53382GnE) obj;
                if (gnE2.A00 == 2 && 0qQ.A0K(this.A03, gnE2.A03) && 0qQ.A0K(this.A02, gnE2.A02) && 0qQ.A0K(this.A01, gnE2.A01) && this.A06 == gnE2.A06 && this.A05 == gnE2.A05 && this.A04 == gnE2.A04) {
                    return true;
                }
                return false;
        }
        if (z != z2 || !0qQ.A0K(this.A03, gnE.A03)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A09;
        int A002;
        String str;
        switch (this.A00) {
            case 0:
                int A092 = AnonymousClass7TF.A09(this.A04, AnonymousClass7TE.A0K(this.A02));
                A09 = AnonymousClass7TF.A09(this.A06, (AnonymousClass7TF.A09(this.A05, A092) + AnonymousClass7TG.A0C(this.A01)) * 31);
                A002 = C41845B3m.A00(this.A03);
                break;
            case 1:
                int A0K = AnonymousClass7TE.A0K(this.A02);
                int A0M = AnonymousClass7TE.A0M(this.A01);
                if (1 != A0M) {
                    str = "DEFAULT";
                } else {
                    str = "REPLY_CONTROL";
                }
                A002 = AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A06, C51971G9r.A0F(str, A0M, A0K))));
                A09 = AnonymousClass7TG.A0E(this.A03);
                break;
            default:
                A002 = AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0O(this.A03)))));
                A09 = 1237;
                if (this.A04) {
                    A09 = 1231;
                    break;
                }
                break;
        }
        return A09 + A002;
    }

    public C53382GnE(String str, List list, Set set, boolean z, boolean z2, boolean z3) {
        this.A00 = 2;
        this.A03 = str;
        this.A02 = list;
        this.A01 = set;
        this.A06 = z;
        this.A05 = z2;
        this.A04 = z3;
    }

    public C53382GnE(Boolean bool, String str, List list, boolean z, boolean z2) {
        this.A00 = 0;
        this.A02 = list;
        this.A04 = false;
        this.A05 = z;
        this.A01 = bool;
        this.A06 = z2;
        this.A03 = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C53382GnE() {
        this(false, (String) null, 0sn.A00, false, false);
        this.A00 = 0;
    }
}
