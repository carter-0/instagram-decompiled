package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class JUP {
    public static final List A00(String str) {
        AnonymousClass51M r0;
        if (str == null || str.equals("")) {
            return 0sn.A00;
        }
        List<String> A0R = 00l.A0R(str, new String[]{"␞"}, 0);
        ArrayList arrayList = new ArrayList();
        for (String A00 : A0R) {
            try {
                r0 = AnonymousClass51L.parseFromJson(16P.A00(A00));
            } catch (IOException e) {
                0kD.A06("VideoSegmentListConverter", "Failed to deserialize SerializedMediaEdits from Clips draft", e);
                r0 = null;
            }
            if (r0 != null) {
                arrayList.add(r0);
            }
        }
        return arrayList;
    }
}
