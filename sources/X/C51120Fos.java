package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.meta.foa.accountswitcher.UserAccountInfo;
import com.meta.foa.session.FoaUserSession;
import fxcache.model.FxCalAccountWithSwitcherInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Fos  reason: case insensitive filesystem */
public final class C51120Fos implements C51892G6h {
    public 05G A00;
    public final Context A01;
    public final UserSession A02;

    public static final ArrayList A00(1wM r7, C51120Fos fos) {
        CallerContext callerContext = C46399DeM.A00;
        List A022 = r7.A02(callerContext, "FACEBOOK");
        UserSession userSession = fos.A02;
        ArrayList A012 = C46399DeM.A01(userSession, A022);
        ArrayList A0p = AnonymousClass7TF.A0p(A012);
        Iterator it = A012.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            0qQ.A0A(map);
            A0p.add(C49257Es0.A00(map));
        }
        List<FxCalAccountWithSwitcherInfo> A023 = r7.A02(callerContext, "INSTAGRAM");
        ArrayList A0p2 = AnonymousClass7TF.A0p(A023);
        for (FxCalAccountWithSwitcherInfo fxCalAccountWithSwitcherInfo : A023) {
            AnonymousClass7TF.A1I(fxCalAccountWithSwitcherInfo.A0B, fxCalAccountWithSwitcherInfo.A07, A0p2);
        }
        Map A08 = 0Yt.A08(A0p2);
        ArrayList A002 = FRS.A01.A00(fos.A01, userSession);
        ArrayList A0p3 = AnonymousClass7TF.A0p(A002);
        Iterator it2 = A002.iterator();
        while (it2.hasNext()) {
            A0p3.add(C49257Es0.A00((Map) it2.next()));
        }
        ArrayList<UserAccountInfo> A1C = AnonymousClass7TE.A1C();
        for (Object next : A0p3) {
            UserAccountInfo userAccountInfo = (UserAccountInfo) next;
            if (0qQ.A0K(userAccountInfo.A09, "CURRENT") || A08.containsKey(userAccountInfo.A0A)) {
                A1C.add(next);
            }
        }
        ArrayList A0p4 = AnonymousClass7TF.A0p(A1C);
        for (UserAccountInfo userAccountInfo2 : A1C) {
            userAccountInfo2.A00 = DbT.A11(userAccountInfo2.A0A, A08);
            A0p4.add(userAccountInfo2);
        }
        return 00k.A0S(A0p, A0p4);
    }

    public static final List A01(C51120Fos fos, List list) {
        ArrayList A002 = C55024Hav.A00(fos.A02.A06);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (00k.A0u(A002, ((UserAccountInfo) next).A00)) {
                A1C.add(next);
            }
        }
        return 00k.A0g(A1C, new C51566FwC((Object) A002, 14));
    }

    public final void E3m() {
        1wM A002 = 1wB.A00(this.A02);
        if (A002.A0C()) {
            A002.A0K(C46399DeM.A00, new C51124Fow(2, A002, this), "fx_company_identity_switcher_linking_cache", true, false);
            return;
        }
        ArrayList A003 = A00(A002, this);
        this.A00.Epw(new HHH(A003, A01(this, A003), 0));
    }

    public C51120Fos(Context context, FoaUserSession foaUserSession) {
        this.A01 = context;
        this.A02 = C56316HwT.A00(foaUserSession);
        0sn r2 = 0sn.A00;
        this.A00 = DbS.A10(new HHH(r2, r2, 0));
    }
}
