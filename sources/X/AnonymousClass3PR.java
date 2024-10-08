package X;

import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3PR  reason: invalid class name */
public final class AnonymousClass3PR extends AnonymousClass3PS {
    public final /* synthetic */ AnonymousClass3PP A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ WeakReference A02;

    public AnonymousClass3PR(AnonymousClass3PP r1, String str, WeakReference weakReference) {
        this.A00 = r1;
        this.A02 = weakReference;
        this.A01 = str;
    }

    public static final void A00(AnonymousClass3PR r6, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AnonymousClass3PP r2 = r6.A00;
            Reel A0M = ReelStore.A03(r2.A00).A0M(str);
            if (A0M != null) {
                A0M.A1X = true;
            }
            r2.A03.remove(str);
            Map map = r2.A01;
            List<Reference> list = (List) map.get(str);
            if (list != null) {
                for (Reference reference : list) {
                    AnonymousClass3PN r1 = (AnonymousClass3PN) reference.get();
                    if (r1 != null) {
                        r1.DOW(str, false);
                    }
                }
            }
            map.remove(str);
        }
    }
}
