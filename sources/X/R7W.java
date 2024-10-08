package X;

import java.util.EnumSet;

public final class R7W extends SPJ {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public R7W(X.C8871RDn r3, X.C8904REw r4, int r5) {
        /*
            r2 = this;
            r2.A00 = r5
            switch(r5) {
                case 1: goto L_0x000f;
                case 2: goto L_0x0011;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x0013;
                case 6: goto L_0x0015;
                case 7: goto L_0x0017;
                case 8: goto L_0x001a;
                default: goto L_0x0005;
            }
        L_0x0005:
            r1 = 16
        L_0x0007:
            java.util.EnumSet r0 = java.util.EnumSet.of(r3)
            r2.<init>(r3, r4, r0, r1)
            return
        L_0x000f:
            r1 = 1
            goto L_0x0007
        L_0x0011:
            r1 = 2
            goto L_0x0007
        L_0x0013:
            r1 = 5
            goto L_0x0007
        L_0x0015:
            r1 = 6
            goto L_0x0007
        L_0x0017:
            r1 = 10
            goto L_0x0007
        L_0x001a:
            r1 = 17
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: X.R7W.<init>(X.RDn, X.REw, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public R7W(X.C8904REw r4, java.util.EnumSet r5) {
        /*
            r3 = this;
            r2 = 4
            r3.A00 = r2
            X.RDn r1 = X.C8871RDn.Primitive
            boolean r0 = r5.contains(r1)
            if (r0 != 0) goto L_0x000d
            X.RDn r1 = X.C8871RDn.Constructed
        L_0x000d:
            r3.<init>(r1, r4, r5, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.R7W.<init>(X.REw, java.util.EnumSet):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public R7W(X.C8904REw r3, java.util.EnumSet r4, int r5) {
        /*
            r2 = this;
            r0 = 0
            r2.A00 = r0
            X.RDn r1 = X.C8871RDn.Primitive
            boolean r0 = r4.contains(r1)
            if (r0 != 0) goto L_0x000d
            X.RDn r1 = X.C8871RDn.Constructed
        L_0x000d:
            r2.<init>(r1, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.R7W.<init>(X.REw, java.util.EnumSet, int):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public R7W(C8871RDn rDn, C8904REw rEw, EnumSet enumSet) {
        super(rDn, rEw, enumSet, 3);
        this.A00 = 3;
    }
}
