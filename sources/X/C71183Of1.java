package X;

import android.content.DialogInterface;

/* renamed from: X.Of1  reason: case insensitive filesystem */
public final class C71183Of1 implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C71183Of1(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x03be, code lost:
        if (r1 == null) goto L_0x03c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x03c0, code lost:
        X.DbX.A1V(r2.A00, r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x03c5, code lost:
        r4.A02.Epw(X.C68987NcI.A00);
        r4.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x03cf, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0589, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0590, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x059f, code lost:
        r4.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x05a2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x05a3, code lost:
        r0 = "audLogging";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        r0 = (X.2Er) r6.A01;
        X.C66930MfP.A01(r2, r0.C6C(), r0.C6k(), "daily_prompt_reply_reminder_dialog_cancel", "tap", "cancel_button", "daily_prompt_reply_reminder_dialog", r0.AdN());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002e, code lost:
        r1.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0226, code lost:
        X.C70035NwD.A00(r1, r0, r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0229, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x03b6, code lost:
        r2 = r4.A00;
        r1 = X.OV0.A00(r4.A01, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r22, int r23) {
        /*
            r21 = this;
            r6 = r21
            int r0 = r6.A00
            r1 = r22
            switch(r0) {
                case 0: goto L_0x0562;
                case 1: goto L_0x0579;
                case 2: goto L_0x0545;
                case 3: goto L_0x02b7;
                case 4: goto L_0x04d1;
                case 5: goto L_0x047a;
                case 6: goto L_0x045a;
                case 7: goto L_0x02a9;
                case 8: goto L_0x0442;
                case 9: goto L_0x0442;
                case 10: goto L_0x041b;
                case 11: goto L_0x028d;
                case 12: goto L_0x03f8;
                case 13: goto L_0x022a;
                case 14: goto L_0x03d0;
                case 15: goto L_0x0009;
                case 16: goto L_0x0009;
                case 17: goto L_0x03a3;
                case 18: goto L_0x038f;
                case 19: goto L_0x0366;
                case 20: goto L_0x01a6;
                case 21: goto L_0x0128;
                case 22: goto L_0x00d3;
                case 23: goto L_0x0032;
                case 24: goto L_0x0335;
                case 25: goto L_0x0324;
                case 26: goto L_0x030b;
                case 27: goto L_0x02fd;
                case 28: goto L_0x02e8;
                case 29: goto L_0x02dc;
                case 30: goto L_0x02c3;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Object r0 = r6.A02
            X.ONc r0 = (X.C70830ONc) r0
            X.MfP r2 = r0.A02
        L_0x0013:
            java.lang.Object r0 = r6.A01
            X.2Er r0 = (X.2Er) r0
            java.lang.String r3 = r0.C6C()
            java.lang.String r4 = r0.C6k()
            int r9 = r0.AdN()
            java.lang.String r5 = "daily_prompt_reply_reminder_dialog_cancel"
            java.lang.String r6 = "tap"
            java.lang.String r7 = "cancel_button"
            java.lang.String r8 = "daily_prompt_reply_reminder_dialog"
            X.C66930MfP.A01(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x002e:
            r1.dismiss()
        L_0x0031:
            return
        L_0x0032:
            java.lang.Object r4 = r6.A01
            X.OZh r4 = (X.C71030OZh) r4
            java.lang.Object r0 = r6.A02
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x006a
            com.instagram.common.session.UserSession r0 = r4.A0D
            X.6gx r6 = X.C313746gw.A00(r0)
            int r5 = r4.A06
            java.lang.String r3 = r4.A0G
            java.lang.String r2 = r4.A0H
            X.1Ln r1 = X.DbT.A0J(r6)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x006a
            X.DbW.A17(r1, r6)
            java.lang.String r0 = "thread_remove_photo"
            X.DbV.A1M(r1, r0)
            java.lang.String r0 = "remove_group_photo_item"
            r1.A0p(r0)
            java.lang.String r0 = "change_photo_dialog"
            java.lang.Long r0 = X.DbZ.A0b(r1, r0, r3, r2, r5)
            X.C66582MXn.A1C(r1, r6, r0)
        L_0x006a:
            X.0wc r2 = r4.A0C
            java.lang.String r5 = r4.A0G
            java.lang.String r1 = "photo_removed"
            java.lang.Boolean r0 = r4.A04
            boolean r3 = r0.booleanValue()
            X.C3265677h.A0c(r2, r5, r1, r3)
            X.PtL r8 = r4.A02
            if (r8 == 0) goto L_0x00b0
            X.R8F r2 = new X.R8F
            r2.<init>()
            X.0hq r1 = r4.A0B
            java.lang.String r0 = "progress"
            r2.A0B(r1, r0)
            X.1a8 r7 = r4.A00
            X.7ZA r6 = r4.A01
            if (r6 == 0) goto L_0x00c1
            if (r7 == 0) goto L_0x00c1
            if (r3 == 0) goto L_0x00c1
            com.instagram.common.session.UserSession r3 = r4.A0D
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317135353418535(0x81063e00001327, double:3.0304408626435666E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00c1
            X.3sy r0 = r4.A03
            r0.getClass()
            X.1aU r1 = r6.EEm(r0)
            r0 = 13
            X.PU7.A00(r1, r7, r4, r0)
        L_0x00b0:
            java.lang.String r1 = r4.A05
            java.lang.String r0 = "message_thread"
            if (r1 != r0) goto L_0x0031
            com.instagram.common.session.UserSession r2 = r4.A0D
            X.AnonymousClass7TG.A1N(r2, r5)
            X.NmP r1 = X.C69481NmP.CHANGE_PHOTO
            X.NmL r0 = X.C69477NmL.REMOVE
            goto L_0x0226
        L_0x00c1:
            com.instagram.common.session.UserSession r3 = r4.A0D
            X.1OC r2 = com.instagram.direct.request.DirectThreadApi.A05(r3, r5)
            r1 = 6
            X.NHz r0 = new X.NHz
            r0.<init>(r3, r8, r4, r1)
            r2.A00 = r0
            X.1ES.A03(r2)
            goto L_0x00b0
        L_0x00d3:
            java.lang.Object r7 = r6.A01
            X.OZh r7 = (X.C71030OZh) r7
            java.lang.Object r4 = r6.A02
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            java.lang.Boolean r0 = r7.A04
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00f2
            X.O62 r2 = r7.A0F
            java.lang.String r3 = r7.A0G
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.0wc r2 = r2.A00
            java.lang.String r0 = "armadillo_igd_group_profile_set_group_photo_cancel"
            X.C66584MXp.A13(r2, r0, r3)
        L_0x00f2:
            boolean r0 = r4.booleanValue()
            if (r0 == 0) goto L_0x0124
            com.instagram.common.session.UserSession r0 = r7.A0D
            X.6gx r6 = X.C313746gw.A00(r0)
            int r5 = r7.A06
            java.lang.String r4 = r7.A0G
            java.lang.String r3 = r7.A0H
            X.1Ln r2 = X.DbT.A0J(r6)
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x0124
            X.DbW.A17(r2, r6)
            java.lang.String r0 = "thread_update_photo_cancel"
            X.DbV.A1M(r2, r0)
            java.lang.String r0 = "cancel_group_photo_item"
            r2.A0p(r0)
            java.lang.String r0 = "change_photo_dialog"
            java.lang.Long r0 = X.DbZ.A0b(r2, r0, r4, r3, r5)
            X.C66582MXn.A1C(r2, r6, r0)
        L_0x0124:
            if (r22 == 0) goto L_0x0031
            goto L_0x002e
        L_0x0128:
            java.lang.Object r4 = r6.A01
            X.OZh r4 = (X.C71030OZh) r4
            java.lang.Object r6 = r6.A02
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            X.36V r3 = r4.A0E
            X.36W r2 = X.AnonymousClass36W.GROUP_PHOTO
            X.JWU r0 = new X.JWU
            r0.<init>(r2)
            r8 = 0
            r0.A0A = r8
            r0.A05 = r8
            com.instagram.model.creation.MediaCaptureConfig r1 = new com.instagram.model.creation.MediaCaptureConfig
            r1.<init>((X.JWU) r0)
            X.EXF r0 = X.EXF.A0C
            r3.Exx(r0, r1, r2)
            X.0wc r2 = r4.A0C
            java.lang.String r5 = r4.A0G
            java.lang.String r1 = "photo_from_camera"
            java.lang.Boolean r0 = r4.A04
            boolean r7 = r0.booleanValue()
            X.C3265677h.A0c(r2, r5, r1, r7)
            boolean r0 = r6.booleanValue()
            if (r0 == 0) goto L_0x0187
            com.instagram.common.session.UserSession r0 = r4.A0D
            X.6gx r6 = X.C313746gw.A00(r0)
            int r3 = r4.A06
            java.lang.String r2 = r4.A0H
            X.1Ln r1 = X.DbT.A0J(r6)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x0187
            X.DbW.A17(r1, r6)
            java.lang.String r0 = "thread_take_photo"
            X.DbV.A1M(r1, r0)
            java.lang.String r0 = "take_photo_item"
            r1.A0p(r0)
            java.lang.String r0 = "change_photo_dialog"
            java.lang.Long r0 = X.DbZ.A0b(r1, r0, r5, r2, r3)
            X.C66582MXn.A1C(r1, r6, r0)
        L_0x0187:
            if (r7 == 0) goto L_0x0195
            X.O62 r0 = r4.A0F
            X.0qQ.A0B(r5, r8)
            X.0wc r1 = r0.A00
            java.lang.String r0 = "armadillo_igd_group_profile_set_group_photo_take_photo_with_camera"
            X.C66584MXp.A13(r1, r0, r5)
        L_0x0195:
            java.lang.String r1 = r4.A05
            java.lang.String r0 = "message_thread"
            if (r1 != r0) goto L_0x0031
            com.instagram.common.session.UserSession r2 = r4.A0D
            X.AnonymousClass7TF.A1H(r2, r5)
            X.NmP r1 = X.C69481NmP.CHANGE_PHOTO
            X.NmL r0 = X.C69477NmL.CAMERA
            goto L_0x0226
        L_0x01a6:
            java.lang.Object r4 = r6.A01
            X.OZh r4 = (X.C71030OZh) r4
            java.lang.Object r6 = r6.A02
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            X.36V r3 = r4.A0E
            X.36W r2 = X.AnonymousClass36W.GROUP_PHOTO
            X.JWU r0 = new X.JWU
            r0.<init>(r2)
            r7 = 0
            r0.A0A = r7
            r0.A05 = r7
            com.instagram.model.creation.MediaCaptureConfig r1 = new com.instagram.model.creation.MediaCaptureConfig
            r1.<init>((X.JWU) r0)
            X.EXF r0 = X.EXF.A0C
            r3.Exv(r0, r1, r2)
            X.0wc r2 = r4.A0C
            java.lang.String r5 = r4.A0G
            java.lang.String r1 = "photo_from_library"
            java.lang.Boolean r0 = r4.A04
            boolean r8 = r0.booleanValue()
            X.C3265677h.A0c(r2, r5, r1, r8)
            boolean r0 = r6.booleanValue()
            if (r0 == 0) goto L_0x0209
            com.instagram.common.session.UserSession r0 = r4.A0D
            X.6gx r6 = X.C313746gw.A00(r0)
            int r3 = r4.A06
            java.lang.String r2 = r4.A0H
            X.1Ln r1 = X.DbT.A0J(r6)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x0209
            X.DbW.A17(r1, r6)
            java.lang.String r0 = "photo_gallery_rendered"
            X.DbV.A1M(r1, r0)
            r0 = 2145(0x861, float:3.006E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r1.A0p(r0)
            java.lang.String r0 = "change_photo_dialog"
            java.lang.Long r0 = X.DbZ.A0b(r1, r0, r5, r2, r3)
            X.C66582MXn.A1C(r1, r6, r0)
        L_0x0209:
            if (r8 == 0) goto L_0x0217
            X.O62 r0 = r4.A0F
            X.0qQ.A0B(r5, r7)
            X.0wc r1 = r0.A00
            java.lang.String r0 = "armadillo_igd_group_profile_set_group_photo_choose_from_library"
            X.C66584MXp.A13(r1, r0, r5)
        L_0x0217:
            java.lang.String r1 = r4.A05
            java.lang.String r0 = "message_thread"
            if (r1 != r0) goto L_0x0031
            com.instagram.common.session.UserSession r2 = r4.A0D
            X.AnonymousClass7TF.A1H(r2, r5)
            X.NmP r1 = X.C69481NmP.CHANGE_PHOTO
            X.NmL r0 = X.C69477NmL.LIBRARY
        L_0x0226:
            X.C70035NwD.A00(r1, r0, r2, r5)
            return
        L_0x022a:
            java.lang.Object r2 = r6.A02
            X.OFD r2 = (X.OFD) r2
            java.lang.Object r1 = r6.A01
            com.instagram.model.direct.messageid.MessageIdentifier r1 = (com.instagram.model.direct.messageid.MessageIdentifier) r1
            X.0eK r0 = r2.A03
            java.lang.Object r0 = r0.get()
            X.3sy r0 = (X.C254743sy) r0
            com.instagram.model.direct.DirectThreadKey r0 = X.C66647MaG.A03(r0)
            if (r0 == 0) goto L_0x028b
            java.lang.String r5 = r0.A00
        L_0x0242:
            X.OT9 r4 = r2.A02
            com.instagram.common.session.UserSession r2 = r2.A01
            java.lang.String r1 = r1.A01
            r3 = 0
            r0 = 1
            X.3su r0 = X.OT9.A00(r4, r1, r3, r0)
            if (r0 == 0) goto L_0x026d
            com.google.common.collect.ImmutableList r1 = r0.A0H()
            if (r1 == 0) goto L_0x026d
            r0 = 0
            java.lang.Object r0 = X.00k.A0O(r1, r0)
            X.3tC r0 = (X.C254873tC) r0
            if (r0 == 0) goto L_0x026d
            java.lang.String r0 = r0.A0u
            if (r0 == 0) goto L_0x026d
            android.net.Uri r1 = X.0cp.A03(r0)
            java.lang.String r0 = "collection_id"
            java.lang.String r3 = r1.getQueryParameter(r0)
        L_0x026d:
            if (r5 == 0) goto L_0x0031
            if (r3 == 0) goto L_0x0031
            X.1NY r2 = X.DbU.A0N(r2)
            java.lang.String r0 = "direct_v2/shared_album/delete/"
            X.C66583MXo.A1F(r2, r0, r5)
            java.lang.String r0 = "album_id"
            r2.A9m(r0, r3)
            java.lang.Class<X.NHZ> r1 = X.NHZ.class
            java.lang.Class<X.OQJ> r0 = X.OQJ.class
            X.1OC r0 = X.DbU.A0S(r2, r1, r0)
            X.1ES.A03(r0)
            return
        L_0x028b:
            r5 = 0
            goto L_0x0242
        L_0x028d:
            java.lang.Object r5 = r6.A02
            X.P3i r5 = (X.C72369P3i) r5
            com.instagram.common.session.UserSession r0 = r5.A04
            X.4A4 r4 = new X.4A4
            r4.<init>(r0)
            java.lang.Object r3 = r6.A01
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            r0 = 9
            X.NMH r2 = new X.NMH
            r2.<init>(r0, r3, r5)
            r0 = 1
            r4.A00(r2, r3, r0)
            goto L_0x002e
        L_0x02a9:
            java.lang.Object r3 = r6.A02
            X.Mkx r3 = (X.C67263Mkx) r3
            java.lang.Object r2 = r6.A01
            java.util.List r2 = (java.util.List) r2
            r0 = 0
            X.C67263Mkx.A06(r3, r2, r0)
            goto L_0x002e
        L_0x02b7:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Object r0 = r6.A02
            X.OTl r0 = (X.C70964OTl) r0
            X.MfP r2 = r0.A07
            goto L_0x0013
        L_0x02c3:
            java.lang.Object r2 = r6.A02
            X.NKT r2 = (X.NKT) r2
            java.lang.Object r1 = r6.A01
            X.OTt r1 = (X.C70972OTt) r1
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x02d9
            java.lang.String r0 = r1.A06
        L_0x02d1:
            if (r0 != 0) goto L_0x02d5
            java.lang.String r0 = ""
        L_0x02d5:
            X.NKT.A01(r2, r0)
            return
        L_0x02d9:
            java.lang.String r0 = r1.A08
            goto L_0x02d1
        L_0x02dc:
            java.lang.Object r1 = r6.A01
            X.Puj r1 = (X.C74429Puj) r1
            java.lang.Object r0 = r6.A02
            X.NHW r0 = (X.NHW) r0
            r1.D5a(r0)
            return
        L_0x02e8:
            java.lang.Object r0 = r6.A02
            X.OKZ r0 = (X.OKZ) r0
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "rtc_multipeer_effect_permission_dialog_shown"
            X.DbW.A1L(r1, r0)
            java.lang.Object r0 = r6.A01
            X.DbS.A1U(r0)
            return
        L_0x02fd:
            java.lang.Object r0 = r6.A02
            X.6Ji r0 = (X.C305736Ji) r0
            X.6Zb r1 = r0.A05
            java.lang.Object r0 = r6.A01
            X.4gL r0 = (X.C270194gL) r0
            r1.D8B(r0)
            return
        L_0x030b:
            java.lang.Object r5 = r6.A01
            X.OeR r5 = (X.C71153OeR) r5
            java.lang.Object r4 = r6.A02
            java.util.List r4 = (java.util.List) r4
            r3 = -1
            r2 = 0
            r0 = 15
            X.N4G r1 = new X.N4G
            r1.<init>((int) r3, (java.lang.String) r2, (int) r0)
            int r0 = X.C71153OeR.A00(r5, r4)
            X.C71153OeR.A09(r1, r5, r4, r0)
            return
        L_0x0324:
            java.lang.Object r2 = r6.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r1 = r6.A01
            com.instagram.model.direct.DirectThreadKey r1 = (com.instagram.model.direct.DirectThreadKey) r1
            X.7Zn r0 = new X.7Zn
            r0.<init>(r2)
            r0.Cfp(r1)
            return
        L_0x0335:
            X.FEe r3 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            java.lang.Object r2 = r6.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r6.A02
            X.0lg r1 = (X.0lg) r1
            java.lang.String r0 = "https://help.instagram.com/447613741984126"
            java.lang.String r20 = X.SQU.A01(r2, r0)
            r5 = 0
            r7 = 0
            r0 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r19 = X.AnonymousClass7TE.A16(r2, r0)
            r12 = 1
            com.instagram.simplewebview.SimpleWebViewConfig r4 = new com.instagram.simplewebview.SimpleWebViewConfig
            r6 = r5
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            r13 = r7
            r14 = r7
            r15 = r12
            r16 = r7
            r17 = r7
            r18 = r7
            r4.<init>((java.lang.String) r5, (java.lang.String) r6, (boolean) r7, (boolean) r8, (boolean) r9, (boolean) r10, (boolean) r11, (boolean) r12, (boolean) r13, (boolean) r14, (boolean) r15, (boolean) r16, (boolean) r17, (boolean) r18, (java.lang.String) r19, (java.lang.String) r20)
            r3.A02(r2, r1, r4)
            return
        L_0x0366:
            java.lang.Object r0 = r6.A02
            X.NKk r0 = (X.C68491NKk) r0
            X.0eM r0 = r0.A01
            java.lang.Object r4 = r0.getValue()
            X.Mtp r4 = (X.C67736Mtp) r4
            java.lang.Object r0 = r6.A01
            X.N5q r0 = (X.C68201N5q) r0
            int r1 = r0.A00
            X.OV0 r2 = r4.A00
            X.3t2 r0 = r4.A01
            java.lang.String r1 = X.OV0.A00(r0, r1)
            if (r1 == 0) goto L_0x03c5
            X.0xa r0 = r2.A00
            X.0xY r0 = r0.AR4()
            r0.ED3(r1)
            r0.apply()
            goto L_0x03c5
        L_0x038f:
            java.lang.Object r0 = r6.A02
            X.NKk r0 = (X.C68491NKk) r0
            X.0eM r0 = r0.A01
            java.lang.Object r4 = r0.getValue()
            X.Mtp r4 = (X.C67736Mtp) r4
            java.lang.Object r0 = r6.A01
            X.N5q r0 = (X.C68201N5q) r0
            int r1 = r0.A00
            r3 = 0
            goto L_0x03b6
        L_0x03a3:
            java.lang.Object r0 = r6.A02
            X.NKk r0 = (X.C68491NKk) r0
            X.0eM r0 = r0.A01
            java.lang.Object r4 = r0.getValue()
            X.Mtp r4 = (X.C67736Mtp) r4
            java.lang.Object r0 = r6.A01
            X.N5q r0 = (X.C68201N5q) r0
            int r1 = r0.A00
            r3 = 1
        L_0x03b6:
            X.OV0 r2 = r4.A00
            X.3t2 r0 = r4.A01
            java.lang.String r1 = X.OV0.A00(r0, r1)
            if (r1 == 0) goto L_0x03c5
            X.0xa r0 = r2.A00
            X.DbX.A1V(r0, r1, r3)
        L_0x03c5:
            X.05G r1 = r4.A02
            X.NcI r0 = X.C68987NcI.A00
            r1.Epw(r0)
            r4.A00()
            return
        L_0x03d0:
            java.lang.Object r0 = r6.A02
            X.P8g r0 = (X.C72497P8g) r0
            com.instagram.common.session.UserSession r0 = r0.A05
            X.4kA r5 = X.AnonymousClass4k9.A00(r0)
            X.0s0 r4 = r5.A08
            X.0YZ[] r3 = X.AnonymousClass4kA.A0c
            r1 = 23
            int r0 = X.DbY.A03(r5, r4, r3, r1)
            r2 = 1
            int r0 = r0 + 1
            r1 = r3[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.Epx(r5, r0, r1)
            java.lang.Object r0 = r6.A01
            X.0sP r0 = (X.0sP) r0
            X.C51968G9o.A1O(r0, r2)
            return
        L_0x03f8:
            java.lang.Object r1 = r6.A02
            X.P3i r1 = (X.C72369P3i) r1
            androidx.fragment.app.FragmentActivity r2 = r1.A00
            com.instagram.common.session.UserSession r5 = r1.A04
            java.lang.Object r8 = r6.A01
            com.instagram.user.model.User r8 = (com.instagram.user.model.User) r8
            X.0iw r0 = r1.A03
            java.lang.String r9 = r0.getModuleName()
            r0 = 18
            X.NMI r4 = new X.NMI
            r4.<init>((java.lang.Object) r1, (int) r0)
            r3 = 0
            r6 = r3
            r7 = r3
            X.FH6.A01(r2, r3, r4, r5, r6, r7, r8, r9)
            X.C72369P3i.A00(r1)
            return
        L_0x041b:
            java.lang.Object r4 = r6.A02
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r0 = r6.A01
            androidx.fragment.app.FragmentActivity r3 = X.DbT.A0E(r0)
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            r0 = 564(0x234, float:7.9E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.Dbb.A0i(r3, r1, r4, r2, r0)
            X.60k r1 = X.C3018660j.A01(r4)
            X.Nmo r0 = X.C69506Nmo.A02
            r1.A0B(r0)
            return
        L_0x0442:
            java.lang.Object r3 = r6.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r6.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.2EG r1 = X.2EG.A1V
            java.lang.String r0 = "https://www.facebook.com/help/instagram/475931443650619"
            X.SUL r1 = X.Dba.A0J(r3, r2, r1, r0)
            java.lang.String r0 = "inbox_thread_action"
            r1.A0S = r0
            r1.A0A()
            return
        L_0x045a:
            java.lang.Object r2 = r6.A02
            X.Mkx r2 = (X.C67263Mkx) r2
            java.lang.Object r1 = r6.A01
            java.util.List r1 = (java.util.List) r1
            r0 = 1
            X.C67263Mkx.A06(r2, r1, r0)
            X.Mom r1 = r2.A0B
            java.util.HashMap r0 = r2.A0D
            java.util.Set r0 = r0.keySet()
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r0)
            r1.AOd(r0)
            r0 = 0
            X.C67263Mkx.A07(r2, r0)
            return
        L_0x047a:
            java.lang.Object r5 = r6.A02
            X.NKN r5 = (X.NKN) r5
            java.lang.Object r12 = r6.A01
            com.instagram.user.model.User r12 = (com.instagram.user.model.User) r12
            r0 = 0
            X.Plr r4 = new X.Plr
            r4.<init>(r0, r12, r5)
            X.0rm r3 = X.C51965G9l.A11()
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            r1 = 1
            X.6ST r0 = new X.6ST
            r0.<init>(r2, r1)
            r3.A00 = r0
            r0.setCancelable(r1)
            java.lang.Object r0 = r3.A00
            android.app.Dialog r0 = (android.app.Dialog) r0
            X.AnonymousClass0fN.A00(r0)
            androidx.fragment.app.FragmentActivity r6 = r5.requireActivity()
            X.0eM r0 = r5.A0N
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r0)
            r7 = 0
            r0 = 8
            X.NMH r8 = new X.NMH
            r8.<init>(r0, r4, r3)
            r10 = r7
            r11 = r7
            X.FH6.A00(r6, r7, r8, r9, r10, r11, r12)
            X.0eM r0 = r5.A0M
            java.lang.Object r4 = r0.getValue()
            X.FYu r4 = (X.C50337FYu) r4
            X.EZo r3 = X.C48146EZo.STORY
            X.EZp r2 = X.C48147EZp.FOLLOW_TO_JOIN_CHAT_SHEET
            r0 = 2389(0x955, float:3.348E-42)
            java.lang.String r5 = X.C273654mx.A00(r0)
            java.lang.String r6 = "tap"
            X.C50337FYu.A01(r2, r3, r4, r5, r6, r7)
            return
        L_0x04d1:
            java.lang.Object r0 = r6.A01
            X.PRX r0 = (X.PRX) r0
            java.lang.Object r4 = r6.A02
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            X.NJ6 r5 = r0.A00
            X.OLT r0 = r5.A02
            r0.getClass()
            com.instagram.common.session.UserSession r2 = r5.A00
            java.lang.String r1 = r5.A04
            java.lang.String r0 = r4.getId()
            X.C66671Mae.A0J(r2, r1, r0)
            X.OLT r0 = r5.A02
            r0.A00(r4)
            java.util.Set r0 = r5.A0C
            r0.remove(r4)
            X.MvC r2 = r5.A01
            X.OLT r1 = r5.A02
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.util.List r0 = r1.A04
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r2.A00 = r0
            r2.notifyDataSetChanged()
            X.NJ6.A00(r5)
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            if (r1 == 0) goto L_0x051a
            X.2dY r0 = X.2dZ.A0t
            X.2dZ r0 = r0.A03(r1)
            r0.A0T()
        L_0x051a:
            com.instagram.common.session.UserSession r0 = r5.A00
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            X.Osp r0 = new X.Osp
            r0.<init>(r4)
            r1.A00(r0)
            X.OLT r0 = r5.A02
            r0.getClass()
            com.instagram.common.session.UserSession r0 = r5.A00
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r0)
            java.lang.String r2 = r5.A04
            X.OLT r0 = r5.A02
            int r1 = r0.A00
            X.7MR r0 = new X.7MR
            r0.<init>(r2, r1)
            r3.A00(r0)
            r4.getId()
            return
        L_0x0545:
            java.lang.Object r5 = r6.A02
            X.OTl r5 = (X.C70964OTl) r5
            X.MfP r4 = r5.A07
            java.lang.Object r3 = r6.A01
            X.2Er r3 = (X.2Er) r3
            java.lang.String r2 = r3.C6C()
            java.lang.String r1 = r3.C6k()
            int r0 = r3.AdN()
            r4.A03(r2, r1, r0)
            X.C70964OTl.A00(r5, r3)
            return
        L_0x0562:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Object r0 = r6.A02
            X.OW3 r0 = (X.OW3) r0
            java.lang.Object r4 = r6.A01
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            X.6iu r0 = r0.A01
            if (r0 == 0) goto L_0x05a3
            r0.A00()
            r1.dismiss()
            goto L_0x059f
        L_0x0579:
            java.lang.Object r0 = r6.A02
            X.OW3 r0 = (X.OW3) r0
            java.lang.Object r4 = r6.A01
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            X.FAt r3 = X.C49872FAt.A00
            android.content.Context r2 = r0.A00
            if (r2 != 0) goto L_0x0591
            java.lang.String r0 = "context"
        L_0x0589:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0591:
            com.instagram.common.session.UserSession r1 = r0.A02
            if (r1 != 0) goto L_0x0598
            java.lang.String r0 = "userSession"
            goto L_0x0589
        L_0x0598:
            X.6iu r0 = r0.A01
            if (r0 == 0) goto L_0x05a3
            r3.A00(r2, r0, r1)
        L_0x059f:
            r4.run()
            return
        L_0x05a3:
            java.lang.String r0 = "audLogging"
            goto L_0x0589
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71183Of1.onClick(android.content.DialogInterface, int):void");
    }
}
