package X;

import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;

/* renamed from: X.463  reason: invalid class name */
public abstract class AnonymousClass463 {
    public static final boolean A00(AnonymousClass0JP r7, C2604745u r8, long j) {
        0qQ.A0B(r8, 0);
        0qQ.A0B(r7, 1);
        long A00 = r8.A00("last_warm_up_ts", -1);
        if (j <= 0 || A00 == -1 || r7.now() - A00 > j * StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS) {
            return true;
        }
        return false;
    }
}
