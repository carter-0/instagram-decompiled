package X;

import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class KXN extends C19555Wbf {
    public final int A00;
    public final Object A01;

    public KXN(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void D9S(AnonymousClass0iw r7, C66942Mfb mfb, C66967Mg0 mg0) {
        if (2 - this.A00 == 0) {
            0qQ.A0B(mfb, 0);
            C61448K8c k8c = (C61448K8c) this.A01;
            C66632Ma1 ma1 = (C66632Ma1) mfb;
            User A06 = ma1.A06();
            AnonymousClass7TE.A1Z(new MHC((Object) A06, (Object) k8c, (AnonymousClass4D7) null, 33), DbV.A0J(k8c));
            C61448K8c.A00(k8c, AnonymousClass000.A00(2977), ma1.A06().getId());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0093, code lost:
        X.AnonymousClass7TE.A1Z(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0096, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0111, code lost:
        r3.A0K(r0, r2);
        r3.A0P((android.content.DialogInterface.OnClickListener) null, X.C358278ae.DEFAULT, 2131954150);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x011d, code lost:
        X.DbT.A1V(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0120, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DDm(X.C66967Mg0 r7, X.C66632Ma1 r8) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x0168;
                case 1: goto L_0x014f;
                case 2: goto L_0x00d6;
                case 3: goto L_0x0058;
                case 4: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            r0 = 0
            X.0qQ.A0B(r8, r0)
            java.lang.Object r0 = r6.A01
            X.E4F r0 = (X.E4F) r0
            X.0eM r0 = r0.A05
            java.lang.Object r3 = r0.getValue()
            X.Dkq r3 = (X.C46763Dkq) r3
            X.0Ud r0 = r3.A0E
            java.lang.Object r4 = r0.getValue()
            X.KnJ r4 = (X.C62843KnJ) r4
            boolean r0 = r4 instanceof X.C62007KVg
            if (r0 == 0) goto L_0x0005
            X.05G r2 = r3.A0C
        L_0x0024:
            java.lang.Object r1 = r2.getValue()
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0024
            com.instagram.user.model.User r0 = r8.A06()
            java.lang.String r2 = r0.getId()
            X.KVg r4 = (X.C62007KVg) r4
            java.util.List r1 = r4.A00
            com.instagram.user.model.User r0 = r8.A06()
            boolean r0 = r1.contains(r0)
            X.6oS r5 = X.C318116oQ.A00(r3)
            r1 = 0
            if (r0 == 0) goto L_0x0055
            r0 = 14
        L_0x004f:
            X.MFV r4 = new X.MFV
            r4.<init>(r3, r2, r1, r0)
            goto L_0x0093
        L_0x0055:
            r0 = 13
            goto L_0x004f
        L_0x0058:
            r0 = 0
            X.0qQ.A0B(r8, r0)
            com.instagram.user.model.User r0 = r8.A06()
            boolean r0 = r0.A1v()
            if (r0 != 0) goto L_0x0005
            com.instagram.user.model.User r0 = r8.A06()
            X.4Cl r0 = r0.A03
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r0 = r0.AcG()
            if (r0 == 0) goto L_0x007f
            int r1 = r0.ordinal()
            r0 = 5
            if (r1 == r0) goto L_0x00b5
            r0 = 3
            if (r1 == r0) goto L_0x0097
            r0 = 4
            if (r1 == r0) goto L_0x0005
        L_0x007f:
            java.lang.Object r3 = r6.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            com.instagram.user.model.User r2 = r8.A06()
            X.0xx r5 = X.DbV.A0J(r3)
            r1 = 0
            r0 = 37
            X.MHC r4 = new X.MHC
            r4.<init>((java.lang.Object) r2, (java.lang.Object) r3, (X.AnonymousClass4D7) r1, (int) r0)
        L_0x0093:
            X.AnonymousClass7TE.A1Z(r4, r5)
            return
        L_0x0097:
            java.lang.Object r0 = r6.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.8ab r3 = X.DbW.A0U(r0)
            r0 = 2131954168(0x7f1309f8, float:1.9544828E38)
            r3.A09(r0)
            r0 = 2131954167(0x7f1309f7, float:1.9544826E38)
            r3.A08(r0)
            r2 = 2131968772(0x7f134304, float:1.9574448E38)
            r1 = 0
            X.8ae r0 = X.C358278ae.DEFAULT
            r3.A0P(r1, r0, r2)
            goto L_0x011d
        L_0x00b5:
            java.lang.Object r4 = r6.A01
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            com.instagram.user.model.User r1 = r8.A06()
            X.8ab r3 = X.DbW.A0U(r4)
            r0 = 2131954149(0x7f1309e5, float:1.954479E38)
            r3.A09(r0)
            r0 = 2131954148(0x7f1309e4, float:1.9544787E38)
            r3.A08(r0)
            r2 = 2131954147(0x7f1309e3, float:1.9544785E38)
            r0 = 6
            X.LV0 r0 = X.LV0.A00(r1, r4, r0)
            goto L_0x0111
        L_0x00d6:
            X.AnonymousClass7TG.A1N(r8, r7)
            java.lang.String r1 = r7.A09
            java.lang.String r0 = "approval_search_item_state_source"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0121
            com.instagram.user.model.User r0 = r8.A06()
            X.4Cl r0 = r0.A03
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r1 = r0.Afa()
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r0 = com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus.REQUEST_ONCE_GRANTED
            java.lang.Object r5 = r6.A01
            X.K8c r5 = (X.C61448K8c) r5
            if (r1 != r0) goto L_0x017b
            com.instagram.user.model.User r1 = r8.A06()
            X.8ab r3 = X.DbW.A0U(r5)
            r0 = 2131971987(0x7f134f93, float:1.9580969E38)
            r3.A09(r0)
            r0 = 2131971986(0x7f134f92, float:1.9580967E38)
            r3.A08(r0)
            r2 = 2131972005(0x7f134fa5, float:1.9581005E38)
            r0 = 5
            X.LV0 r0 = X.LV0.A00(r1, r5, r0)
        L_0x0111:
            r3.A0K(r0, r2)
            r2 = 2131954150(0x7f1309e6, float:1.9544791E38)
            X.8ae r1 = X.C358278ae.DEFAULT
            r0 = 0
            r3.A0P(r0, r1, r2)
        L_0x011d:
            X.DbT.A1V(r3)
            return
        L_0x0121:
            java.lang.String r0 = "request_search_item_state_source"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0005
            java.lang.Object r5 = r6.A01
            X.K8c r5 = (X.C61448K8c) r5
            com.instagram.user.model.User r4 = r8.A06()
            X.0xx r3 = X.DbV.A0J(r5)
            r2 = 0
            r1 = 30
            X.MHC r0 = new X.MHC
            r0.<init>((java.lang.Object) r4, (java.lang.Object) r5, (X.AnonymousClass4D7) r2, (int) r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            com.instagram.user.model.User r0 = r8.A06()
            java.lang.String r1 = r0.getId()
            r0 = 2619(0xa3b, float:3.67E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x0198
        L_0x014f:
            r0 = 0
            X.0qQ.A0B(r8, r0)
            java.lang.Object r0 = r6.A01
            X.K8Z r0 = (X.K8Z) r0
            X.0eM r0 = r0.A05
            java.lang.Object r2 = r0.getValue()
            X.JjM r2 = (X.C60318JjM) r2
            com.instagram.user.model.User r1 = r8.A06()
            r0 = 0
            r2.A06(r0, r1)
            return
        L_0x0168:
            r0 = 0
            X.0qQ.A0B(r8, r0)
            java.lang.Object r1 = r6.A01
            X.K8a r1 = (X.C61446K8a) r1
            com.instagram.user.model.User r0 = r8.A06()
            X.C61446K8a.A02(r1, r0)
            X.JTU.A19(r1)
            return
        L_0x017b:
            com.instagram.user.model.User r4 = r8.A06()
            X.0xx r3 = X.DbV.A0J(r5)
            r2 = 0
            r1 = 31
            X.MHC r0 = new X.MHC
            r0.<init>((java.lang.Object) r4, (java.lang.Object) r5, (X.AnonymousClass4D7) r2, (int) r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            com.instagram.user.model.User r0 = r8.A06()
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = "approve_creator"
        L_0x0198:
            X.C61448K8c.A00(r5, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KXN.DDm(X.Mg0, X.Ma1):void");
    }

    public final void Dw5(AnonymousClass0iw r18, C66967Mg0 mg0, C66632Ma1 ma1) {
        UserSession userSession;
        FragmentActivity fragmentActivity;
        String str;
        String str2;
        AnonymousClass0iw r5 = r18;
        C66967Mg0 mg02 = mg0;
        C66632Ma1 ma12 = ma1;
        switch (this.A00) {
            case 0:
                AnonymousClass7TG.A1T(ma12, mg02, r5);
                C61446K8a k8a = (C61446K8a) this.A01;
                if (AnonymousClass430.A02(k8a.A06())) {
                    C61446K8a.A02(k8a, ma12.A06());
                    JTU.A19(k8a);
                    return;
                }
                return;
            case 1:
                AnonymousClass7TG.A1T(ma12, mg02, r5);
                K8Z k8z = (K8Z) this.A01;
                if (AnonymousClass430.A02(k8z.A06())) {
                    ((C60318JjM) k8z.A05.getValue()).A06((C63597Kzk) null, ma12.A06());
                    return;
                }
                return;
            case 2:
                0qQ.A0B(ma12, 0);
                str = ma12.A06().getId();
                UZ3 uz3 = (UZ3) this.A01;
                userSession = uz3.A06();
                fragmentActivity = uz3.requireActivity();
                str2 = C61448K8c.__redex_internal_original_name;
                break;
            case 3:
                0qQ.A0B(ma12, 0);
                str = ma12.A06().getId();
                UZ3 uz32 = (UZ3) this.A01;
                userSession = uz32.A06();
                fragmentActivity = uz32.requireActivity();
                str2 = C61447K8b.__redex_internal_original_name;
                break;
            case 4:
                0qQ.A0B(ma12, 0);
                String id = ma12.A06().getId();
                E4F e4f = (E4F) this.A01;
                UserSession A0l = AnonymousClass7TE.A0l(e4f.A04);
                FragmentActivity requireActivity = e4f.requireActivity();
                String A002 = AnonymousClass000.A00(3821);
                0qQ.A0B(A0l, 1);
                C46474Dfc.A03(DbU.A0Q(requireActivity, A0l), A0l, C46447Df9.A02(), C46548Dgp.A01(A0l, id, "profile_ads_creator_blocked_account", A002));
                return;
            default:
                C51973G9u.A1E(ma12, mg02, r5);
                User A06 = ma12.A06();
                int i = mg02.A00;
                FGB fgb = (FGB) this.A01;
                C47571E8j e8j = fgb.A00;
                if (e8j == null) {
                    0qQ.A0F("suggestionsAdapter");
                    throw AnonymousClass00P.createAndThrow();
                }
                String str3 = e8j.A00;
                String id2 = A06.getId();
                String username = A06.getUsername();
                UserSession userSession2 = fgb.A0D;
                boolean CO7 = AnonymousClass0BO.A00(userSession2).CO7(A06.getId());
                AnonymousClass0xN A003 = C60510iO.A00(userSession2);
                0xI A004 = 0xI.A00(r5, AnonymousClass000.A00(3803));
                A004.A0C("link_type", PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                A004.A08(Integer.valueOf(i), "position");
                A004.A0C(AnonymousClass000.A00(3503), id2);
                A004.A0C(AnonymousClass000.A00(3505), username);
                if (str3 != null) {
                    A004.A0C("rank_token", str3);
                }
                A004.A09("is_mas", Boolean.valueOf(CO7));
                A003.EFq(A004);
                if (!A06.A2G()) {
                    FGB.A02(fgb, A06);
                    C49241Erk.A00(AnonymousClass0kN.A01(r5, userSession2), userSession2, A06, C273654mx.A00(894), "click", AnonymousClass000.A00(84));
                    return;
                }
                C294435mR.A00(fgb.A06, fgb.A0F, A06.getUsername(), false);
                TextView textView = fgb.A08;
                if (textView != null) {
                    textView.setClickable(true);
                    textView.setSelected(false);
                    return;
                }
                return;
        }
        0qQ.A0B(userSession, 1);
        C46474Dfc.A03(DbU.A0Q(fragmentActivity, userSession), userSession, C46447Df9.A02(), C46548Dgp.A01(userSession, str, "user_list", str2));
    }
}
