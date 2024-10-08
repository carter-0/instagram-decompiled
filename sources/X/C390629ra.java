package X;

import android.util.Log;
import com.google.firebase.iid.zzm;

/* renamed from: X.9ra  reason: invalid class name and case insensitive filesystem */
public final class C390629ra extends ClassLoader {
    public final Class loadClass(String str, boolean z) {
        if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
            return super.loadClass(str, z);
        }
        Log.isLoggable("FirebaseInstanceId", 3);
        return zzm.class;
    }
}
