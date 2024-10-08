package com.instagram.tagging.model;

import X.0qQ;
import X.17W;
import X.17Z;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.JTO;
import X.JTP;
import X.JTT;
import android.graphics.PointF;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class TagSerializer {
    public static final void A03(17Z r3, Tag tag) {
        if (tag != null) {
            r3.A0c();
            String A03 = tag.A03();
            String id = tag.getId();
            0qQ.A07(id);
            r3.A0Q(A03, Long.parseLong(id));
            JTT.A0y(tag.A00(), r3);
            tag.A05(r3);
            r3.A0Z();
        }
    }

    public static final String A00(List list, List list2) {
        StringWriter A0v = JTO.A0v();
        17W A0K = AnonymousClass7TF.A0K(A0v);
        if (!list.isEmpty()) {
            A0K.A0q("in");
            Iterator A0v2 = JTP.A0v(A0K, list);
            while (A0v2.hasNext()) {
                A03(A0K, (Tag) A0v2.next());
            }
            A0K.A0Y();
        }
        if (list2 != null && !list2.isEmpty()) {
            A0K.A0q("untagged");
            Iterator A0v3 = JTP.A0v(A0K, list2);
            while (A0v3.hasNext()) {
                A03(A0K, (Tag) A0v3.next());
            }
            A0K.A0Y();
        }
        String A0k = AnonymousClass7TG.A0k(A0K, A0v);
        0qQ.A07(A0k);
        return A0k;
    }

    public static final String A01(List list, List list2, List list3) {
        StringWriter A0v = JTO.A0v();
        17W A0K = AnonymousClass7TF.A0K(A0v);
        A0K.A0q("in");
        A0K.A0b();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A03(A0K, (Tag) it.next());
            }
        }
        A0K.A0Y();
        if (list2 != null && !list2.isEmpty()) {
            A0K.A0q("removed");
            Iterator A0v2 = JTP.A0v(A0K, list2);
            while (A0v2.hasNext()) {
                Tag tag = (Tag) A0v2.next();
                if (tag != null) {
                    A0K.A0t(tag.getId());
                }
            }
            A0K.A0Y();
        }
        if (list3 != null && !list3.isEmpty()) {
            A0K.A0q("added");
            Iterator A0v3 = JTP.A0v(A0K, list3);
            while (A0v3.hasNext()) {
                Tag tag2 = (Tag) A0v3.next();
                if (tag2 != null) {
                    A0K.A0t(tag2.getId());
                }
            }
            A0K.A0Y();
        }
        String A0k = AnonymousClass7TG.A0k(A0K, A0v);
        0qQ.A07(A0k);
        return A0k;
    }

    public static final String A02(Map map, Set set, Set set2) {
        StringWriter A0v = JTO.A0v();
        17W A0K = AnonymousClass7TF.A0K(A0v);
        A0K.A0q("in");
        A0K.A0b();
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                A0K.A0c();
                A0K.A0R(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, A18);
                if (map != null) {
                    JTT.A0y((PointF) map.get(A18), A0K);
                }
                A0K.A0Z();
            }
        }
        A0K.A0Y();
        A0K.A0q("removed");
        A0K.A0b();
        if (set2 != null) {
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                A0K.A0t(AnonymousClass7TE.A18(it2));
            }
        }
        A0K.A0Y();
        String A0k = AnonymousClass7TG.A0k(A0K, A0v);
        0qQ.A07(A0k);
        return A0k;
    }
}
