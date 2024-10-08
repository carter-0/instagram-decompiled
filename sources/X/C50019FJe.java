package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.FJe  reason: case insensitive filesystem */
public final class C50019FJe implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public C50019FJe(Fragment fragment, 0wc r2, 1P0 r3, UserSession userSession, 1Xj r5, C62320sa r6, int i) {
        this.A00 = i;
        if (8 - i != 0) {
            this.A03 = r5;
            this.A05 = r2;
            this.A06 = userSession;
            this.A01 = fragment;
            this.A04 = r3;
            this.A02 = r6;
        } else {
            this.A04 = r5;
            this.A05 = r2;
            this.A06 = userSession;
            this.A02 = fragment;
            this.A01 = r3;
            this.A03 = r6;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0441, code lost:
        X.0nA.A0I(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0444, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0445, code lost:
        X.C49843F9i.A00 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0447, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x02ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r24, int r25) {
        /*
            r23 = this;
            r0 = r23
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x03c4;
                case 1: goto L_0x0395;
                case 2: goto L_0x019c;
                case 3: goto L_0x0116;
                case 4: goto L_0x02f2;
                case 5: goto L_0x00a9;
                case 6: goto L_0x025f;
                case 7: goto L_0x021a;
                case 8: goto L_0x0153;
                case 9: goto L_0x006c;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r15 = r0.A03
            androidx.fragment.app.Fragment r15 = (androidx.fragment.app.Fragment) r15
            androidx.fragment.app.FragmentActivity r12 = r15.getActivity()
            X.8ae r13 = X.C358278ae.BLUE_BOLD
            java.lang.Object r5 = r0.A06
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r4 = r0.A04
            X.1Xj r4 = (X.1Xj) r4
            java.lang.String r2 = r4.getId()
            if (r2 == 0) goto L_0x0215
            java.lang.String r1 = "FB"
            java.util.List r1 = X.AnonymousClass7TE.A1I(r1)
            X.1OC r18 = X.LSW.A04(r5, r2, r1)
            java.lang.Object r6 = r0.A01
            X.1P0 r6 = (X.1P0) r6
            r3 = 1
            X.2MU r2 = com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository.A09
            android.app.Application r1 = X.DbY.A05(r15)
            com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository r16 = r2.A00(r1, r5)
            X.I8S r7 = new X.I8S
            r14 = r7
            r21 = r3
            r19 = r5
            r20 = r4
            r17 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r2 = r0.A05
            r1 = 59
            X.FJg r8 = X.C50021FJg.A00(r2, r1)
            java.lang.Object r10 = r0.A02
            android.content.DialogInterface$OnDismissListener r10 = (android.content.DialogInterface.OnDismissListener) r10
            r9 = 0
            androidx.fragment.app.FragmentActivity r0 = r15.getActivity()
            X.I9M r11 = X.C56659I6o.A00(r0, r5, r4, r3)
            r17 = 2131966747(0x7f133b1b, float:1.957034E38)
            r18 = 2131957554(0x7f131732, float:1.9551695E38)
            r19 = 2131968513(0x7f134201, float:1.9573923E38)
            r14 = r9
            r15 = r9
            r16 = r9
            X.C56659I6o.A02(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x006b:
            return
        L_0x006c:
            java.lang.Object r1 = r0.A03
            X.1Xj r1 = (X.1Xj) r1
            java.lang.String r7 = r1.getId()
            if (r7 == 0) goto L_0x0412
            java.lang.Object r6 = r0.A05
            X.0wc r6 = (X.0wc) r6
            java.lang.Object r2 = r0.A06
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.String r5 = r2.A06
            java.lang.String r1 = "delete_instagram_only_click"
            X.FEM.A00(r6, r5, r7, r1)
            X.1OC r4 = X.LSW.A03(r2, r7)
            java.lang.Object r3 = r0.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.Object r2 = r0.A04
            X.1P0 r2 = (X.1P0) r2
            X.EUj r1 = new X.EUj
            r1.<init>(r6, r2, r5, r7)
            r4.A00 = r1
            android.content.Context r2 = r3.getContext()
            if (r2 == 0) goto L_0x00a5
            X.0gy r1 = X.AnonymousClass07i.A00(r3)
            X.1ES.A00(r2, r1, r4)
        L_0x00a5:
            java.lang.Object r1 = r0.A02
            goto L_0x0194
        L_0x00a9:
            X.0xm r1 = X.DbS.A0e()
            r3 = 1
            X.0xY r2 = X.DbS.A0d(r1)
            java.lang.String r1 = "has_user_confirmed_dialog"
            r2.E5T(r1, r3)
            r2.apply()
            java.lang.Object r5 = r0.A03
            X.0lg r5 = (X.0lg) r5
            java.lang.Object r1 = r0.A06
            X.DiE r1 = (X.C46634DiE) r1
            java.lang.String r4 = r1.A01
            java.lang.Object r2 = r0.A01
            X.EXD r2 = (X.EXD) r2
            java.lang.Object r1 = r0.A05
            java.lang.Integer r1 = (java.lang.Integer) r1
            X.Dba.A0j(r3, r5, r4)
            r3 = 0
            X.C49920FEv.A00(r5, r2, r3, r1, r4)
            java.lang.Object r1 = r0.A02
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.DbT.A1I(r1)
            android.content.Context r1 = r1.requireContext()
            X.C49913FEl.A02(r1)
            java.lang.Object r1 = r0.A04
            X.G52 r1 = (X.G52) r1
            if (r1 == 0) goto L_0x006b
            X.Ffk r1 = (X.C50629Ffk) r1
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0445;
                case 1: goto L_0x00ef;
                case 2: goto L_0x0417;
                case 3: goto L_0x042e;
                default: goto L_0x00ee;
            }
        L_0x00ee:
            return
        L_0x00ef:
            java.lang.Object r1 = r1.A01
            X.E3V r1 = (X.E3V) r1
            X.C49843F9i.A00()
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r1.A0D
            X.0nA.A0I(r0)
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r1.A0E
            if (r0 == 0) goto L_0x0106
            java.lang.CharSequence r0 = r0.getText()
            r0.toString()
        L_0x0106:
            androidx.fragment.app.FragmentActivity r0 = r1.getActivity()
            if (r0 == 0) goto L_0x006b
            android.view.Window r1 = r0.getWindow()
            r0 = 8192(0x2000, float:1.14794E-41)
            r1.clearFlags(r0)
            return
        L_0x0116:
            java.lang.Object r2 = r0.A04
            X.0wc r2 = (X.0wc) r2
            java.lang.String r1 = "subscription_content_public_preview_upsell_cta"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            java.lang.Object r1 = r0.A02
            X.0iw r1 = (X.AnonymousClass0iw) r1
            java.lang.String r1 = r1.getModuleName()
            X.DbS.A1O(r2, r1)
            java.lang.Object r1 = r0.A03
            X.N49 r1 = (X.N49) r1
            java.lang.String r6 = r1.A00
            X.DbY.A1G(r2, r6)
            r2.Cgf()
            java.lang.Object r1 = r0.A05
            X.0sa r1 = (X.C62320sa) r1
            if (r1 != 0) goto L_0x0198
            X.1Yy r1 = X.FC8.A01()
            java.lang.Object r2 = r0.A01
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            java.lang.Object r3 = r0.A06
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.util.Set r0 = X.C49280EsP.A00
            java.lang.String r7 = "content_preview_attribution"
            r4 = 0
            r5 = r4
            r1.A04(r2, r3, r4, r5, r6, r7)
            return
        L_0x0153:
            java.lang.Object r1 = r0.A04
            X.1Xj r1 = (X.1Xj) r1
            java.lang.String r7 = r1.getId()
            if (r7 == 0) goto L_0x0448
            java.lang.Object r6 = r0.A05
            X.0wc r6 = (X.0wc) r6
            java.lang.Object r2 = r0.A06
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.String r5 = r2.A06
            java.lang.String r1 = "delete_both_click"
            X.FEM.A00(r6, r5, r7, r1)
            java.lang.String r1 = "FB"
            java.util.List r1 = X.AnonymousClass7TE.A1I(r1)
            X.1OC r4 = X.LSW.A04(r2, r7, r1)
            java.lang.Object r3 = r0.A02
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.Object r2 = r0.A01
            X.1P0 r2 = (X.1P0) r2
            X.EUi r1 = new X.EUi
            r1.<init>(r6, r2, r5, r7)
            r4.A00 = r1
            android.content.Context r2 = r3.getContext()
            if (r2 == 0) goto L_0x0192
            X.0gy r1 = X.AnonymousClass07i.A00(r3)
            X.1ES.A00(r2, r1, r4)
        L_0x0192:
            java.lang.Object r1 = r0.A03
        L_0x0194:
            X.0sa r1 = (X.C62320sa) r1
            if (r1 == 0) goto L_0x006b
        L_0x0198:
            r1.invoke()
            return
        L_0x019c:
            java.lang.Object r1 = r0.A06
            X.PA3 r1 = (X.PA3) r1
            X.7XB r3 = r1.A04
            java.lang.Object r4 = r0.A03
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r5 = r0.A02
            X.3su r5 = (X.C254703su) r5
            java.lang.Object r1 = r0.A05
            X.Nbs r1 = (X.C68965Nbs) r1
            X.3su r2 = r1.A00
            com.instagram.model.direct.messageid.DirectMessageIdentifier r6 = r2.A0V()
            long r7 = r2.C7c()
            r3.Euo(r4, r5, r6, r7)
            java.lang.Object r1 = r0.A01
            X.7IS r1 = (X.AnonymousClass7IS) r1
            java.lang.Object r3 = r0.A04
            X.3sy r3 = (X.C254743sy) r3
            java.lang.String r4 = r2.A0h()
            X.0wc r1 = r1.A00
            r0 = 264(0x108, float:3.7E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = "unsend_upsell_try_edit_tapped"
            X.DbS.A1J(r2, r0)
            X.2FW r0 = X.2FW.A1g
            java.lang.String r1 = r0.toString()
            r0 = 1596(0x63c, float:2.236E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.AAJ(r0, r1)
            java.lang.String r0 = "message_id"
            r2.AAJ(r0, r4)
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0u()
            java.lang.String r0 = "is_e2ee"
            r2.A7p(r0, r1)
            java.lang.String r1 = X.C67003Mgb.A01(r3)
            java.lang.String r0 = "open_thread_id"
            r2.AAJ(r0, r1)
            java.lang.Long r1 = X.C67003Mgb.A00(r3)
            r0 = 340(0x154, float:4.76E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A9F(r0, r1)
            r2.Cgf()
            return
        L_0x0215:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x021a:
            java.lang.Object r5 = r0.A06
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r4 = r0.A05
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            java.lang.Object r3 = r0.A03
            com.instagram.api.schemas.GrowthFrictionInterventionDetail r3 = (com.instagram.api.schemas.GrowthFrictionInterventionDetail) r3
            java.lang.Object r2 = r0.A04
            java.lang.Integer r2 = (java.lang.Integer) r2
            r1 = 3
            X.0qQ.A0B(r2, r1)
            java.lang.String r1 = "user_selected_url_button_on_dialog"
            X.FEL.A00(r3, r5, r4, r2, r1)
            X.FEe r2 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            java.lang.Object r1 = r0.A02
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r0.A01
            com.instagram.api.schemas.GrowthFrictionInterventionButton r0 = (com.instagram.api.schemas.GrowthFrictionInterventionButton) r0
            java.lang.String r22 = r0.getUrl()
            r7 = 0
            r9 = 0
            r14 = 1
            com.instagram.simplewebview.SimpleWebViewConfig r6 = new com.instagram.simplewebview.SimpleWebViewConfig
            r8 = r7
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r15 = r9
            r16 = r14
            r17 = r14
            r18 = r9
            r19 = r9
            r20 = r9
            r21 = r7
            r6.<init>((java.lang.String) r7, (java.lang.String) r8, (boolean) r9, (boolean) r10, (boolean) r11, (boolean) r12, (boolean) r13, (boolean) r14, (boolean) r15, (boolean) r16, (boolean) r17, (boolean) r18, (boolean) r19, (boolean) r20, (java.lang.String) r21, (java.lang.String) r22)
            r2.A02(r1, r5, r6)
            return
        L_0x025f:
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r0.A04
            com.instagram.model.reels.Reel r2 = (com.instagram.model.reels.Reel) r2
            java.lang.Object r4 = r0.A03
            X.1Xj r4 = (X.1Xj) r4
            java.lang.Object r1 = r0.A02
            X.07i r1 = (X.AnonymousClass07i) r1
            java.lang.Object r8 = r0.A06
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            java.lang.Object r5 = r0.A05
            X.3BQ r5 = (X.AnonymousClass3BQ) r5
            java.lang.String r6 = "Required value was null."
            r10 = 0
            java.lang.String r0 = r4.getId()     // Catch:{ Exception -> 0x028c }
            if (r0 == 0) goto L_0x0287
            X.L8l r0 = X.JZV.A00(r3, r8, r2, r0)     // Catch:{ Exception -> 0x028c }
            if (r0 == 0) goto L_0x028c
            goto L_0x0293
        L_0x0287:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)     // Catch:{ Exception -> 0x028c }
            throw r0     // Catch:{ Exception -> 0x028c }
        L_0x028c:
            r11 = r10
            r13 = r10
            r16 = 0
            r17 = 0
            goto L_0x02a3
        L_0x0293:
            java.lang.String r11 = r0.A03
            java.util.List r13 = X.JZV.A05(r0)
            com.instagram.common.typedurl.ImageUrl r0 = r0.A02
            int r16 = r0.getHeight()
            int r17 = r0.getWidth()
        L_0x02a3:
            java.lang.String r9 = r2.getId()
            X.0qQ.A07(r9)
            X.Ki3 r7 = X.JZV.A02(r5)
            X.0sl r14 = X.0sl.A00
            java.lang.String r0 = r4.getId()
            if (r0 == 0) goto L_0x02ed
            java.util.Set r15 = java.util.Collections.singleton(r0)
            X.0qQ.A07(r15)
            r12 = r10
            X.1OC r7 = X.AnonymousClass738.A01(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.6ST r6 = X.DbV.A0h(r3)
            boolean r5 = r2.A0l()
            r0 = 2131972143(0x7f13502f, float:1.9581285E38)
            if (r5 == 0) goto L_0x02d2
            r0 = 2131972144(0x7f135030, float:1.9581287E38)
        L_0x02d2:
            java.lang.String r0 = r3.getString(r0)
            X.0qQ.A0A(r0)
            r6.A00(r0)
            r10 = 2
            X.H4f r9 = new X.H4f
            r13 = r8
            r14 = r4
            r15 = r2
            r11 = r6
            r12 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r7.A00 = r9
            X.1ES.A00(r3, r1, r7)
            return
        L_0x02ed:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)
            throw r0
        L_0x02f2:
            java.lang.Object r5 = r0.A01
            X.1Xj r5 = (X.1Xj) r5
            java.lang.Object r4 = r0.A02
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r6 = r0.A03
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r1 = r0.A04
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.Object r9 = r0.A05
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r7 = r0.A06
            X.1P0 r7 = (X.1P0) r7
            com.facebook.common.callercontext.CallerContext r0 = X.C56910IHf.A00
            X.0gy r3 = X.AnonymousClass07i.A00(r1)
            X.1NY r8 = X.DbU.A0N(r4)     // Catch:{ IOException -> 0x0384 }
            r0 = 320(0x140, float:4.48E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x0384 }
            java.lang.String r10 = r5.getId()     // Catch:{ IOException -> 0x0384 }
            r2 = 1
            X.1iA r1 = r5.BR7()     // Catch:{ IOException -> 0x0384 }
            java.lang.Object[] r1 = new java.lang.Object[]{r10, r1}     // Catch:{ IOException -> 0x0384 }
            X.DbU.A1P(r8, r0, r1)     // Catch:{ IOException -> 0x0384 }
            java.lang.String r1 = "media_id"
            java.lang.String r0 = r5.getId()     // Catch:{ IOException -> 0x0384 }
            r8.A9m(r1, r0)     // Catch:{ IOException -> 0x0384 }
            r0 = 2979(0xba3, float:4.174E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x0384 }
            java.lang.String r12 = "IG"
            X.0qQ.A0B(r9, r2)     // Catch:{ IOException -> 0x0384 }
            java.io.StringWriter r11 = new java.io.StringWriter     // Catch:{ IOException -> 0x0384 }
            r11.<init>()     // Catch:{ IOException -> 0x0384 }
            X.17W r10 = X.AnonymousClass7TF.A0K(r11)     // Catch:{ IOException -> 0x0384 }
            r0 = 2978(0xba2, float:4.173E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x0384 }
            X.16P.A03(r10, r0)     // Catch:{ IOException -> 0x0384 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ IOException -> 0x0384 }
        L_0x0354:
            boolean r0 = r9.hasNext()     // Catch:{ IOException -> 0x0384 }
            if (r0 == 0) goto L_0x035e
            X.C41846B3n.A18(r10, r9)     // Catch:{ IOException -> 0x0384 }
            goto L_0x0354
        L_0x035e:
            r10.A0Y()     // Catch:{ IOException -> 0x0384 }
            r0 = 271(0x10f, float:3.8E-43)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ IOException -> 0x0384 }
            r10.A0R(r0, r12)     // Catch:{ IOException -> 0x0384 }
            java.lang.String r0 = X.AnonymousClass7TG.A0k(r10, r11)     // Catch:{ IOException -> 0x0384 }
            r8.A9m(r1, r0)     // Catch:{ IOException -> 0x0384 }
            java.lang.Class<X.K0v> r1 = X.C61284K0v.class
            java.lang.Class<X.LGy> r0 = X.LGy.class
            r8.A0R(r1, r0)     // Catch:{ IOException -> 0x0384 }
            X.1OC r0 = X.DbT.A0U(r8, r2)     // Catch:{ IOException -> 0x0384 }
            if (r7 == 0) goto L_0x0380
            r0.A00 = r7     // Catch:{ IOException -> 0x0384 }
        L_0x0380:
            X.1ES.A00(r6, r3, r0)     // Catch:{ IOException -> 0x0384 }
            goto L_0x038f
        L_0x0384:
            r3 = move-exception
            X.0wj r2 = X.0wj.A01
            r1 = 817891209(0x30c00789, float:1.397198E-9)
            java.lang.String r0 = "MediaOptionsOverflowDeleteHandler.getDeepDeleteMediaOnClickListener"
            X.AnonymousClass7TG.A1I(r2, r0, r3, r1)
        L_0x038f:
            java.lang.String r0 = "delete_from_both"
            X.C48897Elx.A00(r0, r4, r5)
            return
        L_0x0395:
            java.lang.Object r5 = r0.A02
            X.5j1 r5 = (X.AnonymousClass5j1) r5
            java.lang.Object r1 = r0.A05
            X.IUk r1 = (X.C57249IUk) r1
            int r4 = r1.getPosition()
            java.lang.Object r3 = r0.A06
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r1 = r0.A04
            X.3kK r1 = (X.C249763kK) r1
            java.lang.String r2 = r1.getSessionId()
            java.lang.Object r1 = r0.A01
            X.4DU r1 = (X.AnonymousClass4DU) r1
            X.AnonymousClass5ET.A01(r3, r5, r1, r2, r4)
            java.lang.Object r0 = r0.A03
            X.Eyh r0 = (X.C49572Eyh) r0
            X.4ac r3 = X.C266954ac.CLICKED_HIDE
            X.30x r2 = r0.A02
            X.ITb r1 = r0.A00
            X.IUk r0 = r0.A01
            X.C2357130x.A00(r1, r0, r3, r2)
            return
        L_0x03c4:
            java.lang.Object r6 = r0.A01
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r1 = r0.A03
            java.lang.CharSequence[] r1 = (java.lang.CharSequence[]) r1
            r7 = r25
            r1 = r1[r25]
            r5 = 0
            android.widget.Toast r1 = android.widget.Toast.makeText(r6, r1, r5)
            r1.show()
            java.lang.Object r4 = r0.A02
            X.2cW r4 = (X.2cW) r4
            java.lang.Object r1 = r0.A04
            X.4VR r1 = (X.AnonymousClass4VR) r1
            X.4VQ r1 = (X.AnonymousClass4VQ) r1
            X.4UC r1 = r1.A01
            java.lang.String r1 = r1.A0D
            java.lang.String r2 = "/QP/force_mode/"
            java.lang.String r1 = android.net.Uri.encode(r1)
            java.lang.String r3 = X.002.A0R(r2, r1)
            r2 = r4
            com.instagram.quickpromotion.debug.devtool.IGDevToolPersistentStateHandler r2 = (com.instagram.quickpromotion.debug.devtool.IGDevToolPersistentStateHandler) r2
            X.0qQ.A0B(r3, r5)
            monitor-enter(r2)
            X.0eM r1 = r2.A02     // Catch:{ all -> 0x040f }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x040f }
            X.0xa r1 = (X.0xa) r1     // Catch:{ all -> 0x040f }
            X.AnonymousClass7TG.A1M(r1, r3, r7)     // Catch:{ all -> 0x040f }
            monitor-exit(r2)
            java.lang.Object r1 = r0.A06
            X.Vu2 r1 = (X.C18550Vu2) r1
            java.lang.Object r0 = r0.A05
            androidx.preference.PreferenceScreen r0 = (androidx.preference.PreferenceScreen) r0
            r1.A01(r6, r0, r4)
            return
        L_0x040f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0412:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0417:
            java.lang.Object r2 = r1.A01
            X.E3Z r2 = (X.E3Z) r2
            com.instagram.registration.model.RegFlowExtras r0 = r2.A04
            X.EXD r1 = r0.A01()
            X.EXD r0 = X.EXD.A04
            if (r1 == r0) goto L_0x0445
            X.C49843F9i.A00()
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r2.A08
            r0.getClass()
            goto L_0x0441
        L_0x042e:
            java.lang.Object r2 = r1.A01
            X.E3a r2 = (X.C47454E3a) r2
            com.instagram.registration.model.RegFlowExtras r0 = r2.A04
            X.EXD r1 = r0.A01()
            X.EXD r0 = X.EXD.A04
            if (r1 == r0) goto L_0x0445
            X.C49843F9i.A00()
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r2.A08
        L_0x0441:
            X.0nA.A0I(r0)
            return
        L_0x0445:
            X.C49843F9i.A00 = r3
            return
        L_0x0448:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50019FJe.onClick(android.content.DialogInterface, int):void");
    }

    public C50019FJe(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.A00 = i;
        this.A01 = obj5;
        this.A02 = obj4;
        this.A03 = obj;
        this.A04 = obj2;
        this.A05 = obj6;
        this.A06 = obj3;
    }
}
