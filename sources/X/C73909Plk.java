package X;

/* renamed from: X.Plk  reason: case insensitive filesystem */
public final class C73909Plk extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73909Plk(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static 0t0 A00(Object obj, int i) {
        return AnonymousClass0eN.A01(new C73909Plk(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        if (r0 == false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a1, code lost:
        if (X.AnonymousClass05K.A01 == ((com.instagram.direct.messagethread.collections.model.DirectCollectionArguments) ((X.H1O) r2.A01).A0I.getValue()).A03) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a3, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a8, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d3, code lost:
        if (r1.A04 == null) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d5, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02e3, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r16 = this;
            r2 = r16
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x003c;
                case 1: goto L_0x0054;
                case 2: goto L_0x0071;
                case 3: goto L_0x00a9;
                case 4: goto L_0x0091;
                case 5: goto L_0x00d7;
                case 6: goto L_0x00ed;
                case 7: goto L_0x0103;
                case 8: goto L_0x010c;
                case 9: goto L_0x011f;
                case 10: goto L_0x014a;
                case 11: goto L_0x0155;
                case 12: goto L_0x016d;
                case 13: goto L_0x0182;
                case 14: goto L_0x01cc;
                case 15: goto L_0x01df;
                case 16: goto L_0x01ec;
                case 17: goto L_0x0202;
                case 18: goto L_0x020f;
                case 19: goto L_0x022a;
                case 20: goto L_0x0233;
                case 21: goto L_0x023e;
                case 22: goto L_0x0039;
                case 23: goto L_0x024f;
                case 24: goto L_0x0267;
                case 25: goto L_0x0017;
                case 26: goto L_0x0273;
                case 27: goto L_0x027f;
                case 28: goto L_0x0286;
                case 29: goto L_0x0296;
                case 30: goto L_0x027f;
                case 31: goto L_0x02a6;
                case 32: goto L_0x02be;
                case 33: goto L_0x02d6;
                case 34: goto L_0x02e4;
                case 35: goto L_0x02f1;
                case 36: goto L_0x02fb;
                case 37: goto L_0x0307;
                case 38: goto L_0x0312;
                case 39: goto L_0x0007;
                case 40: goto L_0x0007;
                case 41: goto L_0x0328;
                case 42: goto L_0x033a;
                case 43: goto L_0x0345;
                case 44: goto L_0x0350;
                case 45: goto L_0x036f;
                case 46: goto L_0x037a;
                case 47: goto L_0x0385;
                case 48: goto L_0x0390;
                case 49: goto L_0x03b9;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r2.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131432020(0x7f0b1254, float:1.8485786E38)
            X.3oV r0 = X.DbU.A0Z(r1, r0)
            android.view.View r4 = r0.getView()
        L_0x0016:
            return r4
        L_0x0017:
            java.lang.Object r2 = r2.A01
            r0 = 6
            boolean r0 = X.C376649Iu.A00(r0, r2)
            r4 = 0
            if (r0 != 0) goto L_0x0016
            boolean r0 = r2 instanceof X.AnonymousClass77X
            if (r0 == 0) goto L_0x03ee
            X.77X r2 = (X.AnonymousClass77X) r2
            java.lang.String r0 = r2.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0016
            r0 = 2131238689(0x7f081f21, float:1.8093664E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x0039:
            java.lang.Object r4 = r2.A01
            return r4
        L_0x003c:
            X.Nip[] r3 = X.C69289Nip.values()
            java.lang.Object r0 = r2.A01
            android.os.Bundle r2 = X.DbS.A0B(r0)
            r0 = 434(0x1b2, float:6.08E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -1
            int r0 = r2.getInt(r1, r0)
            r4 = r3[r0]
            return r4
        L_0x0054:
            java.lang.Object r3 = r2.A01
            X.H1O r3 = (X.H1O) r3
            X.0eM r2 = r3.A0L
            java.lang.Object r1 = r2.getValue()
            X.Nip r0 = X.C69289Nip.NUX
            if (r1 == r0) goto L_0x006a
            java.lang.Object r1 = r2.getValue()
            X.Nip r0 = X.C69289Nip.INLINE_NUX
            if (r1 != r0) goto L_0x00d5
        L_0x006a:
            X.0eM r0 = r3.A0P
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            goto L_0x008e
        L_0x0071:
            java.lang.Object r1 = r2.A01
            X.H1O r1 = (X.H1O) r1
            X.0eM r0 = r1.A0P
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 != 0) goto L_0x00d5
            X.0eM r0 = r1.A0V
            X.0lg r3 = X.DbT.A0X(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325476179915751(0x810dd4000033e7, double:3.0357156349062185E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
        L_0x008e:
            if (r0 == 0) goto L_0x00d5
            goto L_0x00a3
        L_0x0091:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            java.lang.Object r0 = r2.A01
            X.H1O r0 = (X.H1O) r0
            X.0eM r0 = r0.A0I
            java.lang.Object r0 = r0.getValue()
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = (com.instagram.direct.messagethread.collections.model.DirectCollectionArguments) r0
            java.lang.Integer r0 = r0.A03
            if (r1 != r0) goto L_0x00d5
        L_0x00a3:
            r0 = 1
        L_0x00a4:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x00a9:
            java.lang.Object r0 = r2.A01
            X.H1O r0 = (X.H1O) r0
            X.0eM r2 = r0.A0I
            java.lang.Object r0 = r2.getValue()
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = (com.instagram.direct.messagethread.collections.model.DirectCollectionArguments) r0
            java.lang.Integer r1 = r0.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x00c7
            java.lang.Object r0 = r2.getValue()
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = (com.instagram.direct.messagethread.collections.model.DirectCollectionArguments) r0
            java.lang.Integer r1 = r0.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x00d5
        L_0x00c7:
            java.lang.Object r1 = r2.getValue()
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r1 = (com.instagram.direct.messagethread.collections.model.DirectCollectionArguments) r1
            java.lang.String r0 = r1.A05
            if (r0 != 0) goto L_0x00d5
            java.lang.String r0 = r1.A04
            if (r0 == 0) goto L_0x00a3
        L_0x00d5:
            r0 = 0
            goto L_0x00a4
        L_0x00d7:
            java.lang.Object r0 = r2.A01
            X.H1O r0 = (X.H1O) r0
            X.0eM r0 = r0.A0V
            X.0lg r3 = X.DbT.A0X(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320940694643677(0x8109b4000323dd, double:3.0328473757572256E-306)
            java.lang.Boolean r4 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            return r4
        L_0x00ed:
            java.lang.Object r0 = r2.A01
            X.H1O r0 = (X.H1O) r0
            X.0eM r0 = r0.A0V
            X.0lg r3 = X.DbT.A0X(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320940694709214(0x8109b4000423de, double:3.0328473757986714E-306)
            java.lang.Boolean r4 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            return r4
        L_0x0103:
            java.lang.Object r2 = r2.A01
            r1 = 1
            r0 = 0
            X.3E5 r4 = X.AnonymousClass3E4.A01(r2, r0, r1)
            return r4
        L_0x010c:
            java.lang.Object r0 = r2.A01
            X.H1O r0 = (X.H1O) r0
            X.0eM r0 = r0.A0V
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            boolean r0 = X.I31.A01(r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x011f:
            java.lang.Object r1 = r2.A01
            X.H1O r1 = (X.H1O) r1
            X.0eM r0 = r1.A0V
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            android.content.Context r3 = r1.requireContext()
            android.content.Context r2 = r1.requireContext()
            X.0gy r1 = X.AnonymousClass07i.A00(r1)
            r0 = 0
            X.2lw r5 = new X.2lw
            r5.<init>(r2, r1, r0)
            r0 = 705(0x2c1, float:9.88E-43)
            java.lang.String r6 = X.C273654mx.A00(r0)
            r8 = 0
            r7 = r6
            r9 = r8
            r10 = r8
            X.7eL r4 = X.C67562Mpw.A06(r3, r4, r5, r6, r7, r8, r9, r10)
            return r4
        L_0x014a:
            java.lang.Object r0 = r2.A01
            X.H1O r0 = (X.H1O) r0
            android.view.ViewGroup r0 = r0.A03
            X.C66581MXm.A19(r0)
            goto L_0x02e1
        L_0x0155:
            java.lang.Object r3 = r2.A01
            X.H1O r3 = (X.H1O) r3
            java.lang.Integer r0 = r3.A09
            if (r0 == 0) goto L_0x0168
            int r0 = r0.intValue()
            float r2 = (float) r0
            r1 = 0
            X.Iqy r0 = X.C58379Iqy.A00
            X.H1O.A07(r3, r0, r1, r2)
        L_0x0168:
            java.lang.Boolean r4 = X.AnonymousClass7TE.A0u()
            return r4
        L_0x016d:
            java.lang.Object r3 = r2.A01
            X.H1O r3 = (X.H1O) r3
            java.lang.Integer r0 = r3.A09
            if (r0 == 0) goto L_0x02e1
            int r0 = r0.intValue()
            float r2 = (float) r0
            r1 = 0
            X.Iqy r0 = X.C58379Iqy.A00
            X.H1O.A07(r3, r0, r1, r2)
            goto L_0x02e1
        L_0x0182:
            java.lang.Object r5 = r2.A01
            X.H1P r5 = (X.H1P) r5
            java.lang.String r12 = r5.A0E
            com.instagram.common.session.UserSession r6 = r5.A0A()
            X.HiN r9 = r5.A0C
            X.HiM r8 = r5.A0B
            X.HiL r7 = r5.A0A
            X.2ms r10 = r5.A0D
            boolean r13 = X.H1P.A09(r5)
            X.0eM r0 = r5.A0G
            java.lang.Object r0 = r0.getValue()
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = (com.instagram.direct.messagethread.collections.model.DirectCollectionArguments) r0
            java.lang.Integer r11 = r0.A03
            X.0eM r0 = r5.A0K
            java.lang.Object r2 = r0.getValue()
            X.1Xj r2 = (X.1Xj) r2
            android.os.Bundle r1 = r5.requireArguments()
            r0 = 225(0xe1, float:3.15E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r1 = r1.getInt(r0)
            com.instagram.common.session.UserSession r0 = r5.A0A()
            boolean r14 = X.I7Q.A09(r0, r2, r1)
            X.0eM r0 = r5.A0H
            boolean r15 = X.AnonymousClass7TF.A1Z(r0)
            X.HrA r4 = new X.HrA
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r4
        L_0x01cc:
            java.lang.Object r0 = r2.A01
            android.os.Bundle r2 = X.DbS.A0B(r0)
            java.lang.Class<com.instagram.direct.messagethread.collections.model.DirectCollectionArguments> r1 = com.instagram.direct.messagethread.collections.model.DirectCollectionArguments.class
            r0 = 280(0x118, float:3.92E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r4 = X.C320236s2.A00(r2, r1, r0)
            return r4
        L_0x01df:
            java.lang.Object r0 = r2.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "DirectSaveToCollectionFragment_show_my_favs_upsell"
            java.lang.Boolean r4 = X.DbU.A0g(r1, r0)
            return r4
        L_0x01ec:
            java.lang.Object r2 = r2.A01
            X.H1P r2 = (X.H1P) r2
            com.instagram.common.session.UserSession r1 = r2.A0A()
            X.0eM r0 = r2.A0G
            java.lang.Object r0 = r0.getValue()
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = (com.instagram.direct.messagethread.collections.model.DirectCollectionArguments) r0
            X.I0f r4 = new X.I0f
            r4.<init>(r1, r0, r2)
            return r4
        L_0x0202:
            java.lang.Object r0 = r2.A01
            X.H1P r0 = (X.H1P) r0
            com.instagram.common.session.UserSession r0 = r0.A0A()
            X.1E8 r4 = X.1E7.A00(r0)
            return r4
        L_0x020f:
            java.lang.Object r2 = r2.A01
            X.H1P r2 = (X.H1P) r2
            X.0eM r0 = r2.A0J
            java.lang.Object r1 = r0.getValue()
            X.1E8 r1 = (X.1E8) r1
            X.0eM r0 = r2.A0G
            java.lang.Object r0 = r0.getValue()
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = (com.instagram.direct.messagethread.collections.model.DirectCollectionArguments) r0
            java.lang.String r0 = r0.A05
            X.1Xj r4 = r1.A02(r0)
            return r4
        L_0x022a:
            java.lang.Object r1 = r2.A01
            r0 = 0
            X.IXB r4 = new X.IXB
            r4.<init>(r1, r0)
            return r4
        L_0x0233:
            java.lang.Object r0 = r2.A01
            android.os.Bundle r0 = X.DbS.A0B(r0)
            java.lang.String r4 = X.C228022kf.A00(r0)
            return r4
        L_0x023e:
            java.lang.Object r0 = r2.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            r0 = 2215(0x8a7, float:3.104E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.Boolean r4 = X.DbU.A0g(r1, r0)
            return r4
        L_0x024f:
            java.lang.Object r3 = r2.A01
            X.P8o r3 = (X.C72505P8o) r3
            X.4DH r2 = r3.A01
            r0 = 23
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0xG r1 = X.DbS.A0O(r0)
            com.instagram.common.session.UserSession r0 = r3.A02
            X.30t r4 = new X.30t
            r4.<init>(r2, r1, r0)
            return r4
        L_0x0267:
            java.lang.Object r0 = r2.A01
            X.P9E r0 = (X.P9E) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.7I3 r4 = new X.7I3
            r4.<init>(r0)
            return r4
        L_0x0273:
            java.lang.Object r0 = r2.A01
            X.PB4 r0 = (X.PB4) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.7I3 r4 = new X.7I3
            r4.<init>(r0)
            return r4
        L_0x027f:
            java.lang.Object r0 = r2.A01
            java.lang.String r4 = r0.toString()
            return r4
        L_0x0286:
            java.lang.Object r0 = r2.A01
            X.PBi r0 = (X.C72577PBi) r0
            X.3oV r0 = r0.A05
            android.view.View r0 = r0.getView()
            X.OFC r4 = new X.OFC
            r4.<init>(r0)
            return r4
        L_0x0296:
            java.lang.Object r0 = r2.A01
            X.PBi r0 = (X.C72577PBi) r0
            X.3oV r0 = r0.A06
            android.view.View r0 = r0.getView()
            X.OG3 r4 = new X.OG3
            r4.<init>(r0)
            return r4
        L_0x02a6:
            java.lang.Object r3 = r2.A01
            X.NYX r3 = (X.NYX) r3
            X.7FT r0 = r3.A01
            com.instagram.model.direct.messageid.MessageIdentifier r0 = r0.A06
            java.lang.String r2 = r0.A01
            java.lang.String r1 = r0.A00()
            X.2FW r0 = r3.Aqm()
            com.instagram.model.direct.messageid.DirectMessageIdentifier r4 = new com.instagram.model.direct.messageid.DirectMessageIdentifier
            r4.<init>(r0, r2, r1)
            return r4
        L_0x02be:
            java.lang.Object r3 = r2.A01
            X.7Fu r3 = (X.C328697Fu) r3
            X.7FT r0 = r3.A04
            com.instagram.model.direct.messageid.MessageIdentifier r0 = r0.A06
            java.lang.String r2 = r0.A01
            java.lang.String r1 = r0.A00()
            X.2FW r0 = r3.Aqm()
            com.instagram.model.direct.messageid.DirectMessageIdentifier r4 = new com.instagram.model.direct.messageid.DirectMessageIdentifier
            r4.<init>(r0, r2, r1)
            return r4
        L_0x02d6:
            java.lang.Object r1 = r2.A01
            X.7ZY r1 = (X.AnonymousClass7ZY) r1
            r1.CxS()
            r0 = 0
            r1.CzI(r0)
        L_0x02e1:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x02e4:
            java.lang.Object r0 = r2.A01
            X.OG4 r0 = (X.OG4) r0
            androidx.fragment.app.FragmentActivity r1 = r0.A00
            com.instagram.common.session.UserSession r0 = r0.A03
            X.6Yo r4 = X.DbS.A0M(r1, r0)
            return r4
        L_0x02f1:
            java.lang.Object r0 = r2.A01
            X.P9e r0 = (X.C72521P9e) r0
            X.O7e r4 = new X.O7e
            r4.<init>(r0)
            return r4
        L_0x02fb:
            java.lang.Object r0 = r2.A01
            X.P9S r0 = (X.P9S) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.7I3 r4 = new X.7I3
            r4.<init>(r0)
            return r4
        L_0x0307:
            java.lang.Object r0 = r2.A01
            X.P9S r0 = (X.P9S) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.6gx r4 = X.C313746gw.A00(r0)
            return r4
        L_0x0312:
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            java.lang.Object r0 = r2.A01
            X.PBe r0 = (X.C72573PBe) r0
            X.3oV r0 = r0.A02
            android.view.View r1 = r0.getView()
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.NXm r4 = new X.NXm
            r4.<init>(r1)
            return r4
        L_0x0328:
            java.lang.Object r0 = r2.A01
            X.P9G r0 = (X.P9G) r0
            X.4DH r3 = r0.A01
            com.instagram.common.session.UserSession r2 = r0.A03
            X.0eK r1 = r0.A08
            X.7SM r0 = r0.A04
            X.P9I r4 = new X.P9I
            r4.<init>(r3, r2, r0, r1)
            return r4
        L_0x033a:
            java.lang.Object r0 = r2.A01
            X.P9G r0 = (X.P9G) r0
            X.0eK r0 = r0.A09
            java.lang.Object r4 = r0.get()
            return r4
        L_0x0345:
            java.lang.Object r0 = r2.A01
            X.P9G r0 = (X.P9G) r0
            X.0eK r0 = r0.A0E
            java.lang.Object r4 = X.C66580MXl.A0s(r0)
            return r4
        L_0x0350:
            java.lang.Object r1 = r2.A01
            X.P9G r1 = (X.P9G) r1
            X.4DH r5 = r1.A01
            com.instagram.common.session.UserSession r6 = r1.A03
            X.7Ug r9 = r1.A06
            r0 = 43
            X.Plk r12 = new X.Plk
            r12.<init>(r1, r0)
            X.7SM r7 = r1.A04
            X.0eK r10 = r1.A08
            X.0eK r11 = r1.A0D
            X.OT9 r8 = r1.A05
            X.P9K r4 = new X.P9K
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r4
        L_0x036f:
            java.lang.Object r0 = r2.A01
            X.P9G r0 = (X.P9G) r0
            X.0eK r0 = r0.A08
            java.lang.Object r4 = r0.get()
            return r4
        L_0x037a:
            java.lang.Object r0 = r2.A01
            X.P9G r0 = (X.P9G) r0
            X.0eK r0 = r0.A0B
            java.lang.Object r4 = X.C66580MXl.A0s(r0)
            return r4
        L_0x0385:
            java.lang.Object r0 = r2.A01
            X.P9G r0 = (X.P9G) r0
            X.0eK r0 = r0.A0A
            java.lang.Object r4 = X.C66580MXl.A0s(r0)
            return r4
        L_0x0390:
            java.lang.Object r1 = r2.A01
            X.P9G r1 = (X.P9G) r1
            com.instagram.common.session.UserSession r8 = r1.A03
            androidx.fragment.app.FragmentActivity r5 = r1.A00
            X.4DH r6 = r1.A01
            X.0iw r7 = r1.A02
            X.4mZ r9 = r1.A07
            r0 = 45
            X.Plk r10 = new X.Plk
            r10.<init>(r1, r0)
            r0 = 46
            X.Plk r11 = new X.Plk
            r11.<init>(r1, r0)
            r0 = 47
            X.Plk r12 = new X.Plk
            r12.<init>(r1, r0)
            X.Fb9 r4 = new X.Fb9
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r4
        L_0x03b9:
            java.lang.Object r5 = r2.A01
            X.OWC r5 = (X.OWC) r5
            com.instagram.common.session.UserSession r4 = r5.A01
            r3 = 0
            X.0Tu r2 = X.DbS.A0J(r4, r3)
            r0 = 36328813369835114(0x8110dd00053e6a, double:3.037826087249009E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x03d9
            X.3oV r0 = r5.A0A
            X.C66580MXl.A1Q(r0, r3)
            android.view.View r4 = r0.getView()
            return r4
        L_0x03d9:
            X.3oV r0 = r5.A0B
            X.C66580MXl.A1Q(r0, r3)
            r0.getView()
            android.view.View r1 = r5.A00
            r0 = 2131435878(0x7f0b2166, float:1.849361E38)
            android.view.View r4 = r1.requireViewById(r0)
            X.0qQ.A0A(r4)
            return r4
        L_0x03ee:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Invalid messageContent: "
            java.lang.IllegalStateException r0 = X.C66582MXn.A0k(r2, r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73909Plk.invoke():java.lang.Object");
    }
}
