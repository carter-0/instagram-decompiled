package X;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class SUE {
    public static final SUE A00 = new Object();
    public static final List A01 = 0sr.A1P(new String[]{"c2.dolby.decoder.hevc", "c2.qti.dv.decoder"});
    public static final AnonymousClass0eM A02 = AnonymousClass0eN.A01(TVF.A00);
    public static final AnonymousClass0eM A03 = AnonymousClass0eN.A01(TVG.A00);
    public static final AnonymousClass0eM A04 = AnonymousClass0eN.A01(TVH.A00);
    public static final AnonymousClass0eM A05 = AnonymousClass0eN.A01(TVI.A00);
    public static final AnonymousClass0eM A06 = AnonymousClass0eN.A01(TVJ.A00);
    public static final AnonymousClass0eM A07 = AnonymousClass0eN.A01(TVK.A00);
    public static final AnonymousClass0eM A08 = AnonymousClass0eN.A01(TVL.A00);

    public static final String A00() {
        return DbS.A0t(A05);
    }

    public static final List A01() {
        return (List) A02.getValue();
    }

    public static final List A02() {
        return (List) A04.getValue();
    }

    public static final boolean A04() {
        return AnonymousClass7TF.A1Z(A03);
    }

    public static final boolean A05() {
        return AnonymousClass7TF.A1Z(A06);
    }

    public static final boolean A06() {
        return AnonymousClass7TF.A1Z(A07);
    }

    public static final boolean A07() {
        return AnonymousClass7TF.A1Z(A08);
    }

    public static final /* synthetic */ boolean A08(CameraManager cameraManager, String str) {
        Set set;
        int[] iArr = (int[]) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr == null) {
            return false;
        }
        for (int i : iArr) {
            if (i == 18) {
                List A1P = 0sr.A1P(new Long[]{64L, 128L, 16L, 32L});
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                0qQ.A07(cameraCharacteristics);
                DynamicRangeProfiles dynamicRangeProfiles = (DynamicRangeProfiles) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES);
                if (dynamicRangeProfiles == null || (set = dynamicRangeProfiles.getSupportedProfiles()) == null) {
                    set = 0sl.A00;
                }
                if ((A1P instanceof Collection) && A1P.isEmpty()) {
                    return false;
                }
                Iterator it = A1P.iterator();
                while (it.hasNext()) {
                    if (set.contains(Long.valueOf(Pxg.A0H(it)))) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }
}
