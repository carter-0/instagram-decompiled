package X;

import com.facebook.onecamera.components.mediapipeline.gl.context.igl.IglTexture;

/* renamed from: X.9b7  reason: invalid class name and case insensitive filesystem */
public final class C381069b7 extends C346337v0 {
    public final IglTexture A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C381069b7(com.facebook.onecamera.components.mediapipeline.gl.context.igl.IglTexture r6) {
        /*
            r5 = this;
            java.lang.String r1 = "IglFrameBufferTexture"
            r0 = 1
            X.0qQ.A0B(r6, r0)
            X.7uz r4 = new X.7uz
            r4.<init>(r1)
            r4.A07 = r0
            int r0 = r6.getTarget()
            r4.A03 = r0
            int r0 = r6.getHandle()
            r4.A01 = r0
            int r0 = r6.getWidth()
            r4.A04 = r0
            int r0 = r6.getHeight()
            r4.A02 = r0
            java.util.Map r0 = r6.getParams()
            java.util.Iterator r3 = X.AnonymousClass7TF.A0u(r0)
        L_0x002d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x004d
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r3)
            java.lang.Object r0 = r1.getKey()
            int r2 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r0 = r1.getValue()
            int r1 = X.AnonymousClass7TE.A0M(r0)
            android.util.SparseIntArray r0 = r4.A0A
            r0.put(r2, r1)
            goto L_0x002d
        L_0x004d:
            r5.<init>(r4)
            r5.A00 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C381069b7.<init>(com.facebook.onecamera.components.mediapipeline.gl.context.igl.IglTexture):void");
    }

    public final boolean A01() {
        this.A00.release();
        return super.A01();
    }
}
