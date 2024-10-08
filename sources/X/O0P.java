package X;

import com.instagram.model.mediatype.ProductType;
import java.util.Iterator;

public abstract class O0P {
    public static final C255783ui A00(C68167N3h n3h) {
        Object obj;
        Iterator it = n3h.A0P.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C255783ui r2 = (C255783ui) obj;
            if (r2 != null && r2.A0m == ProductType.CLIPS && r2.A11 == AnonymousClass3WT.MEDIA) {
                break;
            }
        }
        return (C255783ui) obj;
    }
}
