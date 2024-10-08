package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.lang.ref.WeakReference;

/* renamed from: X.Vhm  reason: case insensitive filesystem */
public final class C17895Vhm {
    public C365208mi A00;
    public SurfaceTexture A01;
    public Surface A02;
    public C14966UHe A03;
    public final XBS A04;
    public final WeakReference A05;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        if (r1 != null) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.graphics.SurfaceTexture r4, int r5, int r6) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof X.U0U
            if (r0 != 0) goto L_0x0045
            android.graphics.SurfaceTexture r0 = r3.A01
            if (r0 == r4) goto L_0x0011
            android.view.Surface r0 = new android.view.Surface
            r0.<init>(r4)
            r3.A02 = r0
            r3.A01 = r4
        L_0x0011:
            X.8mi r0 = r3.A00
            android.view.Surface r2 = r3.A02
            if (r0 != 0) goto L_0x0041
            X.8KV r1 = X.AnonymousClass8KV.PREVIEW
            X.8mi r0 = new X.8mi
            r0.<init>(r2, r1, r5, r6)
            r3.A00 = r0
        L_0x0020:
            java.lang.ref.WeakReference r2 = r3.A05
            java.lang.Object r1 = r2.get()
            X.VwH r1 = (X.C18660VwH) r1
            if (r1 == 0) goto L_0x002f
            X.8mi r0 = r3.A00
        L_0x002c:
            r1.A04(r0)
        L_0x002f:
            java.lang.Object r2 = r2.get()
            X.VwH r2 = (X.C18660VwH) r2
            if (r2 == 0) goto L_0x0040
            X.XBS r1 = r3.A04
            X.8n3 r0 = r1.CE6()
            r2.A03(r0, r1)
        L_0x0040:
            return
        L_0x0041:
            r0.A01(r2, r5, r6)
            goto L_0x0020
        L_0x0045:
            X.UHe r0 = r3.A03
            if (r0 != 0) goto L_0x0050
            X.UHe r0 = new X.UHe
            r0.<init>(r4)
            r3.A03 = r0
        L_0x0050:
            java.lang.ref.WeakReference r2 = r3.A05
            java.lang.Object r1 = r2.get()
            X.VwH r1 = (X.C18660VwH) r1
            if (r1 == 0) goto L_0x002f
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17895Vhm.A00(android.graphics.SurfaceTexture, int, int):void");
    }

    public C17895Vhm(C18660VwH vwH, XBS xbs) {
        this.A05 = new WeakReference(vwH);
        this.A04 = xbs;
    }
}
