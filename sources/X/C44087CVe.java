package X;

import com.instagram.api.schemas.ClipsMerchandisingPillType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CVe  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44087CVe {
    public static Map A00(C270544gu r5) {
        ArrayList arrayList;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        r5.getLoopTime();
        A1H.put("loop_time", Integer.valueOf(r5.getLoopTime()));
        if (r5.BRn() != null) {
            List<ClipsMerchandisingPillType> BRn = r5.BRn();
            if (BRn != null) {
                arrayList = AnonymousClass7TG.A0r(BRn);
                for (ClipsMerchandisingPillType clipsMerchandisingPillType : BRn) {
                    0qQ.A0B(clipsMerchandisingPillType, 0);
                    arrayList.add(clipsMerchandisingPillType.A00);
                }
            } else {
                arrayList = null;
            }
            A1H.put("merchandising_pill_types", arrayList);
        }
        return 0Yt.A0B(A1H);
    }
}
