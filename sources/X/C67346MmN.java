package X;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;

/* renamed from: X.MmN  reason: case insensitive filesystem */
public final class C67346MmN {
    public final GoogleApiAvailability A00;

    public final boolean A00(Context context) {
        try {
            if (this.A00.A03(context, 222116045) != 0) {
                return false;
            }
            return true;
        } catch (RuntimeException unused) {
        }
    }

    public C67346MmN(GoogleApiAvailability googleApiAvailability) {
        this.A00 = googleApiAvailability;
    }
}
