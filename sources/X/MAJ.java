package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;

public final /* synthetic */ class MAJ implements Runnable {
    public final /* synthetic */ 0xF A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C74551Pwk A02;
    public final /* synthetic */ 1OS A03;
    public final /* synthetic */ C65661fY A04;
    public final /* synthetic */ DirectThreadKey A05;
    public final /* synthetic */ PendingMediaStore A06;
    public final /* synthetic */ PendingMediaStoreSerializer A07;
    public final /* synthetic */ String A08;

    public /* synthetic */ MAJ(0xF r1, UserSession userSession, C74551Pwk pwk, 1OS r4, C65661fY r5, DirectThreadKey directThreadKey, PendingMediaStore pendingMediaStore, PendingMediaStoreSerializer pendingMediaStoreSerializer, String str) {
        this.A01 = userSession;
        this.A06 = pendingMediaStore;
        this.A07 = pendingMediaStoreSerializer;
        this.A03 = r4;
        this.A08 = str;
        this.A05 = directThreadKey;
        this.A00 = r1;
        this.A02 = pwk;
        this.A04 = r5;
    }

    public final void run() {
        UserSession userSession = this.A01;
        PendingMediaStore pendingMediaStore = this.A06;
        PendingMediaStoreSerializer pendingMediaStoreSerializer = this.A07;
        1OS r9 = this.A03;
        String str = this.A08;
        DirectThreadKey directThreadKey = this.A05;
        0xF r2 = this.A00;
        C74551Pwk pwk = this.A02;
        C65661fY r10 = this.A04;
        1ua A002 = 1ua.A00(C60960kU.A00, userSession);
        if (182.A06(0Tu.A05, userSession, 2342164482484348324L)) {
            AnonymousClass3Q2 A032 = pendingMediaStore.A03(str);
            if (A032 == null) {
                C270214gN r22 = C63565KzE.A02;
                C3265677h.A0Z(pwk.B3j(), AnonymousClass05K.A0N);
                pwk.DTM(r22, (String) null);
                return;
            } else if (A032.A6J != AnonymousClass3QD.CONFIGURED && !C64009LIw.A01(A032)) {
                if (AnonymousClass796.A00(userSession, r9, directThreadKey) != AnonymousClass797.OPEN_ONLY) {
                    A032.A5D = true;
                    A032.A6C = false;
                    A032.A53 = true;
                }
                A002.A0B(A032);
            }
        }
        pendingMediaStoreSerializer.A06(new C66063M9w(pwk, r9, r10, pendingMediaStore, str));
        C3265677h.A0Y(r2, AnonymousClass05K.A0N);
    }
}
