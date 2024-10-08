package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3PS  reason: invalid class name */
public abstract class AnonymousClass3PS {
    public void A01(Map map) {
        C279314yR r0;
        AnonymousClass3PR r2 = (AnonymousClass3PR) this;
        0qQ.A0B(map, 0);
        r2.A00.A02.removeAll(map.keySet());
        AnonymousClass3PR.A00(r2, map.keySet());
        WeakReference weakReference = r2.A02;
        if (weakReference != null && (r0 = (C279314yR) weakReference.get()) != null) {
            r0.Dok(map);
        }
    }

    public void A02(Set set) {
        C279314yR r0;
        if (this instanceof AnonymousClass3PR) {
            AnonymousClass3PR r7 = (AnonymousClass3PR) this;
            0qQ.A0B(set, 0);
            AnonymousClass3PP r5 = r7.A00;
            r5.A02.addAll(set);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                UserSession userSession = r5.A00;
                Reel A0M = ReelStore.A03(userSession).A0M(str);
                if (A0M != null) {
                    A0M.A1X = false;
                }
                r5.A03.remove(str);
                Map map = r5.A01;
                List<Reference> list = (List) map.get(str);
                if (list != null) {
                    for (Reference reference : list) {
                        AnonymousClass3PN r02 = (AnonymousClass3PN) reference.get();
                        if (r02 != null) {
                            r02.DOJ(str);
                            LS4.A02(userSession, str, "reel_media_and_segments_fail_to_load", r7.A01);
                        }
                    }
                }
                map.remove(str);
            }
            WeakReference weakReference = r7.A02;
            if (weakReference != null && (r0 = (C279314yR) weakReference.get()) != null) {
                r0.onFailure();
            }
        }
    }

    public final void A03(Set set) {
        C279314yR r0;
        if (this instanceof AnonymousClass3PR) {
            AnonymousClass3PR r1 = (AnonymousClass3PR) this;
            r1.A00.A02.removeAll(set);
            AnonymousClass3PR.A00(r1, set);
            WeakReference weakReference = r1.A02;
            if (weakReference != null && (r0 = (C279314yR) weakReference.get()) != null) {
                r0.onFailure();
            }
        }
    }
}
