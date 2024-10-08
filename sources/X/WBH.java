package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.promote.model.PromoteData;
import go.Seq;

public final class WBH implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WBH(FragmentActivity fragmentActivity, PromoteData promoteData, int i) {
        this.A00 = i;
        switch (i) {
            case Seq.RefTracker.REF_OFFSET /*42*/:
            case 44:
                this.A01 = fragmentActivity;
                this.A02 = promoteData;
                break;
            default:
                this.A02 = promoteData;
                this.A01 = fragmentActivity;
                break;
        }
    }

    public static void A01(View view, int i, Object obj, Object obj2) {
        AnonymousClass0fU.A00(new WBH(i, obj, obj2), view);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: X.VLy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v199, resolved type: X.VLy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v200, resolved type: X.VLy} */
    /* JADX WARNING: type inference failed for: r0v4, types: [X.WDl, android.view.MenuItem] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005c, code lost:
        X.0qQ.A0F(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0063, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0789, code lost:
        r8 = "currentStep";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x078d, code lost:
        r8 = "messengerRadioButton";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0791, code lost:
        r8 = "multiDestinationRadioButton";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0824, code lost:
        r8 = "promoteData";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x08ca, code lost:
        r8 = "promoteLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0934, code lost:
        r8 = "selectedAndSuggestedInterestsAdapter";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0a88, code lost:
        X.AnonymousClass0fD.A0C(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0a8b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0a8c, code lost:
        r8 = "adsManagerLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0add, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0ae0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0b54, code lost:
        X.AnonymousClass0fD.A0C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0b57, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0b71, code lost:
        r8 = "aymtLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0b75, code lost:
        r8 = "aymtCache";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0d69, code lost:
        X.AnonymousClass0fD.A0C(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0d6c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0d9f, code lost:
        X.AnonymousClass0fD.A0C(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0da2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x061b, code lost:
        r8 = "insightProcessor";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x061f, code lost:
        r8 = "impressionItem";
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r25) {
        /*
            r24 = this;
            r0 = r24
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x0588;
                case 1: goto L_0x0d81;
                case 2: goto L_0x0567;
                case 3: goto L_0x0d4e;
                case 4: goto L_0x0546;
                case 5: goto L_0x0d20;
                case 6: goto L_0x052f;
                case 7: goto L_0x04f7;
                case 8: goto L_0x04d8;
                case 9: goto L_0x04b7;
                case 10: goto L_0x049a;
                case 11: goto L_0x0479;
                case 12: goto L_0x0d14;
                case 13: goto L_0x0d08;
                case 14: goto L_0x0cfc;
                case 15: goto L_0x0b81;
                case 16: goto L_0x0466;
                case 17: goto L_0x042f;
                case 18: goto L_0x0cc9;
                case 19: goto L_0x0416;
                case 20: goto L_0x03fe;
                case 21: goto L_0x0cad;
                case 22: goto L_0x03db;
                case 23: goto L_0x03a3;
                case 24: goto L_0x0c53;
                case 25: goto L_0x0c09;
                case 26: goto L_0x0ae1;
                case 27: goto L_0x0a90;
                case 28: goto L_0x038c;
                case 29: goto L_0x0375;
                case 30: goto L_0x035e;
                case 31: goto L_0x0a51;
                case 32: goto L_0x033a;
                case 33: goto L_0x099f;
                case 34: goto L_0x0960;
                case 35: goto L_0x0938;
                case 36: goto L_0x0bd5;
                case 37: goto L_0x031f;
                case 38: goto L_0x0301;
                case 39: goto L_0x02e3;
                case 40: goto L_0x02c5;
                case 41: goto L_0x02a7;
                case 42: goto L_0x0283;
                case 43: goto L_0x0252;
                case 44: goto L_0x0231;
                case 45: goto L_0x0203;
                case 46: goto L_0x01ea;
                case 47: goto L_0x0912;
                case 48: goto L_0x01d1;
                case 49: goto L_0x08f0;
                case 50: goto L_0x01b8;
                case 51: goto L_0x08ce;
                case 52: goto L_0x019d;
                case 53: goto L_0x0182;
                case 54: goto L_0x08a4;
                case 55: goto L_0x0828;
                case 56: goto L_0x07ef;
                case 57: goto L_0x07b9;
                case 58: goto L_0x0169;
                case 59: goto L_0x014e;
                case 60: goto L_0x0795;
                case 61: goto L_0x0744;
                case 62: goto L_0x0702;
                case 63: goto L_0x06c0;
                case 64: goto L_0x067e;
                case 65: goto L_0x00d2;
                case 66: goto L_0x0137;
                case 67: goto L_0x05d6;
                case 68: goto L_0x0623;
                case 69: goto L_0x059b;
                default: goto L_0x0007;
            }
        L_0x0007:
            r1 = -2109330286(0xffffffff82462c92, float:-1.4559534E-37)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A02
            X.UaY r5 = (X.C15325UaY) r5
            java.lang.Object r9 = r0.A01
            java.util.List r9 = (java.util.List) r9
            X.6ap r3 = new X.6ap
            r3.<init>()
            r0 = 3500(0xdac, float:4.905E-42)
            r3.A01 = r0
            r0 = 2131962324(0x7f1329d4, float:1.956137E38)
            java.lang.String r0 = r5.getString(r0)
            r3.A0D = r0
            r0 = 2131975851(0x7f135eab, float:1.9588806E38)
            java.lang.String r0 = X.DbU.A0m(r5, r0)
            r3.A0G = r0
            r2 = 0
            X.WYF r0 = new X.WYF
            r0.<init>(r2, r9, r5)
            r3.A0A(r0)
            r0 = 1
            r3.A0L = r0
            r3.A0O = r0
            X.Dc2 r2 = r3.A00()
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            com.instagram.base.activity.BaseFragmentActivity r0 = (com.instagram.base.activity.BaseFragmentActivity) r0
            if (r0 == 0) goto L_0x0054
            X.3M8 r0 = r0.Bx5()
            if (r0 == 0) goto L_0x0054
            r0.A0A(r2)
        L_0x0054:
            r5.A04 = r2
            X.Ugw r8 = r5.A01
            if (r8 != 0) goto L_0x0064
            java.lang.String r8 = "listController"
        L_0x005c:
            X.0qQ.A0F(r8)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0064:
            X.Vku r0 = r8.A07
            r0.A01()
            boolean r0 = r8.A05
            if (r0 != 0) goto L_0x0096
            X.W1j r7 = r8.A09
            com.instagram.common.session.UserSession r6 = r7.A04
            X.0iw r4 = r7.A03
            java.util.List r3 = java.util.Collections.EMPTY_LIST
            r2 = 2
            X.WMl r0 = new X.WMl
            r0.<init>(r2)
            java.util.List r0 = X.C256393vh.A02(r0, r9)
            X.1OC r3 = X.C48773Ejw.A00(r4, r6, r3, r0)
            r0 = 6
            X.C15619Ufl.A00(r3, r7, r9, r0)
            java.lang.ref.WeakReference r0 = r7.A05
            java.lang.Object r2 = r0.get()
            android.content.Context r2 = (android.content.Context) r2
            if (r2 == 0) goto L_0x0096
            X.07i r0 = r7.A01
            X.1ES.A00(r2, r0, r3)
        L_0x0096:
            r8.A02()
            X.0eM r0 = r5.A0B
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.5rw r2 = X.C297545rv.A00(r0)
            java.lang.String r4 = "favorites_management"
            X.0eM r0 = r5.A0A
            java.lang.String r3 = X.C13991Tnr.A0k(r0)
            com.instagram.common.session.UserSession r0 = r2.A00
            X.0wc r2 = X.DbW.A0J(r0, r4)
            java.lang.String r0 = "instagram_feed_favorites_remove_all"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x00ca
            java.lang.String r0 = "module"
            r2.AAJ(r0, r4)
            java.lang.String r0 = "management_session_id"
            r2.AAJ(r0, r3)
            r2.Cgf()
        L_0x00ca:
            X.C15325UaY.A00(r5)
            r0 = -1929307707(0xffffffff8d0119c5, float:-3.9782213E-31)
            goto L_0x0a88
        L_0x00d2:
            r1 = 1469459990(0x57962e16, float:3.30249364E14)
            int r1 = X.AnonymousClass0fD.A05(r1)
            r5 = 0
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r10 = 0
            java.util.BitSet r2 = new java.util.BitSet
            r2.<init>(r10)
            int r2 = r2.nextClearBit(r10)
            if (r2 < r10) goto L_0x0b79
            X.0sm r19 = X.0Yt.A0E()
            java.util.Map r18 = X.0Yt.A0B(r3)
            r13 = 1
            r21 = 30
            r20 = 719983200(0x2aea1260, float:4.15795E-13)
            java.lang.String r15 = "com.bloks.www.screen_query.ig.boost.BloksIGBoostMessagingEducationScreenQuery"
            X.ShW r14 = new X.ShW
            r16 = r5
            r17 = r5
            r23 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r23)
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r0.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.6Qj r0 = X.C48721Ej6.A00(r2, r10)
            r9 = 1065353216(0x3f800000, float:1.0)
            X.FRI r4 = new X.FRI
            r6 = r5
            r7 = r5
            r8 = r5
            r11 = r10
            r12 = r10
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.0qQ.A0B(r0, r13)
            r14.E0s(r3, r4, r0)
            X.WGU r3 = X.WGU.A00(r2)
            X.0qQ.A07(r3)
            X.UzE r2 = X.C16678UzE.OBJECTIVE
            java.lang.String r0 = "education_messaging_recommended_bottom_sheet"
            r3.A0H(r2, r0)
            r0 = -1345477658(0xffffffffafcda3e6, float:-3.740574E-10)
            goto L_0x0a88
        L_0x0137:
            r1 = -192778818(0xfffffffff4826dbe, float:-8.2669E31)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.Uh2 r2 = (X.C15696Uh2) r2
            java.lang.Object r0 = r0.A02
            X.WXB r0 = (X.WXB) r0
            r2.A04(r0)
            r0 = 2003772128(0x776f22e0, float:4.850259E33)
            goto L_0x0a88
        L_0x014e:
            r1 = 1707245956(0x65c28184, float:1.1481603E23)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.UBT r3 = (X.UBT) r3
            int r2 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.X3P r2 = r3.A01
            java.lang.Object r0 = r0.A01
            com.instagram.business.promote.model.AudienceGeoLocation r0 = (com.instagram.business.promote.model.AudienceGeoLocation) r0
            r2.DLt(r0)
            r0 = 419292517(0x18fde565, float:6.5630596E-24)
            goto L_0x0a88
        L_0x0169:
            r1 = 517993010(0x1edff232, float:2.3711213E-20)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.UCa r2 = (X.C14846UCa) r2
            X.Vfe r2 = r2.A01
            java.lang.Object r0 = r0.A01
            com.instagram.business.promote.model.AudienceInterest r0 = (com.instagram.business.promote.model.AudienceInterest) r0
            r2.A00(r0)
            r0 = -1337517292(0xffffffffb0471b14, float:-7.243426E-10)
            goto L_0x0a88
        L_0x0182:
            r1 = 1151206793(0x449e0589, float:1264.173)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.UD3 r3 = (X.UD3) r3
            int r2 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.X3N r2 = r3.A02
            java.lang.Object r0 = r0.A01
            com.instagram.business.promote.model.AudienceGeoLocation r0 = (com.instagram.business.promote.model.AudienceGeoLocation) r0
            r2.DLt(r0)
            r0 = -514417938(0xffffffffe1569aee, float:-2.4742294E20)
            goto L_0x0a88
        L_0x019d:
            r1 = 1146466176(0x4455af80, float:854.7422)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.UCZ r3 = (X.UCZ) r3
            int r2 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.X3M r2 = r3.A01
            java.lang.Object r0 = r0.A01
            com.instagram.business.promote.model.AudienceInterest r0 = (com.instagram.business.promote.model.AudienceInterest) r0
            r2.DLu(r0)
            r0 = 866608589(0x33a765cd, float:7.795061E-8)
            goto L_0x0a88
        L_0x01b8:
            r1 = -1752065744(0xffffffff97919930, float:-9.409075E-25)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.UAD r2 = (X.UAD) r2
            X.Vff r2 = r2.A02
            java.lang.Object r0 = r0.A01
            com.instagram.business.promote.model.AudienceInterest r0 = (com.instagram.business.promote.model.AudienceInterest) r0
            r2.A00(r0)
            r0 = 195287445(0xba3d995, float:6.31127E-32)
            goto L_0x0a88
        L_0x01d1:
            r1 = -1247295896(0xffffffffb5a7c668, float:-1.2500213E-6)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.UCX r2 = (X.UCX) r2
            X.Vff r2 = r2.A01
            java.lang.Object r0 = r0.A01
            com.instagram.business.promote.model.AudienceInterest r0 = (com.instagram.business.promote.model.AudienceInterest) r0
            r2.A00(r0)
            r0 = 115030328(0x6db3938, float:8.246272E-35)
            goto L_0x0a88
        L_0x01ea:
            r1 = 2120758753(0x7e6835e1, float:7.7165163E37)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.UAI r2 = (X.UAI) r2
            X.Vfe r2 = r2.A02
            java.lang.Object r0 = r0.A01
            com.instagram.business.promote.model.AudienceInterest r0 = (com.instagram.business.promote.model.AudienceInterest) r0
            r2.A00(r0)
            r0 = 696040769(0x297cbd41, float:5.6119392E-14)
            goto L_0x0a88
        L_0x0203:
            r1 = -676372434(0xffffffffd7af602e, float:-3.85655247E14)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A02
            X.ViF r5 = (X.C17924ViF) r5
            X.WGU r4 = r5.A02
            X.UzE r3 = r5.A01
            java.lang.String r2 = "payment_primary_action_button"
            r4.A0F(r3, r2)
            X.UaS r4 = r5.A05
            java.lang.Object r0 = r0.A01
            X.GSY r0 = (X.GSY) r0
            java.lang.Object r0 = r0.A00
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r2 = r5.A00()
            java.lang.String r0 = "enter_billing_wizard_by_clicking_entry"
            r4.A0A(r3, r0, r2)
            r0 = 1792713622(0x6adaa396, float:1.3215917E26)
            goto L_0x0a88
        L_0x0231:
            r1 = -1819466682(0xffffffff938d2446, float:-3.5629172E-27)
            int r1 = X.AnonymousClass0fD.A05(r1)
            X.C13990Tnq.A0h()
            X.UZb r3 = new X.UZb
            r3.<init>()
            java.lang.Object r2 = r0.A01
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            java.lang.Object r0 = r0.A02
            com.instagram.business.promote.model.PromoteData r0 = (com.instagram.business.promote.model.PromoteData) r0
            com.instagram.common.session.UserSession r0 = r0.A0y
            X.DbY.A14(r3, r2, r0)
            r0 = 219679769(0xd180c19, float:4.685318E-31)
            goto L_0x0a88
        L_0x0252:
            r1 = 544421596(0x207336dc, float:2.0601052E-19)
            int r1 = X.AnonymousClass0fD.A05(r1)
            X.Vl8 r4 = X.C13990Tnq.A0N()
            java.lang.Object r2 = r0.A02
            com.instagram.business.promote.model.PromoteData r2 = (com.instagram.business.promote.model.PromoteData) r2
            com.instagram.common.session.UserSession r3 = r2.A0y
            X.0qQ.A06(r3)
            r2 = 0
            X.UaW r2 = r4.A05(r2)
            java.lang.Object r0 = r0.A01
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            X.6Yo r2 = X.DbV.A0M(r2, r0, r3)
            X.UzE r0 = X.C16678UzE.MANAGE_LEAD_ADS
            java.lang.String r0 = r0.toString()
            r2.A0A = r0
            r2.A04()
            r0 = -936257410(0xffffffffc831d87e, float:-182113.97)
            goto L_0x0a88
        L_0x0283:
            r1 = -646588982(0xffffffffd975d5ca, float:-4.32477705E15)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A01
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            java.lang.Object r3 = r0.A02
            com.instagram.business.promote.model.PromoteData r3 = (com.instagram.business.promote.model.PromoteData) r3
            r0 = 0
            r3.A2m = r0
            X.C13990Tnq.A0h()
            X.UZc r2 = new X.UZc
            r2.<init>()
            com.instagram.common.session.UserSession r0 = r3.A0y
            X.DbY.A14(r2, r4, r0)
            r0 = 1028037614(0x3d469bee, float:0.04848855)
            goto L_0x0a88
        L_0x02a7:
            r1 = -1801213488(0xffffffff94a3a9d0, float:-1.6525773E-26)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            X.WGU r4 = (X.WGU) r4
            X.UzE r3 = X.C16678UzE.AD_PREVIEW
            java.lang.String r2 = "ad_preview_stories_row"
            r4.A0F(r3, r2)
            java.lang.Object r0 = r0.A01
            X.X95 r0 = (X.X95) r0
            r0.Dnf()
            r0 = -855950544(0xffffffffccfb3b30, float:-1.31717504E8)
            goto L_0x0a88
        L_0x02c5:
            r1 = 1112474165(0x424f0235, float:51.752155)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            X.WGU r4 = (X.WGU) r4
            X.UzE r3 = X.C16678UzE.AD_PREVIEW
            java.lang.String r2 = "ad_preview_reels_row"
            r4.A0F(r3, r2)
            java.lang.Object r0 = r0.A01
            X.X95 r0 = (X.X95) r0
            r0.Dc6()
            r0 = -211470012(0xfffffffff3653944, float:-1.8160972E31)
            goto L_0x0a88
        L_0x02e3:
            r1 = -100766684(0xfffffffff9fe6c24, float:-1.6512959E35)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            X.WGU r4 = (X.WGU) r4
            X.UzE r3 = X.C16678UzE.AD_PREVIEW
            java.lang.String r2 = "ad_preview_feed_row"
            r4.A0F(r3, r2)
            java.lang.Object r0 = r0.A01
            X.X95 r0 = (X.X95) r0
            r0.DF3()
            r0 = 2083473753(0x7c2f4959, float:3.6405585E36)
            goto L_0x0a88
        L_0x0301:
            r1 = -1436027514(0xffffffffaa67f586, float:-2.0602105E-13)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            X.WGU r4 = (X.WGU) r4
            X.UzE r3 = X.C16678UzE.AD_PREVIEW
            java.lang.String r2 = "ad_preview_explore_row"
            r4.A0F(r3, r2)
            java.lang.Object r0 = r0.A01
            X.X95 r0 = (X.X95) r0
            r0.DDh()
            r0 = -308669286(0xffffffffed9a149a, float:-5.9606997E27)
            goto L_0x0a88
        L_0x031f:
            r1 = -1110392492(0xffffffffbdd0c154, float:-0.101931244)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.Vw9 r3 = (X.C18654Vw9) r3
            r2 = 1
            r3.A05(r2)
            java.lang.Object r0 = r0.A01
            X.X3L r0 = (X.X3L) r0
            r0.CtD()
            r0 = 1756905767(0x68b84127, float:6.960938E24)
            goto L_0x0a88
        L_0x033a:
            r1 = 277913235(0x10909e93, float:5.704231E-29)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A02
            X.Uac r5 = (X.C15328Uac) r5
            java.lang.Object r0 = r0.A01
            X.UzG r0 = (X.C16680UzG) r0
            java.lang.String r4 = X.W3M.A01(r0)
            r3 = 0
            r0 = 1412(0x584, float:1.979E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "ads_manager_highlights_hub"
            X.C15328Uac.A0C(r5, r3, r2, r0, r4)
            r0 = -1359318990(0xffffffffaefa7032, float:-1.1388614E-10)
            goto L_0x0a88
        L_0x035e:
            r1 = -997968710(0xffffffffc48434ba, float:-1057.6477)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.X8N r2 = (X.X8N) r2
            java.lang.Object r0 = r0.A02
            X.X9b r0 = (X.C21004X9b) r0
            r2.Dz6(r0)
            r0 = 1000503866(0x3ba27a3a, float:0.004958418)
            goto L_0x0a88
        L_0x0375:
            r1 = -903138957(0xffffffffca2b3173, float:-2804828.8)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.X8N r2 = (X.X8N) r2
            java.lang.Object r0 = r0.A02
            X.X9b r0 = (X.C21004X9b) r0
            r2.DrN(r0)
            r0 = -579432411(0xffffffffdd769025, float:-1.11042133E18)
            goto L_0x0a88
        L_0x038c:
            r1 = 1849917447(0x6e438007, float:1.5126088E28)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.X8N r2 = (X.X8N) r2
            java.lang.Object r0 = r0.A02
            X.X9b r0 = (X.C21004X9b) r0
            r2.Dz3(r0)
            r0 = -175412226(0xfffffffff58b6bfe, float:-3.5347637E32)
            goto L_0x0a88
        L_0x03a3:
            r1 = -1322779854(0xffffffffb127fb32, float:-2.4444486E-9)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.Ua6 r2 = (X.C15299Ua6) r2
            X.0eM r2 = r2.A0G
            java.lang.Object r5 = r2.getValue()
            X.U8z r5 = (X.C14788U8z) r5
            java.lang.Object r0 = r0.A01
            X.GSY r0 = (X.GSY) r0
            java.lang.Object r0 = r0.A00
            java.lang.String r4 = java.lang.String.valueOf(r0)
            r0 = 0
            X.0qQ.A0B(r4, r0)
            com.instagram.common.session.UserSession r0 = r5.A08
            X.WGU r3 = X.WGU.A00(r0)
            X.UzE r2 = X.C16678UzE.BOOST_PACKAGES
            java.lang.String r0 = "payment_primary_action_button"
            r3.A0F(r2, r0)
            java.lang.String r0 = "enter_billing_wizard_by_clicking_entry"
            X.C14788U8z.A02(r5, r4, r0)
            r0 = 957754609(0x39162cf1, float:1.4321857E-4)
            goto L_0x0a88
        L_0x03db:
            r1 = -1695594369(0xffffffff9aef487f, float:-9.896521E-23)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.UKS r2 = (X.UKS) r2
            X.4tV r4 = r2.A00
            X.4uI r3 = r2.A01
            X.6Tl r2 = new X.6Tl
            r2.<init>()
            java.lang.Object r0 = r0.A01
            X.6Rm r0 = (X.C307786Rm) r0
            r2.A01(r0)
            X.DbT.A1R(r0, r4, r2, r3)
            r0 = -920306163(0xffffffffc9253e0d, float:-676832.8)
            goto L_0x0a88
        L_0x03fe:
            r1 = -1219945498(0xffffffffb7491be6, float:-1.1987029E-5)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.UcJ r3 = (X.C15407UcJ) r3
            java.lang.Object r2 = r0.A01
            X.4uI r2 = (X.C277014uI) r2
            r0 = 1
            X.C15407UcJ.A01(r3, r2, r0)
            r0 = 995326356(0x3b537994, float:0.003226851)
            goto L_0x0a88
        L_0x0416:
            r1 = -645366252(0xffffffffd9887e14, float:-4.8024026E15)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.6Rx r3 = (X.C307896Rx) r3
            java.lang.Object r2 = r0.A01
            X.4uI r2 = (X.C277014uI) r2
            X.6Tm r0 = X.AnonymousClass6Tm.A01
            X.C299275ur.A00(r3, r0, r2)
            r0 = 1618116941(0x6072814d, float:6.989733E19)
            goto L_0x0a88
        L_0x042f:
            r1 = -1149285037(0xffffffffbb7f4d53, float:-0.0038956)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.W2M r2 = (X.W2M) r2
            java.lang.Object r3 = r0.A01
            X.X3H r3 = (X.X3H) r3
            android.content.Context r5 = r2.A02
            com.instagram.common.session.UserSession r9 = r2.A05
            X.0iw r8 = r2.A04
            androidx.fragment.app.Fragment r0 = r2.A03
            X.0gy r7 = X.AnonymousClass07i.A00(r0)
            X.0hq r6 = r0.getParentFragmentManager()
            X.LG3 r4 = new X.LG3
            r4.<init>(r5, r6, r7, r8, r9)
            com.instagram.model.reels.Reel r0 = r2.A06
            java.lang.String r2 = X.JTP.A0r(r0)
            X.WNX r0 = new X.WNX
            r0.<init>(r3)
            r4.A01(r0, r2)
            r0 = 1502520537(0x598ea4d9, float:5.0188373E15)
            goto L_0x0a88
        L_0x0466:
            r1 = 1265477079(0x4b6da5d7, float:1.5574487E7)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r0 = r0.A01
            X.X6F r0 = (X.X6F) r0
            r0.Cvt()
            r0 = 660095009(0x27584021, float:3.0010786E-15)
            goto L_0x0a88
        L_0x0479:
            r1 = -929745452(0xffffffffc89535d4, float:-305582.62)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.Uie r2 = (X.C15795Uie) r2
            X.0sL r3 = r2.A03
            java.lang.Object r0 = r0.A01
            X.WSd r0 = (X.C19270WSd) r0
            java.lang.String r2 = r0.A05
            com.instagram.user.model.User r0 = r0.A04
            java.lang.String r0 = r0.getId()
            r3.invoke(r2, r0)
            r0 = -1637733732(0xffffffff9e622a9c, float:-1.1973152E-20)
            goto L_0x0a88
        L_0x049a:
            r1 = 879150428(0x3466c55c, float:2.1492218E-7)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.Uie r2 = (X.C15795Uie) r2
            X.0sL r3 = r2.A02
            java.lang.Object r0 = r0.A01
            X.WSd r0 = (X.C19270WSd) r0
            com.instagram.user.model.User r2 = r0.A04
            java.lang.String r0 = r0.A05
            r3.invoke(r2, r0)
            r0 = -1389263904(0xffffffffad3183e0, float:-1.0090567E-11)
            goto L_0x0a88
        L_0x04b7:
            r1 = -1230819401(0xffffffffb6a32fb7, float:-4.8633333E-6)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.Uie r2 = (X.C15795Uie) r2
            X.0sL r3 = r2.A03
            java.lang.Object r0 = r0.A01
            X.WSd r0 = (X.C19270WSd) r0
            java.lang.String r2 = r0.A05
            com.instagram.user.model.User r0 = r0.A04
            java.lang.String r0 = r0.getId()
            r3.invoke(r2, r0)
            r0 = -2055884720(0xffffffff8575b050, float:-1.1552228E-35)
            goto L_0x0a88
        L_0x04d8:
            r1 = 1554930962(0x5cae5d12, float:3.92631823E17)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.UiC r2 = (X.C15767UiC) r2
            X.0sP r4 = r2.A01
            java.lang.Object r0 = r0.A01
            X.WSW r0 = (X.WSW) r0
            long r2 = r0.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r4.invoke(r0)
            r0 = -793496870(0xffffffffd0b432da, float:-2.41858519E10)
            goto L_0x0a88
        L_0x04f7:
            r1 = 649430886(0x26b58766, float:1.2596098E-15)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A01
            X.WYL r5 = (X.WYL) r5
            X.Gd1 r2 = r5.A05
            r2.cancel()
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            r2 = 1
            X.LSB r3 = r5.A00(r2)
            X.JVf r2 = new X.JVf
            r2.<init>((X.LSB) r3, (java.lang.Integer) r4)
            r5.A01 = r2
            java.lang.Object r6 = r0.A02
            X.215 r6 = (X.215) r6
            X.41T r0 = r5.A02
            java.lang.String r7 = r0.A05
            java.lang.String r8 = r0.A08
            java.lang.String r11 = r0.A07
            java.lang.String r9 = "Cancelled before auto open timeout"
            r10 = 0
            X.215.A04(r6, r7, r8, r9, r10, r11)
            r5.A01()
            r0 = -1823842957(0xffffffff934a5d73, float:-2.5542058E-27)
            goto L_0x0a88
        L_0x052f:
            r1 = -59473169(0xfffffffffc7482ef, float:-5.0783043E36)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.X38 r2 = (X.X38) r2
            java.lang.Object r0 = r0.A01
            com.instagram.common.analytics.intf.AnalyticsEventDebugInfo r0 = (com.instagram.common.analytics.intf.AnalyticsEventDebugInfo) r0
            r2.DD6(r0)
            r0 = -794821772(0xffffffffd09ffb74, float:-2.14724526E10)
            goto L_0x0a88
        L_0x0546:
            r1 = 453958848(0x1b0edcc0, float:1.1817293E-22)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            X.R8Z r4 = (X.R8Z) r4
            java.lang.Object r3 = r0.A01
            com.instagram.common.analytics.intf.AnalyticsEventDebugInfo r3 = (com.instagram.common.analytics.intf.AnalyticsEventDebugInfo) r3
            androidx.fragment.app.FragmentActivity r2 = r4.getActivity()
            X.0wW r0 = r4.A02
            X.6Yo r0 = X.C16816V6x.A00(r2, r3, r0)
            r0.A04()
            r0 = 2052048593(0x7a4fc6d1, float:2.6970948E35)
            goto L_0x0a88
        L_0x0567:
            r1 = 945517814(0x385b74f6, float:5.2322597E-5)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            X.Tyh r4 = (X.C14577Tyh) r4
            android.os.Handler r3 = r4.A02
            X.Whn r2 = new X.Whn
            r2.<init>(r4)
            r3.post(r2)
            java.lang.Object r0 = r0.A01
            X.X23 r0 = (X.X23) r0
            r0.Dcp()
            r0 = 1008262700(0x3c18de2c, float:0.009330314)
            goto L_0x0a88
        L_0x0588:
            r1 = 2063935644(0x7b05289c, float:6.913991E35)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r0 = r0.A02
            X.V4T r0 = (X.V4T) r0
            r0.A00()
            r0 = 992027560(0x3b2123a8, float:0.0024587903)
            goto L_0x0a88
        L_0x059b:
            r1 = -1459696827(0xffffffffa8fecb45, float:-2.8287819E-14)
            int r3 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r9 = r0.A02
            X.Uh3 r9 = (X.C15697Uh3) r9
            java.lang.Object r0 = r0.A01
            X.Uck r0 = (X.C15434Uck) r0
            java.util.List r15 = r0.A02
            java.lang.String r12 = r0.getId()
            if (r12 != 0) goto L_0x05b4
            java.lang.String r12 = ""
        L_0x05b4:
            X.Ua1 r0 = r9.A0I
            androidx.fragment.app.FragmentActivity r4 = r0.requireActivity()
            com.instagram.common.session.UserSession r5 = r9.A0O
            X.1Nv r7 = r9.A08
            if (r7 == 0) goto L_0x061f
            X.WWU r6 = r9.A04
            if (r6 == 0) goto L_0x061b
            java.util.List r0 = r9.A0S
            r8 = 0
            java.lang.String r11 = "product"
            r10 = r8
            r13 = r8
            r14 = r8
            r16 = r0
            X.HWG.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = 1556012766(0x5cbedede, float:4.29802325E17)
            goto L_0x0d9f
        L_0x05d6:
            r1 = 625770639(0x254c808f, float:1.7737737E-16)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r8 = r0.A02
            X.Uh3 r8 = (X.C15697Uh3) r8
            java.lang.Object r1 = r0.A01
            X.XBr r1 = (X.C21050XBr) r1
            java.util.List r14 = r1.AYc()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.canvas.model.data.FooterBlockDataImpl"
            X.0qQ.A0C(r1, r0)
            X.Ucp r1 = (X.C15439Ucp) r1
            r0 = 1
            X.0qQ.A0B(r1, r0)
            java.lang.String r11 = r1.getId()
            if (r11 == 0) goto L_0x0bb7
            X.Ua1 r0 = r8.A0I
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            com.instagram.common.session.UserSession r4 = r8.A0O
            r7 = 0
            java.lang.String r12 = r1.A02
            X.1Nv r6 = r8.A08
            if (r6 == 0) goto L_0x061f
            X.WWU r5 = r8.A04
            if (r5 == 0) goto L_0x061b
            java.util.List r15 = r8.A0S
            java.lang.String r10 = "footer"
            r9 = r7
            r13 = r7
            X.HWG.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = 376287767(0x166db217, float:1.9200903E-25)
            goto L_0x0b54
        L_0x061b:
            java.lang.String r8 = "insightProcessor"
            goto L_0x005c
        L_0x061f:
            java.lang.String r8 = "impressionItem"
            goto L_0x005c
        L_0x0623:
            r1 = 1179756445(0x4651a79d, float:13417.903)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A01
            X.Uh3 r5 = (X.C15697Uh3) r5
            java.lang.Object r1 = r0.A02
            X.VXr r1 = (X.C17488VXr) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.VMg r4 = r5.A0N
            boolean r0 = r4.A00
            r3 = r0 ^ 1
            r4.A00 = r3
            android.widget.ImageView r1 = r1.A01
            r0 = 2131239949(0x7f08240d, float:1.809622E38)
            if (r3 == 0) goto L_0x0648
            r0 = 2131239950(0x7f08240e, float:1.8096221E38)
        L_0x0648:
            r1.setImageResource(r0)
            X.Ugx r0 = r5.A06
            if (r0 != 0) goto L_0x0653
            java.lang.String r8 = "videoModule"
            goto L_0x005c
        L_0x0653:
            boolean r3 = r4.A00
            X.Uu4 r1 = r0.A06
            r1.A04 = r3
            X.4M3 r0 = r1.A02
            if (r0 == 0) goto L_0x0662
            if (r3 == 0) goto L_0x067a
            X.C16387Uu4.A00(r1)
        L_0x0662:
            com.instagram.common.session.UserSession r0 = r5.A0O
            X.1Av r0 = X.1Au.A00(r0)
            r3 = 3
            X.0xY r1 = X.AnonymousClass7TE.A0p(r0)
            java.lang.String r0 = "canvas_show_audio_button_tooltip"
            r1.E5Z(r0, r3)
            r1.apply()
            r0 = -1349378712(0xffffffffaf921d68, float:-2.657814E-10)
            goto L_0x0b54
        L_0x067a:
            r1.A02()
            goto L_0x0662
        L_0x067e:
            r1 = -97747995(0xfffffffffa2c7be5, float:-2.2389698E35)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A02
            X.UaS r5 = (X.C15320UaS) r5
            X.WGU r4 = r5.A0B
            java.lang.String r8 = "promoteData"
            if (r4 == 0) goto L_0x069e
            X.UzE r3 = X.C16678UzE.SUMMARY
            com.instagram.business.promote.model.PromoteData r2 = r5.A0F
            if (r2 == 0) goto L_0x005c
            boolean r2 = r2.A2r
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r4.A0C(r3, r2)
        L_0x069e:
            com.instagram.business.promote.model.PromoteData r2 = r5.A0F
            if (r2 == 0) goto L_0x005c
            java.util.List r3 = r2.A1v
            r2 = 1
            java.lang.String r4 = X.AnonymousClass7TE.A19(r3, r2)
            android.content.res.Resources r3 = X.DbV.A05(r5)
            r2 = 2131970644(0x7f134a54, float:1.9578245E38)
            java.lang.String r2 = r3.getString(r2)
            java.lang.Object r0 = r0.A01
            com.instagram.common.typedurl.ImageUrlBase r0 = (com.instagram.common.typedurl.ImageUrlBase) r0
            X.C15320UaS.A05(r5, r0, r4, r2)
            r0 = -674922361(0xffffffffd7c58087, float:-4.34311623E14)
            goto L_0x0a88
        L_0x06c0:
            r1 = -297859093(0xffffffffee3f07eb, float:-1.4780302E28)
            int r4 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.UZc r3 = (X.C15274UZc) r3
            com.instagram.api.schemas.XIGIGBoostDestination r1 = com.instagram.api.schemas.XIGIGBoostDestination.MULTI_DESTINATION_MESSAGE
            r3.A04 = r1
            java.lang.Object r0 = r0.A01
            X.U5O r0 = (X.U5O) r0
            r1 = 0
            r0.setChecked(r1)
            X.U5O r0 = r3.A0C
            if (r0 == 0) goto L_0x078d
            r0.setChecked(r1)
            X.U5O r0 = r3.A0D
            if (r0 == 0) goto L_0x0791
            r1 = 1
            r0.setChecked(r1)
            com.instagram.business.promote.model.PromoteData r0 = r3.A0A
            if (r0 == 0) goto L_0x0824
            r0.A2H = r1
            X.WGU r2 = r3.A06
            if (r2 == 0) goto L_0x08ca
            X.UzE r1 = r3.A05
            if (r1 == 0) goto L_0x0789
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r3.A04
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.A0G(r1, r0)
            r0 = 1196365212(0x474f159c, float:53013.61)
            goto L_0x0add
        L_0x0702:
            r1 = 1643947702(0x61fca6b6, float:5.8257404E20)
            int r4 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.UZc r3 = (X.C15274UZc) r3
            com.instagram.api.schemas.XIGIGBoostDestination r1 = com.instagram.api.schemas.XIGIGBoostDestination.DIRECT_MESSAGE
            r3.A04 = r1
            X.U5O r2 = r3.A0D
            if (r2 == 0) goto L_0x0791
            r1 = 0
            r2.setChecked(r1)
            java.lang.Object r0 = r0.A01
            X.U5O r0 = (X.U5O) r0
            r0.setChecked(r1)
            X.U5O r0 = r3.A0C
            if (r0 == 0) goto L_0x078d
            r1 = 1
            r0.setChecked(r1)
            com.instagram.business.promote.model.PromoteData r0 = r3.A0A
            if (r0 == 0) goto L_0x0824
            r0.A2H = r1
            X.WGU r2 = r3.A06
            if (r2 == 0) goto L_0x08ca
            X.UzE r1 = r3.A05
            if (r1 == 0) goto L_0x0789
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r3.A04
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.A0G(r1, r0)
            r0 = -432037666(0xffffffffe63fa0de, float:-2.2623487E23)
            goto L_0x0add
        L_0x0744:
            r1 = -1590576704(0xffffffffa131b9c0, float:-6.021577E-19)
            int r4 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.UZc r3 = (X.C15274UZc) r3
            com.instagram.api.schemas.XIGIGBoostDestination r1 = com.instagram.api.schemas.XIGIGBoostDestination.WHATSAPP_MESSAGE
            r3.A04 = r1
            X.C15274UZc.A02(r3)
            X.U5O r1 = r3.A0D
            if (r1 == 0) goto L_0x0791
            r2 = 0
            r1.setChecked(r2)
            X.U5O r1 = r3.A0C
            if (r1 == 0) goto L_0x078d
            r1.setChecked(r2)
            java.lang.Object r0 = r0.A01
            X.U5O r0 = (X.U5O) r0
            r1 = 1
            r0.setChecked(r1)
            com.instagram.business.promote.model.PromoteData r0 = r3.A0A
            if (r0 == 0) goto L_0x0824
            r0.A2H = r1
            X.WGU r2 = r3.A06
            if (r2 == 0) goto L_0x08ca
            X.UzE r1 = r3.A05
            if (r1 == 0) goto L_0x0789
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r3.A04
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.A0G(r1, r0)
            r0 = 1595871038(0x5f1f0f3e, float:1.1461448E19)
            goto L_0x0add
        L_0x0789:
            java.lang.String r8 = "currentStep"
            goto L_0x005c
        L_0x078d:
            java.lang.String r8 = "messengerRadioButton"
            goto L_0x005c
        L_0x0791:
            java.lang.String r8 = "multiDestinationRadioButton"
            goto L_0x005c
        L_0x0795:
            r1 = -2002048840(0xffffffff88ab28b8, float:-1.0301261E-33)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.UCb r3 = (X.C14847UCb) r3
            int r2 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.Vfe r2 = r3.A01
            java.lang.Object r3 = r0.A01
            com.instagram.business.promote.model.AudienceInterest r3 = (com.instagram.business.promote.model.AudienceInterest) r3
            X.UZW r2 = r2.A00
            X.UAI r0 = r2.A06
            if (r0 == 0) goto L_0x0934
            r0.A02(r3)
            X.UZW.A01(r2)
            r0 = 1882466294(0x703427f6, float:2.2302245E29)
            goto L_0x0a88
        L_0x07b9:
            r1 = -2060929139(0xffffffff8528b78d, float:-7.933035E-36)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A02
            X.UaT r5 = (X.C15321UaT) r5
            com.instagram.business.promote.model.PromoteData r2 = r5.A0A
            if (r2 == 0) goto L_0x0824
            java.util.List r3 = r2.A1v
            r2 = 1
            java.lang.Object r4 = r3.get(r2)
            X.0qQ.A07(r4)
            java.lang.String r4 = (java.lang.String) r4
            android.content.res.Resources r3 = X.DbV.A05(r5)
            r2 = 2131970644(0x7f134a54, float:1.9578245E38)
            java.lang.String r2 = X.AnonymousClass7TF.A0d(r3, r2)
            java.lang.Object r0 = r0.A01
            X.0rm r0 = (X.0rm) r0
            java.lang.Object r0 = r0.A00
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            X.C15321UaT.A03(r5, r0, r4, r2)
            r0 = -592772483(0xffffffffdcab027d, float:-3.85079655E17)
            goto L_0x0a88
        L_0x07ef:
            r1 = -414337602(0xffffffffe74db5be, float:-9.714377E23)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A02
            X.UaT r5 = (X.C15321UaT) r5
            com.instagram.business.promote.model.PromoteData r2 = r5.A0A
            if (r2 == 0) goto L_0x0824
            java.util.List r2 = r2.A1v
            java.lang.Object r4 = X.AnonymousClass7TE.A13(r2)
            X.0qQ.A07(r4)
            java.lang.String r4 = (java.lang.String) r4
            android.content.res.Resources r3 = X.DbV.A05(r5)
            r2 = 2131970643(0x7f134a53, float:1.9578243E38)
            java.lang.String r2 = X.AnonymousClass7TF.A0d(r3, r2)
            java.lang.Object r0 = r0.A01
            X.0rm r0 = (X.0rm) r0
            java.lang.Object r0 = r0.A00
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            X.C15321UaT.A03(r5, r0, r4, r2)
            r0 = 1408632940(0x53f6086c, float:2.1134065E12)
            goto L_0x0a88
        L_0x0824:
            java.lang.String r8 = "promoteData"
            goto L_0x005c
        L_0x0828:
            r1 = -1066724009(0xffffffffc06b1557, float:-3.6731775)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.UZX r2 = (X.UZX) r2
            X.0eM r3 = r2.A09
            java.lang.Object r7 = r3.getValue()
            X.VwK r7 = (X.C18662VwK) r7
            java.lang.String r6 = r2.A04
            java.lang.String r8 = "mediaId"
            if (r6 == 0) goto L_0x005c
            r5 = 0
            java.lang.String r4 = "campaign_controls"
            java.lang.String r3 = "edit_budget_duration_row"
            r7.A0A(r4, r3, r6, r5)
            X.1Yh r4 = X.C18138VmE.A00()
            X.0eM r3 = r2.A0C
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r3)
            android.content.Context r5 = r2.requireContext()
            java.lang.String r7 = r2.A04
            if (r7 == 0) goto L_0x005c
            java.lang.String r8 = r2.A03
            if (r8 != 0) goto L_0x0863
            java.lang.String r8 = "entryPoint"
            goto L_0x005c
        L_0x0863:
            java.lang.Object r0 = r0.A01
            X.VMI r0 = (X.VMI) r0
            X.UL2 r3 = r0.A00
            java.lang.Integer r0 = r3.A07
            java.lang.String r9 = java.lang.String.valueOf(r0)
            java.lang.Integer r0 = r3.A08
            java.lang.String r10 = java.lang.String.valueOf(r0)
            java.lang.Integer r0 = r3.A05
            java.lang.String r11 = java.lang.String.valueOf(r0)
            java.lang.Integer r0 = r3.A09
            int r13 = X.AnonymousClass7TG.A0A(r0)
            java.lang.Integer r0 = r3.A0B
            int r14 = X.AnonymousClass7TG.A0A(r0)
            java.lang.Integer r0 = r3.A06
            int r15 = X.AnonymousClass7TG.A0A(r0)
            java.lang.Integer r0 = r3.A0C
            int r16 = X.AnonymousClass7TG.A0A(r0)
            java.lang.Integer r0 = r3.A0A
            int r17 = X.AnonymousClass7TG.A0A(r0)
            java.lang.String r0 = r2.A02
            r12 = r0
            r4.A05(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = -169449904(0xfffffffff5e66650, float:-5.8413253E32)
            goto L_0x0a88
        L_0x08a4:
            r1 = 956818665(0x3907e4e9, float:1.2959879E-4)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            android.view.View r3 = (android.view.View) r3
            r2 = 0
            r3.setClickable(r2)
            java.lang.Object r4 = r0.A02
            X.UbW r4 = (X.C15378UbW) r4
            X.WGU r3 = r4.A00
            if (r3 == 0) goto L_0x08ca
            X.UzE r2 = X.C16678UzE.OBJECTIVE
            java.lang.String r0 = "use_credit_button"
            r3.A0F(r2, r0)
            X.C13992Tns.A0e(r4)
            r0 = 1955799454(0x7493219e, float:9.325555E31)
            goto L_0x0a88
        L_0x08ca:
            java.lang.String r8 = "promoteLogger"
            goto L_0x005c
        L_0x08ce:
            r1 = -1087652352(0xffffffffbf2bbe00, float:-0.6708679)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.UAD r2 = (X.UAD) r2
            X.Vff r2 = r2.A02
            java.lang.Object r3 = r0.A01
            com.instagram.business.promote.model.AudienceInterest r3 = (com.instagram.business.promote.model.AudienceInterest) r3
            X.UZV r2 = r2.A00
            X.UAD r0 = r2.A06
            if (r0 == 0) goto L_0x0934
            r0.A01(r3)
            X.UZV.A01(r2)
            r0 = -703751202(0xffffffffd60d9bde, float:-3.8925146E13)
            goto L_0x0a88
        L_0x08f0:
            r1 = -583665418(0xffffffffdd35f8f6, float:-8.195313E17)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.UCY r2 = (X.UCY) r2
            X.Vff r2 = r2.A01
            java.lang.Object r3 = r0.A01
            com.instagram.business.promote.model.AudienceInterest r3 = (com.instagram.business.promote.model.AudienceInterest) r3
            X.UZV r2 = r2.A00
            X.UAD r0 = r2.A06
            if (r0 == 0) goto L_0x0934
            r0.A01(r3)
            X.UZV.A01(r2)
            r0 = -1538604738(0xffffffffa44ac13e, float:-4.396545E-17)
            goto L_0x0a88
        L_0x0912:
            r1 = -188908646(0xfffffffff4bd7b9a, float:-1.20099E32)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.UAI r2 = (X.UAI) r2
            X.Vfe r2 = r2.A02
            java.lang.Object r3 = r0.A01
            com.instagram.business.promote.model.AudienceInterest r3 = (com.instagram.business.promote.model.AudienceInterest) r3
            X.UZW r2 = r2.A00
            X.UAI r0 = r2.A06
            if (r0 == 0) goto L_0x0934
            r0.A02(r3)
            X.UZW.A01(r2)
            r0 = -1733856228(0xffffffff98a7741c, float:-4.328573E-24)
            goto L_0x0a88
        L_0x0934:
            java.lang.String r8 = "selectedAndSuggestedInterestsAdapter"
            goto L_0x005c
        L_0x0938:
            r1 = -192716260(0xfffffffff483621c, float:-8.327402E31)
            int r3 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            android.widget.CompoundButton r2 = (android.widget.CompoundButton) r2
            r2.toggle()
            java.lang.Object r1 = r0.A02
            X.UZf r1 = (X.C15277UZf) r1
            com.instagram.igds.components.checkbox.IgdsCheckBox r0 = r1.A08
            if (r0 != 0) goto L_0x0952
            java.lang.String r8 = "femaleCheckable"
            goto L_0x005c
        L_0x0952:
            boolean r0 = r0.isChecked()
            if (r0 != 0) goto L_0x0bbc
            com.instagram.igds.components.checkbox.IgdsCheckBox r0 = r1.A09
            if (r0 != 0) goto L_0x0bc6
            java.lang.String r8 = "maleCheckable"
            goto L_0x005c
        L_0x0960:
            r1 = -1897555946(0xffffffff8ee59816, float:-5.6599312E-30)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            X.Uac r4 = (X.C15328Uac) r4
            boolean r1 = r4.A0Y
            if (r1 == 0) goto L_0x097f
            android.content.Context r2 = r4.requireContext()
            java.lang.String r1 = r4.A0O
            java.lang.String r0 = r4.A0N
            X.W3M.A04(r2, r1, r0)
        L_0x097a:
            r0 = 37536692(0x23cc3b4, float:1.3868223E-37)
            goto L_0x0d69
        L_0x097f:
            java.lang.Object r0 = r0.A01
            com.instagram.business.promote.model.SuggestedPromotion r0 = (com.instagram.business.promote.model.SuggestedPromotion) r0
            java.lang.String r3 = r0.A05
            if (r3 == 0) goto L_0x099b
            com.instagram.business.promote.model.InstagramPromoteSuggestionReason r0 = r0.A00
            if (r0 == 0) goto L_0x0997
            java.lang.String r2 = r0.toString()
            java.lang.String r1 = "ads_manager_suggested_post"
            java.lang.String r0 = "suggested_post"
            X.C15328Uac.A0D(r4, r1, r3, r0, r2)
            goto L_0x097a
        L_0x0997:
            java.lang.String r8 = "reason"
            goto L_0x005c
        L_0x099b:
            java.lang.String r8 = "organicMediaIgId"
            goto L_0x005c
        L_0x099f:
            r1 = -2118578571(0xffffffff81b90e75, float:-6.797901E-38)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A02
            X.Uac r6 = (X.C15328Uac) r6
            java.lang.Object r3 = r0.A01
            java.util.AbstractCollection r3 = (java.util.AbstractCollection) r3
            java.lang.String r0 = "null cannot be cast to non-null type com.google.common.collect.ImmutableList<com.instagram.graphql.instagramschema.AdToolsHighlightsHubQueryResponse.XigUserByIgidV2.IgAdvertiser.IgAdvertiserSettings.IgBoostHighlightsHub.AvailableItems>"
            X.0qQ.A0C(r3, r0)
            X.VwK r2 = r6.A07
            r8 = 0
            if (r2 == 0) goto L_0x0a8c
            r4 = 0
            java.lang.String r1 = "ads_manager_highlights_hub"
            java.lang.String r0 = "highlights_hub_see_all"
            r2.A0A(r1, r0, r4, r4)
            java.util.Iterator r7 = r3.iterator()
        L_0x09c4:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0a4b
            java.lang.Object r3 = r7.next()
            r2 = r3
            X.3FZ r2 = (X.AnonymousClass3FZ) r2
            X.Uz6 r1 = X.C16670Uz6.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "item_action"
            java.lang.Enum r1 = r2.A04(r0, r1)
            X.Uz6 r0 = X.C16670Uz6.RESUME_AD
            if (r1 != r0) goto L_0x09c4
        L_0x09dd:
            X.3FZ r3 = (X.AnonymousClass3FZ) r3
            java.util.List r1 = r6.A0c
            if (r3 == 0) goto L_0x0a49
            java.lang.String r0 = "organic_media_ig_id"
            java.lang.String r3 = r3.A05(r0)
        L_0x09e9:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            if (r3 == 0) goto L_0x0a47
            java.util.Iterator r2 = r1.iterator()
        L_0x09f3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0a47
            java.lang.Object r1 = r2.next()
            X.X9b r1 = (X.C21004X9b) r1
            java.lang.String r0 = r1.BYo()
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 == 0) goto L_0x09f3
            X.WOi r1 = (X.C19176WOi) r1
        L_0x0a0b:
            X.C13990Tnq.A0h()
            if (r1 == 0) goto L_0x0a44
            java.lang.String r8 = r1.BYo()
            java.lang.String r3 = r1.A0L
            if (r3 == 0) goto L_0x0a4d
            java.lang.String r2 = r1.A0F
        L_0x0a1a:
            android.os.Bundle r1 = X.C51971G9r.A0N(r8)
            java.lang.String r0 = "page_id"
            r1.putString(r0, r3)
            java.lang.String r0 = "boosted_id"
            r1.putString(r0, r2)
            X.UZU r3 = new X.UZU
            r3.<init>()
            androidx.fragment.app.FragmentActivity r2 = X.DbU.A0I(r1, r3, r6)
            X.0eM r0 = r6.A0f
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.6Yo r0 = new X.6Yo
            r0.<init>(r2, r1)
            X.Dba.A0w(r4, r3, r0)
            r0 = 170534552(0xa2a2698, float:8.192461E-33)
            goto L_0x0d69
        L_0x0a44:
            r3 = r8
            r2 = r8
            goto L_0x0a1a
        L_0x0a47:
            r1 = 0
            goto L_0x0a0b
        L_0x0a49:
            r3 = r8
            goto L_0x09e9
        L_0x0a4b:
            r3 = r8
            goto L_0x09dd
        L_0x0a4d:
            java.lang.String r8 = "pageId"
            goto L_0x005c
        L_0x0a51:
            r1 = 1398869384(0x53610d88, float:9.6659466E11)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A02
            X.UZU r5 = (X.UZU) r5
            X.VwK r4 = r5.A00
            if (r4 == 0) goto L_0x0a8c
            java.lang.Object r0 = r0.A01
            X.UzG r0 = (X.C16680UzG) r0
            java.lang.String r3 = X.W3M.A01(r0)
            r2 = 0
            java.lang.String r0 = "ads_manager_highlights_hub"
            r4.A0A(r0, r3, r2, r2)
            X.1Yh r4 = X.C18138VmE.A00()
            X.0eM r0 = r5.A0B
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            r0 = 1412(0x584, float:1.979E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.A09(r2, r3, r0)
            r0 = -561459323(0xffffffffde88cf85, float:-4.9291222E18)
        L_0x0a88:
            X.AnonymousClass0fD.A0C(r0, r1)
            return
        L_0x0a8c:
            java.lang.String r8 = "adsManagerLogger"
            goto L_0x005c
        L_0x0a90:
            r1 = 1621730095(0x60a9a32f, float:9.778932E19)
            int r4 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A01
            X.Uac r5 = (X.C15328Uac) r5
            java.lang.Object r6 = r0.A02
            X.V42 r6 = (X.V42) r6
            X.V42 r0 = r5.A0A
            r3 = 0
            if (r0 == 0) goto L_0x0ab1
            java.lang.String r1 = r0.A05
            if (r1 == 0) goto L_0x0ab1
            X.WSw r0 = r5.A0F
            if (r0 == 0) goto L_0x0b75
            java.util.Set r0 = r0.A00
            r0.add(r1)
        L_0x0ab1:
            X.VrO r2 = r5.A0G
            if (r2 == 0) goto L_0x0b71
            r0 = 68
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0xG r1 = new X.0xG
            r1.<init>(r0)
            r0 = 2686(0xa7e, float:3.764E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0xI r1 = X.0xI.A00(r1, r0)
            X.0qQ.A0A(r1)
            X.C18419VrO.A00(r6, r2, r1)
            com.instagram.common.session.UserSession r0 = r2.A00
            X.DbU.A1R(r1, r0)
            r5.A0A = r3
            X.C15328Uac.A08(r5)
            r0 = 1721390834(0x669a56f2, float:3.6442415E23)
        L_0x0add:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x0ae1:
            r1 = -120049784(0xfffffffff8d82f88, float:-3.507813E34)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A01
            X.Uac r4 = (X.C15328Uac) r4
            java.lang.Object r6 = r0.A02
            X.V42 r6 = (X.V42) r6
            r9 = 0
            X.V42 r0 = r4.A0A
            r5 = 0
            if (r0 == 0) goto L_0x0b03
            java.lang.String r1 = r0.A05
            if (r1 == 0) goto L_0x0b03
            X.WSw r0 = r4.A0F
            if (r0 == 0) goto L_0x0b75
            java.util.Set r0 = r0.A00
            r0.add(r1)
        L_0x0b03:
            X.VrO r3 = r4.A0G
            if (r3 == 0) goto L_0x0b71
            r0 = 68
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0xG r1 = new X.0xG
            r1.<init>(r0)
            java.lang.String r0 = "aymt_click"
            X.0xI r1 = X.0xI.A00(r1, r0)
            X.0qQ.A0A(r1)
            X.C18419VrO.A00(r6, r3, r1)
            com.instagram.common.session.UserSession r0 = r3.A00
            X.DbU.A1R(r1, r0)
            r4.A0A = r5
            X.C15328Uac.A08(r4)
            java.lang.String r8 = r6.A03
            if (r8 == 0) goto L_0x0b51
            android.net.Uri r3 = X.DbT.A09(r8)
            java.lang.String r1 = r3.getScheme()
            java.lang.String r0 = "instagram"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0b58
            X.14C r0 = X.AnonymousClass14B.A03
            X.14B r1 = r0.A00()
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            android.content.Intent r1 = r1.A04(r0, r3)
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            X.0kR.A0B(r0, r1)
        L_0x0b51:
            r0 = -322627132(0xffffffffecc519c4, float:-1.9062405E27)
        L_0x0b54:
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x0b58:
            androidx.fragment.app.FragmentActivity r5 = r4.requireActivity()
            X.0eM r0 = r4.A0f
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            X.2EG r7 = X.2EG.A34
            X.SUL r4 = new X.SUL
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.String r0 = "promote_ads_manager_fragment"
            r4.A0S = r0
            r4.A0A()
            goto L_0x0b51
        L_0x0b71:
            java.lang.String r8 = "aymtLogger"
            goto L_0x005c
        L_0x0b75:
            java.lang.String r8 = "aymtCache"
            goto L_0x005c
        L_0x0b79:
            java.lang.String r0 = "Missing required params"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0b81:
            java.lang.Object r5 = r0.A01
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            java.lang.Object r4 = r0.A02
            X.8ab r3 = X.DbW.A0U(r5)
            r0 = 2131963380(0x7f132df4, float:1.9563512E38)
            r3.A09(r0)
            r0 = 2131963379(0x7f132df3, float:1.956351E38)
            r3.A08(r0)
            r2 = 1
            r3.A0r(r2)
            r3.A0s(r2)
            r0 = 2131963365(0x7f132de5, float:1.9563481E38)
            java.lang.String r1 = r5.getString(r0)
            X.W4v r0 = new X.W4v
            r0.<init>(r2, r5, r4)
            r3.A0d(r0, r1)
            r1 = 2
            X.FHc r0 = new X.FHc
            r0.<init>(r1)
            X.DbX.A16(r0, r3)
            return
        L_0x0bb7:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x0bbc:
            com.google.common.collect.ImmutableList r0 = X.C15277UZf.A00(r1)
            r1.A0C = r0
            X.C15277UZf.A01(r1)
            goto L_0x0bd0
        L_0x0bc6:
            boolean r0 = r0.isChecked()
            if (r0 != 0) goto L_0x0bbc
            r0 = 1
            r2.setChecked(r0)
        L_0x0bd0:
            r0 = 678438571(0x287026ab, float:1.3331061E-14)
            goto L_0x0d9f
        L_0x0bd5:
            r1 = 698076923(0x299bcefb, float:6.919288E-14)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            android.widget.CompoundButton r3 = (android.widget.CompoundButton) r3
            r3.toggle()
            java.lang.Object r2 = r0.A02
            X.UZT r2 = (X.UZT) r2
            com.instagram.igds.components.checkbox.IgdsCheckBox r0 = r2.A05
            r1 = 1
            if (r0 == 0) goto L_0x0bfa
            boolean r0 = r0.isChecked()
            if (r0 != r1) goto L_0x0bfa
        L_0x0bf2:
            X.UZT.A01(r2)
        L_0x0bf5:
            r0 = -812936844(0xffffffffcf8b9174, float:-4.6831309E9)
            goto L_0x0d69
        L_0x0bfa:
            com.instagram.igds.components.checkbox.IgdsCheckBox r0 = r2.A06
            if (r0 == 0) goto L_0x0c05
            boolean r0 = r0.isChecked()
            if (r0 != r1) goto L_0x0c05
            goto L_0x0bf2
        L_0x0c05:
            r3.setChecked(r1)
            goto L_0x0bf5
        L_0x0c09:
            r1 = -1222710341(0xffffffffb71eebbb, float:-9.472419E-6)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            X.UA1 r4 = (X.UA1) r4
            X.WYX r7 = r4.A02
            java.lang.Long r6 = r4.A05
            java.lang.Object r0 = r0.A01
            X.UBe r0 = (X.C14825UBe) r0
            X.U5O r0 = r0.A00
            java.lang.Object r0 = r0.getTag()
            java.lang.String r3 = r0.toString()
            java.lang.String r2 = "lead_gen_form_list"
            java.lang.String r1 = "preview"
            java.lang.String r0 = "click"
            X.1Ln r2 = X.WYX.A00(r7, r6, r2, r1, r0)
            java.lang.Long r1 = X.DbZ.A0d(r3)
            java.lang.String r0 = "lead_form_id"
            r2.A0Q(r0, r1)
            r2.Cgf()
            androidx.fragment.app.FragmentActivity r2 = r4.A01
            X.Vl8 r1 = X.C13990Tnq.A0N()
            r0 = 0
            X.Umm r1 = r1.A04(r0, r0)
            com.instagram.business.promote.model.PromoteData r0 = r4.A04
            com.instagram.common.session.UserSession r0 = r0.A0y
            X.DbY.A14(r1, r2, r0)
            r0 = 146154324(0x8b62354, float:1.0962032E-33)
            goto L_0x0d69
        L_0x0c53:
            r1 = 1467834629(0x577d6105, float:2.78593138E14)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.U55 r2 = (X.U55) r2
            java.lang.Object r0 = r0.A01
            android.view.View r0 = (android.view.View) r0
            int r3 = r0.getId()
            int r1 = r2.A00
            r0 = 0
            if (r3 != r1) goto L_0x0c84
            r2.A00 = r0
            java.util.List r0 = r2.A01
            java.util.Iterator r2 = r0.iterator()
        L_0x0c73:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0ca8
            java.lang.Object r1 = r2.next()
            X.U52 r1 = (X.U52) r1
            r0 = 0
            r1.setBarSelected(r0)
            goto L_0x0c73
        L_0x0c84:
            r2.A00 = r3
            java.util.List r0 = r2.A01
            java.util.Iterator r2 = r0.iterator()
        L_0x0c8c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0ca8
            java.lang.Object r1 = r2.next()
            X.U52 r1 = (X.U52) r1
            int r0 = r1.getId()
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.setBarSelected(r0)
            goto L_0x0c8c
        L_0x0ca8:
            r0 = 395452671(0x179220ff, float:9.443358E-25)
            goto L_0x0d69
        L_0x0cad:
            r1 = 1950545521(0x7442f671, float:6.1786134E31)
            int r3 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A01
            X.ULk r1 = (X.ULk) r1
            X.4uI r2 = r1.A01
            if (r2 == 0) goto L_0x0cc4
            java.lang.Object r1 = r0.A02
            X.UcJ r1 = (X.C15407UcJ) r1
            r0 = 0
            X.C15407UcJ.A01(r1, r2, r0)
        L_0x0cc4:
            r0 = -1720045724(0xffffffff997a2f64, float:-1.29342675E-23)
            goto L_0x0d9f
        L_0x0cc9:
            r1 = 147836809(0x8cfcf89, float:1.2507151E-33)
            int r3 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A02
            X.UYf r6 = (X.C15265UYf) r6
            X.VRO r1 = r6.A00
            if (r1 == 0) goto L_0x0cf7
            java.lang.Object r0 = r0.A01
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.String r5 = X.AnonymousClass7TF.A0f(r0)
            r4 = 0
            X.0qQ.A0B(r5, r4)
            X.6Rx r2 = r1.A00
            X.4uI r1 = r1.A01
            X.6Tl r0 = new X.6Tl
            r0.<init>()
            X.DbX.A1P(r2, r0, r1, r5, r4)
            X.0hq r0 = r6.getParentFragmentManager()
            r0.A13()
        L_0x0cf7:
            r0 = 1900950137(0x714e3279, float:1.0210389E30)
            goto L_0x0d9f
        L_0x0cfc:
            r1 = 529137063(0x1f89fda7, float:5.844139E-20)
            int r3 = A00(r0, r1)
            r0 = 291737627(0x1163901b, float:1.7951548E-28)
            goto L_0x0d9f
        L_0x0d08:
            r1 = 1291902478(0x4d00de0e, float:1.35127264E8)
            int r3 = A00(r0, r1)
            r0 = -1269706785(0xffffffffb451cfdf, float:-1.9540265E-7)
            goto L_0x0d9f
        L_0x0d14:
            r1 = 788993151(0x2f07147f, float:1.228546E-10)
            int r3 = A00(r0, r1)
            r0 = 722083140(0x2b0a1d44, float:4.9068063E-13)
            goto L_0x0d9f
        L_0x0d20:
            r1 = -873114049(0xffffffffcbf5563f, float:-3.2156798E7)
            int r3 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A02
            X.R8Z r1 = (X.R8Z) r1
            java.lang.Object r4 = r0.A01
            X.Ud3 r2 = r1.A00
            java.util.HashMap r0 = r2.A00
            java.lang.Object r1 = r0.get(r4)
            X.VLy r1 = (X.C17194VLy) r1
            if (r1 != 0) goto L_0x0d41
            X.VLy r1 = new X.VLy
            r1.<init>()
            r0.put(r4, r1)
        L_0x0d41:
            boolean r0 = r1.A00
            r0 = r0 ^ 1
            r1.A00 = r0
            X.C15452Ud3.A00(r2)
            r0 = -1074411042(0xffffffffbff5c9de, float:-1.920223)
            goto L_0x0d9f
        L_0x0d4e:
            r1 = 1185996696(0x46b0df98, float:22639.797)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            android.view.View r4 = (android.view.View) r4
            android.content.Context r1 = r4.getContext()
            r0 = r1
            X.Q6H r0 = (X.Q6H) r0
            X.X2e r3 = X.C13990Tnq.A0K(r4, r0)
            if (r3 != 0) goto L_0x0d6d
            r0 = -1004794363(0xffffffffc41c0e05, float:-624.21906)
        L_0x0d69:
            X.AnonymousClass0fD.A0C(r0, r5)
            return
        L_0x0d6d:
            int r2 = com.facebook.react.uimanager.UIManagerHelper.A00(r1)
            int r1 = r4.getId()
            X.UT9 r0 = new X.UT9
            r0.<init>(r2, r1)
            r3.APe(r0)
            r0 = -132083526(0xfffffffff82090ba, float:-1.3026608E34)
            goto L_0x0d69
        L_0x0d81:
            r1 = -1273257568(0xffffffffb41ba1a0, float:-1.4494299E-7)
            int r3 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A02
            X.WDZ r1 = (X.WDZ) r1
            android.view.Window$Callback r2 = r1.A07
            if (r2 == 0) goto L_0x0d9c
            boolean r1 = r1.A0D
            if (r1 == 0) goto L_0x0d9c
            r1 = 0
            java.lang.Object r0 = r0.A01
            X.WDl r0 = (X.C18933WDl) r0
            r2.onMenuItemSelected(r1, r0)
        L_0x0d9c:
            r0 = 731736577(0x2b9d6a01, float:1.1184943E-12)
        L_0x0d9f:
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WBH.onClick(android.view.View):void");
    }

    public static int A00(WBH wbh, int i) {
        VM1 vm1;
        int A05 = AnonymousClass0fD.A05(i);
        String str = ((C15032UKl) wbh.A01).A01;
        if (!(str == null || (vm1 = ((C17825Vge) wbh.A02).A01) == null)) {
            UYH uyh = vm1.A00;
            C20946X5p x5p = uyh.A04;
            if (x5p == null) {
                0qQ.A0F("arCommerceDataStoreProvider");
                throw AnonymousClass00P.createAndThrow();
            }
            x5p.E4n().CIa(uyh.requireActivity(), str);
        }
        return A05;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WDl, java.lang.Object] */
    public WBH(WDZ wdz) {
        this.A00 = 1;
        this.A02 = wdz;
        Context context = wdz.A09.getContext();
        CharSequence charSequence = wdz.A0C;
        ? obj = new Object();
        obj.A02 = 4096;
        obj.A01 = 4096;
        obj.A04 = null;
        obj.A05 = null;
        obj.A09 = false;
        obj.A0A = false;
        obj.A00 = 16;
        obj.A03 = context;
        obj.A07 = charSequence;
        this.A01 = obj;
    }

    public WBH(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
