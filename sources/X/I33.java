package X;

import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class I33 {
    public static final void A01(AnonymousClass0iw r3, UserSession userSession, SavedCollection savedCollection, Integer num) {
        String str;
        0Aj A0e = AnonymousClass7TE.A0e(C51967G9n.A0Z(r3, userSession, num, 3), "ig_collections");
        if (A0e.isSampled()) {
            C51969G9p.A19(A0e, r3);
            DbS.A1I(A0e, "context_menu_action");
            switch (num.intValue()) {
                case 0:
                    str = "edit";
                    break;
                case 1:
                    str = "select";
                    break;
                case 2:
                    str = "report";
                    break;
                case 3:
                    str = "Delete collection";
                    break;
                default:
                    str = "Add to collection";
                    break;
            }
            C51973G9u.A14(A0e, "collection_type", C51975G9x.A0g(A0e, savedCollection, "action_type", str));
            I35.A02(A0e, userSession, savedCollection);
            A0e.Cgf();
        }
    }

    public static final void A02(UserSession userSession, AnonymousClass4DU r5, SavedCollection savedCollection, ArrayList arrayList) {
        0qQ.A0B(userSession, 3);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            C254523sc A0n = C51965G9l.A0n(r5, "instagram_organic_add_to_collection");
            A0n.A5u = A18;
            A0n.A4l = savedCollection.A0F;
            A0n.A4n = savedCollection.A02();
            A0n.A65 = DbS.A0k();
            A0n.A6q = savedCollection.A0G;
            if (!C271764jY.A00(userSession, A0n, r5, AnonymousClass05K.A01)) {
                DbU.A1R(A0n.A00(), userSession);
            }
        }
    }

    public static final void A00(AnonymousClass0iw r3, UserSession userSession, SavedCollection savedCollection) {
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0O(r3, userSession), "ig_collections");
        if (A0e.isSampled()) {
            C51969G9p.A19(A0e, r3);
            DbS.A1I(A0e, "create_new_collection");
            C51973G9u.A14(A0e, "collection_type", C51975G9x.A0g(A0e, savedCollection, "user_type", I35.A01(savedCollection.A01(userSession))));
            A0e.AAJ("collection_name", savedCollection.A0G);
            A0e.Cgf();
        }
    }
}
