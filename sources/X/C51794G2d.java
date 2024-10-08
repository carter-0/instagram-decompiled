package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

/* renamed from: X.G2d  reason: case insensitive filesystem */
public final class C51794G2d extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51794G2d(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static PendingRecipient A00(E3K e3k) {
        ImageUrl imageUrl = PendingRecipient.A0g;
        return new PendingRecipient(AnonymousClass0t1.A01.A01(e3k.A07()));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x015a, code lost:
        r3 = new X.C51647Fy6((java.lang.Object) r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x015f, code lost:
        X.AnonymousClass7TE.A1Z(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0180, code lost:
        r2.Epw(java.lang.Boolean.valueOf(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0218, code lost:
        r1.A03(r2, r3, r4, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0233, code lost:
        r0 = r0.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0235, code lost:
        if (r0 == null) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0237, code lost:
        r1 = r0.length();
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x023c, code lost:
        if (r1 != 0) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x023e, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x023f, code lost:
        r3 = new X.E3K();
        r1 = X.AnonymousClass7TE.A0a();
        r1.putBoolean("argument_show_remove_picture_option", !r0);
        r3.setArguments(r1);
        r3.A00 = new X.C49375Eud(r4);
        r2 = X.DbS.A0W(r4.A02);
        r2.A0a = X.AnonymousClass7TE.A0u();
        r1 = r4.A01;
        r2.A06 = r1.getColor(com.instagram.android.R.color.grey_9);
        X.FmG.A00(r2, r4, 7).A03(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x02b2, code lost:
        X.C49049EoT.A00(r1, r2, r3, X.AnonymousClass000.A00(r0), r5, r6, r7);
        X.DbT.A1J(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0389, code lost:
        r0 = r6.getContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x03f4, code lost:
        r1.A0C(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0403;
                case 1: goto L_0x040a;
                case 2: goto L_0x0411;
                case 3: goto L_0x0007;
                case 4: goto L_0x0425;
                case 5: goto L_0x000f;
                case 6: goto L_0x0041;
                case 7: goto L_0x004a;
                case 8: goto L_0x0053;
                case 9: goto L_0x0088;
                case 10: goto L_0x03f9;
                case 11: goto L_0x0007;
                case 12: goto L_0x00bc;
                case 13: goto L_0x0007;
                case 14: goto L_0x00c5;
                case 15: goto L_0x017b;
                case 16: goto L_0x00cc;
                case 17: goto L_0x00ea;
                case 18: goto L_0x0104;
                case 19: goto L_0x014a;
                case 20: goto L_0x0164;
                case 21: goto L_0x0400;
                case 22: goto L_0x0403;
                case 23: goto L_0x040a;
                case 24: goto L_0x0445;
                case 25: goto L_0x017b;
                case 26: goto L_0x0007;
                case 27: goto L_0x0189;
                case 28: goto L_0x01a4;
                case 29: goto L_0x0201;
                case 30: goto L_0x021d;
                case 31: goto L_0x027a;
                case 32: goto L_0x0299;
                case 33: goto L_0x02be;
                case 34: goto L_0x02c9;
                case 35: goto L_0x02e0;
                case 36: goto L_0x033a;
                case 37: goto L_0x0390;
                case 38: goto L_0x027a;
                case 39: goto L_0x0400;
                case 40: goto L_0x0403;
                case 41: goto L_0x040a;
                case 42: goto L_0x0459;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A01
            X.DbS.A1U(r0)
        L_0x000c:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x000f:
            java.lang.Object r5 = r1.A01
            X.DlJ r5 = (X.C46789DlJ) r5
            r4 = 0
            X.05G r3 = r5.A05
        L_0x0016:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.Dry r1 = (X.C47183Dry) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.Dry r0 = X.C47183Dry.A00((X.C61052Jvq) null, (com.instagram.opal.impl.data.OpalProfileData) null, (com.instagram.opal.impl.data.OpalProfileData) null, (X.C62520KhB) null, r1, r0, 0, 1791, false, false)
            boolean r0 = r3.AIY(r2, r0)
            if (r0 == 0) goto L_0x0016
            com.instagram.common.session.UserSession r3 = r5.A01
            X.0xa r0 = X.AnonymousClass7TE.A0q(r3)
            java.lang.String r2 = "opal_profile_tease_animation_count"
            int r1 = r0.getInt(r2, r4)
            X.1Av r0 = X.1Au.A00(r3)
            int r1 = r1 + 1
            X.0xa r0 = r0.A01
            X.AnonymousClass7TG.A1M(r0, r2, r1)
            goto L_0x000c
        L_0x0041:
            java.lang.Object r1 = r1.A01
            X.DlJ r1 = (X.C46789DlJ) r1
            r0 = 0
            r1.A07(r0)
            goto L_0x000c
        L_0x004a:
            java.lang.Object r2 = r1.A01
            X.5Oz r2 = (X.C284945Oz) r2
            r1 = 0
            X.62O r0 = X.I7S.A00
            goto L_0x0180
        L_0x0053:
            java.lang.Object r5 = r1.A01
            X.DlJ r5 = (X.C46789DlJ) r5
            r4 = 0
            X.05G r3 = r5.A05
        L_0x005a:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.Dry r1 = (X.C47183Dry) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.Dry r0 = X.C47183Dry.A00((X.C61052Jvq) null, (com.instagram.opal.impl.data.OpalProfileData) null, (com.instagram.opal.impl.data.OpalProfileData) null, (X.C62520KhB) null, r1, r0, 0, 1791, false, false)
            boolean r0 = r3.AIY(r2, r0)
            if (r0 == 0) goto L_0x005a
            com.instagram.common.session.UserSession r3 = r5.A01
            X.0xa r0 = X.AnonymousClass7TE.A0q(r3)
            java.lang.String r2 = "opal_delight_animation_count"
            int r1 = r0.getInt(r2, r4)
            X.1Av r0 = X.1Au.A00(r3)
            int r1 = r1 + 1
            X.0xa r0 = r0.A01
            X.AnonymousClass7TG.A1M(r0, r2, r1)
            X.C46789DlJ.A00(r5)
            goto L_0x000c
        L_0x0088:
            java.lang.Object r6 = r1.A01
            X.DlJ r6 = (X.C46789DlJ) r6
            java.lang.String r5 = r6.A00
            if (r5 == 0) goto L_0x000c
            X.05G r2 = r6.A05
        L_0x0092:
            java.lang.Object r1 = r2.getValue()
            r11 = r1
            X.Dry r11 = (X.C47183Dry) r11
            r7 = 0
            r13 = 0
            X.KhB r10 = X.C62520KhB.Loading
            r14 = 1023(0x3ff, float:1.434E-42)
            r8 = r7
            r9 = r7
            r12 = r7
            r15 = r13
            r16 = r13
            X.Dry r0 = X.C47183Dry.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0092
            X.6oS r4 = X.C318116oQ.A00(r6)
            r0 = 12
            X.MFV r3 = new X.MFV
            r3.<init>(r6, r5, r7, r0)
            goto L_0x015f
        L_0x00bc:
            java.lang.Object r0 = r1.A01
            android.app.Activity r0 = (android.app.Activity) r0
            X.0nA.A0J(r0)
            goto L_0x000c
        L_0x00c5:
            java.lang.Object r2 = r1.A01
            X.5Oz r2 = (X.C284945Oz) r2
            r1 = 1
            goto L_0x0180
        L_0x00cc:
            java.lang.Object r0 = r1.A01
            X.EO1 r0 = (X.EO1) r0
            X.Ezt r4 = r0.A00
            if (r4 == 0) goto L_0x000c
            X.0eM r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.Dkj r0 = (X.C46756Dkj) r0
            X.0Ud r0 = r0.A05
            java.lang.Object r0 = r0.getValue()
            X.JwM r0 = (X.C61084JwM) r0
            java.lang.Object r0 = r0.A01
            com.instagram.opal.impl.data.OpalProfileData r0 = (com.instagram.opal.impl.data.OpalProfileData) r0
            goto L_0x0233
        L_0x00ea:
            X.2dY r2 = X.2dZ.A0t
            java.lang.Object r1 = r1.A01
            X.EO1 r1 = (X.EO1) r1
            androidx.fragment.app.FragmentActivity r0 = r1.requireActivity()
            X.Dba.A0n(r0, r2)
            X.0eM r0 = r1.A02
            X.2YL r2 = X.DbS.A0H(r0)
            X.6oS r4 = X.C318116oQ.A00(r2)
            r1 = 0
            r0 = 3
            goto L_0x015a
        L_0x0104:
            java.lang.Object r0 = r1.A01
            X.EO1 r0 = (X.EO1) r0
            X.0eM r0 = r0.A02
            java.lang.Object r5 = r0.getValue()
            X.Dkj r5 = (X.C46756Dkj) r5
            X.05G r4 = r5.A04
        L_0x0112:
            java.lang.Object r3 = r4.getValue()
            r2 = r3
            X.JwM r2 = (X.C61084JwM) r2
            r7 = 0
            java.lang.Object r6 = r2.A01
            com.instagram.opal.impl.data.OpalProfileData r6 = (com.instagram.opal.impl.data.OpalProfileData) r6
            com.instagram.user.model.User r1 = r5.A03
            java.lang.String r10 = r1.getFullName()
            java.lang.String r0 = ""
            if (r10 != 0) goto L_0x0129
            r10 = r0
        L_0x0129:
            java.lang.String r12 = r1.A0O()
            if (r12 != 0) goto L_0x0130
            r12 = r0
        L_0x0130:
            java.lang.String r11 = X.DbU.A0p(r1)
            r14 = 0
            r16 = 1
            r15 = 7959(0x1f17, float:1.1153E-41)
            r8 = r7
            r9 = r7
            r13 = r7
            r17 = r14
            com.instagram.opal.impl.data.OpalProfileData r0 = com.instagram.opal.impl.data.OpalProfileData.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r0 = X.Dbb.A1X(r2, r0, r3, r4)
            if (r0 == 0) goto L_0x0112
            goto L_0x000c
        L_0x014a:
            java.lang.Object r0 = r1.A01
            X.EO1 r0 = (X.EO1) r0
            X.0eM r0 = r0.A02
            X.2YL r2 = X.DbS.A0H(r0)
            X.6oS r4 = X.C318116oQ.A00(r2)
            r1 = 0
            r0 = 4
        L_0x015a:
            X.Fy6 r3 = new X.Fy6
            r3.<init>((java.lang.Object) r2, (X.AnonymousClass4D7) r1, (int) r0)
        L_0x015f:
            X.AnonymousClass7TE.A1Z(r3, r4)
            goto L_0x000c
        L_0x0164:
            java.lang.Object r3 = r1.A01
            X.E3K r3 = (X.E3K) r3
            X.FBp r1 = X.DbU.A0d()
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            X.0eM r0 = r3.A00
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r5 = "edit_opal"
            r6 = 0
            goto L_0x0218
        L_0x017b:
            java.lang.Object r2 = r1.A01
            X.5Oz r2 = (X.C284945Oz) r2
            r1 = 0
        L_0x0180:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r2.Epw(r0)
            goto L_0x000c
        L_0x0189:
            java.lang.Object r1 = r1.A01
            X.EO2 r1 = (X.EO2) r1
            java.lang.String r5 = X.EO2.A01(r1)
            java.lang.String r6 = r1.A05
            if (r6 != 0) goto L_0x0197
            java.lang.String r6 = ""
        L_0x0197:
            X.0eM r0 = r1.A00
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            r7 = 0
            java.lang.String r3 = "tap"
            r0 = 341(0x155, float:4.78E-43)
            goto L_0x02b2
        L_0x01a4:
            java.lang.Object r8 = r1.A01
            X.E3K r8 = (X.E3K) r8
            X.0eM r7 = r8.A00
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r7)
            r6 = 0
            X.0Tu r2 = X.DbS.A0J(r3, r6)
            r0 = 36321082429088846(0x8109d5000b244e, double:3.032937009191069E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x01ff
            com.instagram.pendingmedia.model.recipients.PendingRecipient r5 = A00(r8)
            r0 = 1
            r5.A0Y = r0
        L_0x01c5:
            X.28D r4 = X.28D.A5J
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r7)
            X.JaN r0 = X.JW1.A00(r0)
            r0.A03(r4)
            android.content.Context r2 = r8.requireContext()
            r0 = 5
            X.FZf r1 = new X.FZf
            r1.<init>(r8, r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r7)
            X.36U r3 = X.AnonymousClass36R.A00(r2, r0, r1)
            X.36W r2 = X.AnonymousClass36W.FOLLOWERS_SHARE
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "targetGroupProfile"
            r1.putParcelable(r0, r5)
            r0 = 31
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.Dbb.A0n(r1, r5, r4, r0, r6)
            X.EXF r0 = X.EXF.A0I
            r3.A04(r1, r0, r2)
            goto L_0x000c
        L_0x01ff:
            r5 = 0
            goto L_0x01c5
        L_0x0201:
            java.lang.Object r3 = r1.A01
            X.EO2 r3 = (X.EO2) r3
            java.lang.String r5 = "opal_self_profile"
            r6 = 0
            r3.A09 = r6
            X.FBp r1 = X.DbU.A0d()
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            X.0eM r0 = r3.A00
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
        L_0x0218:
            r1.A03(r2, r3, r4, r5, r6)
            goto L_0x000c
        L_0x021d:
            java.lang.Object r0 = r1.A01
            X.EO2 r0 = (X.EO2) r0
            X.Ezt r4 = r0.A02
            if (r4 == 0) goto L_0x000c
            X.DlJ r0 = X.EO2.A00(r0)
            X.0Ud r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            X.Dry r0 = (X.C47183Dry) r0
            com.instagram.opal.impl.data.OpalProfileData r0 = r0.A05
        L_0x0233:
            java.lang.String r0 = r0.A06
            if (r0 == 0) goto L_0x023e
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x023f
        L_0x023e:
            r0 = 1
        L_0x023f:
            r2 = r0 ^ 1
            X.ENz r3 = new X.ENz
            r3.<init>()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "argument_show_remove_picture_option"
            r1.putBoolean(r0, r2)
            r3.setArguments(r1)
            X.Eud r0 = new X.Eud
            r0.<init>(r4)
            r3.A00 = r0
            com.instagram.common.session.UserSession r0 = r4.A02
            X.7Pr r2 = X.DbS.A0W(r0)
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            r2.A0a = r0
            android.content.Context r1 = r4.A01
            r0 = 2131100285(0x7f06027d, float:1.7812947E38)
            int r0 = r1.getColor(r0)
            r2.A06 = r0
            r0 = 7
            X.7Pu r0 = X.FmG.A00(r2, r4, r0)
            r0.A03(r1, r3)
            goto L_0x000c
        L_0x027a:
            java.lang.Object r1 = r1.A01
            X.E3K r1 = (X.E3K) r1
            com.instagram.pendingmedia.model.recipients.PendingRecipient r4 = A00(r1)
            r0 = 1
            r4.A0Y = r0
            X.0eM r0 = r1.A00
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r0 = r1.requireActivity()
            X.28D r1 = X.28D.A5J
            X.80E r3 = X.AnonymousClass80E.OPAL
            r5 = 0
            X.C49805F7r.A00(r0, r1, r2, r3, r4, r5)
            goto L_0x000c
        L_0x0299:
            java.lang.Object r1 = r1.A01
            X.EO2 r1 = (X.EO2) r1
            java.lang.String r5 = X.EO2.A01(r1)
            java.lang.String r6 = r1.A05
            if (r6 != 0) goto L_0x02a7
            java.lang.String r6 = ""
        L_0x02a7:
            X.0eM r0 = r1.A00
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            r7 = 0
            java.lang.String r3 = "pull"
            r0 = 1651(0x673, float:2.314E-42)
        L_0x02b2:
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            X.C49049EoT.A00(r1, r2, r3, r4, r5, r6, r7)
            X.DbT.A1J(r1)
            goto L_0x000c
        L_0x02be:
            java.lang.Object r1 = r1.A01
            X.EO2 r1 = (X.EO2) r1
            java.lang.String r0 = "surface_load"
            X.EO2.A06(r1, r0)
            goto L_0x000c
        L_0x02c9:
            java.lang.Object r0 = r1.A01
            X.E3K r0 = (X.E3K) r0
            X.FBp r2 = X.DbU.A0d()
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0eM r0 = r0.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            r2.A02(r1, r0)
            goto L_0x000c
        L_0x02e0:
            java.lang.Object r6 = r1.A01
            X.E3K r6 = (X.E3K) r6
            X.0eM r0 = r6.A00
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r5 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36321082429088846(0x8109d5000b244e, double:3.032937009191069E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r3 = 1
            if (r0 == 0) goto L_0x0338
            com.instagram.pendingmedia.model.recipients.PendingRecipient r2 = A00(r6)
            r2.A0Y = r3
        L_0x030a:
            com.instagram.creation.base.CreationSession r1 = new com.instagram.creation.base.CreationSession
            r1.<init>()
            X.36W r0 = X.AnonymousClass36W.OPAL_CONTENT
            r1.A0A = r0
            r1.A0M = r3
            r1.A0B = r2
            r0 = 3774(0xebe, float:5.289E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putParcelable(r0, r1)
            r0 = 3443(0xd73, float:4.825E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putBoolean(r0, r3)
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            r0 = 808(0x328, float:1.132E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r1 = X.DbS.A0b(r1, r4, r7, r5, r0)
            goto L_0x0389
        L_0x0338:
            r2 = 0
            goto L_0x030a
        L_0x033a:
            java.lang.Object r6 = r1.A01
            X.E3K r6 = (X.E3K) r6
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            r0 = 40
            java.lang.String r0 = X.C273654mx.A00(r0)
            r7 = 1
            r5.putBoolean(r0, r7)
            r0 = 889(0x379, float:1.246E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.putBoolean(r0, r7)
            X.0eM r4 = r6.A00
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r4)
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36321082429023309(0x8109d5000a244d, double:3.0329370091496234E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x038e
            com.instagram.pendingmedia.model.recipients.PendingRecipient r1 = A00(r6)
            r1.A0Y = r7
        L_0x0370:
            r0 = 1876(0x754, float:2.629E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.putParcelable(r0, r1)
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r4)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r2 = com.instagram.modal.TransparentModalActivity.class
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            java.lang.String r0 = "clips_drafts"
            X.6W8 r1 = X.DbV.A0Y(r1, r5, r3, r2, r0)
        L_0x0389:
            android.content.Context r0 = r6.getContext()
            goto L_0x03f4
        L_0x038e:
            r1 = 0
            goto L_0x0370
        L_0x0390:
            java.lang.Object r5 = r1.A01
            X.EO2 r5 = (X.EO2) r5
            r0 = 0
            r5.A09 = r0
            X.0eM r3 = r5.A00
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r3)
            X.0Tu r2 = X.DbS.A0J(r4, r0)
            r0 = 36321082429023309(0x8109d5000a244d, double:3.0329370091496234E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L_0x03b4
            com.instagram.pendingmedia.model.recipients.PendingRecipient r2 = A00(r5)
            r2.A0Y = r1
        L_0x03b4:
            r5.A07()
            X.28D r0 = X.28D.A5J
            X.Hrt r0 = X.C250563lf.A0C(r0)
            r0.A0m = r1
            r0.A0B = r2
            android.os.Bundle r4 = r0.A00()
            java.lang.String r0 = "modal_dismiss_on_cancel"
            r4.putBoolean(r0, r1)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            boolean r0 = X.2cg.A01(r0)
            if (r0 == 0) goto L_0x03dd
            r0 = 407(0x197, float:5.7E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putBoolean(r0, r1)
        L_0x03dd:
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r3)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r2 = com.instagram.modal.TransparentModalActivity.class
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            java.lang.String r0 = "clips_camera"
            X.6W8 r1 = X.AnonymousClass6W8.A02(r1, r4, r3, r2, r0)
            r1.A07()
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
        L_0x03f4:
            r1.A0C(r0)
            goto L_0x000c
        L_0x03f9:
            java.lang.Object r0 = r1.A01
            X.Dry r0 = (X.C47183Dry) r0
            X.62P r3 = r0.A08
            return r3
        L_0x0400:
            java.lang.Object r3 = r1.A01
            return r3
        L_0x0403:
            java.lang.Object r0 = r1.A01
            java.lang.Object r3 = X.DbT.A0r(r0)
            return r3
        L_0x040a:
            java.lang.Object r0 = r1.A01
            X.07f r3 = X.DbY.A0I(r0)
            return r3
        L_0x0411:
            java.lang.Object r2 = r1.A01
            X.E3K r2 = (X.E3K) r2
            X.0eM r0 = r2.A00
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            android.app.Application r0 = X.DbY.A05(r2)
            X.EF0 r3 = new X.EF0
            r3.<init>(r0, r1)
            return r3
        L_0x0425:
            java.lang.Object r0 = r1.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Av r3 = X.1Au.A00(r0)
            X.0s0 r2 = r3.A4L
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 455(0x1c7, float:6.38E-43)
            r0 = r1[r0]
            java.lang.Object r2 = r2.CDM(r3, r0)
            X.5Or r1 = X.C289465dd.A00()
            X.0eM r0 = X.C284905Ot.A01
            androidx.compose.runtime.ParcelableSnapshotMutableState r3 = new androidx.compose.runtime.ParcelableSnapshotMutableState
            r3.<init>(r1, r2)
            return r3
        L_0x0445:
            java.lang.Object r2 = r1.A01
            X.E3K r2 = (X.E3K) r2
            X.0eM r0 = r2.A00
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            android.app.Application r0 = X.DbY.A05(r2)
            X.EF1 r3 = new X.EF1
            r3.<init>(r0, r1)
            return r3
        L_0x0459:
            java.lang.Object r3 = r1.A01
            X.EO2 r3 = (X.EO2) r3
            java.lang.String r2 = r3.A0G
            X.0eM r0 = r3.A00
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            android.app.Application r0 = X.DbY.A05(r3)
            X.EFD r3 = new X.EFD
            r3.<init>(r0, r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51794G2d.invoke():java.lang.Object");
    }
}
