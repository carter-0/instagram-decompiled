package X;

import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.PrivacyContextCoding;
import com.facebook.msys.mci.TransportAgnosticLogging;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* renamed from: X.OQg  reason: case insensitive filesystem */
public final class C70888OQg {
    public static final void A00(long j, String str) {
        PrivacyContext newPrivacyContextWithTransportKeyNative = PrivacyContextCoding.newPrivacyContextWithTransportKeyNative((SqliteHolder) null, "FBLegacyBroker");
        0qQ.A07(newPrivacyContextWithTransportKeyNative);
        Long A0m = C51971G9r.A0m();
        TransportAgnosticLogging.logTalEventToPipe(newPrivacyContextWithTransportKeyNative, 0, false, 2, new Object[]{3, A0m, (byte) 0, str, 0, A0m, (byte) 1, Long.valueOf(j)}, O40.A00);
    }
}
