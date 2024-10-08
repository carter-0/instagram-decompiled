package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4xS  reason: invalid class name and case insensitive filesystem */
public final class C278744xS {
    public final int A00;
    public final Context A01;
    public final UserSession A02;
    public final List A03 = Collections.synchronizedList(new ArrayList());
    public final List A04 = Collections.synchronizedList(new ArrayList());

    public C278744xS(Context context, UserSession userSession) {
        0qQ.A0B(context, 1);
        this.A01 = context;
        this.A02 = userSession;
        this.A00 = (int) 182.A01(0Tu.A05, userSession, 36606388516296103L);
    }

    public static final synchronized void A00(AnonymousClass540 r1, C278744xS r2) {
        synchronized (r2) {
            if (r2.A03.isEmpty() && r2.A04.isEmpty()) {
                r1.AVX("reel_background_prefetch");
            }
        }
    }

    public static final void A01(AnonymousClass540 r11, C278744xS r12, List list) {
        1Xj A1c;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List A0O = ((Reel) it.next()).A0O(r12.A02);
            0qQ.A07(A0O);
            int size = A0O.size();
            for (int i = 0; i < size; i++) {
                1Xj r8 = ((C255773uh) A0O.get(i)).A0b;
                if (r8 != null) {
                    C50243FVa fVa = new C50243FVa(r11, r12);
                    r12.A03.add(fVa);
                    ExtendedImageUrl A1n = r8.A1n(r12.A01);
                    if (A1n != null) {
                        1OO A0J = 1NK.A00().A0J(A1n, "reel_background_prefetch");
                        A0J.A0I = true;
                        A0J.A02(fVa);
                        r8.A17();
                        A0J.A0F = false;
                        arrayList.add(A0J.A00());
                    }
                    if ((r8.CeS() || (r8.A5D() && (A1c = r8.A1c(r8.A0w())) != null && A1c.CeS())) && (!r8.A5D() || (r8 = r8.A1c(r8.A0w())) != null)) {
                        C256203vO r2 = new C256203vO(r8.CEL(), "reel_background_prefetch");
                        C51061Fnr fnr = new C51061Fnr(r11, r12);
                        r12.A04.add(fnr);
                        r2.A01(fnr, r12.A00);
                        arrayList2.add(r2);
                    }
                }
            }
        }
        if (arrayList.size() == 0 && arrayList2.size() == 0) {
            A00(r11, r12);
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            1NK.A00().A0N((C226952iF) it2.next());
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            C255593uO.A00(r12.A02).A01((C256203vO) it3.next());
        }
    }
}
