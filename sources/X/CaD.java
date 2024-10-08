package X;

import com.instagram.api.schemas.MediaNoteMimicryTrigger;
import com.instagram.api.schemas.MediaNoteMimicryType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class CaD {
    public static Map A00(C283225Gp r6) {
        ArrayList arrayList;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        String str = null;
        if (r6.C9z() != null) {
            List<MediaNoteMimicryTrigger> C9z = r6.C9z();
            if (C9z != null) {
                arrayList = AnonymousClass7TG.A0r(C9z);
                for (MediaNoteMimicryTrigger mediaNoteMimicryTrigger : C9z) {
                    0qQ.A0B(mediaNoteMimicryTrigger, 0);
                    arrayList.add(mediaNoteMimicryTrigger.A00);
                }
            } else {
                arrayList = null;
            }
            A1H.put("triggers", arrayList);
        }
        if (r6.CAQ() != null) {
            MediaNoteMimicryType CAQ = r6.CAQ();
            if (CAQ != null) {
                str = CAQ.A00;
            }
            C41845B3m.A11(str, A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
