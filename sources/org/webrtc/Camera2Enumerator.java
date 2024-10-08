package org.webrtc;

import X.AnonymousClass7TE;
import X.C66580MXl;
import X.Pxg;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.SystemClock;
import android.util.AndroidException;
import android.util.Range;
import android.util.Size;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;

public class Camera2Enumerator implements CameraEnumerator {
    public static final double NANO_SECONDS_PER_SECOND = 1.0E9d;
    public static final String TAG = "Camera2Enumerator";
    public static final Map cachedSupportedFormats = new HashMap();
    public final CameraManager cameraManager;
    public final Context context;

    public static int getFpsUnitFactor(Range[] rangeArr) {
        if (rangeArr.length == 0 || Pxg.A03(rangeArr[0]) < 1000) {
            return IgNetworkConsentStorage.MAX_ENTRIES;
        }
        return 1;
    }

    public static boolean isSupported(Context context2) {
        CameraManager cameraManager2 = (CameraManager) context2.getSystemService("camera");
        try {
            for (String cameraCharacteristics : cameraManager2.getCameraIdList()) {
                if (AnonymousClass7TE.A0M(cameraManager2.getCameraCharacteristics(cameraCharacteristics).get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)) == 2) {
                    return false;
                }
            }
            return true;
        } catch (AndroidException unused) {
            boolean z = Logging.loggingEnabled;
            return false;
        }
    }

    public static List convertFramerates(Range[] rangeArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (Range range : rangeArr) {
            arrayList.add(new CameraEnumerationAndroid.CaptureFormat.FramerateRange(AnonymousClass7TE.A0M(range.getLower()) * i, Pxg.A03(range) * i));
        }
        return arrayList;
    }

    public static List convertSizes(Size[] sizeArr) {
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            arrayList.add(new Size(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }

    private CameraCharacteristics getCameraCharacteristics(String str) {
        try {
            return this.cameraManager.getCameraCharacteristics(str);
        } catch (AndroidException unused) {
            boolean z = Logging.loggingEnabled;
            return null;
        }
    }

    public static List getSupportedSizes(CameraCharacteristics cameraCharacteristics) {
        cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return convertSizes(((StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(SurfaceTexture.class));
    }

    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        return new Camera2Capturer(this.context, str, cameraEventsHandler);
    }

    public String[] getDeviceNames() {
        try {
            return this.cameraManager.getCameraIdList();
        } catch (AndroidException unused) {
            boolean z = Logging.loggingEnabled;
            return new String[0];
        }
    }

    public List getSupportedFormats(String str) {
        return getSupportedFormats(this.context, str);
    }

    public Camera2Enumerator(Context context2) {
        this.context = context2;
        this.cameraManager = (CameraManager) context2.getSystemService("camera");
    }

    public boolean isBackFacing(String str) {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(str);
        if (cameraCharacteristics == null || AnonymousClass7TE.A0M(cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)) != 1) {
            return false;
        }
        return true;
    }

    public boolean isFrontFacing(String str) {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(str);
        if (cameraCharacteristics == null || AnonymousClass7TE.A0M(cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)) != 0) {
            return false;
        }
        return true;
    }

    public static List getSupportedFormats(CameraManager cameraManager2, String str) {
        long j;
        int i;
        List list;
        Map map = cachedSupportedFormats;
        synchronized (map) {
            if (map.containsKey(str)) {
                list = C66580MXl.A13(str, map);
            } else {
                boolean z = Logging.loggingEnabled;
                SystemClock.elapsedRealtime();
                try {
                    CameraCharacteristics cameraCharacteristics = cameraManager2.getCameraCharacteristics(str);
                    StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                    Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                    List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates = convertFramerates(rangeArr, getFpsUnitFactor(rangeArr));
                    List<Size> supportedSizes = getSupportedSizes(cameraCharacteristics);
                    int i2 = 0;
                    for (CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange : convertFramerates) {
                        i2 = Math.max(i2, framerateRange.max);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Size size : supportedSizes) {
                        try {
                            j = streamConfigurationMap.getOutputMinFrameDuration(SurfaceTexture.class, new Size(size.width, size.height));
                        } catch (Exception unused) {
                            j = 0;
                        }
                        if (j == 0) {
                            i = i2;
                        } else {
                            i = ((int) Math.round(1.0E9d / ((double) j))) * IgNetworkConsentStorage.MAX_ENTRIES;
                        }
                        arrayList.add(new CameraEnumerationAndroid.CaptureFormat(size.width, size.height, 0, i));
                    }
                    map.put(str, arrayList);
                    SystemClock.elapsedRealtime();
                    list = arrayList;
                } catch (Exception unused2) {
                    list = new ArrayList();
                }
            }
        }
        return list;
    }

    public static List getSupportedFormats(Context context2, String str) {
        return getSupportedFormats((CameraManager) context2.getSystemService("camera"), str);
    }
}
