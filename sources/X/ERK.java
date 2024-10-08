package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;

public final class ERK extends C262934Go {
    public final int A00;
    public final Object A01;

    public ERK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Cv6(float f) {
        C273384mU r0;
        switch (this.A00) {
            case 1:
                DirectPrivateStoryRecipientController directPrivateStoryRecipientController = ((L1O) this.A01).A00;
                directPrivateStoryRecipientController.A0a = true;
                DirectPrivateStoryRecipientController.A05(directPrivateStoryRecipientController);
                return;
            case 3:
                return;
            case 6:
                C10820Ryg ryg = (C10820Ryg) this.A01;
                if (ryg.A00 && (r0 = ryg.A05) != null) {
                    r0.EHd();
                }
                ryg.A01 = false;
                return;
            default:
                super.Cv6(f);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x025b, code lost:
        r2.A07 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x025d, code lost:
        X.E25.A02(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x026f, code lost:
        r1.A0E(r0);
        r1.A0r(false);
        X.DbT.A1V(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x027a, code lost:
        X.0qQ.A0F("qplLogger");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007f, code lost:
        if (r14 == X.2FW.A1z) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x015e, code lost:
        r2.A0D = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0160, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b8, code lost:
        X.0qQ.A0F(r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D9d() {
        /*
            r25 = this;
            r1 = r25
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0016;
                case 1: goto L_0x028f;
                case 2: goto L_0x02a1;
                case 3: goto L_0x0027;
                case 4: goto L_0x012d;
                case 5: goto L_0x027f;
                case 6: goto L_0x02cb;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r1.A01
            X.E6Y r1 = (X.E6Y) r1
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x0015
            r0 = 0
            r1.A08 = r0
            X.E6Y.A02(r1)
        L_0x0015:
            return
        L_0x0016:
            java.lang.Object r1 = r1.A01
            X.ERb r1 = (X.C48014ERb) r1
            boolean r0 = r1.A09
            if (r0 != 0) goto L_0x0015
            X.F1f r1 = r1.A01
            if (r1 != 0) goto L_0x02da
            X.DbS.A12()
            goto L_0x0141
        L_0x0027:
            java.lang.Object r6 = r1.A01
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r6 = (com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment) r6
            com.instagram.common.session.UserSession r0 = r6.A0G
            X.FYj r14 = X.C48380Edb.A00(r0)
            java.lang.String r1 = r6.A0y
            long r19 = java.lang.System.currentTimeMillis()
            boolean r0 = r6.A1H
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r0)
            r15 = 0
            r10 = 0
            r17 = r15
            r21 = r10
            r18 = r1
            r14.A00(r15, r16, r17, r18, r19, r21)
            X.LRm r0 = r6.A0Y
            r0.A08()
            X.FZ0 r0 = r6.A0W
            if (r0 == 0) goto L_0x0054
            r0.A07()
        L_0x0054:
            X.Etp r9 = r6.A0M
            com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel r0 = r6.A0P
            X.05G r0 = r0.A0h
            java.lang.Object r8 = r0.getValue()
            java.util.List r8 = (java.util.List) r8
            X.2FW r14 = r6.A0i
            com.instagram.common.session.UserSession r7 = r6.A0G
            r11 = 1
            r13 = 65
            X.0qQ.A0B(r14, r11)
            r0 = 2
            r12 = 34
            X.0qQ.A0B(r7, r0)
            X.2FW r0 = X.2FW.A1a
            if (r14 == r0) goto L_0x0081
            X.2FW r0 = X.2FW.A1Z
            if (r14 == r0) goto L_0x0081
            X.2FW r0 = X.2FW.A1Y
            if (r14 == r0) goto L_0x0081
            X.2FW r0 = X.2FW.A1z
            r1 = 0
            if (r14 != r0) goto L_0x0082
        L_0x0081:
            r1 = 1
        L_0x0082:
            if (r8 == 0) goto L_0x0119
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0119
            if (r1 == 0) goto L_0x0119
            X.0Tu r2 = X.0Tu.A05
            r0 = 36313205458339647(0x8102ab0000073f, double:3.0279555811712605E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0119
            X.6ar r4 = X.C310356ar.A05
            android.content.Context r0 = r9.A00
            r1 = 2131973117(0x7f1353fd, float:1.958326E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r0, r1)
            r1 = 2131960701(0x7f13237d, float:1.9558078E38)
            java.lang.String r5 = X.AnonymousClass7TE.A16(r0, r1)
            int r1 = r8.size()
            r2 = 0
            if (r1 != r11) goto L_0x00ea
            java.lang.Object r1 = r8.get(r10)
            com.instagram.model.direct.DirectShareTarget r1 = (com.instagram.model.direct.DirectShareTarget) r1
            java.util.List r15 = X.DbW.A0m(r1)
            r1 = 2131960699(0x7f13237b, float:1.9558074E38)
            java.lang.String r5 = r0.getString(r1)
            X.6ar r4 = X.C310356ar.CIRCULAR
            java.lang.Object r1 = r15.get(r10)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r1 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r1
            com.instagram.common.typedurl.ImageUrl r1 = r1.A03
            r10 = 2131960309(0x7f1321f5, float:1.9557283E38)
            java.lang.String r3 = X.DcW.A01(r8)
            java.lang.String r3 = X.DbW.A0h(r0, r3, r10)
            int r0 = r15.size()
            if (r0 <= r11) goto L_0x00e8
            java.lang.Object r0 = r15.get(r11)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r0
            com.instagram.common.typedurl.ImageUrl r2 = r0.A03
            X.6ar r4 = X.C310356ar.AVATAR
        L_0x00e8:
            r15 = r2
            r2 = r1
        L_0x00ea:
            X.Ekd r0 = X.C48815Ekd.$redex_init_class
            int r0 = r14.ordinal()
            if (r0 == r13) goto L_0x012a
            if (r0 == r12) goto L_0x0127
            java.lang.String r14 = "ig_shopping_share_collection_confirmation_toast"
        L_0x00f6:
            X.6ap r1 = X.DbS.A0a()
            r1.A0B = r4
            r1.A06()
            r1.A0L = r11
            r1.A09 = r2
            r1.A07 = r15
            r1.A0D = r3
            r1.A0D(r5)
            X.FdD r0 = new X.FdD
            r15 = r8
            r10 = r0
            r11 = r6
            r12 = r7
            r13 = r9
            r10.<init>(r11, r12, r13, r14, r15)
            r1.A0A = r0
            X.DbY.A1N(r1)
        L_0x0119:
            X.Ew1 r0 = r6.A0I
            if (r0 == 0) goto L_0x0015
            X.K66 r2 = r0.A01
            android.content.Intent r1 = r0.A00
            r0 = 9685(0x25d5, float:1.3572E-41)
            X.K66.A0A(r1, r2, r0)
            return
        L_0x0127:
            java.lang.String r14 = "ig_shopping_share_product_confirmation_toast"
            goto L_0x00f6
        L_0x012a:
            java.lang.String r14 = "ig_shopping_share_shop_confirmation_toast"
            goto L_0x00f6
        L_0x012d:
            java.lang.Object r2 = r1.A01
            X.E25 r2 = (X.E25) r2
            java.lang.Integer r0 = r2.A0D
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            r9 = 0
            if (r0 == r8) goto L_0x0149
            com.instagram.ui.widget.edittext.ConfirmationCodeEditText r0 = r2.A0A
            if (r0 != 0) goto L_0x0146
            java.lang.String r4 = "confirmationCodeEditText"
        L_0x013e:
            X.0qQ.A0F(r4)
        L_0x0141:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0146:
            X.0nA.A0Q(r0)
        L_0x0149:
            java.lang.Integer r0 = r2.A0D
            if (r0 == 0) goto L_0x0015
            int r1 = r0.intValue()
            java.lang.String r7 = "loggedOutSession"
            java.lang.String r4 = "smsNotAllowedReason"
            r11 = 0
            java.lang.String r0 = "qplLogger"
            r3 = 203167632(0xc1c1790, float:1.2024893E-31)
            switch(r1) {
                case 0: goto L_0x0246;
                case 1: goto L_0x020f;
                case 2: goto L_0x01f7;
                case 3: goto L_0x0203;
                case 4: goto L_0x01a1;
                case 5: goto L_0x0161;
                case 6: goto L_0x021d;
                default: goto L_0x015e;
            }
        L_0x015e:
            r2.A0D = r9
            return
        L_0x0161:
            com.facebook.quicklog.QuickPerformanceLogger r1 = r2.A05
            if (r1 == 0) goto L_0x027a
            java.lang.String r0 = "HELP_CENTER"
            r1.markerPoint(r3, r0)
            X.FEe r6 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            android.content.Context r5 = r2.requireContext()
            X.0aP r4 = r2.A06
            if (r4 == 0) goto L_0x01b8
            r3 = 217(0xd9, float:3.04E-43)
            r1 = 52
            r0 = 49
            java.lang.String r24 = X.Dbq.A05(r3, r1, r0)
            r0 = 2131975702(0x7f135e16, float:1.9588504E38)
            java.lang.String r23 = r2.getString(r0)
            r16 = 1
            com.instagram.simplewebview.SimpleWebViewConfig r8 = new com.instagram.simplewebview.SimpleWebViewConfig
            r10 = r9
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r17 = r11
            r18 = r11
            r19 = r16
            r20 = r11
            r21 = r11
            r22 = r11
            r8.<init>((java.lang.String) r9, (java.lang.String) r10, (boolean) r11, (boolean) r12, (boolean) r13, (boolean) r14, (boolean) r15, (boolean) r16, (boolean) r17, (boolean) r18, (boolean) r19, (boolean) r20, (boolean) r21, (boolean) r22, (java.lang.String) r23, (java.lang.String) r24)
            r6.A02(r5, r4, r8)
            goto L_0x015e
        L_0x01a1:
            com.facebook.quicklog.QuickPerformanceLogger r1 = r2.A05
            if (r1 == 0) goto L_0x027a
            java.lang.String r0 = "REQUEST_SUPPORT"
            r1.markerPoint(r3, r0)
            android.content.Context r6 = r2.requireContext()
            X.0aP r0 = r2.A06
            if (r0 == 0) goto L_0x01b8
            java.lang.String r3 = r2.A0E
            if (r3 != 0) goto L_0x01bc
            java.lang.String r7 = "pk"
        L_0x01b8:
            X.0qQ.A0F(r7)
            goto L_0x0141
        L_0x01bc:
            java.lang.String r5 = r2.A0G
            if (r5 != 0) goto L_0x01c4
            java.lang.String r4 = "twoFacIdentifier"
            goto L_0x013e
        L_0x01c4:
            X.1NY r4 = X.DbU.A0M(r0)
            r4.A08(r8)
            java.lang.String r0 = "two_factor/start_two_fac_support/"
            r4.A0A(r0)
            java.lang.Class<X.DwF> r1 = X.DwF.class
            java.lang.Class<X.F6L> r0 = X.F6L.class
            r4.A0R(r1, r0)
            X.DbS.A1P(r4, r3)
            r3 = 779(0x30b, float:1.092E-42)
            r1 = 21
            r0 = 18
            java.lang.String r0 = X.Dbq.A05(r3, r1, r0)
            r4.A9m(r0, r5)
            X.Dbb.A0j(r6, r4)
            X.1OC r1 = r4.A0M()
            X.1P0 r0 = r2.A0R
            r1.A00 = r0
            r2.schedule(r1)
            goto L_0x015e
        L_0x01f7:
            com.facebook.quicklog.QuickPerformanceLogger r1 = r2.A05
            if (r1 == 0) goto L_0x027a
            java.lang.String r0 = "SWITCH_TO_BACKUP_CODE"
            r1.markerPoint(r3, r0)
            X.EW8 r0 = X.EW8.BACKUP_CODE
            goto L_0x025b
        L_0x0203:
            com.facebook.quicklog.QuickPerformanceLogger r1 = r2.A05
            if (r1 == 0) goto L_0x027a
            java.lang.String r0 = "SWITCH_TO_AUTH_APP"
            r1.markerPoint(r3, r0)
            X.EW8 r0 = X.EW8.AUTHENTICATOR_APP
            goto L_0x025b
        L_0x020f:
            com.facebook.quicklog.QuickPerformanceLogger r1 = r2.A05
            if (r1 == 0) goto L_0x027a
            java.lang.String r0 = "RESEND_CODE_CLICK"
            r1.markerPoint(r3, r0)
            X.E25.A03(r2, r11)
            goto L_0x015e
        L_0x021d:
            com.facebook.quicklog.QuickPerformanceLogger r1 = r2.A05
            if (r1 == 0) goto L_0x027a
            java.lang.String r0 = "SWITCH_TO_WHATSAPP"
            r1.markerPoint(r3, r0)
            java.lang.String r0 = r2.A0F
            if (r0 == 0) goto L_0x013e
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0238
            X.EW8 r0 = X.EW8.WHATSAPP
            r2.A07 = r0
            X.E25.A01(r2)
            goto L_0x025d
        L_0x0238:
            X.8ab r1 = X.DbW.A0U(r2)
            java.lang.String r0 = r2.A0F
            if (r0 == 0) goto L_0x013e
            r1.A0q(r0)
            X.FJI r0 = X.FJI.A00
            goto L_0x026f
        L_0x0246:
            com.facebook.quicklog.QuickPerformanceLogger r1 = r2.A05
            if (r1 == 0) goto L_0x027a
            java.lang.String r0 = "SWITCH_TO_SMS"
            r1.markerPoint(r3, r0)
            java.lang.String r0 = r2.A0F
            if (r0 == 0) goto L_0x013e
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0262
            X.EW8 r0 = X.EW8.SMS
        L_0x025b:
            r2.A07 = r0
        L_0x025d:
            X.E25.A02(r2)
            goto L_0x015e
        L_0x0262:
            X.8ab r1 = X.DbW.A0U(r2)
            java.lang.String r0 = r2.A0F
            if (r0 == 0) goto L_0x013e
            r1.A0q(r0)
            X.FJH r0 = X.FJH.A00
        L_0x026f:
            r1.A0E(r0)
            r1.A0r(r11)
            X.DbT.A1V(r1)
            goto L_0x015e
        L_0x027a:
            X.0qQ.A0F(r0)
            goto L_0x0141
        L_0x027f:
            java.lang.Object r0 = r1.A01
            com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment r0 = (com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment) r0
            androidx.recyclerview.widget.RecyclerView r1 = r0.mRecyclerView
            int r0 = r1.getScrollState()
            if (r0 == 0) goto L_0x0015
            r1.A0l()
            return
        L_0x028f:
            java.lang.Object r0 = r1.A01
            X.L1O r0 = (X.L1O) r0
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController r1 = r0.A00
            X.K9I r0 = r1.A0H
            r0.notifyDataSetChanged()
            r0 = 0
            r1.A0a = r0
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController.A05(r1)
            return
        L_0x02a1:
            java.lang.Object r0 = r1.A01
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r0 = (com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment) r0
            X.1Xj r3 = r0.A0b
            if (r3 == 0) goto L_0x02bb
            X.30z r2 = r0.A0U
            if (r2 == 0) goto L_0x02bb
            X.3W1 r1 = r0.A0c
            if (r1 == 0) goto L_0x02b9
            int r0 = r1.getPosition()
        L_0x02b5:
            r2.Dgf(r3, r1, r0)
            return
        L_0x02b9:
            r0 = -1
            goto L_0x02b5
        L_0x02bb:
            r0 = 439(0x1b7, float:6.15E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 2384(0x950, float:3.34E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0wb.A03(r1, r0)
            return
        L_0x02cb:
            java.lang.Object r1 = r1.A01
            X.Ryg r1 = (X.C10820Ryg) r1
            X.4mU r0 = r1.A05
            if (r0 == 0) goto L_0x02d6
            r0.EHd()
        L_0x02d6:
            r0 = 0
            r1.A01 = r0
            return
        L_0x02da:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r1.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ERK.D9d():void");
    }

    public final void DHB(Integer num) {
        switch (this.A00) {
            case 1:
                DirectPrivateStoryRecipientController directPrivateStoryRecipientController = ((L1O) this.A01).A00;
                directPrivateStoryRecipientController.A0a = true;
                DirectPrivateStoryRecipientController.A05(directPrivateStoryRecipientController);
                return;
            case 3:
                return;
            case 6:
                C10820Ryg ryg = (C10820Ryg) this.A01;
                C273384mU r1 = ryg.A05;
                if (r1 != null) {
                    r1.EHY("bottom_sheet");
                }
                ryg.A01 = true;
                return;
            default:
                super.DHB(num);
                return;
        }
    }

    public final void DYG(int i, int i2) {
        AnonymousClass37D A012;
        switch (this.A00) {
            case 3:
                return;
            case 5:
                RecyclerView recyclerView = ((MerchantShoppingCartFragment) this.A01).mRecyclerView;
                if (recyclerView.getScrollState() != 0) {
                    recyclerView.A0l();
                    return;
                }
                return;
            case 6:
                C10820Ryg ryg = (C10820Ryg) this.A01;
                if (!ryg.A00 && (A012 = AnonymousClass37D.A00.A01(ryg.A02)) != null && ((AnonymousClass37F) A012).A0h) {
                    ryg.A00 = true;
                }
                if (!ryg.A01 && ryg.A00) {
                    C273384mU r1 = ryg.A05;
                    if (r1 != null) {
                        r1.EHY("bottom_sheet");
                    }
                    ryg.A01 = true;
                    return;
                }
                return;
            default:
                super.DYG(i, i2);
                return;
        }
    }
}
