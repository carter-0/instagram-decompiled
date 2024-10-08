package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class EEC extends C252233om {
    public UserSession A00;
    public E6T A01;
    public List A02;
    public final Handler A03 = new C46672Dj1(Looper.getMainLooper(), this, 3);
    public final AnonymousClass4D6 A04;
    public final Deque A05 = new ArrayDeque(3);
    public final Map A06 = Collections.synchronizedMap(AnonymousClass7TE.A1H());

    public final void onDestroy() {
        this.A03.removeCallbacksAndMessages((Object) null);
        this.A01 = null;
    }

    public final void onDestroyView() {
        this.A05.clear();
        Iterator A0v = AnonymousClass7TF.A0v(this.A06);
        while (A0v.hasNext()) {
            for (1OC cancel : (List) A0v.next()) {
                cancel.cancel();
            }
        }
    }

    public EEC(UserSession userSession, AnonymousClass4D6 r5, List list) {
        this.A00 = userSession;
        this.A04 = r5;
        this.A02 = list;
    }
}
