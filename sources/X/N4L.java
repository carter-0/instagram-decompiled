package X;

import java.util.List;

public final class N4L extends AnonymousClass0T0 {
    public Object A00;
    public final int A01 = 2;
    public final Object A02;
    public final Object A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public N4L(Boolean bool, boolean z) {
        this(bool, false, false, z, false);
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.A01) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof N4L)) {
                    return false;
                }
                N4L n4l = (N4L) obj;
                if (n4l.A01 == 0 && 0qQ.A0K(this.A00, n4l.A00) && 0qQ.A0K(this.A02, n4l.A02) && 0qQ.A0K(this.A03, n4l.A03) && this.A06 == n4l.A06 && this.A04 == n4l.A04 && this.A05 == n4l.A05) {
                    return true;
                }
                return false;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof N4L) {
                    N4L n4l2 = (N4L) obj;
                    if (n4l2.A01 == 1 && this.A05 == n4l2.A05 && this.A06 == n4l2.A06 && this.A04 == n4l2.A04 && 0qQ.A0K(this.A03, n4l2.A03)) {
                        obj2 = this.A02;
                        obj3 = n4l2.A02;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof N4L) {
                    N4L n4l3 = (N4L) obj;
                    if (n4l3.A01 == 2 && 0qQ.A0K(this.A02, n4l3.A02) && this.A05 == n4l3.A05 && this.A04 == n4l3.A04 && this.A06 == n4l3.A06 && 0qQ.A0K(this.A00, n4l3.A00)) {
                        obj2 = this.A03;
                        obj3 = n4l3.A03;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A09;
        int i;
        switch (this.A01) {
            case 0:
                A09 = AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A00)))));
                i = 1237;
                if (this.A05) {
                    i = 1231;
                    break;
                }
                break;
            case 1:
                i = (AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A06, C51965G9l.A05(this.A05))) + AnonymousClass7TG.A0C(this.A03)) * 31;
                A09 = AnonymousClass7TE.A0L(this.A02);
                break;
            default:
                A09 = AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A05, AnonymousClass7TE.A0K(this.A02)))));
                i = AnonymousClass7TG.A0C(this.A03);
                break;
        }
        return i + A09;
    }

    public final String toString() {
        if (2 - this.A01 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LinkedOpenThreadLoadingState(threadId=");
        A1A.append(this.A02);
        A1A.append(", hasIncompleteRequest=");
        A1A.append(this.A05);
        A1A.append(", hasFirstPageBeenRequested=");
        A1A.append(this.A04);
        A1A.append(", hasLoadedOldestMessage=");
        A1A.append(this.A06);
        A1A.append(", viewModelList=");
        A1A.append(this.A00);
        A1A.append(", threadMetadata=");
        return AnonymousClass7TG.A0n(this.A03, A1A);
    }

    public N4L(Boolean bool, Boolean bool2, boolean z, boolean z2, boolean z3) {
        this.A05 = z;
        this.A06 = z2;
        this.A04 = z3;
        this.A03 = bool;
        this.A02 = bool2;
    }

    public N4L(AnonymousClass7SD r2, C254763t0 r3, List list, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(list, 5);
        this.A02 = r3;
        this.A05 = z;
        this.A04 = z2;
        this.A06 = z3;
        this.A00 = list;
        this.A03 = r2;
    }

    public N4L(C53368Gms gms, C53368Gms gms2, C53368Gms gms3, boolean z, boolean z2, boolean z3) {
        this.A00 = gms;
        this.A02 = gms2;
        this.A03 = gms3;
        this.A06 = z;
        this.A04 = z2;
        this.A05 = z3;
    }

    public N4L(AnonymousClass7SD r9, C254763t0 r10) {
        this(r9, r10, (List) 0sn.A00, false, false, false);
    }
}
