package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.GLf  reason: case insensitive filesystem */
public final class C52264GLf extends C270664h6 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ boolean A02;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        if (r8.A0C != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D3u(X.C52263GLe r8) {
        /*
            r7 = this;
            r5 = 0
            X.0qQ.A0B(r8, r5)
            java.util.List r0 = r8.A09
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1D(r0)
            int r0 = r4.size()
            r6 = 1
            if (r0 <= r6) goto L_0x0051
            X.Hf1 r2 = X.GLo.A01
            com.instagram.common.session.UserSession r3 = r7.A01
            monitor-enter(r2)
            r0 = 24
            X.IwK r1 = X.C58711IwK.A00(r3, r0)     // Catch:{ all -> 0x0025 }
            java.lang.Class<X.GLo> r0 = X.GLo.class
            java.lang.Object r1 = r3.A01(r0, r1)     // Catch:{ all -> 0x0025 }
            X.GLo r1 = (X.GLo) r1     // Catch:{ all -> 0x0025 }
            goto L_0x0028
        L_0x0025:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0028:
            monitor-exit(r2)
            android.content.Context r2 = r7.A00
            boolean r0 = r8.A0D
            if (r0 == 0) goto L_0x003f
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x0037
            boolean r0 = r8.A0C
            if (r0 == 0) goto L_0x003f
        L_0x0037:
            int r0 = r4.size()
            java.util.List r4 = r4.subList(r6, r0)
        L_0x003f:
            r0 = 2
            X.0qQ.A0B(r4, r0)
            X.GLk r1 = r1.A00
            X.GLj r0 = new X.GLj
            r0.<init>(r2, r3, r4)
            android.os.Message r0 = r1.obtainMessage(r5, r0)
            r1.sendMessage(r0)
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52264GLf.D3u(X.GLe):void");
    }

    public C52264GLf(UserSession userSession, Context context, boolean z) {
        this.A01 = userSession;
        this.A00 = context;
        this.A02 = z;
    }
}
