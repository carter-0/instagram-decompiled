package X;

import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.tagging.api.model.MediaSuggestedProductTagProductItemContainer;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KxP  reason: case insensitive filesystem */
public abstract class C63460KxP {
    public static final List A00(List list) {
        String str;
        float f;
        User user;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaSuggestedProductTag mediaSuggestedProductTag = (MediaSuggestedProductTag) it.next();
            MediaSuggestedProductTagProductItemContainer mediaSuggestedProductTagProductItemContainer = (MediaSuggestedProductTagProductItemContainer) 00k.A0J(DbU.A0K(mediaSuggestedProductTag.A02));
            String str2 = null;
            if (mediaSuggestedProductTagProductItemContainer != null) {
                str = C14502TxO.A00(mediaSuggestedProductTagProductItemContainer.A01).A0H;
            } else {
                str = null;
            }
            MediaSuggestedProductTagProductItemContainer mediaSuggestedProductTagProductItemContainer2 = (MediaSuggestedProductTagProductItemContainer) 00k.A0J(DbU.A0K(mediaSuggestedProductTag.A02));
            if (!(mediaSuggestedProductTagProductItemContainer2 == null || (user = C14502TxO.A00(mediaSuggestedProductTagProductItemContainer2.A01).A0B) == null)) {
                str2 = AnonymousClass3ZA.A00(user);
            }
            Float A08 = mediaSuggestedProductTag.A08();
            if (A08 != null) {
                f = A08.floatValue();
            } else {
                f = 0.0f;
            }
            if (!(str == null || str2 == null)) {
                A1C.add(new C61043Jvh(str, str2, 1, f));
            }
        }
        return A1C;
    }
}
