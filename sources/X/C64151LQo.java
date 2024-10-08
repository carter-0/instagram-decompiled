package X;

import android.content.res.Resources;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LQo  reason: case insensitive filesystem */
public final class C64151LQo {
    public static final List A01(List list) {
        0qQ.A0B(list, 0);
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0r.add(JTR.A0f(JTO.A0W(it)));
        }
        return A0r;
    }

    public final List A02(Resources resources, AnonymousClass0iw r12, UserSession userSession, String str, List list) {
        Medium medium;
        AnonymousClass0iw r4 = r12;
        UserSession userSession2 = userSession;
        List list2 = list;
        AnonymousClass7TG.A1T(list, userSession, r12);
        0qQ.A0B(resources, 4);
        C361558gQ A00 = C361538gO.A00(userSession);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GalleryItem galleryItem = (GalleryItem) it.next();
            RemoteMedia remoteMedia = galleryItem.A04;
            if (remoteMedia != null) {
                medium = A00.A01(remoteMedia);
                if (medium == null) {
                    AnonymousClass9PQ.A04(r4, remoteMedia, userSession2, str, resources.getString(2131962946), list2);
                    throw new C270384ge(AnonymousClass7TF.A0d(resources, 2131962946));
                }
            } else {
                medium = galleryItem.A00;
                if (medium == null) {
                }
            }
            A1C.add(medium);
        }
        return A01(A1C);
    }

    public static final List A00(List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RemoteMedia remoteMedia = ((GalleryItem) it.next()).A04;
            if (remoteMedia != null) {
                A1C.add(remoteMedia);
            }
        }
        return A1C;
    }
}
