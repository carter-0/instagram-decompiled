package X;

import com.instagram.ml.bodytracking.BodyTrackerJni;

/* renamed from: X.84a  reason: invalid class name and case insensitive filesystem */
public final class C3502784a {
    public C370308wB A00;
    public C370288w9 A01;
    public BodyTrackerJni A02;
    public String A03;
    public String A04;
    public final AnonymousClass84O A05;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r5.A04 == null) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r5 = this;
            java.lang.String r3 = r5.A03
            if (r3 == 0) goto L_0x0009
            java.lang.String r0 = r5.A04
            r1 = 1
            if (r0 != 0) goto L_0x000a
        L_0x0009:
            r1 = 0
        L_0x000a:
            r0 = 0
            if (r1 == 0) goto L_0x0065
            com.instagram.ml.bodytracking.BodyTrackerJni r4 = r5.A02
            if (r4 != 0) goto L_0x001f
            if (r3 == 0) goto L_0x001f
            java.lang.String r2 = r5.A04
            if (r2 == 0) goto L_0x001f
            r1 = 1
            com.instagram.ml.bodytracking.BodyTrackerJni r4 = new com.instagram.ml.bodytracking.BodyTrackerJni
            r4.<init>(r3, r2, r1)
            r5.A02 = r4
        L_0x001f:
            X.8wB r2 = r5.A00
            boolean r1 = r2 instanceof X.C370298wA
            if (r1 == 0) goto L_0x0065
            if (r4 == 0) goto L_0x0065
            boolean r1 = r4.isReady()
            if (r1 == 0) goto L_0x0065
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.onecamera.components.ml.intf.MlInputBitmap"
            X.0qQ.A0C(r2, r0)
            X.8wA r2 = (X.C370298wA) r2
            android.graphics.Bitmap r3 = r2.A00
            r0 = 0
            X.0qQ.A0B(r3, r0)
            int r1 = r3.getWidth()
            int r0 = r3.getHeight()
            int r1 = r1 * r0
            int r0 = r1 * 4
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r0)
            r3.copyPixelsToBuffer(r2)
            X.0qQ.A0A(r2)
            int r1 = r3.getWidth()
            int r0 = r3.getHeight()
            r4.updateFrameByteBuffer(r1, r0, r2)
            r2.clear()
            int r0 = r4.getDetectedPeopleCount()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0065:
            X.8w9 r1 = r5.A01
            if (r1 == 0) goto L_0x006c
            r1.DYh(r0)
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3502784a.A00():void");
    }

    public C3502784a(AnonymousClass84N r3) {
        AnonymousClass84O r1 = new AnonymousClass84O(r3, "body_tracking");
        this.A05 = r1;
        r1.A00(new C3502884b(this));
    }
}
