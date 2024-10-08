package X;

import android.graphics.Rect;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3dV  reason: invalid class name and case insensitive filesystem */
public final class C245803dV extends C251323mv implements C245653dG {
    public static final C245803dV A00 = new Object();

    public static C70682Ty A00(C245753dQ r1) {
        C70682Ty r0 = ((C245823dX) r1.A02).A02;
        if (r0 == null) {
            return r1.A00.A06.A07;
        }
        return r0;
    }

    public static HashMap A01(C246303eM r3) {
        HashMap hashMap = new HashMap();
        hashMap.put("renderUnitId", Long.valueOf(r3.A05));
        hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r3.A08);
        hashMap.put("bounds", r3.A06);
        hashMap.put("key", r3.A09);
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01fc, code lost:
        if (r12.equals(r7) != false) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        if (r7.equals(r12) == false) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01e7 A[Catch:{ all -> 0x031b }] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01e8 A[Catch:{ all -> 0x031b }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01f5 A[Catch:{ all -> 0x031b }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01f8 A[Catch:{ all -> 0x031b }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0204 A[Catch:{ all -> 0x031b }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x023c A[Catch:{ all -> 0x031b }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0248 A[Catch:{ all -> 0x031b }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0254 A[Catch:{ all -> 0x031b }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0260 A[Catch:{ all -> 0x031b }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x026e A[Catch:{ all -> 0x031b }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x027b A[Catch:{ all -> 0x031b }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02ca A[Catch:{ all -> 0x031b }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x02cd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e3 A[Catch:{ all -> 0x031b }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x012c A[Catch:{ all -> 0x031b }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01d6 A[Catch:{ all -> 0x031b }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01d8 A[Catch:{ all -> 0x031b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(android.graphics.Rect r33, X.C245753dQ r34, boolean r35) {
        /*
            r11 = r34
            java.lang.Object r8 = r11.A02
            X.3dX r8 = (X.C245823dX) r8
            X.3kJ r0 = X.1KZ.A01
            boolean r23 = r0.isTracing()
            if (r23 == 0) goto L_0x0013
            java.lang.String r0 = "VisibilityExtension.processVisibilityOutputs"
            X.1KZ.A01(r0)     // Catch:{ all -> 0x031b }
        L_0x0013:
            android.graphics.Rect r0 = r8.A05     // Catch:{ all -> 0x031b }
            r34 = r0
            r10 = r33
            if (r33 == 0) goto L_0x030e
            r9 = r35
            if (r35 != 0) goto L_0x0027
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x031b }
            if (r0 == 0) goto L_0x0027
            goto L_0x030e
        L_0x0027:
            java.util.List r0 = r8.A03     // Catch:{ all -> 0x031b }
            int r22 = r0.size()     // Catch:{ all -> 0x031b }
            java.util.List r0 = r8.A03     // Catch:{ all -> 0x031b }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x031b }
            if (r0 != 0) goto L_0x02d1
            r21 = 0
            X.3kJ r0 = X.1KZ.A01     // Catch:{ all -> 0x031b }
            boolean r20 = r0.isTracing()     // Catch:{ all -> 0x031b }
            android.graphics.Rect r7 = new android.graphics.Rect     // Catch:{ all -> 0x031b }
            r7.<init>()     // Catch:{ all -> 0x031b }
            r6 = 0
        L_0x0043:
            r0 = r22
            if (r6 >= r0) goto L_0x02d1
            java.util.List r0 = r8.A03     // Catch:{ all -> 0x031b }
            java.lang.Object r13 = r0.get(r6)     // Catch:{ all -> 0x031b }
            X.3d7 r13 = (X.C245563d7) r13     // Catch:{ all -> 0x031b }
            java.lang.String r0 = r13.A0B     // Catch:{ all -> 0x031b }
            r30 = r0
            if (r20 == 0) goto L_0x005e
            java.lang.String r1 = "visibilityHandlers:"
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ all -> 0x031b }
            X.1KZ.A01(r0)     // Catch:{ all -> 0x031b }
        L_0x005e:
            android.graphics.Rect r12 = r13.A03     // Catch:{ all -> 0x031b }
            boolean r2 = r7.setIntersect(r12, r10)     // Catch:{ all -> 0x031b }
            if (r2 == 0) goto L_0x006d
            boolean r0 = r7.equals(r12)     // Catch:{ all -> 0x031b }
            r14 = 1
            if (r0 != 0) goto L_0x006e
        L_0x006d:
            r14 = 0
        L_0x006e:
            java.lang.String r0 = r13.A0A     // Catch:{ all -> 0x031b }
            r29 = r0
            java.util.Map r0 = r8.A06     // Catch:{ all -> 0x031b }
            r33 = r0
            r1 = r29
            java.lang.Object r15 = r0.get(r1)     // Catch:{ all -> 0x031b }
            X.3eM r15 = (X.C246303eM) r15     // Catch:{ all -> 0x031b }
            if (r15 == 0) goto L_0x0085
            boolean r0 = r15.A04     // Catch:{ all -> 0x031b }
            r15.A04 = r14     // Catch:{ all -> 0x031b }
            goto L_0x0086
        L_0x0085:
            r0 = 0
        L_0x0086:
            if (r14 == 0) goto L_0x0095
            if (r0 == 0) goto L_0x0095
            if (r20 == 0) goto L_0x008f
            X.1KZ.A00()     // Catch:{ all -> 0x031b }
        L_0x008f:
            if (r15 == 0) goto L_0x02cd
            r15.A03 = r9     // Catch:{ all -> 0x031b }
            goto L_0x02cd
        L_0x0095:
            X.2Sh r0 = r13.A09     // Catch:{ all -> 0x031b }
            r19 = r0
            X.2Sh r5 = r13.A04     // Catch:{ all -> 0x031b }
            X.2Sh r4 = r13.A07     // Catch:{ all -> 0x031b }
            X.2Sh r0 = r13.A05     // Catch:{ all -> 0x031b }
            r18 = r0
            X.2Sh r0 = r13.A06     // Catch:{ all -> 0x031b }
            r26 = r0
            X.2Sh r3 = r13.A08     // Catch:{ all -> 0x031b }
            if (r2 == 0) goto L_0x00e0
            float r2 = r13.A00     // Catch:{ all -> 0x031b }
            float r1 = r13.A01     // Catch:{ all -> 0x031b }
            r16 = 0
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00b4
            goto L_0x00da
        L_0x00b4:
            int r17 = r12.height()     // Catch:{ all -> 0x031b }
            int r0 = r7.height()     // Catch:{ all -> 0x031b }
            float r0 = (float) r0     // Catch:{ all -> 0x031b }
            r16 = r0
            r0 = r17
            float r0 = (float) r0     // Catch:{ all -> 0x031b }
            float r2 = r2 * r0
            int r0 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x00e0
            int r16 = r12.width()     // Catch:{ all -> 0x031b }
            int r0 = r7.width()     // Catch:{ all -> 0x031b }
            float r0 = (float) r0     // Catch:{ all -> 0x031b }
            r2 = r0
            r0 = r16
            float r0 = (float) r0     // Catch:{ all -> 0x031b }
            float r1 = r1 * r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00e0
            goto L_0x00de
        L_0x00da:
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00b4
        L_0x00de:
            r1 = 1
            goto L_0x00e1
        L_0x00e0:
            r1 = 0
        L_0x00e1:
            if (r15 == 0) goto L_0x012c
            r15.A02 = r4     // Catch:{ all -> 0x031b }
            r0 = r26
            r15.A01 = r0     // Catch:{ all -> 0x031b }
            if (r1 != 0) goto L_0x0129
            X.3dP r0 = r11.A00     // Catch:{ all -> 0x031b }
            X.2UL r0 = r0.A06     // Catch:{ all -> 0x031b }
            X.3dH r0 = r0.A02     // Catch:{ all -> 0x031b }
            if (r0 == 0) goto L_0x00f9
            int r0 = r0.A00     // Catch:{ all -> 0x031b }
        L_0x00f5:
            A04(r15, r0)     // Catch:{ all -> 0x031b }
            goto L_0x00fb
        L_0x00f9:
            r0 = -1
            goto L_0x00f5
        L_0x00fb:
            if (r3 == 0) goto L_0x0109
            r1 = 0
            X.2Uw r0 = X.C246313eN.A04     // Catch:{ all -> 0x031b }
            r0.A00 = r1     // Catch:{ all -> 0x031b }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x031b }
            r3.call(r0)     // Catch:{ all -> 0x031b }
        L_0x0109:
            int r1 = r15.A00     // Catch:{ all -> 0x031b }
            r0 = r1 & 32
            if (r0 == 0) goto L_0x0120
            r0 = r1 & -33
            r15.A00 = r0     // Catch:{ all -> 0x031b }
            X.2Sh r1 = r15.A02     // Catch:{ all -> 0x031b }
            if (r1 == 0) goto L_0x0120
            X.2W4 r0 = X.C246313eN.A03     // Catch:{ all -> 0x031b }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x031b }
            r1.call(r0)     // Catch:{ all -> 0x031b }
        L_0x0120:
            r1 = r29
            r0 = r33
            r0.remove(r1)     // Catch:{ all -> 0x031b }
            goto L_0x02c8
        L_0x0129:
            r15.A03 = r9     // Catch:{ all -> 0x031b }
            goto L_0x01aa
        L_0x012c:
            if (r1 == 0) goto L_0x02c8
            long r1 = r13.A02     // Catch:{ all -> 0x031b }
            X.3eM r15 = new X.3eM     // Catch:{ all -> 0x031b }
            r24 = r15
            r25 = r12
            r27 = r4
            r28 = r3
            r31 = r1
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x031b }
            r15.A03 = r9     // Catch:{ all -> 0x031b }
            r15.A04 = r14     // Catch:{ all -> 0x031b }
            r14 = r29
            r0 = r33
            r0.put(r14, r15)     // Catch:{ all -> 0x031b }
            if (r19 == 0) goto L_0x01aa
            boolean r0 = r13.A0C     // Catch:{ all -> 0x031b }
            if (r0 == 0) goto L_0x019f
            X.3dP r0 = r11.A00     // Catch:{ all -> 0x031b }
            X.2UL r0 = r0.A06     // Catch:{ all -> 0x031b }
            X.01c r0 = r0.A06     // Catch:{ all -> 0x031b }
            java.lang.Object r0 = r0.A05(r1)     // Catch:{ all -> 0x031b }
            X.3e2 r0 = (X.C246113e2) r0     // Catch:{ all -> 0x031b }
            if (r0 == 0) goto L_0x019d
            java.lang.Object r13 = r0.A04     // Catch:{ all -> 0x031b }
        L_0x0160:
            java.lang.String r14 = "RenderCore.RenderUnit.OnVisible"
            java.lang.Integer r16 = X.2SN.A01(r14)     // Catch:{ all -> 0x031b }
            if (r16 == 0) goto L_0x0181
            int r2 = r16.intValue()     // Catch:{ all -> 0x031b }
            X.3dP r0 = r11.A00     // Catch:{ all -> 0x031b }
            X.2UL r0 = r0.A06     // Catch:{ all -> 0x031b }
            X.3dH r0 = r0.A02     // Catch:{ all -> 0x031b }
            if (r0 == 0) goto L_0x019b
            int r0 = r0.A00     // Catch:{ all -> 0x031b }
        L_0x0176:
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x031b }
            java.util.HashMap r0 = A01(r15)     // Catch:{ all -> 0x031b }
            X.2SN.A05(r14, r1, r0, r2)     // Catch:{ all -> 0x031b }
        L_0x0181:
            java.lang.String r0 = "VisibilityUtils.dispatchOnVisible"
            X.1KZ.A01(r0)     // Catch:{ all -> 0x031b }
            X.2Uo r2 = X.C246313eN.A05     // Catch:{ all -> 0x031b }
            r2.A00 = r13     // Catch:{ all -> 0x031b }
            java.lang.Object[] r1 = new java.lang.Object[]{r2}     // Catch:{ all -> 0x031b }
            r0 = r19
            r0.call(r1)     // Catch:{ all -> 0x031b }
            r0 = r21
            r2.A00 = r0     // Catch:{ all -> 0x031b }
            X.1KZ.A00()     // Catch:{ all -> 0x031b }
            goto L_0x01a1
        L_0x019b:
            r0 = -1
            goto L_0x0176
        L_0x019d:
            r13 = 0
            goto L_0x0160
        L_0x019f:
            r13 = 0
            goto L_0x0160
        L_0x01a1:
            if (r16 == 0) goto L_0x01aa
            int r0 = r16.intValue()     // Catch:{ all -> 0x031b }
            X.2SN.A02(r0)     // Catch:{ all -> 0x031b }
        L_0x01aa:
            if (r5 != 0) goto L_0x01b1
            if (r4 != 0) goto L_0x01b1
        L_0x01ae:
            if (r18 == 0) goto L_0x0279
            goto L_0x022a
        L_0x01b1:
            X.2Ty r1 = A00(r11)     // Catch:{ all -> 0x031b }
            android.view.ViewParent r0 = r1.getParent()     // Catch:{ all -> 0x031b }
            boolean r0 = r0 instanceof android.view.View     // Catch:{ all -> 0x031b }
            if (r0 == 0) goto L_0x0214
            android.view.ViewParent r0 = r1.getParent()     // Catch:{ all -> 0x031b }
            android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x031b }
            if (r0 == 0) goto L_0x0214
            int r1 = r0.getWidth()     // Catch:{ all -> 0x031b }
            int r0 = r0.getHeight()     // Catch:{ all -> 0x031b }
            int r1 = r1 * r0
            int r13 = r1 / 2
            boolean r0 = r12.isEmpty()     // Catch:{ all -> 0x031b }
            if (r0 == 0) goto L_0x01d8
            r2 = 0
            goto L_0x01e1
        L_0x01d8:
            int r0 = r12.width()     // Catch:{ all -> 0x031b }
            int r2 = r12.height()     // Catch:{ all -> 0x031b }
            int r2 = r2 * r0
        L_0x01e1:
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x031b }
            if (r0 == 0) goto L_0x01e8
            goto L_0x01f2
        L_0x01e8:
            int r1 = r7.width()     // Catch:{ all -> 0x031b }
            int r0 = r7.height()     // Catch:{ all -> 0x031b }
            int r0 = r0 * r1
            goto L_0x01f3
        L_0x01f2:
            r0 = 0
        L_0x01f3:
            if (r2 < r13) goto L_0x01f8
            if (r0 < r13) goto L_0x0214
            goto L_0x01fe
        L_0x01f8:
            boolean r0 = r12.equals(r7)     // Catch:{ all -> 0x031b }
            if (r0 == 0) goto L_0x0214
        L_0x01fe:
            int r1 = r15.A00     // Catch:{ all -> 0x031b }
            r0 = r1 & 32
            if (r0 != 0) goto L_0x01ae
            r0 = r1 | 32
            r15.A00 = r0     // Catch:{ all -> 0x031b }
            if (r5 == 0) goto L_0x01ae
            X.2Us r0 = X.C246313eN.A00     // Catch:{ all -> 0x031b }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x031b }
            r5.call(r0)     // Catch:{ all -> 0x031b }
            goto L_0x01ae
        L_0x0214:
            int r1 = r15.A00     // Catch:{ all -> 0x031b }
            r0 = r1 & 32
            if (r0 == 0) goto L_0x01ae
            r0 = r1 & -33
            r15.A00 = r0     // Catch:{ all -> 0x031b }
            if (r4 == 0) goto L_0x01ae
            X.2W4 r0 = X.C246313eN.A03     // Catch:{ all -> 0x031b }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x031b }
            r4.call(r0)     // Catch:{ all -> 0x031b }
            goto L_0x01ae
        L_0x022a:
            int r0 = r15.A00     // Catch:{ all -> 0x031b }
            r1 = 30
            r0 = r0 & 30
            if (r0 == r1) goto L_0x0279
            r0 = 0
            X.0qQ.A0B(r12, r0)     // Catch:{ all -> 0x031b }
            int r1 = r12.top     // Catch:{ all -> 0x031b }
            int r0 = r7.top     // Catch:{ all -> 0x031b }
            if (r1 != r0) goto L_0x0242
            int r0 = r15.A00     // Catch:{ all -> 0x031b }
            r0 = r0 | 4
            r15.A00 = r0     // Catch:{ all -> 0x031b }
        L_0x0242:
            int r1 = r12.bottom     // Catch:{ all -> 0x031b }
            int r0 = r7.bottom     // Catch:{ all -> 0x031b }
            if (r1 != r0) goto L_0x024e
            int r0 = r15.A00     // Catch:{ all -> 0x031b }
            r0 = r0 | 16
            r15.A00 = r0     // Catch:{ all -> 0x031b }
        L_0x024e:
            int r1 = r12.left     // Catch:{ all -> 0x031b }
            int r0 = r7.left     // Catch:{ all -> 0x031b }
            if (r1 != r0) goto L_0x025a
            int r0 = r15.A00     // Catch:{ all -> 0x031b }
            r0 = r0 | 2
            r15.A00 = r0     // Catch:{ all -> 0x031b }
        L_0x025a:
            int r1 = r12.right     // Catch:{ all -> 0x031b }
            int r0 = r7.right     // Catch:{ all -> 0x031b }
            if (r1 != r0) goto L_0x0266
            int r0 = r15.A00     // Catch:{ all -> 0x031b }
            r0 = r0 | 8
            r15.A00 = r0     // Catch:{ all -> 0x031b }
        L_0x0266:
            int r0 = r15.A00     // Catch:{ all -> 0x031b }
            r1 = 30
            r0 = r0 & 30
            if (r0 != r1) goto L_0x0279
            X.2Uq r0 = X.C246313eN.A01     // Catch:{ all -> 0x031b }
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x031b }
            r0 = r18
            r0.call(r1)     // Catch:{ all -> 0x031b }
        L_0x0279:
            if (r3 == 0) goto L_0x02c8
            r7.width()     // Catch:{ all -> 0x031b }
            int r2 = r7.height()     // Catch:{ all -> 0x031b }
            X.2Ty r1 = A00(r11)     // Catch:{ all -> 0x031b }
            android.view.ViewParent r0 = r1.getParent()     // Catch:{ all -> 0x031b }
            boolean r0 = r0 instanceof android.view.View     // Catch:{ all -> 0x031b }
            if (r0 == 0) goto L_0x0299
            android.view.ViewParent r0 = r1.getParent()     // Catch:{ all -> 0x031b }
            android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x031b }
            if (r0 == 0) goto L_0x0299
            r0.getWidth()     // Catch:{ all -> 0x031b }
        L_0x0299:
            X.2Ty r1 = A00(r11)     // Catch:{ all -> 0x031b }
            android.view.ViewParent r0 = r1.getParent()     // Catch:{ all -> 0x031b }
            boolean r0 = r0 instanceof android.view.View     // Catch:{ all -> 0x031b }
            if (r0 == 0) goto L_0x02b0
            android.view.ViewParent r0 = r1.getParent()     // Catch:{ all -> 0x031b }
            android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x031b }
            if (r0 == 0) goto L_0x02b0
            r0.getHeight()     // Catch:{ all -> 0x031b }
        L_0x02b0:
            r0 = 1120403456(0x42c80000, float:100.0)
            r12.width()     // Catch:{ all -> 0x031b }
            float r1 = (float) r2     // Catch:{ all -> 0x031b }
            float r1 = r1 * r0
            int r0 = r12.height()     // Catch:{ all -> 0x031b }
            float r0 = (float) r0     // Catch:{ all -> 0x031b }
            float r1 = r1 / r0
            X.2Uw r0 = X.C246313eN.A04     // Catch:{ all -> 0x031b }
            r0.A00 = r1     // Catch:{ all -> 0x031b }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x031b }
            r3.call(r0)     // Catch:{ all -> 0x031b }
        L_0x02c8:
            if (r20 == 0) goto L_0x02cd
            X.1KZ.A00()     // Catch:{ all -> 0x031b }
        L_0x02cd:
            int r6 = r6 + 1
            goto L_0x0043
        L_0x02d1:
            X.3dP r3 = r11.A00     // Catch:{ all -> 0x031b }
            java.util.Set r0 = r8.A04     // Catch:{ all -> 0x031b }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x031b }
        L_0x02d9:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x031b }
            if (r0 == 0) goto L_0x0309
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x031b }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x031b }
            long r1 = r0.longValue()     // Catch:{ all -> 0x031b }
            X.2UL r0 = r3.A06     // Catch:{ all -> 0x031b }
            X.01c r0 = r0.A06     // Catch:{ all -> 0x031b }
            java.lang.Object r0 = r0.A05(r1)     // Catch:{ all -> 0x031b }
            X.3e2 r0 = (X.C246113e2) r0     // Catch:{ all -> 0x031b }
            if (r0 == 0) goto L_0x0307
            java.lang.Object r1 = r0.A04     // Catch:{ all -> 0x031b }
        L_0x02f7:
            boolean r0 = r3.A02     // Catch:{ all -> 0x031b }
            if (r0 != 0) goto L_0x0301
            X.3kJ r0 = r3.A07     // Catch:{ all -> 0x031b }
            X.C245863db.A03(r0, r1)     // Catch:{ all -> 0x031b }
            goto L_0x02d9
        L_0x0301:
            java.util.Set r0 = r3.A09     // Catch:{ all -> 0x031b }
            r0.add(r1)     // Catch:{ all -> 0x031b }
            goto L_0x02d9
        L_0x0307:
            r1 = 0
            goto L_0x02f7
        L_0x0309:
            if (r35 == 0) goto L_0x030e
            A03(r11)     // Catch:{ all -> 0x031b }
        L_0x030e:
            if (r23 == 0) goto L_0x0313
            X.1KZ.A00()
        L_0x0313:
            if (r10 == 0) goto L_0x031a
            r0 = r34
            r0.set(r10)
        L_0x031a:
            return
        L_0x031b:
            r0 = move-exception
            if (r23 == 0) goto L_0x0321
            X.1KZ.A00()
        L_0x0321:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C245803dV.A02(android.graphics.Rect, X.3dQ, boolean):void");
    }

    public static void A03(C245753dQ r12) {
        int i;
        C245823dX r10 = (C245823dX) r12.A02;
        C245663dH r0 = r12.A00.A06.A02;
        if (r0 != null) {
            i = r0.A00;
        } else {
            i = -1;
        }
        boolean isTracing = 1KZ.A01.isTracing();
        if (isTracing) {
            1KZ.A01("VisibilityExtension.clearIncrementalItems");
        }
        ArrayList arrayList = new ArrayList();
        Map map = r10.A06;
        for (Map.Entry entry : map.entrySet()) {
            C246303eM r1 = (C246303eM) entry.getValue();
            if (r1.A03) {
                r1.A03 = false;
            } else {
                arrayList.add(entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            C246303eM r3 = (C246303eM) map.get(obj);
            if (r3 != null) {
                2Sh r13 = r3.A02;
                2Sh r2 = r3.A07;
                A04(r3, i);
                if ((r3.A00 & 32) != 0) {
                    r3.A00 &= -33;
                    if (r13 != null) {
                        r13.call(new Object[]{C246313eN.A03});
                    }
                }
                if (r2 != null) {
                    AnonymousClass2Uw r02 = C246313eN.A04;
                    r02.A00 = 0.0f;
                    r2.call(new Object[]{r02});
                }
                r3.A04 = false;
            }
            map.remove(obj);
        }
        if (isTracing) {
            1KZ.A00();
        }
        r10.A05.setEmpty();
    }

    public static void A04(C246303eM r5, int i) {
        if (r5.A01 != null) {
            Integer A01 = 2SN.A01("RenderCore.RenderUnit.OnInvisible");
            if (A01 != null) {
                2SN.A05("RenderCore.RenderUnit.OnInvisible", String.valueOf(i), A01(r5), A01.intValue());
            }
            2Sh r1 = r5.A01;
            0qQ.A0B(r1, 0);
            r1.call(new Object[]{C246313eN.A02});
            if (A01 != null) {
                2SN.A02(A01.intValue());
            }
        }
    }

    public static boolean A05(C245753dQ r2) {
        2T4 r0 = ((C245823dX) r2.A02).A01;
        if ((r0 == null || r0.A06) && !A00(r2).hasTransientState()) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object A0A() {
        return new C245823dX();
    }

    public final /* bridge */ /* synthetic */ void A0B(Rect rect, C245753dQ r5, Object obj) {
        2T4 r6 = (2T4) obj;
        r6.getClass();
        boolean isTracing = 1KZ.A01.isTracing();
        if (isTracing) {
            1KZ.A01("VisibilityExtension.beforeMount");
        }
        C245823dX r1 = (C245823dX) r5.A02;
        r1.A03 = r6.A0S;
        r1.A04 = r6.A0Z;
        r1.A05.setEmpty();
        r1.A00 = rect;
        r1.A01 = r6;
        if (isTracing) {
            1KZ.A00();
        }
    }

    public final void A0C(C245753dQ r4) {
        boolean isTracing = 1KZ.A01.isTracing();
        if (isTracing) {
            1KZ.A01("VisibilityExtension.afterMount");
        }
        if (A05(r4)) {
            A02(((C245823dX) r4.A02).A00, r4, true);
        }
        if (isTracing) {
            1KZ.A00();
        }
    }

    public final void Dzc(Rect rect, C245753dQ r5) {
        boolean A05 = A05(r5);
        boolean isTracing = 1KZ.A01.isTracing();
        if (isTracing) {
            1KZ.A01("VisibilityExtension.onVisibleBoundsChanged");
        }
        if (A05) {
            A02(rect, r5, false);
        }
        if (isTracing) {
            1KZ.A00();
        }
    }
}
