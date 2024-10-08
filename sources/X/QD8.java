package X;

import android.util.SparseArray;
import com.facebookpay.form.cell.CellParams;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

public final class QD8 extends 2YL {
    public C11231SGq A00;
    public ImmutableList A01;
    public final AnonymousClass2gB A02 = Pxh.A0M();
    public final AnonymousClass2gB A03 = Pxh.A0M();
    public final AnonymousClass2Fj A04 = JTO.A0K();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.SRc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.SRc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: X.SRc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.SRc} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.SRc A01(int r5) {
        /*
            r4 = this;
            com.google.common.collect.ImmutableList r0 = r4.A01
            r3 = 0
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "cellViewModels"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000f:
            java.util.Iterator r2 = r0.iterator()
        L_0x0013:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0025
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.SRc r0 = (X.SRc) r0
            int r0 = r0.A02
            if (r0 != r5) goto L_0x0013
            r3 = r1
        L_0x0025:
            X.SRc r3 = (X.SRc) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QD8.A01(int):X.SRc");
    }

    public final void A02() {
        ImmutableList immutableList = this.A01;
        if (immutableList != null) {
            Iterator it = immutableList.iterator();
            boolean z = true;
            while (it.hasNext()) {
                SRc sRc = (SRc) it.next();
                sRc.A0G(z);
                if (z && !sRc.A0K()) {
                    z = false;
                }
            }
        }
    }

    public final void A03(C11231SGq sGq, ImmutableList immutableList) {
        AnonymousClass2Fj r4 = this.A04;
        r4.A0B(immutableList);
        this.A00 = sGq;
        ImmutableList immutableList2 = this.A01;
        if (immutableList2 != null && !immutableList2.isEmpty()) {
            ImmutableList immutableList3 = this.A01;
            if (immutableList3 == null) {
                0qQ.A0F("cellViewModels");
                throw AnonymousClass00P.createAndThrow();
            }
            C249803kO A0J = C66580MXl.A0J(immutableList3);
            while (A0J.hasNext()) {
                SRc sRc = (SRc) A0J.next();
                this.A02.A0D(sRc.A0C());
                sRc.A0E();
            }
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        Object A022 = r4.A02();
        if (A022 != null) {
            C249803kO A0J2 = C66580MXl.A0J((ImmutableCollection) A022);
            while (A0J2.hasNext()) {
                CellParams cellParams = (CellParams) A0J2.next();
                SRc A012 = cellParams.A01();
                cellParams.A00 = A012;
                A012.A0F(this.A00);
                Pxi.A1A(A012.A0C(), this.A02, TY1.A00(this, 24), 12);
                builder.add(A012);
                Pxi.A1A(A012.A05, this.A03, TY1.A00(this, 25), 12);
            }
            this.A01 = builder.build();
            JTP.A1B(this.A03, A04());
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final boolean A04() {
        ImmutableList immutableList = this.A01;
        if (immutableList == null) {
            0qQ.A0F("cellViewModels");
            throw AnonymousClass00P.createAndThrow();
        }
        C249803kO A0J = C66580MXl.A0J(immutableList);
        while (A0J.hasNext()) {
            if (!((SRc) A0J.next()).A0K()) {
                return false;
            }
        }
        return true;
    }

    public final void onCleared() {
        ImmutableList immutableList = this.A01;
        if (immutableList != null) {
            Iterator it = immutableList.iterator();
            while (it.hasNext()) {
                ((SRc) it.next()).A0E();
            }
        }
    }

    public final SparseArray A00() {
        SparseArray A0L = Pxe.A0L();
        ImmutableList immutableList = this.A01;
        if (immutableList != null) {
            int size = immutableList.size();
            int i = 0;
            while (i < size) {
                ImmutableList immutableList2 = this.A01;
                if (immutableList2 != null) {
                    SparseArray A0B = ((SRc) immutableList2.get(i)).A0B();
                    int size2 = A0B.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        Pxi.A17(A0B, A0L, i2);
                    }
                    i++;
                }
            }
            return A0L;
        }
        0qQ.A0F("cellViewModels");
        throw AnonymousClass00P.createAndThrow();
    }
}
