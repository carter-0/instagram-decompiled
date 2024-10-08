package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.5ab  reason: invalid class name and case insensitive filesystem */
public final class C287685ab implements AnonymousClass5RD {
    public final Alignment A00;
    public final boolean A01;

    public final /* synthetic */ int CmW(C268014cc r2, List list, int i) {
        return C52407GRi.A00(r2, this, list, i);
    }

    public final /* synthetic */ int CmZ(C268014cc r2, List list, int i) {
        return C52407GRi.A01(r2, this, list, i);
    }

    public final /* synthetic */ int CoP(C268014cc r2, List list, int i) {
        return C52407GRi.A02(r2, this, list, i);
    }

    public final /* synthetic */ int CoS(C268014cc r2, List list, int i) {
        return C52407GRi.A03(r2, this, list, i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C287685ab) {
                C287685ab r5 = (C287685ab) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BoxMeasurePolicy(alignment=");
        sb.append(this.A00);
        sb.append(", propagateMinConstraints=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, X.0rk] */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object, X.0rk] */
    public final C289145d6 Cnx(C268004cb r24, List list, long j) {
        long A04;
        int i;
        int i2;
        0sP ayH;
        C289105d1 r8;
        C289105d1 r82;
        C295445oA r10;
        C267974cY Cnz;
        C289105d1 r4;
        List list2 = list;
        C268004cb r13 = r24;
        if (list2.isEmpty()) {
            i = Constraints.A03(j);
            i2 = Constraints.A02(j);
            r10 = C295445oA.A00;
        } else {
            if (this.A01) {
                A04 = j;
            } else {
                A04 = Constraints.A04(0, Constraints.A01(j), 0, Constraints.A00(j));
            }
            if (list2.size() == 1) {
                C268074ci r12 = (C268074ci) list2.get(0);
                Object BaX = r12.BaX();
                if (!(BaX instanceof C289105d1) || (r4 = (C289105d1) BaX) == null || !r4.A01) {
                    Cnz = r12.Cnz(A04);
                    i = Math.max(Constraints.A03(j), Cnz.A01);
                    i2 = Math.max(Constraints.A02(j), Cnz.A00);
                } else {
                    i = Constraints.A03(j);
                    i2 = Constraints.A02(j);
                    Cnz = r12.Cnz(C288985co.A02(i, i2));
                }
                ayH = new AnonymousClass9MW(Cnz, r12, r13, this, i, i2, 0);
            } else {
                C267974cY[] r7 = new C267974cY[list2.size()];
                ? obj = new Object();
                obj.A00 = Constraints.A03(j);
                ? obj2 = new Object();
                obj2.A00 = Constraints.A02(j);
                int size = list2.size();
                boolean z = false;
                for (int i3 = 0; i3 < size; i3++) {
                    C268074ci r11 = (C268074ci) list2.get(i3);
                    Object BaX2 = r11.BaX();
                    if (!(BaX2 instanceof C289105d1) || (r82 = (C289105d1) BaX2) == null || !r82.A01) {
                        C267974cY Cnz2 = r11.Cnz(A04);
                        r7[i3] = Cnz2;
                        obj.A00 = Math.max(obj.A00, Cnz2.A01);
                        obj2.A00 = Math.max(obj2.A00, Cnz2.A00);
                    } else {
                        z = true;
                    }
                }
                if (z) {
                    int i4 = obj.A00;
                    int i5 = i4;
                    if (i4 == Integer.MAX_VALUE) {
                        i4 = 0;
                    }
                    int i6 = obj2.A00;
                    int i7 = 0;
                    if (i6 != Integer.MAX_VALUE) {
                        i7 = i6;
                    }
                    long A042 = AnonymousClass5SF.A04(i4, i5, i7, i6);
                    int size2 = list2.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        C268074ci r9 = (C268074ci) list2.get(i8);
                        Object BaX3 = r9.BaX();
                        if ((BaX3 instanceof C289105d1) && (r8 = (C289105d1) BaX3) != null && r8.A01) {
                            r7[i8] = r9.Cnz(A042);
                        }
                    }
                }
                i = obj.A00;
                i2 = obj2.A00;
                ayH = new C41665AyH(this, r13, list2, obj, obj2, r7);
            }
            r10 = ayH;
        }
        return r13.Cfi(0Yt.A0E(), r10, i, i2);
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return hashCode + i;
    }

    public C287685ab(Alignment alignment, boolean z) {
        this.A00 = alignment;
        this.A01 = z;
    }
}
