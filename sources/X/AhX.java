package X;

import android.os.Bundle;
import java.util.List;

public final class AhX implements C41801B1g {
    public final String A00;
    public final String A01;
    public final boolean A02;

    public final List EzQ(Bundle bundle) {
        String str;
        0qQ.A0B(bundle, 0);
        if (!bundle.containsKey("commandType")) {
            return null;
        }
        int i = bundle.getInt("commandType");
        if (i == 0) {
            if (!bundle.containsKey("timestampMs")) {
                return null;
            }
            bundle.getLong("timestampMs");
            str = "roi";
        } else if (i != 1 || !bundle.containsKey("timestampMs")) {
            return null;
        } else {
            bundle.getLong("timestampMs");
            str = "boxes";
        }
        bundle.getFloatArray(str);
        return null;
    }

    public AhX(String str, String str2, boolean z) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = z;
    }
}
