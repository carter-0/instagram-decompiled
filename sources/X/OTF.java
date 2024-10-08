package X;

import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class OTF {
    public static final List A02 = 0sr.A1P(new C69415Nkv[]{C69415Nkv.VERIFIED, C69415Nkv.CREATOR, C69415Nkv.BUSINESS, C69415Nkv.SUBSCRIBER});
    public final AnonymousClass4kA A00;
    public final Set A01;

    public OTF(UserSession userSession) {
        C69415Nkv[] nkvArr = (C69415Nkv[]) A02.toArray(new C69415Nkv[0]);
        this.A01 = 0sc.A06(Arrays.copyOf(nkvArr, nkvArr.length));
        AnonymousClass4kA A002 = AnonymousClass4k9.A00(userSession);
        this.A00 = A002;
        Set A003 = AnonymousClass4kA.A00(A002, "pending_inbox_customized_top_filters", new HashSet(0));
        if (C66580MXl.A1b(A003)) {
            Set set = this.A01;
            set.clear();
            Iterator it = A003.iterator();
            while (it.hasNext()) {
                Integer valueOf = Integer.valueOf(AnonymousClass7TE.A18(it));
                0qQ.A0A(valueOf);
                Object obj = C69415Nkv.A03.get(valueOf);
                if (obj != null) {
                    set.add(obj);
                }
            }
        }
    }
}
