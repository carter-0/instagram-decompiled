package X;

import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: X.7lo  reason: invalid class name and case insensitive filesystem */
public final class C340777lo {
    public static int A06;
    public static boolean A07;
    public static boolean A08;
    public static volatile boolean A09;
    public Map A00 = Collections.emptyMap();
    public final CameraManager A01;
    public final C340757lm A02;
    public final PackageManager A03;
    public final C340767ln A04;
    public volatile C342617ot[] A05 = null;

    public final int A05(int i, int i2, int i3) {
        if (i3 != -1) {
            try {
                int i4 = ((i3 + 45) / 90) * 90;
                if (A01(this, i).A01 == 0) {
                    return ((i2 - i4) + 360) % 360;
                }
                return (i2 + i4) % 360;
            } catch (CameraAccessException e) {
                C340577lU.A02("CameraInventory", 002.A0R("Failed to get info to calculate media rotation: ", e.getMessage()));
            }
        }
        return 0;
    }

    private int A00(int i) {
        if (this.A05 == null) {
            A02(this);
        }
        if (!(this.A05 == null || this.A05.length == 0)) {
            for (int i2 = 0; i2 < this.A05.length; i2++) {
                if (this.A05[i2].A00 == i) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public static C342617ot A01(C340777lo r2, int i) {
        if (r2.A05 == null) {
            A02(r2);
        }
        int A002 = r2.A00(i);
        if (A002 != -1) {
            C342617ot[] r0 = r2.A05;
            r0.getClass();
            return r0[A002];
        }
        throw new IllegalArgumentException("Camera facing did not resolve to a camera info instance");
    }

    public static void A02(C340777lo r4) {
        if (r4.A05 == null) {
            C340757lm r3 = r4.A02;
            if (r3.A09()) {
                A03(r4);
                return;
            }
            try {
                r3.A01(new C341957no(), "load_camera_infos", new C41301Arh(r4)).get();
            } catch (InterruptedException | ExecutionException e) {
                C340577lU.A02("CameraInventory", 002.A0R("failed to load camera infos: ", e.getMessage()));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.7ot[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.C340777lo r14) {
        /*
            android.hardware.camera2.CameraManager r10 = r14.A01
            r10.getClass()
            java.lang.String[] r9 = r10.getCameraIdList()
            int r8 = r9.length
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r13 = 0
            r6 = 0
            r12 = 0
            r11 = 0
        L_0x0013:
            r4 = 1
            if (r6 >= r8) goto L_0x0059
            r5 = r9[r6]
            android.hardware.camera2.CameraCharacteristics r1 = r10.getCameraCharacteristics(r5)
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r0 = r1.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            r0.getClass()
            int r3 = r0.intValue()
            r2 = 1
            if (r3 != r4) goto L_0x002f
            r2 = 0
        L_0x002f:
            java.util.Map r0 = r14.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x0041
            boolean r0 = r7.containsKey(r1)
            if (r0 != 0) goto L_0x0054
        L_0x0041:
            java.util.Map r0 = r14.A00
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x004c
            r5 = r0
        L_0x004c:
            X.7ot r0 = new X.7ot
            r0.<init>(r2, r5, r3)
            r7.put(r1, r0)
        L_0x0054:
            if (r2 == 0) goto L_0x007d
            r11 = 1
            if (r12 == 0) goto L_0x0081
        L_0x0059:
            int r0 = r7.size()
            X.7ot[] r3 = new X.C342617ot[r0]
            java.util.Set r0 = r7.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x0067:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0084
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            int r0 = r13 + 1
            r3[r13] = r1
            r13 = r0
            goto L_0x0067
        L_0x007d:
            r12 = 1
            if (r11 == 0) goto L_0x0081
            goto L_0x0059
        L_0x0081:
            int r6 = r6 + 1
            goto L_0x0013
        L_0x0084:
            A08 = r11
            A07 = r12
            if (r11 == 0) goto L_0x008c
            int r12 = r12 + 1
        L_0x008c:
            A06 = r12
            r14.A05 = r3
            A09 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340777lo.A03(X.7lo):void");
    }

    public static boolean A04(C340777lo r3) {
        if (A09) {
            return true;
        }
        PackageManager packageManager = r3.A03;
        if (packageManager == null) {
            C340577lU.A02("CameraInventory", "failed to load camera feature. PackageManager is null");
            return false;
        }
        if (packageManager.hasSystemFeature("android.hardware.camera")) {
            A07 = true;
        }
        if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
            A08 = true;
        }
        int i = A07;
        if (A08) {
            i++;
        }
        A06 = i;
        A09 = true;
        return true;
    }

    public final int A06(String str) {
        if (this.A05 == null) {
            A02(this);
        }
        C342617ot[] r0 = this.A05;
        r0.getClass();
        int length = r0.length;
        for (int i = 0; i < length; i++) {
            C342617ot r1 = this.A05[i];
            if (r1.A02.equals(str)) {
                return r1.A00;
            }
        }
        C340577lU.A02("CameraInventory", 002.A0R("Failed to find camera facing for id: ", str));
        return 0;
    }

    public C340777lo(PackageManager packageManager, CameraManager cameraManager, C340767ln r4, C340757lm r5) {
        this.A01 = cameraManager;
        this.A02 = r5;
        this.A04 = r4;
        this.A03 = packageManager;
    }

    public final String A07(int i) {
        try {
            return A01(this, i).A02;
        } catch (CameraAccessException e) {
            throw new RuntimeException("Failed to get camera info", e);
        }
    }

    public final void A08(AnonymousClass8GD r4, int i) {
        Looper looper;
        if (A04(this) || this.A05 != null) {
            C340757lm r2 = this.A02;
            Handler handler = r2.A00;
            if (handler == null) {
                looper = Looper.getMainLooper();
            } else {
                looper = handler.getLooper();
            }
            if (looper.getThread() == Thread.currentThread()) {
                try {
                    r4.A02(Boolean.valueOf(A09(i)));
                } catch (CameraAccessException e) {
                    r4.A01(e);
                }
            } else {
                r2.A05(new C371598yf(r4, this, i), this.A04.A03);
            }
        } else {
            this.A02.A01(r4, "has_facing_camera", new C41316Arw(this, i));
        }
    }

    public final boolean A09(int i) {
        if (!A04(this)) {
            if (this.A05 == null) {
                A02(this);
            }
            if (this.A05 == null) {
                C340577lU.A02("CameraInventory", "Failed to detect camera, cameraInfos was null");
                return false;
            }
            int i2 = 1;
            if (i == 1) {
                i2 = 0;
            }
            if (A00(i2) == -1) {
                return false;
            }
            return true;
        } else if (i != 1) {
            return A08;
        } else {
            return A07;
        }
    }
}
