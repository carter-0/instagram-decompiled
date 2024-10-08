package X;

import java.util.ArrayList;
import java.util.List;

public final class AWX implements 2IR {
    public final List A00;
    public final List A01;
    public final boolean A02;
    public final String A03;
    public final 0sP A04;
    public final /* synthetic */ A94 A05;

    public final void onFailure(Throwable th) {
        0qQ.A0B(th, 0);
        this.A05.A03.remove(this.A03);
        if (this.A02) {
            for (1P0 onFail : this.A01) {
                onFail.onFail(new C268664dn(th));
            }
            return;
        }
        for (2IR onFailure : this.A00) {
            onFailure.onFailure(th);
        }
    }

    public AWX(2IR r3, A94 a94, 1P0 r5, String str, 0sP r7) {
        this.A05 = a94;
        this.A03 = str;
        this.A04 = r7;
        boolean z = true;
        this.A00 = 0sr.A1M(new 2IR[]{r3});
        ArrayList A1M = 0sr.A1M(new 1P0[]{r5});
        this.A01 = A1M;
        this.A02 = !(A1M.isEmpty() ^ true) ? false : z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r4 != null) goto L_0x0048;
     */
    /* renamed from: A00 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSuccess(X.AnonymousClass3JD r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0065
            X.A94 r3 = r5.A05
            boolean r0 = r6 instanceof X.AnonymousClass3JC
            r4 = 0
            if (r0 == 0) goto L_0x0011
            r4 = r6
            java.util.Map r1 = r3.A04
            java.lang.String r0 = r5.A03
            r1.put(r0, r6)
        L_0x0011:
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x0046
            if (r4 == 0) goto L_0x005e
            X.0sP r0 = r5.A04
            java.lang.Object r2 = r0.invoke(r6)
            boolean r0 = r2 instanceof X.1XU
            if (r0 == 0) goto L_0x0048
            if (r2 == 0) goto L_0x0048
            java.util.Map r1 = r3.A05
            java.lang.String r0 = r5.A03
            r1.put(r0, r2)
            java.util.List r0 = r5.A01
            java.util.Iterator r1 = r0.iterator()
        L_0x0030:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005e
            java.lang.Object r0 = r1.next()
            X.1P0 r0 = (X.1P0) r0
            r0.onSuccessInBackground(r2)
            r0.onFinish()
            r0.onSuccess(r2)
            goto L_0x0030
        L_0x0046:
            if (r4 == 0) goto L_0x005e
        L_0x0048:
            java.util.List r0 = r5.A00
            java.util.Iterator r1 = r0.iterator()
        L_0x004e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005e
            java.lang.Object r0 = r1.next()
            X.2IR r0 = (X.2IR) r0
            r0.onSuccess(r4)
            goto L_0x004e
        L_0x005e:
            java.util.Map r1 = r3.A03
            java.lang.String r0 = r5.A03
            r1.remove(r0)
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AWX.onSuccess(X.3JD):void");
    }
}
