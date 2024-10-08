package X;

import android.content.Context;
import android.os.Build;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;

/* renamed from: X.9uj  reason: invalid class name and case insensitive filesystem */
public abstract class C392389uj {
    public static final boolean A00(Context context, QuickPerformanceLogger quickPerformanceLogger, boolean z, boolean z2) {
        Integer A01;
        String str;
        if (!C249103j8.A01(context) || Build.VERSION.SDK_INT < 29 || (A01 = C273214mA.A00.A01(context, z, z2)) == AnonymousClass05K.A0N) {
            return false;
        }
        switch (A01.intValue()) {
            case 0:
                str = "NOT_AVAILABLE_NOT_PRESENT";
                break;
            case 1:
                str = "NOT_AVAILABLE_ARCH_MISMATCH";
                break;
            case 2:
                str = "NOT_AVAILABLE_NON_MODULAR";
                break;
            default:
                str = MessageAvailabilityResponseId$Companion.AVAILABLE;
                break;
        }
        quickPerformanceLogger.markerAnnotate(47654742, "trampoline_unavailable", str);
        return true;
    }
}
