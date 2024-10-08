package X;

import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutionException;

/* renamed from: X.9RZ  reason: invalid class name */
public final class AnonymousClass9RZ {
    public static int A03 = -1;
    public static volatile boolean A04;
    public static volatile boolean A05;
    public static volatile Camera.CameraInfo[] A06;
    public static volatile boolean A07;
    public final C340757lm A00;
    public final PackageManager A01;
    public final C340767ln A02;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r1 == -1) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0020, code lost:
        if (r0 == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0043, code lost:
        if (r1 == -1) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.AnonymousClass9RZ r7, int r8) {
        /*
            android.hardware.Camera$CameraInfo[] r0 = A06
            r4 = -1
            if (r0 == 0) goto L_0x002b
            android.hardware.Camera$CameraInfo[] r3 = A06
            if (r3 == 0) goto L_0x0029
            r2 = 1
            if (r8 == r2) goto L_0x000d
            r2 = 0
        L_0x000d:
            r1 = 0
        L_0x000e:
            int r0 = r3.length
            if (r1 >= r0) goto L_0x0029
            r0 = r3[r1]
            int r0 = r0.facing
            if (r0 != r2) goto L_0x0026
            if (r1 != r4) goto L_0x0022
        L_0x0019:
            if (r8 == 0) goto L_0x0023
            r0 = 1
            if (r8 != r0) goto L_0x0022
            boolean r0 = A05
        L_0x0020:
            if (r0 != 0) goto L_0x002b
        L_0x0022:
            return r1
        L_0x0023:
            boolean r0 = A04
            goto L_0x0020
        L_0x0026:
            int r1 = r1 + 1
            goto L_0x000e
        L_0x0029:
            r1 = -1
            goto L_0x0019
        L_0x002b:
            r6 = 0
            A06 = r6
            A02(r7)
            android.hardware.Camera$CameraInfo[] r3 = A06
            if (r3 == 0) goto L_0x00ce
            r2 = 1
            if (r8 == r2) goto L_0x0039
            r2 = 0
        L_0x0039:
            r1 = 0
        L_0x003a:
            int r0 = r3.length
            if (r1 >= r0) goto L_0x00ce
            r0 = r3[r1]
            int r0 = r0.facing
            if (r0 != r2) goto L_0x00ca
            if (r1 != r4) goto L_0x0022
        L_0x0045:
            if (r8 == 0) goto L_0x00c7
            r0 = 1
            if (r8 != r0) goto L_0x0022
            boolean r0 = A05
        L_0x004c:
            if (r0 == 0) goto L_0x0022
            android.content.pm.PackageManager r3 = r7.A01
            if (r3 == 0) goto L_0x00c4
            r0 = 629(0x275, float:8.81E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r0 = r3.hasSystemFeature(r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "android.hardware.camera"
            boolean r0 = r3.hasSystemFeature(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "android.hardware.camera.front"
            boolean r0 = r3.hasSystemFeature(r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
        L_0x0074:
            java.lang.String r0 = "Camera 1 API - Could not get CameraInfo for CameraFacing id: "
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r0)
            r5.append(r8)
            java.lang.String r0 = " Number Of Cameras: "
            r5.append(r0)
            int r0 = A03
            r5.append(r0)
            java.lang.String r0 = " ANY: "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = " BACK: "
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = " FRONT: "
            r5.append(r0)
            r5.append(r6)
            android.hardware.Camera$CameraInfo[] r3 = A06
            if (r3 == 0) goto L_0x00d1
            java.lang.String r0 = " Camera Info size: "
            r5.append(r0)
            int r2 = r3.length
            r5.append(r2)
            java.lang.String r0 = " Camera ids: "
            r5.append(r0)
            r1 = 0
        L_0x00b3:
            if (r1 >= r2) goto L_0x00d6
            r0 = r3[r1]
            int r0 = r0.facing
            r5.append(r0)
            java.lang.String r0 = " "
            r5.append(r0)
            int r1 = r1 + 1
            goto L_0x00b3
        L_0x00c4:
            r2 = r6
            r1 = r6
            goto L_0x0074
        L_0x00c7:
            boolean r0 = A04
            goto L_0x004c
        L_0x00ca:
            int r1 = r1 + 1
            goto L_0x003a
        L_0x00ce:
            r1 = -1
            goto L_0x0045
        L_0x00d1:
            java.lang.String r0 = " Camera Info NULL"
            r5.append(r0)
        L_0x00d6:
            java.lang.String r1 = "CameraInventory"
            java.lang.String r0 = r5.toString()
            X.C340577lU.A02(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9RZ.A00(X.9RZ, int):int");
    }

    public static void A01() {
        if (A06 == null) {
            int numberOfCameras = Camera.getNumberOfCameras();
            Camera.CameraInfo[] cameraInfoArr = new Camera.CameraInfo[numberOfCameras];
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < numberOfCameras; i++) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                cameraInfoArr[i] = cameraInfo;
                int i2 = cameraInfo.facing;
                if (i2 == 0) {
                    z2 = true;
                } else if (i2 == 1) {
                    z = true;
                }
            }
            A06 = cameraInfoArr;
            A05 = z;
            A04 = z2;
            A03 = 0;
            if (A04) {
                A03++;
            }
            if (A05) {
                A03++;
            }
            A07 = true;
        }
    }

    public static void A02(AnonymousClass9RZ r4) {
        if (A06 == null) {
            C340757lm r3 = r4.A00;
            if (r3.A09()) {
                A01();
                return;
            }
            try {
                r3.A01(new C341957no(), "load_camera_infos", new C41369Asq((Object) r4, 11)).get();
            } catch (InterruptedException | ExecutionException e) {
                C340577lU.A02("CameraInventory", AnonymousClass7TF.A0m("failed to load camera infos: ", e));
            }
        }
    }

    public static boolean A03(AnonymousClass9RZ r3) {
        if (A07) {
            return true;
        }
        PackageManager packageManager = r3.A01;
        if (packageManager == null) {
            C340577lU.A02("CameraInventory", "failed to load camera feature. PackageManager is null");
            return false;
        }
        if (packageManager.hasSystemFeature("android.hardware.camera")) {
            A04 = true;
        }
        if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
            A05 = true;
        }
        A03 = 0;
        if (A04) {
            A03++;
        }
        if (A05) {
            A03++;
        }
        A07 = true;
        return true;
    }

    public final int A04() {
        int i = A03;
        if (i != -1) {
            return i;
        }
        if (A03(this)) {
            return A03;
        }
        this.A00.A06("Number of cameras must be loaded on background thread.");
        int numberOfCameras = Camera.getNumberOfCameras();
        A03 = numberOfCameras;
        return numberOfCameras;
    }

    public final int A06(int i, int i2) {
        if (A06 == null) {
            if (!C342057ny.A02()) {
                C340577lU.A02("CameraInventory", "Loading camera info on the UI thread");
            }
            A02(this);
        }
        if (i2 != -1) {
            int A002 = A00(this, i);
            Camera.CameraInfo[] cameraInfoArr = A06;
            cameraInfoArr.getClass();
            if (A002 >= cameraInfoArr.length) {
                C340577lU.A02("CameraInventory", 002.A0O("No CameraInfo found for camera id: ", A002));
            } else {
                Camera.CameraInfo cameraInfo = A06[A002];
                int i3 = ((i2 + 45) / 90) * 90;
                int i4 = cameraInfo.facing;
                int i5 = cameraInfo.orientation;
                int i6 = i5 + i3;
                if (i4 == 1) {
                    i6 = (i5 - i3) + 360;
                }
                return i6 % 360;
            }
        }
        return 0;
    }

    public final void A07(AnonymousClass8GD r4, int i) {
        Looper looper;
        if (A06 != null || A03(this)) {
            C340757lm r2 = this.A00;
            Handler handler = r2.A00;
            if (handler == null) {
                looper = Looper.getMainLooper();
            } else {
                looper = handler.getLooper();
            }
            if (looper.getThread() == Thread.currentThread()) {
                r4.A02(Boolean.valueOf(A08(i)));
                return;
            }
            r2.A05(new C20275WoQ(r4, this, i), this.A02.A03);
            return;
        }
        this.A00.A01(r4, "has_facing_camera", new C41346AsT(this, i, 4));
    }

    public AnonymousClass9RZ(PackageManager packageManager, C340767ln r2, C340757lm r3) {
        this.A00 = r3;
        this.A02 = r2;
        this.A01 = packageManager;
    }

    public final int A05(int i) {
        int A002 = A00(this, i);
        if (A002 != -1) {
            Camera.CameraInfo[] cameraInfoArr = A06;
            cameraInfoArr.getClass();
            Camera.CameraInfo cameraInfo = cameraInfoArr[A002];
            if (cameraInfo != null) {
                return cameraInfo.orientation;
            }
            return 0;
        }
        throw C13989Tnp.A0k("Could not load CameraInfo for CameraFacing: ", i);
    }

    public final boolean A08(int i) {
        if (!A03(this)) {
            return JTQ.A1O(A00(this, i), -1);
        }
        if (i != 0) {
            return A05;
        }
        return A04;
    }
}
