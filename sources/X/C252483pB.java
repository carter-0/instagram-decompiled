package X;

import android.telephony.TelephonyCallback;
import java.util.List;

/* renamed from: X.3pB  reason: invalid class name and case insensitive filesystem */
public final class C252483pB extends TelephonyCallback implements TelephonyCallback.CellInfoListener {
    public final /* synthetic */ 1DI A00;

    public /* synthetic */ C252483pB(1DI r1) {
        this.A00 = r1;
    }

    public final void onCellInfoChanged(List list) {
        1DI.A0V(this.A00, list);
    }
}
