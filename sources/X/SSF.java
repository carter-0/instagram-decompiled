package X;

import android.content.Context;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class SSF {
    public C344587s6 A00;
    public C345937uK A01;
    public C11419SSu A02;
    public SSN A03;
    public C69516Nmy A04;
    public String A05;
    public final int A06;
    public final int A07;
    public final Handler A08;
    public final C345557ti A09;
    public final C368538so A0A;
    public final OA1 A0B;
    public final List A0C = AnonymousClass7TE.A1C();
    public final AtomicInteger A0D = new AtomicInteger(0);
    public final float[] A0E;
    public final UserSession A0F;
    public volatile boolean A0G;

    public static C368538so A01(SSF ssf, List list, int i, long j) {
        C368538so r2 = ssf.A0A;
        r2.A01(((C369008tg) list.get(i)).A03, ssf.A0E, j);
        return r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x05bf, code lost:
        r0 = r13.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x05c3, code lost:
        if (r0 == null) goto L_0x05ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x05c5, code lost:
        r0.A04(r4);
        r0 = r13.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x05ca, code lost:
        if (r0 == null) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x05cc, code lost:
        r0.A03();
        r0 = r13.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x05d1, code lost:
        if (r0 == null) goto L_0x060b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x05d3, code lost:
        r1 = r0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x05d5, code lost:
        if (r1 != null) goto L_0x05e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x05d7, code lost:
        X.0kD.A01("BoomerangEncoder", "no handler available");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x05e0, code lost:
        r1.sendEmptyMessage(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x05e4, code lost:
        r4 = r4 + 33000000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x05ea, code lost:
        if (r9 < 119) goto L_0x05f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x05ec, code lost:
        r29 = r29 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x05f1, code lost:
        if (r29 == 2) goto L_0x0620;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x05f3, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x05f6, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x05fa, code lost:
        r0 = X.AnonymousClass7TE.A0z("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x05ff, code lost:
        r0 = X.AnonymousClass7TE.A0z("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x060b, code lost:
        r0 = X.AnonymousClass7TE.A0z("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0397, code lost:
        if (r15 < 5) goto L_0x0399;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x04ad, code lost:
        if (r15 < 5) goto L_0x04af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0519, code lost:
        r3 = X.C11419SSu.A01(r8, r0);
        r3.A03("u_SourceTexture", r14.A03);
        r3.A03("u_BlurTexture", r2.A03);
        r8.A05(r3, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0530, code lost:
        r14.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x05bc, code lost:
        r2.A01();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.SSF r30) {
        /*
            r13 = r30
            X.7uK r2 = r13.A01
            if (r2 == 0) goto L_0x0681
            r4 = 0
            r30 = 1
            X.7s6 r0 = r2.A01     // Catch:{ RuntimeException -> 0x0610 }
            boolean r0 = r0.CQx()     // Catch:{ RuntimeException -> 0x0610 }
            if (r0 == 0) goto L_0x0029
            android.opengl.EGLSurface r1 = r2.A00     // Catch:{ RuntimeException -> 0x0610 }
            r0 = 12377(0x3059, float:1.7344E-41)
            android.opengl.EGLSurface r0 = android.opengl.EGL14.eglGetCurrentSurface(r0)     // Catch:{ RuntimeException -> 0x0610 }
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x0610 }
            if (r0 == 0) goto L_0x0029
        L_0x0020:
            int r12 = r13.A07     // Catch:{ RuntimeException -> 0x0610 }
            int r11 = r13.A06     // Catch:{ RuntimeException -> 0x0610 }
            r10 = 0
            android.opengl.GLES20.glViewport(r10, r10, r12, r11)     // Catch:{ RuntimeException -> 0x0610 }
            goto L_0x002d
        L_0x0029:
            r2.A05()     // Catch:{ RuntimeException -> 0x0610 }
            goto L_0x0020
        L_0x002d:
            r9 = 0
            r29 = 0
        L_0x0030:
            boolean r0 = r13.A0G     // Catch:{ RuntimeException -> 0x0610 }
            if (r0 != 0) goto L_0x0620
            java.util.List r2 = r13.A0C     // Catch:{ RuntimeException -> 0x0610 }
            X.7uK r0 = r13.A01     // Catch:{ RuntimeException -> 0x0610 }
            if (r0 == 0) goto L_0x0604
            X.SSN r0 = r13.A03     // Catch:{ RuntimeException -> 0x0610 }
            if (r0 == 0) goto L_0x0604
            X.SSu r8 = r13.A02     // Catch:{ RuntimeException -> 0x0610 }
            if (r8 == 0) goto L_0x0604
            int r3 = r9 / 30
            X.Nmy r0 = r13.A04     // Catch:{ RuntimeException -> 0x0610 }
            int r0 = r0.ordinal()     // Catch:{ RuntimeException -> 0x0610 }
            switch(r0) {
                case 0: goto L_0x00f5;
                case 1: goto L_0x011f;
                case 2: goto L_0x022a;
                case 3: goto L_0x02f7;
                case 4: goto L_0x03ea;
                default: goto L_0x004d;
            }     // Catch:{ RuntimeException -> 0x0610 }
        L_0x004d:
            X.8so r6 = A01(r13, r2, r3, r4)     // Catch:{ RuntimeException -> 0x0610 }
            X.C11419SSu.A04(r6, r8)     // Catch:{ RuntimeException -> 0x0610 }
            X.8tg r2 = new X.8tg     // Catch:{ RuntimeException -> 0x0610 }
            r2.<init>(r12, r11)     // Catch:{ RuntimeException -> 0x0610 }
            char r25 = X.Pxj.A01(r2)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.Integer r0 = X.AnonymousClass05K.A04     // Catch:{ RuntimeException -> 0x0610 }
            X.8fv r7 = X.C11419SSu.A01(r8, r0)     // Catch:{ RuntimeException -> 0x0610 }
            r0 = 2131240281(0x7f082559, float:1.8096893E38)
            X.7v0 r24 = X.C11419SSu.A02(r8, r0)     // Catch:{ RuntimeException -> 0x0610 }
            r0 = 2131240278(0x7f082556, float:1.8096887E38)
            X.7v0 r23 = X.C11419SSu.A02(r8, r0)     // Catch:{ RuntimeException -> 0x0610 }
            r0 = 2131240279(0x7f082557, float:1.8096889E38)
            X.7v0 r22 = A00(r7, r8, r0, r4)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r0 = "u_Flipped"
            int r0 = X.C361258fv.A00(r7, r0)     // Catch:{ RuntimeException -> 0x0610 }
            android.opengl.GLES20.glUniform1i(r0, r10)     // Catch:{ RuntimeException -> 0x0610 }
            X.7v0 r1 = r6.A00()     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r21 = "u_Texture"
            r0 = r21
            r7.A03(r0, r1)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r1 = "u_GlitchTextureA"
            r0 = r23
            r7.A03(r1, r0)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r1 = "u_GlitchTextureB"
            r0 = r22
            r7.A03(r1, r0)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r1 = "u_LUT"
            r0 = r24
            r7.A03(r1, r0)     // Catch:{ RuntimeException -> 0x0610 }
            float[] r18 = X.C10140RnH.A0K     // Catch:{ RuntimeException -> 0x0610 }
            r0 = 31
            float[] r14 = new float[r0]     // Catch:{ RuntimeException -> 0x0610 }
            float[] r1 = new float[r0]     // Catch:{ RuntimeException -> 0x0610 }
            r15 = 0
            r17 = 0
        L_0x00b1:
            float[] r16 = X.C10140RnH.A0L     // Catch:{ RuntimeException -> 0x0610 }
            r0 = r16[r15]     // Catch:{ RuntimeException -> 0x0610 }
            r14[r17] = r0     // Catch:{ RuntimeException -> 0x0610 }
            int r0 = r15 + 1
            r0 = r16[r0]     // Catch:{ RuntimeException -> 0x0610 }
            r1[r17] = r0     // Catch:{ RuntimeException -> 0x0610 }
            int r17 = r17 + 1
            int r15 = r15 + 2
            r0 = 30
            if (r15 < r0) goto L_0x00b1
            r0 = r18
            float r20 = X.RhS.A00(r14, r0, r9)     // Catch:{ RuntimeException -> 0x0610 }
            float r19 = X.RhS.A00(r1, r0, r9)     // Catch:{ RuntimeException -> 0x0610 }
            float[] r1 = X.C10140RnH.A0D     // Catch:{ RuntimeException -> 0x0610 }
            float[] r0 = X.C10140RnH.A0C     // Catch:{ RuntimeException -> 0x0610 }
            float r18 = X.RhS.A00(r1, r0, r9)     // Catch:{ RuntimeException -> 0x0610 }
            float[] r1 = X.C10140RnH.A0F     // Catch:{ RuntimeException -> 0x0610 }
            float[] r0 = X.C10140RnH.A0E     // Catch:{ RuntimeException -> 0x0610 }
            float r17 = X.RhS.A00(r1, r0, r9)     // Catch:{ RuntimeException -> 0x0610 }
            double r0 = java.lang.Math.random()     // Catch:{ RuntimeException -> 0x0610 }
            r15 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            int r14 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r14 >= 0) goto L_0x00f2
            r14 = 1056964608(0x3f000000, float:0.5)
            float r15 = (float) r0     // Catch:{ RuntimeException -> 0x0610 }
            float r14 = r14 - r15
            r0 = 1082130432(0x40800000, float:4.0)
            float r14 = r14 / r0
            goto L_0x0535
        L_0x00f2:
            r14 = 0
            goto L_0x0535
        L_0x00f5:
            X.8so r6 = A01(r13, r2, r3, r4)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.Object r0 = r2.get(r3)     // Catch:{ RuntimeException -> 0x0610 }
            X.8tg r0 = (X.C369008tg) r0     // Catch:{ RuntimeException -> 0x0610 }
            X.7v0 r3 = r0.A03     // Catch:{ RuntimeException -> 0x0610 }
            X.C11419SSu.A04(r6, r8)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ RuntimeException -> 0x0610 }
            X.8fv r2 = X.C11419SSu.A01(r8, r0)     // Catch:{ RuntimeException -> 0x0610 }
            float r1 = X.RhR.A00(r9)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r0 = "u_Exposure"
            r2.A02(r0, r1)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r0 = "u_Texture"
            r2.A03(r0, r3)     // Catch:{ RuntimeException -> 0x0610 }
            r8.A05(r2, r6)     // Catch:{ RuntimeException -> 0x0610 }
            goto L_0x05bf
        L_0x011f:
            X.8so r1 = A01(r13, r2, r3, r4)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.Object r0 = r2.get(r3)     // Catch:{ RuntimeException -> 0x0610 }
            X.8tg r0 = (X.C369008tg) r0     // Catch:{ RuntimeException -> 0x0610 }
            X.7v0 r6 = r0.A03     // Catch:{ RuntimeException -> 0x0610 }
            X.C11419SSu.A04(r1, r8)     // Catch:{ RuntimeException -> 0x0610 }
            X.8tg r14 = new X.8tg     // Catch:{ RuntimeException -> 0x0610 }
            r14.<init>(r12, r11)     // Catch:{ RuntimeException -> 0x0610 }
            char r19 = X.Pxj.A01(r14)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y     // Catch:{ RuntimeException -> 0x0610 }
            X.8fv r2 = X.C11419SSu.A01(r8, r0)     // Catch:{ RuntimeException -> 0x0610 }
            r0 = 2131239146(0x7f0820ea, float:1.809459E38)
            X.7v0 r18 = X.C11419SSu.A02(r8, r0)     // Catch:{ RuntimeException -> 0x0610 }
            r0 = 2131239147(0x7f0820eb, float:1.8094593E38)
            X.7v0 r17 = X.C11419SSu.A02(r8, r0)     // Catch:{ RuntimeException -> 0x0610 }
            r0 = 2131239145(0x7f0820e9, float:1.8094589E38)
            X.7v0 r16 = A00(r2, r8, r0, r4)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r0 = "u_Flipped"
            int r0 = X.C361258fv.A00(r2, r0)     // Catch:{ RuntimeException -> 0x0610 }
            android.opengl.GLES20.glUniform1i(r0, r10)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r0 = "u_Texture"
            r2.A03(r0, r6)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r6 = "u_LUT"
            r0 = r18
            r2.A03(r6, r0)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r6 = "u_NoiseTexture"
            r0 = r17
            r2.A03(r6, r0)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r6 = "u_LeakTexture"
            r0 = r16
            r2.A03(r6, r0)     // Catch:{ RuntimeException -> 0x0610 }
            float r0 = (float) r12     // Catch:{ RuntimeException -> 0x0610 }
            r21 = r0
            float r0 = (float) r11     // Catch:{ RuntimeException -> 0x0610 }
            r20 = r0
            java.lang.String r6 = "u_RenderSize"
            r7 = r21
            X.Pxh.A1B(r2, r6, r7, r0)     // Catch:{ RuntimeException -> 0x0610 }
            float[] r7 = X.C10140RnH.A06     // Catch:{ RuntimeException -> 0x0610 }
            float[] r0 = X.C10140RnH.A07     // Catch:{ RuntimeException -> 0x0610 }
            float r15 = X.RhS.A00(r7, r0, r9)     // Catch:{ RuntimeException -> 0x0610 }
            float r7 = X.RhR.A00(r9)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r0 = "u_Exposure"
            r2.A02(r0, r7)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r7 = "u_LeakOpacity"
            r2.A02(r7, r15)     // Catch:{ RuntimeException -> 0x0610 }
            float r3 = (float) r3     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r0 = "u_LeakIndex"
            r2.A02(r0, r3)     // Catch:{ RuntimeException -> 0x0610 }
            r8.A05(r2, r1)     // Catch:{ RuntimeException -> 0x0610 }
            r18.A01()     // Catch:{ RuntimeException -> 0x0610 }
            r17.A01()     // Catch:{ RuntimeException -> 0x0610 }
            r16.A01()     // Catch:{ RuntimeException -> 0x0610 }
            X.Pxi.A0r(r19)     // Catch:{ RuntimeException -> 0x0610 }
            X.8tg r2 = X.C11419SSu.A00(r14, r1, r8)     // Catch:{ RuntimeException -> 0x0610 }
            android.opengl.GLES20.glViewport(r10, r10, r12, r11)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0j     // Catch:{ RuntimeException -> 0x0610 }
            X.8fv r3 = X.C11419SSu.A01(r8, r0)     // Catch:{ RuntimeException -> 0x0610 }
            r0 = 2131239144(0x7f0820e8, float:1.8094587E38)
            X.7v0 r16 = X.C11419SSu.A02(r8, r0)     // Catch:{ RuntimeException -> 0x0610 }
            java.util.Calendar r7 = java.util.Calendar.getInstance()     // Catch:{ RuntimeException -> 0x0610 }
            r0 = 5
            int r0 = r7.get(r0)     // Catch:{ RuntimeException -> 0x0610 }
            float r0 = (float) r0     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r15 = "u_Day"
            r3.A02(r15, r0)     // Catch:{ RuntimeException -> 0x0610 }
            r0 = 2
            int r0 = r7.get(r0)     // Catch:{ RuntimeException -> 0x0610 }
            float r15 = (float) r0     // Catch:{ RuntimeException -> 0x0610 }
            r0 = 1065353216(0x3f800000, float:1.0)
            float r15 = r15 + r0
            java.lang.String r0 = "u_Month"
            r3.A02(r0, r15)     // Catch:{ RuntimeException -> 0x0610 }
            r0 = r30
            int r0 = r7.get(r0)     // Catch:{ RuntimeException -> 0x0610 }
            float r7 = (float) r0     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r0 = "u_Year"
            r3.A02(r0, r7)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r0 = "u_DateOffsetX"
            r7 = 0
            r3.A02(r0, r7)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r0 = "u_DateOffsetY"
            r3.A02(r0, r7)     // Catch:{ RuntimeException -> 0x0610 }
            X.7v0 r7 = r14.A03     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r0 = "u_SourceTexture"
            r3.A03(r0, r7)     // Catch:{ RuntimeException -> 0x0610 }
            X.7v0 r7 = r2.A03     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r0 = "u_BlurTexture"
            r3.A03(r0, r7)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r7 = "u_FontTexture"
            r0 = r16
            r3.A03(r7, r0)     // Catch:{ RuntimeException -> 0x0610 }
            r7 = r21
            r0 = r20
            X.Pxh.A1B(r3, r6, r7, r0)     // Catch:{ RuntimeException -> 0x0610 }
            r8.A05(r3, r1)     // Catch:{ RuntimeException -> 0x0610 }
            r16.A01()     // Catch:{ RuntimeException -> 0x0610 }
            goto L_0x0530
        L_0x022a:
            X.8so r7 = A01(r13, r2, r3, r4)     // Catch:{ RuntimeException -> 0x0610 }
            java.util.ArrayList r6 = X.C11419SSu.A03(r2)     // Catch:{ RuntimeException -> 0x0610 }
            X.8tg r14 = new X.8tg     // Catch:{ RuntimeException -> 0x0610 }
            r14.<init>(r12, r11)     // Catch:{ RuntimeException -> 0x0610 }
            char r23 = X.Pxj.A01(r14)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0u     // Catch:{ RuntimeException -> 0x0610 }
            X.8fv r3 = X.C11419SSu.A01(r8, r0)     // Catch:{ RuntimeException -> 0x0610 }
            r0 = 2131239633(0x7f0822d1, float:1.8095578E38)
            X.7v0 r22 = X.C11419SSu.A02(r8, r0)     // Catch:{ RuntimeException -> 0x0610 }
            float r2 = (float) r12     // Catch:{ RuntimeException -> 0x0610 }
            float r1 = (float) r11     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r0 = "u_RenderSize"
            X.Pxh.A1B(r3, r0, r2, r1)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r1 = "u_LUT"
            r0 = r22
            r3.A03(r1, r0)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.Object r2 = r6.get(r10)     // Catch:{ RuntimeException -> 0x0610 }
            X.7v0 r2 = (X.C346337v0) r2     // Catch:{ RuntimeException -> 0x0610 }
            r0 = r30
            java.lang.Object r1 = r6.get(r0)     // Catch:{ RuntimeException -> 0x0610 }
            X.7v0 r1 = (X.C346337v0) r1     // Catch:{ RuntimeException -> 0x0610 }
            float[] r0 = X.C10140RnH.A0A     // Catch:{ RuntimeException -> 0x0610 }
            float r21 = X.RhT.A00(r0, r9)     // Catch:{ RuntimeException -> 0x0610 }
            float[] r0 = X.C10140RnH.A0B     // Catch:{ RuntimeException -> 0x0610 }
            float r20 = X.RhT.A00(r0, r9)     // Catch:{ RuntimeException -> 0x0610 }
            float[] r0 = X.C10140RnH.A08     // Catch:{ RuntimeException -> 0x0610 }
            float r19 = X.RhT.A00(r0, r9)     // Catch:{ RuntimeException -> 0x0610 }
            float r0 = (float) r9     // Catch:{ RuntimeException -> 0x0610 }
            r18 = r0
            r0 = 1123024896(0x42f00000, float:120.0)
            float r18 = r18 / r0
            float[] r17 = X.C10140RnH.A09     // Catch:{ RuntimeException -> 0x0610 }
            r16 = 9
            r15 = 0
        L_0x0284:
            r0 = r17[r15]     // Catch:{ RuntimeException -> 0x0610 }
            int r0 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r0 > 0) goto L_0x02b9
            int r0 = r15 + 1
            r0 = r17[r0]     // Catch:{ RuntimeException -> 0x0610 }
            int r0 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r0 < 0) goto L_0x02b9
            r1 = 3
            if (r15 >= r1) goto L_0x029a
            java.lang.Object r2 = r6.get(r10)     // Catch:{ RuntimeException -> 0x0610 }
            goto L_0x02a2
        L_0x029a:
            r2 = 5
            r0 = 2
            if (r15 >= r2) goto L_0x02ad
            java.lang.Object r2 = r6.get(r0)     // Catch:{ RuntimeException -> 0x0610 }
        L_0x02a2:
            X.7v0 r2 = (X.C346337v0) r2     // Catch:{ RuntimeException -> 0x0610 }
            r0 = r30
            java.lang.Object r1 = r6.get(r0)     // Catch:{ RuntimeException -> 0x0610 }
            X.7v0 r1 = (X.C346337v0) r1     // Catch:{ RuntimeException -> 0x0610 }
            goto L_0x02b9
        L_0x02ad:
            java.lang.Object r2 = r6.get(r0)     // Catch:{ RuntimeException -> 0x0610 }
            X.7v0 r2 = (X.C346337v0) r2     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.Object r1 = r6.get(r1)     // Catch:{ RuntimeException -> 0x0610 }
            X.7v0 r1 = (X.C346337v0) r1     // Catch:{ RuntimeException -> 0x0610 }
        L_0x02b9:
            int r15 = r15 + 1
            r0 = r16
            if (r15 < r0) goto L_0x0284
            java.lang.String r6 = "u_OffsetX"
            r0 = r21
            r3.A02(r6, r0)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r6 = "u_OffsetY"
            r0 = r20
            r3.A02(r6, r0)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r6 = "u_Angle"
            r0 = r19
            r3.A02(r6, r0)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r0 = "u_TextureA"
            r3.A03(r0, r2)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r0 = "u_TextureB"
            r3.A03(r0, r1)     // Catch:{ RuntimeException -> 0x0610 }
            r8.A05(r3, r7)     // Catch:{ RuntimeException -> 0x0610 }
            r22.A01()     // Catch:{ RuntimeException -> 0x0610 }
            X.Pxi.A0r(r23)     // Catch:{ RuntimeException -> 0x0610 }
            X.8tg r2 = X.C11419SSu.A00(r14, r7, r8)     // Catch:{ RuntimeException -> 0x0610 }
            android.opengl.GLES20.glViewport(r10, r10, r12, r11)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.Integer r0 = X.AnonymousClass05K.A15     // Catch:{ RuntimeException -> 0x0610 }
            goto L_0x0519
        L_0x02f7:
            X.8so r7 = A01(r13, r2, r3, r4)     // Catch:{ RuntimeException -> 0x0610 }
            X.C11419SSu.A04(r7, r8)     // Catch:{ RuntimeException -> 0x0610 }
            java.util.ArrayList r6 = X.C11419SSu.A03(r2)     // Catch:{ RuntimeException -> 0x0610 }
            X.8tg r14 = new X.8tg     // Catch:{ RuntimeException -> 0x0610 }
            r14.<init>(r12, r11)     // Catch:{ RuntimeException -> 0x0610 }
            char r24 = X.Pxj.A01(r14)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.Integer r0 = X.AnonymousClass05K.A1F     // Catch:{ RuntimeException -> 0x0610 }
            X.8fv r3 = X.C11419SSu.A01(r8, r0)     // Catch:{ RuntimeException -> 0x0610 }
            r0 = 2131237335(0x7f0819d7, float:1.8090918E38)
            X.7v0 r23 = X.C11419SSu.A02(r8, r0)     // Catch:{ RuntimeException -> 0x0610 }
            r0 = 2131237334(0x7f0819d6, float:1.8090916E38)
            X.7v0 r22 = A00(r3, r8, r0, r4)     // Catch:{ RuntimeException -> 0x0610 }
            float r2 = (float) r12     // Catch:{ RuntimeException -> 0x0610 }
            float r1 = (float) r11     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r0 = "u_RenderSize"
            X.Pxh.A1B(r3, r0, r2, r1)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r1 = "u_Frame"
            r0 = r22
            r3.A03(r1, r0)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r1 = "u_LUT"
            r0 = r23
            r3.A03(r1, r0)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.Object r2 = r6.get(r10)     // Catch:{ RuntimeException -> 0x0610 }
            X.7v0 r2 = (X.C346337v0) r2     // Catch:{ RuntimeException -> 0x0610 }
            r21 = 3
            r0 = r21
            java.lang.Object r1 = r6.get(r0)     // Catch:{ RuntimeException -> 0x0610 }
            X.7v0 r1 = (X.C346337v0) r1     // Catch:{ RuntimeException -> 0x0610 }
            float[] r15 = X.C10140RnH.A05     // Catch:{ RuntimeException -> 0x0610 }
            float[] r20 = X.C10140RnH.A04     // Catch:{ RuntimeException -> 0x0610 }
            r0 = r20
            float r19 = X.RhS.A00(r15, r0, r9)     // Catch:{ RuntimeException -> 0x0610 }
            double r15 = java.lang.Math.random()     // Catch:{ RuntimeException -> 0x0610 }
            r17 = 4594572340058128384(0x3fc3333340000000, double:0.15000000596046448)
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x035f
            goto L_0x0362
        L_0x035f:
            r18 = 0
            goto L_0x036b
        L_0x0362:
            r18 = 1056964608(0x3f000000, float:0.5)
            float r0 = (float) r15     // Catch:{ RuntimeException -> 0x0610 }
            float r18 = r18 - r0
            r0 = 1082130432(0x40800000, float:4.0)
            float r18 = r18 / r0
        L_0x036b:
            float r0 = (float) r9     // Catch:{ RuntimeException -> 0x0610 }
            r17 = r0
            r0 = 1123024896(0x42f00000, float:120.0)
            float r17 = r17 / r0
            r16 = 8
            r15 = 0
        L_0x0375:
            r0 = r20[r15]     // Catch:{ RuntimeException -> 0x0610 }
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 > 0) goto L_0x03b1
            int r0 = r15 + 1
            r0 = r20[r0]     // Catch:{ RuntimeException -> 0x0610 }
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 < 0) goto L_0x03b1
            r0 = r30
            if (r15 >= r0) goto L_0x0388
            goto L_0x03a4
        L_0x0388:
            r0 = r21
            if (r15 >= r0) goto L_0x0391
            java.lang.Object r2 = r6.get(r10)     // Catch:{ RuntimeException -> 0x0610 }
            goto L_0x0399
        L_0x0391:
            r1 = 2
            r0 = 5
            java.lang.Object r2 = r6.get(r1)     // Catch:{ RuntimeException -> 0x0610 }
            if (r15 >= r0) goto L_0x03a8
        L_0x0399:
            X.7v0 r2 = (X.C346337v0) r2     // Catch:{ RuntimeException -> 0x0610 }
            r0 = r30
            java.lang.Object r1 = r6.get(r0)     // Catch:{ RuntimeException -> 0x0610 }
        L_0x03a1:
            X.7v0 r1 = (X.C346337v0) r1     // Catch:{ RuntimeException -> 0x0610 }
            goto L_0x03b1
        L_0x03a4:
            java.lang.Object r2 = r6.get(r10)     // Catch:{ RuntimeException -> 0x0610 }
        L_0x03a8:
            X.7v0 r2 = (X.C346337v0) r2     // Catch:{ RuntimeException -> 0x0610 }
            r0 = r21
            java.lang.Object r1 = r6.get(r0)     // Catch:{ RuntimeException -> 0x0610 }
            goto L_0x03a1
        L_0x03b1:
            int r15 = r15 + 1
            r0 = r16
            if (r15 < r0) goto L_0x0375
            java.lang.String r6 = "u_Exposure"
            r0 = r18
            r3.A02(r6, r0)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r6 = "u_OffsetY"
            r0 = r19
            r3.A02(r6, r0)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r0 = "u_TextureA"
            r3.A03(r0, r2)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r0 = "u_TextureB"
            r3.A03(r0, r1)     // Catch:{ RuntimeException -> 0x0610 }
            r8.A05(r3, r7)     // Catch:{ RuntimeException -> 0x0610 }
            X.Pxi.A0r(r24)     // Catch:{ RuntimeException -> 0x0610 }
            r23.A01()     // Catch:{ RuntimeException -> 0x0610 }
            r22.A01()     // Catch:{ RuntimeException -> 0x0610 }
            X.8tg r2 = X.C11419SSu.A00(r14, r7, r8)     // Catch:{ RuntimeException -> 0x0610 }
            android.opengl.GLES20.glViewport(r10, r10, r12, r11)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.Integer r0 = X.AnonymousClass05K.A1I     // Catch:{ RuntimeException -> 0x0610 }
            goto L_0x0519
        L_0x03ea:
            X.8so r7 = A01(r13, r2, r3, r4)     // Catch:{ RuntimeException -> 0x0610 }
            X.C11419SSu.A04(r7, r8)     // Catch:{ RuntimeException -> 0x0610 }
            java.util.ArrayList r6 = X.C11419SSu.A03(r2)     // Catch:{ RuntimeException -> 0x0610 }
            X.8tg r14 = new X.8tg     // Catch:{ RuntimeException -> 0x0610 }
            r14.<init>(r12, r11)     // Catch:{ RuntimeException -> 0x0610 }
            char r28 = X.Pxj.A01(r14)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.Integer r0 = X.AnonymousClass05K.A02     // Catch:{ RuntimeException -> 0x0610 }
            X.8fv r3 = X.C11419SSu.A01(r8, r0)     // Catch:{ RuntimeException -> 0x0610 }
            r0 = 2131237337(0x7f0819d9, float:1.8090922E38)
            X.7v0 r27 = X.C11419SSu.A02(r8, r0)     // Catch:{ RuntimeException -> 0x0610 }
            r0 = 2131237336(0x7f0819d8, float:1.809092E38)
            X.7v0 r26 = X.C11419SSu.A02(r8, r0)     // Catch:{ RuntimeException -> 0x0610 }
            r0 = 2131237338(0x7f0819da, float:1.8090924E38)
            X.7v0 r25 = A00(r3, r8, r0, r4)     // Catch:{ RuntimeException -> 0x0610 }
            float r2 = (float) r12     // Catch:{ RuntimeException -> 0x0610 }
            float r1 = (float) r11     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r0 = "u_RenderSize"
            X.Pxh.A1B(r3, r0, r2, r1)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r1 = "u_Frame"
            r0 = r26
            r3.A03(r1, r0)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r1 = "u_Overlay"
            r0 = r25
            r3.A03(r1, r0)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r1 = "u_LUT"
            r0 = r27
            r3.A03(r1, r0)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.Object r2 = r6.get(r10)     // Catch:{ RuntimeException -> 0x0610 }
            X.7v0 r2 = (X.C346337v0) r2     // Catch:{ RuntimeException -> 0x0610 }
            r24 = 3
            r0 = r24
            java.lang.Object r1 = r6.get(r0)     // Catch:{ RuntimeException -> 0x0610 }
            X.7v0 r1 = (X.C346337v0) r1     // Catch:{ RuntimeException -> 0x0610 }
            float[] r15 = X.C10140RnH.A05     // Catch:{ RuntimeException -> 0x0610 }
            float[] r23 = X.C10140RnH.A04     // Catch:{ RuntimeException -> 0x0610 }
            r0 = r23
            float r22 = X.RhS.A00(r15, r0, r9)     // Catch:{ RuntimeException -> 0x0610 }
            float[] r0 = X.C10140RnH.A02     // Catch:{ RuntimeException -> 0x0610 }
            float[] r15 = X.C10140RnH.A03     // Catch:{ RuntimeException -> 0x0610 }
            float r21 = X.RhS.A00(r0, r15, r9)     // Catch:{ RuntimeException -> 0x0610 }
            float[] r0 = X.C10140RnH.A01     // Catch:{ RuntimeException -> 0x0610 }
            float r20 = X.RhS.A00(r0, r15, r9)     // Catch:{ RuntimeException -> 0x0610 }
            float[] r0 = X.C10140RnH.A00     // Catch:{ RuntimeException -> 0x0610 }
            float r19 = X.RhS.A00(r0, r15, r9)     // Catch:{ RuntimeException -> 0x0610 }
            double r15 = java.lang.Math.random()     // Catch:{ RuntimeException -> 0x0610 }
            r17 = 4594572340058128384(0x3fc3333340000000, double:0.15000000596046448)
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x0475
            goto L_0x0478
        L_0x0475:
            r18 = 0
            goto L_0x0481
        L_0x0478:
            r18 = 1056964608(0x3f000000, float:0.5)
            float r0 = (float) r15     // Catch:{ RuntimeException -> 0x0610 }
            float r18 = r18 - r0
            r0 = 1082130432(0x40800000, float:4.0)
            float r18 = r18 / r0
        L_0x0481:
            float r0 = (float) r9     // Catch:{ RuntimeException -> 0x0610 }
            r17 = r0
            r0 = 1123024896(0x42f00000, float:120.0)
            float r17 = r17 / r0
            r16 = 8
            r15 = 0
        L_0x048b:
            r0 = r23[r15]     // Catch:{ RuntimeException -> 0x0610 }
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 > 0) goto L_0x04c7
            int r0 = r15 + 1
            r0 = r23[r0]     // Catch:{ RuntimeException -> 0x0610 }
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 < 0) goto L_0x04c7
            r0 = r30
            if (r15 >= r0) goto L_0x049e
            goto L_0x04ba
        L_0x049e:
            r0 = r24
            if (r15 >= r0) goto L_0x04a7
            java.lang.Object r2 = r6.get(r10)     // Catch:{ RuntimeException -> 0x0610 }
            goto L_0x04af
        L_0x04a7:
            r1 = 2
            r0 = 5
            java.lang.Object r2 = r6.get(r1)     // Catch:{ RuntimeException -> 0x0610 }
            if (r15 >= r0) goto L_0x04be
        L_0x04af:
            X.7v0 r2 = (X.C346337v0) r2     // Catch:{ RuntimeException -> 0x0610 }
            r0 = r30
            java.lang.Object r1 = r6.get(r0)     // Catch:{ RuntimeException -> 0x0610 }
        L_0x04b7:
            X.7v0 r1 = (X.C346337v0) r1     // Catch:{ RuntimeException -> 0x0610 }
            goto L_0x04c7
        L_0x04ba:
            java.lang.Object r2 = r6.get(r10)     // Catch:{ RuntimeException -> 0x0610 }
        L_0x04be:
            X.7v0 r2 = (X.C346337v0) r2     // Catch:{ RuntimeException -> 0x0610 }
            r0 = r24
            java.lang.Object r1 = r6.get(r0)     // Catch:{ RuntimeException -> 0x0610 }
            goto L_0x04b7
        L_0x04c7:
            int r15 = r15 + 1
            r0 = r16
            if (r15 < r0) goto L_0x048b
            java.lang.String r6 = "u_Exposure"
            r0 = r18
            r3.A02(r6, r0)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r6 = "u_OffsetY"
            r0 = r22
            r3.A02(r6, r0)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r6 = "u_OverlayR"
            r0 = r21
            r3.A02(r6, r0)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r6 = "u_OverlayG"
            r0 = r20
            r3.A02(r6, r0)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r6 = "u_OverlayB"
            r0 = r19
            r3.A02(r6, r0)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r0 = "u_TextureA"
            r3.A03(r0, r2)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r0 = "u_TextureB"
            r3.A03(r0, r1)     // Catch:{ RuntimeException -> 0x0610 }
            r8.A05(r3, r7)     // Catch:{ RuntimeException -> 0x0610 }
            X.Pxi.A0r(r28)     // Catch:{ RuntimeException -> 0x0610 }
            r27.A01()     // Catch:{ RuntimeException -> 0x0610 }
            r26.A01()     // Catch:{ RuntimeException -> 0x0610 }
            r25.A01()     // Catch:{ RuntimeException -> 0x0610 }
            X.8tg r2 = X.C11419SSu.A00(r14, r7, r8)     // Catch:{ RuntimeException -> 0x0610 }
            android.opengl.GLES20.glViewport(r10, r10, r12, r11)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.Integer r0 = X.AnonymousClass05K.A03     // Catch:{ RuntimeException -> 0x0610 }
        L_0x0519:
            X.8fv r3 = X.C11419SSu.A01(r8, r0)     // Catch:{ RuntimeException -> 0x0610 }
            X.7v0 r1 = r14.A03     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r0 = "u_SourceTexture"
            r3.A03(r0, r1)     // Catch:{ RuntimeException -> 0x0610 }
            X.7v0 r1 = r2.A03     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r0 = "u_BlurTexture"
            r3.A03(r0, r1)     // Catch:{ RuntimeException -> 0x0610 }
            r8.A05(r3, r7)     // Catch:{ RuntimeException -> 0x0610 }
        L_0x0530:
            r14.A01()     // Catch:{ RuntimeException -> 0x0610 }
            goto L_0x05bc
        L_0x0535:
            float r1 = (float) r3     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r0 = "u_LutIndex"
            r7.A02(r0, r1)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r0 = "u_Exposure"
            r7.A02(r0, r14)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r1 = "u_OffsetX"
            r0 = r20
            r7.A02(r1, r0)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r1 = "u_OffsetY"
            r0 = r19
            r7.A02(r1, r0)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r1 = "u_GlitchOpacity"
            r0 = r18
            r7.A02(r1, r0)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r1 = "u_NoiseOpacity"
            r0 = r17
            r7.A02(r1, r0)     // Catch:{ RuntimeException -> 0x0610 }
            r8.A05(r7, r6)     // Catch:{ RuntimeException -> 0x0610 }
            X.Pxi.A0r(r25)     // Catch:{ RuntimeException -> 0x0610 }
            r24.A01()     // Catch:{ RuntimeException -> 0x0610 }
            r23.A01()     // Catch:{ RuntimeException -> 0x0610 }
            r22.A01()     // Catch:{ RuntimeException -> 0x0610 }
            android.opengl.GLES20.glViewport(r10, r10, r12, r11)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.Integer r0 = X.AnonymousClass05K.A05     // Catch:{ RuntimeException -> 0x0610 }
            X.8fv r1 = X.C11419SSu.A01(r8, r0)     // Catch:{ RuntimeException -> 0x0610 }
            X.7v0 r3 = r2.A03     // Catch:{ RuntimeException -> 0x0610 }
            r0 = r21
            r1.A03(r0, r3)     // Catch:{ RuntimeException -> 0x0610 }
            float[] r3 = X.C10140RnH.A0J     // Catch:{ RuntimeException -> 0x0610 }
            float[] r0 = X.C10140RnH.A0I     // Catch:{ RuntimeException -> 0x0610 }
            float r15 = X.RhS.A00(r3, r0, r9)     // Catch:{ RuntimeException -> 0x0610 }
            float[] r3 = X.C10140RnH.A0H     // Catch:{ RuntimeException -> 0x0610 }
            float[] r0 = X.C10140RnH.A0G     // Catch:{ RuntimeException -> 0x0610 }
            float r14 = X.RhS.A00(r3, r0, r9)     // Catch:{ RuntimeException -> 0x0610 }
            float[] r3 = X.C10140RnH.A0P     // Catch:{ RuntimeException -> 0x0610 }
            float[] r0 = X.C10140RnH.A0O     // Catch:{ RuntimeException -> 0x0610 }
            float r7 = X.RhS.A00(r3, r0, r9)     // Catch:{ RuntimeException -> 0x0610 }
            float[] r3 = X.C10140RnH.A0N     // Catch:{ RuntimeException -> 0x0610 }
            float[] r0 = X.C10140RnH.A0M     // Catch:{ RuntimeException -> 0x0610 }
            float r3 = X.RhS.A00(r3, r0, r9)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r0 = "u_OffsetR"
            r1.A02(r0, r15)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r0 = "u_OffsetB"
            r1.A02(r0, r14)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r0 = "u_ScaleG"
            r1.A02(r0, r7)     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r0 = "u_ScaleB"
            r1.A02(r0, r3)     // Catch:{ RuntimeException -> 0x0610 }
            r8.A05(r1, r6)     // Catch:{ RuntimeException -> 0x0610 }
        L_0x05bc:
            r2.A01()     // Catch:{ RuntimeException -> 0x0610 }
        L_0x05bf:
            X.7uK r0 = r13.A01     // Catch:{ RuntimeException -> 0x0610 }
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x05ff
            r0.A04(r4)     // Catch:{ RuntimeException -> 0x0610 }
            X.7uK r0 = r13.A01     // Catch:{ RuntimeException -> 0x0610 }
            if (r0 == 0) goto L_0x05fa
            r0.A03()     // Catch:{ RuntimeException -> 0x0610 }
            X.SSN r0 = r13.A03     // Catch:{ RuntimeException -> 0x0610 }
            if (r0 == 0) goto L_0x060b
            X.Q7p r1 = r0.A05     // Catch:{ RuntimeException -> 0x0610 }
            if (r1 != 0) goto L_0x05e0
            java.lang.String r1 = "BoomerangEncoder"
            java.lang.String r0 = "no handler available"
            X.0kD.A01(r1, r0)     // Catch:{ RuntimeException -> 0x0610 }
            goto L_0x05e4
        L_0x05e0:
            r0 = 2
            r1.sendEmptyMessage(r0)     // Catch:{ RuntimeException -> 0x0610 }
        L_0x05e4:
            r0 = 33000000(0x1f78a40, double:1.63041663E-316)
            long r4 = r4 + r0
            r0 = 119(0x77, float:1.67E-43)
            if (r9 < r0) goto L_0x05f6
            int r29 = r29 + 1
            r1 = 2
            r0 = r29
            if (r0 == r1) goto L_0x0620
            r9 = 0
            goto L_0x0030
        L_0x05f6:
            int r9 = r9 + 1
            goto L_0x0030
        L_0x05fa:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)     // Catch:{ RuntimeException -> 0x0610 }
            goto L_0x060f
        L_0x05ff:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)     // Catch:{ RuntimeException -> 0x0610 }
            goto L_0x060f
        L_0x0604:
            java.lang.String r0 = "Render resources were released while writing frames"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ RuntimeException -> 0x0610 }
            goto L_0x060f
        L_0x060b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)     // Catch:{ RuntimeException -> 0x0610 }
        L_0x060f:
            throw r0     // Catch:{ RuntimeException -> 0x0610 }
        L_0x0610:
            r2 = move-exception
            java.lang.String r1 = "PosesFramesHandlerV1"
            java.lang.String r0 = "unable to encode poses"
            X.0KC.A0F(r1, r0, r2)
            X.0kD.A07(r1, r0, r2)
            r0 = r30
            r13.A0G = r0
        L_0x0620:
            boolean r0 = r13.A0G
            r2 = r0 ^ 1
            X.7uK r0 = r13.A01
            if (r0 == 0) goto L_0x0673
            X.SSN r0 = r13.A03
            if (r0 == 0) goto L_0x0673
            X.SSu r0 = r13.A02
            if (r0 == 0) goto L_0x0673
            java.util.concurrent.atomic.AtomicInteger r0 = r13.A0D
            r1 = 3
            r0.set(r1)
            X.SSN r0 = r13.A03
            if (r0 == 0) goto L_0x067c
            X.Q7p r0 = r0.A05
            if (r0 != 0) goto L_0x066f
            java.lang.String r1 = "BoomerangEncoder"
            java.lang.String r0 = "no handler available"
            X.0kD.A01(r1, r0)
        L_0x0646:
            android.os.Handler r1 = r13.A08
            X.TDb r0 = new X.TDb
            r0.<init>(r13)
            r1.post(r0)
            if (r2 != 0) goto L_0x0669
            java.lang.String r1 = r13.A05
            if (r1 == 0) goto L_0x0669
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0669
            java.io.File r1 = X.AnonymousClass7TE.A0t(r1)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0669
            r1.deleteOnExit()
        L_0x0669:
            java.util.List r0 = r13.A0C
            r0.clear()
            return
        L_0x066f:
            r0.sendEmptyMessage(r1)
            goto L_0x0646
        L_0x0673:
            java.lang.String r2 = "incorrect poses state"
            java.lang.String r1 = "Poses tried to finish after rendering resources were released"
            r0 = 0
            X.0kD.A07(r2, r1, r0)
            goto L_0x0669
        L_0x067c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0681:
            java.lang.String r0 = "Output surface should be created before writing frames"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SSF.A02(X.SSF):void");
    }

    public static final void A03(SSF ssf) {
        if (ssf.A00 != null) {
            SSN ssn = new SSN(ssf.A0F);
            ssn.A04 = new C10288Rpm(ssf);
            int i = ssf.A07;
            int i2 = ssf.A06;
            boolean A042 = ssn.A04(i, i2, (int) (((double) (i * i2)) * (1.0E9d / 3.3E7d) * 4.0d * 0.07d), 0);
            C345937uK r2 = null;
            if (!A042) {
                0kD.A07("PosesFramesHandlerV1", "startEncoder() mPosesEncoder.configure failed.", (Throwable) null);
                return;
            }
            Surface surface = ssn.A03;
            if (surface != null) {
                C344587s6 r0 = ssf.A00;
                if (r0 != null) {
                    r2 = r0.AMY(surface);
                }
                ssf.A01 = r2;
                if (r2 != null) {
                    r2.A05();
                }
                String str = ssf.A05;
                synchronized (ssn) {
                    if (ssn.A05 == null) {
                        HandlerThread A0I = Pxf.A0I("BurstFramesEncoderThread");
                        A0I.start();
                        Q7p q7p = new Q7p(A0I.getLooper(), ssn);
                        ssn.A05 = q7p;
                        Message obtainMessage = q7p.obtainMessage(1, str);
                        obtainMessage.arg1 = 0;
                        ssn.A05.sendMessage(obtainMessage);
                    } else {
                        throw AnonymousClass7TE.A0z("startVideoRecording() is called more than once!");
                    }
                }
                ssf.A03 = ssn;
            }
        }
    }

    public SSF(Context context, UserSession userSession, OA1 oa1, String str, int i, int i2) {
        this.A0F = userSession;
        this.A07 = i;
        this.A06 = i2;
        this.A05 = str;
        this.A0B = oa1;
        float[] fArr = new float[16];
        this.A0E = fArr;
        this.A0A = new C368538so();
        this.A09 = new C345557ti(context.getResources());
        this.A04 = C69516Nmy.FLASH;
        Matrix.setIdentityM(fArr, 0);
        C365268mo.A01(fArr);
        HandlerThread A0I = Pxf.A0I("PosesRenderThread");
        A0I.start();
        Looper looper = A0I.getLooper();
        if (looper != null) {
            this.A08 = new Handler(looper);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static C346337v0 A00(C361258fv r3, C11419SSu sSu, int i, long j) {
        C346337v0 A022 = C11419SSu.A02(sSu, i);
        r3.A02("u_Time", ((float) j) / 1.0E9f);
        return A022;
    }
}
