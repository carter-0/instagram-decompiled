package X;

import android.graphics.Color;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

public abstract class Usn extends C16318Uso {
    public float A00;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public C18607Vv0 A04;
    public FloatBuffer A05;
    public final int A06;
    public final int A07;
    public final float[] A08;
    public final /* synthetic */ C16330Ut0 A09;

    public Usn(C16330Ut0 ut0, int i) {
        FloatBuffer floatBuffer;
        this.A09 = ut0;
        int i2 = 0;
        this.A07 = i * 4;
        this.A08 = new float[Math.max(4, i)];
        C17872VhP vhP = ut0.A06;
        vhP.getClass();
        C19726WeS weS = (C19726WeS) vhP.A00(C19726WeS.class);
        C18607Vv0 vv0 = (C18607Vv0) weS.A01.poll();
        vv0 = vv0 == null ? new C18607Vv0(weS) : vv0;
        this.A04 = vv0;
        ByteBuffer byteBuffer = vv0.A04;
        if (byteBuffer != null) {
            floatBuffer = byteBuffer.asFloatBuffer();
        } else {
            floatBuffer = null;
        }
        this.A05 = floatBuffer;
        this.A06 = floatBuffer != null ? floatBuffer.remaining() / i : i2;
    }

    public static void A00(Usn usn, int i, int i2) {
        if (i2 != 0) {
            C18571VuN vuN = usn.A01;
            vuN.getClass();
            vuN.A00();
            C16330Ut0 ut0 = usn.A09;
            Um6 um6 = ut0.A02;
            if (um6 != null) {
                um6.A00 = FloatBuffer.wrap(ut0.A07);
                um6.A00 = true;
            }
            C14278TtB ttB = ut0.A04;
            if (ttB != null) {
                ttB.A00(usn.A01 * ut0.A00);
            }
            C14278TtB ttB2 = ut0.A03;
            if (ttB2 != null) {
                ttB2.A00(ut0.A00);
            }
            C14260Tsi tsi = ut0.A05;
            if (tsi != null) {
                int i3 = usn.A02;
                tsi.A00(((float) Color.red(i3)) / 255.0f, ((float) Color.green(i3)) / 255.0f, ((float) Color.blue(i3)) / 255.0f, usn.A00);
            }
            C14261Tsj tsj = ut0.A04;
            tsj.getClass();
            tsj.A00();
            GLES20.glBindBuffer(34962, usn.A04.A03);
            C18039VkN vkN = ut0.A02;
            vkN.getClass();
            vkN.A00();
            C18607Vv0 vv0 = usn.A04;
            int i4 = usn.A07;
            vv0.A00(i * i4, i4 * i2);
            GLES20.glDrawArrays(0, i, i2);
            GLES20.glBindBuffer(34962, 0);
            ut0.A02.A01();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: X.Usm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: X.Usl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: X.Usm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: X.Usm} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r9 = this;
            boolean r0 = r9 instanceof X.C16317Usl
            if (r0 == 0) goto L_0x0066
            r8 = r9
            X.Usl r8 = (X.C16317Usl) r8
            X.Ut0 r0 = r8.A00
            X.XAU r0 = r0.A05
            r0.getClass()
            X.VvB r7 = r0.BtS()
            float r1 = r8.A00
            r7.A03 = r1
            float r0 = r7.A02
            float r0 = r0 / r1
            double r0 = (double) r0
            double r1 = java.lang.Math.floor(r0)
            int r0 = (int) r1
            int r1 = r0 + 1
            int r0 = r8.A06
            int r0 = java.lang.Math.min(r1, r0)
            r8.A01 = r0
            int r6 = r8.A03
        L_0x002b:
            int r0 = r8.A01
            if (r6 >= r0) goto L_0x00c8
            float[] r5 = r8.A08
            r7.A01(r5, r6)
            r1 = 4
            float r0 = (float) r6
            r5[r1] = r0
            r1 = 5
            float r0 = r8.A01
            r5[r1] = r0
            r4 = 6
            int r0 = r8.A02
            int r3 = android.graphics.Color.alpha(r0)
            int r2 = android.graphics.Color.blue(r0)
            int r1 = android.graphics.Color.green(r0)
            int r0 = android.graphics.Color.red(r0)
            int r0 = android.graphics.Color.argb(r3, r2, r1, r0)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r5[r4] = r0
            java.nio.FloatBuffer r2 = r8.A05
            if (r2 == 0) goto L_0x0063
            r1 = 0
            r0 = 7
            r2.put(r5, r1, r0)
        L_0x0063:
            int r6 = r6 + 1
            goto L_0x002b
        L_0x0066:
            r8 = r9
            X.Usm r8 = (X.Usm) r8
            X.Ut0 r0 = r8.A00
            X.XAU r0 = r0.A05
            r0.getClass()
            X.VvB r7 = r0.BtS()
            float r1 = r8.A00
            r7.A03 = r1
            float r0 = r7.A02
            float r0 = r0 / r1
            double r0 = (double) r0
            double r1 = java.lang.Math.floor(r0)
            int r0 = (int) r1
            int r1 = r0 + 1
            int r0 = r8.A06
            int r0 = java.lang.Math.min(r1, r0)
            r8.A01 = r0
            int r6 = r8.A03
        L_0x008d:
            int r0 = r8.A01
            if (r6 >= r0) goto L_0x00c8
            float[] r5 = r8.A08
            r7.A01(r5, r6)
            r1 = 2
            float r0 = (float) r6
            r5[r1] = r0
            r1 = 3
            float r0 = r8.A01
            r5[r1] = r0
            r4 = 4
            int r0 = r8.A02
            int r3 = android.graphics.Color.alpha(r0)
            int r2 = android.graphics.Color.blue(r0)
            int r1 = android.graphics.Color.green(r0)
            int r0 = android.graphics.Color.red(r0)
            int r0 = android.graphics.Color.argb(r3, r2, r1, r0)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r5[r4] = r0
            java.nio.FloatBuffer r2 = r8.A05
            if (r2 == 0) goto L_0x00c5
            r1 = 0
            r0 = 5
            r2.put(r5, r1, r0)
        L_0x00c5:
            int r6 = r6 + 1
            goto L_0x008d
        L_0x00c8:
            r8.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Usn.A02():void");
    }

    public final void AQF() {
        A00(this, 0, this.A01);
    }

    public final void A01(C21006X9e x9e) {
        float f;
        super.A01(x9e);
        C19723WeP weP = (C19723WeP) x9e;
        boolean z = weP instanceof C16330Ut0;
        C16330Ut0 ut0 = weP;
        if (z) {
            C16330Ut0 ut02 = (C16330Ut0) weP;
            VXD vxd = ut02.A01;
            ut0 = ut02;
            if (vxd != null) {
                f = (ut02.A00 * vxd.A02) + vxd.A01;
                float f2 = vxd.A00;
                if (f < f2) {
                    f = f2;
                } else if (f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                }
                this.A00 = f * this.A09.A00;
            }
        }
        f = ut0.A01;
        this.A00 = f * this.A09.A00;
    }
}
