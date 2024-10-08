package X;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.9QO  reason: invalid class name */
public final class AnonymousClass9QO implements C41839B2u {
    public boolean A00 = true;
    public boolean A01;
    public final UserSession A02;
    public final C378529Qd A03;
    public final AtomicBoolean A04 = new AtomicBoolean(false);
    public final Context A05;
    public final ViewGroup A06;
    public final C378519Qc A07;

    public AnonymousClass9QO(Context context, ViewGroup viewGroup, UserSession userSession) {
        0qQ.A0B(context, 1);
        AnonymousClass7TG.A1Q(userSession, viewGroup);
        this.A05 = context;
        this.A02 = userSession;
        this.A06 = viewGroup;
        this.A07 = new C378519Qc(new AnonymousClass84N(context, userSession));
        this.A03 = new C378529Qd(context, viewGroup);
    }

    public final void DxG(AnonymousClass51M r4) {
        if (this.A01) {
            int i = r4.A08;
            if (i > 2000) {
                r4.A08 = i - CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
            }
            this.A01 = false;
        }
    }

    public final void ErW(Handler handler, C357638Yz r11, AnonymousClass8G7 r12, ShutterButton shutterButton, int i, int i2) {
        AnonymousClass7TG.A1T(r11, handler, shutterButton);
        0qQ.A0B(r12, 5);
        C378519Qc r0 = this.A07;
        r0.A01 = new C40157ATx(handler, r11, r12, this, shutterButton, i, i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FKQ(android.graphics.Bitmap r24) {
        /*
            r23 = this;
            r14 = 0
            r0 = r23
            X.9Qc r13 = r0.A07
            X.8wA r0 = new X.8wA
            r1 = r24
            r0.<init>(r1)
            r13.A00 = r0
            java.lang.String r1 = r13.A02
            if (r1 == 0) goto L_0x01bd
            X.7xm r0 = r13.A03
            if (r0 != 0) goto L_0x001c
            X.7xm r0 = X.C347997xi.A00(r1)
            r13.A03 = r0
        L_0x001c:
            X.8wB r1 = r13.A00
            boolean r0 = r1 instanceof X.C370298wA
            if (r0 == 0) goto L_0x01bd
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.onecamera.components.ml.intf.MlInputBitmap"
            X.0qQ.A0C(r1, r0)
            X.8wA r1 = (X.C370298wA) r1
            android.graphics.Bitmap r0 = r1.A00
            r1 = 448(0x1c0, float:6.28E-43)
            r12 = 1
            android.graphics.Bitmap r15 = X.0fO.A00(r0, r1, r1, r12)
            X.0qQ.A07(r15)
            X.7xm r3 = r13.A03
            if (r3 == 0) goto L_0x01bd
            r0 = 602112(0x93000, float:8.43739E-40)
            java.nio.FloatBuffer r4 = org.pytorch.Tensor.allocateFloatBuffer(r0)
            X.0qQ.A07(r4)
            r7 = 200704(0x31000, float:2.81246E-40)
            int[] r6 = new int[r7]
            r16 = r6
            r17 = r14
            r18 = r1
            r19 = r14
            r20 = r14
            r21 = r1
            r22 = r1
            r15.getPixels(r16, r17, r18, r19, r20, r21, r22)
            r8 = 0
        L_0x005a:
            r1 = r6[r8]
            int r0 = r1 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r5 = (float) r0
            int r0 = r1 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r2 = (float) r0
            r0 = r1 & 255(0xff, float:3.57E-43)
            float r1 = (float) r0
            r4.put(r8, r5)
            int r0 = r7 + r8
            r4.put(r0, r2)
            r0 = 401408(0x62000, float:5.62492E-40)
            int r0 = r0 + r8
            r4.put(r0, r1)
            int r8 = r8 + 1
            if (r8 < r7) goto L_0x005a
            r15 = 3
            long[] r2 = new long[r15]
            r0 = 3
            r2[r14] = r0
            r0 = 448(0x1c0, double:2.213E-321)
            r2[r12] = r0
            r20 = 2
            r2[r20] = r0
            X.XF6 r0 = X.XF6.CONTIGUOUS
            org.pytorch.Tensor r0 = org.pytorch.Tensor.fromBlob((java.nio.FloatBuffer) r4, (long[]) r2, (X.XF6) r0)
            org.pytorch.IValue r0 = org.pytorch.IValue.from((org.pytorch.Tensor) r0)
            org.pytorch.IValue[] r1 = new org.pytorch.IValue[]{r0}
            X.8EJ r0 = r3.A00
            org.pytorch.IValue r0 = r0.forward(r1)
            org.pytorch.IValue[] r11 = r0.toTuple()
            X.0qQ.A0A(r11)
            X.0qQ.A0B(r11, r14)
            r0 = r11[r15]
            org.pytorch.Tensor r0 = r0.toTensor()
            float[] r10 = r0.getDataAsFloatArray()
            int r9 = r10.length
            r8 = 4
            int r7 = r9 / r8
            java.lang.String[] r6 = new java.lang.String[r7]
            int r0 = r9 % r8
            if (r0 != 0) goto L_0x012d
            int r0 = r9 + -1
            r5 = 0
            int r4 = X.C70002Hb.A00(r14, r0, r8)
            if (r4 < 0) goto L_0x012d
        L_0x00c6:
            int r0 = r5 + 4
            if (r0 > r9) goto L_0x00fc
            X.AnonymousClass0gZ.A0b(r0, r9)
            float[] r3 = java.util.Arrays.copyOfRange(r10, r5, r0)
            X.0qQ.A07(r3)
            int r0 = r3.length
            int r1 = r0 + -1
            X.2HY r0 = new X.2HY
            r0.<init>(r14, r1)
            java.util.Iterator r19 = r0.iterator()
            boolean r0 = r19.hasNext()
            r18 = 0
            if (r0 != 0) goto L_0x0103
            r2 = r18
        L_0x00ea:
            java.lang.Number r2 = (java.lang.Number) r2
            int r1 = r5 / 4
            if (r2 == 0) goto L_0x00fa
            java.lang.String[] r3 = X.A21.A00
            int r0 = r2.intValue()
            java.lang.Object r18 = X.03t.A06(r3, r0)
        L_0x00fa:
            r6[r1] = r18
        L_0x00fc:
            if (r5 == r4) goto L_0x012d
        L_0x00fe:
            int r5 = r5 + 4
            if (r5 < 0) goto L_0x00fe
            goto L_0x00c6
        L_0x0103:
            java.lang.Object r2 = r19.next()
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x00ea
            int r0 = X.AnonymousClass7TE.A0M(r2)
            r1 = r3[r0]
        L_0x0113:
            java.lang.Object r17 = r19.next()
            int r0 = X.AnonymousClass7TE.A0M(r17)
            r0 = r3[r0]
            int r16 = java.lang.Float.compare(r1, r0)
            if (r16 >= 0) goto L_0x0126
            r2 = r17
            r1 = r0
        L_0x0126:
            boolean r0 = r19.hasNext()
            if (r0 != 0) goto L_0x0113
            goto L_0x00ea
        L_0x012d:
            r0 = r11[r12]
            org.pytorch.Tensor r0 = r0.toTensor()
            float[] r9 = r0.getDataAsFloatArray()
            r5 = 0
            r0 = r11[r14]
            org.pytorch.Tensor r0 = r0.toTensor()
            float[] r10 = r0.getDataAsFloatArray()
            int r4 = r10.length
            int r0 = r4 % r8
            if (r0 == 0) goto L_0x0191
            r3 = 0
        L_0x0148:
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            r10 = 0
            r2 = 0
        L_0x014e:
            if (r10 >= r7) goto L_0x01b6
            r5 = r6[r10]
            int r16 = r2 + 1
            X.0qQ.A0B(r9, r14)
            int r0 = r9.length
            int r1 = r0 + -1
            X.2HY r0 = new X.2HY
            r0.<init>(r14, r1)
            boolean r0 = r0.A01(r2)
            if (r0 == 0) goto L_0x018a
            r1 = r9[r2]
            r0 = 1061158912(0x3f400000, float:0.75)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x018a
            if (r3 == 0) goto L_0x018f
            r0 = r3[r2]
        L_0x0171:
            if (r5 == 0) goto L_0x018a
            if (r0 == 0) goto L_0x018a
            r11 = r0[r14]
            r4 = r0[r12]
            r2 = r0[r20]
            r0 = r0[r15]
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r11, r4, r2, r0)
            X.A9b r0 = new X.A9b
            r0.<init>(r1, r5)
            r8.add(r0)
        L_0x018a:
            int r10 = r10 + 1
            r2 = r16
            goto L_0x014e
        L_0x018f:
            r0 = 0
            goto L_0x0171
        L_0x0191:
            int r0 = r4 / r8
            float[][] r3 = new float[r0][]
            int r0 = r4 + -1
            int r2 = X.C70002Hb.A00(r14, r0, r8)
            if (r2 < 0) goto L_0x0148
        L_0x019d:
            int r0 = r5 + 4
            if (r0 > r4) goto L_0x01af
            int r1 = r5 / 4
            X.AnonymousClass0gZ.A0b(r0, r4)
            float[] r0 = java.util.Arrays.copyOfRange(r10, r5, r0)
            X.0qQ.A07(r0)
            r3[r1] = r0
        L_0x01af:
            if (r5 == r2) goto L_0x0148
        L_0x01b1:
            int r5 = r5 + 4
            if (r5 < 0) goto L_0x01b1
            goto L_0x019d
        L_0x01b6:
            X.8w9 r0 = r13.A01
            if (r0 == 0) goto L_0x01bd
            r0.DYh(r8)
        L_0x01bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9QO.FKQ(android.graphics.Bitmap):void");
    }

    public final boolean CaO() {
        return AnonymousClass7TF.A1V(this.A07.A02);
    }

    public final void Dy6() {
        AtomicBoolean atomicBoolean = this.A04;
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
        }
    }

    public final void ETS(float f) {
        this.A03.A00 = f;
    }

    public final void setEnabled(boolean z) {
        this.A00 = z;
    }
}
