package X;

import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.FollowStatus;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.7Ba  reason: invalid class name and case insensitive filesystem */
public final class C327497Ba implements 1wn {
    public final /* synthetic */ AnonymousClass7BY A00;

    public C327497Ba(AnonymousClass7BY r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        String str;
        int A03 = AnonymousClass0fD.A03(-1555350477);
        AnonymousClass3KA r9 = (AnonymousClass3KA) obj;
        int A032 = AnonymousClass0fD.A03(1998429667);
        if (r9.A00 == FollowStatus.A06) {
            ArrayList arrayList = new ArrayList();
            AnonymousClass7BY r6 = this.A00;
            C249803kO it = r6.A01().iterator();
            while (it.hasNext()) {
                DirectShareTarget directShareTarget = (DirectShareTarget) it.next();
                CreatorBroadcastThreadInfo creatorBroadcastThreadInfo = directShareTarget.A04;
                if (!(creatorBroadcastThreadInfo == null || (str = creatorBroadcastThreadInfo.A03) == null || !str.equals(r9.A01))) {
                    arrayList.add(directShareTarget);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                r6.A03((DirectShareTarget) it2.next());
            }
        }
        AnonymousClass0fD.A0A(1096727732, A032);
        AnonymousClass0fD.A0A(-91160783, A03);
    }
}
