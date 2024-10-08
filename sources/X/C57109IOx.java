package X;

import android.content.Context;

/* renamed from: X.IOx  reason: case insensitive filesystem */
public final class C57109IOx implements C226632hb {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass3OA A02;

    public C57109IOx(Context context, AnonymousClass3OA r2, int i) {
        this.A00 = i;
        this.A02 = r2;
        this.A01 = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c0, code lost:
        if (r8 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0044, code lost:
        if (X.0qQ.A0K(r8.A0C, true) == false) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap renderImage(android.graphics.Bitmap r17) {
        /*
            r16 = this;
            r6 = 0
            r7 = r17
            X.0qQ.A0B(r7, r6)
            r10 = r16
            int r5 = r10.A00
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r5, r5, r0)
            X.0qQ.A07(r4)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r4)
            X.3OA r0 = r10.A02
            X.4gF r8 = r0.A0F
            r9 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)
            if (r8 == 0) goto L_0x00b7
            java.lang.Boolean r0 = r8.A06
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 == 0) goto L_0x00b7
            r15 = 9
            r1 = 1090519040(0x41000000, float:8.0)
            android.content.Context r0 = r10.A01
            float r10 = X.C61380mr.A00(r0, r1)
        L_0x0035:
            java.lang.Boolean r0 = r8.A06
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 == 0) goto L_0x0046
            java.lang.Boolean r0 = r8.A0C
            boolean r0 = X.0qQ.A0K(r0, r2)
            r1 = 1
            if (r0 != 0) goto L_0x0047
        L_0x0046:
            r1 = 0
        L_0x0047:
            android.graphics.Paint r8 = X.AnonymousClass7TE.A0V(r9)
            r0 = -256(0xffffffffffffff00, float:NaN)
            r8.setColor(r0)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L_0x00b4
            r11 = 1073741824(0x40000000, float:2.0)
            float r13 = (float) r5
            float r13 = r13 - r0
        L_0x0058:
            r12 = r11
            r14 = r13
            android.graphics.Path r0 = X.C63118Krm.A00(r10, r11, r12, r13, r14, r15)
            r0.close()
            r3.drawPath(r0, r8)
            int r1 = r7.getWidth()
            int r0 = r7.getHeight()
            if (r1 < r0) goto L_0x009a
            int r1 = r7.getWidth()
            int r0 = r7.getHeight()
            int r1 = r1 - r0
            int r2 = r1 / 2
            int r1 = r7.getWidth()
            int r1 = r1 - r2
            int r0 = r7.getHeight()
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>(r2, r6, r1, r0)
        L_0x0087:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuffXfermode r0 = new android.graphics.PorterDuffXfermode
            r0.<init>(r1)
            r8.setXfermode(r0)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r6, r6, r5, r5)
            r3.drawBitmap(r7, r9, r0, r8)
            return r4
        L_0x009a:
            int r1 = r7.getHeight()
            int r0 = r7.getWidth()
            int r1 = r1 - r0
            int r2 = r1 / 2
            int r1 = r7.getWidth()
            int r0 = r7.getHeight()
            int r0 = r0 - r2
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>(r6, r2, r1, r0)
            goto L_0x0087
        L_0x00b4:
            r11 = 0
            float r13 = (float) r5
            goto L_0x0058
        L_0x00b7:
            r15 = 15
            android.content.Context r0 = r10.A01
            int r0 = X.AnonymousClass7TG.A03(r0)
            float r10 = (float) r0
            if (r8 == 0) goto L_0x0046
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57109IOx.renderImage(android.graphics.Bitmap):android.graphics.Bitmap");
    }
}
