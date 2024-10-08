package X;

import android.os.Handler;
import java.nio.ByteBuffer;

/* renamed from: X.SVt  reason: case insensitive filesystem */
public final class C11455SVt implements Handler.Callback {
    public ByteBuffer A00;
    public final /* synthetic */ LP6 A01;

    /* JADX WARNING: type inference failed for: r9v1, types: [com.instagram.arlink.fragment.YUVImageData, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0091, code lost:
        if (X.LP6.A00(r0, r4, false) != false) goto L_0x0093;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r19) {
        /*
            r18 = this;
            r12 = 0
            r3 = r19
            X.0qQ.A0B(r3, r12)
            int r2 = r3.what
            r1 = 1
            r4 = r18
            if (r2 == r1) goto L_0x0123
            r0 = 2
            if (r2 == r0) goto L_0x0094
            r0 = 3
            if (r2 != r0) goto L_0x0093
            X.LP6 r4 = r4.A01
            java.lang.Object r3 = r3.obj
            X.DbS.A1Y(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x010e
            int r0 = r3.length()
            if (r0 == 0) goto L_0x010e
            boolean r0 = r4.A0B
            if (r0 != 0) goto L_0x010e
            java.io.File r2 = X.AnonymousClass7TE.A0t(r3)
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x010e
            boolean r0 = r2.canRead()
            if (r0 == 0) goto L_0x010e
            r0 = 720(0x2d0, float:1.009E-42)
            android.graphics.Bitmap r10 = X.C347917xa.A00(r3, r0)
            if (r10 == 0) goto L_0x010e
            X.SSE r5 = r4.A06
            X.S24 r6 = new X.S24
            r6.<init>()
            int r3 = r10.getWidth()
            int r2 = r10.getHeight()
            r6.A00 = r10
            X.Rso r0 = r6.A02
            r0.A00 = r3
            r0.A01 = r2
            X.34S r0 = X.SSE.A00(r6, r5)
            if (r0 != 0) goto L_0x008d
            int r2 = r10.getWidth()
            int r0 = r10.getHeight()
            int r2 = r2 * r0
            int[] r11 = new int[r2]
            int r13 = r10.getWidth()
            int r16 = r10.getWidth()
            int r17 = r10.getHeight()
            r14 = r12
            r15 = r12
            r10.getPixels(r11, r12, r13, r14, r15, r16, r17)
            int r3 = r10.getWidth()
            int r2 = r10.getHeight()
            X.R7C r0 = new X.R7C
            r0.<init>(r3, r11, r2)
            X.34S r0 = X.SSE.A01(r0, r5)
            if (r0 != 0) goto L_0x008d
            r0 = 0
        L_0x008d:
            boolean r0 = X.LP6.A00(r0, r4, r12)
            if (r0 == 0) goto L_0x010e
        L_0x0093:
            return r1
        L_0x0094:
            android.os.Bundle r2 = r3.getData()
            if (r2 == 0) goto L_0x0093
            X.LP6 r6 = r4.A01
            com.instagram.arlink.fragment.YUVImageData r9 = new com.instagram.arlink.fragment.YUVImageData
            r9.<init>()
            r9.A03 = r2
            java.lang.String r0 = "Y_DATA"
            byte[] r0 = r2.getByteArray(r0)
            java.lang.String r3 = "Required value was null."
            if (r0 == 0) goto L_0x011e
            r9.A06 = r0
            java.lang.String r0 = "U_DATA"
            byte[] r0 = r2.getByteArray(r0)
            if (r0 == 0) goto L_0x0119
            r9.A04 = r0
            java.lang.String r0 = "V_DATA"
            byte[] r0 = r2.getByteArray(r0)
            if (r0 == 0) goto L_0x0114
            r9.A05 = r0
            java.lang.String r0 = "Y_STRIDE"
            int r0 = r2.getInt(r0)
            r9.A02 = r0
            java.lang.String r0 = "U_STRIDE"
            r2.getInt(r0)
            java.lang.String r0 = "V_STRIDE"
            r2.getInt(r0)
            java.lang.String r0 = "WIDTH"
            int r0 = r2.getInt(r0)
            r9.A01 = r0
            java.lang.String r0 = "HEIGHT"
            int r0 = r2.getInt(r0)
            r9.A00 = r0
            X.SSE r5 = r6.A06
            int r11 = r9.A01
            int r10 = r9.A02
            if (r11 == r10) goto L_0x018b
            int r10 = r10 - r11
            int r0 = r0 * r11
            int r8 = r0 * 3
            byte[] r13 = new byte[r8]
            byte[] r7 = r9.A06
            if (r7 == 0) goto L_0x01fb
            r4 = 0
            r3 = 0
            r2 = 0
        L_0x00fa:
            int r0 = r7.length
            if (r4 >= r0) goto L_0x01ab
            if (r3 >= r8) goto L_0x01ab
            byte r0 = r7[r4]
            r13[r3] = r0
            int r2 = r2 + 1
            if (r2 != r11) goto L_0x0109
            int r4 = r4 + r10
            r2 = 0
        L_0x0109:
            int r4 = r4 + 1
            int r3 = r3 + 1
            goto L_0x00fa
        L_0x010e:
            X.84F r0 = r4.A07
            r0.DK7()
            return r1
        L_0x0114:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x0119:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x011e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x0123:
            java.lang.Object r3 = r3.obj
            if (r3 == 0) goto L_0x0211
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            java.nio.ByteBuffer r0 = r4.A00
            if (r0 == 0) goto L_0x0137
            int r2 = r0.capacity()
            int r0 = r3.capacity()
            if (r2 >= r0) goto L_0x0141
        L_0x0137:
            int r0 = r3.capacity()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            r4.A00 = r0
        L_0x0141:
            r3.rewind()
            java.nio.ByteBuffer r0 = r4.A00
            X.0qQ.A0A(r0)
            r0.put(r3)
            java.nio.ByteBuffer r0 = r4.A00
            X.0qQ.A0A(r0)
            r0.flip()
            X.LP6 r6 = r4.A01
            java.nio.ByteBuffer r4 = r4.A00
            X.0qQ.A0A(r4)
            X.SSE r5 = r6.A06
            int r9 = r6.A01
            int r10 = r6.A00
            X.0qQ.A0B(r4, r12)
            X.S24 r3 = new X.S24
            r3.<init>()
            int r2 = r4.capacity()
            int r0 = r9 * r10
            if (r2 < r0) goto L_0x020a
            r3.A01 = r4
            X.Rso r0 = r3.A02
            r0.A00 = r9
            r0.A01 = r10
            X.34S r0 = X.SSE.A00(r3, r5)
            if (r0 != 0) goto L_0x01e5
            byte[] r8 = r4.array()
            X.R7B r7 = new X.R7B
            r11 = r9
            r12 = r10
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x01de
        L_0x018b:
            byte[] r8 = r9.A06
            if (r8 == 0) goto L_0x01fb
            int r7 = r8.length
            byte[] r4 = r9.A04
            if (r4 == 0) goto L_0x01f7
            int r0 = r4.length
            int r3 = r7 + r0
            byte[] r2 = r9.A05
            if (r2 == 0) goto L_0x01ff
            int r0 = r2.length
            int r3 = r3 + r0
            byte[] r13 = new byte[r3]
            java.lang.System.arraycopy(r8, r12, r13, r12, r7)
            int r0 = r4.length
            java.lang.System.arraycopy(r4, r12, r13, r7, r0)
            int r7 = r7 + r0
            int r0 = r2.length
            java.lang.System.arraycopy(r2, r12, r13, r7, r0)
        L_0x01ab:
            X.S24 r8 = new X.S24
            r8.<init>()
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r13)
            int r4 = r9.A01
            int r3 = r9.A00
            if (r7 == 0) goto L_0x01f0
            int r2 = r7.capacity()
            int r0 = r4 * r3
            if (r2 < r0) goto L_0x01e9
            r8.A01 = r7
            X.Rso r0 = r8.A02
            r0.A00 = r4
            r0.A01 = r3
            X.34S r0 = X.SSE.A00(r8, r5)
            if (r0 != 0) goto L_0x01e5
            int r14 = r9.A01
            int r15 = r9.A00
            X.R7B r7 = new X.R7B
            r12 = r7
            r16 = r14
            r17 = r15
            r12.<init>(r13, r14, r15, r16, r17)
        L_0x01de:
            X.34S r0 = X.SSE.A01(r7, r5)
            if (r0 != 0) goto L_0x01e5
            r0 = 0
        L_0x01e5:
            X.LP6.A00(r0, r6, r1)
            return r1
        L_0x01e9:
            java.lang.String r0 = "Invalid image data size."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x01f0:
            java.lang.String r0 = "Null image data supplied."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x01f7:
            java.lang.String r0 = "uData"
            goto L_0x0202
        L_0x01fb:
            java.lang.String r0 = "yData"
            goto L_0x0202
        L_0x01ff:
            java.lang.String r0 = "vData"
        L_0x0202:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x020a:
            java.lang.String r0 = "Invalid image data size."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0211:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11455SVt.handleMessage(android.os.Message):boolean");
    }

    public C11455SVt(LP6 lp6) {
        this.A01 = lp6;
    }
}
