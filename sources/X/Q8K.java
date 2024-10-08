package X;

import android.util.Pair;

public final class Q8K extends Pair implements C13441TaU {
    public static Q8K A01 = new Q8K("", "", Long.MAX_VALUE);
    public final long A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q8K(String str, String str2, long j) {
        super(str == null ? "" : str, str2 == null ? "" : str2);
        this.A00 = j;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MqttDeviceIdAndSecret{id=");
        A1A.append((String) this.first);
        A1A.append("secret=");
        A1A.append((String) this.second);
        A1A.append("mTimestamp=");
        return Pxg.A0y(A1A, this.A00);
    }
}
