package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedList;

/* renamed from: X.36a  reason: invalid class name and case insensitive filesystem */
public final class C2370236a implements 0lm {
    public double A00;
    public long A01;
    public boolean A02;
    public final LinkedList A03 = new LinkedList();

    public final synchronized String A01() {
        String str;
        LinkedList linkedList = this.A03;
        if (linkedList.isEmpty()) {
            str = "";
        } else {
            str = (String) linkedList.getLast();
        }
        return str;
    }

    public final synchronized String A02() {
        String str;
        LinkedList linkedList = this.A03;
        if (linkedList.isEmpty()) {
            str = "";
        } else {
            str = (String) linkedList.getFirst();
            for (int i = 1; i < linkedList.size(); i++) {
                str = 002.A0g(str, ",", (String) linkedList.get(i));
            }
        }
        return str;
    }

    public static C2370236a A00(UserSession userSession) {
        return (C2370236a) userSession.A01(C2370236a.class, new C2370336b(userSession));
    }

    public final void A03(String str) {
        if (this.A02) {
            synchronized (this) {
                LinkedList linkedList = this.A03;
                linkedList.addLast(str);
                if (((long) linkedList.size()) > this.A01) {
                    linkedList.removeFirst();
                }
            }
        }
    }

    public final void onUserSessionWillEnd(boolean z) {
        if (z) {
            synchronized (this) {
                this.A03.clear();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003e, code lost:
        if (X.182.A06(r3, r5, 36315602050682279L) != false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2370236a(com.instagram.common.session.UserSession r5) {
        /*
            r4 = this;
            r4.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r4.A03 = r0
            r2 = 0
            r0 = 0
            r4.A00 = r0
            X.0Tu r3 = X.0Tu.A05
            r0 = 36593473549894989(0x820192000a054d, double:3.2051982508198796E-306)
            long r0 = X.182.A01(r3, r5, r0)
            r4.A01 = r0
            r0 = 36311998572725080(0x81019200030358, double:3.02719234184887E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 != 0) goto L_0x0040
            r0 = 36311998572594006(0x81019200010356, double:3.027192341765978E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 != 0) goto L_0x0040
            X.0qQ.A0B(r5, r2)
            r0 = 36315602050682279(0x8104d900090da7, double:3.029471195819044E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 == 0) goto L_0x0041
        L_0x0040:
            r2 = 1
        L_0x0041:
            r4.A02 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2370236a.<init>(com.instagram.common.session.UserSession):void");
    }
}
