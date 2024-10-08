package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2fF  reason: invalid class name and case insensitive filesystem */
public final class C225972fF extends 0px {
    public final 1NH A00;
    public final String A01;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.2fG, java.lang.Object, X.1NF] */
    public static C225972fF A00(UserSession userSession) {
        Class<C225972fF> cls = C225972fF.class;
        0rJ A002 = 0rL.A00(userSession);
        C225972fF r1 = (0px) A002.A04.get(cls);
        if (r1 != null) {
            return r1;
        }
        Context context = C60960kU.A00;
        ? obj = new Object();
        obj.A00 = userSession;
        C225972fF r12 = new C225972fF(new 1NH(context, obj, 528374993), userSession);
        A002.A03(r12, cls);
        return r12;
    }

    public final /* bridge */ /* synthetic */ 1OC A0G(Object obj) {
        return C45002Cof.A00(this.A02, (C45419Cvz) obj);
    }

    public final Integer A0H() {
        return AnonymousClass05K.A01;
    }

    public final void A0I() {
        List<C45419Cvz> list;
        AnonymousClass47E r0 = (AnonymousClass47E) this.A00.A02(this.A01, true);
        if (!(r0 == null || (list = r0.A00) == null)) {
            for (C45419Cvz cvz : list) {
                String str = cvz.A05;
                str.getClass();
                A0D(str, cvz);
            }
            A08();
        }
        A0J();
    }

    public final void A0J() {
        this.A00.A04(this.A01);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.47E, java.lang.Object] */
    public final void A0K() {
        1NH r3 = this.A00;
        String str = this.A01;
        ArrayList A05 = A05();
        ? obj = new Object();
        obj.A00 = A05;
        r3.A06(str, obj);
    }

    public final C45419Cvz A0L(C19472WaK waK) {
        String str = waK.A00.A08;
        if (str == null) {
            str = "";
        }
        str.getClass();
        return (C45419Cvz) A03(str);
    }

    public C225972fF(1NH r3, UserSession userSession) {
        super(userSession);
        this.A01 = 002.A0R("pending_reel_slider_votes_", userSession.A06);
        this.A00 = r3;
    }
}
