package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.2f9  reason: invalid class name */
public final class AnonymousClass2f9 extends 0px {
    public final 1NH A00;

    public static AnonymousClass2f9 A00(UserSession userSession) {
        Class<AnonymousClass2f9> cls = AnonymousClass2f9.class;
        0rJ A002 = 0rL.A00(userSession);
        AnonymousClass2f9 r1 = (0px) A002.A04.get(cls);
        if (r1 != null) {
            return r1;
        }
        AnonymousClass2f9 r12 = new AnonymousClass2f9(new 1NH(C60960kU.A00, new C225932fA(), 630639402), userSession);
        A002.A03(r12, cls);
        return r12;
    }

    public final /* bridge */ /* synthetic */ 1OC A0G(Object obj) {
        return ((C230262pI) obj).A03(this.A02);
    }

    public final Integer A0H() {
        return AnonymousClass05K.A0N;
    }

    public final void A0I() {
        HashMap hashMap;
        1NH r6 = this.A00;
        String str = this.A02.A06;
        C254693st r3 = (C254693st) r6.A02(002.A0R("pending_reel_seen_states_", str), true);
        if (!(r3 == null || (hashMap = r3.A00) == null)) {
            for (String str2 : hashMap.keySet()) {
                Object obj = r3.A00.get(str2);
                obj.getClass();
                A0D(str2, obj);
            }
            A08();
        }
        r6.A04(002.A0R("pending_reel_seen_states_", str));
    }

    public final void A0J() {
        this.A00.A04(002.A0R("pending_reel_seen_states_", this.A02.A06));
    }

    public AnonymousClass2f9(1NH r1, UserSession userSession) {
        super(userSession);
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.3st, java.lang.Object] */
    public final void A0K() {
        A02();
        ? obj = new Object();
        obj.A00 = A06();
        this.A00.A05(002.A0R("pending_reel_seen_states_", this.A02.A06), obj);
    }

    public final void A0L(C230262pI r3) {
        if (!r3.A07()) {
            UserSession userSession = this.A02;
            0rL.A00(userSession).A02(r3.A03(userSession));
        }
    }
}
