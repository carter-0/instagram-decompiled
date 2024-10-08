package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2fH  reason: invalid class name */
public final class AnonymousClass2fH extends 0px {
    public final 1NH A00;
    public final String A01;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.1NF] */
    public static AnonymousClass2fH A00(UserSession userSession) {
        Class<AnonymousClass2fH> cls = AnonymousClass2fH.class;
        0rJ A002 = 0rL.A00(userSession);
        AnonymousClass2fH r1 = (0px) A002.A04.get(cls);
        if (r1 != null) {
            return r1;
        }
        AnonymousClass2fH r12 = new AnonymousClass2fH(new 1NH(C60960kU.A00, new Object(), 1861410123), userSession);
        A002.A03(r12, cls);
        return r12;
    }

    public final /* bridge */ /* synthetic */ 1OC A0G(Object obj) {
        return C17033VFh.A00(this.A02, (C45360Cv2) obj);
    }

    public final Integer A0H() {
        return AnonymousClass05K.A01;
    }

    public final void A0I() {
        List<C45360Cv2> list;
        AnonymousClass47F r0 = (AnonymousClass47F) this.A00.A02(this.A01, true);
        if (!(r0 == null || (list = r0.A00) == null)) {
            for (C45360Cv2 cv2 : list) {
                A0D(cv2.A01, cv2);
            }
            A08();
        }
        A0J();
    }

    public final void A0J() {
        this.A00.A04(this.A01);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.47F, java.lang.Object] */
    public final void A0K() {
        1NH r3 = this.A00;
        String str = this.A01;
        ArrayList A05 = A05();
        ? obj = new Object();
        obj.A00 = A05;
        r3.A06(str, obj);
    }

    public AnonymousClass2fH(1NH r3, UserSession userSession) {
        super(userSession);
        this.A01 = 002.A0R("pending_reel_countdown_follow_requests_", userSession.A06);
        this.A00 = r3;
    }
}
