package X;

import android.view.MotionEvent;
import java.util.List;

public final class UTO extends W0S {
    public static final 0l2 A06 = new 0l2(6);
    public MotionEvent A00;
    public C13572Tcw A01;
    public V45 A02;
    public String A03;
    public List A04;
    public short A05 = -1;

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0140, code lost:
        if (r1 != 16) goto L_0x0142;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.react.bridge.WritableNativeMap A00(int r18) {
        /*
            r17 = this;
            com.facebook.react.bridge.WritableNativeMap r9 = new com.facebook.react.bridge.WritableNativeMap
            r9.<init>()
            r10 = r17
            android.view.MotionEvent r1 = r10.A00
            r16 = r18
            r0 = r16
            int r2 = r1.getPointerId(r0)
            double r3 = (double) r2
            java.lang.String r0 = "pointerId"
            r9.putDouble(r0, r3)
            android.view.MotionEvent r1 = r10.A00
            r0 = r16
            int r1 = r1.getToolType(r0)
            r0 = 1
            if (r1 == r0) goto L_0x01c7
            r0 = 2
            if (r1 == r0) goto L_0x01c3
            r0 = 3
            if (r1 == r0) goto L_0x01bf
            java.lang.String r8 = ""
        L_0x002a:
            java.lang.String r0 = "pointerType"
            r9.putString(r0, r8)
            java.lang.String r0 = r10.A03
            java.lang.String r13 = "topClick"
            boolean r0 = r0.equals(r13)
            r12 = 1
            r11 = 0
            if (r0 != 0) goto L_0x01bc
            X.V45 r0 = r10.A02
            java.util.Set r0 = r0.A08
            boolean r0 = X.Pxf.A1U(r0, r2)
            if (r0 != 0) goto L_0x004b
            X.V45 r0 = r10.A02
            int r0 = r0.A02
            if (r2 != r0) goto L_0x01bc
        L_0x004b:
            r1 = 1
        L_0x004c:
            java.lang.String r0 = "isPrimary"
            r9.putBoolean(r0, r1)
            X.V45 r0 = r10.A02
            java.util.Map r0 = r0.A04
            java.lang.Integer r14 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r0.get(r14)
            float[] r1 = (float[]) r1
            r0 = r1[r11]
            float r0 = X.W2U.A00(r0)
            double r6 = (double) r0
            r0 = r1[r12]
            float r0 = X.W2U.A00(r0)
            double r4 = (double) r0
            java.lang.String r0 = "clientX"
            r9.putDouble(r0, r6)
            java.lang.String r0 = "clientY"
            r9.putDouble(r0, r4)
            X.V45 r0 = r10.A02
            java.util.Map r0 = r0.A07
            java.lang.Object r1 = r0.get(r14)
            float[] r1 = (float[]) r1
            r0 = r1[r11]
            float r0 = X.W2U.A00(r0)
            double r2 = (double) r0
            r0 = r1[r12]
            float r0 = X.W2U.A00(r0)
            double r0 = (double) r0
            java.lang.String r15 = "screenX"
            r9.putDouble(r15, r2)
            java.lang.String r2 = "screenY"
            r9.putDouble(r2, r0)
            java.lang.String r0 = "x"
            r9.putDouble(r0, r6)
            java.lang.String r0 = "y"
            r9.putDouble(r0, r4)
            java.lang.String r0 = "pageX"
            r9.putDouble(r0, r6)
            java.lang.String r0 = "pageY"
            r9.putDouble(r0, r4)
            X.V45 r0 = r10.A02
            java.util.Map r0 = r0.A06
            java.lang.Object r3 = r0.get(r14)
            float[] r3 = (float[]) r3
            r0 = r3[r11]
            float r0 = X.W2U.A00(r0)
            double r0 = (double) r0
            java.lang.String r2 = "offsetX"
            r9.putDouble(r2, r0)
            r0 = r3[r12]
            float r0 = X.W2U.A00(r0)
            double r0 = (double) r0
            java.lang.String r2 = "offsetY"
            r9.putDouble(r2, r0)
            int r1 = r10.A02
            java.lang.String r0 = "target"
            r9.putInt(r0, r1)
            long r2 = r10.A03
            double r0 = (double) r2
            java.lang.String r2 = "timestamp"
            r9.putDouble(r2, r0)
            java.lang.String r0 = "detail"
            r9.putInt(r0, r11)
            java.lang.String r0 = "tiltX"
            r2 = 0
            r9.putDouble(r0, r2)
            java.lang.String r0 = "tiltY"
            r9.putDouble(r0, r2)
            java.lang.String r0 = "twist"
            r9.putInt(r0, r11)
            java.lang.String r0 = "mouse"
            boolean r0 = r8.equals(r0)
            java.lang.String r5 = "height"
            java.lang.String r4 = "width"
            if (r0 != 0) goto L_0x01b8
            java.lang.String r0 = r10.A03
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x01b8
            android.view.MotionEvent r1 = r10.A00
            r0 = r16
            float r0 = r1.getTouchMajor(r0)
            float r0 = X.W2U.A00(r0)
            double r0 = (double) r0
        L_0x0115:
            r9.putDouble(r4, r0)
            r9.putDouble(r5, r0)
            android.view.MotionEvent r0 = r10.A00
            int r4 = r0.getButtonState()
            X.V45 r0 = r10.A02
            int r1 = r0.A01
            java.lang.String r0 = "touch"
            boolean r6 = r0.equals(r8)
            r5 = 0
            if (r6 != 0) goto L_0x0143
            r1 = r1 ^ r4
            if (r1 == 0) goto L_0x0142
            r0 = 1
            if (r1 == r12) goto L_0x0143
            r5 = 2
            if (r1 == r5) goto L_0x0143
            r5 = 4
            if (r1 == r5) goto L_0x01b6
            r0 = 8
            if (r1 == r0) goto L_0x01b5
            r0 = 16
            if (r1 == r0) goto L_0x0143
        L_0x0142:
            r5 = -1
        L_0x0143:
            java.lang.String r0 = "button"
            r9.putInt(r0, r5)
            java.lang.String r0 = r10.A03
            boolean r0 = X.C18670VwT.A01(r0)
            if (r0 == 0) goto L_0x01b1
            r4 = 0
        L_0x0151:
            java.lang.String r1 = "buttons"
            r9.putInt(r1, r4)
            java.lang.String r0 = r10.A03
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x019e
            r0 = 0
        L_0x0160:
            java.lang.String r4 = "pressure"
            r9.putDouble(r4, r0)
            java.lang.String r0 = "tangentialPressure"
            r9.putDouble(r0, r2)
            android.view.MotionEvent r0 = r10.A00
            int r3 = r0.getMetaState()
            r0 = r3 & 4096(0x1000, float:5.74E-42)
            r2 = 0
            boolean r1 = X.AnonymousClass7TF.A1P(r0)
            java.lang.String r0 = "ctrlKey"
            r9.putBoolean(r0, r1)
            r0 = r3 & 1
            boolean r1 = X.AnonymousClass7TF.A1P(r0)
            java.lang.String r0 = "shiftKey"
            r9.putBoolean(r0, r1)
            r0 = r3 & 2
            boolean r1 = X.AnonymousClass7TF.A1P(r0)
            java.lang.String r0 = "altKey"
            r9.putBoolean(r0, r1)
            r0 = 65536(0x10000, float:9.18355E-41)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x0198
            r2 = 1
        L_0x0198:
            java.lang.String r0 = "metaKey"
            r9.putBoolean(r0, r2)
            return r9
        L_0x019e:
            int r5 = r9.getInt(r1)
            java.lang.String r0 = r10.A03
            boolean r4 = X.C18670VwT.A01(r0)
            r0 = 0
            if (r4 != 0) goto L_0x0160
            if (r5 == 0) goto L_0x0160
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            goto L_0x0160
        L_0x01b1:
            if (r6 == 0) goto L_0x0151
            r4 = 1
            goto L_0x0151
        L_0x01b5:
            r0 = 3
        L_0x01b6:
            r5 = r0
            goto L_0x0143
        L_0x01b8:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x0115
        L_0x01bc:
            r1 = 0
            goto L_0x004c
        L_0x01bf:
            java.lang.String r8 = "mouse"
            goto L_0x002a
        L_0x01c3:
            java.lang.String r8 = "pen"
            goto L_0x002a
        L_0x01c7:
            java.lang.String r8 = "touch"
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UTO.A00(int):com.facebook.react.bridge.WritableNativeMap");
    }

    public static UTO A01(MotionEvent motionEvent, V45 v45, String str, int i) {
        UTO uto = (UTO) A06.A7A();
        if (uto == null) {
            uto = new UTO();
        }
        int i2 = v45.A03;
        long eventTime = motionEvent.getEventTime();
        uto.A00 = i2;
        uto.A02 = i;
        uto.A03 = eventTime;
        uto.A04 = true;
        uto.A03 = str;
        uto.A00 = MotionEvent.obtain(motionEvent);
        uto.A05 = 0;
        uto.A02 = v45;
        return uto;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r1.equals(r0) == false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        r2 = new java.util.ArrayList();
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r1 >= r3.A00.getPointerCount()) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        r2.add(r3.A00(r1));
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        if (r1.equals(r0) == false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
        return java.util.Arrays.asList(new X.C13948Tm8[]{r3.A00(r2)});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A02(X.UTO r3) {
        /*
            android.view.MotionEvent r0 = r3.A00
            int r2 = r0.getActionIndex()
            java.lang.String r1 = r3.A03
            int r0 = r1.hashCode()
            switch(r0) {
                case -1786514288: goto L_0x0046;
                case -1780335505: goto L_0x0043;
                case -1304584214: goto L_0x0040;
                case -1304316135: goto L_0x0020;
                case -1304250340: goto L_0x001d;
                case -1065042973: goto L_0x001a;
                case -992108237: goto L_0x0017;
                case 383186882: goto L_0x0014;
                case 1343400710: goto L_0x0011;
                default: goto L_0x000f;
            }
        L_0x000f:
            r2 = 0
        L_0x0010:
            return r2
        L_0x0011:
            java.lang.String r0 = "topPointerOut"
            goto L_0x0048
        L_0x0014:
            java.lang.String r0 = "topPointerCancel"
            goto L_0x0022
        L_0x0017:
            java.lang.String r0 = "topClick"
            goto L_0x0048
        L_0x001a:
            java.lang.String r0 = "topPointerUp"
            goto L_0x0048
        L_0x001d:
            java.lang.String r0 = "topPointerOver"
            goto L_0x0048
        L_0x0020:
            java.lang.String r0 = "topPointerMove"
        L_0x0022:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1 = 0
        L_0x002e:
            android.view.MotionEvent r0 = r3.A00
            int r0 = r0.getPointerCount()
            if (r1 >= r0) goto L_0x0010
            com.facebook.react.bridge.WritableNativeMap r0 = r3.A00(r1)
            r2.add(r0)
            int r1 = r1 + 1
            goto L_0x002e
        L_0x0040:
            java.lang.String r0 = "topPointerDown"
            goto L_0x0048
        L_0x0043:
            java.lang.String r0 = "topPointerLeave"
            goto L_0x0048
        L_0x0046:
            java.lang.String r0 = "topPointerEnter"
        L_0x0048:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            com.facebook.react.bridge.WritableNativeMap r0 = r3.A00(r2)
            X.Tm8[] r0 = new X.C13948Tm8[]{r0}
            java.util.List r2 = java.util.Arrays.asList(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UTO.A02(X.UTO):java.util.List");
    }
}
