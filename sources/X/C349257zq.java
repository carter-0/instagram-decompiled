package X;

import android.os.Build;
import android.os.Trace;

/* renamed from: X.7zq  reason: invalid class name and case insensitive filesystem */
public abstract class C349257zq {
    public static final void A02(String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.beginAsyncSection(str, 0);
        }
    }

    public static final void A00() {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.endAsyncSection("TrackDownloader.downloadTrack", 0);
        }
    }

    public static final void A01() {
        0fg.A00(-808657563);
    }

    public static final void A03(String str) {
        0qQ.A0A(str);
        0fg.A01(str, 802389924);
    }
}
