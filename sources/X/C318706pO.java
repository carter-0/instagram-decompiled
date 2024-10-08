package X;

import com.instagram.user.model.User;

/* renamed from: X.6pO  reason: invalid class name and case insensitive filesystem */
public final class C318706pO implements C318716pP {
    public final /* synthetic */ AnonymousClass70J A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ boolean A02;

    public C318706pO(AnonymousClass70J r1, User user, boolean z) {
        this.A00 = r1;
        this.A01 = user;
        this.A02 = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DCX(X.C255253tp r21) {
        /*
            r20 = this;
            r6 = 0
            r1 = r20
            X.70J r0 = r1.A00
            if (r0 == 0) goto L_0x00d2
            X.FgX r2 = r0.A02()
            if (r2 == 0) goto L_0x00d2
            com.instagram.user.model.User r5 = r1.A01
            boolean r8 = r1.A02
            r4 = 1
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r11 = r2.A02
            com.instagram.user.model.User r1 = r0.A01(r11)
            r7 = r21
            X.3tn r3 = r7.CCb()
            X.3tn r0 = r7.CCb()
            if (r0 == 0) goto L_0x011a
            java.lang.String r1 = r1.getId()
            if (r3 == 0) goto L_0x0117
            java.lang.String r0 = r3.getId()
        L_0x0030:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x011a
            if (r8 != 0) goto L_0x007f
            com.instagram.profile.fragment.UserDetailFragment r10 = r2.A04
            X.Ey3 r9 = new X.Ey3
            r9.<init>(r7, r2, r5)
            android.content.Context r1 = r10.getContext()
            if (r1 == 0) goto L_0x007f
            android.content.Context r0 = r10.requireContext()
            android.content.res.Resources r8 = r0.getResources()
            X.0qQ.A07(r8)
            X.8ab r3 = new X.8ab
            r3.<init>((android.content.Context) r1)
            r3.A0l(r10, r11)
            r0 = 2131976694(0x7f1361f6, float:1.9590516E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131972074(0x7f134fea, float:1.9581145E38)
            java.lang.String r0 = r8.getString(r0)
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[]{r1, r0}
            X.FI4 r0 = new X.FI4
            r0.<init>(r8, r9)
            r3.A0e(r0, r1)
            r3.A0r(r4)
            r3.A0s(r4)
            android.app.Dialog r0 = r3.A02()
            X.AnonymousClass0fN.A00(r0)
        L_0x007f:
            com.instagram.profile.fragment.UserDetailFragment r10 = r2.A04
            X.0jB r0 = r10.E4k()
            X.0xF r0 = r0.A00()
            java.lang.Integer r3 = X.C3253371z.A00(r7)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r3 != r1) goto L_0x00d3
            X.3tn r1 = r7.CCb()
            if (r1 == 0) goto L_0x00d2
            java.lang.String r7 = r1.getId()
            java.lang.String r3 = r1.getUsername()
            java.lang.String r9 = r5.getId()
            X.0BQ r2 = X.AnonymousClass0BO.A00(r11)
            java.lang.String r1 = r1.getId()
            boolean r1 = r2.CO7(r1)
            X.0qQ.A0B(r7, r6)
            X.0qQ.A0B(r3, r4)
            java.lang.String r5 = "user"
            java.lang.String r6 = "USER"
            r4 = r10
            r8 = r3
            X.0xI r3 = X.VFQ.A00(r4, r5, r6, r7, r8, r9)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.String r1 = "is_mas"
            r3.A09(r1, r2)
            r3.A04(r0)
            X.0xN r0 = X.C60510iO.A00(r11)
            r0.EFq(r3)
        L_0x00d2:
            return
        L_0x00d3:
            com.instagram.model.hashtag.Hashtag r1 = r7.BCW()
            if (r1 == 0) goto L_0x00d2
            java.lang.String r17 = r1.getId()
            java.lang.String r18 = r1.getName()
            java.lang.String r14 = r5.getId()
            if (r17 == 0) goto L_0x0101
            if (r18 == 0) goto L_0x0101
            java.lang.String r4 = "hashtag"
            java.lang.String r5 = "HASHTAG"
            r3 = r10
            r6 = r17
            r7 = r18
            r8 = r14
            X.0xI r1 = X.VFQ.A00(r3, r4, r5, r6, r7, r8)
            r1.A04(r0)
            X.0xN r0 = X.C60510iO.A00(r11)
            r0.EFq(r1)
        L_0x0101:
            X.Dc6 r0 = r2.A07
            com.instagram.user.model.User r0 = r0.A03
            X.6rY r12 = X.C319976rX.A00(r11, r0)
            java.lang.String r15 = r2.A08
            java.lang.String r0 = r2.A09
            java.lang.String r13 = "tap_profile_bio_hashtag_link"
            java.lang.String r19 = "user_profile_header"
            r16 = r0
            X.C319976rX.A0A(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x0117:
            r0 = 0
            goto L_0x0030
        L_0x011a:
            java.lang.Integer r1 = X.C3253371z.A00(r7)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x014b
            com.instagram.model.hashtag.Hashtag r0 = r7.BCW()
            if (r0 == 0) goto L_0x007f
            com.instagram.model.hashtag.HashtagImpl r8 = r0.FEY()
            com.instagram.profile.fragment.UserDetailFragment r0 = r2.A04
            java.lang.String r3 = r0.getModuleName()
            java.lang.String r0 = "DEFAULT"
            androidx.fragment.app.Fragment r1 = X.W0l.A01(r11)
            android.os.Bundle r0 = X.W0l.A00(r8, r3, r0)
            r1.setArguments(r0)
            X.6xB r3 = r2.A05
            java.lang.String r0 = "hashtag_feed"
            r3.A03(r1, r0, r4)
        L_0x0146:
            r3.A00()
            goto L_0x007f
        L_0x014b:
            java.lang.Integer r1 = X.C3253371z.A00(r7)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x007f
            X.3tn r1 = r7.CCb()
            if (r1 == 0) goto L_0x007f
            X.1a0 r0 = X.C46447Df9.A03()
            X.1a1 r8 = r0.A01
            java.lang.String r3 = r1.getId()
            X.4DU r0 = r2.A03
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "profile_bio_user_tag"
            X.Dfc r0 = X.C46548Dgp.A01(r11, r3, r0, r1)
            com.instagram.profile.intf.UserDetailLaunchConfig r0 = r0.A04()
            androidx.fragment.app.Fragment r1 = r8.A02(r11, r0)
            X.6xB r3 = r2.A05
            java.lang.String r0 = "profile"
            r3.A03(r1, r0, r4)
            java.lang.String r0 = "profile_bio_tagged_user"
            r3.A05(r0)
            goto L_0x0146
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C318706pO.DCX(X.3tp):void");
    }
}
