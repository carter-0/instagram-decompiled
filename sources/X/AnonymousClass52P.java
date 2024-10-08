package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.people.PeopleTag;
import com.instagram.user.model.FollowStatus;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.52P  reason: invalid class name */
public final class AnonymousClass52P implements 1wn {
    public final UserSession A00;
    public final 1Xj A01;
    public final WeakReference A02;
    public final HashMap A03;

    public AnonymousClass52P(UserSession userSession, 1Xj r3, WeakReference weakReference, HashMap hashMap) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(hashMap, 3);
        this.A00 = userSession;
        this.A01 = r3;
        this.A03 = hashMap;
        this.A02 = weakReference;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        int A032 = AnonymousClass0fD.A03(1600287809);
        AnonymousClass3KA r8 = (AnonymousClass3KA) obj;
        int A033 = AnonymousClass0fD.A03(826963637);
        0qQ.A0B(r8, 0);
        ArrayList A002 = LNS.A00.A00(this.A00, this.A01);
        ArrayList arrayList = new ArrayList(0Yv.A1E(A002, 10));
        Iterator it = A002.iterator();
        while (it.hasNext()) {
            arrayList.add(((PeopleTag) it.next()).A07().getId());
        }
        String str = r8.A01;
        if (arrayList.contains(str)) {
            HashMap hashMap = this.A03;
            hashMap.put(str, r8.A00);
            for (Map.Entry entry : hashMap.entrySet()) {
                entry.getKey();
                if (entry.getValue() != FollowStatus.A05) {
                    2Wa r1 = (2Wa) this.A02.get();
                    if (r1 != null) {
                        r1.A01(false);
                    }
                    i = -410097966;
                    AnonymousClass0fD.A0A(i, A033);
                    AnonymousClass0fD.A0A(-1182085782, A032);
                }
            }
            2Wa r0 = (2Wa) this.A02.get();
            if (r0 != null) {
                r0.A00();
            }
        }
        i = -2007990684;
        AnonymousClass0fD.A0A(i, A033);
        AnonymousClass0fD.A0A(-1182085782, A032);
    }
}
