package X;

import java.net.HttpURLConnection;
import java.util.Arrays;

/* renamed from: X.NqE  reason: case insensitive filesystem */
public abstract class C69692NqE {
    public static final boolean A00() {
        HttpURLConnection A0d = C66584MXp.A0d("https://connectivitycheck.gstatic.com/generate_204");
        A0d.setConnectTimeout(5000);
        A0d.setReadTimeout(5000);
        try {
            0qQ.A07(String.format("probe succeeded %s", Arrays.copyOf(new Object[]{String.valueOf(A0d.getResponseCode())}, 1)));
            return true;
        } catch (Exception e) {
            0qQ.A07(String.format("probe failed %s", C66581MXm.A1b(e.getMessage(), 1)));
            return false;
        }
    }
}
