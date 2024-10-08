package X;

import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.DkM  reason: case insensitive filesystem */
public final class C46733DkM extends C361478gI implements CallerContextable {
    public static final String __redex_internal_original_name = "MultipleLinksReorderingViewModel";
    public Integer A00;
    public final UserSession A01;
    public final 0V2 A02;
    public final 05G A03;

    private final boolean A00(User user) {
        List Afp;
        C253443qn r0;
        if (!AnonymousClass7TG.A1X(user.A03.CS6())) {
            return false;
        }
        UserSession userSession = this.A01;
        0qQ.A0B(userSession, 0);
        if (!182.A06(0Tu.A06, userSession, 36322821890517458L) || (Afp = user.A03.Afp()) == null || (r0 = (C253443qn) 00k.A0J(Afp)) == null || !r0.CZA()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0063, code lost:
        r1 = r0.A06;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C46733DkM(android.app.Application r11, com.instagram.common.session.UserSession r12) {
        /*
            r10 = this;
            com.instagram.user.model.User r4 = X.DbT.A0j(r12)
            r10.<init>(r11)
            r10.A01 = r12
            X.4Cl r0 = r4.A03
            java.util.List r2 = r0.Afp()
            boolean r1 = r10.A00(r4)
            r0 = 1
            r5 = 0
            if (r1 == 0) goto L_0x001d
            if (r2 == 0) goto L_0x00d2
            java.util.List r2 = X.00k.A0c(r2, r0)
        L_0x001d:
            r9 = 0
            if (r2 == 0) goto L_0x00d5
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r2.iterator()
        L_0x0028:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00d5
            java.lang.Object r7 = r8.next()
            X.3qn r7 = (X.C253443qn) r7
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r1 = r7.BMt()
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r0 = com.instagram.api.schemas.IgUserBioLinkTypeEnum.FACEBOOK
            if (r1 != r0) goto L_0x0075
            java.lang.String r6 = r7.BMn()
            android.app.Application r0 = r10.A0D()
            android.content.Context r1 = r0.getApplicationContext()
            r0 = 2131970023(0x7f1347e7, float:1.9576985E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r1, r0)
            com.instagram.common.session.UserSession r0 = r10.A01
            X.2Ly r2 = X.2Lv.A00(r0)
            java.lang.Class<X.DkM> r0 = X.C46733DkM.class
            com.facebook.common.callercontext.CallerContext r1 = com.facebook.common.callercontext.CallerContext.A00(r0)
            java.lang.String r0 = "ig_android_linking_cache_igxfb_fb_profile_link"
            fxcache.model.FxCalAccount r0 = r2.A01(r1, r0)
            if (r0 == 0) goto L_0x0067
            java.lang.String r1 = r0.A06
            if (r1 != 0) goto L_0x0069
        L_0x0067:
            java.lang.String r1 = "'"
        L_0x0069:
            r0 = 2131238293(0x7f081d95, float:1.809286E38)
        L_0x006c:
            X.EPF r2 = new X.EPF
            r2.<init>(r6, r3, r1, r0)
        L_0x0071:
            r5.add(r2)
            goto L_0x0028
        L_0x0075:
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r1 = r7.BMt()
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r0 = com.instagram.api.schemas.IgUserBioLinkTypeEnum.FACEBOOK_PAGE
            java.lang.String r3 = ""
            if (r1 != r0) goto L_0x00b0
            X.4Cl r0 = r4.A03
            X.3rB r2 = r0.BMx()
            java.lang.String r6 = r7.BMn()
            android.app.Application r0 = r10.A0D()
            android.content.Context r1 = r0.getApplicationContext()
            r0 = 2131970022(0x7f1347e6, float:1.9576983E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r1, r0)
            if (r2 == 0) goto L_0x00a7
            X.5Bm r0 = r2.BMy()
            if (r0 == 0) goto L_0x00a7
            java.lang.String r0 = r0.getName()
            if (r0 == 0) goto L_0x00a7
            r3 = r0
        L_0x00a7:
            r0 = 2131238293(0x7f081d95, float:1.809286E38)
        L_0x00aa:
            X.EPF r2 = new X.EPF
            r2.<init>(r6, r1, r3, r0)
            goto L_0x0071
        L_0x00b0:
            java.lang.String r0 = r7.getTitle()
            int r0 = r0.length()
            java.lang.String r6 = r7.BMn()
            if (r0 != 0) goto L_0x00c6
            java.lang.String r1 = X.C49073Eor.A00(r7)
            r0 = 2131238496(0x7f081e60, float:1.8093272E38)
            goto L_0x00aa
        L_0x00c6:
            java.lang.String r3 = r7.getTitle()
            java.lang.String r1 = X.C49073Eor.A00(r7)
            r0 = 2131238496(0x7f081e60, float:1.8093272E38)
            goto L_0x006c
        L_0x00d2:
            r2 = r5
            goto L_0x001d
        L_0x00d5:
            java.lang.Integer r0 = r10.A00
            if (r0 != 0) goto L_0x00e5
            if (r5 == 0) goto L_0x00df
            int r9 = r5.hashCode()
        L_0x00df:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r10.A00 = r0
        L_0x00e5:
            if (r5 != 0) goto L_0x00e9
            X.0sn r5 = X.0sn.A00
        L_0x00e9:
            boolean r0 = r10.A00(r4)
            r3 = 0
            if (r0 == 0) goto L_0x011c
            X.4Cl r0 = r4.A03
            java.util.List r0 = r0.Afp()
            if (r0 == 0) goto L_0x011c
            java.lang.Object r1 = X.00k.A0J(r0)
            X.3qn r1 = (X.C253443qn) r1
            if (r1 == 0) goto L_0x011c
            java.lang.String r0 = r1.getTitle()
            int r0 = r0.length()
            java.lang.String r4 = r1.BMn()
            if (r0 != 0) goto L_0x0132
            java.lang.String r2 = X.C49073Eor.A00(r1)
            r1 = 2131238496(0x7f081e60, float:1.8093272E38)
            java.lang.String r0 = ""
            X.EPF r3 = new X.EPF
            r3.<init>(r4, r2, r0, r1)
        L_0x011c:
            r2 = 0
            r1 = 0
            X.EzG r0 = new X.EzG
            r0.<init>(r3, r5, r2, r1)
            X.02z r0 = X.DbS.A10(r0)
            r10.A03 = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.05D r0 = X.10D.A01(r0, r1, r1)
            r10.A02 = r0
            return
        L_0x0132:
            java.lang.String r2 = r1.getTitle()
            java.lang.String r1 = X.C49073Eor.A00(r1)
            r0 = 2131238496(0x7f081e60, float:1.8093272E38)
            X.EPF r3 = new X.EPF
            r3.<init>(r4, r2, r1, r0)
            goto L_0x011c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46733DkM.<init>(android.app.Application, com.instagram.common.session.UserSession):void");
    }
}
