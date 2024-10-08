package X;

import com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.OqV  reason: case insensitive filesystem */
public final class C71769OqV implements OverlayConfigLayerInterface {
    public int[] A00;
    public final DE3 A01;

    public final /* synthetic */ int[] getUpdatedValues() {
        return new int[0];
    }

    public final int getLayerSource() {
        return 17;
    }

    public final int[] getValues() {
        int i;
        int[] iArr = this.A00;
        if (iArr != null) {
            return iArr;
        }
        synchronized (this) {
            int[] iArr2 = this.A00;
            if (iArr2 != null) {
                return iArr2;
            }
            int[] iArr3 = new int[4662];
            for (int i2 = 0; i2 < 4662; i2++) {
                Long A0X = this.A01.A0X(i2);
                if (A0X != null) {
                    long longValue = A0X.longValue();
                    i = (int) longValue;
                    if (((long) i) != longValue) {
                        0wb.A01.Ew0("LauncherOverlayConfigLayerUtils", 002.A0Q("Value out of range: ", longValue));
                    } else {
                        iArr3[i2] = i;
                    }
                }
                i = -1;
                iArr3[i2] = i;
            }
            this.A00 = iArr3;
            return iArr3;
        }
    }

    public final void logExposure(int i) {
        if (this.A01.A0W(i) == null) {
            0wb.A03("LauncherOverlayConfigLayer", 002.A0O("Invalid id for logExposureForIds: ", i));
        }
    }

    public C71769OqV(UserSession userSession) {
        this.A01 = new DE3(userSession);
    }
}
