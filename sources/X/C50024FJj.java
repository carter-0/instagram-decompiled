package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FJj  reason: case insensitive filesystem */
public final class C50024FJj implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C50024FJj(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A02 = obj3;
        this.A04 = obj2;
        this.A01 = obj;
        this.A03 = obj4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0032, code lost:
        r0.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02ee, code lost:
        X.C299275ur.A00(r3, X.DbT.A0V(r1, r0), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02f5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r16, int r17) {
        /*
            r15 = this;
            int r1 = r15.A00
            r0 = r16
            r5 = r17
            switch(r1) {
                case 0: goto L_0x02db;
                case 1: goto L_0x02db;
                case 2: goto L_0x02c7;
                case 3: goto L_0x02a2;
                case 4: goto L_0x028a;
                case 5: goto L_0x0250;
                case 6: goto L_0x020b;
                case 7: goto L_0x01e8;
                case 8: goto L_0x0084;
                case 9: goto L_0x01af;
                case 10: goto L_0x017a;
                case 11: goto L_0x0009;
                case 12: goto L_0x005d;
                case 13: goto L_0x0009;
                case 14: goto L_0x013f;
                case 15: goto L_0x011d;
                case 16: goto L_0x0103;
                case 17: goto L_0x00d0;
                case 18: goto L_0x00a4;
                case 19: goto L_0x0036;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r1 = r15.A04
            java.lang.String r5 = X.DbS.A0q(r1)
            java.lang.Object r1 = r15.A02
            X.1Xj r1 = (X.1Xj) r1
            r1.getId()
            X.0qQ.A0A(r0)
            java.lang.Object r2 = r15.A01
            android.app.Activity r2 = (android.app.Activity) r2
            X.DbS.A1X(r2)
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            java.lang.Object r3 = r15.A03
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            X.FBp r1 = X.DbU.A0d()
            java.lang.String r6 = "view_self_opal_button"
            r4 = 0
            r7 = 0
            r8 = r7
            r1.A04(r2, r3, r4, r5, r6, r7, r8)
        L_0x0032:
            r0.dismiss()
        L_0x0035:
            return
        L_0x0036:
            java.lang.Object r4 = r15.A03
            X.0wc r4 = (X.0wc) r4
            java.lang.Object r1 = r15.A04
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.String r3 = r1.A06
            java.lang.Object r1 = r15.A02
            X.1Xj r1 = (X.1Xj) r1
            java.lang.String r2 = r1.getId()
            if (r2 == 0) goto L_0x02f6
            r1 = 0
            X.0qQ.A0B(r4, r1)
            java.lang.String r1 = "cancel_click"
            X.FEM.A00(r4, r3, r2, r1)
            java.lang.Object r1 = r15.A01
            android.content.DialogInterface$OnClickListener r1 = (android.content.DialogInterface.OnClickListener) r1
            if (r1 == 0) goto L_0x0035
            r1.onClick(r0, r5)
            return
        L_0x005d:
            X.FBp r2 = X.DbU.A0d()
            java.lang.Object r1 = r15.A03
            java.lang.String r6 = X.DbS.A0q(r1)
            java.lang.Object r1 = r15.A02
            X.1Xj r1 = (X.1Xj) r1
            r1.getId()
            java.lang.Object r3 = r15.A01
            android.app.Activity r3 = (android.app.Activity) r3
            X.DbS.A1X(r3)
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            java.lang.Object r4 = r15.A04
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.String r7 = "view_user_opal_button"
            r5 = 0
            r8 = 0
            r9 = r8
            r2.A04(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0032
        L_0x0084:
            java.lang.Object r3 = r15.A01
            X.EUm r3 = (X.C48068EUm) r3
            java.lang.Object r1 = r15.A03
            X.0aP r1 = (X.AnonymousClass0aP) r1
            r3.A00(r1)
            r0.dismiss()
            java.lang.Object r2 = r15.A02
            X.G8H r2 = (X.G8H) r2
            if (r2 == 0) goto L_0x0035
            java.lang.Object r1 = r15.A04
            X.F2t r1 = (X.C49708F2t) r1
            X.EMO r3 = (X.EMO) r3
            int r0 = r3.A00
            switch(r0) {
                case 4: goto L_0x0313;
                case 5: goto L_0x030f;
                case 6: goto L_0x030b;
                case 7: goto L_0x0307;
                case 8: goto L_0x0303;
                case 9: goto L_0x02ff;
                case 10: goto L_0x00a3;
                case 11: goto L_0x00a3;
                case 12: goto L_0x02fb;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            return
        L_0x00a4:
            java.lang.Object r1 = r15.A01
            android.content.DialogInterface$OnClickListener r1 = (android.content.DialogInterface.OnClickListener) r1
            if (r1 == 0) goto L_0x00ad
            r1.onClick(r0, r5)
        L_0x00ad:
            java.lang.Object r3 = r15.A03
            X.0wc r3 = (X.0wc) r3
            java.lang.Object r0 = r15.A04
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            java.lang.String r2 = r0.A06
            java.lang.Object r0 = r15.A02
            X.1Xj r0 = (X.1Xj) r0
            java.lang.String r1 = r0.getId()
            if (r1 == 0) goto L_0x00cb
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.String r0 = "cancel_click"
            X.FEM.A00(r3, r2, r1, r0)
            return
        L_0x00cb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00d0:
            java.lang.Object r1 = r15.A03
            X.FYh r1 = (X.C50327FYh) r1
            java.lang.Object r2 = r15.A01
            com.instagram.api.schemas.BonusPromoDialogType r2 = (com.instagram.api.schemas.BonusPromoDialogType) r2
            com.instagram.api.schemas.BonusPromoDialogType r0 = com.instagram.api.schemas.BonusPromoDialogType.SELF_PROFILE_REELS
            if (r2 != r0) goto L_0x0100
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
        L_0x00de:
            r5 = 0
            r1.A00(r0, r5, r5, r5)
            java.lang.Object r3 = r15.A04
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r0 = r15.A02
            X.DrT r0 = (X.C47152DrT) r0
            java.lang.String r4 = r0.A01
            X.12T r1 = X.AnonymousClass12T.A00
            r0 = 891600198(0x3524bd46, float:6.137019E-7)
            X.19S r0 = X.DbY.A0r(r1, r0)
            r6 = 47
            X.MGk r1 = new X.MGk
            r1.<init>(r2, r3, r4, r5, r6)
            X.AnonymousClass7TE.A1Z(r1, r0)
            return
        L_0x0100:
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            goto L_0x00de
        L_0x0103:
            java.lang.Object r4 = r15.A04
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r3 = r15.A03
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            java.lang.Object r2 = r15.A01
            com.instagram.api.schemas.GrowthFrictionInterventionDetail r2 = (com.instagram.api.schemas.GrowthFrictionInterventionDetail) r2
            java.lang.Object r1 = r15.A02
            java.lang.Integer r1 = (java.lang.Integer) r1
            r0 = 3
            X.0qQ.A0B(r1, r0)
            java.lang.String r0 = "user_selected_cancel_on_dialog"
            X.FEL.A00(r2, r4, r3, r1, r0)
            return
        L_0x011d:
            java.lang.Object r1 = r15.A02
            X.G81 r1 = (X.G81) r1
            r1.D5S()
            r0 = 44
            X.EDf r4 = new X.EDf
            r4.<init>(r1, r0)
            java.lang.Object r3 = r15.A04
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            X.5mt r2 = X.C294695ms.A00(r3)
            java.lang.Object r1 = r15.A01
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r0 = r15.A03
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r2.A08(r1, r4, r3, r0)
            return
        L_0x013f:
            java.lang.Object r4 = r15.A02
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r3 = r15.A03
            X.0aP r3 = (X.AnonymousClass0aP) r3
            java.lang.Object r0 = r15.A04
            X.6qx r0 = (X.C319646qx) r0
            java.lang.String r2 = r0.A05
            if (r2 == 0) goto L_0x0175
            java.lang.String r1 = r0.A06
            X.0qQ.A0A(r1)
            java.lang.String r0 = r0.A02()
            X.1OC r1 = X.FHA.A03(r4, r3, r2, r1, r0)
            java.lang.Object r0 = r15.A01
            X.1P0 r0 = (X.1P0) r0
            r1.A00 = r0
            X.1ES.A03(r1)
            boolean r0 = X.C46400DeN.A04
            java.lang.Class<X.DeN> r2 = X.C46400DeN.class
            monitor-enter(r2)
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0172 }
            X.C46400DeN.A00 = r0     // Catch:{ all -> 0x0172 }
            monitor-exit(r2)
            return
        L_0x0172:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0175:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x017a:
            X.1Q0 r0 = X.1Q0.A1C
            java.lang.Object r3 = r15.A04
            X.0aP r3 = (X.AnonymousClass0aP) r3
            X.FGI r1 = r0.A02(r3)
            X.DiE r7 = X.C46634DiE.ACCESS_DIALOG
            r0 = 0
            X.FBm r2 = r1.A06(r0, r7)
            java.lang.Object r5 = r15.A01
            X.G8G r5 = (X.G8G) r5
            java.lang.String r1 = r5.AXz()
            java.lang.String r0 = "auth_type"
            r2.A04(r0, r1)
            r2.A02()
            X.F1b r1 = X.C49669F1b.A00
            java.lang.Object r2 = r15.A03
            X.4DH r2 = (X.AnonymousClass4DH) r2
            java.lang.Object r4 = r15.A02
            X.G8H r4 = (X.G8H) r4
            r0 = 0
            X.FfJ r6 = new X.FfJ
            r6.<init>(r15, r0)
            r1.A00(r2, r3, r4, r5, r6, r7)
            return
        L_0x01af:
            java.lang.Object r5 = r15.A02
            X.6qu r5 = (X.C319616qu) r5
            java.lang.Object r4 = r15.A01
            X.FH4 r4 = (X.FH4) r4
            com.instagram.common.session.UserSession r9 = r4.A04
            r0 = 0
            X.0qQ.A0B(r9, r0)
            java.lang.String r3 = "logout_password_saving_opt_in"
            java.lang.String r2 = "logout_spi"
            java.lang.String r1 = "spi"
            java.lang.String r0 = "logout_interaction"
            X.C319616qu.A01(r9, r3, r2, r1, r0)
            java.lang.Object r6 = r15.A04
            X.6qt r6 = (X.C319606qt) r6
            java.lang.String r13 = r9.A06
            X.FU7 r8 = new X.FU7
            r8.<init>()
            java.lang.Integer r12 = X.AnonymousClass05K.A0j
            androidx.fragment.app.FragmentActivity r0 = r4.A01
            android.content.Context r7 = r0.getApplicationContext()
            java.lang.Object r10 = r15.A03
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            r14 = 1
            r11 = r10
            r6.A08(r7, r8, r9, r10, r11, r12, r13, r14)
            X.FH4.A02(r5, r4, r14)
            return
        L_0x01e8:
            java.lang.Object r1 = r15.A01
            X.EUm r1 = (X.C48068EUm) r1
            java.lang.Object r4 = r15.A04
            X.0aP r4 = (X.AnonymousClass0aP) r4
            r1.A00(r4)
            r0.dismiss()
            java.lang.Object r3 = r15.A03
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r15.A02
            X.Eyz r2 = (X.C49590Eyz) r2
            java.lang.String r0 = r2.A02
            X.SFz r1 = new X.SFz
            r1.<init>((java.lang.String) r0)
            java.lang.String r0 = r2.A01
            X.Dba.A0q(r3, r4, r1, r0)
            return
        L_0x020b:
            java.lang.Object r5 = r15.A02
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r4 = r15.A04
            X.1Xj r4 = (X.1Xj) r4
            r3 = 1
            X.1NY r2 = X.AnonymousClass7TG.A0a(r5)
            java.lang.String r1 = r4.getId()
            X.1iA r0 = r4.BR7()
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            r0 = 320(0x140, float:4.48E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0K(r0, r1)
            java.lang.String r1 = r4.getId()
            java.lang.String r0 = "media_id"
            X.DbX.A1M(r2, r0, r1)
            X.1OC r3 = X.DbT.A0U(r2, r3)
            java.lang.Object r2 = r15.A03
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.Object r1 = r15.A01
            android.content.DialogInterface$OnDismissListener r1 = (android.content.DialogInterface.OnDismissListener) r1
            if (r1 != 0) goto L_0x0245
            r1 = 0
        L_0x0245:
            X.ELx r0 = new X.ELx
            r0.<init>(r1, r2, r5, r4)
            r3.A00 = r0
            X.Dbb.A15(r2, r3)
            return
        L_0x0250:
            X.F1P r0 = X.C49943FFw.A04
            X.FFw r5 = r0.A00()
            java.lang.Object r4 = r15.A04
            X.0lg r4 = (X.0lg) r4
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            java.lang.Object r2 = r15.A03
            X.0iw r2 = (X.AnonymousClass0iw) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A1I
            r0 = 4
            X.0qQ.A0B(r1, r0)
            X.C49943FFw.A01(r2, r4, r5, r1, r3)
            java.lang.Object r1 = r15.A01
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            boolean r0 = r1 instanceof X.G8D
            if (r0 == 0) goto L_0x027c
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.business.controller.BusinessConversionController"
            X.0qQ.A0C(r1, r0)
            X.G8D r1 = (X.G8D) r1
            r1.CHx()
            return
        L_0x027c:
            java.lang.Object r2 = r15.A02
            X.0hq r2 = (X.0hq) r2
            r1 = 1
            java.lang.String r0 = "reg_gdpr_entrance"
            r2.A19(r0, r1)
            r2.A0a()
            return
        L_0x028a:
            java.lang.Object r6 = r15.A02
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r5 = r15.A04
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            java.lang.Object r3 = r15.A03
            java.lang.Object r2 = r15.A01
            r1 = 1
            X.P3M r0 = new X.P3M
            r0.<init>(r1, r2, r5, r3)
            X.C48837Ekz.A00(r6, r5, r0, r4)
            return
        L_0x02a2:
            java.lang.Object r3 = r15.A04
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r2 = r15.A03
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            java.lang.Object r1 = r15.A01
            android.os.BaseBundle r1 = (android.os.BaseBundle) r1
            java.lang.String r0 = "media_id"
            java.lang.String r1 = r1.getString(r0)
            java.lang.Object r0 = r15.A02
            com.instagram.api.schemas.XIGIGBoostDestination r0 = (com.instagram.api.schemas.XIGIGBoostDestination) r0
            X.C48750EjZ.A00(r2, r0, r3, r1)
            X.WGU r2 = X.WGU.A00(r3)
            X.UzE r1 = X.C16678UzE.SUCCESS_DIALOG
            java.lang.String r0 = "customize_button_of_success_dialog"
            r2.A0F(r1, r0)
            return
        L_0x02c7:
            java.lang.Object r3 = r15.A03
            X.6Rx r3 = (X.C307896Rx) r3
            java.lang.Object r2 = r15.A04
            X.4uI r2 = (X.C277014uI) r2
            X.6Tl r1 = X.DbS.A0P()
            java.lang.Object r0 = r15.A01
            r1.A01(r0)
            java.lang.Object r0 = r15.A02
            goto L_0x02ee
        L_0x02db:
            java.lang.Object r3 = r15.A02
            X.6Rx r3 = (X.C307896Rx) r3
            java.lang.Object r2 = r15.A03
            X.4uI r2 = (X.C277014uI) r2
            X.6Tl r1 = X.DbS.A0P()
            java.lang.Object r0 = r15.A04
            r1.A01(r0)
            java.lang.Object r0 = r15.A01
        L_0x02ee:
            X.6Tm r0 = X.DbT.A0V(r1, r0)
            X.C299275ur.A00(r3, r0, r2)
            return
        L_0x02f6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x02fb:
            r2.Dme()
            return
        L_0x02ff:
            r2.DTb()
            return
        L_0x0303:
            r2.DjB()
            return
        L_0x0307:
            r2.DmU(r1)
            return
        L_0x030b:
            r2.DOw()
            return
        L_0x030f:
            r2.DjD()
            return
        L_0x0313:
            r2.DjC()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50024FJj.onClick(android.content.DialogInterface, int):void");
    }

    public C50024FJj(DialogInterface.OnClickListener onClickListener, 0wc r2, UserSession userSession, 1Xj r4, int i) {
        this.A00 = i;
        if (18 - i != 0) {
            this.A03 = r2;
            this.A04 = userSession;
            this.A02 = r4;
            this.A01 = onClickListener;
        } else {
            this.A01 = onClickListener;
            this.A03 = r2;
            this.A04 = userSession;
            this.A02 = r4;
        }
    }

    public C50024FJj(C307786Rm r1, C307896Rx r2, C276544tV r3, C277014uI r4, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
                this.A02 = r2;
                this.A03 = r4;
                this.A04 = r3;
                this.A01 = r1;
                break;
            default:
                this.A03 = r2;
                this.A04 = r4;
                this.A01 = r3;
                this.A02 = r1;
                break;
        }
    }

    public C50024FJj(Activity activity, UserSession userSession, 1Xj r3, User user, int i) {
        this.A00 = i;
        switch (i) {
            case 11:
            case 13:
                this.A04 = user;
                this.A02 = r3;
                this.A01 = activity;
                this.A03 = userSession;
                break;
            default:
                this.A03 = user;
                this.A02 = r3;
                this.A01 = activity;
                this.A04 = userSession;
                break;
        }
    }
}
