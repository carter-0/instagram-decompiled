package X;

import com.instagram.android.R;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7wB  reason: invalid class name and case insensitive filesystem */
public abstract class C347047wB {
    public static final Map A00 = new HashMap();

    public static final int A00(CameraConfiguration cameraConfiguration) {
        C279284yO r1 = cameraConfiguration.A03;
        if (r1 instanceof AnonymousClass80L) {
            return R.drawable.instagram_icons_exceptions_live_shutter_outline_62;
        }
        if (!(r1 instanceof AnonymousClass9QA) && !(r1 instanceof AnonymousClass80M)) {
            return -1;
        }
        for (C358088aL ordinal : cameraConfiguration.A04) {
            int ordinal2 = ordinal.ordinal();
            if (ordinal2 == 0) {
                return R.drawable.boomerang_shutter_icon;
            }
            if (ordinal2 == 4) {
                return R.drawable.layout_shutter_icon;
            }
            if (ordinal2 == 6) {
                return R.drawable.handsfree_shutter_icon;
            }
            if (ordinal2 == 16) {
                return R.drawable.stopmotion_shutter_icon;
            }
            if (ordinal2 == 28) {
                return R.drawable.dual_shutter_icon;
            }
        }
        return -1;
    }
}
