package X;

import com.instagram.api.schemas.SubmittedSubPostManageType;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GxY  reason: case insensitive filesystem */
public final class C53990GxY extends C243963aQ {
    public static final 2WU A04 = G9t.A17(IJR.A00);
    public final UserSession A00;
    public final 1Xj A01;
    public final String A02;
    public final 2WX A03;

    public final C244523bK A0X(C244463bE r7) {
        0qQ.A0B(r7, 0);
        LRh lRh = new LRh(this.A00, C51967G9n.A09(r7));
        return C51965G9l.A0W(this.A03, IKP.A00, C51969G9p.A0f(r7, A04, C58410IrT.A00, new C74188PqU(29, (Object) r7, (Object) lRh, (Object) this)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d3, code lost:
        if (r10 != null) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r12, X.C53990GxY r13, X.LRh r14) {
        /*
            com.instagram.common.session.UserSession r8 = r13.A00
            r4 = 0
            X.0Tu r11 = X.DbS.A0J(r8, r4)
            r0 = 2342163288484421797(0x2081091a001320a5, double:4.065822678124723E-152)
            boolean r2 = X.182.A06(r11, r8, r0)
            if (r2 != 0) goto L_0x0026
            X.1Ng r7 = X.AnonymousClass1Nd.A00(r8)
            X.1Xj r2 = r13.A01
            java.lang.String r6 = r2.A2n()
            r5 = 1
            r3 = 0
            X.INn r2 = new X.INn
            r2.<init>(r6, r5, r3)
            r7.A00(r2)
        L_0x0026:
            X.1Xj r6 = r13.A01
            java.lang.String r2 = r6.A2n()
            java.lang.Long r7 = X.LRh.A00(r2)
            com.instagram.common.session.UserSession r2 = r14.A07
            X.0iw r3 = r14.A05
            X.0Aj r5 = X.C51975G9x.A0S(r3, r2)
            boolean r2 = r5.isSampled()
            if (r2 == 0) goto L_0x0050
            X.HOu r2 = X.C54689HOu.OPEN_CAROUSEL_APPROVE
            X.C51965G9l.A1C(r2, r5)
            X.DbW.A16(r5, r3)
            java.lang.String r3 = r14.A08
            java.lang.String r2 = "nav_chain"
            X.C51968G9o.A1I(r5, r7, r2, r3)
            r5.Cgf()
        L_0x0050:
            X.28D r5 = X.28D.A3k
            X.0sm r2 = X.0Yt.A0E()
            r3 = 0
            java.lang.String r5 = X.LRh.A01(r5, r14, r7, r3, r2)
            X.I0v r7 = new X.I0v
            r7.<init>(r8)
            java.lang.String r10 = r13.A02
            r8 = 7
            X.H50 r2 = new X.H50
            r2.<init>(r13, r8)
            r8 = 0
            if (r10 == 0) goto L_0x00d2
            java.lang.String r9 = "_"
            java.util.List r9 = X.DbV.A18(r10, r9)
            if (r9 == 0) goto L_0x00d2
            java.lang.Object r9 = X.00k.A0J(r9)
            java.lang.String r9 = (java.lang.String) r9
        L_0x0079:
            com.instagram.common.session.UserSession r10 = r7.A00
            boolean r0 = X.182.A06(r11, r10, r0)
            if (r0 == 0) goto L_0x00d6
            X.1NY r7 = X.AnonymousClass7TG.A0a(r10)
            java.lang.String r0 = "media/configure_to_accept_pending_media/"
            r7.A0A(r0)
            java.lang.String r0 = "parent_media_id"
            r7.A9m(r0, r9)
            java.lang.String r1 = r6.A2n()
            java.lang.String r0 = "media_id"
            r7.A9m(r0, r1)
            java.lang.String r1 = r6.A2n()
            r0 = 1673(0x689, float:2.344E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A9m(r0, r1)
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r6)
            if (r0 == 0) goto L_0x00af
            java.lang.String r8 = r0.getId()
        L_0x00af:
            java.lang.String r0 = "previous_submitter_id"
            r7.A9m(r0, r8)
            r1 = 617(0x269, float:8.65E-43)
            java.lang.String r0 = "camera_entry_point"
            r7.A0C(r0, r1)
            r0 = 1238(0x4d6, float:1.735E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A9m(r0, r5)
            java.lang.Class<X.GyW> r1 = X.C54047GyW.class
            java.lang.Class<X.Hug> r0 = X.C56213Hug.class
            X.1OC r1 = X.DbT.A0R(r3, r7, r1, r0, r4)
            r1.A00 = r2
        L_0x00ce:
            X.1ES.A03(r1)
            return
        L_0x00d2:
            r9 = r3
            if (r10 == 0) goto L_0x00d6
            goto L_0x0079
        L_0x00d6:
            com.instagram.common.session.UserSession r1 = r7.A00
            java.lang.String r0 = "open_carousel_review_page"
            X.5g0 r1 = X.C59730JVo.A00(r12, r1, r6, r0)
            X.KGt r0 = new X.KGt
            r0.<init>(r12, r6, r7, r9)
            r1.A00 = r0
            goto L_0x00ce
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53990GxY.A00(android.content.Context, X.GxY, X.LRh):void");
    }

    public static final void A04(C53990GxY gxY, LRh lRh) {
        List list;
        1Xj r4 = gxY.A01;
        Long A002 = LRh.A00(r4.A2n());
        UserSession userSession = lRh.A07;
        AnonymousClass0iw r1 = lRh.A05;
        0Aj A0S = C51975G9x.A0S(r1, userSession);
        if (A0S.isSampled()) {
            C51965G9l.A1C(C54689HOu.OPEN_CAROUSEL_DECLINE, A0S);
            DbW.A16(A0S, r1);
            C51968G9o.A1I(A0S, A002, "nav_chain", lRh.A08);
            A0S.Cgf();
        }
        I0v i0v = new I0v(gxY.A00);
        String str = gxY.A02;
        String A2n = r4.A2n();
        if (A2n != null) {
            list = AnonymousClass7TE.A1I(A2n);
        } else {
            list = null;
        }
        i0v.A01(SubmittedSubPostManageType.DELETE, new H50(gxY, 8), str, (String) null, list);
    }

    public C53990GxY(2WX r1, UserSession userSession, 1Xj r3, String str) {
        this.A03 = r1;
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = r3;
    }
}
