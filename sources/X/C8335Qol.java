package X;

import android.util.Log;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: X.Qol  reason: case insensitive filesystem */
public final class C8335Qol extends C11335SNp {
    public int A00;
    public int A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;
    public boolean A06;

    public C8335Qol() {
        UUID randomUUID = UUID.randomUUID();
        int leastSignificantBits = (int) (randomUUID.getLeastSignificantBits() & 2147483647L);
        if (leastSignificantBits == 0 && (leastSignificantBits = (int) (randomUUID.getMostSignificantBits() & 2147483647L)) == 0) {
            Log.e("GAv4", "UUID.randomUUID() returned 0.");
            leastSignificantBits = Integer.MAX_VALUE;
        }
        this.A00 = leastSignificantBits;
        this.A06 = false;
    }

    public final String toString() {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("screenName", this.A02);
        A1E.put("interstitial", Boolean.valueOf(this.A05));
        A1E.put("automatic", Boolean.valueOf(this.A06));
        A1E.put("screenId", Integer.valueOf(this.A00));
        A1E.put("referrerScreenId", Integer.valueOf(this.A01));
        A1E.put("referrerScreenName", this.A03);
        return C11335SNp.A01("referrerUri", this.A04, A1E);
    }
}
