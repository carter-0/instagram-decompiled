package X;

import android.util.Log;

public final /* synthetic */ class SzB implements C3736596k {
    public static final /* synthetic */ SzB A00 = new Object();

    public final void onFailure(Exception exc) {
        C10268RpS rpS = T90.A05;
        String str = "Error preloading model resource";
        if (Log.isLoggable("MobileVisionBase", 6)) {
            String str2 = rpS.A00;
            if (str2 != null) {
                str = str2.concat(str);
            }
            Log.e("MobileVisionBase", str, exc);
        }
    }
}
