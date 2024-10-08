package X;

import android.view.View;

/* renamed from: X.FOz  reason: case insensitive filesystem */
public final class C50109FOz implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public C50109FOz(C48016ERd eRd, int i) {
        this.A00 = i;
        this.A01 = eRd;
    }

    public static void A00(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new C50109FOz(obj, i), view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0ba0, code lost:
        r0 = "logger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0bb8, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0bbb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0bbc, code lost:
        r0 = "activity";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0bbe, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0bc5, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r24) {
        /*
            r23 = this;
            r3 = r23
            int r0 = r3.A00
            r4 = r24
            switch(r0) {
                case 0: goto L_0x0ba3;
                case 1: goto L_0x0af2;
                case 2: goto L_0x0ac0;
                case 3: goto L_0x0a30;
                case 4: goto L_0x09d7;
                case 5: goto L_0x096f;
                case 6: goto L_0x0955;
                case 7: goto L_0x08fc;
                case 8: goto L_0x08c3;
                case 9: goto L_0x08b0;
                case 10: goto L_0x088d;
                case 11: goto L_0x0809;
                case 12: goto L_0x07e6;
                case 13: goto L_0x07ab;
                case 14: goto L_0x077d;
                case 15: goto L_0x0745;
                case 16: goto L_0x0717;
                case 17: goto L_0x06f5;
                case 18: goto L_0x06b7;
                case 19: goto L_0x0665;
                case 20: goto L_0x0608;
                case 21: goto L_0x05b9;
                case 22: goto L_0x0576;
                case 23: goto L_0x0556;
                case 24: goto L_0x0545;
                case 25: goto L_0x000a;
                case 26: goto L_0x0525;
                case 27: goto L_0x04e2;
                case 28: goto L_0x0498;
                case 29: goto L_0x0480;
                case 30: goto L_0x046a;
                case 31: goto L_0x043d;
                case 32: goto L_0x040a;
                case 33: goto L_0x03f7;
                case 34: goto L_0x03c7;
                case 35: goto L_0x0270;
                case 36: goto L_0x021b;
                case 37: goto L_0x013e;
                case 38: goto L_0x0077;
                default: goto L_0x0009;
            }
        L_0x0009:
            return
        L_0x000a:
            java.lang.Object r4 = r3.A01
            instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment r4 = (instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment) r4
            com.instagram.ar.features.effectspage.models.EffectsPageModel r0 = r4.A03
            if (r0 == 0) goto L_0x0071
            java.lang.String r5 = r0.A0D
            if (r5 == 0) goto L_0x0071
        L_0x0016:
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution r6 = r0.A03
        L_0x0018:
            android.content.Context r1 = r4.requireContext()
            com.instagram.common.session.UserSession r0 = r4.A07
            X.Dg1 r3 = new X.Dg1
            r3.<init>(r1, r0)
            r2 = 2131953130(0x7f1305ea, float:1.9542722E38)
            r1 = 68
            X.ID1 r0 = new X.ID1
            r0.<init>((instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment) r4, (int) r1)
            r3.A04(r0, r2)
            if (r6 == 0) goto L_0x003f
            r2 = 2131953129(0x7f1305e9, float:1.954272E38)
            r1 = 43
            X.FP7 r0 = new X.FP7
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r6)
            r3.A04(r0, r2)
        L_0x003f:
            r2 = 2131953131(0x7f1305eb, float:1.9542724E38)
            r1 = 22
            X.FOr r0 = new X.FOr
            r0.<init>((java.lang.String) r5, (java.lang.Object) r4, (int) r1)
            r3.A04(r0, r2)
            com.instagram.common.session.UserSession r0 = r4.A07
            boolean r0 = X.1CI.A00(r0)
            if (r0 == 0) goto L_0x0065
            r0 = 2131953128(0x7f1305e8, float:1.9542718E38)
            java.lang.String r2 = X.DbV.A0z(r4, r5, r0)
            r1 = 23
            X.FOr r0 = new X.FOr
            r0.<init>((java.lang.String) r5, (java.lang.Object) r4, (int) r1)
            r3.A0C(r2, r0)
        L_0x0065:
            java.util.List r0 = r3.A09
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0009
            X.C49945FFy.A00(r4, r3)
            return
        L_0x0071:
            java.lang.String r5 = ""
            if (r0 != 0) goto L_0x0016
            r6 = 0
            goto L_0x0018
        L_0x0077:
            r0 = -737797762(0xffffffffd406197e, float:-2.30381322E12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r3.A01
            X.E5v r7 = (X.C47512E5v) r7
            X.Vuw r3 = r7.A02
            if (r3 == 0) goto L_0x0139
            X.0eM r9 = r7.A03
            com.instagram.common.session.UserSession r12 = X.AnonymousClass7TE.A0l(r9)
            X.3uh r1 = r7.A01
            r11 = 0
            if (r1 == 0) goto L_0x0102
            java.lang.String r10 = r1.A0j
        L_0x0093:
            com.instagram.api.schemas.SMBSupportStickerDict r1 = r3.A00
            java.lang.String r8 = r1.A0A
            com.instagram.user.model.User r1 = r3.A00()
            if (r1 == 0) goto L_0x00a1
            java.lang.String r11 = X.AnonymousClass3ZA.A00(r1)
        L_0x00a1:
            java.lang.Integer r13 = r3.A01()
            com.instagram.api.schemas.SMBSupportStickerDict r1 = r3.A00
            java.lang.String r6 = r1.A09
            java.lang.String r5 = r1.A06
            X.0wc r2 = X.DbX.A0O(r7, r12)
            java.lang.String r1 = "instagram_smb_partner_flow_consumer"
            X.0Aj r4 = X.C49959FGr.A02(r2, r12, r1)
            java.lang.String r2 = "story_bottom_sheet_reshare"
            java.lang.String r1 = "step"
            X.Dba.A1B(r4, r1, r2)
            java.lang.String r2 = X.AnonymousClass7TG.A0j()
            java.lang.String r1 = X.C46346Dcp.A00()
            r4.AAJ(r1, r2)
            r2 = 1
            if (r11 == 0) goto L_0x0100
            java.lang.String r1 = r12.A06
            boolean r1 = X.2R8.A07(r1, r11)
            if (r1 != r2) goto L_0x0100
        L_0x00d2:
            X.C49959FGr.A04(r4, r11, r2)
            X.Dba.A1A(r4, r6, r5)
            if (r13 == 0) goto L_0x00fe
            java.lang.String r1 = X.VG1.A00(r13)
        L_0x00de:
            X.Dbc.A0d(r4, r1, r8, r10)
            X.7Pu r1 = r7.A00
            X.DbW.A1K(r1)
            X.0lg r8 = X.DbT.A0X(r9)
            X.28D r2 = X.28D.A4S
            androidx.fragment.app.FragmentActivity r7 = r7.requireActivity()
            android.os.Bundle r6 = X.AnonymousClass7TE.A0a()
            r1 = 2472(0x9a8, float:3.464E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r6.putSerializable(r1, r2)
            goto L_0x0104
        L_0x00fe:
            r1 = 0
            goto L_0x00de
        L_0x0100:
            r2 = 0
            goto L_0x00d2
        L_0x0102:
            r10 = r11
            goto L_0x0093
        L_0x0104:
            r1 = 2473(0x9a9, float:3.465E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)     // Catch:{ IOException -> 0x0126 }
            com.instagram.api.schemas.SMBSupportStickerDict r5 = r3.A00     // Catch:{ IOException -> 0x0126 }
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ IOException -> 0x0126 }
            r4.<init>()     // Catch:{ IOException -> 0x0126 }
            X.15p r2 = X.AnonymousClass15o.A00     // Catch:{ IOException -> 0x0126 }
            X.17W r3 = r2.A0A(r4)     // Catch:{ IOException -> 0x0126 }
            r2 = 1
            X.C45621CzX.A00(r3, r5, r2)     // Catch:{ IOException -> 0x0126 }
            r3.close()     // Catch:{ IOException -> 0x0126 }
            java.lang.String r2 = X.DbT.A10(r4)     // Catch:{ IOException -> 0x0126 }
            r6.putString(r1, r2)     // Catch:{ IOException -> 0x0126 }
            goto L_0x012e
        L_0x0126:
            java.lang.String r2 = "ReelSMBSupportShareHelper"
            java.lang.String r1 = "Could not json serialize model SMBSupportStickerModel."
            X.0wb.A03(r2, r1)
            goto L_0x0139
        L_0x012e:
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r2 = com.instagram.modal.TransparentModalActivity.class
            r1 = 926(0x39e, float:1.298E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            X.DbU.A0x(r7, r6, r8, r2, r1)
        L_0x0139:
            r1 = -1058282515(0xffffffffc0ebe3ed, float:-7.371573)
            goto L_0x0bb8
        L_0x013e:
            r0 = 1718822208(0x66732540, float:2.8705555E23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r15 = r3.A01
            X.E5v r15 = (X.C47512E5v) r15
            X.Vuw r9 = r15.A02
            if (r9 == 0) goto L_0x01ea
            X.0eM r8 = r15.A03
            com.instagram.common.session.UserSession r13 = X.AnonymousClass7TE.A0l(r8)
            X.3uh r1 = r15.A01
            r7 = 0
            if (r1 == 0) goto L_0x0218
            java.lang.String r11 = r1.A0j
        L_0x015a:
            com.instagram.api.schemas.SMBSupportStickerDict r1 = r9.A00
            java.lang.String r6 = r1.A0A
            com.instagram.user.model.User r1 = r9.A00()
            if (r1 == 0) goto L_0x0215
            java.lang.String r12 = X.AnonymousClass3ZA.A00(r1)
        L_0x0168:
            java.lang.Integer r14 = r9.A01()
            com.instagram.api.schemas.SMBSupportStickerDict r1 = r9.A00
            java.lang.String r5 = r1.A09
            java.lang.String r4 = r1.A06
            r3 = 0
            X.0wc r2 = X.DbT.A0Q(r15, r13, r3)
            java.lang.String r1 = "instagram_smb_partner_flow_consumer"
            X.0Aj r10 = X.C49959FGr.A02(r2, r13, r1)
            java.lang.String r2 = "story_bottom_sheet_cta"
            java.lang.String r1 = "step"
            X.Dba.A1B(r10, r1, r2)
            java.lang.String r2 = X.AnonymousClass7TG.A0j()
            java.lang.String r1 = X.C46346Dcp.A00()
            r10.AAJ(r1, r2)
            r2 = 1
            if (r12 == 0) goto L_0x0213
            java.lang.String r1 = r13.A06
            boolean r1 = X.2R8.A07(r1, r12)
            if (r1 != r2) goto L_0x0213
        L_0x019a:
            X.C49959FGr.A04(r10, r12, r2)
            X.Dba.A1A(r10, r5, r4)
            if (r14 == 0) goto L_0x0211
            java.lang.String r1 = X.VG1.A00(r14)
        L_0x01a6:
            X.Dbc.A0d(r10, r1, r6, r11)
            if (r4 == 0) goto L_0x01ea
            int r1 = r4.length()
            if (r1 == 0) goto L_0x01ea
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            java.lang.Integer r1 = r9.A01()
            if (r2 != r1) goto L_0x01f1
            androidx.fragment.app.FragmentActivity r2 = r15.requireActivity()
            com.instagram.api.schemas.SMBPartnerType r1 = com.instagram.api.schemas.SMBPartnerType.FOOD_DELIVERY
            boolean r1 = X.C324066yY.A04(r2, r7, r1, r4)
            if (r1 == 0) goto L_0x01f1
            com.instagram.common.session.UserSession r16 = X.AnonymousClass7TE.A0l(r8)
            X.3uh r1 = r15.A01
            if (r1 == 0) goto L_0x01ef
            java.lang.String r2 = r1.A0j
        L_0x01cf:
            com.instagram.user.model.User r1 = r9.A00()
            if (r1 == 0) goto L_0x01d9
            java.lang.String r7 = X.AnonymousClass3ZA.A00(r1)
        L_0x01d9:
            java.lang.Integer r17 = r9.A01()
            r21 = r5
            r22 = r4
            r18 = r2
            r19 = r6
            r20 = r7
            X.C49959FGr.A07(r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x01ea:
            r1 = -785416604(0xffffffffd12f7e64, float:-4.7108735E10)
            goto L_0x0bb8
        L_0x01ef:
            r2 = r7
            goto L_0x01cf
        L_0x01f1:
            androidx.fragment.app.FragmentActivity r10 = r15.requireActivity()
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r8)
            X.2EG r12 = X.2EG.A3V
            X.SUL r9 = new X.SUL
            r13 = r4
            r14 = r3
            r9.<init>(r10, r11, r12, r13, r14)
            java.lang.String r1 = X.DbU.A0u(r8)
            r9.A0E(r1)
            java.lang.String r1 = "smb_support_sticker_bottom_sheet"
            r9.A0S = r1
            r9.A0A()
            goto L_0x01ea
        L_0x0211:
            r1 = 0
            goto L_0x01a6
        L_0x0213:
            r2 = 0
            goto L_0x019a
        L_0x0215:
            r12 = r7
            goto L_0x0168
        L_0x0218:
            r11 = r7
            goto L_0x015a
        L_0x021b:
            r0 = -1279122008(0xffffffffb3c225a8, float:-9.0406786E-8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r3.A01
            X.E5v r8 = (X.C47512E5v) r8
            X.Vuw r1 = r8.A02
            if (r1 == 0) goto L_0x026b
            com.instagram.user.model.User r1 = r1.A00()
            if (r1 == 0) goto L_0x026b
            java.lang.String r9 = X.AnonymousClass3ZA.A00(r1)
            if (r9 == 0) goto L_0x026b
            X.0eM r1 = r8.A03
            X.0lg r7 = X.DbT.A0X(r1)
            java.lang.Class<com.instagram.modal.ModalActivity> r6 = com.instagram.modal.ModalActivity.class
            X.1a1 r5 = X.C46447Df9.A02()
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r2 = "smb_support_sticker_bottom_sheet"
            r1 = 1824(0x720, float:2.556E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            com.instagram.profile.intf.UserDetailLaunchConfig r1 = X.C46474Dfc.A01(r3, r9, r1, r2)
            android.os.Bundle r3 = r5.A01(r4, r1)
            androidx.fragment.app.FragmentActivity r2 = r8.getActivity()
            java.lang.String r1 = "profile"
            X.6W8 r2 = X.DbS.A0b(r2, r3, r7, r6, r1)
            android.content.Context r1 = r8.getContext()
            r2.A0C(r1)
        L_0x026b:
            r1 = 140529666(0x8605002, float:6.7501597E-34)
            goto L_0x0bb8
        L_0x0270:
            r0 = 1402521924(0x5398c944, float:1.31242341E12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            X.UYv r2 = (X.UYv) r2
            android.content.Context r5 = r2.requireContext()
            X.0eM r1 = r2.A07
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r8 = r2.A00
            if (r8 != 0) goto L_0x028b
            java.lang.String r8 = ""
        L_0x028b:
            java.lang.String r7 = r2.A01
            if (r7 != 0) goto L_0x0293
            java.lang.String r0 = "userId"
            goto L_0x0bbe
        L_0x0293:
            java.lang.String r15 = "ReelDashboardFBViewerMessageBottomsheetFragment"
            r2 = 1
            X.AnonymousClass7TF.A1C(r4, r2, r8)
            java.lang.String r1 = X.C9936Rjp.A00
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r1, r7)
            android.net.Uri$Builder r1 = X.DbW.A07(r1)
            android.net.Uri r14 = r1.build()
            X.0qQ.A07(r14)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "should_switch_account"
            java.util.Map r13 = X.AnonymousClass7TF.A0w(r1, r2)
            r1 = 15
            X.Phb r2 = new X.Phb
            r2.<init>(r4, r1)
            java.lang.Class<X.FBL> r1 = X.FBL.class
            java.lang.Object r2 = r4.A01(r1, r2)
            X.FBL r2 = (X.FBL) r2
            java.lang.String r12 = "required_logged_user_id"
            r11 = 0
            X.0sm r10 = X.0Yt.A0E()
            X.0sm r9 = X.0Yt.A0E()
            r1 = 9
            X.0qQ.A0B(r10, r1)
            r1 = 10
            X.0qQ.A0B(r9, r1)
            X.1wW r6 = r2.A01
            java.lang.String r2 = "ig_android_linking_cache_fx_internal"
            java.lang.String r3 = "FxDeeplinkUtil"
            com.facebook.common.callercontext.CallerContext r1 = com.facebook.common.callercontext.CallerContext.A01(r3)
            java.lang.String r2 = r6.A01(r1, r2, r8)
            if (r2 != 0) goto L_0x0306
            java.lang.String r2 = "https://www.messenger.com/"
            java.lang.String r1 = "t/%s"
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r1, r7)
            java.lang.String r2 = X.002.A0R(r2, r1)
            X.2EG r1 = X.2EG.A1l
            X.SUL r2 = X.Dba.A0J(r5, r4, r1, r2)
            java.lang.String r1 = "MessengerAppDeeplinkingCreator"
            r2.A0S = r1
            r2.A0A()
        L_0x0301:
            r1 = 1777316232(0x69efb188, float:3.6221455E25)
            goto L_0x0bb8
        L_0x0306:
            java.lang.String r1 = r14.toString()
            android.net.Uri$Builder r8 = X.DbW.A07(r1)
            r8.appendQueryParameter(r12, r2)
            java.util.Iterator r6 = X.AnonymousClass7TF.A0u(r13)
        L_0x0315:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x032b
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r6)
            java.lang.String r2 = X.DbT.A13(r1)
            java.lang.String r1 = X.DbS.A0s(r1)
            r8.appendQueryParameter(r2, r1)
            goto L_0x0315
        L_0x032b:
            java.lang.String r13 = ""
            java.lang.String r1 = X.0oI.A02
            java.lang.String r6 = "com.facebook.orca"
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            r1 = 128(0x80, float:1.794E-43)
            r2.getPackageInfo(r6, r1)     // Catch:{ NameNotFoundException -> 0x033b }
            r13 = r6
        L_0x033b:
            int r1 = r13.length()
            if (r1 <= 0) goto L_0x03c2
            android.net.Uri r1 = r8.build()
            java.lang.String r1 = r1.toString()
            android.content.Intent r8 = X.DbX.A09(r1)
            java.util.Set r1 = r10.entrySet()
            java.util.Iterator r6 = r1.iterator()
        L_0x0355:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x036f
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r6)
            java.lang.String r2 = X.DbT.A13(r1)
            java.lang.Object r1 = r1.getValue()
            boolean r1 = X.AnonymousClass7TE.A1a(r1)
            r8.putExtra(r2, r1)
            goto L_0x0355
        L_0x036f:
            java.util.Set r1 = r9.entrySet()
            java.util.Iterator r6 = r1.iterator()
        L_0x0377:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x038d
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r6)
            java.lang.String r2 = X.DbT.A13(r1)
            java.lang.String r1 = X.DbS.A0s(r1)
            r8.putExtra(r2, r1)
            goto L_0x0377
        L_0x038d:
            r8.setPackage(r13)
            boolean r1 = X.0kR.A0A(r5, r8)
            if (r1 != 0) goto L_0x0301
            java.lang.String r2 = "https://www.messenger.com/"
            java.lang.String r1 = "t/%s"
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r1, r7)
            java.lang.String r2 = X.002.A0R(r2, r1)
            X.2EG r1 = X.2EG.A1l
            X.SUL r2 = X.Dba.A0J(r5, r4, r1, r2)
            java.lang.String r1 = "MessengerAppDeeplinkingCreator"
            r2.A0S = r1
            r2.A0A()
            java.lang.String r12 = "Launching "
            java.lang.String r14 = " failed for "
            java.lang.String r16 = " : "
            r18 = 46
            r17 = r15
            java.lang.String r1 = X.002.A14(r12, r13, r14, r15, r16, r17, r18)
            X.0KC.A0C(r3, r1)
            goto L_0x0301
        L_0x03c2:
            X.0oI.A07(r5, r6, r11)
            goto L_0x0301
        L_0x03c7:
            r0 = -998474756(0xffffffffc47c7bfc, float:-1009.93726)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E5b r1 = (X.C47496E5b) r1
            java.lang.String r1 = r1.A00
            if (r1 == 0) goto L_0x03f2
            X.14B r2 = X.DbT.A0e()
            android.content.Context r4 = X.AnonymousClass7TE.A0S(r4)
            android.net.Uri r1 = X.DbT.A09(r1)
            android.content.Intent r3 = r2.A04(r4, r1)
            r2 = 1
            r1 = 3
            java.lang.String r1 = X.C66579MXk.A00(r1)
            r3.putExtra(r1, r2)
            X.0kR.A0B(r4, r3)
        L_0x03f2:
            r1 = -1031260726(0xffffffffc28835ca, float:-68.10506)
            goto L_0x0bb8
        L_0x03f7:
            r0 = -1734568532(0xffffffff989c95ac, float:-4.0476185E-24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E5c r1 = (X.C47497E5c) r1
            X.C47497E5c.A02(r1)
            r1 = -1414208471(0xffffffffabb4e429, float:-1.2853096E-12)
            goto L_0x0bb8
        L_0x040a:
            r0 = 1494661600(0x5916b9e0, float:2.65160114E15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r3.A01
            X.E5Z r6 = (X.E5Z) r6
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            X.28D r2 = X.28D.A4q
            java.lang.String r1 = "camera_entry_point"
            r5.putSerializable(r1, r2)
            X.0eM r1 = r6.A00
            X.0lg r4 = X.DbT.A0X(r1)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r3 = com.instagram.modal.TransparentModalActivity.class
            androidx.fragment.app.FragmentActivity r2 = r6.getActivity()
            java.lang.String r1 = "attribution_quick_camera_fragment"
            X.6W8 r1 = X.AnonymousClass6W8.A02(r2, r5, r4, r3, r1)
            X.Dbc.A0y(r1)
            X.DbT.A1M(r6, r1)
            r1 = 239806564(0xe4b2864, float:2.504113E-30)
            goto L_0x0bb8
        L_0x043d:
            r0 = -1972986089(0xffffffff8a669f17, float:-1.1104019E-32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E0r r1 = (X.C47399E0r) r1
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            X.0eM r1 = r1.A00
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            X.2EG r5 = X.2EG.A46
            r7 = 0
            r2 = 42
            r1 = 27
            java.lang.String r6 = X.Dbn.A00(r7, r2, r1)
            X.SUL r2 = new X.SUL
            r2.<init>(r3, r4, r5, r6, r7)
            r2.A0A()
            r1 = -394319563(0xffffffffe87f2935, float:-4.8198544E24)
            goto L_0x0bb8
        L_0x046a:
            r0 = -2120948943(0xffffffff8194e331, float:-5.469262E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.Dba.A11(r1)
            X.DbZ.A15(r1)
            r1 = 1767567108(0x695aef04, float:1.6542159E25)
            goto L_0x0bb8
        L_0x0480:
            r0 = -36136773(0xfffffffffdd898bb, float:-3.5988284E37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.EGB r1 = (X.EGB) r1
            X.6sD r1 = r1.A00
            X.0qQ.A0A(r4)
            r1.D3f(r4)
            r1 = -620856994(0xffffffffdafe795e, float:-3.58140444E16)
            goto L_0x0bb8
        L_0x0498:
            r0 = -917599088(0xffffffffc94e8c90, float:-846025.0)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.ERq r5 = (X.C48027ERq) r5
            android.content.Context r1 = r5.requireContext()
            X.0eM r4 = r5.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            boolean r0 = X.C267044ar.A01(r1, r0)
            r3 = 0
            if (r0 == 0) goto L_0x04db
            X.94I r2 = X.AnonymousClass94I.A01
            if (r2 != 0) goto L_0x04bf
            X.94I r2 = new X.94I
            r2.<init>()
            X.AnonymousClass94I.A01 = r2
        L_0x04bf:
            android.content.Context r1 = r5.requireContext()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            r2.A00(r1, r0)
            android.content.Context r2 = r5.getContext()
            java.lang.String r1 = "CCU has been initialized. Please put your app in the background and allow time for CCU to complete."
        L_0x04d0:
            r0 = 1
            X.C59689JTv.A03(r2, r1, r3, r0)
            r0 = -1809174489(0xffffffff942a3027, float:-8.592303E-27)
            X.AnonymousClass0fD.A0C(r0, r6)
            return
        L_0x04db:
            android.content.Context r2 = r5.getContext()
            java.lang.String r1 = "You need to turn on Contact Importing in order to test CCU"
            goto L_0x04d0
        L_0x04e2:
            r0 = 1279568732(0x4c44ab5c, float:5.1555696E7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r3.A01
            X.ERq r7 = (X.C48027ERq) r7
            X.0eM r6 = r7.A01
            X.1Av r1 = X.DbX.A0h(r6)
            r4 = 0
            X.0xY r2 = X.AnonymousClass7TE.A0p(r1)
            r1 = 238(0xee, float:3.34E-43)
            java.lang.String r1 = X.Pxd.A00(r1)
            r2.E5c(r1, r4)
            r2.apply()
            android.content.Context r3 = r7.requireContext()
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r6)
            X.VkM r1 = new X.VkM
            r1.<init>(r3, r2)
            r1.A02(r4)
            android.content.Context r4 = r7.getContext()
            java.lang.String r3 = "CCU Timestamps have been reset"
            r2 = 0
            r1 = 1
            X.C59689JTv.A03(r4, r3, r2, r1)
            r1 = 1128068530(0x433cf5b2, float:188.95975)
            goto L_0x0bb8
        L_0x0525:
            r0 = -582621932(0xffffffffdd45e514, float:-8.9123911E17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r3.A01
            X.Eyg r3 = (X.C49571Eyg) r3
            X.0eM r1 = r3.A01
            android.view.View r2 = X.AnonymousClass7TE.A0c(r1)
            r1 = 8
            r2.setVisibility(r1)
            X.0sa r1 = r3.A02
            r1.invoke()
            r1 = 1852277997(0x6e6784ed, float:1.7912934E28)
            goto L_0x0bb8
        L_0x0545:
            r0 = -428028289(0xffffffffe67cce7f, float:-2.9846138E23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.DbS.A1V(r1)
            r1 = 479678469(0x1c975005, float:1.0013026E-21)
            goto L_0x0bb8
        L_0x0556:
            r0 = -2035262149(0xffffffff86b05d3b, float:-6.634083E-35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E1o r1 = (X.C47420E1o) r1
            X.C47420E1o.A00(r1)
            X.ExQ r1 = r1.A00
            if (r1 == 0) goto L_0x0571
            X.GgO r3 = r1.A00
            X.7ft r2 = r1.A01
            java.lang.String r1 = r1.A02
            r3.A0Q(r2, r1)
        L_0x0571:
            r1 = 995108755(0x3b502793, float:0.003176187)
            goto L_0x0bb8
        L_0x0576:
            r0 = -2078865287(0xffffffff84170879, float:-1.7753855E-36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r3.A01
            com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment r6 = (com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment) r6
            com.instagram.common.session.UserSession r5 = r6.A01
            X.2Ay r1 = r6.A02
            java.lang.String r4 = r1.A00
            X.2Aq r1 = X.2Aq.A03(r5)
            long r2 = X.Dba.A02(r1, r5)
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            X.DbT.A1T(r5, r1, r4, r2)
            X.1We r1 = X.1We.A02
            if (r1 == 0) goto L_0x05b4
            X.1Wg r3 = X.1We.A00(r1)
            X.EWJ r2 = X.EWJ.IG_TS_QUIET_MODE_BLOCKING_SCREEN
            com.instagram.common.session.UserSession r1 = r6.A01
            X.3M3 r3 = r3.A01(r1, r2)
            androidx.fragment.app.FragmentActivity r2 = r6.requireActivity()
            com.instagram.common.session.UserSession r1 = r6.A01
            X.6Yo r1 = X.DbU.A0Q(r2, r1)
            r1.A0E(r3)
            r1.A04()
        L_0x05b4:
            r1 = 1258401194(0x4b01adaa, float:8498602.0)
            goto L_0x0bb8
        L_0x05b9:
            r0 = -975582324(0xffffffffc5d9cb8c, float:-6969.4434)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A01
            com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment r4 = (com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment) r4
            com.instagram.common.session.UserSession r5 = r4.A01
            X.EWJ r6 = r4.A03
            java.lang.String r11 = "take_break"
            X.2Aq r1 = X.2Aq.A03(r5)
            long r1 = X.Dba.A02(r1, r5)
            java.lang.Integer r7 = X.AnonymousClass05K.A0O
            java.lang.Long r10 = java.lang.Long.valueOf(r1)
            r8 = 0
            r13 = 1
            r9 = r8
            r12 = r8
            X.2Ci.A03(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.1We r1 = X.1We.A02
            if (r1 == 0) goto L_0x0603
            X.1Wg r3 = X.1We.A00(r1)
            X.EWJ r2 = r4.A03
            if (r2 != 0) goto L_0x05ed
            X.EWJ r2 = X.EWJ.IG_TS_SIMILAR_POSTS_NUDGE
        L_0x05ed:
            com.instagram.common.session.UserSession r1 = r4.A01
            X.3M3 r3 = r3.A01(r1, r2)
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            com.instagram.common.session.UserSession r1 = r4.A01
            X.6Yo r1 = X.DbU.A0Q(r2, r1)
            r1.A0E(r3)
            r1.A04()
        L_0x0603:
            r1 = -1307813705(0xffffffffb20c58b7, float:-8.169244E-9)
            goto L_0x0bb8
        L_0x0608:
            r0 = -1302032630(0xffffffffb2648f0a, float:-1.330387E-8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r3.A01
            com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment r6 = (com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment) r6
            com.instagram.common.session.UserSession r1 = r6.A01
            r8 = 0
            r11 = 0
            X.0qQ.A0B(r1, r11)
            X.7Pr r2 = X.DbS.A0W(r1)
            r2.A01()
            r2.A02()
            java.lang.String r10 = ""
            X.7Ps r7 = new X.7Ps
            r9 = r8
            r12 = r11
            r7.<init>(r8, r9, r10, r11, r12)
            X.7Pt r1 = r7.A00()
            r2.A0S = r1
            r2.A0U = r8
            X.7Pu r5 = r2.A00()
            X.1We r1 = X.1We.A02
            if (r1 == 0) goto L_0x0660
            X.EvW r4 = new X.EvW
            r4.<init>(r3)
            androidx.fragment.app.FragmentActivity r2 = r6.requireActivity()
            X.1We.A00(r1)
            X.ERa r1 = new X.ERa
            r1.<init>()
            r1.A00 = r4
            r5.A02(r2, r1)
            com.instagram.common.session.UserSession r1 = r6.A01
            X.0wc r3 = X.DbT.A0Q(r8, r1, r11)
            java.lang.String r2 = "daily_limit_reminder"
            java.lang.String r1 = "daily_limit_more_option_button"
            X.Dbc.A0U(r3, r2, r1)
        L_0x0660:
            r1 = 570007090(0x21f99e32, float:1.691477E-18)
            goto L_0x0bb8
        L_0x0665:
            r0 = -895203074(0xffffffffcaa448fe, float:-5383295.0)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r3.A01
            com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment r8 = (com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment) r8
            com.instagram.common.session.UserSession r6 = r8.A01
            X.2Ay r1 = r8.A02
            java.lang.String r5 = r1.A00
            long r3 = X.Dba.A01(r6)
            r2 = 0
            X.0qQ.A0B(r6, r2)
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.DbT.A1T(r6, r1, r5, r3)
            com.instagram.common.session.UserSession r7 = r8.A01
            X.2B1 r1 = X.2B0.A01
            X.0qQ.A0B(r7, r2)
            long r3 = X.AnonymousClass7TG.A0I()
            X.0xY r6 = X.DbV.A0c(r7, r1)
            X.0Tu r5 = X.0Tu.A05
            r1 = 36597476460202830(0x82053600160b4e, double:3.207729707416984E-306)
            long r1 = X.182.A01(r5, r7, r1)
            long r3 = r3 + r1
            java.lang.String r1 = "BEDTIME_REMINDER_BLOCKING_SCREEN_ELIGIBLE_TIMESTAMP_SECONDS"
            r6.E5c(r1, r3)
            r6.apply()
            X.DbT.A1K(r8)
            com.instagram.common.session.UserSession r1 = r8.A01
            X.2Aq r1 = X.2Aq.A03(r1)
            r1.A0R()
            r1 = -1122103916(0xffffffffbd1e0d94, float:-0.038587168)
            goto L_0x0bb8
        L_0x06b7:
            r0 = -767015194(0xffffffffd24846e6, float:-2.15045734E11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r3.A01
            com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment r3 = (com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment) r3
            com.instagram.common.session.UserSession r4 = r3.A01
            X.EWJ r5 = r3.A03
            java.lang.String r10 = "take_break"
            X.2Aq r1 = X.2Aq.A03(r4)
            long r1 = X.Dba.A02(r1, r4)
            java.lang.Integer r6 = X.AnonymousClass05K.A0M
            java.lang.Long r9 = java.lang.Long.valueOf(r1)
            r7 = 0
            r12 = 1
            r8 = r7
            r11 = r7
            X.2Ci.A03(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            com.instagram.common.session.UserSession r1 = r3.A01
            X.2Aq r1 = X.2Aq.A03(r1)
            r1.A0R()
            androidx.fragment.app.FragmentActivity r1 = r3.getActivity()
            r1.getClass()
            r1.finish()
            r1 = -1497404262(0xffffffffa6bf6c9a, float:-1.3282724E-15)
            goto L_0x0bb8
        L_0x06f5:
            r0 = -1423445113(0xffffffffab27f387, float:-5.966828E-13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r3.A01
            com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment r3 = (com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment) r3
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            com.instagram.common.session.UserSession r1 = r3.A01
            X.AnonymousClass3FV.A06(r2, r1)
            com.instagram.common.session.UserSession r1 = r3.A01
            X.2Aq r1 = X.2Aq.A03(r1)
            r1.A0T()
            r1 = 927272220(0x37450d1c, float:1.1745167E-5)
            goto L_0x0bb8
        L_0x0717:
            r0 = 519407203(0x1ef58663, float:2.5995965E-20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r3.A01
            com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment r6 = (com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment) r6
            com.instagram.common.session.UserSession r5 = r6.A01
            X.2Ay r1 = r6.A02
            java.lang.String r4 = r1.A00
            X.2Aq r1 = X.2Aq.A03(r5)
            long r2 = X.Dba.A02(r1, r5)
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            X.DbT.A1T(r5, r1, r4, r2)
            android.content.Context r3 = r6.requireContext()
            com.instagram.common.session.UserSession r2 = r6.A01
            java.lang.String r1 = "https://help.instagram.com/414934160431303?ref=bsa"
            X.C49040EoK.A00(r3, r2, r1)
            r1 = -352041351(0xffffffffeb044679, float:-1.59911E26)
            goto L_0x0bb8
        L_0x0745:
            r0 = 1792921076(0x6addcdf4, float:1.340726E26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.ERa r1 = (X.C48013ERa) r1
            X.EvW r1 = r1.A00
            if (r1 != 0) goto L_0x0758
            java.lang.String r0 = "dailyLimitRemindAgainMenuItemListener"
            goto L_0x0bbe
        L_0x0758:
            X.FOz r1 = r1.A00
            java.lang.Object r5 = r1.A01
            com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment r5 = (com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment) r5
            com.instagram.common.session.UserSession r4 = r5.A01
            r2 = 0
            X.2B1 r1 = X.2B0.A01
            r1.A09(r4, r2)
            com.instagram.common.session.UserSession r2 = r5.A01
            r1 = 0
            X.0wc r3 = X.DbX.A0O(r1, r2)
            java.lang.String r2 = "daily_limit_reminder"
            java.lang.String r1 = "daily_limit_reminder_ignore_button"
            X.Dbc.A0U(r3, r2, r1)
            X.DbT.A1K(r5)
            r1 = -320540986(0xffffffffece4eec6, float:-2.2141013E27)
            goto L_0x0bb8
        L_0x077d:
            r0 = 1999409131(0x772c8feb, float:3.4999768E33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r3.A01
            X.ERd r6 = (X.C48016ERd) r6
            X.0eM r1 = r6.A00
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r1)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.2Aq r1 = X.2Aq.A03(r1)
            long r3 = X.Dba.A02(r1, r5)
            java.lang.Integer r2 = X.AnonymousClass05K.A0P
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            X.2Ci.A07(r5, r2, r1)
            X.DbT.A1J(r6)
            r1 = -242009522(0xfffffffff1933a4e, float:-1.458073E30)
            goto L_0x0bb8
        L_0x07ab:
            r0 = 1085979149(0x40baba0d, float:5.8352113)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r3.A01
            X.ERd r7 = (X.C48016ERd) r7
            X.0eM r6 = r7.A00
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r6)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r6)
            X.2Aq r1 = X.2Aq.A03(r1)
            long r3 = X.Dba.A02(r1, r5)
            java.lang.Integer r2 = X.AnonymousClass05K.A0Q
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            X.2Ci.A07(r5, r2, r1)
            X.DbT.A1J(r7)
            android.content.Context r3 = r7.requireContext()
            X.0lg r2 = X.DbT.A0X(r6)
            java.lang.String r1 = "https://www.facebook.com/help/instagram/750317295927782/?cms_platform=android-app&helpref=platform_switcher"
            X.C49040EoK.A00(r3, r2, r1)
            r1 = 456312912(0x1b32c850, float:1.4788539E-22)
            goto L_0x0bb8
        L_0x07e6:
            r0 = 328883967(0x139a5eff, float:3.896874E-27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r3.A01
            X.E63 r3 = (X.E63) r3
            android.content.Context r2 = r3.requireContext()
            java.lang.String r1 = r3.A04
            X.0nC.A00(r2, r1)
            android.content.Context r2 = r3.requireContext()
            r1 = 2131974776(0x7f135a78, float:1.9586626E38)
            X.C59689JTv.A07(r2, r1)
            r1 = 1508051173(0x59e308e5, float:7.9880749E15)
            goto L_0x0bb8
        L_0x0809:
            r0 = 2085818564(0x7c5310c4, float:4.3836587E36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.E6Y r5 = (X.E6Y) r5
            com.instagram.common.session.UserSession r1 = r5.A00
            X.7Pr r3 = X.DbS.A0W(r1)
            X.E5A r4 = new X.E5A
            r4.<init>()
            r4.A05 = r5
            r1 = 2131974778(0x7f135a7a, float:1.958663E38)
            java.lang.String r1 = r5.getString(r1)
            r3.A0d = r1
            r3.A0T = r4
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0v()
            r3.A0a = r1
            r1 = 1060320051(0x3f333333, float:0.7)
            r3.A03 = r1
            r2 = 7
            X.ERK r1 = new X.ERK
            r1.<init>(r5, r2)
            r3.A0X = r1
            X.7Pu r1 = r3.A00()
            r5.A02 = r1
            android.os.Bundle r6 = X.AnonymousClass7TE.A0a()
            X.DwJ r1 = r5.A04
            r1.getClass()
            java.lang.String r2 = r1.A0C
            java.lang.String r1 = "ARG_REPORTING_EDUCATION_TICKET_ID"
            r6.putString(r1, r2)
            X.DwJ r1 = r5.A04
            java.lang.String r2 = r1.A0A
            r2.getClass()
            java.lang.String r1 = "ARG_REPORTING_EDUCATION_REPORT_TYPE"
            r6.putString(r1, r2)
            X.DwJ r1 = r5.A04
            java.lang.Long r1 = r1.A05
            r1.getClass()
            long r2 = r1.longValue()
            java.lang.String r1 = "ARG_REPORTING_EDUCATION_REPORTED_CONTENT_ID"
            r6.putLong(r1, r2)
            X.DwJ r1 = r5.A04
            java.lang.String r2 = r1.A07
            java.lang.String r1 = "ARG_REPORTING_EDUCATION_REPORTED_CONTENT_TYPE"
            r6.putString(r1, r2)
            r4.setArguments(r6)
            X.7Pu r2 = r5.A02
            r4.A04 = r2
            android.content.Context r1 = r5.requireContext()
            r2.A03(r1, r4)
            r1 = 652322579(0x26e1a713, float:1.5657797E-15)
            goto L_0x0bb8
        L_0x088d:
            r0 = -1284086497(0xffffffffb376651f, float:-5.7368307E-8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E6Y r1 = (X.E6Y) r1
            android.content.Context r4 = r1.getContext()
            r4.getClass()
            com.instagram.common.session.UserSession r3 = r1.A00
            java.lang.String r2 = "https://help.instagram.com/477434105621119"
            r1 = 1
            X.0qQ.A0B(r3, r1)
            r1 = 0
            X.C49960FGs.A07(r4, r3, r2, r1)
            r1 = 1565848779(0x5d54f4cb, float:9.5906956E17)
            goto L_0x0bb8
        L_0x08b0:
            r0 = 1394484943(0x531e26cf, float:6.7925593E11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E6Y r1 = (X.E6Y) r1
            X.E6Y.A02(r1)
            r1 = -1043167903(0xffffffffc1d28561, float:-26.315126)
            goto L_0x0bb8
        L_0x08c3:
            r0 = 1029576192(0x3d5e1600, float:0.0542202)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A01
            X.E6Y r4 = (X.E6Y) r4
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            com.instagram.common.session.UserSession r5 = r4.A00
            r1 = 2
            X.0qQ.A0B(r5, r1)
            java.lang.String r1 = "support_inbox_detail_fragment"
            java.util.Map r12 = X.C49234Erd.A00(r1)
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            r1 = 129(0x81, float:1.81E-43)
            java.lang.String r10 = X.C273654mx.A00(r1)
            r3 = 0
            X.EUa r7 = new X.EUa
            r7.<init>()
            X.Mqm r1 = new X.Mqm
            r6 = r3
            r8 = r3
            r11 = r3
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1.A04()
            r1 = 1759640075(0x68e1fa0b, float:8.5371595E24)
            goto L_0x0bb8
        L_0x08fc:
            r0 = -1705489613(0xffffffff9a584b33, float:-4.47285E-23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r3.A01
            X.E6Y r3 = (X.E6Y) r3
            X.DwJ r1 = r3.A04
            r1.getClass()
            X.DwJ r1 = r3.A04
            X.Eye r1 = r1.A02
            r1.getClass()
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            X.DwJ r1 = r3.A04
            X.Eye r1 = r1.A02
            java.lang.Long r1 = r1.A00
            long r1 = r1.longValue()
            java.lang.String r2 = java.lang.Long.toString(r1)
            java.lang.String r1 = "cni"
            r4.put(r1, r2)
            java.lang.String r2 = "get_challenge"
            java.lang.String r1 = "true"
            r4.put(r2, r1)
            X.DwJ r1 = r3.A04
            X.Eye r1 = r1.A02
            java.lang.String r2 = r1.A02
            java.lang.String r1 = "challenge_context"
            r4.put(r1, r2)
            com.instagram.common.session.UserSession r2 = r3.A00
            X.DwJ r1 = r3.A04
            X.Eye r1 = r1.A02
            java.lang.String r1 = r1.A01
            X.8ey r2 = X.C359988do.A04(r2, r1, r4)
            r1 = 28
            X.E84.A00(r2, r3, r1)
            r3.schedule(r2)
            r1 = -1422216164(0xffffffffab3ab41c, float:-6.6330426E-13)
            goto L_0x0bb8
        L_0x0955:
            r0 = -1072698095(0xffffffffc00fed11, float:-2.2488444)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E5A r1 = (X.E5A) r1
            X.E6Y r2 = r1.A05
            r1 = 1
            r2.A08 = r1
            X.7Pu r1 = r2.A02
            X.DbW.A1K(r1)
            r1 = 189093968(0xb455850, float:3.800726E-32)
            goto L_0x0bb8
        L_0x096f:
            r0 = -263182600(0xfffffffff05026f8, float:-2.5767997E29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r3.A01
            X.E5A r6 = (X.E5A) r6
            X.E6Y r1 = r6.A05
            X.E5A r4 = new X.E5A
            r4.<init>()
            r4.A05 = r1
            android.os.Bundle r7 = X.AnonymousClass7TE.A0a()
            int r1 = r6.A00
            r5 = 1
            int r2 = r1 + 1
            java.lang.String r1 = "ARG_REPORTING_EDUCATION_TIP_NUMBER"
            r7.putInt(r1, r2)
            java.lang.String r2 = r6.A08
            java.lang.String r1 = "ARG_REPORTING_EDUCATION_TICKET_ID"
            r7.putString(r1, r2)
            java.lang.String r2 = r6.A07
            java.lang.String r1 = "ARG_REPORTING_EDUCATION_REPORT_TYPE"
            r7.putString(r1, r2)
            java.lang.Long r1 = r6.A06
            long r2 = r1.longValue()
            java.lang.String r1 = "ARG_REPORTING_EDUCATION_REPORTED_CONTENT_ID"
            r7.putLong(r1, r2)
            r4.setArguments(r7)
            X.7Pu r1 = r6.A04
            r1.getClass()
            r4.A04 = r1
            X.7Pu r3 = r6.A04
            com.instagram.common.session.UserSession r1 = r6.A02
            X.7Pr r2 = X.DbS.A0W(r1)
            r1 = 2131974778(0x7f135a7a, float:1.958663E38)
            java.lang.String r1 = r6.getString(r1)
            r2.A0d = r1
            r2.A0T = r4
            X.DbS.A1S(r2, r5)
            r1 = 1060320051(0x3f333333, float:0.7)
            r2.A03 = r1
            r3.A0E(r4, r2)
            r1 = 2033342828(0x7932596c, float:5.787766E34)
            goto L_0x0bb8
        L_0x09d7:
            r0 = 903020008(0x35d2fde8, float:1.5720116E-6)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r3.A01
            X.E5A r8 = (X.E5A) r8
            java.lang.Long r1 = r8.A06
            java.lang.String r1 = r1.toString()
            r1.getClass()
            com.instagram.common.session.UserSession r2 = r8.A02
            java.lang.String r9 = r8.A08
            java.lang.String r7 = r8.A07
            java.lang.Long r1 = r8.A06
            java.lang.String r6 = r1.toString()
            r5 = 0
            X.0qQ.A0B(r2, r5)
            X.1NY r4 = X.AnonymousClass7TG.A0a(r2)
            java.lang.String r1 = "reports/submit_reporter_appeal/"
            r4.A0A(r1)
            java.lang.Class<X.DwJ> r2 = X.DwJ.class
            java.lang.Class<X.F8d> r1 = X.C49816F8d.class
            r4.A0Q(r2, r1)
            java.lang.String r1 = "ticket_id"
            r4.A9m(r1, r9)
            java.lang.String r1 = "report_type"
            r4.A9m(r1, r7)
            java.lang.String r1 = "reported_content_id"
            r4.A9m(r1, r6)
            r4.A0M()
            X.1OC r2 = r4.A0M()
            X.ECu r1 = new X.ECu
            r1.<init>(r3, r5)
            r2.A00 = r1
            r8.schedule(r2)
            r1 = -996474782(0xffffffffc49b0062, float:-1240.012)
            goto L_0x0bb8
        L_0x0a30:
            r0 = 1718499572(0x666e38f4, float:2.8124346E23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.E6Y r5 = (X.E6Y) r5
            X.DwJ r1 = r5.A04
            r1.getClass()
            X.DwJ r1 = r5.A04
            com.instagram.wellbeing.supportinbox.model.SupportInboxDetailBottomSheetModel r1 = r1.A00
            r1.getClass()
            com.instagram.common.session.UserSession r1 = r5.A00
            X.7Pr r4 = X.DbS.A0W(r1)
            X.E63 r3 = new X.E63
            r3.<init>()
            android.os.Bundle r6 = X.AnonymousClass7TE.A0a()
            X.DwJ r1 = r5.A04
            com.instagram.wellbeing.supportinbox.model.SupportInboxDetailBottomSheetModel r2 = r1.A00
            java.lang.String r1 = "ARG_BOTTOM_SHEET_INFO"
            r6.putParcelable(r1, r2)
            X.DwJ r1 = r5.A04
            java.lang.String r2 = r1.A08
            java.lang.String r1 = "ARG_REFERENCE_ID"
            r6.putString(r1, r2)
            X.DwJ r1 = r5.A04
            boolean r2 = r1.A0F
            java.lang.String r1 = "ARG_IS_EXPIRED"
            r6.putBoolean(r1, r2)
            X.DwJ r1 = r5.A04
            java.lang.Long r1 = r1.A04
            if (r1 == 0) goto L_0x0a80
            long r1 = r1.longValue()
            java.lang.String r7 = "ARG_EXPIRATION_TIME"
            r6.putLong(r7, r1)
        L_0x0a80:
            java.lang.String r2 = r5.A05
            java.lang.String r1 = "ARG_CTRL_TYPE"
            r6.putString(r1, r2)
            java.lang.String r2 = r5.A07
            java.lang.String r1 = "ARG_TICKET_TYPE"
            r6.putString(r1, r2)
            java.lang.String r2 = r5.A06
            java.lang.String r1 = "ARG_REPORTED_CONTENT_ID"
            r6.putString(r1, r2)
            X.DwJ r1 = r5.A04
            java.lang.String r2 = r1.A07
            java.lang.String r1 = "ARG_CONTENT_TYPE"
            r6.putString(r1, r2)
            r3.setArguments(r6)
            r4.A0T = r3
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0v()
            r4.A0a = r1
            r1 = 1060320051(0x3f333333, float:0.7)
            r4.A03 = r1
            X.7Pu r2 = r4.A00()
            r5.A02 = r2
            android.content.Context r1 = r5.requireContext()
            r2.A03(r1, r3)
            r1 = 1162619152(0x454c2910, float:3266.5664)
            goto L_0x0bb8
        L_0x0ac0:
            r0 = 1139373446(0x43e97586, float:466.91815)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.E2v r5 = (X.C47449E2v) r5
            X.0eM r1 = r5.A09
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r3 = "igwb"
            java.lang.String r2 = "secondary_button_did_tapped"
            r1 = 0
            X.FCT.A01(r5, r4, r3, r2, r1)
            X.F2M r3 = r5.A01
            if (r3 == 0) goto L_0x0ba0
            java.util.HashMap r2 = X.C47449E2v.A00(r5)
            java.lang.String r1 = "cancel"
            r3.A00(r1, r2)
            androidx.fragment.app.FragmentActivity r1 = r5.A00
            if (r1 == 0) goto L_0x0bbc
            r1.onBackPressed()
            r1 = 1716844622(0x6654f84e, float:2.5143053E23)
            goto L_0x0bb8
        L_0x0af2:
            r0 = 764262412(0x2d8db80c, float:1.6111577E-11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r3.A01
            X.E2v r7 = (X.C47449E2v) r7
            X.0eM r4 = r7.A09
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r4)
            java.lang.String r2 = "igwb"
            java.lang.String r1 = "primary_button_did_tapped"
            r9 = 0
            X.FCT.A01(r7, r3, r2, r1, r9)
            X.F2M r3 = r7.A01
            if (r3 == 0) goto L_0x0ba0
            java.util.HashMap r2 = X.C47449E2v.A00(r7)
            java.lang.String r1 = "save_settings"
            r3.A00(r1, r2)
            boolean r1 = r7.A07
            java.lang.String r8 = "config_value"
            if (r1 == 0) goto L_0x0b50
            android.content.Context r10 = r7.requireContext()
            X.0gy r6 = X.AnonymousClass07i.A00(r7)
            X.0lg r1 = X.DbT.A0X(r4)
            X.1NY r5 = X.AnonymousClass7TG.A0a(r1)
            r1 = 1067(0x42b, float:1.495E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r5.A0A(r1)
            java.lang.Class<X.1XP> r3 = X.1XP.class
            java.lang.Class<X.1XY> r1 = X.1XY.class
            r2 = 1
            r5.A0O(r9, r3, r1, r2)
            boolean r1 = r7.A05
            r5.A0C(r8, r1)
            X.1OC r2 = X.DbT.A0U(r5, r2)
            r1 = 57
            X.C47696EDf.A01(r2, r7, r1)
            X.1ES.A00(r10, r6, r2)
        L_0x0b50:
            boolean r1 = r7.A08
            if (r1 == 0) goto L_0x0b6d
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r4)
            X.631 r3 = new X.631
            r3.<init>(r1)
            boolean r1 = r3.A04()
            if (r1 == 0) goto L_0x0b71
            boolean r2 = r7.A04
            X.FbZ r1 = new X.FbZ
            r1.<init>(r7)
            r3.A00(r1, r2)
        L_0x0b6d:
            r1 = -201815754(0xfffffffff3f88936, float:-3.9382098E31)
            goto L_0x0bb8
        L_0x0b71:
            android.content.Context r6 = r7.requireContext()
            X.0gy r5 = X.AnonymousClass07i.A00(r7)
            X.0lg r1 = X.DbT.A0X(r4)
            X.1NY r4 = X.AnonymousClass7TG.A0a(r1)
            java.lang.String r1 = "accounts/set_hide_message_requests_global/"
            r4.A0A(r1)
            java.lang.Class<X.1XP> r3 = X.1XP.class
            java.lang.Class<X.1XY> r1 = X.1XY.class
            r2 = 1
            r4.A0O(r9, r3, r1, r2)
            boolean r1 = r7.A04
            r4.A0C(r8, r1)
            X.1OC r2 = X.DbT.A0U(r4, r2)
            r1 = 58
            X.C47696EDf.A01(r2, r7, r1)
            X.1ES.A00(r6, r5, r2)
            goto L_0x0b6d
        L_0x0ba0:
            java.lang.String r0 = "logger"
            goto L_0x0bbe
        L_0x0ba3:
            r0 = 970508664(0x39d8c978, float:4.1348836E-4)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E2v r1 = (X.C47449E2v) r1
            androidx.fragment.app.FragmentActivity r1 = r1.A00
            if (r1 == 0) goto L_0x0bbc
            r1.onBackPressed()
            r1 = 635734691(0x25e48aa3, float:3.964564E-16)
        L_0x0bb8:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x0bbc:
            java.lang.String r0 = "activity"
        L_0x0bbe:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50109FOz.onClick(android.view.View):void");
    }

    public C50109FOz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
