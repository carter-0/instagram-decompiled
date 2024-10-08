package X;

import com.instagram.creation.capture.quickcapture.aspectratioutil.intf.CreationLayoutConfig;

/* renamed from: X.8aT  reason: invalid class name and case insensitive filesystem */
public abstract class C358168aT {
    public static final C358178aU A00(CreationLayoutConfig creationLayoutConfig) {
        if (creationLayoutConfig == null) {
            return null;
        }
        if (creationLayoutConfig.CTv()) {
            return C358178aU.FOOTER_BELOW_MEDIA;
        }
        if (creationLayoutConfig.BQc() > 0) {
            return C358178aU.FOOTER_PINNED_IN_MEDIA_OVERLAPS_NAV_BAR;
        }
        return C358178aU.FOOTER_PINNED_IN_MEDIA;
    }
}
