package X;

import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9yH  reason: invalid class name and case insensitive filesystem */
public abstract class C394539yH {
    public static final IngestSessionShim A00(List list) {
        0qQ.A0B(list, 0);
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0r.add(((C39650A3q) it.next()).A00);
        }
        return new IngestSessionShim(00k.A0U(A0r));
    }
}
