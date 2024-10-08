package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3KS  reason: invalid class name */
public final class AnonymousClass3KS implements Runnable {
    public final /* synthetic */ C2365134a A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass3KS(C2365134a r1, boolean z, boolean z2) {
        this.A02 = z;
        this.A00 = r1;
        this.A01 = z2;
    }

    public final void run() {
        String str;
        if (this.A02) {
            C2365134a r7 = this.A00;
            boolean z = this.A01;
            if (r7.A00 != null) {
                UserSession userSession = r7.A0F;
                List A0U = 1OP.A05(userSession).A0U(false);
                AnonymousClass3BJ.A00(userSession);
                C2365334c r3 = r7.A0P;
                r3.A0C.Ei9(A0U, z, r3.A0B);
                ArrayList A0O = 1OP.A05(userSession).A0O();
                User A012 = AnonymousClass0t1.A01.A01(userSession);
                Iterator it = A0O.iterator();
                int i = 0;
                while (it.hasNext()) {
                    ArrayList A0I = ((Reel) it.next()).A0I(userSession);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = A0I.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        User user = ((C255773uh) next).A0i;
                        if (user != null) {
                            str = user.getId();
                        } else {
                            str = null;
                        }
                        if (!0qQ.A0K(str, A012.getId())) {
                            arrayList.add(next);
                        }
                    }
                    i += arrayList.size();
                }
                ((C2365834h) r7.A0Q).A00 = i;
                C2372336v A002 = C2372236u.A00(userSession);
                List<Reel> A022 = r3.A02();
                synchronized (A002) {
                    1QP A003 = AnonymousClass1QO.A00(A002.A02);
                    C2372436w A004 = C2372336v.A00(A003, A002);
                    if (A004 != null) {
                        long j = A004.A05;
                        A003.flowMarkPoint(j, "POG_IMAGE_LOAD_START");
                        A003.flowAnnotate(j, "VISIBLE_POG_COUNT", A022.size());
                        HashSet hashSet = A004.A08;
                        hashSet.clear();
                        A004.A00 = 0;
                        HashSet hashSet2 = A004.A07;
                        hashSet2.add(C2372636y.POG_LOAD);
                        for (Reel id : A022) {
                            hashSet.add(id.getId());
                        }
                        String str2 = A004.A06;
                        if (str2 != null) {
                            hashSet2.add(C2372636y.SELF_POG_LOAD);
                            hashSet.add(str2);
                        }
                    }
                }
                1OP.A03(userSession).A08(AnonymousClass3BU.MAIN_TRAY_SERVER_RESPONSE, A0U);
            }
        }
    }
}
