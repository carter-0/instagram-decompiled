package X;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.provider.MediaStore;

public abstract class LI4 {
    public static final 1GK A01(Context context, C349307zv r4) {
        if (r4 == null || context == null) {
            return null;
        }
        TNT tnt = new TNT(r4.A0k, context, 6);
        C61480nO A00 = 0nY.A00();
        0qQ.A07(A00);
        return OX4.A00(A00, tnt, 863109751);
    }

    public static final Location A00(Context context, String str) {
        if (!1Wr.isLocationEnabled(context) || Build.VERSION.SDK_INT >= 29 || str == null) {
            return null;
        }
        Location A01 = C379829Vm.A01(context, MediaStore.Video.Media.EXTERNAL_CONTENT_URI, str);
        if (A01 == null) {
            return C379829Vm.A01(context, MediaStore.Video.Media.INTERNAL_CONTENT_URI, str);
        }
        return A01;
    }
}
