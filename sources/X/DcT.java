package X;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public abstract class DcT {
    public static final DcU A00(String str) {
        0qQ.A0B(str, 0);
        for (DcU dcU : DcU.values()) {
            if (0qQ.A0K(dcU.A02, str)) {
                return dcU;
            }
        }
        return null;
    }

    public static final DcU A01(Calendar calendar) {
        for (DcU dcU : DcU.values()) {
            if (dcU.A00 == calendar.get(7)) {
                return dcU;
            }
        }
        return null;
    }

    public static final List A02() {
        ArrayList A0v = DbS.A0v(r3);
        for (DcU dcU : DcU.values()) {
            A0v.add(dcU.A02);
        }
        return A0v;
    }
}
