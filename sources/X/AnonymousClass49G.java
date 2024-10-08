package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.49G  reason: invalid class name */
public final class AnonymousClass49G {
    public static final String A01(Collection collection) {
        0qQ.A0B(collection, 0);
        StringWriter stringWriter = new StringWriter();
        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
        A0A.A0b();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A0A.A0t((String) it.next());
        }
        A0A.A0Y();
        A0A.close();
        return stringWriter.toString();
    }

    public static final String A00(UserSession userSession, List list) {
        StringWriter stringWriter = new StringWriter();
        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
        A0A.A0b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Reel reel = (Reel) it.next();
            if (reel.A19(userSession)) {
                A0A.A0c();
                A0A.A0R("reel_id", reel.getId());
                A0A.A0Q("created_at", reel.A03);
                A0A.A0Z();
            }
        }
        A0A.A0Y();
        A0A.close();
        String obj = stringWriter.toString();
        0qQ.A07(obj);
        return obj;
    }

    public final String A02(UserSession userSession, List list) {
        StringWriter stringWriter = new StringWriter();
        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
        A0A.A0b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Reel reel = (Reel) it.next();
            ArrayList arrayList = new ArrayList();
            for (C255773uh r0 : reel.A0O(userSession)) {
                1Xj r02 = r0.A0b;
                if (r02 != null) {
                    String A2n = r02.A2n();
                    if (A2n != null) {
                        arrayList.add(A2n);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                A0A.A0c();
                A0A.A0R("reel_id", reel.getId());
                A0A.A0R("media_count", String.valueOf(arrayList.size()));
                A0A.A0Q("timestamp", reel.A03);
                A0A.A0R("media_ids", A01(arrayList));
                A0A.A0Z();
            }
        }
        A0A.A0Y();
        A0A.close();
        String obj = stringWriter.toString();
        0qQ.A07(obj);
        return obj;
    }
}
