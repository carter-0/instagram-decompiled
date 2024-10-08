package X;

/* renamed from: X.Pld  reason: case insensitive filesystem */
public final class C73902Pld extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73902Pld(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new C73902Pld(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0135, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        r3 = r1.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if (r3 != null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        return "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0226, code lost:
        return X.C66583MXo.A0P(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x0248;
                case 1: goto L_0x0005;
                case 2: goto L_0x024f;
                case 3: goto L_0x0248;
                case 4: goto L_0x0005;
                case 5: goto L_0x0234;
                case 6: goto L_0x0227;
                case 7: goto L_0x0015;
                case 8: goto L_0x000c;
                case 9: goto L_0x021c;
                case 10: goto L_0x0211;
                case 11: goto L_0x020a;
                case 12: goto L_0x01fb;
                case 13: goto L_0x01f0;
                case 14: goto L_0x024f;
                case 15: goto L_0x0248;
                case 16: goto L_0x0005;
                case 17: goto L_0x01d2;
                case 18: goto L_0x01bd;
                case 19: goto L_0x01a5;
                case 20: goto L_0x0190;
                case 21: goto L_0x0178;
                case 22: goto L_0x016d;
                case 23: goto L_0x0160;
                case 24: goto L_0x024f;
                case 25: goto L_0x0248;
                case 26: goto L_0x0005;
                case 27: goto L_0x0150;
                case 28: goto L_0x0146;
                case 29: goto L_0x0136;
                case 30: goto L_0x011f;
                case 31: goto L_0x00fc;
                case 32: goto L_0x00ec;
                case 33: goto L_0x00dc;
                case 34: goto L_0x00d4;
                case 35: goto L_0x00cd;
                case 36: goto L_0x00bd;
                case 37: goto L_0x00b1;
                case 38: goto L_0x00aa;
                case 39: goto L_0x00aa;
                case 40: goto L_0x00aa;
                case 41: goto L_0x00aa;
                case 42: goto L_0x024f;
                case 43: goto L_0x0248;
                case 44: goto L_0x0005;
                case 45: goto L_0x0088;
                case 46: goto L_0x024f;
                case 47: goto L_0x0248;
                case 48: goto L_0x0005;
                case 49: goto L_0x0026;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r11.A01
            X.07f r3 = X.DbY.A0I(r0)
        L_0x000b:
            return r3
        L_0x000c:
            java.lang.Object r0 = r11.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "thread_v2_id"
            goto L_0x001d
        L_0x0015:
            java.lang.Object r0 = r11.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "thread_id"
        L_0x001d:
            java.lang.String r3 = r1.getString(r0)
            if (r3 != 0) goto L_0x000b
            java.lang.String r3 = ""
            return r3
        L_0x0026:
            java.lang.Object r3 = r11.A01
            X.NIZ r3 = (X.NIZ) r3
            X.0eM r2 = r3.A02
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r2)
            android.os.Bundle r1 = r3.requireArguments()
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID"
            X.3t3 r7 = X.OXL.A00(r1, r0)
            if (r7 == 0) goto L_0x0083
            android.os.Bundle r1 = r3.requireArguments()
            java.lang.String r0 = "thread_title"
            java.lang.String r8 = r1.getString(r0)
            if (r8 != 0) goto L_0x004a
            java.lang.String r8 = ""
        L_0x004a:
            android.os.Bundle r1 = r3.requireArguments()
            java.lang.String r0 = "thread_picture_image_url"
            android.os.Parcelable r5 = r1.getParcelable(r0)
            com.instagram.common.typedurl.ImageUrl r5 = (com.instagram.common.typedurl.ImageUrl) r5
            android.os.Bundle r1 = r3.requireArguments()
            java.lang.String r0 = "members_picture_image_url"
            java.util.ArrayList r9 = r1.getParcelableArrayList(r0)
            if (r9 != 0) goto L_0x0064
            X.0sn r9 = X.0sn.A00
        L_0x0064:
            android.os.Bundle r1 = r3.requireArguments()
            java.lang.String r0 = "DirectThreadDetailFragment.THREAD_SUBTYPE"
            int r1 = r1.getInt(r0)
            r0 = 47
            boolean r10 = X.AnonymousClass7TF.A1S(r1, r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            X.O7F r6 = new X.O7F
            r6.<init>(r0)
            X.NNR r3 = new X.NNR
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r3
        L_0x0083:
            java.lang.IllegalArgumentException r0 = X.C66580MXl.A0p()
            throw r0
        L_0x0088:
            java.lang.Object r1 = r11.A01
            X.GzR r1 = (X.C54096GzR) r1
            X.0eM r0 = r1.A01
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            android.os.Bundle r1 = r1.requireArguments()
            java.lang.String r0 = "selected_emoji_item"
            android.os.Parcelable r1 = r1.getParcelable(r0)
            boolean r0 = r1 instanceof com.instagram.direct.fragment.thread.threaddetail.customization.ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem
            if (r0 == 0) goto L_0x00a8
            com.instagram.direct.fragment.thread.threaddetail.customization.ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem r1 = (com.instagram.direct.fragment.thread.threaddetail.customization.ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem) r1
        L_0x00a2:
            X.Ols r3 = new X.Ols
            r3.<init>(r2, r1)
            return r3
        L_0x00a8:
            r1 = 0
            goto L_0x00a2
        L_0x00aa:
            java.lang.Object r0 = r11.A01
            X.DbS.A1U(r0)
            goto L_0x0133
        L_0x00b1:
            java.lang.Object r1 = r11.A01
            X.5Oz r1 = (X.C284945Oz) r1
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            r1.Epw(r0)
            goto L_0x0133
        L_0x00bd:
            java.lang.Object r0 = r11.A01
            X.NJl r0 = (X.C68473NJl) r0
            X.0eM r0 = r0.A0I
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.NMb r3 = new X.NMb
            r3.<init>(r0)
            return r3
        L_0x00cd:
            java.lang.Object r0 = r11.A01
            X.07f r3 = X.C51971G9r.A0U(r0)
            return r3
        L_0x00d4:
            java.lang.Object r0 = r11.A01
            X.NJl r0 = (X.C68473NJl) r0
            X.0eM r0 = r0.A0I
            goto L_0x0222
        L_0x00dc:
            java.lang.Object r0 = r11.A01
            X.NJl r0 = (X.C68473NJl) r0
            X.0eM r0 = r0.A0I
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.OBy r3 = new X.OBy
            r3.<init>(r0)
            return r3
        L_0x00ec:
            java.lang.Object r1 = r11.A01
            X.NJY r1 = (X.NJY) r1
            X.0eM r0 = r1.A14
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.ODj r3 = new X.ODj
            r3.<init>(r1, r0)
            return r3
        L_0x00fc:
            java.lang.Object r0 = r11.A01
            X.NJY r0 = (X.NJY) r0
            X.4gS r2 = r0.A0W
            if (r2 == 0) goto L_0x0133
            X.N4P r0 = r0.A0Z
            if (r0 == 0) goto L_0x011b
            X.3t3 r0 = r0.A0L
            if (r0 == 0) goto L_0x011b
            X.3t0 r0 = X.C300965yF.A02(r0)
            if (r0 == 0) goto L_0x011b
            java.lang.String r1 = r0.A00
            if (r1 == 0) goto L_0x011b
            java.util.Set r0 = r2.A02
            r0.add(r1)
        L_0x011b:
            r0 = 0
            r2.A01 = r0
            goto L_0x0133
        L_0x011f:
            X.1pC r3 = X.C69997Nvb.A00()
            java.lang.Object r2 = r11.A01
            X.NJY r2 = (X.NJY) r2
            android.content.Context r1 = r2.requireContext()
            r2.A0N()
            java.lang.String r0 = "all"
            r3.A00(r1, r2, r0)
        L_0x0133:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x0136:
            java.lang.Object r0 = r11.A01
            X.NJY r0 = (X.NJY) r0
            X.0eM r0 = r0.A14
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.7ZW r3 = new X.7ZW
            r3.<init>(r0)
            return r3
        L_0x0146:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Oxr r3 = new X.Oxr
            r3.<init>(r0)
            return r3
        L_0x0150:
            java.lang.Object r0 = r11.A01
            X.NKG r0 = (X.NKG) r0
            X.0eM r0 = r0.A04
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.NMg r3 = new X.NMg
            r3.<init>(r0)
            return r3
        L_0x0160:
            X.MYc r2 = X.C66594MYg.A03
            java.lang.Object r1 = r11.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.61K r0 = X.AnonymousClass61K.DIRECT_THREAD
            X.MYg r3 = r2.A02(r1, r0)
            return r3
        L_0x016d:
            java.lang.Object r0 = r11.A01
            X.FV3 r0 = (X.FV3) r0
            com.instagram.common.session.UserSession r0 = r0.A04
            X.2Dm r3 = X.2L2.A00(r0)
            return r3
        L_0x0178:
            java.lang.Object r0 = r11.A01
            X.OHm r0 = (X.C70717OHm) r0
            android.view.View r1 = r0.A03
            r0 = 2131443491(0x7f0b3f23, float:1.8509052E38)
            android.view.ViewStub r1 = X.DbS.A0F(r1, r0)
            r0 = 2131625027(0x7f0e0443, float:1.887725E38)
            android.view.View r3 = X.JTP.A0H(r1, r0)
            X.C66580MXl.A1R(r3)
            return r3
        L_0x0190:
            java.lang.Object r0 = r11.A01
            X.OHm r0 = (X.C70717OHm) r0
            android.view.LayoutInflater r3 = r0.A02
            r2 = 2131625026(0x7f0e0442, float:1.8877248E38)
            X.0eM r0 = r0.A07
            android.view.ViewGroup r1 = X.C66583MXo.A0C(r0)
            r0 = 0
            android.view.View r3 = X.DbW.A09(r3, r1, r2, r0)
            return r3
        L_0x01a5:
            java.lang.Object r0 = r11.A01
            X.OGs r0 = (X.C70697OGs) r0
            android.view.View r1 = r0.A02
            r0 = 2131434829(0x7f0b1d4d, float:1.8491483E38)
            android.view.ViewStub r1 = X.DbS.A0F(r1, r0)
            r0 = 2131624987(0x7f0e041b, float:1.887717E38)
            android.view.View r3 = X.JTP.A0H(r1, r0)
            X.C66580MXl.A1R(r3)
            return r3
        L_0x01bd:
            java.lang.Object r0 = r11.A01
            X.OGs r0 = (X.C70697OGs) r0
            android.view.LayoutInflater r3 = r0.A01
            r2 = 2131624977(0x7f0e0411, float:1.8877149E38)
            X.0eM r0 = r0.A05
            android.view.ViewGroup r1 = X.C66583MXo.A0C(r0)
            r0 = 0
            android.view.View r3 = X.DbW.A09(r3, r1, r2, r0)
            return r3
        L_0x01d2:
            java.lang.Object r3 = r11.A01
            X.E3m r3 = (X.C47464E3m) r3
            X.0eM r0 = r3.A07
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r3.A02
            java.lang.String r1 = X.DbS.A0t(r0)
            X.0eM r0 = r3.A06
            java.lang.Object r0 = r0.getValue()
            X.9s1 r0 = (X.C390899s1) r0
            X.EFB r3 = new X.EFB
            r3.<init>(r2, r0, r1)
            return r3
        L_0x01f0:
            java.lang.Object r0 = r11.A01
            X.E3m r0 = (X.C47464E3m) r0
            X.0eM r0 = r0.A07
            X.1Ng r3 = X.DbX.A0R(r0)
            return r3
        L_0x01fb:
            java.lang.Object r0 = r11.A01
            X.E3m r0 = (X.C47464E3m) r0
            X.0eM r0 = r0.A07
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.Oy7 r3 = X.O14.A00(r0)
            return r3
        L_0x020a:
            java.lang.Object r0 = r11.A01
            X.E3m r0 = (X.C47464E3m) r0
            X.0eM r0 = r0.A07
            goto L_0x0222
        L_0x0211:
            java.lang.Object r0 = r11.A01
            X.E3f r0 = (X.C47458E3f) r0
            X.0eM r0 = r0.A06
            X.1Ng r3 = X.DbX.A0R(r0)
            return r3
        L_0x021c:
            java.lang.Object r0 = r11.A01
            X.E3f r0 = (X.C47458E3f) r0
            X.0eM r0 = r0.A06
        L_0x0222:
            X.6gx r3 = X.C66583MXo.A0P(r0)
            return r3
        L_0x0227:
            java.lang.Object r0 = r11.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "audience_type"
            java.lang.Integer r3 = X.DbV.A0o(r1, r0)
            return r3
        L_0x0234:
            java.lang.Object r0 = r11.A01
            X.E3d r0 = (X.C47456E3d) r0
            X.0eM r0 = r0.A00
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.9s1 r1 = X.C390899s1.BROADCAST_CHANNEL
            java.lang.String r0 = ""
            X.EFB r3 = new X.EFB
            r3.<init>(r2, r1, r0)
            return r3
        L_0x0248:
            java.lang.Object r0 = r11.A01
            java.lang.Object r3 = X.DbT.A0r(r0)
            return r3
        L_0x024f:
            java.lang.Object r3 = r11.A01
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73902Pld.invoke():java.lang.Object");
    }
}
