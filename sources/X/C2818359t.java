package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;

/* renamed from: X.59t  reason: invalid class name and case insensitive filesystem */
public abstract class C2818359t {
    public static final String A00(2HH r1) {
        int ordinal;
        if (r1 == null || (ordinal = r1.ordinal()) == -1) {
            return "FAILURE";
        }
        if (ordinal == 4) {
            return "SKIPPED";
        }
        if (ordinal == 5) {
            return "SUCCESS";
        }
        if (ordinal == 3) {
            return "PARTIAL";
        }
        if (ordinal == 1) {
            return "FAILURE";
        }
        if (ordinal == 2) {
            return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        }
        throw new RuntimeException("Migration result returned from migration call should not be unknown.");
    }

    public static final LinkedHashMap A01(String str, int i) {
        LinkedHashMap A07 = 0Yt.A07(new 0eP[]{new 0eP("init_count", String.valueOf(i))});
        if (str != null) {
            A07.put("error_extra_data", str);
        }
        return A07;
    }
}
