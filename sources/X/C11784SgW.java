package X;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.List;

/* renamed from: X.SgW  reason: case insensitive filesystem */
public final class C11784SgW implements C13913TlF, C13517Tbm {
    public final Path A00 = C51965G9l.A0C();
    public final Path A01 = C51965G9l.A0C();
    public final Path A02 = C51965G9l.A0C();
    public final List A03 = AnonymousClass7TE.A1C();
    public final C11810Sgw A04;

    public final void ESm(List list, List list2) {
        int i = 0;
        while (true) {
            List list3 = this.A03;
            if (i < list3.size()) {
                ((C13687Tf4) list3.get(i)).ESm(list, list2);
                i++;
            } else {
                return;
            }
        }
    }

    public final Path Bar() {
        Path.Op op;
        Matrix matrix;
        Matrix matrix2;
        Path path = this.A01;
        path.reset();
        C11810Sgw sgw = this.A04;
        if (!sgw.A01) {
            int intValue = sgw.A00.intValue();
            if (intValue == 0) {
                int i = 0;
                while (true) {
                    List list = this.A03;
                    if (i >= list.size()) {
                        break;
                    }
                    path.addPath(((C13913TlF) list.get(i)).Bar());
                    i++;
                }
            } else {
                if (intValue == 1) {
                    op = Path.Op.UNION;
                } else if (intValue == 2) {
                    op = Path.Op.REVERSE_DIFFERENCE;
                } else if (intValue == 3) {
                    op = Path.Op.INTERSECT;
                } else if (intValue == 4) {
                    op = Path.Op.XOR;
                }
                Path path2 = this.A02;
                path2.reset();
                Path path3 = this.A00;
                path3.reset();
                List list2 = this.A03;
                for (int size = list2.size() - 1; size >= 1; size--) {
                    C13913TlF tlF = (C13913TlF) list2.get(size);
                    if (tlF instanceof C11790Sgc) {
                        C11790Sgc sgc = (C11790Sgc) tlF;
                        List A002 = sgc.A00();
                        for (int A022 = DbT.A02(A002, 1); A022 >= 0; A022--) {
                            Path Bar = ((C13913TlF) A002.get(A022)).Bar();
                            S7O s7o = sgc.A00;
                            if (s7o != null) {
                                matrix2 = s7o.A00();
                            } else {
                                matrix2 = sgc.A02;
                                matrix2.reset();
                            }
                            Bar.transform(matrix2);
                            path2.addPath(Bar);
                        }
                    } else {
                        path2.addPath(tlF.Bar());
                    }
                }
                C13913TlF tlF2 = (C13913TlF) list2.get(0);
                if (tlF2 instanceof C11790Sgc) {
                    C11790Sgc sgc2 = (C11790Sgc) tlF2;
                    List A003 = sgc2.A00();
                    for (int i2 = 0; i2 < A003.size(); i2++) {
                        Path Bar2 = ((C13913TlF) A003.get(i2)).Bar();
                        S7O s7o2 = sgc2.A00;
                        if (s7o2 != null) {
                            matrix = s7o2.A00();
                        } else {
                            matrix = sgc2.A02;
                            matrix.reset();
                        }
                        Bar2.transform(matrix);
                        path3.addPath(Bar2);
                    }
                } else {
                    path3.set(tlF2.Bar());
                }
                path.op(path3, path2, op);
                return path;
            }
        }
        return path;
    }

    public C11784SgW(C11810Sgw sgw) {
        this.A04 = sgw;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A6y(java.util.ListIterator r3) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x000d
            java.lang.Object r0 = r3.previous()
            if (r0 == r2) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = r3.previous()
            boolean r0 = r1 instanceof X.C13913TlF
            if (r0 == 0) goto L_0x000d
            java.util.List r0 = r2.A03
            r0.add(r1)
            r3.remove()
            goto L_0x000d
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11784SgW.A6y(java.util.ListIterator):void");
    }

    public final String getName() {
        throw AnonymousClass00P.createAndThrow();
    }
}
