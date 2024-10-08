package X;

/* renamed from: X.PhW  reason: case insensitive filesystem */
public final class C73657PhW extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73657PhW(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r2v10, types: [X.2KN, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0459, code lost:
        return r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x012f, code lost:
        r0.Epw(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x0137;
                case 1: goto L_0x013e;
                case 2: goto L_0x014e;
                case 3: goto L_0x0090;
                case 4: goto L_0x015f;
                case 5: goto L_0x016b;
                case 6: goto L_0x0190;
                case 7: goto L_0x044a;
                case 8: goto L_0x01a8;
                case 9: goto L_0x01c6;
                case 10: goto L_0x00a8;
                case 11: goto L_0x01d7;
                case 12: goto L_0x01e4;
                case 13: goto L_0x01fc;
                case 14: goto L_0x01fc;
                case 15: goto L_0x0205;
                case 16: goto L_0x0259;
                case 17: goto L_0x0286;
                case 18: goto L_0x02b5;
                case 19: goto L_0x02d2;
                case 20: goto L_0x02e6;
                case 21: goto L_0x02f0;
                case 22: goto L_0x00bb;
                case 23: goto L_0x02fa;
                case 24: goto L_0x0304;
                case 25: goto L_0x030e;
                case 26: goto L_0x0318;
                case 27: goto L_0x0322;
                case 28: goto L_0x032c;
                case 29: goto L_0x0336;
                case 30: goto L_0x0340;
                case 31: goto L_0x0351;
                case 32: goto L_0x035c;
                case 33: goto L_0x036a;
                case 34: goto L_0x037d;
                case 35: goto L_0x0134;
                case 36: goto L_0x0451;
                case 37: goto L_0x0137;
                case 38: goto L_0x03b2;
                case 39: goto L_0x00c9;
                case 40: goto L_0x00d9;
                case 41: goto L_0x010b;
                case 42: goto L_0x03ca;
                case 43: goto L_0x03de;
                case 44: goto L_0x0126;
                case 45: goto L_0x0413;
                case 46: goto L_0x042a;
                case 47: goto L_0x0434;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r11.A01
            X.E3U r3 = (X.E3U) r3
            X.3t3 r2 = r3.A01
            if (r2 == 0) goto L_0x0071
            X.0eM r0 = r3.A07
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.2Dm r1 = X.2L2.A00(r0)
            X.3t0 r0 = X.C300965yF.A01(r2)
            com.instagram.model.direct.DirectThreadKey r0 = X.C327647Bq.A00(r0)
            X.3U9 r1 = r1.C5z(r0)
            X.0eM r0 = r3.A06
            X.6gx r5 = X.DbZ.A0R(r0)
            r7 = 0
            if (r1 == 0) goto L_0x008e
            java.lang.String r6 = r1.C6C()
            java.lang.String r7 = r1.C6k()
        L_0x0034:
            int r4 = r3.A00
            X.0eM r0 = r3.A05
            java.lang.Object r1 = r0.getValue()
            X.NiW r0 = X.C69270NiW.ACTIVATION_NUX
            boolean r1 = X.AnonymousClass7TF.A1W(r1, r0)
            X.1Ln r2 = X.DbT.A0J(r5)
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x0071
            X.DbW.A17(r2, r5)
            java.lang.String r0 = "render_best_practices_sheet"
            X.DbV.A1M(r2, r0)
            java.lang.String r0 = "learn_more_sheet"
            r2.A0p(r0)
            java.lang.String r0 = "thread_view"
            X.DbZ.A1L(r2, r0, r4)
            if (r1 == 0) goto L_0x008b
            X.Nmb r1 = X.C69493Nmb.NEW_CHANNEL_FIRST_MESSAGE
        L_0x0062:
            java.lang.String r0 = "entrypoint"
            r2.A0M(r1, r0)
            r2.A0s(r6)
            java.lang.Long r0 = X.DbZ.A0d(r7)
            X.C66582MXn.A1C(r2, r5, r0)
        L_0x0071:
            X.0eM r0 = r3.A07
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r4 = r3.requireActivity()
            X.3t3 r7 = r3.A01
            X.NiW r6 = X.C69270NiW.BEST_PRACTICES
            int r10 = r3.A00
            java.lang.String r9 = r3.A04
            java.lang.String r8 = "thread_view"
            X.C69873Ntb.A00(r4, r5, r6, r7, r8, r9, r10)
        L_0x0088:
            X.0gF r3 = X.C60340gF.A00
        L_0x008a:
            return r3
        L_0x008b:
            X.Nmb r1 = X.C69493Nmb.EXISTING_CHANNEL_FIRST_EXPOSURE
            goto L_0x0062
        L_0x008e:
            r6 = r7
            goto L_0x0034
        L_0x0090:
            java.lang.Object r2 = r11.A01
            X.K3S r2 = (X.K3S) r2
            android.os.Bundle r1 = r2.mArguments
            if (r1 == 0) goto L_0x00a4
            r0 = 1109(0x455, float:1.554E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r3 = r1.getString(r0)
            if (r3 != 0) goto L_0x008a
        L_0x00a4:
            X.0sa r0 = r2.A07
            goto L_0x0455
        L_0x00a8:
            java.lang.Object r0 = r11.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x00b8
            java.lang.String r0 = "args_tray_config"
            android.os.Parcelable r3 = r1.getParcelable(r0)
            if (r3 != 0) goto L_0x008a
        L_0x00b8:
            com.instagram.direct.avatar.stickers.intf.DirectAvatarTrayFragmentConfig$NestedTray r3 = com.instagram.direct.avatar.stickers.intf.DirectAvatarTrayFragmentConfig.NestedTray.A00
            return r3
        L_0x00bb:
            java.lang.Object r0 = r11.A01
            X.Mc8 r0 = (X.C66763Mc8) r0
            X.OFu r0 = r0.A00
            if (r0 == 0) goto L_0x0088
            com.instagram.igds.components.banner.IgdsBanner r0 = r0.A00
            X.AnonymousClass7TH.A0R(r0)
            goto L_0x0088
        L_0x00c9:
            java.lang.Object r0 = r11.A01
            X.Gtw r0 = (X.C53767Gtw) r0
            X.JjH r1 = r0.A00
            X.7a3 r0 = r1.A04
            r0.A01()
            X.05G r0 = r1.A0C
            X.P0g r1 = X.P0g.A00
            goto L_0x012f
        L_0x00d9:
            java.lang.Object r0 = r11.A01
            X.Gw7 r0 = (X.C53901Gw7) r0
            X.JjH r4 = r0.A03
            X.6oS r3 = X.C318116oQ.A00(r4)
            r2 = 0
            r1 = 25
            X.MFz r0 = new X.MFz
            r0.<init>(r4, r2, r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            com.instagram.comments.mvvm.data.MediaCommentListRepository r2 = r4.A05
            X.0Ud r0 = r2.A0L
            java.lang.Object r0 = r0.getValue()
            X.7aH r0 = (X.C333867aH) r0
            boolean r0 = r0.A09
            if (r0 == 0) goto L_0x0088
            X.GmL r1 = r4.A03
            boolean r0 = r1.A0e
            if (r0 == 0) goto L_0x0088
            boolean r0 = r1.A0O
            if (r0 == 0) goto L_0x0088
            r2.A0E()
            goto L_0x0088
        L_0x010b:
            java.lang.Object r0 = r11.A01
            X.Guw r0 = (X.C53829Guw) r0
            X.JjH r1 = r0.A01
            if (r1 == 0) goto L_0x0088
            java.lang.String r3 = r0.A04
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.05G r2 = r1.A0D
            r1 = 0
            X.Jyu r0 = new X.Jyu
            r0.<init>(r3, r1)
            r2.Epw(r0)
            goto L_0x0088
        L_0x0126:
            java.lang.Object r0 = r11.A01
            X.05G r0 = (X.05G) r0
            X.Jyy r1 = new X.Jyy
            r1.<init>()
        L_0x012f:
            r0.Epw(r1)
            goto L_0x0088
        L_0x0134:
            java.lang.Object r3 = r11.A01
            return r3
        L_0x0137:
            java.lang.Object r0 = r11.A01
            X.07f r3 = X.DbY.A0I(r0)
            return r3
        L_0x013e:
            java.lang.Object r0 = r11.A01
            X.K3S r0 = (X.K3S) r0
            X.0eM r0 = r0.A0K
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KBR r3 = new X.KBR
            r3.<init>(r0)
            return r3
        L_0x014e:
            java.lang.Object r0 = r11.A01
            X.K3S r0 = (X.K3S) r0
            X.0sP r1 = r0.A0A
            X.0eM r0 = r0.A0K
            java.lang.Object r0 = r0.getValue()
            java.lang.Object r3 = r1.invoke(r0)
            return r3
        L_0x015f:
            java.lang.Object r0 = r11.A01
            android.content.Context r0 = X.DbT.A08(r0)
            X.Muh r3 = new X.Muh
            r3.<init>(r0)
            return r3
        L_0x016b:
            java.lang.Object r0 = r11.A01
            X.K3S r0 = (X.K3S) r0
            X.0eM r0 = r0.A0K
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.1vn r0 = X.1vm.A01(r3)
            X.75u r2 = new X.75u
            r2.<init>(r3, r0)
            r0 = 0
            X.0qQ.A0B(r3, r0)
            r0 = 19
            X.MMO r1 = new X.MMO
            r1.<init>(r2, r0)
            java.lang.Class<X.75v> r0 = X.AnonymousClass75v.class
            java.lang.Object r3 = r3.A01(r0, r1)
            return r3
        L_0x0190:
            java.lang.Object r0 = r11.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x01a5
            java.lang.String r0 = "args_social_stickers_user_ids"
            java.util.ArrayList r0 = r1.getStringArrayList(r0)
            if (r0 == 0) goto L_0x01a5
            java.util.List r3 = X.00k.A0a(r0)
            return r3
        L_0x01a5:
            X.0sn r3 = X.0sn.A00
            return r3
        L_0x01a8:
            java.lang.Object r0 = r11.A01
            X.K3S r0 = (X.K3S) r0
            android.view.View r4 = r0.requireView()
            X.2t9 r2 = r0.A0C()
            androidx.recyclerview.widget.RecyclerView r1 = r0.A07()
            X.0eM r0 = r0.A0Q
            java.lang.Object r0 = r0.getValue()
            com.instagram.direct.avatar.stickers.intf.DirectAvatarTrayFragmentConfig r0 = (com.instagram.direct.avatar.stickers.intf.DirectAvatarTrayFragmentConfig) r0
            X.L86 r3 = new X.L86
            r3.<init>(r4, r1, r2, r0)
            return r3
        L_0x01c6:
            java.lang.Object r0 = r11.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x01d5
            java.lang.String r0 = "args_thread_key"
            android.os.Parcelable r3 = r1.getParcelable(r0)
            return r3
        L_0x01d5:
            r3 = 0
            return r3
        L_0x01d7:
            java.lang.Object r1 = r11.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.String r0 = "DirectBadgingModule"
            X.MYg r0 = X.MYc.A01(r1, r0)
            X.MYb r3 = r0.A01
            return r3
        L_0x01e4:
            java.lang.Object r4 = r11.A01
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            r0 = 15
            X.PqZ r2 = new X.PqZ
            r2.<init>(r4, r0)
            r1 = 11
            X.PhW r0 = new X.PhW
            r0.<init>(r4, r1)
            X.MYk r3 = new X.MYk
            r3.<init>(r4, r0, r2)
            return r3
        L_0x01fc:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2Dm r3 = X.1bJ.A00(r0)
            return r3
        L_0x0205:
            java.lang.Object r5 = r11.A01
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            r0 = 13
            X.PhW r4 = new X.PhW
            r4.<init>(r5, r0)
            r0 = 14
            X.PhW r1 = new X.PhW
            r1.<init>(r5, r0)
            X.2KA r0 = X.AnonymousClass2KA.A00
            X.2KB r2 = new X.2KB
            r2.<init>(r1, r5, r0)
            X.2HN r0 = X.2HM.A00(r5)
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x024b
            X.2HN r0 = X.2HM.A00(r5)
            X.2HR r0 = r0.A04
            boolean r0 = X.DbX.A1Z(r0)
            if (r0 == 0) goto L_0x024b
            r0 = 16
            X.PhW r1 = new X.PhW
            r1.<init>(r5, r0)
            java.lang.Class<X.2KG> r0 = X.AnonymousClass2KG.class
            java.lang.Object r1 = r5.A01(r0, r1)
            X.2KG r1 = (X.AnonymousClass2KG) r1
        L_0x0243:
            X.2KH r1 = (X.AnonymousClass2KH) r1
            X.2K6 r3 = new X.2K6
            r3.<init>(r5, r1, r2, r4)
            return r3
        L_0x024b:
            X.2JA r1 = X.2J9.A04
            java.lang.String r0 = r5.A06
            X.2J9 r0 = r1.A00(r0)
            X.2KO r1 = new X.2KO
            r1.<init>(r5, r0)
            goto L_0x0243
        L_0x0259:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r3 = X.C66581MXm.A0Q(r0)
            r0 = 19
            X.PhW r1 = new X.PhW
            r1.<init>(r3, r0)
            java.lang.Class<X.2KK> r0 = X.AnonymousClass2KK.class
            java.lang.Object r4 = r3.A01(r0, r1)
            X.2KK r4 = (X.AnonymousClass2KK) r4
            X.2KN r2 = new X.2KN
            r2.<init>()
            X.2JA r1 = X.2J9.A04
            java.lang.String r0 = r3.A06
            X.2J9 r1 = r1.A00(r0)
            X.2KO r0 = new X.2KO
            r0.<init>(r3, r1)
            X.2KG r3 = new X.2KG
            r3.<init>(r4, r0, r2)
            return r3
        L_0x0286:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r3 = X.C66581MXm.A0Q(r0)
            r0 = 12
            X.PhW r1 = new X.PhW
            r1.<init>(r3, r0)
            java.lang.Class<X.MYk> r0 = X.C66598MYk.class
            java.lang.Object r4 = r3.A01(r0, r1)
            X.MYk r4 = (X.C66598MYk) r4
            X.MZf r2 = new X.MZf
            r2.<init>(r3, r4)
            r0 = 16
            X.PhW r1 = new X.PhW
            r1.<init>(r3, r0)
            java.lang.Class<X.2KG> r0 = X.AnonymousClass2KG.class
            java.lang.Object r0 = r3.A01(r0, r1)
            X.2KG r0 = (X.AnonymousClass2KG) r0
            X.MZg r3 = new X.MZg
            r3.<init>(r2, r4, r0)
            return r3
        L_0x02b5:
            java.lang.Object r2 = r11.A01
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            r0 = 15
            X.PhW r1 = new X.PhW
            r1.<init>(r2, r0)
            java.lang.Class<X.2K6> r0 = X.2K6.class
            java.lang.Object r1 = r2.A01(r0, r1)
            X.2K6 r1 = (X.2K6) r1
            X.1Ng r0 = X.AnonymousClass1Nd.A00(r2)
            X.2K2 r3 = new X.2K2
            r3.<init>(r0, r2, r1)
            return r3
        L_0x02d2:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Am r1 = X.1Al.A01(r0)
            X.1An r0 = X.1An.A1D
            X.0xa r0 = r1.A03(r0)
            X.2KK r3 = new X.2KK
            r3.<init>(r0)
            return r3
        L_0x02e6:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Eti r3 = new X.Eti
            r3.<init>(r0)
            return r3
        L_0x02f0:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.FYl r3 = new X.FYl
            r3.<init>(r0)
            return r3
        L_0x02fa:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.FYv r3 = new X.FYv
            r3.<init>(r0)
            return r3
        L_0x0304:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Oxp r3 = new X.Oxp
            r3.<init>(r0)
            return r3
        L_0x030e:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.7GX r3 = new X.7GX
            r3.<init>(r0)
            return r3
        L_0x0318:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.MfP r3 = new X.MfP
            r3.<init>(r0)
            return r3
        L_0x0322:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.OyR r3 = new X.OyR
            r3.<init>(r0)
            return r3
        L_0x032c:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.OyG r3 = new X.OyG
            r3.<init>(r0)
            return r3
        L_0x0336:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.OyH r3 = new X.OyH
            r3.<init>(r0)
            return r3
        L_0x0340:
            java.lang.Object r2 = r11.A01
            X.LSm r2 = (X.LSm) r2
            com.instagram.common.session.UserSession r0 = r2.A00
            X.2Dm r1 = X.1bJ.A00(r0)
            java.lang.String r0 = r2.A02
            X.3U9 r3 = X.C66580MXl.A0d(r1, r0)
            return r3
        L_0x0351:
            java.lang.Object r0 = r11.A01
            X.LSm r0 = (X.LSm) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.6gx r3 = X.C313746gw.A00(r0)
            return r3
        L_0x035c:
            java.lang.Object r1 = r11.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.2Dm r0 = X.1bJ.A00(r1)
            X.Oy9 r3 = new X.Oy9
            r3.<init>(r1, r0)
            return r3
        L_0x036a:
            java.lang.Object r1 = r11.A01
            X.K6q r1 = (X.C61419K6q) r1
            X.0eM r0 = r1.A06
            r0.getValue()
            android.os.Bundle r0 = r1.requireArguments()
            X.OLz r3 = new X.OLz
            r3.<init>(r0)
            return r3
        L_0x037d:
            java.lang.Object r1 = r11.A01
            X.K6q r1 = (X.C61419K6q) r1
            X.0eM r0 = r1.A06
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r3 = r1.A02
            java.lang.Object r0 = r3.getValue()
            X.OLz r0 = (X.C70804OLz) r0
            java.lang.String r2 = r0.A0C
            if (r2 == 0) goto L_0x03ad
            java.lang.Object r0 = r3.getValue()
            X.OLz r0 = (X.C70804OLz) r0
            java.lang.String r1 = r0.A09
            java.lang.Object r0 = r3.getValue()
            X.OLz r0 = (X.C70804OLz) r0
            java.lang.String r0 = r0.A07
            com.instagram.model.direct.messageid.MessageIdentifier r0 = X.C66580MXl.A0i(r1, r0)
            X.LSm r3 = new X.LSm
            r3.<init>(r4, r0, r2)
            return r3
        L_0x03ad:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x03b2:
            java.lang.Object r2 = r11.A01
            X.K6q r2 = (X.C61419K6q) r2
            X.0eM r0 = r2.A06
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r2.A02
            java.lang.Object r0 = r0.getValue()
            X.OLz r0 = (X.C70804OLz) r0
            X.KDQ r3 = new X.KDQ
            r3.<init>(r1, r0, r2)
            return r3
        L_0x03ca:
            java.lang.Object r0 = r11.A01
            X.3Y5 r0 = (X.AnonymousClass3Y5) r0
            X.2V1 r0 = r0.A05
            android.content.Context r1 = r0.A0C
            r0 = 2130970237(0x7f04067d, float:1.7549178E38)
            int r0 = X.AnonymousClass7TF.A03(r1, r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            return r3
        L_0x03de:
            X.7du r3 = new X.7du
            r3.<init>()
            java.lang.Object r1 = r11.A01
            X.3Y5 r1 = (X.AnonymousClass3Y5) r1
            r0 = 2131099734(0x7f060056, float:1.781183E38)
            int r0 = X.C244013aV.A02(r1, r0)
            r3.A05(r0)
            r0 = 2131100677(0x7f060405, float:1.7813742E38)
            int r0 = X.C244013aV.A02(r1, r0)
            X.3O5 r2 = r3.A00
            r2.A09 = r0
            boolean r1 = X.0mk.A01()
            r0 = 0
            if (r1 == 0) goto L_0x0404
            r0 = 2
        L_0x0404:
            r2.A06 = r0
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.A04(r0)
            r0 = 0
            r2.A03 = r0
            X.3O5 r3 = r3.A01()
            return r3
        L_0x0413:
            java.lang.Object r0 = r11.A01
            X.K7l r0 = (X.C61436K7l) r0
            X.0eM r0 = r0.A05
            X.0lg r2 = X.DbY.A0R(r0)
            r0 = 47
            X.Plm r1 = X.C73911Plm.A00(r2, r0)
            java.lang.Class<X.OTV> r0 = X.OTV.class
            java.lang.Object r3 = r2.A01(r0, r1)
            return r3
        L_0x042a:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.HDZ r3 = new X.HDZ
            r3.<init>(r0)
            return r3
        L_0x0434:
            java.lang.Object r0 = r11.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x0448
            java.lang.String r0 = "channel_education_type"
            java.io.Serializable r3 = r1.getSerializable(r0)
        L_0x0442:
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.channels.education.util.ChannelEducationType"
            X.0qQ.A0C(r3, r0)
            return r3
        L_0x0448:
            r3 = 0
            goto L_0x0442
        L_0x044a:
            java.lang.Object r0 = r11.A01
            X.K3S r0 = (X.K3S) r0
            X.0sa r0 = r0.A08
            goto L_0x0455
        L_0x0451:
            java.lang.Object r0 = r11.A01
            X.0sa r0 = (X.C62320sa) r0
        L_0x0455:
            java.lang.Object r3 = r0.invoke()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73657PhW.invoke():java.lang.Object");
    }
}
