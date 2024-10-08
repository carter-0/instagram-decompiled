package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vji  reason: case insensitive filesystem */
public abstract class C18006Vji {
    public String A00;
    public boolean A01 = true;
    public final VLB A02;
    public final V4I A03;
    public final C15046UKz A04;
    public final List A05;

    public C18006Vji(VLB vlb, V4I v4i, C15046UKz uKz) {
        this.A03 = v4i;
        this.A02 = vlb;
        this.A04 = uKz;
        v4i.A03 = new VLO(this);
        this.A05 = new ArrayList();
    }

    public void A00() {
        this.A03.A00();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0089, code lost:
        r1.A00(r0, r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C16482Uvc r6, java.lang.String r7) {
        /*
            r5 = this;
            java.util.List r0 = r5.A05
            java.util.Iterator r4 = r0.iterator()
        L_0x0006:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r3 = r4.next()
            X.VzM r3 = (X.C18741VzM) r3
            X.Vl1 r1 = r3.A05
            if (r1 == 0) goto L_0x001f
            r0 = 2263(0x8d7, float:3.171E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.A00(r0)
        L_0x001f:
            X.Vl1 r2 = r3.A05
            if (r2 == 0) goto L_0x002e
            boolean r0 = r6 instanceof X.UI5
            if (r0 == 0) goto L_0x008e
            java.lang.String r1 = "timeout"
        L_0x0029:
            java.lang.String r0 = "fallbackType"
            r2.A03(r0, r1)
        L_0x002e:
            int[] r1 = X.VJW.A00
            int r0 = r6.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L_0x0083;
                case 2: goto L_0x0068;
                case 3: goto L_0x0061;
                case 4: goto L_0x005a;
                case 5: goto L_0x0053;
                case 6: goto L_0x004c;
                case 7: goto L_0x003a;
                default: goto L_0x0039;
            }
        L_0x0039:
            goto L_0x0006
        L_0x003a:
            if (r7 == 0) goto L_0x0006
            X.Vl1 r1 = r3.A05
            if (r1 == 0) goto L_0x0045
            java.lang.String r0 = "inSessionMemoryTrimType"
            r1.A03(r0, r7)
        L_0x0045:
            X.Vg0 r1 = r3.A02
            if (r1 == 0) goto L_0x0006
            java.lang.Integer r0 = X.AnonymousClass05K.A02
            goto L_0x0089
        L_0x004c:
            X.Vg0 r1 = r3.A02
            if (r1 == 0) goto L_0x0006
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            goto L_0x0089
        L_0x0053:
            X.Vg0 r1 = r3.A02
            if (r1 == 0) goto L_0x0006
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            goto L_0x0089
        L_0x005a:
            X.Vg0 r1 = r3.A02
            if (r1 == 0) goto L_0x0006
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            goto L_0x0089
        L_0x0061:
            X.Vg0 r1 = r3.A02
            if (r1 == 0) goto L_0x0006
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x0089
        L_0x0068:
            if (r7 != 0) goto L_0x0072
            r0 = 175(0xaf, float:2.45E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r3.A09 = r0
        L_0x0072:
            X.Vl1 r2 = r3.A05
            if (r2 == 0) goto L_0x007c
            r1 = 3
            java.lang.String r0 = "AVATAR_INITIAL_CHECK_FAILED"
            r2.A04(r0, r1)
        L_0x007c:
            X.Vg0 r1 = r3.A02
            if (r1 == 0) goto L_0x0006
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            goto L_0x0089
        L_0x0083:
            X.Vg0 r1 = r3.A02
            if (r1 == 0) goto L_0x0006
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
        L_0x0089:
            r1.A00(r0, r7)
            goto L_0x0006
        L_0x008e:
            boolean r0 = r6 instanceof X.UI4
            if (r0 == 0) goto L_0x0095
            java.lang.String r1 = "unSupportedNetworkInitial"
            goto L_0x0029
        L_0x0095:
            boolean r0 = r6 instanceof X.UI3
            if (r0 == 0) goto L_0x009c
            java.lang.String r1 = "unSupportedNetwork"
            goto L_0x0029
        L_0x009c:
            boolean r0 = r6 instanceof X.UI2
            if (r0 == 0) goto L_0x00a3
            java.lang.String r1 = "lowMemory"
            goto L_0x0029
        L_0x00a3:
            boolean r0 = r6 instanceof X.UI1
            if (r0 == 0) goto L_0x00aa
            java.lang.String r1 = "initialCheckFailed"
            goto L_0x0029
        L_0x00aa:
            boolean r0 = r6 instanceof X.UI0
            if (r0 == 0) goto L_0x00b2
            java.lang.String r1 = "effectLoadFailed"
            goto L_0x0029
        L_0x00b2:
            java.lang.String r1 = "avatarLoadFailed"
            goto L_0x0029
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18006Vji.A01(X.Uvc, java.lang.String):void");
    }
}
