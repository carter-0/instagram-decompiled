package X;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

public final class S7Y {
    public C12540Swq A00;
    public final int A01;
    public final String A02;
    public final ArrayList A03 = AnonymousClass7TE.A1C();
    public final TreeSet A04 = new TreeSet();

    public final long A00(long j, long j2) {
        boolean z = true;
        C256703wD.A03(Pxf.A1R((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        if (j2 < 0) {
            z = false;
        }
        C256703wD.A03(z);
        Qoa A012 = A01(j, j2);
        long j3 = Long.MAX_VALUE;
        if (!A012.A07) {
            long j4 = A012.A03;
            if (j4 != -1) {
                j3 = j4;
            }
            return -Math.min(j3, j2);
        }
        long j5 = j + j2;
        if (j5 >= 0) {
            j3 = j5;
        }
        long j6 = A012.A04 + A012.A03;
        if (j6 < j3) {
            for (2R9 r7 : this.A04.tailSet(A012, false)) {
                long j7 = r7.A04;
                if (j7 > j6) {
                    break;
                }
                j6 = Math.max(j6, j7 + r7.A03);
                if (j6 >= j3) {
                    break;
                }
            }
        }
        return Math.min(j6 - j, j2);
    }

    public final void A02(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A03;
            if (i >= arrayList.size()) {
                throw Pxe.A0i();
            } else if (((C10461Rsc) arrayList.get(i)).A01 == j) {
                arrayList.remove(i);
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean A03(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A03;
            if (i >= arrayList.size()) {
                return false;
            }
            C10461Rsc rsc = (C10461Rsc) arrayList.get(i);
            long j3 = rsc.A00;
            if (j3 != -1) {
                if (j2 != -1) {
                    long j4 = rsc.A01;
                    if (j4 <= j && j + j2 <= j4 + j3) {
                        break;
                    }
                } else {
                    continue;
                }
                i++;
            } else if (j >= rsc.A01) {
                break;
            } else {
                i++;
            }
        }
        return true;
    }

    public final boolean A04(long j, long j2) {
        int i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.A03;
            if (i2 < arrayList.size()) {
                C10461Rsc rsc = (C10461Rsc) arrayList.get(i2);
                long j3 = rsc.A01;
                if (j3 <= j) {
                    long j4 = rsc.A00;
                    if (j4 == -1) {
                        return false;
                    }
                    i = ((j3 + j4) > j ? 1 : ((j3 + j4) == j ? 0 : -1));
                } else if (j2 == -1) {
                    return false;
                } else {
                    i = ((j + j2) > j3 ? 1 : ((j + j2) == j3 ? 0 : -1));
                }
                if (i > 0) {
                    return false;
                }
                i2++;
            } else {
                arrayList.add(new C10461Rsc(j, j2));
                return true;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            S7Y s7y = (S7Y) obj;
            if (this.A01 != s7y.A01 || !this.A02.equals(s7y.A02) || !this.A04.equals(s7y.A04) || !this.A00.equals(s7y.A00)) {
                return false;
            }
        }
        return true;
    }

    public final Qoa A01(long j, long j2) {
        long j3 = j2;
        String str = this.A02;
        long j4 = j;
        2R9 r8 = new 2R9((File) null, str, j4, -1, -9223372036854775807L);
        TreeSet treeSet = this.A04;
        Qoa qoa = (Qoa) treeSet.floor(r8);
        if (qoa != null && qoa.A04 + qoa.A03 > j) {
            return qoa;
        }
        2R9 r0 = (2R9) treeSet.ceiling(r8);
        if (r0 != null) {
            long j5 = r0.A04 - j;
            if (j2 == -1) {
                j3 = j5;
            } else {
                j3 = Math.min(j5, j3);
            }
        }
        return new 2R9((File) null, str, j4, j3, -9223372036854775807L);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A08(this.A02, this.A01 * 31));
    }

    public S7Y(C12540Swq swq, String str, int i) {
        this.A01 = i;
        this.A02 = str;
        this.A00 = swq;
    }
}
