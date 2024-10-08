package X;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.QpO  reason: case insensitive filesystem */
public final class C8366QpO extends AnonymousClass63E {
    public static int A00 = 1;

    public static final synchronized int A02(C8366QpO qpO) {
        int i;
        synchronized (qpO) {
            i = A00;
            if (i == 1) {
                Context context = qpO.A01;
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
                int A05 = Pxe.A05(context, googleApiAvailability);
                if (A05 == 0) {
                    A00 = 4;
                    i = 4;
                } else if (googleApiAvailability.A04(context, (String) null, A05) != null || SU6.A00(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    A00 = 2;
                    i = 2;
                } else {
                    A00 = 3;
                    i = 3;
                }
            }
        }
        return i;
    }

    public final AnonymousClass9GD A03() {
        BasePendingResult A07;
        AnonymousClass63S r3 = this.A05;
        Context context = this.A01;
        boolean A1S = AnonymousClass7TF.A1S(A02(this), 3);
        SQR.A02(context);
        if (A1S) {
            Status status = Status.A08;
            AnonymousClass3Qk.A03(status, "Result must not be null");
            A07 = new BasePendingResult(r3);
            A07.A06(status);
        } else {
            A07 = r3.A07(new C8412Qts(C10136RnD.A05, r3));
        }
        return SMT.A00(A07);
    }
}
