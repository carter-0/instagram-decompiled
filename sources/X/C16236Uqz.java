package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Uqz  reason: case insensitive filesystem */
public final class C16236Uqz extends VP2 {
    public final Context A00;
    public final C18782W1i A01;
    public final C18021Vjx A02;
    public final AnonymousClass326 A03;
    public final X9C A04;
    public final UserSession A05;

    public static final void A00(1Xj r10, C16236Uqz uqz) {
        X9C x9c = uqz.A04;
        W2j A002 = W2j.A00(x9c);
        C17501VYe vYe = x9c.Bz5().A03;
        0qQ.A07(vYe);
        A002.A03 = new C17501VYe(FeaturedProductPermissionStatus.DECLINED, (FeaturedProductPermissionStatus) null, C16605Uxz.LOADED, vYe.A03);
        C18570VuM vuM = new C18570VuM(x9c.Bz5().A04);
        UserSession userSession = uqz.A05;
        Product product = x9c.Bz5().A09;
        List A012 = x9c.Bz5().A04.A01(userSession, x9c.Bz5().A09);
        ArrayList A15 = DbV.A15(A012);
        for (Object next : A012) {
            C18001Vjd vjd = (C18001Vjd) next;
            if (!(vjd instanceof C16272UrZ) || !0qQ.A0K(((C16272UrZ) vjd).A01.getId(), r10.getId())) {
                A15.add(next);
            }
        }
        vuM.A00(userSession, product, A15);
        A002.A04 = new W1L(vuM);
        C17458VWl vWl = x9c.Bz5().A05;
        0qQ.A07(vWl);
        Map map = vWl.A00;
        0qQ.A0C(map, AnonymousClass000.A00(1644));
        Map A032 = 0u4.A03(map);
        Map map2 = vWl.A02;
        Map map3 = vWl.A01;
        Iterator A0u = AnonymousClass7TF.A0u(A032);
        while (A0u.hasNext()) {
            AnonymousClass2rW r0 = (AnonymousClass2rW) C51971G9r.A0p(A0u);
            r0.A0C(r10);
            r0.A06();
        }
        A002.A05 = new C17458VWl(A032, map2, map3);
        C18588Vuf.A00(x9c, A002);
    }

    public static final void A01(C68282N8v n8v, C16236Uqz uqz, String str, int i, boolean z) {
        C16236Uqz uqz2 = uqz;
        X9C x9c = uqz2.A04;
        W2j A002 = W2j.A00(x9c);
        C17501VYe vYe = x9c.Bz5().A03;
        0qQ.A07(vYe);
        A002.A03 = new C17501VYe(vYe.A01, FeaturedProductPermissionStatus.APPROVED, C16605Uxz.LOADING, vYe.A03);
        C18588Vuf.A00(x9c, A002);
        C18021Vjx vjx = uqz2.A02;
        C68282N8v n8v2 = n8v;
        String str2 = str;
        boolean z2 = z;
        C58771IxI ixI = new C58771IxI(uqz2, n8v2, str2, 11, z2);
        MJC mjc = new MJC(uqz2, n8v, str2, 1, z2);
        AnonymousClass4DH r2 = vjx.A00;
        UserSession userSession = vjx.A01;
        String valueOf = String.valueOf(n8v2.A02);
        0qQ.A0B(valueOf, 2);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("commerce/community/featured_products/permission_update_age_decision/");
        A0a.A9m("permission_id", valueOf);
        A0a.A0C(AnonymousClass000.A00(2588), i);
        A0a.A0H("overage_decision", z2);
        1OC A0S = DbU.A0S(A0a, UXO.class, C18258VoP.class);
        A0S.A00 = new EDU(mjc, userSession, ixI, valueOf, 1);
        r2.schedule(A0S);
    }

    public static final void A02(C16236Uqz uqz) {
        X9C x9c = uqz.A04;
        W2j A002 = W2j.A00(x9c);
        C17501VYe vYe = x9c.Bz5().A03;
        0qQ.A07(vYe);
        A002.A03 = new C17501VYe(FeaturedProductPermissionStatus.APPROVED, (FeaturedProductPermissionStatus) null, C16605Uxz.LOADED, vYe.A03);
        C18588Vuf.A00(x9c, A002);
    }

    public static final void A03(C16236Uqz uqz) {
        X9C x9c = uqz.A04;
        W2j A002 = W2j.A00(x9c);
        C17501VYe vYe = x9c.Bz5().A03;
        0qQ.A07(vYe);
        A002.A03 = new C17501VYe(vYe.A01, (FeaturedProductPermissionStatus) null, C16605Uxz.FAILED, vYe.A03);
        C18588Vuf.A00(x9c, A002);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16236Uqz(Context context, UserSession userSession, C18782W1i w1i, C18021Vjx vjx, AnonymousClass326 r6, X9C x9c, C18020Vjw vjw) {
        super(vjw);
        C51974G9v.A1M(userSession, vjw, vjx);
        0qQ.A0B(w1i, 5);
        this.A00 = context;
        this.A05 = userSession;
        this.A02 = vjx;
        this.A01 = w1i;
        this.A04 = x9c;
        this.A03 = r6;
    }
}
