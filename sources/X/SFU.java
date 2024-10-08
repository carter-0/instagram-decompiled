package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.ArrayList;

public final class SFU {
    public static File A05;
    public static File A06;
    public boolean A00;
    public final Context A01;
    public final 02m A02 = C51965G9l.A0l();
    public final ArrayList A03;
    public final UserSession A04;

    public SFU(Context context, UserSession userSession, ArrayList arrayList) {
        0qQ.A0B(userSession, 2);
        this.A01 = context;
        this.A04 = userSession;
        this.A03 = arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00cc, code lost:
        if (r0 == 0) goto L_0x00ce;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.SFU r15, java.lang.String r16, java.util.ArrayList r17) {
        /*
            X.S2o r0 = new X.S2o
            r0.<init>()
            r14 = r17
            r0.A00(r14)
            long r6 = r0.A04
            double r4 = r0.A01
            double r2 = r0.A02
            double r0 = r0.A00
            X.02m r13 = r15.A02
            java.lang.String r8 = "_sum"
            r15 = r16
            java.lang.String r12 = X.002.A0R(r15, r8)
            double r10 = (double) r6
            double r8 = r4 * r10
            r10 = 57868289(0x3730001, float:7.1411286E-37)
            r13.markerAnnotate(r10, r12, r8)
            java.lang.String r8 = "_max"
            java.lang.String r9 = X.002.A0R(r15, r8)
            r11 = 0
            int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            boolean r8 = X.AnonymousClass7TF.A1P(r8)
            X.17k.A0F(r8)
            r13.markerAnnotate(r10, r9, r0)
            java.lang.String r0 = "_min"
            java.lang.String r1 = X.002.A0R(r15, r0)
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1P(r0)
            X.17k.A0F(r0)
            r13.markerAnnotate(r10, r1, r2)
            java.lang.String r0 = "_avg"
            java.lang.String r1 = X.002.A0R(r15, r0)
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1P(r0)
            X.17k.A0F(r0)
            r13.markerAnnotate(r10, r1, r4)
            java.lang.String r0 = "_cnt"
            java.lang.String r0 = X.002.A0R(r15, r0)
            r13.markerAnnotate(r10, r0, r6)
            java.lang.String r0 = "_p50"
            java.lang.String r15 = X.002.A0R(r15, r0)
            r4 = 1
            java.lang.Object[] r3 = r14.toArray()
            int r8 = r3.length
            double[] r6 = new double[r8]
            r2 = 0
        L_0x0075:
            if (r2 >= r8) goto L_0x0084
            java.lang.Object r0 = X.Pxe.A0t(r3, r2)
            double r0 = X.JTO.A00(r0)
            r6[r2] = r0
            int r2 = r2 + 1
            goto L_0x0075
        L_0x0084:
            boolean r1 = X.AnonymousClass7TF.A1R(r8)
            java.lang.String r0 = "Cannot calculate quantiles of an empty dataset"
            X.17k.A0G(r1, r0)
            r2 = 0
        L_0x008e:
            if (r2 >= r8) goto L_0x009b
            r0 = r6[r2]
            boolean r0 = java.lang.Double.isNaN(r0)
            if (r0 != 0) goto L_0x00ce
            int r2 = r2 + 1
            goto L_0x008e
        L_0x009b:
            int r8 = r8 - r4
            long r2 = (long) r8
            r0 = 2
            java.math.RoundingMode r4 = java.math.RoundingMode.DOWN
            long r4 = X.C7258Q1h.A03(r4, r2, r0)
            int r7 = (int) r4
            long r4 = (long) r7
            long r4 = r4 * r0
            long r2 = r2 - r4
            int r1 = (int) r2
            r0 = 0
            X.C9743Rg1.A00(r6, r7, r0, r8)
            if (r1 != 0) goto L_0x00b6
            r2 = r6[r7]
        L_0x00b2:
            r13.markerAnnotate(r10, r15, r2)
            return
        L_0x00b6:
            int r0 = r7 + 1
            X.C9743Rg1.A00(r6, r0, r0, r8)
            r16 = r6[r7]
            r11 = r6[r0]
            double r4 = (double) r1
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            r2 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            r6 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            int r1 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            int r0 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x00d1
            if (r0 != 0) goto L_0x00b2
        L_0x00ce:
            r2 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            goto L_0x00b2
        L_0x00d1:
            if (r0 != 0) goto L_0x00d6
            r2 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            goto L_0x00b2
        L_0x00d6:
            double r11 = r11 - r16
            double r11 = r11 * r4
            double r11 = r11 / r8
            double r2 = r16 + r11
            goto L_0x00b2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SFU.A00(X.SFU, java.lang.String, java.util.ArrayList):void");
    }
}
