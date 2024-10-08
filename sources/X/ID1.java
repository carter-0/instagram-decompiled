package X;

import android.view.View;
import instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment;

public final class ID1 implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public ID1(EffectsPageFragment effectsPageFragment, int i) {
        this.A00 = i;
        switch (i) {
            case 65:
            case 66:
            case 67:
                this.A01 = effectsPageFragment;
                return;
            default:
                this.A01 = effectsPageFragment;
                return;
        }
    }

    public static ID1 A00(Object obj, int i) {
        return new ID1(obj, i);
    }

    public static void A01(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new ID1(obj, i), view);
    }

    public static void A02(C46498Dg1 dg1, Object obj, int i, int i2) {
        dg1.A04(new ID1(obj, i), i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v57, resolved type: com.instagram.wonderwall.model.WallMediaPostItem} */
    /* JADX WARNING: type inference failed for: r7v2, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v34, types: [X.1Xy, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x05a2, code lost:
        X.AnonymousClass0fD.A0C(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x05a5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x09dd, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x09e0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0fa0, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01b4, code lost:
        r4 = "bloksParams";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01b8, code lost:
        r4 = "bottomSheetLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0249, code lost:
        r4 = "model";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        X.0qQ.A0F(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x08cf  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x08e0  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x08ed  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x08fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r26) {
        /*
            r25 = this;
            r1 = r25
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0f8f;
                case 1: goto L_0x04e4;
                case 2: goto L_0x0eeb;
                case 3: goto L_0x0e9f;
                case 4: goto L_0x0e6c;
                case 5: goto L_0x0e39;
                case 6: goto L_0x0e22;
                case 7: goto L_0x024d;
                case 8: goto L_0x0e0f;
                case 9: goto L_0x0de5;
                case 10: goto L_0x0db6;
                case 11: goto L_0x0d99;
                case 12: goto L_0x022e;
                case 13: goto L_0x0d86;
                case 14: goto L_0x0d73;
                case 15: goto L_0x0d60;
                case 16: goto L_0x0d4d;
                case 17: goto L_0x0d3a;
                case 18: goto L_0x0d27;
                case 19: goto L_0x0d04;
                case 20: goto L_0x0cf1;
                case 21: goto L_0x0213;
                case 22: goto L_0x0cde;
                case 23: goto L_0x01bc;
                case 24: goto L_0x0431;
                case 25: goto L_0x0ccb;
                case 26: goto L_0x0ca1;
                case 27: goto L_0x0c72;
                case 28: goto L_0x0c5f;
                case 29: goto L_0x0c4b;
                case 30: goto L_0x0c37;
                case 31: goto L_0x0c24;
                case 32: goto L_0x0c11;
                case 33: goto L_0x0bfe;
                case 34: goto L_0x0beb;
                case 35: goto L_0x0bd8;
                case 36: goto L_0x0bbb;
                case 37: goto L_0x0b8d;
                case 38: goto L_0x033c;
                case 39: goto L_0x0b7c;
                case 40: goto L_0x0b47;
                case 41: goto L_0x0b32;
                case 42: goto L_0x0b1d;
                case 43: goto L_0x0b05;
                case 44: goto L_0x0aed;
                case 45: goto L_0x0ad5;
                case 46: goto L_0x072d;
                case 47: goto L_0x0ab0;
                case 48: goto L_0x0a70;
                case 49: goto L_0x0a59;
                case 50: goto L_0x06f6;
                case 51: goto L_0x0a46;
                case 52: goto L_0x069e;
                case 53: goto L_0x0a2f;
                case 54: goto L_0x0166;
                case 55: goto L_0x012b;
                case 56: goto L_0x00cf;
                case 57: goto L_0x0a12;
                case 58: goto L_0x0990;
                case 59: goto L_0x05ae;
                case 60: goto L_0x094e;
                case 61: goto L_0x0925;
                case 62: goto L_0x006a;
                case 63: goto L_0x0912;
                case 64: goto L_0x08ff;
                case 65: goto L_0x07f2;
                case 66: goto L_0x07ab;
                case 67: goto L_0x0306;
                case 68: goto L_0x077f;
                case 69: goto L_0x028a;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = -87883875(0xfffffffffac2ff9d, float:-5.0624502E35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.GVT r3 = (X.GVT) r3
            X.Ghc r6 = r3.A0J
            java.lang.String r4 = "audioPageViewModel"
            if (r6 == 0) goto L_0x001e
            java.lang.String r7 = r3.A0P
            if (r7 != 0) goto L_0x0026
            java.lang.String r4 = "assetId"
        L_0x001e:
            X.0qQ.A0F(r4)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0026:
            X.KWw r2 = r6.A0B
            r8 = 0
            r1 = 0
            boolean r1 = X.C51973G9u.A1a(r2, r7, r1)
            r10 = r1 ^ 1
            X.6oS r1 = X.C318116oQ.A00(r6)
            r9 = 19
            X.MEW r5 = new X.MEW
            r5.<init>(r6, r7, r8, r9, r10)
            X.19B r2 = X.19B.A00
            X.6oS r1 = X.C51967G9n.A0M(r6, r2, r5, r1)
            r9 = 20
            X.MEW r5 = new X.MEW
            r5.<init>(r6, r7, r8, r9, r10)
            X.1Eo.A05(r2, r5, r1)
            X.Ghc r1 = r3.A0J
            if (r1 == 0) goto L_0x001e
            X.2Fk r1 = r1.A05
            java.lang.Object r1 = r1.A02()
            X.Gm1 r1 = (X.C53315Gm1) r1
            r2 = 1
            if (r1 == 0) goto L_0x0068
            boolean r1 = r1.A04
            if (r1 != r2) goto L_0x0068
        L_0x005e:
            r1 = r26
            r1.setSelected(r2)
            r1 = 999321178(0x3b906e5a, float:0.004407686)
            goto L_0x0fa0
        L_0x0068:
            r2 = 0
            goto L_0x005e
        L_0x006a:
            r0 = -549726712(0xffffffffdf3bd608, float:-1.3535015E19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.H0k r6 = (X.C54140H0k) r6
            X.HOV r5 = r6.A00
            if (r5 != 0) goto L_0x007c
            java.lang.String r4 = "entrySurface"
            goto L_0x001e
        L_0x007c:
            X.0eM r2 = r6.A08
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r2)
            X.1Xj r8 = r6.A02
            java.lang.String r4 = "entryMedia"
            if (r8 == 0) goto L_0x001e
            r1 = 1
            X.0qQ.A0B(r7, r1)
            java.lang.Integer r9 = X.AnonymousClass05K.A0C
            java.util.LinkedHashMap r11 = X.AnonymousClass7TE.A1H()
            r10 = 0
            X.C55209Hdz.A00(r5, r6, r7, r8, r9, r10, r11)
            com.instagram.common.session.UserSession r13 = X.AnonymousClass7TE.A0l(r2)
            androidx.fragment.app.FragmentActivity r11 = r6.getActivity()
            X.1Xj r1 = r6.A02
            if (r1 == 0) goto L_0x001e
            X.JSO r1 = X.C51966G9m.A0l(r1)
            if (r1 == 0) goto L_0x00b4
            com.instagram.api.schemas.WorldLocationPagesInfo r1 = r1.CGk()
            if (r1 == 0) goto L_0x00b4
            java.lang.String r16 = r1.getWorldId()
            if (r16 != 0) goto L_0x00b6
        L_0x00b4:
            java.lang.String r16 = ""
        L_0x00b6:
            X.TpH r14 = X.C14068TpH.WORLD_PAGES
            X.UzD r15 = X.C16677UzD.WORLD_PAGES
            r12 = r6
            X.OcF r3 = X.ORV.A01(r11, r12, r13, r14, r15, r16)
            X.Uz2 r2 = X.C16666Uz2.REPORT_BUTTON
            r1 = 0
            X.0qQ.A0B(r2, r1)
            r3.A02 = r2
            X.C71093OcF.A00(r10, r3)
            r1 = -1337049379(0xffffffffb04e3edd, float:-7.50317E-10)
            goto L_0x0fa0
        L_0x00cf:
            r0 = 322252280(0x13352df8, float:2.2868076E-27)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.Gzu r6 = (X.C54125Gzu) r6
            androidx.fragment.app.FragmentActivity r3 = r6.requireActivity()
            r0 = 2131976198(0x7f136006, float:1.958951E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r3, r0)
            X.DbZ.A15(r6)
            X.Hth r7 = r6.A00
            if (r7 == 0) goto L_0x01b8
            java.lang.String r1 = "author_id"
            java.lang.String r0 = r6.A01
            X.0eP r5 = X.AnonymousClass7TE.A1L(r1, r0)
            java.lang.String r1 = "author_username"
            java.lang.String r0 = r6.A02
            X.0eP r0 = X.AnonymousClass7TE.A1L(r1, r0)
            X.0eP[] r0 = new X.0eP[]{r5, r0}
            java.util.LinkedHashMap r1 = X.0Yt.A07(r0)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            r7.A02(r0, r1)
            java.util.HashMap r1 = r6.A03
            if (r1 == 0) goto L_0x01b4
            java.lang.String r0 = "com.instagram.privacy.activity_center.liked_media_screen"
            X.DiU r1 = X.C46649DiU.A04(r0, r1)
            X.0eM r0 = r6.A07
            X.0lg r0 = X.DbT.A0X(r0)
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = X.DbS.A0N(r0)
            r0.A0U = r2
            r1.A0D(r3, r0)
            r0 = -1809859806(0xffffffff941fbb22, float:-8.064354E-27)
            goto L_0x09dd
        L_0x012b:
            r0 = -1107736978(0xffffffffbdf9466e, float:-0.121716365)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.Gzr r4 = (X.C54122Gzr) r4
            X.DbZ.A15(r4)
            X.Hth r3 = r4.A00
            if (r3 == 0) goto L_0x01b8
            java.util.LinkedHashMap r2 = X.AnonymousClass7TE.A1H()
            java.lang.Integer r1 = X.AnonymousClass05K.A1I
            r3.A02(r1, r2)
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            X.0eM r1 = r4.A05
            X.6Yo r2 = X.DbX.A0N(r2, r1)
            r2.A08()
            X.C46447Df9.A03()
            X.E3E r1 = new X.E3E
            r1.<init>()
            r2.A0D(r1)
            r2.A04()
            r1 = 1144827398(0x443cae06, float:754.7191)
            goto L_0x0fa0
        L_0x0166:
            r0 = -1334187171(0xffffffffb079eb5d, float:-9.0920144E-10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.Gzt r7 = (X.C54124Gzt) r7
            androidx.fragment.app.FragmentActivity r6 = r7.requireActivity()
            boolean r1 = r7.A02
            if (r1 == 0) goto L_0x01ae
            java.lang.String r5 = "com.instagram.privacy.activity_center.reels_media_screen"
            r1 = 2131976132(0x7f135fc4, float:1.9589376E38)
        L_0x017e:
            java.lang.String r4 = X.AnonymousClass7TE.A16(r6, r1)
            X.DbZ.A15(r7)
            X.Hth r3 = r7.A00
            if (r3 == 0) goto L_0x01b8
            java.util.LinkedHashMap r2 = X.AnonymousClass7TE.A1H()
            java.lang.Integer r1 = X.AnonymousClass05K.A1I
            r3.A02(r1, r2)
            java.util.HashMap r1 = r7.A01
            if (r1 == 0) goto L_0x01b4
            X.DiU r2 = X.C46649DiU.A04(r5, r1)
            X.0eM r1 = r7.A07
            X.0lg r1 = X.DbT.A0X(r1)
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.DbS.A0N(r1)
            r1.A0U = r4
            r2.A0D(r6, r1)
            r1 = -1011175339(0xffffffffc3bab055, float:-373.3776)
            goto L_0x0fa0
        L_0x01ae:
            java.lang.String r5 = "com.instagram.privacy.activity_center.feed_media_screen"
            r1 = 2131976131(0x7f135fc3, float:1.9589374E38)
            goto L_0x017e
        L_0x01b4:
            java.lang.String r4 = "bloksParams"
            goto L_0x001e
        L_0x01b8:
            java.lang.String r4 = "bottomSheetLogger"
            goto L_0x001e
        L_0x01bc:
            r0 = 1826403498(0x6cdcb4aa, float:2.1345347E27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.GCd r3 = (X.C52031GCd) r3
            X.GJd r1 = X.C52212GJd.A07
            X.HMd r6 = X.C54646HMd.FEED
            X.0eP r5 = X.AnonymousClass7TE.A1L(r1, r6)
            X.GJd r2 = X.C52212GJd.A0B
            X.HMd r1 = X.C54646HMd.STORIES
            X.0eP r4 = X.AnonymousClass7TE.A1L(r2, r1)
            X.GJd r2 = X.C52212GJd.A05
            X.HMd r1 = X.C54646HMd.REELS
            java.util.HashMap r2 = X.C51975G9x.A0n(r2, r1, r5, r4)
            X.GJd r1 = r3.A0B
            java.lang.Object r8 = r2.getOrDefault(r1, r6)
            X.0qQ.A07(r8)
            X.HMd r8 = (X.C54646HMd) r8
            X.3W1 r2 = r3.A03
            java.lang.String r1 = "ad_transparency_disclaimer_ad_action_menu_item"
            X.C52031GCd.A07(r2, r3, r1)
            com.instagram.common.session.UserSession r6 = r3.A07
            android.app.Activity r4 = r3.A06
            X.DbS.A1X(r4)
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            X.1Xl r1 = r3.A02
            if (r1 == 0) goto L_0x0249
            X.1Xj r7 = r1.BPf()
            com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement r5 = com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement.OVERFLOW_MENU
            r1 = 18
            X.WxR r9 = new X.WxR
            r9.<init>(r3, r1)
            X.I3z.A00(r4, r5, r6, r7, r8, r9)
            r1 = 731452895(0x2b9915df, float:1.0877374E-12)
            goto L_0x0fa0
        L_0x0213:
            r0 = 14112193(0xd755c1, float:1.9775394E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.GCd r2 = (X.C52031GCd) r2
            X.1Xl r1 = r2.A02
            if (r1 == 0) goto L_0x0249
            X.1Xj r1 = r1.BPf()
            X.C52031GCd.A03(r1, r2)
            r1 = 1535771308(0x5b8a02ac, float:7.7692969E16)
            goto L_0x0fa0
        L_0x022e:
            r0 = -780360673(0xffffffffd17ca41f, float:-6.7817828E10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.GCd r2 = (X.C52031GCd) r2
            X.1Xl r1 = r2.A02
            if (r1 == 0) goto L_0x0249
            X.1Xj r1 = r1.BPf()
            X.C52031GCd.A03(r1, r2)
            r1 = 1123265334(0x42f3ab36, float:121.8344)
            goto L_0x0fa0
        L_0x0249:
            java.lang.String r4 = "model"
            goto L_0x001e
        L_0x024d:
            r0 = 710101118(0x2a53487e, float:1.8765715E-13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView r4 = (com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView) r4
            int r2 = r4.A00
            java.lang.String r3 = "IgShowreelNativeProgressView#handleRetryOnClick"
            r1 = 3
            if (r2 == r1) goto L_0x0269
            java.lang.String r1 = "Loading state should be error state"
        L_0x0261:
            X.0wb.A03(r3, r1)
        L_0x0264:
            r1 = -2024982816(0xffffffff874d36e0, float:-1.5438612E-34)
            goto L_0x0fa0
        L_0x0269:
            X.6Jx r2 = r4.A03
            if (r2 != 0) goto L_0x0270
            java.lang.String r1 = "Data is null"
            goto L_0x0261
        L_0x0270:
            r1 = 1
            com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView.A01(r4, r1)
            X.GyD r3 = r4.A04
            if (r3 != 0) goto L_0x027c
            java.lang.String r4 = "mediaView"
            goto L_0x001e
        L_0x027c:
            com.instagram.common.session.UserSession r4 = r2.A02
            java.util.List r5 = r2.A04
            X.3uh r6 = r2.A03
            X.6L7 r7 = r2.A01
            X.6LO r8 = r2.A00
            r3.setShowreelAnimation(r4, r5, r6, r7, r8)
            goto L_0x0264
        L_0x028a:
            r0 = 1807510677(0x6bbc6c95, float:4.5558164E26)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.GVT r5 = (X.GVT) r5
            X.7Pu r2 = r5.A08
            java.lang.String r0 = "Required value was null."
            X.0eM r6 = r5.A0o
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r6)
            com.instagram.music.common.model.MusicAssetModel r1 = r5.A0B
            if (r2 == 0) goto L_0x02d7
            if (r1 == 0) goto L_0x02fb
            r0 = 0
            X.0qQ.A0B(r7, r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r2 = X.C63351KvY.A00(r7, r1)
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            java.lang.String r0 = "music_on_profile"
            X.6W8 r1 = X.DbV.A0Y(r1, r2, r7, r4, r0)
            r0 = 1355(0x54b, float:1.899E-42)
            r1.A0D(r5, r0)
        L_0x02be:
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r6)
            java.lang.String r10 = "audio_page"
            long r13 = r5.A00
            X.HOu r6 = X.C54689HOu.A0v
            r7 = 0
            java.lang.Long r9 = r5.A0O
            r11 = r7
            r12 = r7
            X.C56326Hwd.A00(r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = -1758146123(0xffffffff9734d1b5, float:-5.8425824E-25)
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        L_0x02d7:
            if (r1 == 0) goto L_0x02f3
            androidx.fragment.app.FragmentActivity r4 = r5.requireActivity()
            r0 = 0
            X.0qQ.A0B(r7, r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r1 = X.C63351KvY.A00(r7, r1)
            java.lang.String r0 = "music_on_profile"
            X.6W8 r1 = X.DbV.A0Y(r4, r1, r7, r2, r0)
            r0 = 1355(0x54b, float:1.899E-42)
            r1.A0A(r4, r0)
            goto L_0x02be
        L_0x02f3:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
            r0 = 735270707(0x2bd35733, float:1.5016654E-12)
            goto L_0x0302
        L_0x02fb:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
            r0 = 612455554(0x24815482, float:5.6087994E-17)
        L_0x0302:
            X.AnonymousClass0fD.A0C(r0, r3)
            throw r1
        L_0x0306:
            java.lang.Object r6 = r1.A01
            instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment r6 = (instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment) r6
            com.instagram.common.session.UserSession r5 = r6.A07
            X.1a1 r4 = X.C46447Df9.A02()
            com.instagram.common.session.UserSession r3 = r6.A07
            com.instagram.ar.features.effectspage.models.EffectsPageModel r0 = r6.A03
            r0.getClass()
            java.lang.String r2 = r0.A09
            java.lang.String r1 = "effect_page"
            java.lang.String r0 = "EFFECT_PAGE_CREATOR"
            X.Dfc r1 = X.C46548Dgp.A01(r3, r2, r0, r1)
            r0 = 90
            java.lang.String r0 = X.C273654mx.A00(r0)
            r1.A0O = r0
            com.instagram.profile.intf.UserDetailLaunchConfig r0 = r1.A04()
            android.os.Bundle r1 = r4.A01(r3, r0)
            android.app.Activity r0 = r6.getRootActivity()
            r0.getClass()
            X.C51974G9v.A0f(r0, r1, r6, r5)
            return
        L_0x033c:
            r0 = -110280519(0xfffffffff96d40b9, float:-7.6992943E34)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.K4a r2 = (X.C61358K4a) r2
            X.0eM r0 = r2.A08
            java.lang.Object r0 = r0.getValue()
            com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel r0 = (com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel) r0
            X.LSk r8 = r0.A03
            java.lang.String r12 = r0.A06
            java.lang.String r3 = r0.A07
            X.Dbv r0 = r0.A00
            r1 = 0
            X.Jqu r7 = X.LSk.A01(r0, r3)
            java.lang.String r9 = "user"
            r0 = 3762(0xeb2, float:5.272E-42)
            java.lang.String r10 = X.AnonymousClass000.A00(r0)
            java.lang.String r11 = "tap_more_options"
            X.LSk.A02(r7, r8, r9, r10, r11, r12)
            android.content.Context r8 = r2.requireContext()
            androidx.fragment.app.FragmentActivity r9 = r2.requireActivity()
            X.0sa r14 = r2.A04
            X.0sa r5 = r2.A03
            X.0eM r3 = r2.A06
            com.instagram.common.session.UserSession r0 = X.DbW.A0S(r3, r1)
            com.instagram.trials.repository.ClipsTrialBottomSheetRepositoryImpl r13 = new com.instagram.trials.repository.ClipsTrialBottomSheetRepositoryImpl
            r13.<init>(r0)
            X.0lg r11 = X.DbT.A0X(r3)
            android.os.Bundle r1 = r2.requireArguments()
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r3)
            r0 = 1024(0x400, float:1.435E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L_0x039a
            java.lang.String r0 = ""
        L_0x039a:
            X.LSk r12 = X.LK1.A01(r2, r3, r0)
            r0 = 1035(0x40b, float:1.45E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r15 = r1.getString(r0)
            if (r15 != 0) goto L_0x03ac
            java.lang.String r15 = ""
        L_0x03ac:
            r0 = 985(0x3d9, float:1.38E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r3 = r1.getString(r0)
            r0 = 984(0x3d8, float:1.379E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.io.Serializable r10 = r1.getSerializable(r0)
            boolean r0 = r10 instanceof X.C46327Dbv
            if (r0 == 0) goto L_0x042f
            X.Dbv r10 = (X.C46327Dbv) r10
        L_0x03c6:
            X.37D r4 = X.DbT.A0i(r9)
            if (r4 == 0) goto L_0x0411
            X.Dg1 r0 = new X.Dg1
            r0.<init>(r8, r11)
            r2 = 2131975537(0x7f135d71, float:1.958817E38)
            r17 = 1
            X.WA9 r1 = new X.WA9
            r18 = r1
            r19 = r12
            r20 = r5
            r21 = r10
            r22 = r15
            r23 = r3
            r24 = r17
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r0.A04(r1, r2)
            r1 = 2131955987(0x7f131113, float:1.9548517E38)
            X.ICh r7 = new X.ICh
            r16 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.A04(r7, r1)
            r2 = r4
            X.37F r2 = (X.AnonymousClass37F) r2
            boolean r1 = r2.A0g
            if (r1 == 0) goto L_0x0416
            X.Ia2 r1 = new X.Ia2
            r7 = r1
            r8 = r9
            r9 = r10
            r10 = r0
            r11 = r12
            r12 = r15
            r13 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r2.A0H = r1
            r4.A0B()
        L_0x0411:
            r0 = 906038532(0x36010d04, float:1.9230074E-6)
            goto L_0x05a2
        L_0x0416:
            X.Jqu r16 = X.LSk.A01(r10, r3)
            java.lang.String r18 = "client"
            r1 = 739(0x2e3, float:1.036E-42)
            java.lang.String r19 = X.AnonymousClass000.A00(r1)
            java.lang.String r20 = "impression"
            r17 = r12
            r21 = r15
            X.LSk.A02(r16, r17, r18, r19, r20, r21)
            X.C51969G9p.A11(r9, r0)
            goto L_0x0411
        L_0x042f:
            r10 = 0
            goto L_0x03c6
        L_0x0431:
            r0 = -535830014(0xffffffffe00fe202, float:-4.1471406E19)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.GCd r1 = (X.C52031GCd) r1
            android.app.Activity r0 = r1.A06
            X.DbS.A1X(r0)
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            com.instagram.common.session.UserSession r2 = r1.A07
            r14 = 0
            X.0qQ.A0B(r0, r14)
            X.0rm r1 = X.C51965G9l.A11()
            java.lang.String r3 = "ad_preferences"
            r1.A00 = r3
            X.1vn r5 = X.1vm.A01(r2)
            X.0Tu r7 = X.0Tu.A05
            r3 = 2342168498279035893(0x20810dd7000833f5, double:4.070240142023001E-152)
            boolean r3 = X.182.A06(r7, r2, r3)
            if (r3 == 0) goto L_0x048f
            r15 = 0
            X.2IS r4 = X.C41845B3m.A04()
            X.2IS r3 = X.C41845B3m.A04()
            X.1vR r9 = X.C41845B3m.A05()
            java.util.Map r11 = r4.getParamsCopy()
            java.util.Map r12 = r3.getParamsCopy()
            java.lang.Class<X.BnQ> r13 = X.BnQ.class
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
            java.lang.String r10 = "FxCalUpdateAdExperienceIsAPCEligibleQuery"
            r3 = 150(0x96, float:2.1E-43)
            java.lang.String r18 = X.C273654mx.A00(r3)
            com.facebook.pando.PandoGraphQLRequest r8 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r17 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x04c8
        L_0x048f:
            X.2IS r4 = X.C41845B3m.A04()
            X.2IS r3 = X.C41845B3m.A04()
            X.1vR r9 = X.C41845B3m.A05()
            java.util.Map r11 = r4.getParamsCopy()
            java.util.Map r12 = r3.getParamsCopy()
            java.lang.Class<X.BnO> r13 = X.BnO.class
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
            java.lang.String r10 = "FxCalGetKitKatUserExperienceQuery"
            r15 = 0
            r3 = 1963(0x7ab, float:2.751E-42)
            java.lang.String r18 = X.AnonymousClass000.A00(r3)
            com.facebook.pando.PandoGraphQLRequest r8 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r17 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r3 = 2
            X.II0 r7 = new X.II0     // Catch:{ Exception -> 0x04d8 }
            r7.<init>(r3, r0, r1, r2)     // Catch:{ Exception -> 0x04d8 }
            r3 = 4
            X.DFB r4 = new X.DFB     // Catch:{ Exception -> 0x04d8 }
            r4.<init>((int) r3, (java.lang.Object) r0, (java.lang.Object) r2, (java.lang.Object) r1)     // Catch:{ Exception -> 0x04d8 }
            goto L_0x04d4
        L_0x04c8:
            r3 = 4
            X.DFU r7 = new X.DFU     // Catch:{ Exception -> 0x04d8 }
            r7.<init>(r3, r2, r0, r1)     // Catch:{ Exception -> 0x04d8 }
            r3 = 3
            X.DFB r4 = new X.DFB     // Catch:{ Exception -> 0x04d8 }
            r4.<init>((int) r3, (java.lang.Object) r0, (java.lang.Object) r2, (java.lang.Object) r1)     // Catch:{ Exception -> 0x04d8 }
        L_0x04d4:
            r5.ATL(r4, r7, r8)     // Catch:{ Exception -> 0x04d8 }
            goto L_0x04df
        L_0x04d8:
            java.lang.Object r1 = r1.A00
            java.lang.String r1 = (java.lang.String) r1
            X.I3C.A02(r0, r2, r1)
        L_0x04df:
            r0 = -598561784(0xffffffffdc52ac08, float:-2.37195582E17)
            goto L_0x05a2
        L_0x04e4:
            r0 = -1918946074(0xffffffff8d9f34e6, float:-9.811866E-31)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.H0q r3 = (X.C54146H0q) r3
            X.0eM r0 = r3.A01
            X.INA r0 = X.C51966G9m.A0z(r0)
            X.HOd r2 = r3.A00
            r15 = 0
            X.0wc r1 = X.INA.A02(r0, r2, r15)
            java.lang.String r0 = "ig_school_reliability_edit_banner_page_save_tap"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0510
            X.C51965G9l.A1B(r2, r1)
            X.HOp r0 = X.C54684HOp.EDIT_BANNER
            X.C51974G9v.A0j(r0, r1)
        L_0x0510:
            X.0eM r0 = r3.A03
            java.lang.Object r2 = r0.getValue()
            X.Ggb r2 = (X.C52984Ggb) r2
            r0 = 23
            X.Imz r1 = new X.Imz
            r1.<init>(r3, r0)
            com.instagram.schools.management.data.SchoolSettingsRepository r3 = r2.A00
            X.05G r0 = r2.A01
            java.lang.Object r0 = r0.getValue()
            X.JwG r0 = (X.C61078JwG) r0
            java.lang.Object r0 = r0.A00
            X.JwL r0 = (X.C61083JwL) r0
            java.lang.Object r0 = r0.A01
            X.Gm0 r0 = (X.C53314Gm0) r0
            if (r0 == 0) goto L_0x05ac
            java.lang.String r7 = r0.A05
        L_0x0535:
            r13 = 1
            X.05G r0 = r3.A03
            java.lang.Object r0 = r0.getValue()
            X.JwL r0 = (X.C61083JwL) r0
            java.lang.Object r0 = r0.A01
            X.Gm0 r0 = (X.C53314Gm0) r0
            if (r0 == 0) goto L_0x05aa
            java.lang.String r2 = r0.A05
        L_0x0546:
            if (r7 == 0) goto L_0x05a6
            int r0 = r7.length()
            if (r0 == 0) goto L_0x05a6
            boolean r0 = r7.equals(r2)
            if (r0 != 0) goto L_0x05a6
            X.2IS r5 = X.C41845B3m.A04()
            X.2IS r4 = X.C41845B3m.A04()
            X.0K0 r2 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r14 = 0
            java.lang.String r0 = "badge_name"
            X.0Df r2 = X.C41845B3m.A03(r2, r7, r0)
            java.lang.String r0 = "input"
            X.1vR r8 = X.C41847B3o.A04(r2, r5, r0)
            java.util.Map r10 = r5.getParamsCopy()
            java.util.Map r11 = r4.getParamsCopy()
            java.lang.Class<com.instagram.schools.management.data.UpdateBadgeNameResponseImpl> r12 = com.instagram.schools.management.data.UpdateBadgeNameResponseImpl.class
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            java.lang.String r9 = "UpdateBadgeName"
            java.lang.String r17 = "xdt_update_badge_name"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.instagram.common.session.UserSession r0 = r3.A00
            X.1vn r4 = X.1vm.A01(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            com.instagram.schools.management.data.SchoolSettingsRepository.A01(r3, r0)
            r0 = 11
            X.DFQ r2 = new X.DFQ
            r2.<init>(r0, r3, r1)
            r1 = 7
            X.DEx r0 = new X.DEx
            r0.<init>(r3, r1)
            r4.ATL(r0, r2, r7)
        L_0x059f:
            r0 = 1912451579(0x71fdb1fb, float:2.512476E30)
        L_0x05a2:
            X.AnonymousClass0fD.A0C(r0, r6)
            return
        L_0x05a6:
            r1.invoke()
            goto L_0x059f
        L_0x05aa:
            r2 = 0
            goto L_0x0546
        L_0x05ac:
            r7 = 0
            goto L_0x0535
        L_0x05ae:
            r0 = -1431008610(0xffffffffaab48a9e, float:-3.2070608E-13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.H0t r1 = (X.C54149H0t) r1
            X.GhK r4 = X.G9w.A0c(r1)
            r1 = 0
            r4.A02(r1)
            com.instagram.wonderwall.repository.WallPostComposerRepository r3 = r4.A03
            java.lang.String r13 = X.AnonymousClass7TG.A0j()
            com.instagram.user.model.User r10 = r3.A02
            com.instagram.wonderwall.model.WallInfo r11 = r3.A04
            X.05G r2 = r3.A07
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r14 = X.DbV.A12(r2)
            long r18 = java.lang.System.currentTimeMillis()
            r2 = 1
            X.0sn r15 = X.0sn.A00
            X.HMM r12 = X.HMM.IDLE
            r17 = -1
            com.instagram.wonderwall.model.WallPostInfo r9 = new com.instagram.wonderwall.model.WallPostInfo
            r16 = r1
            r20 = r2
            r21 = r1
            r22 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r21, r22)
            X.05G r5 = r3.A06
            java.lang.Object r8 = r5.getValue()
            X.YBO r8 = (X.YBO) r8
            boolean r5 = r8 instanceof X.C53562GqY
            if (r5 == 0) goto L_0x0660
            X.GqY r8 = (X.C53562GqY) r8
            java.util.concurrent.atomic.AtomicBoolean r1 = X.1Xj.A0i
            X.1Xx r5 = new X.1Xx
            r5.<init>()
            r2 = 0
            X.1hu r1 = new X.1hu
            r1.<init>(r2)
            X.1Xj r7 = new X.1Xj
            r7.<init>(r1, r5)
            com.instagram.common.gallery.Medium r6 = r8.A00
            boolean r5 = r6.CeS()
            int r1 = r6.A05
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r7.A4G(r1)
            com.instagram.common.typedurl.ImageUrl r1 = r8.A01
            r7.A09 = r1
            int r1 = r6.A0B
            X.1Xy r2 = r7.A0C
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.Ef0(r1)
            int r1 = r6.A04
            X.1Xy r2 = r7.A0C
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.Eey(r1)
            java.lang.String r1 = r6.A0X
            r7.A0M = r1
            if (r5 == 0) goto L_0x065d
            X.1iA r1 = X.1iA.A0a
        L_0x0640:
            r7.A4A(r1)
            com.instagram.wonderwall.model.WallMediaPostItem r5 = new com.instagram.wonderwall.model.WallMediaPostItem
            r5.<init>(r7, r9)
            r5.A00 = r6
        L_0x064a:
            com.instagram.wonderwall.model.WallPostItem r5 = (com.instagram.wonderwall.model.WallPostItem) r5
            com.instagram.wonderwall.repository.WallPendingPostManager r2 = r3.A05
            java.lang.String r1 = r11.A01
            r2.A05(r5, r1)
            X.Ibr r1 = X.C57503Ibr.A00
            X.C53029GhK.A00(r1, r4)
            r1 = 131359785(0x7d46429, float:3.1957084E-34)
            goto L_0x0fa0
        L_0x065d:
            X.1iA r1 = X.1iA.A0Q
            goto L_0x0640
        L_0x0660:
            boolean r1 = X.C53563GqZ.A00(r1, r8)
            if (r1 == 0) goto L_0x0672
            X.GqZ r8 = (X.C53563GqZ) r8
            java.lang.Object r1 = r8.A01
            X.1Xj r1 = (X.1Xj) r1
            com.instagram.wonderwall.model.WallMediaPostItem r5 = new com.instagram.wonderwall.model.WallMediaPostItem
            r5.<init>(r1, r9)
            goto L_0x064a
        L_0x0672:
            boolean r1 = X.C53563GqZ.A00(r2, r8)
            if (r1 == 0) goto L_0x0688
            X.GqZ r8 = (X.C53563GqZ) r8
            java.lang.Object r2 = r8.A02
            com.instagram.music.common.model.AudioOverlayTrack r2 = (com.instagram.music.common.model.AudioOverlayTrack) r2
            java.lang.Object r1 = r8.A01
            java.util.List r1 = (java.util.List) r1
            com.instagram.wonderwall.model.WallMusicPostItem r5 = new com.instagram.wonderwall.model.WallMusicPostItem
            r5.<init>(r2, r9, r1)
            goto L_0x064a
        L_0x0688:
            boolean r1 = r8 instanceof X.C53561GqX
            if (r1 == 0) goto L_0x0698
            X.GqX r8 = (X.C53561GqX) r8
            java.lang.String r2 = r8.A01
            com.instagram.model.mediasize.GifUrlImpl r1 = r8.A00
            com.instagram.wonderwall.model.WallGifPostItem r5 = new com.instagram.wonderwall.model.WallGifPostItem
            r5.<init>(r1, r9, r2)
            goto L_0x064a
        L_0x0698:
            com.instagram.wonderwall.model.WallTextPostItem r5 = new com.instagram.wonderwall.model.WallTextPostItem
            r5.<init>(r9)
            goto L_0x064a
        L_0x069e:
            r0 = 1080251394(0x40635402, float:3.5520024)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Gzy r1 = (X.C54129Gzy) r1
            X.0eM r1 = r1.A03
            java.lang.Object r4 = r1.getValue()
            X.Ggu r4 = (X.C53003Ggu) r4
            X.0wc r3 = r4.A00
            if (r3 == 0) goto L_0x06ca
            boolean r2 = r4.A05
            X.1Yp r1 = r4.A01
            if (r2 == 0) goto L_0x06ed
            if (r1 == 0) goto L_0x06ca
            X.7dS r2 = r4.A02
            X.7dS r1 = X.C335737dS.BOTTOMSHEET_MEDIA_CREATION_STORY
            boolean r2 = X.AnonymousClass7TF.A1W(r2, r1)
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            X.1Yp.A03(r3, r1, r2)
        L_0x06ca:
            X.05G r5 = r4.A03
        L_0x06cc:
            java.lang.Object r4 = r5.getValue()
            r1 = r4
            X.JwL r1 = (X.C61083JwL) r1
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            java.lang.Object r2 = r1.A01
            X.7dS r2 = (X.C335737dS) r2
            r1 = 1
            X.0qQ.A0B(r2, r1)
            X.JwL r1 = new X.JwL
            r1.<init>((X.C335737dS) r2, (java.lang.Integer) r3)
            boolean r1 = r5.AIY(r4, r1)
            if (r1 == 0) goto L_0x06cc
            r1 = 1568825161(0x5d825f49, float:1.17428845E18)
            goto L_0x0fa0
        L_0x06ed:
            if (r1 == 0) goto L_0x06ca
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            r1 = 1
            X.1Yp.A04(r3, r2, r1)
            goto L_0x06ca
        L_0x06f6:
            r0 = -1181354717(0xffffffffb995f523, float:-2.8602136E-4)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.Gzb r4 = (X.C54106Gzb) r4
            X.37E r1 = X.AnonymousClass37D.A00
            X.37D r3 = X.DbV.A0g(r4, r1)
            X.Hob r1 = r4.A00
            r2 = 1
            if (r1 == 0) goto L_0x0727
            boolean r1 = r1.A05
            if (r1 != r2) goto L_0x0727
            X.7Pu r1 = X.C48943Emh.A00(r3)
            if (r1 == 0) goto L_0x0719
            r1.A0T()
        L_0x0719:
            X.Hob r1 = r4.A00
            if (r1 == 0) goto L_0x0722
            X.7dV r1 = r1.A02
            r1.CyZ()
        L_0x0722:
            r1 = 240661951(0xe5835bf, float:2.6649933E-30)
            goto L_0x0fa0
        L_0x0727:
            if (r3 == 0) goto L_0x0719
            r3.A0B()
            goto L_0x0719
        L_0x072d:
            r0 = 463070069(0x1b99e375, float:2.5458717E-22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            android.view.View r6 = (android.view.View) r6
            r5 = 10
            java.lang.String[] r4 = new java.lang.String[r5]
            r3 = 0
            r2 = 0
        L_0x073e:
            int r1 = r2 * 300
            int r1 = 3300 - r1
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r4[r2] = r1
            int r2 = r2 + 1
            if (r2 < r5) goto L_0x073e
            java.lang.String r1 = "Disable Throttling"
            r4[r3] = r1
            android.content.Context r1 = r6.getContext()
            X.8ab r2 = X.DbS.A0Y(r1)
            X.I8y r1 = new X.I8y
            r1.<init>((int) r5, (java.lang.Object) r4, (java.lang.Object) r6)
            r2.A0e(r1, r4)
            java.lang.String r1 = "Set Bandwidth (Kbps)"
            r2.A0q(r1)
            X.Dba.A1M(r2)
            android.app.Dialog r3 = r2.A02()
            android.view.Window r2 = r3.getWindow()
            if (r2 == 0) goto L_0x0777
            r1 = 2038(0x7f6, float:2.856E-42)
            r2.setType(r1)
        L_0x0777:
            X.AnonymousClass0fN.A00(r3)
            r1 = 1119584046(0x42bb7f2e, float:93.7484)
            goto L_0x0fa0
        L_0x077f:
            r0 = -518769722(0xffffffffe11433c6, float:-1.7086555E20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment r2 = (instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment) r2
            com.instagram.ar.features.effectspage.models.EffectsPageModel r1 = r2.A03
            if (r1 == 0) goto L_0x07a6
            java.lang.String r6 = r1.A0D
            if (r6 == 0) goto L_0x07a6
            com.instagram.common.session.UserSession r3 = r2.A07
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            X.4DU r2 = r2.A0R
            X.TpH r4 = X.C14068TpH.CLIPS_EFFECT_PAGE
            X.UzD r5 = X.C16677UzD.AR_EFFECT
            X.OcF r2 = X.ORV.A01(r1, r2, r3, r4, r5, r6)
            r1 = 0
            X.C71093OcF.A00(r1, r2)
        L_0x07a6:
            r1 = 15578769(0xedb691, float:2.1830505E-38)
            goto L_0x0fa0
        L_0x07ab:
            java.lang.Object r5 = r1.A01
            instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment r5 = (instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment) r5
            com.instagram.ar.features.effectspage.models.EffectsPageModel r0 = r5.A03
            if (r0 == 0) goto L_0x0fa3
            java.lang.String r9 = r0.A0D
            if (r9 == 0) goto L_0x0fa3
            X.0xF r4 = new X.0xF
            r4.<init>()
            java.lang.String r0 = "effect_id"
            X.0xF.A00(r4, r9, r0)
            X.1as r0 = X.1as.A04
            X.1ap r3 = r0.A02
            com.instagram.common.session.UserSession r2 = r5.A07
            X.2FW r1 = X.2FW.A0M
            X.4DU r0 = r5.A0R
            X.F3w r6 = r3.A07(r0, r2, r1)
            com.instagram.ar.features.effectspage.models.EffectsPageModel r0 = r5.A03
            java.lang.String r10 = r0.A0E
            com.instagram.common.typedurl.ImageUrl r7 = r0.A04
            java.lang.String r11 = r0.A09
            r8 = 0
            r6.A03(r7, r8, r9, r10, r11)
            r6.A02(r4)
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r2 = r6.A00()
            android.content.Context r1 = r5.getContext()
            X.37E r0 = X.AnonymousClass37D.A00
            X.37D r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x0fa3
            r0.A0I(r2)
            return
        L_0x07f2:
            java.lang.Object r1 = r1.A01
            instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment r1 = (instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment) r1
            com.instagram.ar.features.effectspage.models.EffectsPageModel r8 = r1.A03
            if (r8 == 0) goto L_0x0fa3
            android.view.View r0 = r1.mSaveButton
            if (r0 == 0) goto L_0x0fa3
            boolean r4 = r8.A02
            X.GgS r7 = r1.A04
            if (r7 == 0) goto L_0x0816
            X.9tK r6 = r1.A00
            java.lang.String r9 = "effect_page"
            X.6oS r0 = X.C318116oQ.A00(r7)
            r10 = 0
            r11 = 2
            X.MH6 r5 = new X.MH6
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (java.lang.String) r9, (X.AnonymousClass4D7) r10, (int) r11)
            X.AnonymousClass7TE.A1Z(r5, r0)
        L_0x0816:
            android.view.View r0 = r1.mSaveButton
            if (r0 == 0) goto L_0x0fa3
            com.instagram.ar.features.effectspage.models.EffectsPageModel r2 = r1.A03
            if (r4 == 0) goto L_0x0873
            X.3Ym r0 = X.C243373Ym.NOT_SAVED
        L_0x0820:
            r2.EjB(r0)
            androidx.fragment.app.FragmentActivity r0 = r1.getActivity()
            X.C51970G9q.A12(r0)
            com.instagram.ar.features.effectspage.models.EffectsPageModel r0 = r1.A03
            java.lang.String r6 = r0.A0D
            X.1Xj r3 = r1.A08
            if (r3 == 0) goto L_0x0852
            com.instagram.feed.media.CreativeConfigIntf r0 = X.C51966G9m.A0r(r3)
            if (r0 == 0) goto L_0x0852
            if (r6 == 0) goto L_0x0852
            com.instagram.feed.media.CreativeConfigIntf r2 = X.C51966G9m.A0r(r3)
            r0 = r4 ^ 1
            com.instagram.feed.media.CreativeConfig r2 = X.C284745Nt.A01(r2, r6, r0)
            X.1Xy r0 = r3.A0C
            r0.ETB(r2)
            com.instagram.common.session.UserSession r0 = r1.A07
            X.1E8 r0 = X.1E7.A00(r0)
            r0.A00(r3)
        L_0x0852:
            com.instagram.common.session.UserSession r0 = r1.A07
            X.4DU r9 = r1.A0R
            if (r6 != 0) goto L_0x085a
            java.lang.String r6 = ""
        L_0x085a:
            java.lang.String r2 = r1.A0F
            java.lang.String r8 = r1.A0H
            X.1Xj r5 = r1.A08
            java.lang.String r7 = r1.A0K
            X.AnonymousClass7TG.A1T(r0, r9, r6)
            X.0wc r1 = X.AnonymousClass0kN.A01(r9, r0)
            java.lang.String r0 = "instagram_organic_effect_save_tap"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            r3 = 0
            if (r2 == 0) goto L_0x087a
            goto L_0x0876
        L_0x0873:
            X.3Ym r0 = X.C243373Ym.SAVED
            goto L_0x0820
        L_0x0876:
            java.lang.Long r3 = X.DbV.A0q(r2)     // Catch:{ NumberFormatException -> 0x087a }
        L_0x087a:
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x0fa3
            X.DbW.A16(r4, r9)
            r0 = 0
            java.lang.Long r0 = X.DbV.A0q(r6)     // Catch:{ NumberFormatException -> 0x0888 }
        L_0x0888:
            r9 = 0
            long r0 = X.DbY.A04(r0)
            X.C51970G9q.A1A(r4, r0)
            X.HOu r0 = X.C54689HOu.A0O
            X.C51965G9l.A1C(r0, r4)
            r0 = 0
            if (r3 == 0) goto L_0x08a7
            X.4Ny r2 = new X.4Ny
            r2.<init>(r3)
        L_0x089e:
            java.lang.String r1 = "media_author_id"
            r4.AAE(r2, r1)
            r1 = 0
            if (r8 == 0) goto L_0x08ad
            goto L_0x08a9
        L_0x08a7:
            r2 = r0
            goto L_0x089e
        L_0x08a9:
            java.lang.Long r1 = X.DbV.A0q(r8)     // Catch:{ NumberFormatException -> 0x08ad }
        L_0x08ad:
            X.C51965G9l.A1E(r4, r1)
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            java.lang.String r1 = "media_index"
            r4.A9F(r1, r3)
            r1 = 0
            if (r8 == 0) goto L_0x08c7
            java.lang.Long r1 = X.DbV.A0q(r8)     // Catch:{ NumberFormatException -> 0x08c0 }
        L_0x08c0:
            if (r1 == 0) goto L_0x08c7
            java.util.List r2 = X.AnonymousClass7TE.A1I(r1)
            goto L_0x08c8
        L_0x08c7:
            r2 = r0
        L_0x08c8:
            java.lang.String r1 = "media_list"
            r4.AAe(r1, r2)
            if (r7 != 0) goto L_0x08d1
            java.lang.String r7 = ""
        L_0x08d1:
            X.C51965G9l.A1N(r4, r7)
            r2 = 0
            java.lang.Long r2 = X.DbV.A0q(r6)     // Catch:{ NumberFormatException -> 0x08d9 }
        L_0x08d9:
            java.lang.String r1 = "target_id"
            r4.A9F(r1, r2)
            if (r5 == 0) goto L_0x08fd
            X.1Xy r1 = r5.A0C
            java.lang.String r2 = r1.getMezqlToken()
        L_0x08e6:
            java.lang.String r1 = "mezql_token"
            r4.AAJ(r1, r2)
            if (r5 == 0) goto L_0x08f1
            java.lang.String r0 = X.DbT.A0x(r5)
        L_0x08f1:
            X.C51965G9l.A1Q(r4, r0)
            java.lang.String r0 = "is_trending_label"
            r4.A9F(r0, r3)
            X.AnonymousClass7TH.A0V(r4)
            return
        L_0x08fd:
            r2 = r0
            goto L_0x08e6
        L_0x08ff:
            r0 = 1265846614(0x4b734956, float:1.5944022E7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            android.content.Context r1 = (android.content.Context) r1
            X.AnonymousClass3OC.A01(r1)
            r1 = 13784359(0xd25527, float:1.9316001E-38)
            goto L_0x0fa0
        L_0x0912:
            r0 = 1955627406(0x7490818e, float:9.1591605E31)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.Dbb.A0z(r1)
            r1 = -1063532456(0xffffffffc09bc858, float:-4.868206)
            goto L_0x0fa0
        L_0x0925:
            r0 = 947320873(0x3876f829, float:5.8882088E-5)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.H0k r4 = (X.C54140H0k) r4
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            X.0eM r1 = r4.A08
            X.Dg1 r3 = X.C46498Dg1.A00(r2, r1)
            r2 = 2131972171(0x7f13504b, float:1.9581342E38)
            r1 = 62
            X.ID1 r1 = A00(r4, r1)
            r3.A02(r1, r2)
            X.C49945FFy.A00(r4, r3)
            r1 = -234288129(0xfffffffff2090bff, float:-2.7144927E30)
            goto L_0x0fa0
        L_0x094e:
            r0 = -1317584623(0xffffffffb1774111, float:-3.5980217E-9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.H0b r1 = (X.C54132H0b) r1
            X.0eM r1 = r1.A03
            java.lang.Object r5 = r1.getValue()
            X.Ghg r5 = (X.C53048Ghg) r5
            r1 = 0
            r5.A04(r1)
            X.0Ud r1 = r5.A0B
            java.lang.Object r1 = r1.getValue()
            X.GnH r1 = (X.C53385GnH) r1
            java.lang.Object r3 = r1.A02
            com.instagram.wonderwall.model.WallPostItem r3 = (com.instagram.wonderwall.model.WallPostItem) r3
            com.instagram.wonderwall.model.WallInfo r1 = r5.A02
            com.instagram.wonderwall.repository.WallPostRepository r4 = r5.A04
            X.6oS r6 = X.C318116oQ.A00(r5)
            com.instagram.wonderwall.model.WallPostInfo r2 = r3.BeB()
            com.instagram.wonderwall.model.WallMenuConfig r2 = X.C55207Hdx.A00(r1, r2, r3, r4, r5, r6)
            if (r2 == 0) goto L_0x098b
            X.Ibx r1 = new X.Ibx
            r1.<init>(r2)
            X.C53048Ghg.A02(r1, r5)
        L_0x098b:
            r1 = -1275413764(0xffffffffb3fabafc, float:-1.16755444E-7)
            goto L_0x0fa0
        L_0x0990:
            r0 = 1872501705(0x6f9c1bc9, float:9.66265E28)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.H0W r6 = (X.H0W) r6
            X.0eM r0 = r6.A07
            java.lang.Object r2 = r0.getValue()
            X.Gh5 r2 = (X.C53014Gh5) r2
            X.0V2 r0 = r2.A02
            java.util.AbstractMap r0 = X.C51975G9x.A0m(r0)
            java.util.Collection r0 = r0.values()
            X.0qQ.A07(r0)
            java.lang.Object r1 = X.00k.A0A(r0)
            X.HAX r1 = (X.HAX) r1
            boolean r0 = r1 instanceof X.HH8
            if (r0 == 0) goto L_0x09e1
            X.1Ng r7 = r2.A00
            X.HH8 r1 = (X.HH8) r1
            X.Ibb r0 = r1.A00
            X.1Xj r2 = r0.A00
            java.lang.String r1 = X.C51970G9q.A0j(r2)
            com.instagram.common.typedurl.ImageUrl r0 = r2.A09
            X.GqZ r5 = new X.GqZ
            r5.<init>((com.instagram.common.typedurl.ImageUrl) r0, (X.1Xj) r2, (java.lang.String) r1)
        L_0x09cd:
            X.YBO r5 = (X.YBO) r5
            X.INi r0 = new X.INi
            r0.<init>(r5)
            r7.A00(r0)
        L_0x09d7:
            X.DbT.A1I(r6)
            r0 = -633429398(0xffffffffda3ea26a, float:-1.34147054E16)
        L_0x09dd:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x09e1:
            boolean r0 = r1 instanceof X.HH7
            if (r0 == 0) goto L_0x09d7
            X.HH7 r1 = (X.HH7) r1
            X.Iba r0 = r1.A00
            com.instagram.common.gallery.model.GalleryItem r0 = r0.A00
            com.instagram.common.gallery.Medium r3 = r0.A00
            if (r3 == 0) goto L_0x09d7
            X.1Ng r7 = r2.A00
            int r0 = r3.A05
            java.lang.String r2 = java.lang.String.valueOf(r0)
            boolean r0 = r3.CeS()
            if (r0 == 0) goto L_0x0a0f
            java.lang.String r1 = r3.A0b
        L_0x09ff:
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.C253833rU.A01(r0)
            r0 = 1
            X.GqY r5 = new X.GqY
            r5.<init>(r3, r1, r2, r0)
            goto L_0x09cd
        L_0x0a0f:
            java.lang.String r1 = r3.A0X
            goto L_0x09ff
        L_0x0a12:
            r0 = -1265182919(0xffffffffb496d739, float:-2.8096272E-7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.H0S r1 = (X.H0S) r1
            X.0eM r1 = r1.A03
            java.lang.Object r2 = r1.getValue()
            X.Ghf r2 = (X.C53047Ghf) r2
            X.Ibl r1 = X.C57497Ibl.A00
            X.C53047Ghf.A00(r1, r2)
            r1 = 1422143668(0x54c430b4, float:6.7410455E12)
            goto L_0x0fa0
        L_0x0a2f:
            r0 = 1632333946(0x614b707a, float:2.3454961E20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.HnP r1 = (X.C55790HnP) r1
            X.37D r1 = r1.A03
            if (r1 == 0) goto L_0x0a41
            r1.A0B()
        L_0x0a41:
            r1 = -634381112(0xffffffffda301cc8, float:-1.23928103E16)
            goto L_0x0fa0
        L_0x0a46:
            r0 = -1496351946(0xffffffffa6cf7b36, float:-1.4396907E-15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.H0B r1 = (X.H0B) r1
            X.H0B.A00(r1)
            r1 = 1742879970(0x67e23ce2, float:2.1367558E24)
            goto L_0x0fa0
        L_0x0a59:
            r0 = -629587876(0xffffffffda79405c, float:-1.75395083E16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.37E r2 = X.AnonymousClass37D.A00
            java.lang.Object r1 = r1.A01
            androidx.fragment.app.FragmentActivity r1 = X.DbZ.A0E(r1)
            X.DbX.A10(r1, r2)
            r1 = 327413556(0x1383ef34, float:3.330492E-27)
            goto L_0x0fa0
        L_0x0a70:
            r0 = -1077418340(0xffffffffbfc7e69c, float:-1.5617251)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.H1l r6 = (X.C54166H1l) r6
            X.0eM r5 = r6.A04
            X.0lg r1 = X.DbT.A0X(r5)
            X.0wc r4 = X.AnonymousClass0kN.A02(r1)
            X.0eM r1 = r6.A05
            java.lang.String r3 = X.DbW.A0l(r1)
            java.lang.String r2 = "what_to_limit_sheet"
            r1 = 1
            X.I4R.A00(r4, r3, r2, r1)
            X.H0E r3 = new X.H0E
            r3.<init>()
            X.7Pr r2 = X.DbX.A0f(r5)
            r1 = 2131965039(0x7f13346f, float:1.9566877E38)
            java.lang.String r1 = r6.getString(r1)
            r2.A0d = r1
            r1 = 8
            X.C57385IZq.A00(r2, r6, r1)
            X.DbY.A13(r6, r3, r2)
            r1 = 712215167(0x2a738a7f, float:2.1630786E-13)
            goto L_0x0fa0
        L_0x0ab0:
            r0 = -1590941162(0xffffffffa12c2a16, float:-5.8331567E-19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.H1l r2 = (X.C54166H1l) r2
            X.0eM r1 = r2.A06
            X.2YL r4 = X.DbS.A0H(r1)
            r1 = 31
            X.MPC r3 = new X.MPC
            r3.<init>(r2, r1)
            X.6oS r2 = X.C318116oQ.A00(r4)
            r1 = 4
            X.C51975G9x.A1E(r3, r4, r2, r1)
            r1 = 418643107(0x18f3fca3, float:6.3069126E-24)
            goto L_0x0fa0
        L_0x0ad5:
            r0 = -1078369696(0xffffffffbfb96260, float:-1.4483147)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Iav r2 = (X.C57451Iav) r2
            r1 = 1
            r2.A00 = r1
            android.widget.PopupWindow r1 = r2.A03
            r1.dismiss()
            r1 = 1402516089(0x5398b279, float:1.31165861E12)
            goto L_0x0fa0
        L_0x0aed:
            r0 = 1837656566(0x6d8869f6, float:5.2772575E27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Iav r2 = (X.C57451Iav) r2
            r1 = 1
            r2.A02 = r1
            android.widget.PopupWindow r1 = r2.A03
            r1.dismiss()
            r1 = -508942828(0xffffffffe1aa2614, float:-3.923363E20)
            goto L_0x0fa0
        L_0x0b05:
            r0 = -320842187(0xffffffffece05635, float:-2.1696519E27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Iaw r2 = (X.C57452Iaw) r2
            r1 = 0
            r2.A01 = r1
            android.widget.PopupWindow r1 = r2.A05
            r1.dismiss()
            r1 = -1317910921(0xffffffffb1724677, float:-3.525569E-9)
            goto L_0x0fa0
        L_0x0b1d:
            r0 = 804050656(0x2fecd6e0, float:4.3080828E-10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.IOt r1 = (X.C57105IOt) r1
            X.0eM r1 = r1.A0C
            r1.getValue()
            r1 = 1958691557(0x74bf42e5, float:1.21226255E32)
            goto L_0x0fa0
        L_0x0b32:
            r0 = -227184162(0xfffffffff27571de, float:-4.861535E30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.IOt r1 = (X.C57105IOt) r1
            X.0eM r1 = r1.A0C
            r1.getValue()
            r1 = 1083787467(0x409948cb, float:4.790136)
            goto L_0x0fa0
        L_0x0b47:
            r0 = -1526799421(0xffffffffa4fee3c3, float:-1.10540784E-16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.IOu r1 = (X.C57106IOu) r1
            X.Jio r5 = X.C57106IOu.A00(r1)
            X.2Fk r1 = r5.A01
            java.lang.Object r2 = r1.A02()
            X.GmG r2 = (X.C53330GmG) r2
            if (r2 == 0) goto L_0x0b77
            boolean r1 = r2.A0A
            if (r1 != 0) goto L_0x0b77
            boolean r1 = r2.A0E
            if (r1 == 0) goto L_0x0b77
            X.6oS r4 = X.C318116oQ.A00(r5)
            r3 = 0
            r2 = 30
            X.MGv r1 = new X.MGv
            r1.<init>((java.lang.Object) r5, (X.AnonymousClass4D7) r3, (int) r2)
            X.AnonymousClass7TE.A1Z(r1, r4)
        L_0x0b77:
            r1 = -976582285(0xffffffffc5ca8973, float:-6481.181)
            goto L_0x0fa0
        L_0x0b7c:
            r0 = 364478060(0x15b97e6c, float:7.4920363E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.DbS.A1U(r1)
            r1 = -401110313(0xffffffffe8178ad7, float:-2.862554E24)
            goto L_0x0fa0
        L_0x0b8d:
            r0 = -2080400154(0xffffffff83ff9ce6, float:-1.5023575E-36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.37E r2 = X.AnonymousClass37D.A00
            java.lang.Object r5 = r1.A01
            X.K4a r5 = (X.C61358K4a) r5
            X.37D r4 = X.DbV.A0g(r5, r2)
            if (r4 == 0) goto L_0x0bb2
            r3 = r4
            X.37F r3 = (X.AnonymousClass37F) r3
            boolean r1 = r3.A0g
            if (r1 == 0) goto L_0x0bb7
            r2 = 5
            X.IZz r1 = new X.IZz
            r1.<init>(r5, r2)
            r3.A0H = r1
            r4.A0B()
        L_0x0bb2:
            r1 = 2134121738(0x7f341d0a, float:2.3941182E38)
            goto L_0x0fa0
        L_0x0bb7:
            X.C61358K4a.A01(r5)
            goto L_0x0bb2
        L_0x0bbb:
            r0 = -1108912634(0xffffffffbde75606, float:-0.112957045)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.GCd r3 = (X.C52031GCd) r3
            java.lang.String r2 = "learn_more_button"
            r1 = 0
            X.C52031GCd.A07(r1, r3, r2)
            android.app.Activity r2 = r3.A06
            com.instagram.common.session.UserSession r1 = r3.A07
            X.C270804hK.A01(r2, r1)
            r1 = -1703314410(0xffffffff9a797c16, float:-5.159223E-23)
            goto L_0x0fa0
        L_0x0bd8:
            r0 = -630514347(0xffffffffda6b1d55, float:-1.65447176E16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.GCd r1 = (X.C52031GCd) r1
            X.C52031GCd.A0B(r1)
            r1 = 654225801(0x26feb189, float:1.7672912E-15)
            goto L_0x0fa0
        L_0x0beb:
            r0 = -2045941869(0xffffffff860d6793, float:-2.6595247E-35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.GCd r1 = (X.C52031GCd) r1
            X.C52031GCd.A0E(r1)
            r1 = 2141232174(0x7fa09c2e, float:NaN)
            goto L_0x0fa0
        L_0x0bfe:
            r0 = 483820918(0x1cd68576, float:1.4195831E-21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.GCd r1 = (X.C52031GCd) r1
            X.C52031GCd.A0F(r1)
            r1 = -1989127567(0xffffffff89705271, float:-2.8927713E-33)
            goto L_0x0fa0
        L_0x0c11:
            r0 = 1803318109(0x6b7c735d, float:3.051941E26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.GCd r1 = (X.C52031GCd) r1
            X.C52031GCd.A0A(r1)
            r1 = 1518838270(0x5a87a1fe, float:1.90886171E16)
            goto L_0x0fa0
        L_0x0c24:
            r0 = -1043013603(0xffffffffc1d4e01d, float:-26.60943)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.GCd r1 = (X.C52031GCd) r1
            r1.A0J()
            r1 = 487187432(0x1d09e3e8, float:1.8249624E-21)
            goto L_0x0fa0
        L_0x0c37:
            r0 = -1567031135(0xffffffffa29900a1, float:-4.14714E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.GCd r2 = (X.C52031GCd) r2
            r1 = 0
            X.C52031GCd.A06(r1, r2)
            r1 = -1024513252(0xffffffffc2ef2b1c, float:-119.5842)
            goto L_0x0fa0
        L_0x0c4b:
            r0 = 1802035408(0x6b68e0d0, float:2.8153244E26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.GCd r2 = (X.C52031GCd) r2
            r1 = 0
            X.C52031GCd.A06(r1, r2)
            r1 = -1492603159(0xffffffffa708aee9, float:-1.896861E-15)
            goto L_0x0fa0
        L_0x0c5f:
            r0 = -1848548467(0xffffffff91d1638d, float:-3.3035739E-28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.GCd r1 = (X.C52031GCd) r1
            X.C52031GCd.A0E(r1)
            r1 = 1796774041(0x6b189899, float:1.8447735E26)
            goto L_0x0fa0
        L_0x0c72:
            r0 = 814906233(0x30927b79, float:1.0657991E-9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.GCd r5 = (X.C52031GCd) r5
            r1 = 529(0x211, float:7.41E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            r1 = 0
            X.C52031GCd.A07(r1, r5, r2)
            android.app.Activity r4 = r5.A06
            com.instagram.common.session.UserSession r3 = r5.A07
            X.2EG r2 = X.2EG.A0X
            r1 = 156(0x9c, float:2.19E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.SUL r2 = X.Dba.A0J(r4, r3, r2, r1)
            X.4DU r1 = r5.A08
            X.DbW.A1J(r1, r2)
            r1 = 973383599(0x3a04a7af, float:5.060387E-4)
            goto L_0x0fa0
        L_0x0ca1:
            r0 = -656683514(0xffffffffd8dbce06, float:-1.93342328E15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.GCd r1 = (X.C52031GCd) r1
            android.app.Activity r1 = r1.A06
            X.8ab r2 = X.DbS.A0X(r1)
            r1 = 2131957538(0x7f131722, float:1.9551663E38)
            r2.A09(r1)
            r1 = 2131957537(0x7f131721, float:1.955166E38)
            r2.A08(r1)
            X.I8W r1 = X.I8W.A00
            r2.A0E(r1)
            X.DbT.A1V(r2)
            r1 = 2055141347(0x7a7ef7e3, float:3.3096779E35)
            goto L_0x0fa0
        L_0x0ccb:
            r0 = 1429182706(0x552f98f2, float:1.20669644E13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.GCd r1 = (X.C52031GCd) r1
            X.C52031GCd.A0D(r1)
            r1 = -981211001(0xffffffffc583e887, float:-4221.066)
            goto L_0x0fa0
        L_0x0cde:
            r0 = 2023018628(0x7894d084, float:2.4146535E34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.GCd r1 = (X.C52031GCd) r1
            X.C52031GCd.A0G(r1)
            r1 = -134840770(0xfffffffff7f67e3e, float:-9.9989494E33)
            goto L_0x0fa0
        L_0x0cf1:
            r0 = 314384156(0x12bd1f1c, float:1.1935246E-27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.GCd r1 = (X.C52031GCd) r1
            X.C52031GCd.A0C(r1)
            r1 = 237835849(0xe2d1649, float:2.1334626E-30)
            goto L_0x0fa0
        L_0x0d04:
            r0 = 1816517436(0x6c45db3c, float:9.567748E26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.GCd r1 = (X.C52031GCd) r1
            android.app.Activity r6 = r1.A06
            com.instagram.common.session.UserSession r5 = r1.A07
            X.2EG r4 = X.2EG.A46
            r3 = 9
            r2 = 42
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.String r1 = X.AnonymousClass9NJ.A00(r3, r2, r1)
            X.Dbb.A0k(r6, r5, r4, r1)
            r1 = 763089806(0x2d7bd38e, float:1.4314673E-11)
            goto L_0x0fa0
        L_0x0d27:
            r0 = 211897053(0xca14add, float:2.4851034E-31)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.GCd r1 = (X.C52031GCd) r1
            X.C52031GCd.A0D(r1)
            r1 = -1936590084(0xffffffff8c91fafc, float:-2.2491843E-31)
            goto L_0x0fa0
        L_0x0d3a:
            r0 = -1836698057(0xffffffff92863637, float:-8.469954E-28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.GCd r1 = (X.C52031GCd) r1
            X.C52031GCd.A0B(r1)
            r1 = 1406048863(0x53ce9a5f, float:1.77470636E12)
            goto L_0x0fa0
        L_0x0d4d:
            r0 = 1857618172(0x6eb900fc, float:2.8627958E28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.GCd r1 = (X.C52031GCd) r1
            X.C52031GCd.A0G(r1)
            r1 = 1187375955(0x46c5eb53, float:25333.662)
            goto L_0x0fa0
        L_0x0d60:
            r0 = -48734713(0xfffffffffd185e07, float:-1.265818E37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.GCd r1 = (X.C52031GCd) r1
            X.C52031GCd.A0A(r1)
            r1 = 419279384(0x18fdb218, float:6.5578796E-24)
            goto L_0x0fa0
        L_0x0d73:
            r0 = 308340404(0x1260e6b4, float:7.09663E-28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.GCd r1 = (X.C52031GCd) r1
            X.C52031GCd.A0F(r1)
            r1 = 107973239(0x66f8a77, float:4.5052632E-35)
            goto L_0x0fa0
        L_0x0d86:
            r0 = 1202509011(0x47acd4d3, float:88489.65)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.GCd r1 = (X.C52031GCd) r1
            r1.A0J()
            r1 = -1004360067(0xffffffffc422ae7d, float:-650.7264)
            goto L_0x0fa0
        L_0x0d99:
            r0 = 1422296708(0x54c68684, float:6.8212826E12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.GCd r3 = (X.C52031GCd) r3
            java.lang.String r2 = "learn_more_button"
            r1 = 0
            X.C52031GCd.A07(r1, r3, r2)
            android.app.Activity r2 = r3.A06
            com.instagram.common.session.UserSession r1 = r3.A07
            X.C270804hK.A01(r2, r1)
            r1 = -22752835(0xfffffffffea4d1bd, float:-1.0954121E38)
            goto L_0x0fa0
        L_0x0db6:
            r0 = 1230478829(0x49579ded, float:883166.8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.GCd r5 = (X.C52031GCd) r5
            r1 = 529(0x211, float:7.41E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            r1 = 0
            X.C52031GCd.A07(r1, r5, r2)
            android.app.Activity r4 = r5.A06
            com.instagram.common.session.UserSession r3 = r5.A07
            X.2EG r2 = X.2EG.A0X
            r1 = 156(0x9c, float:2.19E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.SUL r2 = X.Dba.A0J(r4, r3, r2, r1)
            X.4DU r1 = r5.A08
            X.DbW.A1J(r1, r2)
            r1 = -826685984(0xffffffffceb9c5e0, float:-1.55837645E9)
            goto L_0x0fa0
        L_0x0de5:
            r0 = 1495764208(0x59278cf0, float:2.94758022E15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.GCd r1 = (X.C52031GCd) r1
            android.app.Activity r1 = r1.A06
            X.8ab r2 = X.DbS.A0X(r1)
            r1 = 2131957538(0x7f131722, float:1.9551663E38)
            r2.A09(r1)
            r1 = 2131957537(0x7f131721, float:1.955166E38)
            r2.A08(r1)
            X.I8W r1 = X.I8W.A00
            r2.A0E(r1)
            X.DbT.A1V(r2)
            r1 = 40717659(0x26d4d5b, float:1.743421E-37)
            goto L_0x0fa0
        L_0x0e0f:
            r0 = -1698727183(0xffffffff9abf7af1, float:-7.919437E-23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.GCd r1 = (X.C52031GCd) r1
            X.C52031GCd.A0C(r1)
            r1 = -334423369(0xffffffffec111ab7, float:-7.016816E26)
            goto L_0x0fa0
        L_0x0e22:
            r0 = -569589917(0xffffffffde0cbf63, float:-2.53548343E18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.IOY r1 = (X.IOY) r1
            X.HlG r1 = r1.A01
            X.0sa r1 = r1.A00
            r1.invoke()
            r1 = 1248725688(0x4a6e0ab8, float:3900078.0)
            goto L_0x0fa0
        L_0x0e39:
            r0 = 1407254703(0x53e100af, float:1.93275822E12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.H0z r2 = (X.C54155H0z) r2
            X.C54155H0z.A01(r2)
            X.0eM r1 = r2.A0A
            X.INA r1 = X.C51966G9m.A0z(r1)
            X.HOd r3 = r2.A00
            X.0wc r2 = X.INA.A01(r1, r3)
            java.lang.String r1 = "ig_school_reliability_settings_icon_tap"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r2.isSampled()
            if (r1 == 0) goto L_0x0e67
            X.C51965G9l.A1B(r3, r2)
            X.HOp r1 = X.C54684HOp.DIRECTORY
            X.C51974G9v.A0j(r1, r2)
        L_0x0e67:
            r1 = 1527861286(0x5b115026, float:4.0901996E16)
            goto L_0x0fa0
        L_0x0e6c:
            r0 = -1658586061(0xffffffff9d23fc33, float:-2.1703254E-21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.H0z r2 = (X.C54155H0z) r2
            X.C54155H0z.A02(r2)
            X.0eM r1 = r2.A0A
            X.INA r1 = X.C51966G9m.A0z(r1)
            X.HOd r3 = r2.A00
            X.0wc r2 = X.INA.A01(r1, r3)
            java.lang.String r1 = "ig_school_reliability_invite_plane_tap"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r2.isSampled()
            if (r1 == 0) goto L_0x0e9a
            X.C51965G9l.A1B(r3, r2)
            X.HOp r1 = X.C54684HOp.DIRECTORY
            X.C51974G9v.A0j(r1, r2)
        L_0x0e9a:
            r1 = 1026697190(0x3d3227e6, float:0.04349508)
            goto L_0x0fa0
        L_0x0e9f:
            r0 = -567010640(0xffffffffde341ab0, float:-3.2444697E18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r1.A01
            X.H0z r8 = (X.C54155H0z) r8
            X.0r1 r7 = new X.0r1
            r7.<init>()
            X.0eM r1 = r8.A0B
            X.7Pr r3 = X.DbX.A0f(r1)
            r2 = 2
            X.IZe r1 = new X.IZe
            r1.<init>(r2, r7, r8)
            r3.A0U = r1
            X.7Pu r6 = r3.A00()
            java.lang.String r5 = r8.A01
            X.HmZ r4 = new X.HmZ
            r4.<init>(r6, r8, r7)
            X.0eM r1 = r8.A06
            boolean r3 = X.AnonymousClass7TF.A1Z(r1)
            X.HOd r2 = r8.A00
            r1 = 0
            X.AnonymousClass7TF.A1C(r5, r1, r2)
            X.Gzl r2 = new X.Gzl
            r2.<init>()
            r2.A01 = r5
            r2.A00 = r4
            r2.A02 = r3
            androidx.fragment.app.FragmentActivity r1 = r8.requireActivity()
            r6.A02(r1, r2)
            r1 = -1227265816(0xffffffffb6d968e8, float:-6.4793167E-6)
            goto L_0x0fa0
        L_0x0eeb:
            r0 = 345049355(0x1491090b, float:1.4644825E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.H0p r4 = (X.C54145H0p) r4
            X.0eM r1 = r4.A01
            java.lang.Object r3 = r1.getValue()
            X.Ggc r3 = (X.C52985Ggc) r3
            r1 = 41
            X.Imz r2 = new X.Imz
            r2.<init>(r4, r1)
            com.instagram.schools.management.data.SchoolSettingsRepository r4 = r3.A00
            r15 = 0
            X.05G r1 = r4.A03
            java.lang.Object r1 = r1.getValue()
            X.JwL r1 = (X.C61083JwL) r1
            java.lang.Object r1 = r1.A01
            X.Gm0 r1 = (X.C53314Gm0) r1
            if (r1 == 0) goto L_0x0f89
            X.62P r1 = r1.A07
            if (r1 == 0) goto L_0x0f89
            java.util.Iterator r5 = r1.iterator()
        L_0x0f1e:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0f8d
            java.lang.Object r3 = r5.next()
            r1 = r3
            com.instagram.schools.management.data.BadgeVisibilitySettingItem r1 = (com.instagram.schools.management.data.BadgeVisibilitySettingItem) r1
            boolean r1 = r1.A02
            if (r1 == 0) goto L_0x0f1e
        L_0x0f2f:
            com.instagram.schools.management.data.BadgeVisibilitySettingItem r3 = (com.instagram.schools.management.data.BadgeVisibilitySettingItem) r3
            if (r3 == 0) goto L_0x0f89
            X.2IS r7 = X.C41845B3m.A04()
            X.2IS r6 = X.C41845B3m.A04()
            X.0K0 r5 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r14 = 0
            X.Uya r1 = r3.A00
            java.lang.String r3 = r1.name()
            r1 = 1129(0x469, float:1.582E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0Df r3 = X.C41845B3m.A03(r5, r3, r1)
            java.lang.String r1 = "input"
            X.1vR r8 = X.C41847B3o.A04(r3, r7, r1)
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<com.instagram.schools.management.data.UpdateSchoolBadgeVisibilityResponseImpl> r12 = com.instagram.schools.management.data.UpdateSchoolBadgeVisibilityResponseImpl.class
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            java.lang.String r9 = "UpdateSchoolBadgeVisibility"
            r13 = 1
            java.lang.String r17 = "xdt_update_school_badge_visibility"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.instagram.common.session.UserSession r1 = r4.A00
            X.1vn r5 = X.1vm.A01(r1)
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            com.instagram.schools.management.data.SchoolSettingsRepository.A01(r4, r1)
            r1 = 10
            X.DFQ r3 = new X.DFQ
            r3.<init>(r1, r4, r2)
            r2 = 6
            X.DEx r1 = new X.DEx
            r1.<init>(r4, r2)
            r5.ATL(r1, r3, r7)
        L_0x0f89:
            r1 = 873150193(0x340b36f1, float:1.2965371E-7)
            goto L_0x0fa0
        L_0x0f8d:
            r3 = 0
            goto L_0x0f2f
        L_0x0f8f:
            r0 = -1233677908(0xffffffffb67791ac, float:-3.689066E-6)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.JQf r1 = (X.C59611JQf) r1
            r1.DSR()
            r1 = -909046057(0xffffffffc9d10ed7, float:-1712602.9)
        L_0x0fa0:
            X.AnonymousClass0fD.A0C(r1, r0)
        L_0x0fa3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ID1.onClick(android.view.View):void");
    }

    public ID1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
