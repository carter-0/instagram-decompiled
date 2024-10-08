package androidx.compose.foundation;

import X.19B;
import X.1Eo;
import X.AnonymousClass4D7;
import X.AnonymousClass5VD;
import X.AnonymousClass5aS;
import X.C262224Cq;
import X.C267794cD;
import X.C287605aT;
import X.C304926Ft;
import X.C56842IEp;
import X.C56845IEs;
import X.C59676JTh;
import X.GWN;

public final class HoverableNode extends C267794cD implements AnonymousClass5VD {
    public C287605aT A00;
    public C56842IEp A01;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v0, types: [X.JL5, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(androidx.compose.foundation.HoverableNode r6, X.AnonymousClass4D7 r7) {
        /*
            r3 = 0
            boolean r0 = X.C66146MDy.A02(r3, r7)
            if (r0 == 0) goto L_0x004b
            r5 = r7
            X.MDy r5 = (X.C66146MDy) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004b
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r4 = r5.A03
            X.1Hj r3 = X.1Hj.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L_0x0030
            if (r0 != r2) goto L_0x0051
            java.lang.Object r1 = r5.A02
            X.IEp r1 = (X.C56842IEp) r1
            java.lang.Object r6 = r5.A01
            androidx.compose.foundation.HoverableNode r6 = (androidx.compose.foundation.HoverableNode) r6
            X.0eS.A00(r4)
        L_0x002b:
            r6.A01 = r1
        L_0x002d:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x0030:
            X.0eS.A00(r4)
            X.IEp r0 = r6.A01
            if (r0 != 0) goto L_0x002d
            X.IEp r1 = new X.IEp
            r1.<init>()
            X.5aT r0 = r6.A00
            r5.A01 = r6
            r5.A02 = r1
            r5.A00 = r2
            java.lang.Object r0 = r0.ARE(r1, r5)
            if (r0 != r3) goto L_0x002b
            return r3
        L_0x004b:
            X.MDy r5 = new X.MDy
            r5.<init>(r6, r7, r3)
            goto L_0x0015
        L_0x0051:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableNode.A00(androidx.compose.foundation.HoverableNode, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDw, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(androidx.compose.foundation.HoverableNode r5, X.AnonymousClass4D7 r6) {
        /*
            r3 = 0
            boolean r0 = X.C66144MDw.A02(r3, r6)
            if (r0 == 0) goto L_0x0046
            r4 = r6
            X.MDw r4 = (X.C66144MDw) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0046
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 != r2) goto L_0x004c
            java.lang.Object r5 = r4.A01
            androidx.compose.foundation.HoverableNode r5 = (androidx.compose.foundation.HoverableNode) r5
            X.0eS.A00(r1)
        L_0x0027:
            r0 = 0
            r5.A01 = r0
        L_0x002a:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x002d:
            X.0eS.A00(r1)
            X.IEp r0 = r5.A01
            if (r0 == 0) goto L_0x002a
            X.IEs r1 = new X.IEs
            r1.<init>(r0)
            X.5aT r0 = r5.A00
            r4.A01 = r5
            r4.A00 = r2
            java.lang.Object r0 = r0.ARE(r1, r4)
            if (r0 != r3) goto L_0x0027
            return r3
        L_0x0046:
            X.MDw r4 = new X.MDw
            r4.<init>(r5, r6, r3)
            goto L_0x0015
        L_0x004c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableNode.A01(androidx.compose.foundation.HoverableNode, X.4D7):java.lang.Object");
    }

    public static final void A02(HoverableNode hoverableNode) {
        C56842IEp iEp = hoverableNode.A01;
        if (iEp != null) {
            ((AnonymousClass5aS) hoverableNode.A00).A00.FIA(new C56845IEs(iEp));
            hoverableNode.A01 = null;
        }
    }

    public final /* synthetic */ boolean CNf() {
        return false;
    }

    public final void DXw(C304926Ft r5, GWN gwn, long j) {
        C262224Cq A05;
        int i;
        if (gwn == GWN.Main) {
            int i2 = r5.A00;
            boolean z = false;
            if (i2 == 4) {
                z = true;
            }
            if (z) {
                A05 = A05();
                i = 1;
            } else if (i2 == 5) {
                A05 = A05();
                i = 2;
            } else {
                return;
            }
            1Eo.A05(19B.A00, new C59676JTh((Object) this, (AnonymousClass4D7) null, i), A05);
        }
    }

    public final /* synthetic */ boolean Era() {
        return false;
    }

    public final void A0F() {
        A02(this);
    }

    public final void D0Z() {
        A02(this);
    }

    public final /* synthetic */ void D8P() {
        A02(this);
    }

    public final /* synthetic */ void Dyp() {
        A02(this);
    }
}
