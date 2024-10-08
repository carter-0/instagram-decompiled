package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2fD  reason: invalid class name and case insensitive filesystem */
public final class C225952fD extends 0px {
    public final 1NH A00;
    public final String A01;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.1NF] */
    public static C225952fD A00(UserSession userSession) {
        Class<C225952fD> cls = C225952fD.class;
        0rJ A002 = 0rL.A00(userSession);
        C225952fD r1 = (0px) A002.A04.get(cls);
        if (r1 != null) {
            return r1;
        }
        C225952fD r12 = new C225952fD(new 1NH(C60960kU.A00, new Object(), 607242469), userSession);
        A002.A03(r12, cls);
        return r12;
    }

    public static String A01(C45418Cvy cvy) {
        StringBuilder sb = new StringBuilder();
        sb.append(cvy.A03);
        sb.append("_");
        sb.append(cvy.A04);
        sb.append("_");
        sb.append(cvy.A01);
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ 1OC A0G(Object obj) {
        return C44997Coa.A00(this.A02, (C45418Cvy) obj);
    }

    public final Integer A0H() {
        return AnonymousClass05K.A01;
    }

    public final void A0I() {
        List<C45418Cvy> list;
        AnonymousClass46T r0 = (AnonymousClass46T) this.A00.A02(this.A01, true);
        if (!(r0 == null || (list = r0.A00) == null)) {
            for (C45418Cvy cvy : list) {
                A0D(A01(cvy), cvy);
            }
            A08();
        }
        A0J();
    }

    public final void A0J() {
        this.A00.A04(this.A01);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.46T, java.lang.Object] */
    public final void A0K() {
        1NH r3 = this.A00;
        String str = this.A01;
        ArrayList A05 = A05();
        ? obj = new Object();
        obj.A00 = A05;
        r3.A06(str, obj);
    }

    public C225952fD(1NH r3, UserSession userSession) {
        super(userSession);
        this.A01 = 002.A0R("pending_reel_quiz_responses_", userSession.A06);
        this.A00 = r3;
    }
}
