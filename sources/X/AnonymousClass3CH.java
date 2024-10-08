package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.3CH  reason: invalid class name */
public final class AnonymousClass3CH implements C233782wS {
    public final UserSession A00;
    public final Context A01;
    public final AnonymousClass07i A02;
    public final Set A03 = Collections.synchronizedSet(new LinkedHashSet());

    public final void Dwr(Collection collection, int i) {
        0qQ.A0B(collection, 0);
        ArrayList<C250973mM> arrayList = new ArrayList<>();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            it.next();
        }
        for (C250973mM r0 : arrayList) {
            Set set = this.A03;
            Reel reel = r0.A0H;
            if (set.add(reel.getId())) {
                1NY r2 = new 1NY(this.A00);
                r2.A04();
                r2.A0A("clips/risu_medias/");
                r2.A0R(C54045GyU.class, C56216Huj.class);
                1OC A0M = r2.A0M();
                String id = reel.getId();
                0qQ.A07(id);
                A0M.A00 = new H4C(this, id);
                1ES.A00(this.A01, this.A02, A0M);
            }
        }
    }

    public final void D1r() {
        this.A03.clear();
    }

    public AnonymousClass3CH(Context context, AnonymousClass07i r3, UserSession userSession) {
        this.A01 = context;
        this.A02 = r3;
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ void D6A(Object obj, List list, int i) {
    }
}
