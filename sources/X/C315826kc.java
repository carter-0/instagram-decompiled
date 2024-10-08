package X;

import android.content.Context;
import com.facebook.gltf.jni.GLTFCameraOrientation;
import com.facebook.spherical.util.Quaternion;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6kc  reason: invalid class name and case insensitive filesystem */
public final class C315826kc {
    public static final float A0A = ((float) Math.sqrt(0.5d));
    public static final float A0B;
    public static final float A0C;
    public C315856kh A00 = new Object();
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public long A04;
    public Quaternion A05 = new Quaternion();
    public final Context A06;
    public final GLTFCameraOrientation A07 = new Object();
    public final C315866ki A08 = new C315866ki();
    public final C315836kd A09;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        A0C = (float) timeUnit.toNanos(5);
        A0B = (float) timeUnit.toNanos(1);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.facebook.spherical.util.Quaternion, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v3, types: [com.facebook.spherical.util.Quaternion, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0049, code lost:
        if ((r1 instanceof android.view.WindowManager) == false) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0056, code lost:
        if ((r1 instanceof android.view.WindowManager) != false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0058, code lost:
        r1 = (android.view.WindowManager) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005a, code lost:
        if (r1 == null) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        r0 = r1.getDefaultDisplay();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        if (r0 == null) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
        r0 = java.lang.Integer.valueOf(r0.getRotation());
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0092  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(com.facebook.spherical.util.Quaternion r19, long r20) {
        /*
            r18 = this;
            r17 = 0
            r7 = r18
            boolean r0 = r7.A01
            if (r0 == 0) goto L_0x019c
            com.facebook.spherical.util.Quaternion r6 = new com.facebook.spherical.util.Quaternion
            r6.<init>()
            r0 = r19
            float r3 = r0.x
            r6.x = r3
            float r2 = r0.y
            r6.y = r2
            float r1 = r0.z
            r6.z = r1
            float r0 = r0.w
            r6.w = r0
            float r0 = -r3
            r6.x = r0
            float r0 = -r2
            r6.y = r0
            float r0 = -r1
            r6.z = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 < r0) goto L_0x004c
            android.content.Context r0 = r7.A06     // Catch:{ UnsupportedOperationException -> 0x003f }
            android.view.Display r0 = r0.getDisplay()     // Catch:{ UnsupportedOperationException -> 0x003f }
            if (r0 == 0) goto L_0x0199
            int r0 = r0.getRotation()     // Catch:{ UnsupportedOperationException -> 0x003f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ UnsupportedOperationException -> 0x003f }
            goto L_0x006a
        L_0x003f:
            android.content.Context r1 = r7.A06
            java.lang.String r0 = "window"
            java.lang.Object r1 = r1.getSystemService(r0)
            boolean r0 = r1 instanceof android.view.WindowManager
            if (r0 == 0) goto L_0x0199
            goto L_0x0058
        L_0x004c:
            android.content.Context r1 = r7.A06
            java.lang.String r0 = "window"
            java.lang.Object r1 = r1.getSystemService(r0)
            boolean r0 = r1 instanceof android.view.WindowManager
            if (r0 == 0) goto L_0x0199
        L_0x0058:
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            if (r1 == 0) goto L_0x0199
            android.view.Display r0 = r1.getDefaultDisplay()
            if (r0 == 0) goto L_0x0199
            int r0 = r0.getRotation()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x006a:
            if (r0 == 0) goto L_0x0199
            int r3 = r0.intValue()
        L_0x0070:
            com.facebook.spherical.util.Quaternion r2 = new com.facebook.spherical.util.Quaternion
            r2.<init>()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L_0x0087
            r0 = 1
            if (r3 == r0) goto L_0x0194
            r0 = 2
            if (r3 == r0) goto L_0x018f
            r0 = 3
            if (r3 != r0) goto L_0x0087
            float r1 = A0A
            r0 = r1
        L_0x0085:
            r2.z = r0
        L_0x0087:
            r2.w = r1
            r6.A00(r2)
            boolean r0 = r7.A03
            r14 = r20
            if (r0 == 0) goto L_0x0182
            com.facebook.spherical.util.Quaternion r3 = new com.facebook.spherical.util.Quaternion
            r3.<init>()
            float r4 = r6.x
            r3.x = r4
            float r2 = r6.y
            r3.y = r2
            float r1 = r6.z
            r3.z = r1
            float r0 = r6.w
            r3.w = r0
            float r0 = -r4
            r3.x = r0
            float r0 = -r2
            r3.y = r0
            float r0 = -r1
            r3.z = r0
            com.facebook.spherical.util.Quaternion r0 = r7.A05
            r3.A00(r0)
            r12 = 3
            float[] r5 = new float[r12]
            float r11 = r3.w
            float r1 = r3.x
            float r2 = r11 * r1
            float r9 = r3.y
            float r10 = r3.z
            float r0 = r9 * r10
            float r2 = r2 + r0
            r16 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r16
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = java.lang.Math.max(r2, r0)
            r8 = 1065353216(0x3f800000, float:1.0)
            float r13 = java.lang.Math.min(r0, r8)
            r0 = -1073741824(0xffffffffc0000000, float:-2.0)
            float r4 = r1 * r0
            float r2 = r4 * r9
            float r11 = r11 * r16
            float r0 = r11 * r10
            float r2 = r2 + r0
            double r2 = (double) r2
            float r0 = r1 * r16
            float r0 = r0 * r1
            float r8 = r8 - r0
            float r0 = r10 * r16
            float r0 = r0 * r10
            float r0 = r8 - r0
            double r0 = (double) r0
            double r0 = java.lang.Math.atan2(r2, r0)
            double r0 = java.lang.Math.toDegrees(r0)
            float r2 = (float) r0
            r5[r17] = r2
            double r0 = (double) r13
            double r0 = java.lang.Math.asin(r0)
            double r0 = java.lang.Math.toDegrees(r0)
            float r2 = (float) r0
            r0 = 1
            r5[r0] = r2
            float r4 = r4 * r10
            float r11 = r11 * r9
            float r4 = r4 + r11
            double r2 = (double) r4
            float r16 = r16 * r9
            float r16 = r16 * r9
            float r8 = r8 - r16
            double r0 = (double) r8
            double r0 = java.lang.Math.atan2(r2, r0)
            double r0 = java.lang.Math.toDegrees(r0)
            float r2 = (float) r0
            r11 = 2
            r5[r11] = r2
            r3 = 0
        L_0x011b:
            r0 = r5[r3]
            double r0 = (double) r0
            double r0 = java.lang.Math.toRadians(r0)
            float r2 = (float) r0
            r5[r3] = r2
            int r3 = r3 + 1
            if (r3 < r12) goto L_0x011b
            X.6kd r10 = r7.A09
            float r9 = r10.A02
            r0 = r5[r17]
            float r9 = r9 + r0
            r10.A02 = r9
            float r8 = r10.A00
            r0 = 1
            r0 = r5[r0]
            float r8 = r8 + r0
            r10.A00 = r8
            float r4 = r10.A01
            r0 = r5[r11]
            float r4 = r4 + r0
            r10.A01 = r4
            long r2 = r7.A04
            long r0 = r20 - r2
            float r2 = (float) r0
            float r0 = A0C
            float r5 = r2 / r0
            X.6kh r0 = r7.A00
            boolean r0 = r0 instanceof X.Y10
            if (r0 == 0) goto L_0x016d
            float r0 = java.lang.Math.abs(r8)
            double r0 = (double) r0
            r11 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            int r3 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r3 > 0) goto L_0x0169
            float r0 = java.lang.Math.abs(r4)
            double r0 = (double) r0
            r11 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r3 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x016d
        L_0x0169:
            float r0 = A0B
            float r5 = r2 / r0
        L_0x016d:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0187
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0187
            float r1 = r1 - r5
            float r9 = r9 * r1
            r10.A02 = r9
            float r8 = r8 * r1
            r10.A00 = r8
            float r4 = r4 * r1
            r10.A01 = r4
        L_0x0182:
            r7.A05 = r6
            r7.A04 = r14
            return
        L_0x0187:
            r0 = 0
            r10.A02 = r0
            r10.A01 = r0
            r10.A00 = r0
            goto L_0x0182
        L_0x018f:
            r2.z = r1
            r1 = 0
            goto L_0x0087
        L_0x0194:
            float r1 = A0A
            float r0 = -r1
            goto L_0x0085
        L_0x0199:
            r3 = 0
            goto L_0x0070
        L_0x019c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C315826kc.A00(com.facebook.spherical.util.Quaternion, long):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.6kd, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v1, types: [com.facebook.gltf.jni.GLTFCameraOrientation, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.6kh, java.lang.Object] */
    public C315826kc(Context context) {
        this.A06 = context;
        ? obj = new Object();
        obj.A00 = 0.0f;
        obj.A01 = 0.0f;
        obj.A02 = 0.0f;
        this.A09 = obj;
    }
}
