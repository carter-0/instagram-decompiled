package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;

/* renamed from: X.ToJ  reason: case insensitive filesystem */
public final class C14017ToJ implements AnonymousClass0lh, 27S {
    public static final C20998X8v A02 = new C66636Ma5(7);
    public static final C20980X7u A03 = new C14141Tqb(8);
    public final C14016ToI A00;
    public final UserSession A01;

    public final synchronized void A01(User user) {
        this.A00.A04(user);
    }

    public final void A00(User user) {
        C14016ToI toI = this.A00;
        for (C66632Ma1 A06 : toI.A02()) {
            if (0qQ.A0K(A06.A06(), user)) {
                toI.A05(user);
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r2 == null) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean A72(java.lang.Object r6) {
        /*
            r5 = this;
            X.2Cy r6 = (X.2Cy) r6
            r4 = r5
            r0 = 0
            X.0qQ.A0B(r6, r0)
            monitor-enter(r4)
            X.ToI r0 = r5.A00     // Catch:{ all -> 0x002d }
            java.util.List r0 = r0.A01()     // Catch:{ all -> 0x002d }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x002f }
        L_0x0012:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x002a
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x002f }
            r1 = r2
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1     // Catch:{ all -> 0x002f }
            com.instagram.user.model.User r0 = r6.A00     // Catch:{ all -> 0x002f }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0012
            r0 = 1
            if (r2 != 0) goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            monitor-exit(r4)
            return r0
        L_0x002d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x002f }
        L_0x002f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14017ToJ.A72(java.lang.Object):boolean");
    }

    public final void onSessionWillEnd() {
        AnonymousClass1Nd.A00(this.A01).A02(this, 2Cy.class);
    }

    public C14017ToJ(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = new C14016ToI(userSession, A02, A03, 100);
        AnonymousClass1Nd.A00(userSession).A01(this, 2Cy.class);
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032 = AnonymousClass0fD.A03(40308723);
        2Cy r8 = (2Cy) obj;
        synchronized (this) {
            int A0D = AnonymousClass7TG.A0D(r8, -1524255841);
            Iterator it = this.A00.A02().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                User A06 = ((C66632Ma1) it.next()).A06();
                User user = r8.A00;
                if (0qQ.A0K(A06, user)) {
                    if (C14025ToR.A01(A06, user)) {
                        A01(user);
                    }
                }
            }
            AnonymousClass0fD.A0A(-836811156, A0D);
        }
        AnonymousClass0fD.A0A(108523642, A032);
    }
}
