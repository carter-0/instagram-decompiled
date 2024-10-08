package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.7Ve  reason: invalid class name and case insensitive filesystem */
public final class C332477Ve implements C332487Vf {
    public final 1wn A00 = new C332497Vg(this);
    public final UserSession A01;
    public final AnonymousClass0eK A02;

    public final void FKn(String str, String str2) {
        0qQ.A0B(str2, 1);
        A00(this, str, str2);
    }

    public static final void A00(C332477Ve r7, String str, String str2) {
        String str3;
        AnonymousClass0eK r1 = r7.A02;
        DirectThreadKey A04 = C66647MaG.A04(((C333517Zg) r1.get()).C6l().AfV());
        if (0qQ.A0K(((C333517Zg) r1.get()).C6l().C6C(), str) && A04 != null) {
            UserSession userSession = r7.A01;
            ArrayList Aax = 2L2.A00(userSession).Aax(A04, true);
            ArrayList arrayList = new ArrayList();
            Iterator it = Aax.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C254703su r0 = (C254703su) next;
                ImmutableList A0H = r0.A0H();
                if (r0.A10 == 2FW.A0y && A0H != null && !A0H.isEmpty()) {
                    Long l = ((C254873tC) A0H.get(0)).A0m;
                    if (l != null) {
                        str3 = l.toString();
                    } else {
                        str3 = null;
                    }
                    if (0qQ.A0K(str3, str2)) {
                        arrayList.add(next);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                C254703su r02 = (C254703su) arrayList.get(0);
                if (str != null) {
                    String A0g = r02.A0g();
                    if (A0g != null) {
                        String A0f = r02.A0f();
                        if (A0f != null) {
                            C3265077a.A00(userSession, new C40503AdC(), str, A0g, A0f);
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public C332477Ve(UserSession userSession, AnonymousClass0eK r3) {
        this.A01 = userSession;
        this.A02 = r3;
    }
}
