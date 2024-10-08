package org.webrtc;

import X.002;
import X.0BU;
import X.AnonymousClass0fI;
import X.AnonymousClass7TF;
import X.Pxe;
import X.Pxf;
import android.hardware.Camera;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;

public class Camera1Enumerator implements CameraEnumerator {
    public static final String TAG = "Camera1Enumerator";
    public static List cachedSupportedFormats;
    public final boolean captureToTexture;

    public static List convertFramerates(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            arrayList.add(new CameraEnumerationAndroid.CaptureFormat.FramerateRange(iArr[0], iArr[1]));
        }
        return arrayList;
    }

    public static List convertSizes(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Camera.Size size = (Camera.Size) it.next();
            arrayList.add(new Size(size.width, size.height));
        }
        return arrayList;
    }

    public static List enumerateFormats(int i) {
        int i2;
        boolean z = Logging.loggingEnabled;
        SystemClock.elapsedRealtime();
        try {
            AnonymousClass0fI r0 = AnonymousClass0fI.$redex_init_class;
            Camera open = Camera.open(i);
            if (0BU.A04()) {
                0BU.A03(open);
            }
            Camera camera = open;
            Camera.Parameters parameters = open.getParameters();
            AnonymousClass0fI.A00(open);
            ArrayList arrayList = new ArrayList();
            try {
                List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
                int i3 = 0;
                if (supportedPreviewFpsRange != null) {
                    int[] iArr = supportedPreviewFpsRange.get(supportedPreviewFpsRange.size() - 1);
                    i3 = iArr[0];
                    i2 = iArr[1];
                } else {
                    i2 = 0;
                }
                for (Camera.Size next : parameters.getSupportedPreviewSizes()) {
                    arrayList.add(new CameraEnumerationAndroid.CaptureFormat(next.width, next.height, i3, i2));
                }
            } catch (Exception e) {
                Logging.e(TAG, 002.A0O("getSupportedFormats() failed on camera index ", i), e);
            }
            SystemClock.elapsedRealtime();
            return arrayList;
        } catch (RuntimeException e2) {
            Logging.e(TAG, 002.A0O("Open camera failed on camera index ", i), e2);
            ArrayList arrayList2 = new ArrayList();
            if (0 != 0) {
                AnonymousClass0fI.A00((Camera) null);
            }
            return arrayList2;
        } catch (Throwable th) {
            if (0 != 0) {
                AnonymousClass0fI.A00((Camera) null);
            }
            throw th;
        }
    }

    public static int getCameraIndex(String str) {
        boolean z = Logging.loggingEnabled;
        for (int i = 0; i < Camera.getNumberOfCameras(); i++) {
            if (str.equals(getDeviceName(i))) {
                return i;
            }
        }
        throw AnonymousClass7TF.A0W("No such camera: ", str);
    }

    public static Camera.CameraInfo getCameraInfo(int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        try {
            Camera.getCameraInfo(i, cameraInfo);
            return cameraInfo;
        } catch (Exception e) {
            Logging.e(TAG, 002.A0O("getCameraInfo failed on index ", i), e);
            return null;
        }
    }

    public static synchronized List getSupportedFormats(int i) {
        List list;
        synchronized (Camera1Enumerator.class) {
            if (cachedSupportedFormats == null) {
                cachedSupportedFormats = new ArrayList();
                for (int i2 = 0; i2 < Camera.getNumberOfCameras(); i2++) {
                    cachedSupportedFormats.add(enumerateFormats(i2));
                }
            }
            list = (List) cachedSupportedFormats.get(i);
        }
        return list;
    }

    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        return new Camera1Capturer(str, cameraEventsHandler, this.captureToTexture);
    }

    public String[] getDeviceNames() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < Camera.getNumberOfCameras(); i++) {
            String deviceName = getDeviceName(i);
            if (deviceName != null) {
                arrayList.add(deviceName);
            }
            boolean z = Logging.loggingEnabled;
        }
        return Pxf.A1a(arrayList, arrayList.size());
    }

    public Camera1Enumerator(boolean z) {
        this.captureToTexture = z;
    }

    public static String getDeviceName(int i) {
        String str;
        Camera.CameraInfo cameraInfo = getCameraInfo(i);
        if (cameraInfo == null) {
            return null;
        }
        if (cameraInfo.facing == 1) {
            str = "front";
        } else {
            str = "back";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Camera ");
        sb.append(i);
        sb.append(", Facing ");
        sb.append(str);
        sb.append(", Orientation ");
        return Pxe.A0z(sb, cameraInfo.orientation);
    }

    public boolean isBackFacing(String str) {
        Camera.CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        if (cameraInfo == null || cameraInfo.facing != 0) {
            return false;
        }
        return true;
    }

    public boolean isFrontFacing(String str) {
        Camera.CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        if (cameraInfo == null || cameraInfo.facing != 1) {
            return false;
        }
        return true;
    }

    public Camera1Enumerator() {
        this(true);
    }

    public List getSupportedFormats(String str) {
        return getSupportedFormats(getCameraIndex(str));
    }
}
