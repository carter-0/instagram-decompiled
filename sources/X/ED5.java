package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

public final class ED5 extends 1P0 {
    public final UserSession A00;
    public final C39767A8h A01;
    public final G83 A02;
    public final String A03;

    public ED5(UserSession userSession, C39767A8h a8h, G83 g83, String str) {
        this.A03 = str;
        this.A00 = userSession;
        this.A01 = a8h;
        this.A02 = g83;
    }

    public final void onFail(C268654dm r4) {
        Integer num;
        int A0D = AnonymousClass7TG.A0D(r4, -1896239449);
        C334247ax r0 = (C334247ax) r4.A00();
        G83 g83 = this.A02;
        if (r0 != null) {
            num = Integer.valueOf(r0.getStatusCode());
        } else {
            num = null;
        }
        g83.DEH(num);
        C334237aw.A01.remove(this.A03);
        AnonymousClass0fD.A0A(1858185433, A0D);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-1672524734);
        ED5.super.onFinish();
        this.A02.onFinish();
        AnonymousClass0fD.A0A(-1104199959, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(-483073678);
        ED5.super.onStart();
        C334237aw.A01.put(this.A03, Long.valueOf(System.currentTimeMillis()));
        this.A02.onStart();
        AnonymousClass0fD.A0A(-52523083, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A032 = AnonymousClass0fD.A03(1400184251);
        C334247ax r7 = (C334247ax) obj;
        int A033 = AnonymousClass0fD.A03(92870165);
        0qQ.A0B(r7, 0);
        List items = r7.getItems();
        if (items.isEmpty()) {
            0wb.A03("restrict_error", "Member change api returned success with no users.");
            this.A02.DEH(Integer.valueOf(r7.getStatusCode()));
            C334237aw.A01.remove(this.A03);
            i = -1874482064;
        } else {
            Iterator it = items.iterator();
            while (it.hasNext()) {
                User A0k = DbT.A0k(it);
                17h.A00(this.A00).A01(A0k, false, false);
                this.A01.A00(A0k);
            }
            this.A02.onSuccess();
            C334237aw.A01.remove(this.A03);
            i = 1114094252;
        }
        AnonymousClass0fD.A0A(i, A033);
        AnonymousClass0fD.A0A(-48012699, A032);
    }
}
