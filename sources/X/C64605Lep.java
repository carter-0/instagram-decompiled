package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.Lep  reason: case insensitive filesystem */
public final class C64605Lep implements 1Qd {
    public String A00;
    public 2ZD A01;
    public final ByteArrayOutputStream A02 = new ByteArrayOutputStream();
    public final /* synthetic */ LDi A03;

    public final void onNewData(ByteBuffer byteBuffer) {
        0qQ.A0B(byteBuffer, 0);
        JTU.A1I(this.A02, byteBuffer);
    }

    public C64605Lep(LDi lDi) {
        this.A03 = lDi;
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x001e A[LOOP:0: B:5:0x001e->B:8:0x0030, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onComplete() {
        /*
            r3 = this;
            X.2ZD r0 = r3.A01
            if (r0 == 0) goto L_0x0044
            int r1 = r0.A01
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x0044
            java.io.ByteArrayOutputStream r0 = r3.A02
            java.lang.String r0 = r0.toString()
            X.16F r0 = X.16P.A00(r0)
            X.JwF r2 = X.C63156KsP.parseFromJson(r0)
            java.lang.Object r0 = r2.A00
            java.util.Iterator r1 = X.C51966G9m.A1H(r0)
        L_0x001e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r1.next()
            X.GNY r0 = (X.GNY) r0
            java.lang.Object r0 = r0.A01
            boolean r0 = X.G9w.A1b(r0)
            if (r0 == 0) goto L_0x001e
        L_0x0032:
            java.lang.System.currentTimeMillis()
            X.LDi r0 = r3.A03
            X.MTU r1 = r0.A00
            if (r1 == 0) goto L_0x0043
            java.lang.String r0 = r3.A00
            X.0qQ.A0A(r0)
            r1.DtV(r2, r0)
        L_0x0043:
            return
        L_0x0044:
            java.lang.System.currentTimeMillis()
            X.LDi r0 = r3.A03
            X.MTU r0 = r0.A00
            if (r0 == 0) goto L_0x0043
            r0.DtU()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64605Lep.onComplete():void");
    }

    public final void onFailed(IOException iOException) {
        System.currentTimeMillis();
        MTU mtu = this.A03.A00;
        if (mtu != null) {
            mtu.DtU();
        }
    }

    public final void onResponseStarted(2ZD r1) {
        this.A01 = r1;
    }
}
