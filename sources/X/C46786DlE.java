package X;

import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.repository.MonetizationRepository;

/* renamed from: X.DlE  reason: case insensitive filesystem */
public final class C46786DlE extends 2YL {
    public JV7 A00 = new JV7();
    public String A01;
    public boolean A02;
    public final AnonymousClass2Fj A03 = new AnonymousClass2Fj();
    public final UserMonetizationProductType A04;
    public final 1a8 A05 = 1a8.A00();
    public final UserSession A06;
    public final MonetizationRepository A07;
    public final C249513ju A08;
    public final AnonymousClass0r6 A09;

    public static final void A00(C46786DlE dlE) {
        if (0qQ.A0K(dlE.A01, "not_eligible")) {
            1a8 r5 = dlE.A05;
            MonetizationRepository monetizationRepository = dlE.A07;
            UserMonetizationProductType userMonetizationProductType = dlE.A04;
            UserSession userSession = monetizationRepository.A07;
            0qQ.A0B(userSession, 0);
            1NY r2 = new 1NY(userSession, -2);
            r2.A05();
            r2.A0A("business/eligibility/get_product_violations_render_data/");
            r2.A9m("product_types", userMonetizationProductType.A00);
            1aU A002 = C69818Nsf.A00(DbU.A0S(r2, C47329Duw.class, C49746F4l.class));
            1NY r22 = new 1NY(userSession, -2);
            r22.A05();
            r22.A0A("business/eligibility/get_appeals_data/");
            r5.A02(1aU.A02(new OuU((0sL) new C59345JFx(dlE, 26), 7), A002, C69818Nsf.A00(DbU.A0S(r22, C43847CFn.class, D0V.class))), new M1T((Object) dlE, 10));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c6, code lost:
        throw X.AnonymousClass7TE.A0w(X.002.A0g("View eligibility ", r2, " is not supported"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01d5, code lost:
        r0 = r2.equals(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d9, code lost:
        if (r0 == false) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01db, code lost:
        r7 = 2131954153;
        r5 = 2131954151;
        r4 = 2131976277;
        r3 = 2131966713;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01eb, code lost:
        if (r2.equals("eligible") == false) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01ed, code lost:
        r0 = com.instagram.android.R.drawable.eligible_checkmark;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01f1, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0208, code lost:
        r10 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x020c, code lost:
        r0 = r1.A03;
        r8 = com.instagram.api.schemas.UserMonetizationProductType.BRANDED_CONTENT;
        r11 = java.lang.Integer.valueOf(r7);
        r1 = r1.A00;
        r15 = (java.util.List) r1.A00;
        r7 = new X.C47162Drd(r8, new X.ENB(r5, r4), r10, r11, java.lang.Integer.valueOf(r3), r1.A01, r1.A02, r15, false, !X.0qQ.A0K(r1.A01, "not_eligible"));
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r19 = this;
            r1 = r19
            java.lang.String r2 = r1.A01
            if (r2 != 0) goto L_0x0021
            X.2Fj r0 = r1.A03
            com.instagram.api.schemas.UserMonetizationProductType r5 = r1.A04
            r6 = 0
            r14 = 0
            r13 = 1
            r1 = -1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            X.0sn r12 = X.0sn.A00
            X.Drd r4 = new X.Drd
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x001d:
            r0.A0B(r4)
        L_0x0020:
            return
        L_0x0021:
            com.instagram.api.schemas.UserMonetizationProductType r0 = r1.A04
            int r3 = r0.ordinal()
            r0 = 10
            if (r3 == r0) goto L_0x0100
            r0 = 15
            if (r3 == r0) goto L_0x009c
            r0 = 3
            if (r3 == r0) goto L_0x01af
            r0 = 11
            if (r3 == r0) goto L_0x0153
            r0 = 9
            if (r3 != r0) goto L_0x0020
            java.lang.String r6 = "eligible"
            boolean r0 = r2.equals(r6)
            if (r0 == 0) goto L_0x0084
            r5 = 2131976279(0x7f136057, float:1.9589674E38)
            r7 = 2131976278(0x7f136056, float:1.9589672E38)
            r4 = 2131976277(0x7f136055, float:1.958967E38)
            r3 = 2131966713(0x7f133af9, float:1.9570272E38)
            r2 = 2131231727(0x7f0803ef, float:1.8079543E38)
        L_0x0051:
            X.2Fj r0 = r1.A03
            com.instagram.api.schemas.UserMonetizationProductType r9 = com.instagram.api.schemas.UserMonetizationProductType.FAN_CLUB_CREATOR
            r17 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            X.ENC r5 = new X.ENC
            r5.<init>(r7, r4)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            java.lang.String r2 = r1.A01
            boolean r18 = X.0qQ.A0K(r2, r6)
        L_0x006e:
            X.JV7 r1 = r1.A00
            java.lang.Object r3 = r1.A00
            java.util.List r3 = (java.util.List) r3
            java.lang.String r2 = r1.A01
            java.lang.String r1 = r1.A02
            X.Drd r4 = new X.Drd
            r8 = r4
            r10 = r5
            r14 = r2
            r15 = r1
            r16 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x001d
        L_0x0084:
            java.lang.String r0 = "not_eligible"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0239
            r5 = 2131976336(0x7f136090, float:1.958979E38)
            r7 = 2131976335(0x7f13608f, float:1.9589788E38)
            r4 = 2131966721(0x7f133b01, float:1.9570288E38)
            r3 = 2131966719(0x7f133aff, float:1.9570284E38)
            r2 = 2131237821(0x7f081bbd, float:1.8091903E38)
            goto L_0x0051
        L_0x009c:
            int r3 = r2.hashCode()
            r0 = -1708376637(0xffffffff9a2c3dc3, float:-3.5618657E-23)
            java.lang.String r7 = "eligible"
            if (r3 == r0) goto L_0x00de
            r0 = -688744127(0xffffffffd6f29941, float:-1.33370017E14)
            if (r3 == r0) goto L_0x00db
            r0 = 100743639(0x60139d7, float:2.4304697E-35)
            if (r3 != r0) goto L_0x0248
            boolean r0 = r2.equals(r7)
            if (r0 == 0) goto L_0x0248
            r5 = 2131976279(0x7f136057, float:1.9589674E38)
            r8 = 2131976278(0x7f136056, float:1.9589672E38)
            r6 = 2131976277(0x7f136055, float:1.958967E38)
            r4 = 2131966713(0x7f133af9, float:1.9570272E38)
            r3 = 2131231727(0x7f0803ef, float:1.8079543E38)
        L_0x00c6:
            X.2Fj r0 = r1.A03
            com.instagram.api.schemas.UserMonetizationProductType r9 = com.instagram.api.schemas.UserMonetizationProductType.USER_PAY
            r17 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            X.ENA r5 = new X.ENA
            r5.<init>(r8, r6)
            goto L_0x018d
        L_0x00db:
            java.lang.String r0 = "eligible_pending_opt_in"
            goto L_0x00e0
        L_0x00de:
            java.lang.String r0 = "not_eligible"
        L_0x00e0:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0248
            boolean r0 = r1.A02
            r5 = 2131976336(0x7f136090, float:1.958979E38)
            r8 = 2131976335(0x7f13608f, float:1.9589788E38)
            if (r0 == 0) goto L_0x00f6
            r5 = 2131976344(0x7f136098, float:1.9589806E38)
            r8 = 2131976343(0x7f136097, float:1.9589804E38)
        L_0x00f6:
            r6 = 2131966721(0x7f133b01, float:1.9570288E38)
            r4 = 2131966719(0x7f133aff, float:1.9570284E38)
            r3 = 2131237821(0x7f081bbd, float:1.8091903E38)
            goto L_0x00c6
        L_0x0100:
            int r3 = r2.hashCode()
            r0 = -1708376637(0xffffffff9a2c3dc3, float:-3.5618657E-23)
            java.lang.String r7 = "eligible"
            if (r3 == r0) goto L_0x013e
            r0 = -688744127(0xffffffffd6f29941, float:-1.33370017E14)
            if (r3 == r0) goto L_0x013b
            r0 = 100743639(0x60139d7, float:2.4304697E-35)
            if (r3 != r0) goto L_0x0262
            boolean r0 = r2.equals(r7)
            if (r0 == 0) goto L_0x0262
            r5 = 2131966715(0x7f133afb, float:1.9570276E38)
            r6 = 2131966720(0x7f133b00, float:1.9570286E38)
            r4 = 2131966713(0x7f133af9, float:1.9570272E38)
            r3 = 2131231727(0x7f0803ef, float:1.8079543E38)
        L_0x0127:
            X.2Fj r0 = r1.A03
            com.instagram.api.schemas.UserMonetizationProductType r9 = com.instagram.api.schemas.UserMonetizationProductType.IGTV_REVSHARE
            r17 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            X.EN9 r5 = new X.EN9
            r5.<init>(r6)
            goto L_0x018d
        L_0x013b:
            java.lang.String r0 = "eligible_pending_opt_in"
            goto L_0x0140
        L_0x013e:
            java.lang.String r0 = "not_eligible"
        L_0x0140:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0262
            r5 = 2131966717(0x7f133afd, float:1.957028E38)
            r6 = 2131966716(0x7f133afc, float:1.9570278E38)
            r4 = 2131966719(0x7f133aff, float:1.9570284E38)
            r3 = 2131237821(0x7f081bbd, float:1.8091903E38)
            goto L_0x0127
        L_0x0153:
            int r3 = r2.hashCode()
            r0 = -1708376637(0xffffffff9a2c3dc3, float:-3.5618657E-23)
            java.lang.String r7 = "eligible"
            if (r3 == r0) goto L_0x019a
            r0 = -688744127(0xffffffffd6f29941, float:-1.33370017E14)
            if (r3 == r0) goto L_0x0197
            r0 = 100743639(0x60139d7, float:2.4304697E-35)
            if (r3 != r0) goto L_0x0255
            boolean r0 = r2.equals(r7)
            if (r0 == 0) goto L_0x0255
            r5 = 2131964320(0x7f1331a0, float:1.9565418E38)
            r6 = 2131964324(0x7f1331a4, float:1.9565426E38)
            r4 = 2131966713(0x7f133af9, float:1.9570272E38)
            r3 = 2131231727(0x7f0803ef, float:1.8079543E38)
        L_0x017a:
            X.2Fj r0 = r1.A03
            com.instagram.api.schemas.UserMonetizationProductType r9 = com.instagram.api.schemas.UserMonetizationProductType.INCENTIVE_PLATFORM
            r17 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            X.END r5 = new X.END
            r5.<init>(r6)
        L_0x018d:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r4)
            boolean r18 = r2.equals(r7)
            goto L_0x006e
        L_0x0197:
            java.lang.String r0 = "eligible_pending_opt_in"
            goto L_0x019c
        L_0x019a:
            java.lang.String r0 = "not_eligible"
        L_0x019c:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0255
            r5 = 2131964323(0x7f1331a3, float:1.9565424E38)
            r6 = 2131964322(0x7f1331a2, float:1.9565422E38)
            r4 = 2131966719(0x7f133aff, float:1.9570284E38)
            r3 = 2131237821(0x7f081bbd, float:1.8091903E38)
            goto L_0x017a
        L_0x01af:
            int r0 = r2.hashCode()
            java.lang.String r8 = "eligible"
            java.lang.String r6 = "not_eligible"
            switch(r0) {
                case -1708376637: goto L_0x01f3;
                case -688744127: goto L_0x01d3;
                case 100743639: goto L_0x01ce;
                case 510979923: goto L_0x01c7;
                default: goto L_0x01ba;
            }
        L_0x01ba:
            java.lang.String r1 = "View eligibility "
            java.lang.String r0 = " is not supported"
            java.lang.String r0 = X.002.A0g(r1, r2, r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x01c7:
            r0 = 255(0xff, float:3.57E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x01d5
        L_0x01ce:
            boolean r0 = r2.equals(r8)
            goto L_0x01d9
        L_0x01d3:
            java.lang.String r0 = "eligible_pending_opt_in"
        L_0x01d5:
            boolean r0 = r2.equals(r0)
        L_0x01d9:
            if (r0 == 0) goto L_0x01ba
            r7 = 2131954153(0x7f1309e9, float:1.9544797E38)
            r5 = 2131954151(0x7f1309e7, float:1.9544793E38)
            r4 = 2131976277(0x7f136055, float:1.958967E38)
            r3 = 2131966713(0x7f133af9, float:1.9570272E38)
            boolean r0 = r2.equals(r8)
            if (r0 == 0) goto L_0x01f1
            r0 = 2131231727(0x7f0803ef, float:1.8079543E38)
            goto L_0x0208
        L_0x01f1:
            r10 = 0
            goto L_0x020c
        L_0x01f3:
            boolean r0 = r2.equals(r6)
            if (r0 == 0) goto L_0x01ba
            r7 = 2131954155(0x7f1309eb, float:1.9544801E38)
            r5 = 2131954154(0x7f1309ea, float:1.95448E38)
            r4 = 2131966721(0x7f133b01, float:1.9570288E38)
            r3 = 2131966719(0x7f133aff, float:1.9570284E38)
            r0 = 2131237821(0x7f081bbd, float:1.8091903E38)
        L_0x0208:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
        L_0x020c:
            X.2Fj r0 = r1.A03
            com.instagram.api.schemas.UserMonetizationProductType r8 = com.instagram.api.schemas.UserMonetizationProductType.BRANDED_CONTENT
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            X.ENB r9 = new X.ENB
            r9.<init>(r5, r4)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            java.lang.String r2 = r1.A01
            boolean r2 = X.0qQ.A0K(r2, r6)
            r17 = r2 ^ 1
            X.JV7 r1 = r1.A00
            java.lang.Object r15 = r1.A00
            java.util.List r15 = (java.util.List) r15
            java.lang.String r13 = r1.A01
            java.lang.String r14 = r1.A02
            r16 = 0
            X.Drd r4 = new X.Drd
            r7 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x001d
        L_0x0239:
            java.lang.String r2 = "View eligibility "
            java.lang.String r1 = r1.A01
            java.lang.String r0 = " is not supported"
            java.lang.String r0 = X.002.A0g(r2, r1, r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0248:
            java.lang.String r1 = "View eligibility "
            java.lang.String r0 = " is not supported"
            java.lang.String r0 = X.002.A0g(r1, r2, r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0255:
            java.lang.String r1 = "View eligibility "
            java.lang.String r0 = " is not supported"
            java.lang.String r0 = X.002.A0g(r1, r2, r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0262:
            java.lang.String r1 = "View eligibility "
            java.lang.String r0 = " is not supported"
            java.lang.String r0 = X.002.A0g(r1, r2, r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46786DlE.A01():void");
    }

    public C46786DlE(UserMonetizationProductType userMonetizationProductType, UserSession userSession, MonetizationRepository monetizationRepository) {
        AnonymousClass7TG.A1U(userSession, userMonetizationProductType, monetizationRepository);
        this.A06 = userSession;
        this.A04 = userMonetizationProductType;
        this.A07 = monetizationRepository;
        1HR r0 = new 1HR(0);
        this.A08 = r0;
        this.A09 = 0u9.A04(r0);
    }
}
