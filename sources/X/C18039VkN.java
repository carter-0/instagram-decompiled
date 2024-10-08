package X;

import android.opengl.GLES20;
import java.util.Vector;

/* renamed from: X.VkN  reason: case insensitive filesystem */
public class C18039VkN {
    public final int A00;
    public final Vector A01 = new Vector();
    public final C14261Tsj A02;

    public C18039VkN(C14261Tsj tsj, int i) {
        0qQ.A0B(tsj, 1);
        this.A02 = tsj;
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.Ut2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(int r16, int r17, java.lang.String r18, boolean r19, int r20) {
        /*
            r15 = this;
            r10 = r15
            X.Tsj r0 = r15.A02
            java.util.Map r0 = r0.A01
            r1 = r18
            java.lang.Object r2 = r0.get(r1)
            X.Tsn r2 = (X.C14265Tsn) r2
            if (r2 == 0) goto L_0x0031
            r3 = r15
            boolean r0 = r15 instanceof X.C16334Ut4
            r5 = r16
            r6 = r17
            r7 = r19
            r13 = r20
            if (r0 == 0) goto L_0x0032
            X.Ut4 r3 = (X.C16334Ut4) r3
            java.nio.ByteBuffer r0 = r3.A00
            java.nio.ByteBuffer r4 = r0.asReadOnlyBuffer()
            r4.position(r13)
            java.util.Vector r0 = r3.A01
            X.Ut2 r1 = new X.Ut2
            r1.<init>(r2, r3, r4, r5, r6, r7)
        L_0x002e:
            r0.add(r1)
        L_0x0031:
            return
        L_0x0032:
            java.util.Vector r0 = r15.A01
            X.Ut3 r1 = new X.Ut3
            r8 = r1
            r9 = r2
            r11 = r5
            r12 = r6
            r14 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14)
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18039VkN.A02(int, int, java.lang.String, boolean, int):void");
    }

    public final void A00() {
        int i;
        Vector vector = this.A01;
        int size = vector.size();
        for (int i2 = 0; i2 < size; i2++) {
            C17546VZz vZz = (C17546VZz) vector.get(i2);
            if (vZz instanceof C16333Ut3) {
                C16333Ut3 ut3 = (C16333Ut3) vZz;
                i = ut3.A01;
                GLES20.glVertexAttribPointer(i, ut3.A00, ut3.A02, ut3.A03, ut3.A01.A00, ut3.A00);
            } else {
                C16332Ut2 ut2 = (C16332Ut2) vZz;
                i = ut2.A01;
                GLES20.glVertexAttribPointer(i, ut2.A00, ut2.A02, ut2.A03, ut2.A01.A00, ut2.A00);
            }
            GLES20.glEnableVertexAttribArray(i);
        }
    }

    public final void A01() {
        Vector vector = this.A01;
        int size = vector.size();
        for (int i = 0; i < size; i++) {
            GLES20.glDisableVertexAttribArray(((C17546VZz) vector.get(i)).A01);
        }
    }
}
