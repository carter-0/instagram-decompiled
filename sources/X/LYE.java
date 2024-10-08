package X;

import android.view.View;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;

public final class LYE implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public LYE(0sP r2) {
        this.A00 = 68;
        0qQ.A0B(r2, 1);
        this.A01 = r2;
    }

    public static void A00(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new LYE(obj, i), view);
    }

    /* JADX WARNING: type inference failed for: r1v56, types: [java.lang.Object, X.2jA] */
    /* JADX WARNING: type inference failed for: r2v46, types: [X.07Z, java.lang.Object, X.KXf] */
    /* JADX WARNING: type inference failed for: r2v48, types: [X.07Z, java.lang.Object, X.KXf] */
    /* JADX WARNING: type inference failed for: r5v35, types: [android.content.Context, java.lang.Object, com.instagram.tagging.activity.TaggingActivity] */
    /* JADX WARNING: type inference failed for: r5v39, types: [X.07Z, java.lang.Object, X.KXe] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0393, code lost:
        r5 = "delegate";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0397, code lost:
        r5 = "musicOverlayEditController";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0666, code lost:
        X.0qQ.A0F(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x066d, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0797, code lost:
        X.AnonymousClass0fD.A0C(r0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x079a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0ac2, code lost:
        X.AnonymousClass0fD.A0C(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0ac5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0b24, code lost:
        if (r0.CKn(r2) != false) goto L_0x0b26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0b49, code lost:
        if (((X.AnonymousClass3Q2) r2.get(0)).A12() == false) goto L_0x0b4b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0bf4, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0bf7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        X.AnonymousClass0fD.A0C(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0240, code lost:
        X.AnonymousClass0fD.A0C(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0243, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r14) {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x0be5;
                case 1: goto L_0x0bd3;
                case 2: goto L_0x0bb6;
                case 3: goto L_0x0ba3;
                case 4: goto L_0x0afb;
                case 5: goto L_0x0ac6;
                case 6: goto L_0x0aa6;
                case 7: goto L_0x0a8b;
                case 8: goto L_0x0a5b;
                case 9: goto L_0x0a46;
                case 10: goto L_0x039b;
                case 11: goto L_0x0a35;
                case 12: goto L_0x036b;
                case 13: goto L_0x02e5;
                case 14: goto L_0x0a1a;
                case 15: goto L_0x09bd;
                case 16: goto L_0x02d2;
                case 17: goto L_0x098b;
                case 18: goto L_0x096a;
                case 19: goto L_0x0956;
                case 20: goto L_0x08e7;
                case 21: goto L_0x08d4;
                case 22: goto L_0x08c3;
                case 23: goto L_0x08a2;
                case 24: goto L_0x0881;
                case 25: goto L_0x0858;
                case 26: goto L_0x0826;
                case 27: goto L_0x07d6;
                case 28: goto L_0x07bc;
                case 29: goto L_0x02bf;
                case 30: goto L_0x02a5;
                case 31: goto L_0x079b;
                case 32: goto L_0x0021;
                case 33: goto L_0x064d;
                case 34: goto L_0x0244;
                case 35: goto L_0x01fd;
                case 36: goto L_0x01b9;
                case 37: goto L_0x019d;
                case 38: goto L_0x0181;
                case 39: goto L_0x0153;
                case 40: goto L_0x0638;
                case 41: goto L_0x061f;
                case 42: goto L_0x060a;
                case 43: goto L_0x05f1;
                case 44: goto L_0x05d8;
                case 45: goto L_0x05bf;
                case 46: goto L_0x05a6;
                case 47: goto L_0x058d;
                case 48: goto L_0x0574;
                case 49: goto L_0x055b;
                case 50: goto L_0x0542;
                case 51: goto L_0x0529;
                case 52: goto L_0x04f7;
                case 53: goto L_0x04be;
                case 54: goto L_0x04a5;
                case 55: goto L_0x00ff;
                case 56: goto L_0x00c6;
                case 57: goto L_0x0492;
                case 58: goto L_0x047e;
                case 59: goto L_0x007e;
                case 60: goto L_0x046b;
                case 61: goto L_0x0778;
                case 62: goto L_0x06da;
                case 63: goto L_0x0458;
                case 64: goto L_0x0445;
                case 65: goto L_0x006a;
                case 66: goto L_0x0432;
                case 67: goto L_0x041d;
                case 68: goto L_0x040c;
                case 69: goto L_0x03f2;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = -1140330623(0xffffffffbc07ef81, float:-0.008296848)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r13.A01
            com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout2 r2 = (com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout2) r2
            X.Jeq r0 = r2.A04
            int r1 = r0.indexOfChild(r14)
            r0 = 1
            r2.A01(r1, r0)
            r0 = -2140367541(0xffffffff806c954b, float:-9.97179E-39)
        L_0x001d:
            X.AnonymousClass0fD.A0C(r0, r7)
            return
        L_0x0021:
            r0 = 645858673(0x267f0571, float:8.847827E-16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r13.A01
            X.K6a r7 = (X.C61404K6a) r7
            X.JiT r6 = r7.A02
            if (r6 == 0) goto L_0x02a1
            java.util.ArrayList r5 = X.C60272JiT.A00(r6)
            int r1 = r6.A00
            java.lang.Object r2 = r5.get(r1)
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.direct.wellbeing.safetyecosystem.mutedwords.dictionary.ui.list.EditableMutedWordItemModel"
            X.0qQ.A0C(r2, r1)
            X.Jz1 r2 = (X.C61208Jz1) r2
            int r4 = r6.A00
            java.lang.String r3 = r2.A00
            java.lang.String r2 = r2.A01
            X.Jz2 r1 = new X.Jz2
            r1.<init>(r3, r2)
            r5.set(r4, r1)
            r1 = -1
            r6.A00 = r1
            X.2Fj r2 = r6.A01
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0u()
            r2.A0A(r1)
            X.2Fj r1 = r6.A03
            r1.A0B(r5)
            android.view.View r1 = r7.mView
            X.0nA.A0N(r1)
            r1 = 1001989526(0x3bb92596, float:0.0056502325)
            goto L_0x0bf4
        L_0x006a:
            r0 = 760288712(0x2d5115c8, float:1.1885111E-11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r13.A01
            X.KXe r5 = (X.C62042KXe) r5
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r5.A00
            r4 = 0
            if (r1 != 0) goto L_0x069e
            java.lang.String r5 = "doneButton"
            goto L_0x0666
        L_0x007e:
            r0 = 429363913(0x199792c9, float:1.567232E-23)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r13.A01
            X.Luw r3 = (X.C65533Luw) r3
            X.3Q2 r0 = r3.A02
            if (r0 == 0) goto L_0x06d5
            boolean r1 = r0.A12()
            android.widget.TextView r0 = r3.A0C
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r0)
            X.8ab r2 = X.DbS.A0Y(r0)
            r0 = 2131969296(0x7f134510, float:1.957551E38)
            if (r1 == 0) goto L_0x00a3
            r0 = 2131969305(0x7f134519, float:1.957553E38)
        L_0x00a3:
            r2.A09(r0)
            r0 = 2131969297(0x7f134511, float:1.9575513E38)
            if (r1 == 0) goto L_0x00ae
            r0 = 2131969306(0x7f13451a, float:1.9575531E38)
        L_0x00ae:
            r2.A08(r0)
            r1 = 2131969298(0x7f134512, float:1.9575515E38)
            r0 = 18
            X.LV2 r0 = X.LV2.A00(r3, r0)
            r2.A0I(r0, r1)
            r0 = 1
            X.AnonymousClass7TH.A0a(r2, r0)
            r0 = 2106461299(0x7d8e0c73, float:2.3601877E37)
            goto L_0x0240
        L_0x00c6:
            r0 = -121526873(0xfffffffff8c1a5a7, float:-3.1421035E34)
            int r8 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r13.A01
            X.K6J r7 = (X.K6J) r7
            r4 = 1
            X.K6G r3 = X.K6J.A01(r7)
            if (r3 == 0) goto L_0x0715
            java.util.List r2 = r3.A00()
            java.lang.Object r1 = X.00k.A0J(r2)
            com.instagram.common.gallery.model.GalleryItem r1 = (com.instagram.common.gallery.model.GalleryItem) r1
            if (r1 == 0) goto L_0x0712
            boolean r0 = r1.A03()
            r6 = 0
            if (r0 == 0) goto L_0x00fb
            com.instagram.common.ui.widget.touchimageview.TouchImageView r0 = r7.A07
            if (r0 == 0) goto L_0x00f3
            android.graphics.Rect r6 = r0.getCropRect()
        L_0x00f3:
            X.LPF r0 = r3.A02
            if (r0 != 0) goto L_0x06fb
            java.lang.String r5 = "mediaPickerPhotosController"
            goto L_0x0666
        L_0x00fb:
            r1.A06()
            goto L_0x00f3
        L_0x00ff:
            r0 = -1361970883(0xffffffffaed1f93d, float:-9.548493E-11)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r13.A01
            X.9PF r0 = (X.AnonymousClass9PF) r0
            X.L2a r0 = r0.A00
            if (r0 == 0) goto L_0x014e
            com.instagram.tagging.activity.TaggingActivity r5 = r0.A00
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r4 = r5.A0D
            r0 = 0
            r5.A0D = r0
            com.instagram.tagging.activity.TaggingActivity.A09(r5)
            if (r4 == 0) goto L_0x014e
            boolean r3 = r4.A05
            X.6ap r2 = X.DbS.A0a()
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131956277(0x7f131235, float:1.9549105E38)
            if (r3 == 0) goto L_0x012c
            r0 = 2131960839(0x7f132407, float:1.9558358E38)
        L_0x012c:
            X.DbT.A1D(r1, r2, r0)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131960841(0x7f132409, float:1.9558362E38)
            java.lang.String r0 = X.AnonymousClass7TF.A0d(r1, r0)
            r2.A0G = r0
            r0 = 1
            r2.A0L = r0
            r1 = 5
            X.Lrz r0 = new X.Lrz
            r0.<init>(r1, r4, r5)
            r2.A0A(r0)
            r2.A06()
            X.DbY.A1N(r2)
        L_0x014e:
            r0 = -1257629374(0xffffffffb50a1942, float:-5.144576E-7)
            goto L_0x0240
        L_0x0153:
            r0 = 43497570(0x297b862, float:2.2293286E-37)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r13.A01
            X.Ubn r0 = (X.C15388Ubn) r0
            X.0eM r0 = r0.A0B
            java.lang.Object r5 = r0.getValue()
            X.Jfh r5 = (X.C60101Jfh) r5
            X.05G r0 = r5.A08
            java.lang.Object r4 = r0.getValue()
            if (r4 == 0) goto L_0x017c
            X.6oS r3 = X.C318116oQ.A00(r5)
            r2 = 0
            r1 = 0
            X.MH0 r0 = new X.MH0
            r0.<init>((java.lang.Object) r4, (java.lang.Object) r5, (X.AnonymousClass4D7) r2, (int) r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
        L_0x017c:
            r0 = 1227533903(0x492aae4f, float:699108.94)
            goto L_0x0240
        L_0x0181:
            r0 = -1765701620(0xffffffff96c1880c, float:-3.126669E-25)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r13.A01
            X.JnU r2 = (X.C60559JnU) r2
            int r1 = r2.getBindingAdapterPosition()
            r0 = -1
            if (r1 == r0) goto L_0x0198
            X.0sP r0 = r2.A00
            X.C51967G9n.A0w(r1, r0)
        L_0x0198:
            r0 = 1719974278(0x6684b986, float:3.1338734E23)
            goto L_0x0240
        L_0x019d:
            r0 = -1441353098(0xffffffffaa16b276, float:-1.3384592E-13)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r13.A01
            X.JnT r2 = (X.C60558JnT) r2
            int r1 = r2.getBindingAdapterPosition()
            r0 = -1
            if (r1 == r0) goto L_0x01b4
            X.0sP r0 = r2.A00
            X.C51967G9n.A0w(r1, r0)
        L_0x01b4:
            r0 = 592691110(0x2353bfa6, float:1.1478916E-17)
            goto L_0x0240
        L_0x01b9:
            r0 = 1637624468(0x619c2a94, float:3.6009502E20)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r13.A01
            X.K6a r2 = (X.C61404K6a) r2
            X.2dZ r1 = r2.A01
            if (r1 != 0) goto L_0x01cc
            java.lang.String r5 = "actionBarService"
            goto L_0x0666
        L_0x01cc:
            r0 = 1
            r1.setIsLoading(r0)
            X.JiT r5 = r2.A02
            if (r5 == 0) goto L_0x02a1
            X.LEd r0 = r5.A05
            X.0wc r1 = r0.A00
            java.lang.String r0 = "mwb_muted_words_settings_event"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            r1 = 10
            java.lang.String r0 = "action"
            X.AnonymousClass7TE.A1W(r2, r0, r1)
            r2.Cgf()
            X.6oS r4 = X.C318116oQ.A00(r5)
            X.4Cc r3 = r5.A06
            r2 = 0
            r1 = 13
            X.MGs r0 = new X.MGs
            r0.<init>(r5, r2, r1)
            X.1Eo.A05(r3, r0, r4)
            r0 = 203599069(0xc22acdd, float:1.2532045E-31)
            goto L_0x0240
        L_0x01fd:
            r0 = -975290847(0xffffffffc5de3e21, float:-7111.766)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r13.A01
            X.K6a r0 = (X.C61404K6a) r0
            r5 = 1
            r0.A05 = r5
            X.DbX.A1J(r0)
            X.JiT r4 = r0.A02
            if (r4 == 0) goto L_0x02a1
            r0.requireContext()
            X.0eM r0 = r0.A09
            X.0lg r3 = X.AnonymousClass7TF.A0L(r0, r5)
            java.util.ArrayList r0 = X.C60272JiT.A00(r4)
            boolean r0 = X.DbT.A1b(r0)
            if (r0 == 0) goto L_0x023d
            X.1NY r2 = X.AnonymousClass7TG.A0a(r3)
            java.lang.String r0 = "media/comment/filtering/update_filter_setting/"
            r2.A0A(r0)
            java.lang.String r1 = "disabled"
            java.lang.String r0 = "false"
            X.1OC r1 = X.JTU.A0H(r2, r1, r0, r5)
            r0 = 5
            X.C61499KAe.A00(r1, r3, r4, r0)
            X.1ES.A03(r1)
        L_0x023d:
            r0 = 1962958403(0x75005e43, float:1.6272604E32)
        L_0x0240:
            X.AnonymousClass0fD.A0C(r0, r6)
            return
        L_0x0244:
            r0 = -30616580(0xfffffffffe2cd3fc, float:-5.7431975E37)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r13.A01
            X.K6a r3 = (X.C61404K6a) r3
            java.lang.String r1 = r3.A04
            if (r1 != 0) goto L_0x0257
            java.lang.String r5 = "entryPoint"
            goto L_0x0666
        L_0x0257:
            java.lang.String r0 = "upsell"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0298
            X.JiT r0 = r3.A02
            if (r0 == 0) goto L_0x02a1
            java.util.ArrayList r0 = X.C60272JiT.A00(r0)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0298
            android.view.View r0 = r3.mView
            X.0nA.A0N(r0)
            X.8ab r1 = X.DbW.A0U(r3)
            r0 = 2131958515(0x7f131af3, float:1.9553644E38)
            r1.A09(r0)
            r0 = 2131958514(0x7f131af2, float:1.9553642E38)
            r1.A08(r0)
            r0 = 16
            X.LV2 r0 = X.LV2.A00(r3, r0)
            r1.A0E(r0)
            r1.A03()
            X.DbT.A1V(r1)
        L_0x0291:
            r0 = 424139473(0x1947dad1, float:1.03322485E-23)
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x0298:
            android.view.View r0 = r3.mView
            X.0nA.A0N(r0)
            X.DbT.A1J(r3)
            goto L_0x0291
        L_0x02a1:
            java.lang.String r5 = "viewModel"
            goto L_0x0666
        L_0x02a5:
            r0 = 907037267(0x36104a53, float:2.1500935E-6)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.String r3 = "NUX"
            r1 = 2
            X.C70888OQg.A00(r1, r3)
            java.lang.Object r4 = r13.A01
            X.K4y r4 = (X.C61380K4y) r4
            X.630 r3 = r4.A02
            if (r3 != 0) goto L_0x0744
            java.lang.String r5 = "manager"
            goto L_0x0666
        L_0x02bf:
            r0 = -1802692750(0xffffffff948d1772, float:-1.4246609E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r13.A01
            X.K4x r4 = (X.C61379K4x) r4
            X.630 r3 = r4.A02
            if (r3 != 0) goto L_0x0752
            java.lang.String r5 = "consentManager"
            goto L_0x0666
        L_0x02d2:
            r0 = 837591662(0x31eca26e, float:6.88697E-9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r13.A01
            X.NKL r1 = (X.NKL) r1
            X.30l r3 = r1.A05
            if (r3 != 0) goto L_0x0760
            java.lang.String r5 = "closeFriendsController"
            goto L_0x0666
        L_0x02e5:
            r0 = -1347217472(0xffffffffafb317c0, float:-3.2576786E-10)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r13.A01
            X.K7I r4 = (X.K7I) r4
            X.8a4 r0 = r4.A03
            if (r0 == 0) goto L_0x0397
            r0.A0G()
            java.lang.Integer r1 = r4.A04
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            java.lang.String r5 = "currentAudioOverlayTrack"
            r8 = 0
            if (r1 != r0) goto L_0x0369
            X.8a4 r1 = r4.A03
            if (r1 == 0) goto L_0x0397
            com.instagram.music.common.model.AudioOverlayTrack r0 = r4.A02
            if (r0 == 0) goto L_0x0666
            int r2 = r0.A03
            X.9SE r0 = r1.A0O
            if (r0 == 0) goto L_0x0367
            X.Wak r1 = new X.Wak
            r1.<init>(r0)
            int r0 = r1.AYh(r2)
            java.lang.String r2 = r1.BcG(r0)
        L_0x031b:
            X.L1S r7 = r4.A00
            if (r7 == 0) goto L_0x0393
            com.instagram.music.common.model.AudioOverlayTrack r0 = r4.A02
            if (r0 == 0) goto L_0x0666
            com.instagram.music.common.model.MusicAssetModel r6 = r0.A08
            if (r6 == 0) goto L_0x076b
            int r5 = r0.A03
            int r0 = r0.A02
            com.instagram.music.common.model.AudioOverlayTrack r1 = new com.instagram.music.common.model.AudioOverlayTrack
            r1.<init>(r6, r5, r0)
            X.NIn r5 = r7.A00
            com.instagram.common.session.UserSession r0 = r5.A0i()
            X.27r r7 = X.27p.A01(r0)
            r12 = 0
            java.lang.String r0 = r1.A0A
            java.lang.Long r0 = X.DbZ.A0d(r0)
            java.util.List r11 = X.AnonymousClass7TE.A1I(r0)
            java.lang.String r10 = "AUDIO_EDITOR_PAGE_DONE_BUTTON"
            r9 = r8
            r7.A1K(r8, r9, r10, r11, r12)
            com.instagram.common.session.UserSession r0 = r5.A0i()
            X.27r r0 = X.27p.A01(r0)
            X.29H r0 = r0.A03
            r0.A01()
            X.MuH r0 = X.C68449NIn.A02(r5)
            r0.A07(r1, r2)
            X.DbT.A1J(r4)
            r0 = 1275172150(0x4c019536, float:3.3969368E7)
            goto L_0x0ac2
        L_0x0367:
            r2 = 0
            goto L_0x031b
        L_0x0369:
            r2 = r8
            goto L_0x031b
        L_0x036b:
            r0 = 1925332158(0x72c23cbe, float:7.694531E30)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r13.A01
            X.K7I r2 = (X.K7I) r2
            X.8a4 r0 = r2.A03
            r1 = 0
            if (r0 == 0) goto L_0x0397
            r0.A0G()
            X.L1S r0 = r2.A00
            if (r0 == 0) goto L_0x0393
            X.NIn r0 = r0.A00
            X.MuH r0 = X.C68449NIn.A02(r0)
            r0.A07(r1, r1)
            X.DbT.A1J(r2)
            r0 = 694104440(0x295f3178, float:4.9558854E-14)
            goto L_0x0ac2
        L_0x0393:
            java.lang.String r5 = "delegate"
            goto L_0x0666
        L_0x0397:
            java.lang.String r5 = "musicOverlayEditController"
            goto L_0x0666
        L_0x039b:
            r0 = 1195200925(0x473d519d, float:48465.613)
            int r3 = X.AnonymousClass0fD.A05(r0)
            X.37E r2 = X.AnonymousClass37D.A00
            java.lang.Object r1 = r13.A01
            X.KXi r1 = (X.KXi) r1
            androidx.fragment.app.FragmentActivity r0 = r1.requireActivity()
            X.DbX.A10(r0, r2)
            X.L1R r2 = r1.A02
            if (r2 == 0) goto L_0x0773
            X.K9H r0 = r1.A09()
            java.util.List r0 = r0.A0D
            com.google.common.collect.ImmutableList r0 = X.DbU.A0K(r0)
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x03c5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03cf
            X.C61036Jva.A02(r4, r1)
            goto L_0x03c5
        L_0x03cf:
            X.NIn r2 = r2.A00
            X.MuH r1 = X.C68449NIn.A02(r2)
            X.05G r0 = r1.A0C
            r0.Epw(r4)
            boolean r0 = r4.isEmpty()
            X.05G r1 = r1.A0E
            if (r0 == 0) goto L_0x03ef
            X.NjF r0 = X.C69314NjF.A06
        L_0x03e4:
            r1.Epw(r0)
            com.instagram.common.ui.base.IgEditText r0 = r2.A0H
            if (r0 != 0) goto L_0x0770
            java.lang.String r5 = "noteEditText"
            goto L_0x0666
        L_0x03ef:
            X.NjF r0 = X.C69314NjF.COLLAB_NOTE
            goto L_0x03e4
        L_0x03f2:
            r0 = -1000540975(0xffffffffc45cf4d1, float:-883.82526)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r13.A01
            com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout r2 = (com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout) r2
            X.Jeq r0 = r2.A04
            int r1 = r0.indexOfChild(r14)
            r0 = 1
            r2.A01(r1, r0)
            r0 = 169828406(0xa1f6036, float:7.673667E-33)
            goto L_0x001d
        L_0x040c:
            r0 = 1770303491(0x6984b003, float:2.0051175E25)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r13.A01
            X.C51965G9l.A1W(r0, r14)
            r0 = -2055927252(0xffffffff85750a2c, float:-1.1521713E-35)
            goto L_0x001d
        L_0x041d:
            r0 = 2026214383(0x78c593ef, float:3.2058842E34)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r13.A01
            X.Jw3 r0 = (X.C61065Jw3) r0
            java.lang.Object r0 = r0.A02
            X.DbS.A1U(r0)
            r0 = -17985664(0xfffffffffeed8f80, float:-1.5788606E38)
            goto L_0x001d
        L_0x0432:
            r0 = -1758646856(0xffffffff972d2db8, float:-5.595702E-25)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r13.A01
            X.KXe r0 = (X.C62042KXe) r0
            X.C62042KXe.A05(r0)
            r0 = 2131589607(0x7f0d79e7, float:1.880541E38)
            goto L_0x001d
        L_0x0445:
            r0 = -654421951(0xffffffffd8fe5041, float:-2.23696513E15)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r13.A01
            X.KXe r0 = (X.C62042KXe) r0
            X.DbT.A1K(r0)
            r0 = -1968271910(0xffffffff8aae8dda, float:-1.6808949E-32)
            goto L_0x001d
        L_0x0458:
            r0 = -895723104(0xffffffffca9c59a0, float:-5123280.0)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r13.A01
            X.KXf r0 = (X.KXf) r0
            X.KXf.A05(r0)
            r0 = -273446040(0xffffffffefb38b68, float:-1.111327E29)
            goto L_0x001d
        L_0x046b:
            r0 = -1150134871(0xffffffffbb7255a9, float:-0.0036977327)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r13.A01
            X.KXf r0 = (X.KXf) r0
            X.DbT.A1K(r0)
            r0 = -1975029973(0xffffffff8a476f2b, float:-9.60241E-33)
            goto L_0x001d
        L_0x047e:
            r0 = -1719312515(0xffffffff99855f7d, float:-1.3790445E-23)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r13.A01
            X.Luw r1 = (X.C65533Luw) r1
            r0 = 1
            r1.A02(r0)
            r0 = 1255192458(0x4ad0b78a, float:6839237.0)
            goto L_0x001d
        L_0x0492:
            r0 = 1016531945(0x3c970be9, float:0.018438296)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r13.A01
            X.K6J r0 = (X.K6J) r0
            r0.onBackPressed()
            r0 = 870373904(0x33e0da10, float:1.0470478E-7)
            goto L_0x001d
        L_0x04a5:
            r0 = -806135383(0xffffffffcff359a9, float:-8.1654789E9)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r13.A01
            X.2YL r2 = (X.2YL) r2
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 19
            X.C66181MGs.A02(r2, r1, r0)
            r0 = 2063802527(0x7b03209f, float:6.808525E35)
            goto L_0x001d
        L_0x04be:
            r0 = 757376353(0x2d24a561, float:9.359042E-12)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r13.A01
            X.JiU r4 = (X.C60273JiU) r4
            X.4lm r1 = r4.A01
            com.instagram.common.session.UserSession r0 = r4.A00
            java.lang.String r3 = r0.A06
            java.lang.String r2 = "SETTINGS"
            X.0wc r1 = r1.A00
            java.lang.String r0 = "subscription_guided_activation_recommendation_see_all_cta"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = "creator_management_settings"
            X.DbS.A1O(r1, r0)
            X.DbY.A1G(r1, r3)
            java.lang.String r0 = "origin"
            r1.AAJ(r0, r2)
            r1.Cgf()
            X.6oS r1 = X.C318116oQ.A00(r4)
            r0 = 24
            X.C66181MGs.A02(r4, r1, r0)
            r0 = 846043276(0x326d988c, float:1.3829901E-8)
            goto L_0x001d
        L_0x04f7:
            r0 = -1748221943(0xffffffff97cc4009, float:-1.3199356E-24)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r13.A01
            X.JiU r3 = (X.C60273JiU) r3
            X.4lm r1 = r3.A01
            com.instagram.common.session.UserSession r0 = r3.A00
            java.lang.String r2 = r0.A06
            X.0wc r1 = r1.A00
            java.lang.String r0 = "ig_fan_club_creator_settings_subscribe_cta_row_tap"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            X.DbY.A1G(r1, r2)
            java.lang.String r0 = "creator_management_settings"
            X.DbS.A1O(r1, r0)
            r1.Cgf()
            X.6oS r1 = X.C318116oQ.A00(r3)
            r0 = 27
            X.C66181MGs.A02(r3, r1, r0)
            r0 = 1540440048(0x5bd13ff0, float:1.1779714E17)
            goto L_0x001d
        L_0x0529:
            r0 = -1405286158(0xffffffffac3d08f2, float:-2.686348E-12)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r13.A01
            X.2YL r2 = (X.2YL) r2
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 29
            X.C66181MGs.A02(r2, r1, r0)
            r0 = 393847115(0x1779a14b, float:8.065982E-25)
            goto L_0x001d
        L_0x0542:
            r0 = 615791163(0x24b43a3b, float:7.81612E-17)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r13.A01
            X.2YL r2 = (X.2YL) r2
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 30
            X.C66181MGs.A02(r2, r1, r0)
            r0 = -97995961(0xfffffffffa28b347, float:-2.1898551E35)
            goto L_0x001d
        L_0x055b:
            r0 = 1217523432(0x4891eee8, float:298871.25)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r13.A01
            X.2YL r2 = (X.2YL) r2
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 23
            X.C66181MGs.A02(r2, r1, r0)
            r0 = 842110945(0x323197e1, float:1.0337289E-8)
            goto L_0x001d
        L_0x0574:
            r0 = 452053734(0x1af1cae6, float:1.00003064E-22)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r13.A01
            X.2YL r2 = (X.2YL) r2
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 25
            X.C66181MGs.A02(r2, r1, r0)
            r0 = 1341802736(0x4ffa48f0, float:8.3981681E9)
            goto L_0x001d
        L_0x058d:
            r0 = 829684499(0x3173fb13, float:3.5503873E-9)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r13.A01
            X.2YL r2 = (X.2YL) r2
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 20
            X.C66181MGs.A02(r2, r1, r0)
            r0 = -952779178(0xffffffffc735be56, float:-46526.336)
            goto L_0x001d
        L_0x05a6:
            r0 = -493021576(0xffffffffe29d1678, float:-1.448879E21)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r13.A01
            X.2YL r2 = (X.2YL) r2
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 26
            X.C66181MGs.A02(r2, r1, r0)
            r0 = 1101806445(0x41ac3b6d, float:21.529016)
            goto L_0x001d
        L_0x05bf:
            r0 = -1935318357(0xffffffff8ca562ab, float:-2.548166E-31)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r13.A01
            X.2YL r2 = (X.2YL) r2
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 22
            X.C66181MGs.A02(r2, r1, r0)
            r0 = 1705389862(0x65a62f26, float:9.809782E22)
            goto L_0x001d
        L_0x05d8:
            r0 = 1374988998(0x51f4aac6, float:1.3135464E11)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r13.A01
            X.2YL r2 = (X.2YL) r2
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 28
            X.C66181MGs.A02(r2, r1, r0)
            r0 = -1069408818(0xffffffffc0421dce, float:-3.0330691)
            goto L_0x001d
        L_0x05f1:
            r0 = 1737100736(0x678a0dc0, float:1.3038804E24)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r13.A01
            X.2YL r2 = (X.2YL) r2
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 21
            X.C66181MGs.A02(r2, r1, r0)
            r0 = -1035569878(0xffffffffc246752a, float:-49.614418)
            goto L_0x001d
        L_0x060a:
            r0 = -1407661414(0xffffffffac18ca9a, float:-2.1712966E-12)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r13.A01
            X.JiU r1 = (X.C60273JiU) r1
            java.lang.String r0 = "not_eligible"
            X.C60273JiU.A00(r1, r0)
            r0 = 269319470(0x100d7d2e, float:2.7903782E-29)
            goto L_0x001d
        L_0x061f:
            r0 = -1953253667(0xffffffff8b93b6dd, float:-5.689748E-32)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r13.A01
            X.JiU r1 = (X.C60273JiU) r1
            r0 = 255(0xff, float:3.57E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.C60273JiU.A00(r1, r0)
            r0 = -1114937430(0xffffffffbd8b67aa, float:-0.06806882)
            goto L_0x001d
        L_0x0638:
            r0 = 782762050(0x2ea80042, float:7.639801E-11)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r13.A01
            X.JiU r1 = (X.C60273JiU) r1
            java.lang.String r0 = "eligible"
            X.C60273JiU.A00(r1, r0)
            r0 = 1031794798(0x3d7ff06e, float:0.06248515)
            goto L_0x001d
        L_0x064d:
            r0 = 1897228897(0x71156a61, float:7.398699E29)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r13.A01
            X.K6a r8 = (X.C61404K6a) r8
            X.JiT r0 = r8.A02
            java.lang.String r5 = "viewModel"
            if (r0 == 0) goto L_0x0666
            int r1 = r0.A00
            androidx.recyclerview.widget.RecyclerView r0 = r8.A00
            if (r0 != 0) goto L_0x066e
            java.lang.String r5 = "wordsList"
        L_0x0666:
            X.0qQ.A0F(r5)
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            throw r2
        L_0x066e:
            X.3kE r1 = r0.A0W(r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.wellbeing.safetyecosystem.mutedwords.dictionary.ui.list.EditableMutedWordItemDefinition.Holder"
            X.0qQ.A0C(r1, r0)
            X.UDO r1 = (X.UDO) r1
            X.JiT r6 = r8.A02
            if (r6 == 0) goto L_0x0666
            android.widget.EditText r0 = r1.A00
            java.lang.String r5 = X.AnonymousClass7TF.A0f(r0)
            X.6oS r4 = X.C51975G9x.A0R(r6, r5)
            X.4Cc r3 = r6.A06
            r2 = 0
            r1 = 27
            X.MGy r0 = new X.MGy
            r0.<init>(r6, r5, r2, r1)
            X.1Eo.A05(r3, r0, r4)
            android.view.View r0 = r8.mView
            X.0nA.A0N(r0)
            r0 = -2061405469(0xffffffff852172e3, float:-7.591285E-36)
            goto L_0x001d
        L_0x069e:
            r3 = 1
            r2 = 0
            r1.setPrimaryActionIsLoading(r3)
            java.lang.Integer r1 = r5.A01
            int r1 = r1.intValue()
            if (r1 == r2) goto L_0x06c0
            if (r1 != r3) goto L_0x06ca
            X.0xx r3 = X.DbW.A0E(r5)
            r2 = 41
            X.MG8 r1 = new X.MG8
            r1.<init>(r5, r4, r2)
        L_0x06b8:
            X.AnonymousClass7TE.A1Z(r1, r3)
            r1 = -1102245387(0xffffffffbe4d11f5, float:-0.20026381)
            goto L_0x0bf4
        L_0x06c0:
            X.0xx r3 = X.DbW.A0E(r5)
            X.MH0 r1 = new X.MH0
            r1.<init>(r5, r4)
            goto L_0x06b8
        L_0x06ca:
            X.Wub r2 = X.AnonymousClass7TE.A1K()
            r1 = -2112895546(0xffffffff820fc5c6, float:-1.0562739E-37)
            X.AnonymousClass0fD.A0C(r1, r0)
            throw r2
        L_0x06d5:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            throw r2
        L_0x06da:
            r0 = 2135024359(0x7f41e2e7, float:2.5771915E38)
            int r8 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r13.A01
            X.KXf r2 = (X.KXf) r2
            com.instagram.igds.components.button.IgdsButton r1 = r2.A00
            if (r1 == 0) goto L_0x06ed
            r0 = 1
            r1.setLoading(r0)
        L_0x06ed:
            X.0xx r1 = X.DbW.A0E(r2)
            r0 = 37
            X.MG8.A01(r2, r1, r0)
            r0 = 1265451750(0x4b6d42e6, float:1.5549158E7)
            goto L_0x0797
        L_0x06fb:
            r0.A04()
            r7.A0I = r4
            java.util.List r0 = X.C64151LQo.A00(r2)
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0719
            X.LzL r0 = new X.LzL
            r0.<init>(r6, r7)
            r3.A01(r0, r2)
        L_0x0712:
            X.DbT.A1J(r7)
        L_0x0715:
            r0 = -737552989(0xffffffffd409d5a3, float:-2.367979E12)
            goto L_0x0797
        L_0x0719:
            X.LEB r5 = r7.A0A
            if (r5 == 0) goto L_0x073f
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r2.iterator()
        L_0x0725:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x073b
            com.instagram.common.gallery.Medium r2 = X.JTP.A0O(r3)
            r1 = 0
            if (r2 == 0) goto L_0x0725
            X.Jtk r0 = new X.Jtk
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L_0x0725
        L_0x073b:
            r5.A00(r6, r4)
            goto L_0x0712
        L_0x073f:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            throw r2
        L_0x0744:
            r2 = 1
            X.Lr2 r1 = new X.Lr2
            r1.<init>(r4, r2)
            r3.A00(r1, r2)
            r1 = -772862160(0xffffffffd1ef0f30, float:-1.28343998E11)
            goto L_0x0bf4
        L_0x0752:
            r2 = 0
            X.Lr2 r1 = new X.Lr2
            r1.<init>(r4, r2)
            r3.A00(r1, r2)
            r1 = -143179453(0xfffffffff7774143, float:-5.0149257E33)
            goto L_0x0bf4
        L_0x0760:
            X.Ki7 r2 = X.C62574Ki7.DIRECT_INBOX
            r1 = 0
            r3.CfX(r2, r1, r1)
            r1 = 2008182835(0x77b27033, float:7.2383165E33)
            goto L_0x0bf4
        L_0x076b:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            throw r2
        L_0x0770:
            X.C69979NvJ.A00(r0)
        L_0x0773:
            r0 = 562956895(0x218e0a5f, float:9.62504E-19)
            goto L_0x0ac2
        L_0x0778:
            r0 = -1408301310(0xffffffffac0f0702, float:-2.0325412E-12)
            int r8 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r13.A01
            X.KXf r2 = (X.KXf) r2
            com.instagram.igds.components.button.IgdsButton r1 = r2.A00
            if (r1 == 0) goto L_0x078b
            r0 = 1
            r1.setLoading(r0)
        L_0x078b:
            X.0xx r1 = X.DbW.A0E(r2)
            r0 = 36
            X.MG8.A01(r2, r1, r0)
            r0 = 603478246(0x23f858e6, float:2.6925864E-17)
        L_0x0797:
            X.AnonymousClass0fD.A0C(r0, r8)
            return
        L_0x079b:
            r0 = -1488747329(0xffffffffa74384bf, float:-2.7133648E-15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.String r3 = "NUX"
            r1 = 4
            X.C70888OQg.A00(r1, r3)
            java.lang.Object r1 = r13.A01
            androidx.fragment.app.FragmentActivity r2 = X.DbT.A0E(r1)
            X.M4H r1 = new X.M4H
            r1.<init>(r2)
            r2.runOnUiThread(r1)
            r1 = -428064117(0xffffffffe67c428b, float:-2.9781596E23)
            goto L_0x0bf4
        L_0x07bc:
            r0 = -1825667256(0xffffffff932e8748, float:-2.2028586E-27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r13.A01
            androidx.fragment.app.FragmentActivity r2 = X.DbT.A0E(r1)
            X.M4F r1 = new X.M4F
            r1.<init>(r2)
            r2.runOnUiThread(r1)
            r1 = 189672752(0xb4e2d30, float:3.9708152E-32)
            goto L_0x0bf4
        L_0x07d6:
            r0 = -1941503374(0xffffffff8c470272, float:-1.5331138E-31)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r13.A01
            X.L1O r6 = (X.L1O) r6
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController r5 = r6.A00
            com.instagram.common.session.UserSession r0 = r5.A0B
            java.lang.String r4 = r0.A05
            com.instagram.archive.intf.ArchivePendingUpload r2 = r5.A08
            com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r0 = r5.A0D
            r1 = 0
            com.instagram.archive.fragment.InlineAddHighlightFragment r4 = X.LT8.A03(r2, r0, r4)
            boolean r0 = r5.A0k
            if (r0 == 0) goto L_0x0805
            X.4DH r0 = r5.A0w
            X.0s1 r0 = X.DbW.A0C(r0)
            r0.A0I(r1)
            r4.A0C(r0, r1)
        L_0x0800:
            r0 = -808457842(0xffffffffcfcfe98e, float:-6.9763799E9)
            goto L_0x0ac2
        L_0x0805:
            com.instagram.common.session.UserSession r0 = r5.A0B
            X.7Pr r2 = X.DbS.A0W(r0)
            r0 = 2131100275(0x7f060273, float:1.7812927E38)
            r2.A0B = r0
            r1 = 1
            X.ERK r0 = new X.ERK
            r0.<init>(r6, r1)
            r2.A0X = r0
            X.7Pu r1 = r2.A00()
            X.4DH r0 = r5.A0w
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            r1.A02(r0, r4)
            goto L_0x0800
        L_0x0826:
            r0 = 338524919(0x142d7af7, float:8.7585185E-27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r13.A01
            X.LxC r8 = (X.C65635LxC) r8
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController r2 = r8.A00
            X.4DH r5 = r2.A0w
            com.instagram.common.session.UserSession r6 = r2.A0B
            java.lang.Integer r9 = X.AnonymousClass05K.A0C
            boolean r10 = X.C363018iu.A00(r6)
            X.8it r1 = r2.A0P
            boolean r11 = r1.A06()
            X.818 r4 = X.AnonymousClass818.IG_STORY_SHARE_SHEET_SHARING_OPTIONS
            r7 = 0
            X.Lao r3 = new X.Lao
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r3.A01()
            X.8sM r1 = X.C368278sM.VIEW
            r2.A0F(r1, r7)
            r1 = -850047987(0xffffffffcd554c0d, float:-2.23658192E8)
            goto L_0x0bf4
        L_0x0858:
            r0 = 1294174113(0x4d2387a1, float:1.71473424E8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r13.A01
            X.L1N r1 = (X.L1N) r1
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController r1 = r1.A00
            com.instagram.common.session.UserSession r6 = r1.A0B
            java.lang.Class<com.instagram.modal.ModalActivity> r5 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            X.4DH r3 = r1.A0w
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            java.lang.String r1 = "fan_club_member_list"
            X.6W8 r1 = X.DbS.A0b(r2, r4, r6, r5, r1)
            X.DbT.A1L(r3, r1)
            r1 = 491088494(0x1d456a6e, float:2.6127756E-21)
            goto L_0x0bf4
        L_0x0881:
            r0 = 256103562(0xf43d48a, float:9.655176E-30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r13.A01
            X.L1M r1 = (X.L1M) r1
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController r1 = r1.A00
            X.30l r5 = r1.A09
            r5.getClass()
            X.4DH r4 = r1.A0w
            X.Ki7 r3 = X.C62574Ki7.STORY_SHARE_SHEET
            r2 = 2002(0x7d2, float:2.805E-42)
            r1 = 0
            r5.A00(r4, r3, r2, r1)
            r1 = 1562484002(0x5d219d22, float:7.2784385E17)
            goto L_0x0bf4
        L_0x08a2:
            r0 = 1747994073(0x683045d9, float:3.3296999E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r13.A01
            X.L1M r1 = (X.L1M) r1
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController r1 = r1.A00
            X.30l r5 = r1.A09
            r5.getClass()
            X.4DH r4 = r1.A0w
            X.Ki7 r3 = X.C62574Ki7.STORY_SHARE_SHEET
            r2 = 2002(0x7d2, float:2.805E-42)
            r1 = 0
            r5.A00(r4, r3, r2, r1)
            r1 = 1052360973(0x3eb9c10d, float:0.362801)
            goto L_0x0bf4
        L_0x08c3:
            r0 = -2003694770(0xffffffff88920b4e, float:-8.789713E-34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r13.A01
            X.DbS.A1U(r1)
            r1 = 1891373961(0x70bc1389, float:4.656544E29)
            goto L_0x0bf4
        L_0x08d4:
            r0 = -866379373(0xffffffffcc5c1993, float:-5.7697868E7)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r13.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.DbX.A1I(r0)
            r0 = -1484332901(0xffffffffa786e09b, float:-3.743599E-15)
            goto L_0x0ac2
        L_0x08e7:
            r0 = -1736740998(0xffffffff987b6f7a, float:-3.249727E-24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r13.A01
            X.K4X r5 = (X.K4X) r5
            android.os.Bundle r6 = X.AnonymousClass7TE.A0a()
            int r2 = X.K4X.A00(r5)
            r1 = 2364(0x93c, float:3.313E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r6.putInt(r1, r2)
            com.instagram.model.direct.DirectThreadKey r1 = r5.A07
            com.facebook.base.activity.parcel.OpaqueParcelable r2 = X.0B0.A00(r1)
            r1 = 2363(0x93b, float:3.311E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r6.putParcelable(r1, r2)
            java.lang.String r2 = r5.A08
            r1 = 2365(0x93d, float:3.314E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r6.putString(r1, r2)
            java.lang.String r2 = r5.A09
            r1 = 2367(0x93f, float:3.317E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r6.putString(r1, r2)
            int r2 = r5.A00
            r1 = 2366(0x93e, float:3.315E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r6.putInt(r1, r2)
            X.0eM r1 = r5.A0D
            X.0lg r4 = X.DbT.A0X(r1)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r3 = com.instagram.modal.TransparentModalActivity.class
            androidx.fragment.app.FragmentActivity r2 = r5.getActivity()
            r1 = 1295(0x50f, float:1.815E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            X.6W8 r3 = X.AnonymousClass6W8.A02(r2, r6, r4, r3, r1)
            androidx.fragment.app.FragmentActivity r2 = r5.getActivity()
            r1 = 1
            r3.A0A(r2, r1)
            r1 = 628916577(0x257c8161, float:2.1901351E-16)
            goto L_0x0bf4
        L_0x0956:
            r0 = 147747865(0x8ce7419, float:1.2425468E-33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r13.A01
            X.LSl r2 = (X.C64180LSl) r2
            r1 = 0
            X.C64180LSl.A03(r2, r1)
            r1 = 830875503(0x3186276f, float:3.9043964E-9)
            goto L_0x0bf4
        L_0x096a:
            r0 = 1199502788(0x477ef5c4, float:65269.766)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r13.A01
            X.LSl r3 = (X.C64180LSl) r3
            r2 = 0
            X.C64180LSl.A03(r3, r2)
            X.1Av r1 = r3.A03
            r1.A1M(r2)
            r2 = 2131965669(0x7f1336e5, float:1.9568154E38)
            java.lang.String r1 = "amg_camera_roll_access_denied"
            X.C64180LSl.A02(r3, r1, r2)
            r1 = -590288246(0xffffffffdcd0ea8a, float:-4.70437389E17)
            goto L_0x0bf4
        L_0x098b:
            r0 = -280491473(0xffffffffef480a2f, float:-6.1909313E28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r13.A01
            X.LSl r4 = (X.C64180LSl) r4
            r1 = 0
            X.C64180LSl.A03(r4, r1)
            X.1Av r2 = r4.A03
            r1 = 1
            r2.A1M(r1)
            r2 = 2131965668(0x7f1336e4, float:1.9568152E38)
            java.lang.String r1 = "amg_camera_roll_access_granted"
            X.C64180LSl.A02(r4, r1, r2)
            android.content.Context r3 = r4.A01
            com.instagram.common.session.UserSession r2 = r4.A02
            X.2jA r1 = new X.2jA
            r1.<init>()
            X.2jD r1 = X.AnonymousClass2jC.A00(r3, r2, r1)
            r1.A01()
            r1 = 1017163644(0x3ca0af7c, float:0.019614927)
            goto L_0x0bf4
        L_0x09bd:
            r0 = 1484537002(0x587c3caa, float:1.10934992E15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r13.A01
            X.NIn r4 = (X.C68449NIn) r4
            long r8 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = "NOTES"
            r5 = 0
            r10 = 0
            r7 = r5
            r11 = r10
            X.K5H r3 = X.K5H.A00(r5, r6, r7, r8, r10, r11)
            android.os.Bundle r2 = r3.requireArguments()
            java.lang.String r1 = "hideActionBar"
            r5 = 1
            r2.putBoolean(r1, r5)
            java.lang.String r1 = "showCollapsedLocationBar"
            r2.putBoolean(r1, r5)
            r3.setArguments(r2)
            com.instagram.common.session.UserSession r1 = r4.A0i()
            X.7Pr r2 = X.DbS.A0W(r1)
            r1 = 11
            X.C65745Lyz.A00(r2, r4, r1)
            X.7Pu r2 = r2.A00()
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            X.7Pu r1 = r2.A02(r1, r3)
            X.LgL r3 = new X.LgL
            r3.<init>(r5, r4, r1)
            com.instagram.common.session.UserSession r1 = r4.A0i()
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r1)
            java.lang.Class<X.Lfa> r1 = X.C64648Lfa.class
            r2.A01(r3, r1)
            r4.A0E = r3
            r1 = -1031825034(0xffffffffc27f9976, float:-63.899864)
            goto L_0x0bf4
        L_0x0a1a:
            r0 = -213271905(0xfffffffff349ba9f, float:-1.5982617E31)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r13.A01
            X.NIn r1 = (X.C68449NIn) r1
            android.content.Context r2 = r1.requireContext()
            com.instagram.common.session.UserSession r1 = r1.A0i()
            X.AnonymousClass4A2.A04(r2, r1)
            r1 = -269725569(0xffffffffefec507f, float:-1.4627155E29)
            goto L_0x0bf4
        L_0x0a35:
            r0 = 1836160573(0x6d71963d, float:4.6729696E27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r13.A01
            X.Dba.A1Q(r1)
            r1 = 1114279036(0x426a8c7c, float:58.63719)
            goto L_0x0bf4
        L_0x0a46:
            r0 = 530103141(0x1f98bb65, float:6.468452E-20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r13.A01
            X.7Lf r2 = (X.C330047Lf) r2
            java.lang.String r1 = "info_button"
            r2.DrD(r1)
            r1 = -601663483(0xffffffffdc235805, float:-1.83908799E17)
            goto L_0x0bf4
        L_0x0a5b:
            r0 = -1250710526(0xffffffffb573ac02, float:-9.077486E-7)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r13.A01
            com.instagram.direct.fragment.stickertray.hscroll.tabs.IgdExpressionTrayHscrollLayout r2 = (com.instagram.direct.fragment.stickertray.hscroll.tabs.IgdExpressionTrayHscrollLayout) r2
            X.Jek r0 = r2.A00
            int r1 = r0.indexOfChild(r14)
            X.Jek r0 = r2.A00
            int r0 = r0.getChildCount()
            if (r1 >= r0) goto L_0x0a87
            X.Jek r0 = r2.A00
            android.view.View r0 = r0.getChildAt(r1)
            int r1 = r0.getLeft()
            int r0 = r2.getScrollX()
            int r1 = r1 - r0
            r0 = 0
            r2.smoothScrollBy(r1, r0)
        L_0x0a87:
            r0 = -1851711875(0xffffffff91a11e7d, float:-2.542011E-28)
            goto L_0x0ac2
        L_0x0a8b:
            r0 = 1532550445(0x5b58dd2d, float:6.104178E16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r13.A01
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController r1 = (com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController) r1
            X.30l r3 = r1.A09
            r3.getClass()
            X.Ki7 r2 = X.C62574Ki7.STORY_SHARE_SHEET
            r1 = 0
            r3.CfX(r2, r1, r1)
            r1 = 364724482(0x15bd4102, float:7.6439056E-26)
            goto L_0x0bf4
        L_0x0aa6:
            r0 = 1714126119(0x662b7d27, float:2.0245833E23)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r13.A01
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController r2 = (com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController) r2
            X.LRm r0 = r2.A0F
            boolean r0 = r0.A08()
            r1 = 1
            if (r0 == 0) goto L_0x0abb
            r1 = -1
        L_0x0abb:
            r0 = 0
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController.A08(r2, r1, r0)
            r0 = -1756588481(0xffffffff974c963f, float:-6.610559E-25)
        L_0x0ac2:
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        L_0x0ac6:
            r0 = -301057068(0xffffffffee0e3bd4, float:-1.10048E28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r13.A01
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController r6 = (com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController) r6
            X.4DH r5 = r6.A0w
            android.content.Context r2 = r5.requireContext()
            com.instagram.common.session.UserSession r1 = r6.A0B
            X.Dg1 r4 = new X.Dg1
            r4.<init>(r2, r1)
            r3 = 2131961451(0x7f13266b, float:1.95596E38)
            r2 = 7
            X.LYE r1 = new X.LYE
            r1.<init>((com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController) r6, (int) r2)
            r4.A04(r1, r3)
            X.FFy r2 = new X.FFy
            r2.<init>(r4)
            android.content.Context r1 = r5.getContext()
            r2.A05(r1)
            r1 = 1575118326(0x5de265f6, float:2.03921446E18)
            goto L_0x0bf4
        L_0x0afb:
            java.lang.Object r4 = r13.A01
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController r4 = (com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController) r4
            com.instagram.model.direct.DirectShareTarget r2 = r4.A0L
            r6 = 1
            if (r2 == 0) goto L_0x0b9d
            X.LRm r1 = r4.A0F
            X.Juy r0 = X.C61002Juy.A02
            X.Juy r0 = X.C64010LIx.A00(r2)
            X.MXS r0 = r1.A02(r0)
            if (r0 != 0) goto L_0x0b26
            com.instagram.model.direct.DirectShareTarget r2 = r4.A0L
            X.LRm r1 = r4.A0F
            X.Juy r0 = X.C61002Juy.A04
            X.MXS r0 = r1.A02(r0)
            X.Lqj r0 = (X.C65290Lqj) r0
            if (r0 == 0) goto L_0x0b9d
            boolean r0 = r0.CKn(r2)
            if (r0 == 0) goto L_0x0b9d
        L_0x0b26:
            r1 = 1
        L_0x0b27:
            r4.A0g = r6
            com.instagram.model.direct.DirectShareTarget r0 = r4.A0L
            if (r0 == 0) goto L_0x0b9f
            if (r1 != 0) goto L_0x0b9f
            r4.A0j = r6
            java.util.List r2 = r4.A1J
            r1 = 0
            if (r2 == 0) goto L_0x0b4b
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x0b4b
            java.lang.Object r0 = r2.get(r1)
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0
            boolean r0 = r0.A12()
            r5 = 2131960308(0x7f1321f4, float:1.955728E38)
            if (r0 != 0) goto L_0x0b4e
        L_0x0b4b:
            r5 = 2131960300(0x7f1321ec, float:1.9557265E38)
        L_0x0b4e:
            X.4DH r2 = r4.A0w
            android.content.Context r0 = r2.getContext()
            X.8ab r3 = X.DbS.A0Y(r0)
            r3.A0r(r6)
            r3.A0s(r6)
            android.content.res.Resources r1 = X.DbV.A05(r2)
            com.instagram.model.direct.DirectShareTarget r0 = r4.A0L
            java.lang.String r0 = r0.A0I
            if (r0 != 0) goto L_0x0b6a
            java.lang.String r0 = ""
        L_0x0b6a:
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r1, r0, r5)
            r3.A05 = r0
            android.content.res.Resources r2 = X.DbV.A05(r2)
            r1 = 2131958633(0x7f131b69, float:1.9553884E38)
            com.instagram.model.direct.DirectShareTarget r0 = r4.A0L
            java.lang.String r0 = r0.A0I
            if (r0 != 0) goto L_0x0b7f
            java.lang.String r0 = ""
        L_0x0b7f:
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r2, r0, r1)
            r3.A0q(r0)
            r1 = 2131973082(0x7f1353da, float:1.958319E38)
            r0 = 8
            X.LV2 r0 = X.LV2.A00(r4, r0)
            r3.A0I(r0, r1)
            r1 = 2131973916(0x7f13571c, float:1.9584881E38)
            r0 = 7
            X.LV2.A01(r3, r4, r0, r1)
            X.DbT.A1V(r3)
            return
        L_0x0b9d:
            r1 = 0
            goto L_0x0b27
        L_0x0b9f:
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController.A03(r4)
            return
        L_0x0ba3:
            java.lang.Object r2 = r13.A01
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController r2 = (com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController) r2
            X.LRm r0 = r2.A0F
            boolean r0 = r0.A08()
            r1 = 1
            if (r0 == 0) goto L_0x0bb1
            r1 = -1
        L_0x0bb1:
            r0 = 0
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController.A08(r2, r1, r0)
            return
        L_0x0bb6:
            r0 = 1281726024(0x4c659648, float:6.0184864E7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r13.A01
            X.K6K r5 = (X.K6K) r5
            X.Jhs r1 = X.JTQ.A0L(r5)
            boolean r4 = r1.A00()
            r3 = 0
            r2 = 1
            r1 = 0
            X.K6K.A01(r3, r5, r1, r2, r4)
            r1 = -909635809(0xffffffffc9c80f1f, float:-1638883.9)
            goto L_0x0bf4
        L_0x0bd3:
            r0 = 1831750653(0x6d2e4bfd, float:3.371391E27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r13.A01
            X.K5C r1 = (X.K5C) r1
            X.K5C.A00(r1)
            r1 = -2024728535(0xffffffff87511829, float:-1.5730512E-34)
            goto L_0x0bf4
        L_0x0be5:
            r0 = -1599871816(0xffffffffa0a3e4b8, float:-2.7764627E-19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r13.A01
            X.Dba.A1Q(r1)
            r1 = 876631284(0x344054f4, float:1.7912299E-7)
        L_0x0bf4:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LYE.onClick(android.view.View):void");
    }

    public LYE(DirectPrivateStoryRecipientController directPrivateStoryRecipientController, int i) {
        this.A00 = i;
        switch (i) {
            case 3:
            case 4:
                this.A01 = directPrivateStoryRecipientController;
                return;
            default:
                this.A01 = directPrivateStoryRecipientController;
                return;
        }
    }

    public LYE(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
