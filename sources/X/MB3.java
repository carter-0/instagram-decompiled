package X;

import android.content.Context;
import android.util.Pair;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public final class MB3 implements Callable {
    public final Context A00;
    public final UserSession A01;
    public final C61480nO A02;
    public final HashMap A03;
    public final List A04;
    public final List A05;
    public final Queue A06 = new LinkedList();

    public MB3(Context context, UserSession userSession, List list, List list2, Map map) {
        ArrayList arrayList;
        0qQ.A0B(map, 3);
        this.A00 = context;
        this.A01 = userSession;
        C61480nO A002 = 0nY.A00();
        0qQ.A07(A002);
        this.A02 = A002;
        this.A03 = new HashMap(map);
        this.A04 = AnonymousClass7TE.A1D(list);
        if (list2 != null) {
            arrayList = AnonymousClass7TE.A1D(list2);
        } else {
            arrayList = null;
        }
        this.A05 = arrayList;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        boolean z;
        List list = this.A04;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Medium medium = (Medium) list.get(i);
            1Xj r7 = (1Xj) this.A03.get(String.valueOf(medium.A05));
            if (r7 != null) {
                Context context = this.A00;
                UserSession userSession = this.A01;
                List list2 = this.A05;
                if (list2 != null) {
                    z = AnonymousClass7TE.A1a(list2.get(i));
                } else {
                    z = false;
                }
                C11211SFl A052 = C59730JVo.A05(context, r7, "gallery", z, false);
                0nc r8 = new 0nc(new C13155TNn(context, userSession, A052, A052.A01, A052.A00, -1, false), 132, 3, false, false);
                this.A06.offer(new Pair(medium, r8));
                this.A02.ATD(r8);
            }
        }
        while (true) {
            Queue queue = this.A06;
            if (queue.isEmpty()) {
                return list;
            }
            Object poll = queue.poll();
            if (poll != null) {
                Pair pair = (Pair) poll;
                Object obj = pair.second;
                0qQ.A06(obj);
                Object obj2 = ((FutureTask) obj).get();
                0qQ.A07(obj2);
                ((Medium) pair.first).A04((File) obj2);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
    }
}
