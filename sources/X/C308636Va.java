package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6Va  reason: invalid class name and case insensitive filesystem */
public final class C308636Va implements AnonymousClass2wO {
    public final UserSession A00;
    public final C233402vf A01;
    public final AnonymousClass2vH A02;

    public final C271864ji E4e(String str, Collection collection, Map map, boolean z) {
        0qQ.A0B(collection, 1);
        ArrayList arrayList = new ArrayList(collection);
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C250973mM r5 = (C250973mM) it.next();
            Reel reel = r5.A0H;
            if (reel.A0m()) {
                ArrayList arrayList2 = new ArrayList();
                if (this.A01.CVS(r5)) {
                    arrayList2.add("duplicate_netego_received");
                }
                AnonymousClass6YW A002 = AnonymousClass6YW.A00(this.A00);
                if (A002.A01.getBoolean(reel.getId(), false)) {
                    arrayList2.add("netego_is_hidden");
                }
                Integer num = reel.A0f;
                if ((num == AnonymousClass05K.A00 || num == AnonymousClass05K.A01) && reel.A0F == null) {
                    arrayList2.add("background_media_missing");
                }
                if (!arrayList2.isEmpty()) {
                    this.A02.CjT(r5, (String) arrayList2.get(0), arrayList2);
                    hashSet.add(r5);
                    it.remove();
                }
            }
        }
        return new C271864ji(arrayList, hashSet);
    }

    public final /* bridge */ /* synthetic */ void AWG(C54608HKr hKr, 1PW r3, Object obj) {
        C250973mM r4 = (C250973mM) obj;
        0qQ.A0B(r4, 0);
        0qQ.A0B(hKr, 1);
        if (r4.A0H.A0m()) {
            hKr.A02(this.A02, r4);
        }
    }

    public C308636Va(UserSession userSession, C233402vf r2, AnonymousClass2vH r3) {
        this.A00 = userSession;
        this.A01 = r2;
        this.A02 = r3;
    }
}
