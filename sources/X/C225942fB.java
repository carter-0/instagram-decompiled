package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.2fB  reason: invalid class name and case insensitive filesystem */
public final class C225942fB extends 0px {
    public 1NH A00;

    public static C225942fB A00(UserSession userSession) {
        Class<C225942fB> cls = C225942fB.class;
        0rJ A002 = 0rL.A00(userSession);
        C225942fB r1 = (0px) A002.A04.get(cls);
        if (r1 != null) {
            return r1;
        }
        1NH r0 = new 1NH(C60960kU.A00, new AnonymousClass2fC(userSession), 789611494);
        0px r12 = new 0px(userSession);
        r12.A00 = r0;
        A002.A03(r12, cls);
        return r12;
    }

    public final /* bridge */ /* synthetic */ 1OC A0G(Object obj) {
        C56538I0n i0n = (C56538I0n) obj;
        if (this.A00 == null) {
            A07();
        }
        UserSession userSession = this.A02;
        C247733gp A002 = i0n.A00();
        String str = i0n.A05;
        String str2 = i0n.A06;
        return C56631I5k.A00(userSession, A002, i0n.A00().A07, str, str2, i0n.A01, i0n.A00, i0n.A02, i0n.A07, i0n.A09, i0n.A0A, i0n.A08);
    }

    public final Integer A0H() {
        return AnonymousClass05K.A01;
    }

    public final void A0I() {
        List<C56538I0n> list;
        1NH r7 = this.A00;
        String str = this.A02.A06;
        AnonymousClass45G r0 = (AnonymousClass45G) r7.A02(002.A0R("pending_comments_", str), true);
        if (!(r0 == null || (list = r0.A00) == null)) {
            HashMap hashMap = new HashMap();
            for (C56538I0n i0n : list) {
                if (i0n.A00() != null) {
                    i0n.A00().A06 = C252883pr.RetryWhenNetworkAvailable;
                    i0n.A08 = true;
                    hashMap.put(i0n.A00().A0G, i0n);
                }
            }
            hashMap.size();
            A0E(hashMap);
            A08();
        }
        r7.A04(002.A0R("pending_comments_", str));
    }

    public final void A0J() {
        this.A00.A04(002.A0R("pending_comments_", this.A02.A06));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.45G] */
    public final void A0K() {
        A02();
        ? obj = new Object();
        obj.A00 = A05();
        this.A00.A06(002.A0R("pending_comments_", this.A02.A06), obj);
    }

    public final void A0L(C56538I0n i0n) {
        if (!A0F(i0n.A00().A0G)) {
            i0n.A00();
            A0D(i0n.A00().A0G, i0n);
        }
    }
}
