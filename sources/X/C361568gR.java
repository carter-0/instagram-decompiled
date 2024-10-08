package X;

import android.content.Context;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.8gR  reason: invalid class name and case insensitive filesystem */
public final class C361568gR {
    public List A00;
    public C62320sa A01;
    public final Map A02;

    public static final synchronized void A00(RemoteMedia remoteMedia, A6F a6f, C361568gR r6, Integer num) {
        synchronized (r6) {
            r6.A02.put(remoteMedia, new A6F(num, a6f.A02, a6f.A01));
            if (r6.A00.contains(remoteMedia) && !r6.A01(r6.A00) && !r6.A02(r6.A00)) {
                C62320sa r0 = r6.A01;
                if (r0 != null) {
                    r0.invoke();
                }
                r6.A00 = 0sn.A00;
                r6.A01 = null;
            }
        }
    }

    private final synchronized boolean A01(List list) {
        boolean z;
        z = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!this.A02.containsKey((RemoteMedia) it.next())) {
                    break;
                }
            }
        }
        z = false;
        return z;
    }

    private final synchronized boolean A02(List list) {
        boolean z;
        Integer num;
        z = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                A6F a6f = (A6F) this.A02.get((RemoteMedia) it.next());
                if (a6f != null) {
                    num = a6f.A00;
                } else {
                    num = null;
                }
                if (num == AnonymousClass05K.A00) {
                    break;
                }
            }
        }
        z = false;
        return z;
    }

    public final synchronized void A03(Context context, RemoteMedia remoteMedia, UserSession userSession, String str, 0sP r20, 0sP r21) {
        synchronized (this) {
            Context context2 = context;
            0qQ.A0B(context2, 0);
            UserSession userSession2 = userSession;
            0qQ.A0B(userSession2, 1);
            0sP r7 = r20;
            0sP r8 = r21;
            A6F a6f = new A6F(AnonymousClass05K.A00, r7, r8);
            RemoteMedia remoteMedia2 = remoteMedia;
            this.A02.put(remoteMedia2, a6f);
            C290815g0 A03 = C59730JVo.A03(context2, userSession2, new C11211SFl(remoteMedia2.A04.CCJ(), "RemoteMediaDownloadManager", remoteMedia2.A09, false, false));
            A03.A00 = new C385879jg(remoteMedia2, userSession2, a6f, this, str, r7, r8);
            1ES.A03(A03);
        }
    }

    public final synchronized void A04(List list, C62320sa r3) {
        if (A01(list) || A02(list)) {
            this.A01 = r3;
            this.A00 = list;
        } else {
            this.A01 = null;
            this.A00 = 0sn.A00;
            r3.invoke();
        }
    }

    public C361568gR(UserSession userSession, boolean z) {
        List<RemoteMedia> A0a;
        this.A02 = new HashMap();
        this.A00 = new ArrayList();
        if (z && userSession != null) {
            synchronized (this) {
                C361558gQ A002 = C361538gO.A00(userSession);
                synchronized (A002) {
                    A0a = 00k.A0a(A002.A01.keySet());
                }
                for (RemoteMedia put : A0a) {
                    this.A02.put(put, new A6F(AnonymousClass05K.A01, C41725AzG.A00, C41726AzH.A00));
                }
            }
        }
    }

    public C361568gR() {
        this((UserSession) null, false);
    }
}
